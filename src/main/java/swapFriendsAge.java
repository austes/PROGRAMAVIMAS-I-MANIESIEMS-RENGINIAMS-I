
public class swapFriendsAge {

    public static void main(String[] args) {
        int MonikaAge = 21;
        int GabijaAge = 20;
        System.out.println("Before swapping: MonikaAge = " + MonikaAge + " and GabijaAge = " + GabijaAge);

        // Invoke the swap method
        swapFunction(MonikaAge, GabijaAge);
        System.out.println("\n**Now, Before and After swapping values will be same here**:");
        System.out.println("After swapping, Monika age = " + MonikaAge + " and Gabija age is " + GabijaAge);
    }

    public static void swapFunction(int Monika, int Gabija) {
        System.out.println("Before swapping: Monika = " + Monika + " Gabija = " + Gabija);

        // Swap n1 with n2
        int temporary = Monika;
        Monika = Gabija;
        Gabija = temporary;
        System.out.println("After swapping: Monika = " + Monika + " Gabija = " + Gabija);
    }
}
