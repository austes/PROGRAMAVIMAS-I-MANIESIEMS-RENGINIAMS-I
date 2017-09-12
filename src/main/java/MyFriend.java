
public class MyFriend {
    String name;
    int age;
    String designation;
    double salary;


    public MyFriend(String name) {
        this.name = name;
    }

    public void friendAge(int friendAge) {
        age = friendAge;
    }

    public void friendDesignation(String friendDesig) {
        designation = friendDesig;
    }

    public void friendSalary(double friendSalary) {
        salary = friendSalary;
    }


    public void printFriend() {
        System.out.println("Name: "+ name );
        System.out.println("Age: " + age );
        System.out.println("Job: " + designation );
        System.out.println("Salary: " + salary);
    }
}

