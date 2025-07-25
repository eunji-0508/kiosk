package org.example.lv5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 속성(필드)
    private final String category;
    private final List<MenuItem> menuItems;

    // 생성자
    public Menu(String category) {
        this.category = category;
        this.menuItems = new ArrayList<>();
    }

    // 기능
    // List에 들어있는 MenuItem을 순차적으로 보여주는 메서드
    public void printMenuItems() {
        String message1 = "%d. %-15s | W %4.1f | %s";
        for (int i = 1; i <= menuItems.size(); i++) {
            String messageType = String.format(message1, i, menuItems.get(i - 1).getName(), menuItems.get(i - 1).getPrice(), menuItems.get(i - 1).getExplanation());
            System.out.println(messageType);
        }
    }

    // MenuItem 객체 생성하면서 삽입하는 메서드
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    // 게터(Getter)
    // List를 반환하는 메서드
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // 메뉴 카테고리 이름을 반환하는 메서드
    public String getCategory() {
        return this.category;
    }
}