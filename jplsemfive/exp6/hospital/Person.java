package jplsemfive.exp6.hospital;
public class Person {
    protected String name;
    protected String Date;

    public Person(String name, String Date) {
        this.name = name;
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', Date='" + Date + "'}";
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return this.Date;
    }
}
