package BaiThucHanhLab4.lists;

import java.util.Scanner;

public class Student{

    String FullName;
    int Age;
    
    // input 
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho ten: ");
        FullName = sc.nextLine();
        System.out.println("nhap tuoi: ");
        Age = sc.nextInt();
    }
    
    // nhap thong tin vao(insert)
    public static void insert(Lists<Student> array,int n){
        for (int i = 0; i < n; i++) {
            Student std = new Student();
            std.input();
            array.add(std);
        }
    }
    
    //hien thi thong tin(display)
    public static void display(Lists<Student> array){
        for (int i = 0; i < array.size(); i++) {
            System.out.printf("ho ten: %s \t tuoi: %d \n",array.get(i).FullName,array.get(i).Age);
        }
    }
    
    //xoa thong tin(remove)
    public static void delete(Lists<Student> array, String Name){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ho ten can xoa: ");
        Name = scanner.nextLine();
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).FullName.equals(Name)){
                array.remove(i);
            }else{
                System.out.println("khong tim thay ten");
            }
        }
    }
    //sua thong tin(update)
    public static void update(List<Student> array,String Name){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ho ten can sua: ");
        Name = scanner.nextLine();
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).FullName.equals(Name)){
                Student std = new Student();
                std.input();
                array.set(i, std);
            }else{
                System.out.println("khong tim thay ten");
            }
        }
    }

}