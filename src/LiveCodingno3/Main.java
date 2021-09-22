//package LiveCodingno3;
//
//import java.util.LinkedList;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner x = new Scanner(System.in);
//        LinkedList<Integer> list = new LinkedList<>();
//        int in1 = x.nextInt();
//        for (int i = 0; i < in1; i++) {
//            list.addLast(x.nextInt());
//        }
//        int in2 = x.nextInt();
//        x.nextLine();
//        for (int i = 0; i < in2; i++) {
//            String arr[] = x.nextLine().split(" ");
//
//            switch (arr[0]) {
//                case "Disband": {
////                    String disband[] = x.nextLine().split(" ");
////                    int size = disband.length;
////                    int [] arrTemp = new int[size];
////                    for (int j = 0; j < size; j++) {
////                        arrTemp[j] = Integer.parseInt(disband[j]);
////                    }
////                    for (int l = arrTemp[0]; l <= arrTemp[0] + arrTemp[1] + 1; l++) {
////                        if (arrTemp[1] != 0){
////                            list.remove(l);
////                        }
////                    }
//                    int xx = 0;
//                    int mulai = Integer.parseInt(arr[1]);
//                    while (xx < Integer.parseInt(arr[2])) {
//                        list.remove(mulai);
//                        xx++;
//                    }
//                    break;
//                    case "Rotate": {
//                        LinkedList<Integer> link1 = new LinkedList<>();
//                        for (int k = list.size() - 1; k >= 0; k--) {
//                            link1.add(list.get(k));
//                            list.remove(k);
//                            list.add(link1.getFirst());
//                            list.add(link1.get(k));
//                            list.removeLast();
//                        }
//                    }
//                    break;
//                    case "Add": {
//                        String add[] = x.nextLine().split(" ");
//                        int size = add.length;
//                        int[] arrTemp1 = new int[size];
//                        for (int m = 0; m < size; m++) {
//                            arrTemp1[m] = Integer.parseInt(add[m]);
//                        }
//                        list.add(arrTemp1[0], arrTemp1[1]);
//                    }
//                    break;
//                    case "Check": {
//
//                        for (int j = 0; j < list.size(); j++) {
//                            if (j + 1 != list.size()) {
//                                System.out.print(list.get(j) + " ");
//                            } else {
//                                System.out.print(list.get(j));
//                            }
//                        }
//                    }
//                    break;
//                }
//            }
//        }
//    }
//}
