package org.example.lv2;

public class MenuItem {
    // 속성(필드)
    private String name;
    private int price;      // BigDecimal 모르니까 int로...
    private String explanation;

    // 생성자
    public MenuItem(String name, int price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

    // 기능
}
