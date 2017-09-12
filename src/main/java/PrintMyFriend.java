
public class PrintMyFriend {

    public static void main(String args[]) {

        MyFriend empOne = new MyFriend("Monika Augustyte");
        MyFriend empTwo = new MyFriend("Gabija Docyte");


        empOne.friendAge(20);
        empOne.friendDesignation("Manager");
        empOne.friendSalary(900);
        empOne.printFriend();

        empTwo.friendAge(21);
        empTwo.friendDesignation("Software Engineer");
        empTwo.friendSalary(500);
        empTwo.printFriend();
    }
}
