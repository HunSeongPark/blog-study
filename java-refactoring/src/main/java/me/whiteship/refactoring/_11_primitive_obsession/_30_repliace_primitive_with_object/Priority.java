package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

import java.util.List;

public class Priority {

    private String value;

    // 우선순위 순서 && 유효한 우선순위 value 목록
    private List<String> legalValues = List.of("low", "normal", "high", "rush");

    public Priority(String value) {
        if (legalValues.contains(value)) { // validation
            this.value = value;
        } else {
            throw new IllegalArgumentException(value);
        }
    }

    @Override
    public String toString() {
        return this.value;
    }

    private int index() {
        return legalValues.indexOf(this.value);
    }

    // Priority 간 우선순위 비교
    public boolean higherThan(Priority other) {
        return this.index() > other.index();
    }
}
