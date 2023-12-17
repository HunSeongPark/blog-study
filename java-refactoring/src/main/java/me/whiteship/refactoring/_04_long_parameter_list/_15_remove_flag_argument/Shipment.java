package me.whiteship.refactoring._04_long_parameter_list._15_remove_flag_argument;

import java.time.LocalDate;

public class Shipment {

    public static void main(String[] args) {
        Order order = new Order(LocalDate.now(), "WA");
        Shipment shipment = new Shipment();
        LocalDate deliveryDate = order.getIsRush() ? getRushDeliveryDate(order) : getRegularDeliveryDate(order);
    }

    public static LocalDate getRegularDeliveryDate(Order order) {
        int deliveryTime = switch (order.getDeliveryState()) {
            case "WA", "CA" -> 2;
            case "OR", "TX", "NY" -> 3;
            default -> 4;
        };
        return order.getPlacedOn().plusDays(deliveryTime);
    }

    public static LocalDate getRushDeliveryDate(Order order) {
        int deliveryTime = switch (order.getDeliveryState()) {
            case "WA", "CA", "OR" -> 1;
            case "TX", "NY", "FL" -> 2;
            default -> 3;
        };
        return order.getPlacedOn().plusDays(deliveryTime);
    }
}
