public abstract class Hayvan {
    protected    String name;

    public Hayvan(String name) {
        this.name = name;
    }

    public abstract String getName();

    public void merhaba() {
        System.out.println("Merhaba");
    }

}
