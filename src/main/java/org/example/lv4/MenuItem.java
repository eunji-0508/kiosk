package org.example.lv4;

public class MenuItem {
    // 속성(필드)
    private String name;            // 이름
    private double price;           // 가격 : BigDecimal 모르니까 double로...
    private String explanation;     // 설명

    // 생성자
    public MenuItem(String name, double price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

    // 기능
    // 게터(Getter)
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getExplanation() {
        return this.explanation;
    }
}
