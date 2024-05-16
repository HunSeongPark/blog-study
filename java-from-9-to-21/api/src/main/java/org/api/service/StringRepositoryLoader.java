package org.api.service;

import org.domain.service.StringRepository;

import java.util.ServiceLoader;

public class StringRepositoryLoader {

    // 외부 config 파일 등을 import해 외부에서 변경 가능
    public static final String DEFAULT = "DatabaseStringRepository";

    public static StringRepository getDefaultRepository() {
        return getRepository(DEFAULT);
    }

    private static StringRepository getRepository(String name) {
        // ServiceLoader에서 해당 Interface에 해당하는 구현체 찾음
        for (StringRepository repository : ServiceLoader.load(StringRepository.class)) {
            if (repository.getClass().getSimpleName().equals(name)) {
                return repository;
            }
        }
        throw new IllegalArgumentException("Repository Not Found!");
    }
}
