package org.example.lv5;
// Lv 5. 캡슐화 적용하기

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Menu 객체 생성을 통해 이름 설정
        Menu burgers = new Menu("Burgers");
        Menu drinks = new Menu("Drinks");
        Menu desserts = new Menu("Desserts");

        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        // 햄버거 메뉴
        burgers.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 음료 메뉴
        drinks.addMenuItem(new MenuItem("Americano", 4.5, "남녀노소 인기 만점인 아메리카노"));
        drinks.addMenuItem(new MenuItem("Cola", 2.5, "톡 쏘는 시원함이 좋은 콜라"));
        drinks.addMenuItem(new MenuItem("Iced tea", 3.0, "복숭아 향기와 맛이 일품인 아이스티"));
        drinks.addMenuItem(new MenuItem("Milkshake", 3.5, "햄버거랑 같이 먹으면 맛이 두 배인 맛있는 밀크쉐이크"));

        // 디저트 메뉴
        desserts.addMenuItem(new MenuItem("Ice cream", 1.5, "간단하게 즐길 수 있는 바닐라 아이스크림"));
        desserts.addMenuItem(new MenuItem("French fries", 2.0, "햄버거에 곁들이기 좋은 감자튀김"));
        desserts.addMenuItem(new MenuItem("Cheese Sticks", 2.0, "쭉 늘어나는 치즈가 예술인 치즈스틱"));
        desserts.addMenuItem(new MenuItem("Coleslaw", 2.5, "건강하고 신선한 디저트 코울슬로"));

        // 메뉴 리스트
        final List<Menu> menus = new ArrayList<>();
        menus.add(burgers);
        menus.add(drinks);
        menus.add(desserts);

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menus);

        // Kiosk 내 시작하는 함수 호출
        kiosk.start();
    }
}