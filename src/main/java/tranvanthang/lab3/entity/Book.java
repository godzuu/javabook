package tranvanthang.lab3.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import tranvanthang.lab3.Validator.annotation.ValidCategoryId;
import tranvanthang.lab3.Validator.annotation.ValidUsername;

@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    @NotEmpty(message = "Tiêu đề không được để trống")
    @Size(max = 50, min = 1, message = "Không quá 50 kí tự")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "price")
    @NotNull(message = "Không được để trống")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @ValidCategoryId
    private Category category;

    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "id")
    @ValidUsername
    private User user;
}
