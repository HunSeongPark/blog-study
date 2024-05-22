package org.rec10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public record ToBeDto(
        // 컴포넌트
        @MyAnnotation String username, // private final String username
        int age
) {

    public ToBeDto { // compact constructor
        if (this.age() <= 0) {
            throw new IllegalArgumentException("나이는 1 이상이어야 합니다.");
        }
    }

    @Override
    public String username() { // 자동 생성된 메서드 재정의 가능
        return "내 이름은 " + username;
    }


}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) // 필드에만 어노테이션 적용
@interface MyAnnotation {}
