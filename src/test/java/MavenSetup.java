import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
public class MavenSetup {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Something: ");
            String input = scanner.nextLine();
            System.out.println("You entere: \"" + input + "\"");

            if (StringUtils.isNumeric(input)) {
                System.out.println("\"" + input + "\" is a number");
            } else {
                System.out.println("\"" + input + "\" is not a number");
            }

            System.out.println("Flipped Case: " + StringUtils.swapCase(input));
            System.out.println("Reversed: " + StringUtils.reverse(input));

        }

    }

