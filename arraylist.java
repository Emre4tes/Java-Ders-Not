import java.util.ArrayList;

public class arraylist {
    public static void main(String[]args){

        ArrayList<String> groups =new ArrayList<String>();

        groups.add("Metalica");
        groups.add("Iron Maiden");
        groups.add("Guns' n Roses");
        groups.add("Balck Sabbath");

        groups.remove("Iron Maiden");


        for (int i=0;i< groups.size();i++){
            System.out.println("Eleman: "+groups.get(1));
        }
    }
}
