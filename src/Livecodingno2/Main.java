package Livecodingno2;
import java.util.*;

public class Main {
    static String read(LinkedList<Object> list){
        //Tulis kode kamu disini
        //method mengembalikan linkedList dibaca dari depan dalam tipe data string
        //contoh : a b c d e f g dibaca abcdefg
        String str = "";
        return str;
    }
    static String reverse(LinkedList<Object> list){
        //Tulis kode kamu disini
        //method mengembalikan linkedList dibaca terbalik dalam tipe data string
        //contoh : a b c d e f g dibaca gfedcba
        String str = "";
        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Object> list = new LinkedList<>();
        String input=in.nextLine();
        for(int i=0; i<input.length(); i++){
            list.addLast(input.charAt(i));
        }

        if(read(list).equals(reverse(list))) System.out.println("Penghuni Rock Bottom");
        else System.out.println("Bukan penghuni Rock Bottom");


    }
}
