package com.shop.spring.shop.controller;

import com.shop.spring.shop.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeleafExController {

    @GetMapping(value = "/ex01")
    public String thymeleafExample01(Model model) {
        model.addAttribute("data", "타임리프 예제");
        return "thymeleafEx/thymeleafEx01";
    }

    @GetMapping(value = "/ex02")
    public String thymeleafExample02(Model model) {
        ItemDto itemDto = ItemDto.builder()
                .itemDetail("상세 상품 설명")
                .itemNm("테스트 상품 1")
                .price(10000)
                .regTime(LocalDateTime.now())
                .build();

        model.addAttribute("itemDto", itemDto);
        return "thymeleafEx/thymeleafEx02";
    }

    @GetMapping(value = "/ex07")
    public String thymeleafExample07() {
        return "thymeleafEx/thymeleafEx07";
    }

}
