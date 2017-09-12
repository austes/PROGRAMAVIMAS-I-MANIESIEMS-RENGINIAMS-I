
public class NameAndAge {
    int PersonAge;

    public NameAndAge(String name) {
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

        NameAndAge myName = new NameAndAge( "Auste" );


        myName.setAge( 21 );
        myName.getAge( );
    }
}

