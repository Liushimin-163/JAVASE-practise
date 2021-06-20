public class Teacher {
    private String name;

    public Teacher() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(String name) {
        this.name = name;


    }

    public void checkAb(Student s){
        s.setAb("Today is not present");
    }
}
