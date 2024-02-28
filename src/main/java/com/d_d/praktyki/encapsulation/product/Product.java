package com.d_d.praktyki.encapsulation.product;

public class Product {
    private String name;
    private double cost;
    private int quantity;

    public Product(String name, double cost, int quantity) {
        this.name = name;
        setCost(cost);
        setQuantity(quantity);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCost(double cost) {
        if (cost < 0) throw new IllegalArgumentException("cost cannot be negative");
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative");
        this.quantity = quantity;
    }

    public void plusQuantity(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        setQuantity(quantity + amount);
    }

    public void minusQuantity(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        setQuantity(quantity - amount);
    }


    public int getQuantity() {
        return quantity;
    }
}
