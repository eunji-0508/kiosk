package org.example.lv6;

public class Kiosk {
    // 속성(필드)
    private final KioskService kioskService;

    // 생성자
    public Kiosk(KioskService kioskService) {
        this.kioskService = kioskService;
    }

    // 기능
    public void start() {
        System.out.println("프로그램을 시작합니다.");
        kioskService.run();
    }
}
