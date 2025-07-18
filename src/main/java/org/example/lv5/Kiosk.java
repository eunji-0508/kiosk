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

                        // 햄버거 메뉴
                        case 1:
                            System.out.println();
                            System.out.println("[ BURGERS MENU ]");
                            Menu burgerMenus = menus.get(0);
                            burgerMenus.printMenuItems();

                            // Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력
                            List<MenuItem> burgerItems = burgerMenus.getMenuItems();

                            System.out.println("0. 뒤로가기");
                            System.out.println();

                            boolean progressBurgers = true;

                            while(progressBurgers) {
                                try {
                                    System.out.println();
                                    // 숫자 입력 받기
                                    System.out.print("주문하실 메뉴의 번호를 입력하세요: ");
                                    int numBurger = scanner.nextInt();

                                    String message1 = "%-12s | W %4.1f | %s";

                                    // 입력 받은 숫자가 올바르다면 인덱스를 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기
                                    if (numBurger >= 0 && numBurger <= 4) {
                                        switch (numBurger) {
                                            case 0:
                                                progressBurgers = false;
                                                break;

                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                                System.out.println("선택한 메뉴: " + String.format(message1, burgerItems.get(numBurger - 1).getName(), burgerItems.get(numBurger - 1).getPrice(), burgerItems.get(numBurger - 1).getExplanation()));
                                                progressBurgers = false;
                                                break;
                                        }
                                    } else {
                                        System.out.println("0~4까지의 숫자만 입력해주세요. 처음화면으로 돌아갑니다.");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("숫자 이외에는 입력할 수 없습니다. 0~4까지의 숫자만 입력해주세요.");
                                    scanner.nextLine(); // 잘못 입력된 토큰 제거
                                }
                            }
                            break;



                            // 음료 메뉴
                        case 2:
                            System.out.println();
                            System.out.println("[ DRINKS MENU ]");
                            Menu drinkMenus = menus.get(1);
                            drinkMenus.printMenuItems();

                            List<MenuItem> drinkItems = drinkMenus.getMenuItems();

                            System.out.println("0. 뒤로가기");
                            System.out.println();

                            boolean progressDrinks = true;

                            while (progressDrinks) {
                                try {
                                    System.out.println();
                                    System.out.print("주문하실 메뉴의 번호를 입력하세요: ");
                                    int numDrink = scanner.nextInt();

                                    String message2 = "%-12s | W %4.1f | %s";
                                    if (numDrink >= 0 && numDrink <= 4) {
                                        switch (numDrink) {
                                            case 0:
                                                progressDrinks = false;
                                                break;

                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                                System.out.println("선택한 메뉴: " + String.format(message2, drinkItems.get(numDrink - 1).getName(), drinkItems.get(numDrink - 1).getPrice(), drinkItems.get(numDrink - 1).getExplanation()));
                                                progressDrinks = false;
                                                break;
                                        }
                                    } else {
                                        System.out.println("0~4까지의 숫자만 입력해주세요.");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("숫자 이외에는 입력할 수 없습니다. 0~4까지의 숫자만 입력해주세요.");
                                    scanner.nextLine();
                                }
                            }
                            break;


                        // 디저트 메뉴
                        case 3:
                            System.out.println();
                            System.out.println("[ DESSERTS MENU ]");
                            Menu dessertMenus = menus.get(2);
                            dessertMenus.printMenuItems();

                            List<MenuItem> dessertItems = dessertMenus.getMenuItems();

                            System.out.println("0. 뒤로가기");
                            System.out.println();

                            boolean progressDesserts = true;

                            while (progressDesserts) {
                                try {
                                    System.out.println();
                                    System.out.print("주문하실 메뉴의 번호를 입력하세요: ");
                                    int numDessert = scanner.nextInt();

                                    String message3 = "%-12s | W %4.1f | %s";
                                    if (numDessert >= 0 && numDessert <= 4) {
                                        switch (numDessert) {
                                            case 0:
                                                progressDesserts = false;
                                                break;

                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                                System.out.println("선택한 메뉴: " + String.format(message3, dessertItems.get(numDessert - 1).getName(), dessertItems.get(numDessert - 1).getPrice(), dessertItems.get(numDessert - 1).getExplanation()));
                                                progressDesserts = false;
                                                break;
                                        }
                                    } else {
                                        System.out.println("0~4까지의 숫자만 입력해주세요.");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("숫자 이외에는 입력할 수 없습니다. 0~4까지의 숫자만 입력해주세요.");
                                    scanner.nextLine();
                                }
                            }
                                break;

                    }
                } else {                                // 0~3 이외의 숫자 입력 들어올 경우
                    System.out.println("0~3까지의 숫자만 입력해주세요.");
                }

            } catch (InputMismatchException e) {         // 숫자 이외의 입력이 들어올 경우
                System.out.println("숫자 이외에는 입력할 수 없습니다. 0~3까지의 숫자만 입력해주세요.");
                scanner.nextLine();
            }
        }
    }
}
