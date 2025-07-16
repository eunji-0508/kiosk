package org.example.lv3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 속성(필드)
    // 트러블 슈팅: final이라 값 못 바꾸는데 초기화까지 하려고 함
    private final List<MenuItem> menuItems;

    // 생성자
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // 기능
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean progress = true;

        // 햄버거 메뉴 출력 및 선택하기
        while (progress) {
            System.out.println();
            System.out.println("[ SHAKESHACK MENU ]");
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
                int num = scanner.nextInt();

                switch (num) {
                    case 0:
                        System.out.println("프로그램을 종료합니다.");
                        progress = false;
                        break;

                    // 메모리 낭비 vs 가독성 -> 가독성
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        System.out.println(menuItems.get(num-1).getName() + "를 주문하였습니다.");
                        break;

                    default:
                        System.out.println("해당 번호는 존재하지 않습니다. 다시 선택해주세요.");
                        System.out.println();
                }

                // 트러블 슈팅: 바로 다시 반복으로 가는 게 아니라 if문을 실행하려고 해서 오류가 난다.
                // 해결: != 0이 아니라 범위를 지정한다.
                if (num >= 1 && num < 5) {
                    System.out.println();
                    System.out.println("선택한 메뉴 : " + menuItems.get(num - 1).getName() + ", " + menuItems.get(num - 1).getPrice() + ", " + menuItems.get(num - 1).getExplanation());
                }

            } catch (InputMismatchException e) {
                System.out.println("0~4까지의 숫자만 입력해주세요.");
                scanner.nextLine();
            }
        }
    }
}
