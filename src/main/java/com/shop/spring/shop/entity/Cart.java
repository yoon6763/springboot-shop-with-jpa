package com.shop.spring.shop.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "cart")
@Getter
@ToString
@Entity
@NoArgsConstructor
public class Cart {

    @Id
    @Column(name = "card_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Builder
    public Cart(Member member) {
        this.member = member;
    }
}
