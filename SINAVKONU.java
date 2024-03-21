abstract class Insan {
    protected String isim;

    public Insan(String isim) {
        this.isim = isim;
    }
}


interface IBuyukGot{
    public void getGotBuyuklugu();
}

class Berkay extends Insan implements IBuyukGot{
    private final int gotBuyuklugu;

    public Berkay(String isim, int gotBuyuklugu) {
        super(isim);
        this.gotBuyuklugu = gotBuyuklugu;
    }


    @Override
    public void getGotBuyuklugu() {
        System.out.println("Ben " + isim + " götüm " + gotBuyuklugu + "cm kare");
    }
}

class A{
    public void cagir(){
        System.out.println("Berkay");
    }
    protected int a = 10;
}

class B extends A{

    public void emre(){
        System.out.println("emre");
    }
    public B(String name, int b) {
        System.out.println(name+" "+b+ a);
    }


}


public class SINAVKONU {


    public static void main(String[] args){
        /*B b =new B("memo",31);
        b.cagir();
        b.emre();
        System.out.println(b.a);*/

        /*Berkay b = new Berkay("Berkay", 120);
        b.getGotBuyuklugu();*/

    }
}
