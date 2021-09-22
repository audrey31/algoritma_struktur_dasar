package LK03;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        double a = Math.random();
        System.out.println(a);

        System.out.println("==================LK03==================");
        //menentukan banyak isi stack
        System.out.print("Berapa banyak data yang diinginkan: ");
        int input = inp.nextInt();
        System.out.println("=========================");

        //input isi stack berdasarkan random number
        for (int i = 1; i <= input; i++) {
            int randomNum = randomNumber(1,100);
            stack.push(randomNum);
        }
        System.out.println("Data sekarang adalah: " + stack + "\n=========================");

        //penghapusan data hingga 1
        while(stack.size() > 1){
            stack.pop();
        }


        System.out.println("Data setelah pop menyisakan 1: " + stack);
    }

    public static int randomNumber(int min, int max){
        int random = (int) Math.floor (Math.random() * (max - min + 1) + min);
        return random;
    }
}
