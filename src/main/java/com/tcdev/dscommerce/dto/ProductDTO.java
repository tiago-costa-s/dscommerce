package com.tcdev.dscommerce.dto;

import com.tcdev.dscommerce.entities.Product;
import jakarta.validation.constraints.*;

public class ProductDTO {

    private Long id;
    @Size(min = 3, max = 800, message = "Nome precisa ter de 3 a 80 caracteres.")
    @NotBlank(message = "Campo requerido.")
    private String name;
    @Size(min = 10, max = 1500, message = "Descrição precisa ter de 3 a 1500 caracteres.")
    private String description;
    @Positive(message = "O preço deve ser positivo.")
    private Double price;
    private String imgUrl;

    private ProductDTO() {
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
