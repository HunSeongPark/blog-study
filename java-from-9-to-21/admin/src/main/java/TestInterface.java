import java.util.List;

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

    default void stream() {
        List<Integer> list = List.of(11, 15, 5, 17, 13, 2);
        list.stream()
                .takeWhile(n -> n > 10)
                .forEach(System.out::println);
    }
}
