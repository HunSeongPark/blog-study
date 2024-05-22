package org.api.service;

import org.domain.service.StringRepository;

import java.util.List;
import java.util.stream.Stream;

public class StringSaveConsumer {

    // Service Consumer는 외부에서 주입받아 그대로 사용
    private final StringRepository stringRepository = StringRepositoryLoader.getDefaultRepository();

    public void consume() {
        stringRepository.save("test");
    }

    public static void main(String[] args) {
        stream();
    }

    public static void stream() {
        // AS-IS (Java 9 미만)
        Stream.iterate(0, i -> i + 2)
                .limit(5) // 없으면 무한스트림
                .forEach(System.out::println);

        // TO-Be (Java 9)
        Stream.iterate(0, i -> i < 10, i -> i + 2) // 종료조건 추가 가능
                .forEach(System.out::println);
    }
}
