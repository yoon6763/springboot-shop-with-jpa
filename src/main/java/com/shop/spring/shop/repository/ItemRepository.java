package com.shop.spring.shop.repository;

import com.shop.spring.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// 제네릭 타입, 기본키 타입
public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByItemNm(String itemNm);
}
