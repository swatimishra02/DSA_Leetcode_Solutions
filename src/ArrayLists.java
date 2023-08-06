import java.util.Scanner;
import java.util.ArrayList;
public class ArrayLists {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter size: ");
        int n = in.nextInt();
        ArrayList<Integer>  list = new ArrayList<>();

        for (int i = 0; i<n; i++){
            list.add(in.nextInt());
        }

        System.out.println(list);
    }


}
