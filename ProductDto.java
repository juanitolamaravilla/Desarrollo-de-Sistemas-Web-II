package com.tiendasara.Tienda.Sara.models;

import org.springframework.web.multipart.MultipartFile;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProductDto {

    @NotEmpty(message = "La descripción es requerida")
    @Size(min = 3, max = 250, message = "La descripción debe tener entre 3 y 250 caracteres")
    private String description;

    @Min(value = 0, message = "El precio no puede ser negativo")
    private double price;

    @Min(value = 0, message = "La cantidad no puede ser negativa")
    private int amount;

    // Cambiado de 'int' a 'Integer' para admitir nulos y que @NotNull funcione
    @NotNull(message = "La categoría es requerida")
    private Integer category;

    @NotNull(message = "La marca es requerida")
    private Integer mark;

    private MultipartFile imageFile;

    // Getters y Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }
}