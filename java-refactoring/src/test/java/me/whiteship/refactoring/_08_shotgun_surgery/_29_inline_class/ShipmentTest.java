package me.whiteship.refactoring._08_shotgun_surgery._29_inline_class;

import org.junit.jupiter.api.Test;

class ShipmentTest {

    @Test
    void trackingInfo() {

        // 기존 함수 호출
        // Shipment shipment = new Shipment(new TrackingInformation("UPS", "12345"));
        // shipment.getTrackingInfo();

        // 클래스 인라인 함수 호출
        Shipment shipment = new Shipment("UPS", "12345");
        shipment.getTrackingInfo();
    }

}