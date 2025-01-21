package demo.student;

public class Student {

    public String id;
    public String Name;
    public int Age;

    public Student(String id, String Name, int Age) {
        this.id = id;
        this.Name = Name;
        this.Age = Age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }
}