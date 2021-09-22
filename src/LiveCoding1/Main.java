package LiveCoding1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Double> list=new LinkedList<>();
        int m=in.nextInt();in.nextLine();
        String arr[]=new String[m];
        for(int i=0 ; i<m ; i++){
            arr=in.nextLine().split(" ");
            switch(arr[0]){
                case "addFirst":{
                    list.addFirst(Double.parseDouble(arr[1]));
                }break;
                case "addLast":{
                    list.addLast(Double.parseDouble(arr[1]));
                }break;
                case "insertAfter":{

                }break;
                case "insertBefore":{
                    // Tulis kode kamu disini
                }break;
            }
        }

        double sum=0;
        // Tulis kode kamu disini
        // hitung rata-rata elemen pada LinkedList dan masukkan pada variabel sum
        System.out.printf("%.2f",sum);
    }
}
