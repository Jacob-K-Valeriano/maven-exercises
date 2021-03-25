import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        isANumber();
        System.out.println(flipTheSwitch());
        System.out.println(fakeLatin());

    }




    public static Object isANumber() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Anything: ");
        String userInfo = userInput.nextLine();

        if (StringUtils.isNumeric(userInfo)) {
            System.out.println("Input is a number!");
        } else {
            System.out.println("Input is not a number!");
        }
        return null;
    }

    public static String flipTheSwitch() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Anything: ");
        String userInfo = userInput.nextLine();
        return StringUtils.swapCase(userInfo);
    }

    public static String fakeLatin() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Anything: ");
        String userInfo = userInput.nextLine();
        return StringUtils.reverse(userInfo);
    }


}


