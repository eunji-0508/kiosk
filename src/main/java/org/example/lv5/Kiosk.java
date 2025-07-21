package org.example.lv5;

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
            for (int i = 1; i <= menus.size(); i++) {
                System.out.println(i + ". " + menus.get(i - 1).getCategory());
            }
            System.out.println("0. 종료      | 종료");
            System.out.println();

            // 숫자 입력 받기
            System.out.print("주문하실 메뉴의 번호를 입력하세요: ");

            try {
                int numMenu = scanner.nextInt();

                // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
                switch (numMenu) {
                    case 0:
                        System.out.println("프로그램을 종료합니다.");
                        progress = false;
                        break;

                    // 햄버거 메뉴
                    case 1:
                        getMenuTitle(1);
                        Menu burgerMenus = menus.get(0);

                        burgerMenus.printMenuItems();

                        System.out.println("0. 뒤로가기");

                        getMenuDetails(scanner, burgerMenus.getMenuItems());
                        break;


                    // 음료 메뉴
                    case 2:
                        getMenuTitle(2);
                        Menu drinkMenus = menus.get(1);

                        drinkMenus.printMenuItems();

                        System.out.println("0. 뒤로가기");

                        getMenuDetails(scanner, drinkMenus.getMenuItems());
                        break;


                    // 디저트 메뉴
                    case 3:
                        getMenuTitle(3);
                        Menu dessertMenus = menus.get(2);

                        dessertMenus.printMenuItems();

                        System.out.println("0. 뒤로가기");
                        getMenuDetails(scanner, dessertMenus.getMenuItems());
                        break;

                    default:
                        System.out.println("해당 번호는 존재하지 않습니다. 0~3까지의 숫자만 입력해주세요.");
                }
            } catch (InputMismatchException e) {         // 숫자 이외의 입력이 들어올 경우
                System.out.println("숫자 이외에는 입력할 수 없습니다. 0~3까지의 숫자만 입력해주세요.");
                scanner.nextLine();
            }
        }

    }

    public void getMenuTitle(int numMenu) {
        System.out.println();
        if (numMenu > 0 && numMenu <= menus.size()) {
            String MenuTitle = menus.get(numMenu - 1).getCategory();
            System.out.println("[ " + MenuTitle.toUpperCase() + " MENU ]");
        } else {
            System.out.println("0~" +  menus.size() + "까지의 숫자만 입력해주세요.");
        }
    }

    public void getMenuDetails(Scanner scanner, List<MenuItem> menuItems) {
        System.out.println();
        boolean progressItems = true;
        String message = "%-12s | W %4.1f | %s";

        while (progressItems) {
            try {
                System.out.println();
                // 숫자 입력 받기
                System.out.print("주문하실 메뉴의 번호를 입력하세요: ");
                int selectMenu = scanner.nextInt();

                switch (selectMenu) {
                    case 0:
                        progressItems = false;
                        break;

                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        System.out.println("선택한 메뉴: " + String.format(message, menuItems.get(selectMenu - 1).getName(), menuItems.get(selectMenu - 1).getPrice(), menuItems.get(selectMenu - 1).getExplanation()));
                        progressItems = false;
                        break;

                    default:
                        System.out.println("0~" + menuItems.size() + "까지의 숫자만 입력해주세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자 이외에는 입력할 수 없습니다. 0~" + menuItems.size() + "까지의 숫자만 입력해주세요.");
                scanner.nextLine(); // 잘못 입력된 토큰 제거
            }
        }
    }
}
