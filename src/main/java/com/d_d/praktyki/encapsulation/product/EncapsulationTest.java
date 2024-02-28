package com.d_d.praktyki.encapsulation.product;

public class EncapsulationTest {
    public static void main(String[] args) {
        Product soap = new Product("Soap", 2.33, 1);

        soap.minusQuantity(1);
        System.out.println(soap.getQuantity());

        // throws error - quantity cannot be negative
        soap.minusQuantity(1);
        System.out.println(soap.getQuantity());
    }
}
