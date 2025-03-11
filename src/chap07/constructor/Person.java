package chap07.constructor;

public class Person {
    private String name;
    private String ssn;

    public Person(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    // getter
    public String getName() {
        return this.name;
    }

    public String getSsn() {
        return ssn;
    }

}
