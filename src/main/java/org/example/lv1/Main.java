package org.example.lv1;
// Lv 1. 기본적인 키오스크 프로그래밍 해보기

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean progress = true;

        // 햄버거 메뉴 출력 및 선택하기
        while (progress) {
            System.out.println();
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료      | 종료");

            System.out.println();
            System.out.print("메뉴를 선택하세요: ");

            try {
                int num = scanner.nextInt();    // ctrl + b

                switch (num) {
                    case 0:
                        System.out.println("프로그램을 종료합니다.");
                        progress = false;
                        break;

                    case 1:
                        System.out.println("ShackBurger를 주문하였습니다.");
                        break;

                    case 2:
                        System.out.println("SmokeShack를 주문하였습니다.");
                        break;

                    case 3:
                        System.out.println("Cheeseburger를 주문하였습니다.");
                        break;

                    case 4:
                        System.out.println("Hamburger를 주문하였습니다.");
                        break;

                    default:
                        System.out.println("해당 번호는 존재하지 않습니다. 다시 선택해주세요.");
                        System.out.println();
                }
            } catch (InputMismatchException e) {
                System.out.println("0~4까지의 숫자만 입력해주세요.");
                System.out.println(scanner.nextLine());     // 트러블 슈팅: 라인 정리
            }
        }
        scanner.close();
    }
}
