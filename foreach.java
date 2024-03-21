import java.util.ArrayList;

public class foreach{
    public static void main(String[]args){

        ArrayList<String> groups =new ArrayList<String>();

        int[] arr={10,20,30,40,50,60};

        groups.add("Metalica");
        groups.add("Iron Maiden");
        groups.add("Guns' n Roses");
        groups.add("Balck Sabbath");

        groups.remove("Iron Maiden");


        for (String s:groups){
            System.out.println("Eleman: " +s);
        }
        for(int i:arr){
            System.out.println("Eleman : "+i);
        }
    }
}
