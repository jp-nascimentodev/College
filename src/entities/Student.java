package entities;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private  Integer age;
    private Status status;

    private List<Material> materials = new ArrayList<>();


    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    //Metodos da classe

    public  void  StatusAtualy(){
            for ( Material m : materials){
                if(m.averege() >= 6){
                    setStatus(Status.APROVED);
                } else if (m.averege() < 6) {
                    setStatus(Status.REPROVED);
                }

            }
    }




}
