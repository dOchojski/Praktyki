package com.d_d.praktyki.SecondWeek.LiczenieRabatu;

public class DiscountApp {
    public static void main(String[] args) {
        ShowClient showClient = new ShowClient();

        Client client1 = new Client("Jan",null, true);
        double price1 = 1100;
        double priceDiscount1 = showClient.countDicountprice(price1, client1);
        showClient.showClient(client1,price1,priceDiscount1);

        Client client2 = new Client(null,null, false);
        double price2 = 1000;
        double priceDiscount2 = showClient.countDicountprice(price2, client2);
        showClient.showClient(client2,price2,priceDiscount2);

        Client client3 = new Client(null,"Nowak", true);
        double price3 = 500;
        double priceDiscount3 = showClient.countDicountprice(price3, client3);
        showClient.showClient(client3,price3,priceDiscount3);

        Client client4 = new Client("Andrzej","Kowalski", false);
        double price4 = 689;
        double priceDiscount4 = showClient.countDicountprice(price4, client4);
        showClient.showClient(client4,price4,priceDiscount4);

    }
}
