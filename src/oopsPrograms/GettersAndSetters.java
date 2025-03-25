package oopsPrograms;

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() { // Fixed getter method
        return age;
    }

    public void setAge(int newAge) {
        if(newAge > 0 && newAge < 100){
            age = newAge;
        }
        else {
            System.out.println("Not a valid age input");
        }

    }

    public void setName(String newName) { // Fixed return type
        if (newName != null && !newName.trim().isEmpty()) {
            name = newName;
        } else {
            System.out.println("Name cannot be empty or null");
        }
    }
}

public class GettersAndSetters {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ganga");
        System.out.println(person.getName());
        person.setAge(23);
        System.out.println(person.getAge());
    }
}
