package org.example.lv6;

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
                        getMenuDetails(scanner, numMenu);
                        break;

                    // 음료 메뉴
                    case 2:
                        getMenuDetails(scanner, numMenu);
                        break;

                    // 디저트 메뉴
                    case 3:
                        getMenuDetails(scanner, numMenu);
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

    public void getMenuDetails(Scanner scanner, int numMenu) {
        boolean progressItems = true;
        String message = "%-12s | W %4.1f | %s";

        while (progressItems) {
            try {
                System.out.println();

                if (numMenu > 0 && numMenu <= menus.size()) {
                    Menu menuType = menus.get(numMenu - 1);
                    List<MenuItem> menuDetailedList = menuType.getMenuItems();

                    String menuTitle = menuType.getCategory();
                    System.out.println("[ " + menuTitle.toUpperCase() + " MENU ]");

                    menuType.printMenuItems();
                    System.out.println("0. 뒤로가기");

                    // 숫자 입력 받기
                    System.out.println();
                    System.out.print("주문하실 메뉴의 번호를 입력하세요: ");
                    int selectDetailedMenu = scanner.nextInt();

                    switch (selectDetailedMenu) {
                        case 0:
                            progressItems = false;
                            break;

                        default:
                            if((selectDetailedMenu > 0 && selectDetailedMenu <= menuDetailedList.size())) {
                                System.out.println("선택한 메뉴: " + String.format(message, menuDetailedList.get(selectDetailedMenu - 1).getName(), menuDetailedList.get(selectDetailedMenu - 1).getPrice(), menuDetailedList.get(selectDetailedMenu - 1).getExplanation()));
                                progressItems = false;
                                break;
                            }
                            else {
                                System.out.println("메뉴에 적힌 숫자만 입력하세요. 0~" + menuDetailedList.size() + "까지의 숫자만 입력해주세요.");
                            }
                    }
                } else {
                    System.out.println("0~" + menus.size() + "까지의 숫자만 입력해주세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자 이외에는 입력할 수 없습니다. 적혀진 숫자만 입력해주세요.");
                scanner.nextLine(); // 잘못 입력된 토큰 제거
            }
        }
    }

}
