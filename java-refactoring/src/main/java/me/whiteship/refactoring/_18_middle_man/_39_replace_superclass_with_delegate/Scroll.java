package me.whiteship.refactoring._18_middle_man._39_replace_superclass_with_delegate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Scroll {

    private LocalDate dateLastCleaned;
    private CategoryItem categoryItem; // 필드 선언

    public Scroll(Integer id, String title, List<String> tags, LocalDate dateLastCleaned) {
        this.dateLastCleaned = dateLastCleaned;
        this.categoryItem = new CategoryItem(id, title, tags);
    }

    public long daysSinceLastCleaning(LocalDate targetDate) {
        return this.dateLastCleaned.until(targetDate, ChronoUnit.DAYS);
    }

    public LocalDate getDateLastCleaned() {
        return dateLastCleaned;
    }

    public Integer getId() {
        return this.categoryItem.getId(); // 해당 코드만 수정하면 됨
    }
}
