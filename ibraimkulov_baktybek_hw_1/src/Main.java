import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String NumWord;
        final int NUM=8;
        String word="number";
        NumWord=NUM+word;
        System.out.print(NumWord+" ");
        System.out.print(NUM);
        System.out.println(" "+word);
        if(NUM<0){
            System.out.println("Вы сохранили отрицательное число");
        }
        else if(NUM>0){
            System.out.println("Вы сохранили положительное число");
        }
        else{
            System.out.println("Вы сохранили ноль");
        }
        System.out.println("Введите ваше имя:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Привет, "+name+"!");
    }
}