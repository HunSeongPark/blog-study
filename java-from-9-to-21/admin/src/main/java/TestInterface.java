public interface TestInterface {

    default void defaultMethod1() {
        commonLogic();

        System.out.println("default method 1");
    }

    default void defaultMethod2() {
        commonLogic();

        System.out.println("default method 2");
    }

    private void commonLogic() { // private 가능
        int common = 10;
        System.out.println("common logic" + common); // 공통로직 (중복)
    }
}
