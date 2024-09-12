import java.util.Scanner;

public class AlternateCharacters
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println("Alternate characters: ");
        for (int i = 0; i < input.length(); i += 2)
        {
            System.out.print(input.charAt(i) + " ");
        }
    }
}
