import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert element !");
        int[] array;
        System.out.println("nhap so luong element");
        int size = scanner.nextInt();
        array = new int[size];
        System.out.println("nhap so can chen");
        int insertNumber = scanner.nextInt();
        System.out.println("vi tri chen");
        int viTri = scanner.nextInt();
        if((viTri <= -1) || (viTri > array.length)){
            System.out.println("khong the them vao vi tri nay");
        }else {
            array[viTri] = insertNumber;
            for (int i = 0; i < array.length; i++) {
                System.out.printf(array[i] +" ");
            }
        }
    }
}