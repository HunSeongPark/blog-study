package org.api.service;

import org.domain.service.StringRepository;

public class StringSaveConsumer {

    // Service Consumer는 외부에서 주입받아 그대로 사용
    private final StringRepository stringRepository = StringRepositoryLoader.getDefaultRepository();

    public void consume() {
        stringRepository.save("test");
    }

    public static void main(String[] args) {
        StringSaveConsumer consumer = new StringSaveConsumer();
        consumer.consume();
    }
}
