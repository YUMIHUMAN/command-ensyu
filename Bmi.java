import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("一人目");
        System.out.println("身長");
        double sincho = Double.parseDouble(sc.nextLine());
        System.out.println("体重");
        double taiju = Double.parseDouble(sc.nextLine());
        System.out.println("身長" + sincho);
        System.out.println("体重" + taiju);
        System.out.println(taiju / (sincho * sincho));
        System.out.println("二人目");
        System.out.println("身長");
        double sincho2 = Double.parseDouble(sc.nextLine());
        System.out.println("体重");
        double taiju2 = Double.parseDouble(sc.nextLine());
        System.out.println("身長" + sincho2);
        System.out.println("体重" + taiju2);
        System.out.println(taiju2 / (sincho2 * sincho2));



    }
}
