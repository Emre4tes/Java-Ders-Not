public class inheratancecalisan {
    private String name;
    private String department;
    private int salary;

    public inheratancecalisan(String name, String department, int salary) {
        this.name = name;
        this.department=department;
        this.salary=salary;
    }
    public void showInfos(){
        System.out.println("Bilgiler...");
        System.out.println("İsim : "+this.name);
        System.out.println("Deparment : "+this.department);
        System.out.println("Maaş : "+this.salary);
    }



}
