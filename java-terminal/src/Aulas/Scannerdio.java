package Aulas;

import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;


public class Scannerdio {

        public static void main(String[] args) {


            Scanner scannerd = new Scanner(System.in).useLocale(Locale.US);

            System.out.println ("Digite seu nome? ");
            String nome = scannerd.next();

            System.out.println ("Digite seu Sobrenome? ");
            String sobrenome = scannerd.next();

            System.out.println ("Digite sua idade? ");
            int idade = scannerd.nextInt();

            System.out.println ("Digite sua altura? ");
            double altura = scannerd.nextDouble();

            System.out.println("Olá, eu me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura e " + altura + "cm");


        }

    }
