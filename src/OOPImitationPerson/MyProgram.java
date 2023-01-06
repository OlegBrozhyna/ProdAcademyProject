package OOPImitationPerson;

public class MyProgram {
    public static void main(String[] args) {
        Employee employee = new Employee("Plintus", "Humber", 100500, "Developer");
        System.out.println(employee);
        System.out.println(employee.getName());
        System.out.println(employee.toString());

        Developer developer = new Developer("Enriko", "Jonathan", 15, " Developer ", " Java ," );

        System.out.println(developer);

        Person person= employee;
        System.out.println(person.toString());

        System.out.println();

        Company company = new Company(" BOB ");
        company.add(developer);
        System.out.println(company);
        System.out.println();
        Employee employee1= company.seachById(10);

    }

}
