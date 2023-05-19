package com.shop.spring.shop.repository;

import com.shop.spring.shop.dto.ItemSearchDto;
import com.shop.spring.shop.dto.MainItemDto;
import com.shop.spring.shop.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

}