/*Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek. Do obliczenia
        pierwiastka możesz użyć istniejącej metody java.lang.Math.sqrt(). Jeśli użytkownik poda liczbę ujemną
        rzuć wyjątek java.lang.IllegalArgumentException. Obsłuż sytuację, w której użytkownik poda ciąg
        znaków, który nie jest liczbą*/

import java.util.InputMismatchException;
import java.util.Scanner;

/*public class Testowa {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę: ");
        Scanner input = new Scanner(System.in);
        double userInput = 0;
        while (true) {
            try {
                userInput = input.nextDouble();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Podaj poprawną liczbę!");
                // ignoring wrong token
                input.next();
            }
        }

        if (userInput < 0) {
            throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy z liczby rzeczywistej %.4f nie istnieje!", userInput));
        }

        System.out.print(String.format("Pierwieastek z %.4f to %.4f.", userInput, Math.sqrt(userInput)));
    }
}
/*
public class Zadanie3 {
    void wypisz(String napis){
        System.out.println(napis.length());
    }     public static void main(String[] args) throws Exception {//pkt 6
                try {//pkt 2
                 Zadanie3 ob1 = new Zadanie3();
        // ob1.wypisz("ala ma kota");
        ob1.wypisz(null);//pkt 1
         }catch (NullPointerException ex){
         ex.printStackTrace(System.out);
         ex.fillInStackTrace();//pkt 5
        // throw ex;//pkt 3
         throw new Exception(ex); // pkt 6
         }
         }
         }
    */

//zad4
public static void main(String[] args) throws MyException {
        Ciezarowy tir=new Ciezarowy();
        System.out.println(tir);
        System.out.println(tir.przyspiesz(10));