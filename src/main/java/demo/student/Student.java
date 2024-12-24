package demo.student;

import java.time.LocalDate;

public class Student {

    private Long id;
    private String name;
    private Integer age;
    private LocalDate birthday;
    private String email;

    public Student(){}

    public Student(Long id, String name, Integer age, LocalDate birthday, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
    }

    public Student(String name, Integer age, LocalDate birthday, String email) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                '}';
    }
}
