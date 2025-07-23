package org.example.lv6;

public class CartItem {
    // 속성(필드)
    private final String name;
    private final double price;
    private final int quantity;
    private final String explanation;

    // 생성자
    public CartItem(String name, double price, int quantity, String explanation) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.explanation = explanation;
    }

    // 기능
    // 게터(Getter)
    // 이름을 반환하는 메서드
    public String getName() {
        return this.name;
    }

    // 수량을 반환하는 메서드
    public int getQuantity() {
        return this.quantity;
    }

    // 가격을 반환하는 메서드
    public double getPrice() {
        return this.price;
    }

    public String getExplanation() {
        return this.explanation;
    }

}



