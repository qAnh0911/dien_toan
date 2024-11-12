package BaiThucHanhLab4.lists;

import java.util.ArrayList;
import java.util.List;
import java.student.student.java
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Student> arrayList = new ArrayList<Student>();
        // insert
        System.out.println("nhap so luong phan tu cua danh sach:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Student.Insert(arrayList, n);
        // display
        Student.Display(arrayList);
        // lua chon thao tac
        int choose;
        do {
            System.out.println("CHON 1-3)");
            System.out.println("1. SUA DANH SACH");
            System.out.println("2. XOA 1 PHAN TU TRONG DANH SACH");
            System.out.println("3. TIM KIEM PHAN TU TRONG DANH SACH");
            choose = scanner.nextInt();
        } while (choose < 1 || choose > 3);

        switch (choose) {
            // thao tac update
            case 1:
                System.out.println("nhap ho ten can sua:");
                String Name2 = scanner.nextLine();
                Student.Update(arrayList, Name2);
                Student.Display(arrayList);
                break;
                
            // thao tac delete
            case 2:
                System.out.println("nhap ho ten can xoa:");
                String Name3 = scanner.nextLine();
                Student.Delete(arrayList, Name3);
                Student.Display(arrayList);
                break;
            // thao tax search
            case 3:
                System.out.println("nhap ho ten can tim kiem:");
                String Name4 = scanner.nextLine();
                Student.Search(arrayList, Name4);
                break;
        }

    }

}