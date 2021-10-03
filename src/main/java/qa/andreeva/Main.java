package qa.andreeva;

public class Main  {
    public static  void main(String[] args) {
       Water newwater = new Water("Bonaqua", 50);
        Water newwater1 = new Water("Aquaminerale", 60);
        Water newwater2 = new Water("Perrier", 120);
        Water newwater3 = new Water("Crystal", 160);

        newwater.byewater("Bonaqua");
        System.out.println("В продаже есть вода:" + newwater.brande + " ее стоимость в рублях:" + newwater.price);

        newwater1.byewater("Aquaminerale");
        System.out.println("В продаже есть вода:" + newwater1.brande + " ее стоимость в рублях:" + newwater1.price);

        newwater2.byewater("Perrier");
        System.out.println("В продаже есть вода:" + newwater2.brande + " ее стоимость в рублях:" + newwater2.price);

        newwater2.byewater("Crystal");
        System.out.println("В продаже есть вода:" + newwater3.brande + " ее стоимость в рублях:" + newwater3.price);

    }


}
