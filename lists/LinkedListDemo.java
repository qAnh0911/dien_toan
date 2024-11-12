package BaiThucHanhLab4.lists;

import java.util.Scanner;

public class LinkedListDemo {
    
    public static void main(String[] args) {
        Lists<Student> linkedList = new LinkedList<Student>();
        System.out.println("NHAP SO PHAN TU:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Student.Insert(linkedList, number);
        Student.Display(linkedList);
        int choose;
        do {
            System.out.println("1. CHINH SUA");
            System.out.println("2. XOA");
            System.out.println("3. TIM KIEM");
            System.out.println("NHAP THAO TAC(1-3):");
            choose = scanner.nextInt();
        } while (choose < 1 || choose > 3);

        switch (choose) {
            //  update
            case 1:
                System.out.println("nhap ho ten can sua:");
                String Name1 = scanner.nextLine();
                Student.Update(linkedList, Name1);
                Student.Display(linkedList);
                break;

            // delete
            case 2:
                System.out.println("nhap ho ten xoa");
                String Name2 = scanner.nextLine();
                Student.Delete(linkedList, Name2);
                Student.Display(linkedList);
                break;

            // sreach
            case 3:
                Student.Display(linkedList);
                System.out.println("nhap ho ten tim kiem");
                String Name3 = scanner.nextLine();
                Student.Search(linkedList, Name3);
                break;
        }

    }

}
