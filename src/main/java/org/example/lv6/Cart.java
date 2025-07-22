package org.example.lv6;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    // 속성(필드)
    private final String name;
    private final int quantity;
    private final double price;
    List<MenuItem> menuList = new ArrayList<>();

    // 생성자
    public Cart(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


    // 기능(메서드)
    // 메뉴 추가 기능
    public void addItem(MenuItem menuItem) {
        menuList.add(menuItem);
    }





}
