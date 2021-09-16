package qa.andreeva;

public class Main  {
    public static  void main(String[] args) {
       Water newwater = new Water("Bonaqua", 50);
        Water newwater1 = new Water("Aquaminerale", 60);


        newwater.byewater("Bonaqua");
        System.out.println("В продаже есть вода:" + newwater.brande + " ее стоимость в рублях:" + newwater.price);

        newwater1.byewater("Aquaminerale");
        System.out.println("В продаже есть вода:" + newwater1.brande + " ее стоимость в рублях:" + newwater1.price);

    }


}
