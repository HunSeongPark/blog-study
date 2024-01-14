package me.whiteship.refactoring._08_shotgun_surgery._29_inline_class;

public class Shipment {

    public static void main(String[] args) {
        // 기존 함수 호출
        // Shipment shipment = new Shipment(new TrackingInformation("UPS", "12345"));
        // shipment.getTrackingInfo();

        // 클래스 인라인 함수 호출
        Shipment shipment = new Shipment("UPS", "12345");
        shipment.getTrackingInfo();
    }

    // TrackingInformation Field 가져오기
    private String shippingCompany;
    private String trackingNumber;

    public Shipment(String shippingCompany, String trackingNumber) {
        this.shippingCompany = shippingCompany;
        this.trackingNumber = trackingNumber;
    }

    public String getShippingCompany() {
        return shippingCompany;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getTrackingInfo() {
        // 기존 TrackingInformation의 display() 함수 inline
        return this.shippingCompany + ":" + this.trackingNumber;
    }
}
