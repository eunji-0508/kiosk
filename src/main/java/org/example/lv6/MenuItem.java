package org.example.lv6;

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
    // 이름을 반환하는 메서드
    public String getName() {
        return this.name;
    }

    // 가격을 반환하는 메서드
    public double getPrice() {
        return this.price;
    }

    // 설명을 반환하는 메서드
    public String getExplanation() {
        return this.explanation;
    }
}
