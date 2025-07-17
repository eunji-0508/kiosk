package org.example.lv4;

import java.util.List;

public class Menu {
    // 속성(필드)
    private final List<MenuItem> menuItems;


    // 생성자
    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // 기능
    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    // List를 리턴하는 함수
    // for..? return..? 둘 다 동시에 만족시켜야 하나?
    public List<MenuItem> printMenuItems() {
        return menuItems;
    }
}
