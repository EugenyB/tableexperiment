package sample;

/**
 * Created by eugeny on 19.03.2016.
 */
public class Person {
    private int id;
    private String fio;
    private String adress;
    private int age;

    public Person(int id, String fio, String adress, int age) {
        this.id = id;
        this.fio = fio;
        this.adress = adress;
        this.age = age;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
