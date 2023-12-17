package me.whiteship.refactoring._05_global_data._17_encapsulate_variable;

public class Thermostats {

    public static Integer targetTemperature = 70;

    public static Boolean heating = true;

    public static Boolean cooling = false;

    public static Boolean fahrenheit = true;

    public static void setTargetTemperature(Integer targetTemperature) {
        // validation 처리
        if (targetTemperature >= 100) throw new IllegalArgumentException("설정 불가능한 값입니다.");
        Thermostats.targetTemperature = targetTemperature;
        // 후속작업 - 로깅 처리
        System.out.println("targetTemperature를 " + targetTemperature + "로 변경하였습니다.");
    }

    public static void setHeating(Boolean heating) {
        Thermostats.heating = heating;
    }

    public static void setCooling(Boolean cooling) {
        Thermostats.cooling = cooling;
    }

    public static void setFahrenheit(Boolean fahrenheit) {
        Thermostats.fahrenheit = fahrenheit;
    }
}
