/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex23;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String answer = in.nextLine();

        if (answer.compareTo("y") == 0) {
            System.out.print("Are the battery terminals corroded? ");
            answer = in.nextLine();

            if (answer.compareTo("y") == 0) {
                System.out.print("Clean terminals and try starting again.");
            } else
                System.out.print("Replace cables and try again.");

        } else {
            System.out.print("Does the car make a slicking noise? ");
            answer = in.nextLine();

            if (answer.compareTo("y") == 0) {
                System.out.print("Replace the battery.");
            } else {
                System.out.print("Does the car crank up but fail to start? ");
                answer = in.nextLine();

                if (answer.compareTo("y") == 0) {
                    System.out.print("Check the spark plug connections.");
                }else {
                    System.out.print("Does the engine start and then die? ");
                    answer = in.nextLine();

                    if (answer.compareTo("y") == 0) {
                        System.out.print("Does the car have fuel injection? ");
                        answer = in.nextLine();

                        if (answer.compareTo("y") == 0) {
                            System.out.print("Get it in for service. ");
                        }else{
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }else
                        System.out.print("This should not be possible.");
                }

                }
            }
        }
    }