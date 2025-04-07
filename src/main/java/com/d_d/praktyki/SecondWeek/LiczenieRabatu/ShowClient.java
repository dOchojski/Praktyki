package com.d_d.praktyki.SecondWeek.LiczenieRabatu;

public class ShowClient {
    DiscountService discountService = new DiscountService();

    public void showClient(Client client, double price, double priceDiscount){
        if (client.getLastName()==null) {
            System.out.println("Witaj " + client.getFirstName());
            System.out.println("Cena przed rabatem: " + price);
            System.out.println("Kwota do zapłaty(Po rabacie): " + priceDiscount);
        }else if(client.getFirstName()==null){
            System.out.println("Witaj Pani/e " + client.getLastName());
            System.out.println("Cena przed rabatem: " + price);
            System.out.println("Kwota do zapłaty(Po rabacie): " + priceDiscount);
        }else if(client.getLastName()==null && client.getFirstName()==null){
            System.out.println("Witaj nieznajomy.");
            System.out.println("Cena przed rabatem: " + price);
            System.out.println("Kwota do zapłaty(Po rabacie): " + priceDiscount);
        }else{
            System.out.println("Witaj " + client.getFirstName() + " " + client.getLastName());
            System.out.println("Cena przed rabatem: " + price);
            System.out.println("Kwota do zapłaty(Po rabacie): " + priceDiscount);
        }
    }

    public double countDicountprice(double price, Client client){
        double priceDiscount = discountService.calculateDiscountPrice(client,price);
        return priceDiscount;
    }
}
