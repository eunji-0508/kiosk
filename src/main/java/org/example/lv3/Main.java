package org.example.lv3;
// Lv 3. 객체 지향 설계를 적용해 순서 제어를 클래스로 관리하기

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MenuItem shackBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem smokeShack = new MenuItem("smokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseBurger = new MenuItem("cheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamburger = new MenuItem("hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        final List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(shackBurger);
        menuItems.add(smokeShack);
        menuItems.add(cheeseBurger);
        menuItems.add(hamburger);

        Kiosk kiosk = new Kiosk(menuItems);

        kiosk.start();
    }

}
