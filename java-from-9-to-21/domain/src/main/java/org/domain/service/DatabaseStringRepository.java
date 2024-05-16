package org.domain.service;

public class DatabaseStringRepository implements StringRepository {

    @Override
    public void save(String newStr) {
        System.out.println("DB 메모리 저장");
    }
}
