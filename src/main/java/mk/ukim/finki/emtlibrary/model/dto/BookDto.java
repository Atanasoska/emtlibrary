package mk.ukim.finki.emtlibrary.model.dto;

import mk.ukim.finki.emtlibrary.model.Author;
import mk.ukim.finki.emtlibrary.model.enumeration.Category;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Data
public class BookDto {

    private String name;

    private Category category;

    private Long author;

    private Integer availablecopies;

    public BookDto() {
    }

    public BookDto(String name, Category category, Long author, Integer availablecopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availablecopies = availablecopies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getAuthor() {
        return author;
    }

    public void setAuthor(Long author) {
        this.author = author;
    }

    public Integer getAvailablecopies() {
        return availablecopies;
    }

    public void setAvailablecopies(Integer availablecopies) {
        this.availablecopies = availablecopies;
    }
}
