package Task_2_LinkedList;

public class Friends {
    private String name;
    private int age;
    private String phoneNumber;

    public Friends(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        String var10000 = this.getName();
        return var10000 + " " + this.getAge() + " " + this.getPhoneNumber();
    }
}
