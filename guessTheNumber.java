//Greetings User! Code by itsmenicky ;)

import java.util.Random;
import java.io.IOException;
import java.util.Scanner;

public class guessTheNumber{
  public static void clearConsole() throws IOException, InterruptedException{
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
  }
  public static final String blue = "\u001B[34m";
  public static final String red = "\u001b[31m";
  public static final String green = "\u001b[32m";
  public static final String yellow = "\u001b[33m";
  public static final String reset = "\u001b[0m";

  public static void main(String[]args) throws IOException, InterruptedException{
  Scanner input = new Scanner(System.in);
  Random generator = new Random();
  clearConsole();

  System.out.print(red + "\n |*" + "****************************************" + red + "*| " + reset);
  System.out.print(red + "\n |* " + "                                      " + red + " *| " + reset);
  System.out.print(red + "\n |* " + reset);
  System.out.print(blue + "Bem vindo ao Adivinhe o Número!!!!!!!!!" + red + "*| " + reset);
  System.out.print(red + "\n |* " + "                                      " + red + " *| " + reset);
  System.out.print(red + "\n |*" + "****************************************" + red + "*| " + reset);
  Thread.sleep(2000);
  clearConsole();
  int guess = 0;
  int number = generator.nextInt(101);
  
  while (guess != number){
      clearConsole();
      System.out.println(blue + "Insira um número positivo entre 0 e 100 -> " + reset);
      guess = input.nextInt();

      if(guess < 0 || guess >100){
            System.out.println(red + "Insira SOMENTE números entre 0 e 100" + reset);
            Thread.sleep(2000);
            continue;
      }else if(guess > number){
            System.out.println(yellow + "...é menor..." + reset);
            Thread.sleep(2000);
            continue;
      }else if(guess < number){
            System.out.println(yellow + "...é maior..." + reset);
            Thread.sleep(2000);
            continue;
      }else{
            System.out.print(green + "Você ganhou!!" + reset);
            Thread.sleep(2000);
            System.out.print(blue + "Deseja jogar novamente? (s/n) -> " + reset);
            String option = input.next();
            switch(option){
              case "s":
                number = generator.nextInt(101);
                continue;
              case "n":
                System.exit(0);
                input.close();
              default:
                System.out.print(red + "Resposta Invalida!!" + reset);
                Thread.sleep(2000);
                System.exit(0);
                input.close();
            }
      }
      }
  }
}