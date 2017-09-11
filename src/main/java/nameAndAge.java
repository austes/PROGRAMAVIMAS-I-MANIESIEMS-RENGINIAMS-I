
public class nameAndAge {
    int PersonAge;

    public nameAndAge(String name) {
        System.out.println("Chosen person name: " + name );
    }

    public void setAge( int age ) {
        PersonAge = age;
    }

    public int getAge( ) {
        System.out.println("Person age: " + PersonAge);
        return PersonAge;
    }

    public static void main(String []args) {

        nameAndAge myName = new nameAndAge( "Auste" );

        myName.setAge( 21 );
        myName.getAge( );
    }
}

