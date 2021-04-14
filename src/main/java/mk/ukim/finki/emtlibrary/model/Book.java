package mk.ukim.finki.emtlibrary.model;

import mk.ukim.finki.emtlibrary.model.enumeration.Category;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private Category category;

    @ManyToOne
    private Author author;

    private Integer availablecopies;

    public Book() {
    }

    public Book(Long id, String name, Category category, Author author, Integer availablecopies) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.author = author;
        this.availablecopies = availablecopies;
    }

    public Book(String name, Category category, Author author, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availablecopies = availableCopies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getAvailablecopies() {
        return availablecopies;
    }

    public void setAvailablecopies(Integer availablecopies) {
        this.availablecopies = availablecopies;
    }
}
