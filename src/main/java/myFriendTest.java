
public class myFriendTest {

    public static void main(String args[]) {

        myFriend empOne = new myFriend("Monika Augustyte");
        myFriend empTwo = new myFriend("Gabija Docyte");


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
