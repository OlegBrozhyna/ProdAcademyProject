package OOPImitationPerson;

public class Developer extends Employee {
    private String skill;

    public Developer(String name, String lastName, int id, String departament, String skill) {
        super(name, lastName, id, departament);
        this.skill = skill;
        setId(id);

    }

    public Developer() {
        super();

    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void setId(int id) {
        id= (id/10)*10;
        super.setId(id);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "skill='" + skill + "departament ='" + getDepartament () + "id='" + getId() + " Name='"+ getName()+
                 " lastName='" + getLastName() + '\'' +
                '}';
    }
}


