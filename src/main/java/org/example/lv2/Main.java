package org.example.lv2;
// Lv 2. 객체 지향 설계를 적용해 햄버거 메뉴를 클래스로 관리하기

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Scanner 선언
        Scanner scanner = new Scanner(System.in);

        // MenuItem 객체 생성을 통해 이름, 가격, 설명을 세팅
        MenuItem shackBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem smokeShack = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseBurger = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamburger = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        // List 선언 및 초기화
        final List<MenuItem> menuItems = new ArrayList<>();

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItems.add(shackBurger);
        menuItems.add(smokeShack);
        menuItems.add(cheeseBurger);
        menuItems.add(hamburger);

        // System.out.println();
        System.out.println("[ SHAKESHACK MENU ]");

        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        // 숫자 주려면 향상된 for문 안됨. 숫자를 속성으로 받으면 가능할듯.
//            System.out.print(i + ". " + menuItems.get(i - 1).getName());
//            System.out.print("   | W " + menuItems.get(i - 1).getPrice());
//            System.out.println(" | " + menuItems.get(i - 1).getExplanation());
        // (질문) 출력하니까 | 라인이 글자수가 다르네? 어떻게 해결하지?
        // (튜터님 해설) String format() 사용하면 해결됨
        // String messageResult = String.format(message, product.get(i).getName(), product.get(i).getPrice(),
        // String message = " 제품명 : %s | 가격 : %d | 재료 : %s";

        String message1 = "%d. %-15s | W %4.1f | %s";

        for (int i = 1; i <= 4; i++) {
            String messageResult = String.format(message1, i, menuItems.get(i - 1).getName(), menuItems.get(i - 1).getPrice(), menuItems.get(i - 1).getExplanation());
            System.out.println(messageResult);
        }

        System.out.println("0. 종료      | 종료");
        System.out.println();

        // 숫자를 입력 받기
        System.out.print("주문하실 메뉴의 번호를 입력하세요: ");
        try {
            int num = scanner.nextInt();    // ctrl + b

            switch (num) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;

                case 1:
                    System.out.println(menuItems.get(0).getName() + "를 주문하였습니다.");
                    break;

                case 2:
                    System.out.println(menuItems.get(1).getName() + "를 주문하였습니다.");
                    break;

                case 3:
                    System.out.println(menuItems.get(2).getName() + "를 주문하였습니다.");
                    break;

                case 4:
                    System.out.println(menuItems.get(3).getName() + "를 주문하였습니다.");
                    break;

                default:
                    System.out.println("해당 번호는 존재하지 않습니다.");
                    System.out.println();
            }

            if (num != 0) {
                System.out.println();
                System.out.println("선택한 메뉴 : " + menuItems.get(num - 1).getName() + ", " + menuItems.get(num - 1).getPrice() + ", " + menuItems.get(num - 1).getExplanation());
            }

        } catch (InputMismatchException e) {
            System.out.println("0~4까지의 숫자만 입력해주세요.");
        }
    }
}
