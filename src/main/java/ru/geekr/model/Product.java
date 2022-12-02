package ru.geekr.model;

public class Product {
    private Long id;
    private String title;
    private Double cost;

    public Product(Long id, String title, Double cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost;
    }
}
