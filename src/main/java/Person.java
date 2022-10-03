public class Person {
    private final String name;
    private final int age;

    // construtor xxxxx
    public Person(String name) {
        this.name = name;
        this.age = 10;
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
