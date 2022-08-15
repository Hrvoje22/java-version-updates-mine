import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add("Apple");

        printDouble(items);



    }

    private static void printDouble(ArrayList items){

        for(Object each : items){
            System.out.println((Integer)each*2);
        }


    }



}
