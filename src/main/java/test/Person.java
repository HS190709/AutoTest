package test;

/**
 * @author hs
 * @date 2019年1月25日, 0025 下午 08:30:20
 */
public class Person {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            Person p2 = (Person) obj;
            return id == p2.id/* && name.equals(p2.name)*/;
        }
        return false;
    }

    public static void main(String[] args) {
        Person p1 = new Person(1,"songtx");
        Person p2 = new Person(1,"songtx");
        System.out.println(p1.equals(p2));
    }
}
