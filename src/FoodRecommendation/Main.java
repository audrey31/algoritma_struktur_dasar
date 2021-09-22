package FoodRecommendation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<food> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang, mau ngapain hari ini?");

        boolean check = true;
        while(check){
            System.out.println("========================");
            menu();
            System.out.print("Input: ");

            int num = in.nextInt();

            switch (num){
                case 1:
                    System.out.print("Berapa makanan yang dimasukkan: ");
                    int limit = in.nextInt();
                    in.nextLine();
                    for (int i = 0; i < limit; i++) {
                        System.out.print("Nama makanan" + "(" + (i+1) + ") : ");
                        String str = in.nextLine();
                        addFood(str);
                        System.out.println("Makanan telah ditambahkan");
                    }
                    break;
                case 2:
                    int temp = randomNumber(arrayList.size()) - 1;
                    for (int i = 0; i < arrayList.size(); i++) {
                        if(i == temp){
                            System.out.println("Makanan yang direkomendasikan adalah: " + "(" + (temp+1) + ") " + arrayList.get(temp));
                        }
                    }
                    break;
                case 3:
                    if (arrayList.isEmpty()){
                        System.out.println("Belum memasukkan makanan");
                    }else{
                        System.out.println("Makanan:");
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        System.out.println("(" + (i+1) + ") " + arrayList.get(i));
                    }
                    break;
                case 0:
                    System.out.println("Sampai jumpa!");
                    check = false;
                    break;
                default:
                    System.out.println("Masukkan angka yang benar");
                    break;
            }
        }
    }

    public static void addFood(String input){
            arrayList.add(new food(input));
    }

    public static void menu(){
        System.out.println("1. Tambah makanan");
        System.out.println("2. Rekomendasi berdasarkan list");
        System.out.println("3. Menampilkan makanan yang telah ditambahkan");
        System.out.println("0. Keluar");
        System.out.println("========================");
    }

    public static int randomNumber(int max){
        return (int) Math.floor (Math.random() * (max - 1 + 1) + 1);
    }
}
