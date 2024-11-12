package BaiThucHanhLab4;

import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class Student {
    String Fullname;
    int age;
        public void Input() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap ho ten: ");
            Fullname = scanner.nextLine();
            System.out.println("nhap tuoi: ");
            age = scanner.nextInt();
        }
    
        // them thong tin (Insert)
        public static void Insert(List<Student> array, int n) {
            for (int i = 0; i < n; i++) {
                Student std = new Student();
                std.Input();
                array.add(std);
            }
        }
    
        // them thong tin (InsertHashSet)
        public static void InsertHashSet(Set<Student> array, int m) {
            for (int i = 0; i < m; i++) {
                Student std = new Student();
                std.Input();
                array.add(std);
            }
        }
    
        // hien thi thong tin(Display)
        public static void Display(List<Student> array) {
            for (int i = 0; i < array.size(); i++) {
                System.out.printf("Ho ten: %s \t tuoi: %d \n", array.get(i).Fullname, array.get(i).age);
            }
        }
    
        // hien thi thong tin (DisplayHashSet)
        public static void DisplayHashSet(Set<Student> array) {
            for (Student std : array) {
                System.out.printf("Ho ten: %s \t Tuoi: %d\n", std.Fullname, std.age);
            }
        }
    
        // chinh sua thong tin (Update)
        public static void Update(List<Student> array, String Name) {
            boolean check = false;
            Scanner scanner = new Scanner(System.in);
            Name = scanner.nextLine();
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i).Fullname.equals(Name)) {
                    Student std = new Student();
                    std.Input();
                    array.set(i, std);
                    check = true;
                }
            }
            if (check = false) {
                System.out.println("khong tim thay thong tin can sua!");
            }
        }
        
        // chinh sua thong tin (UpdateHashSet)
        public static void UpdateHashset(Set<Student> array, String Name){
            boolean check = false;
            Scanner scanner = new Scanner(System.in);
            Name = scanner.nextLine();
            for (Student std : array) {
                if(std.Fullname.equals(Name)){
                    Student std1 = new Student();
                    std1.Input();
                    
                }
            }
        }
    
        // xoa thong tin (Delete)
        public static void Delete(List<Student> array, String Name1) {
            boolean check1 = false;
            Scanner scanner = new Scanner(System.in);
            Name1 = scanner.nextLine();
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i).Fullname.equals(Name1)) {
                    array.remove(i);
                    check1 = true;
                }
            }
            if (check1 = false) {
                System.out.println("khong tim thay thong tin can xoa!");
            }
        }
    
        // tim kiem thong tin(Search)
        public static void Search(List<Student> array, String Name2) {
            boolean check2 = false;
            Scanner scanner = new Scanner(System.in);
            Name2 = scanner.nextLine();
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i).Fullname.equals(Name2)) {
                    System.out.printf("Ho ten: %s \t Tuoi: %d", array.get(i).Fullname, array.get(i).age);
                    check2 = true;
                }
            }
            if (check2 = false) {
                System.out.println("khong tim thay thong tin!");
            }
        }
    
    }