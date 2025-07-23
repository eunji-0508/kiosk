package org.example.lv6;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    // 속성(필드)
    List<CartItem> cartItems;

    // 생성자
    public Cart(List<CartItem> cartItems) {
        this.cartItems = new ArrayList<>();
    }


    // 기능(메서드)
    // 메뉴 추가 기능
    public void addItem(CartItem cartItem) {
        cartItems.add(cartItem);
    }

    // 장바구니 출력 기능
    public void printCart() {
        String message = "%d. %-15s | W %4.1f | %s";
        for (int i = 0; i < cartItems.size(); i++) {
            System.out.println(String.format(message, i, cartItems.get(i - 1).getName(), cartItems.get(i - 1).getPrice(), cartItems.get(i - 1).getExplanation()));
        }
    }

    // 장바구니 총 금액 계산 기능
    public void totalPrice() {
        double sum = 0;
        for(CartItem cartItem : cartItems) {
            sum += cartItem.getPrice();
        }
        System.out.println("[ Total ]");
        System.out.println("W " + sum);
    }



}
