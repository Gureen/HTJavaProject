package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Hello, user!\n" +
                "Please enter command:");

        Scanner newScan = new Scanner(System.in);
        loop:
        while (true) {

            String input = newScan.nextLine();

            switch (input) {
                case "add w":
                   Worker addNewWorker = new Worker();
                   addNewWorker.addWorker();
                   if(true){

                       System.out.print("Hello, user!\n" +
                               "Please enter command:");
                       continue;

                   }

                case "show":
                    Worker showEmployee = new Worker();
                    showEmployee.show();
                    break loop;

                case "remove":
                    System.out.print("test 3");
                    break loop;

                case "exit":
                          Worker exitCase = new Worker();
                          exitCase.exit();

                default:
                    System.out.print("Wrong input! Please use one of the following commands!\n"
                            + "add w\n" + "add m\n" + "show\n" + "remove\n" + "exit\n"
                            + "New input command:");

            }


        }
    }
        }



