package com.bta;

public class Auto {
    private long  id;
    private String model;
    private int weight;
    private String color;
    private int price;

    public Auto(long id, String model, int weight, String color, int price) {
        this.id = id;
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
