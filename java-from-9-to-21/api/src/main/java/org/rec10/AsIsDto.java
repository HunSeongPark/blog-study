package org.rec10;

import java.util.Objects;

public final class AsIsDto { // 상속을 막기위한 final class

    private final String username; // 캡슐화, 변경 방지를 위한 private final 필드
    private final int age;

    public AsIsDto(String username, int age) { // 값 초기화 및 객체 생성을 위한 생성자
        this.username = username;
        this.age = age;
    }

    public String getName() { // 필드 값 반환을 위한 getter
        return this.username;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object obj) { // 객체 비교를 위한 equals(), hashCode() 재정의
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        AsIsDto asIsDto = (AsIsDto) obj;
        return this.username.equals(asIsDto.username) && this.age == asIsDto.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.username, this.age);
    }

    @Override
    public String toString() { // 데이터 출력을 위한 toString() 재정의
        return "AsIsDto(name=" + this.getName() + ", age=" + this.getAge();
    }
}
