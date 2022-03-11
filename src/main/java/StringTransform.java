import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class StringTransform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String userInput = sc.nextLine();
        System.out.printf("Case inverted: %s\n", StringUtils.swapCase(userInput));
        System.out.printf("Reversed: %s\n", StringUtils.reverse(userInput));
    }
}
