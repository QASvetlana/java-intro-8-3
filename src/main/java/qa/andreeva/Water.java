package qa.andreeva;

import java.util.Objects;

public class Water {
    String brande;
    int price;


    public Water(String brande, int price) {
        this.brande = brande;
        this.price = price;
    }



    public void byewater(String brande) {
        this.brande = brande;
        if (Objects.equals(this.brande, "Bonaqua")) {
            System.out.println("В продаже есть вода " + this.brande);
        } else {
            System.out.println("В продаже есть вода " + this.brande);
        }

    }








}
