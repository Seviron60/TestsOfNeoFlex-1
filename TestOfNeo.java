package Tests;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestOfNeo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 0 до 10000: ");
        int numb = in.nextInt(); //Вводим число с клавиатуры
        if (0<numb && 10000<numb)  {System.out.println("Введите корректное число!");
            System.exit(1);}

        String Sixteen = "0123456789ABCDEF"; //Составляем 16-ричную систему
        List<Character> Answer = new ArrayList<>();
        int i = 0;
        int numb16=numb; // Вводим переменную для перевода в 16-ричную
        int numbdv=numb; // Вводим переменную для перевода в 2-ичную

        while (numb16 > 16) {
            int numb1 = numb16 / 16;
            int numb2 = numb16 % 16;
            numb16 = numb1;
            Answer.add(i, Sixteen.charAt(numb2));
            i++; //проводим деление и присваивание членам стринга значения намб 2
        }
        Answer.add(i, Sixteen.charAt(numb16)); //намб16 меньше 16? заносим его в последний член
        System.out.print("Введенное число в 16-ричной системе: ");
        for (int j = Answer.size() - 1; j >= 0; j--) {
            System.out.print(Answer.get(j));
        } //перевернули занесенные значения по намб 2 и получили верный ответ
        System.out.println();
        List<Integer> Answer2 = new ArrayList<>(); //по такому же принципу играем в 2-ичной системе
        int k = 0;

        while (numbdv >= 2) {
            int numb3 = numbdv / 2;
            int numb4 = numbdv % 2;
            numbdv = numb3;
            Answer2.add(k,numb4);
            k++;
        }
        Answer2.add(k, numbdv);
        System.out.print("Введенное число в 2-чной системе: ");
        for (int f = Answer2.size() - 1; f >= 0; f--) {
            System.out.print(Answer2.get(f));


        }
    }}