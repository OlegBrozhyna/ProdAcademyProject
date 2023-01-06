package OOPImitationPerson;

public class Employee extends Person {
    private int id;
    private String departament;

    public Employee(String name, String lastName, int id, String departament) {
        super(name, lastName);
        this.id = id;
        this.departament = departament;
    }

    public Employee(int id, String departament) {
        this.id = id;
        this.departament = departament;
    }

    public Employee() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;  // Переоприділення методу
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", departament='" + departament + " , " + super.toString() + '\'' +
                '}';
    }
}
