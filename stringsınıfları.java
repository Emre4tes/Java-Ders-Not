public class stringsınıfları {
    public static void main(String[]args){
        String s1="Mustafa";
        String s2=new String("Mustafa");
        String s3=new String("Mustafa");

        System.out.println(s2.length());

        System.out.println("0.index: "+s2.charAt(0));
        System.out.println("5.index: "+s2.charAt(5));
        System.out.println("5.index: "+s2.charAt(s2.length()-1));

        System.out.println(s2.startsWith("Mu"));
        System.out.println(s2.endsWith("an"));

        if(s2.equals(s3)){
            System.out.println("Eşit");
        }
    }
}
