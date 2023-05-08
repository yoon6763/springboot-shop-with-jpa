package com.shop.spring.shop.repository;

import com.shop.spring.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

// 제네릭 타입, 기본키 타입
public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByItemNm(String itemNm);

    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);

    List<Item> findByPriceLessThan(Integer price);

    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);

    // 변수명을 적어줄 땐 :를 사용
    @Query("select i from Item i where i.itemDetail like  %:itemDetail% order by i.price desc ")
    List<Item> findByItemDetail(@Param("itemDetail") String itemDetail);
}
