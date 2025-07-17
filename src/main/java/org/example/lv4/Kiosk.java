package org.example.lv4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 속성(필드)
    private final List<Menu> menus;

    // 생성자
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    // 기능
    public void start() {
        // 스캐너 선언
        Scanner scanner = new Scanner(System.in);
        boolean progress = true;

        // 반복문 시작
        while (progress) {
            System.out.println();
            System.out.println("[ MAIN MENU ]");

            // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력

            for(int i = 1; i <= 3; i++) {
                System.out.println(i + ". " + menus.get(i-1).getCategory());
            }
            System.out.println("0. 종료      | 종료");
            System.out.println();

            // 숫자 입력 받기
            System.out.print("주문하실 메뉴의 번호를 입력하세요: ");

            try {
                int numMenu = scanner.nextInt();

                // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
                if(numMenu >= 0 && numMenu <= 3) {
                    switch (numMenu) {
                        case 0:
                            System.out.println("프로그램을 종료합니다.");
                            progress = false;
                            break;

                        case 1:
                            System.out.println();
                            System.out.println("[ BURGERS MENU ]");
                            Menu menuBurger = menus.get(0);
                            List<MenuItem> burgerList = menuBurger.getMenuItems();
                            String message1 = "%d. %-15s | W %4.1f | %s";
                            for(int i = 1; i <= 4; i++) {
                                String messageBurger = String.format(message1, i, burgerList.get(i-1).getName(), burgerList.get(i-1).getPrice(), burgerList.get(i-1).getExplanation());
                                System.out.println(messageBurger);
                            }

                            System.out.println("0. 종료      | 종료");
                            System.out.println();

                            System.out.print("주문하실 메뉴의 번호를 입력하세요: ");
                            int numBurger = scanner.nextInt();

                            String message2 = "%-12s | W %4.1f | %s";
                            switch(numBurger) {
                                case 0:
                                    break;

                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                    System.out.println("선택한 메뉴: " + String.format(message2, burgerList.get(numBurger-1).getName(), burgerList.get(numBurger-1).getPrice(), burgerList.get(numBurger-1).getExplanation()));
                            }

                        case 2:
                        case 3:


                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("0~3까지의 숫자만 입력해주세요.");
                scanner.nextLine();
            }

//            String message1 = "%d. %-15s | W %4.1f | %s";
//
//            for (int i = 1; i <= 4; i++) {
//                String messageResult = String.format(message1, i, menuItems.get(i - 1).getName(), menuItems.get(i - 1).getPrice(), menuItems.get(i - 1).getExplanation());
//                System.out.println(messageResult);
//            }
//            System.out.println("0. 종료      | 종료");
//            System.out.println();
//
//            // 숫자를 입력 받기
//            System.out.print("주문하실 메뉴의 번호를 입력하세요: ");
//            try {
//                int num = scanner.nextInt();
//
//                switch (num) {
//                    case 0:
//                        System.out.println("프로그램을 종료합니다.");
//                        progress = false;
//                        break;
//
//                    // 메모리 낭비 vs 가독성 -> 가독성
//                    case 1:
//                    case 2:
//                    case 3:
//                    case 4:
//                        System.out.println(menuItems.get(num-1).getName() + "를 주문하였습니다.");
//                        break;
//
//                    default:
//                        System.out.println("해당 번호는 존재하지 않습니다. 다시 선택해주세요.");
//                        System.out.println();
//                }
//
//                // 트러블 슈팅: 바로 다시 반복으로 가는 게 아니라 if문을 실행하려고 해서 오류가 난다.
//                // 해결: != 0이 아니라 범위를 지정한다.
//                if (num >= 1 && num < 5) {
//                    System.out.println();
//                    System.out.println("선택한 메뉴 : " + menuItems.get(num - 1).getName() + ", " + menuItems.get(num - 1).getPrice() + ", " + menuItems.get(num - 1).getExplanation());
//                }
//
//            } catch (InputMismatchException e) {
//                System.out.println("0~4까지의 숫자만 입력해주세요.");
//                scanner.nextLine();
//            }
        }
    }
}
