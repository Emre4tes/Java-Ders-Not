public class Inek extends Hayvan implements IDortAyak{
    public Inek(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Möö benim adım " + super.name;
    }

    @Override
    public void toynakSayisi() {
        System.out.println("8 toynağım var");
    }
}
