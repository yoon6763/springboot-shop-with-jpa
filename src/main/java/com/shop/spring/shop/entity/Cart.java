package com.shop.spring.shop.entity;

import lombok.*;

import javax.persistence.*;

@Table(name = "cart")
@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
public class Cart {

    @Id
    @Column(name = "card_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Builder
    public Cart(Member member) {
        this.member = member;
    }

    public static Cart createCart(Member member) {
        Cart cart = new Cart();
        cart.setMember(member);
        return cart;
    }
}
