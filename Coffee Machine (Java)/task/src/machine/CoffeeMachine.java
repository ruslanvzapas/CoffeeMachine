package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int hasCups = 9;
    static int hasWater = 400;
    static int hasMilk = 540;
    static int hasCoffeeBeans = 120;
    static int hasMoney = 550;
    static boolean exit = true;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (exit) {
            menu();
        }
    }

    public static void machineHas() {
        System.out.printf("The coffee machine has:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n" +
                "%d disposable cups\n" +
                "$%d of money\n", hasWater, hasMilk, hasCoffeeBeans, hasCups, hasMoney);
        System.out.println();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        povtor:
        {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.next();
            switch (action) {
                case "buy":
                    actionBuy();
                    break;
                case "fill":
                    actionFill();
                    break;
                case "take":
                    actionTake();
                    break;
                case "remaining":
                    machineHas();
                    break;
                case "exit":
                    exit = false;
                    break;
                default:
                    break povtor;

            }
        }
    }

    public static void actionBuy() {
        Scanner scanner = new Scanner(System.in);
        int espressoWater = 250;
        int espressoCoffeeBeans = 16;
        int latteWater = 350;
        int latteMilk = 75;
        int latteCoffeeBeans = 20;
        int cappuccinoWater = 200;
        int cappuccinoMilk = 100;
        int cappuccinoCoffeeBeans = 12;
        povtor:
        {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: :");
            String choice = scanner.next();
            System.out.println();
            switch (choice) {
                case "1":
                    if (hasWater < espressoWater) {
                        System.out.println("Sorry, not enough water!");
                    } else if (hasCoffeeBeans < espressoCoffeeBeans) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (hasCups < 1) {
                        System.out.println("Sorry, not enough cups!");
                    } else {
                        hasWater -= 250;
                        hasCoffeeBeans -= 16;
                        hasMoney += 4;
                        hasCups--;
                        printThatHaveRes();
                    }
                    break;
                case "2":
                    if (hasWater < cappuccinoWater) {
                        System.out.println("Sorry, not enough water!");
                    } else if (hasMilk < cappuccinoMilk) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (hasCoffeeBeans < cappuccinoCoffeeBeans) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (hasCups < 1) {
                        System.out.println("Sorry, not enough cups!");
                    } else {
                        hasWater -= 350;
                        hasMilk -= 75;
                        hasCoffeeBeans -= 20;
                        hasMoney += 7;
                        hasCups--;
                        printThatHaveRes();
                    }
                    break;
                case "3":
                    if (hasWater < latteWater) {
                        System.out.println("Sorry, not enough water!");
                    } else if (hasMilk < latteMilk) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (hasCoffeeBeans < latteCoffeeBeans) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (hasCups < 1) {
                        System.out.println("Sorry, not enough cups!");
                    } else {
                        hasWater -= 200;
                        hasMilk -= 100;
                        hasCoffeeBeans -= 12;
                        hasMoney += 6;
                        hasCups--;
                        printThatHaveRes();
                    }
                    break;
                case "back":
                    menu();
                    break;
                default:
                    break povtor;
            }
        }
    }

    public static void actionFill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        hasWater += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        hasMilk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        hasCoffeeBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        hasCups += scanner.nextInt();
        System.out.println();
    }

    public static void actionTake() {
        System.out.printf("I gave you $%d", hasMoney);
        hasMoney = 0;
        System.out.println();
    }

    public static void printThatHaveRes() {
        System.out.println("I have enough resources, making you a coffee!");
    }
}