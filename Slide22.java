package BaiThucHanhLab4;

import java.util.Scanner;
import java.util.Set;

import javax.sound.sampled.SourceDataLine;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.util.ArrayList;

public class Slide22 {
    public static void main(String[] args) {
        Set<Student> hashSet = new Set<>();
        System.out.println("nhap so luong phan tu:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Student.InsertHashSet(hashSet, number);
        Student.DisplayHashSet(hashSet);
        int choose;
        do {
            System.out.println("1. CHINH SUA");
            System.out.println("2. XOA");
            System.out.println("3. TIM KIEM");
            System.out.println("NHAP THAO TAC(1-3):");
            choose = scanner.nextInt();
        }while(choose < 1 || choose > 3);
        
        switch (choose){
            case 1 : System.out.println("nhap ho ten can sua:");
                String Name1 = scanner.nextLine();
                
                break;

            // delete
            case 2:
                System.out.println("nhap ho ten xoa");
                String Name2 = scanner.nextLine();
                
                break;

            // sreach
            case 3:
                System.out.println("nhap ho ten tim kiem");
                String Name3 = scanner.nextLine();
                break;
        }
        
    }

}