public class Person {
    private final String name;
    private final int age;

    // construtor xxx
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public int getAge() {
        return age;
    }


    void eat () {
        System.out.println((this.name+ " is eating"));
    }
    void drink () {
        System.out.println((this.name+ " is drinking"));
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
