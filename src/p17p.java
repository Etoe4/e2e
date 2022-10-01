import java.util.Scanner;
public class p17p {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("length: ");
        int length = in.nextInt();

        System.out.println("width: ");
        int width  = in.nextInt();

        for (int i = 0; i < width  ; i++)
        {
        System.out.print(" _");
        }
        System.out.println();
        for (int i = 0; i < length  ; i++)
        {
            System.out.print("!");
            for (int z = 0; z < width  ; z++)
            {
                System.out.print("  ");
            }

                System.out.println("!");
        }
        for (int i = 0; i < width  ; i++)
        {
            System.out.print(" _");
        }
        System.out.println();
        System.out.println("square: " + length * width);
    }
}
