public class Koyun extends Hayvan{
    public Koyun(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Koyun "+super.name;
    }
}
