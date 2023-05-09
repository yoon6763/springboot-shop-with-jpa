package com.shop.spring.shop.entity;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "cart")
@Getter
@ToString
@Entity
public class Cart {

    @Id
    @Column(name = "card_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;


}
