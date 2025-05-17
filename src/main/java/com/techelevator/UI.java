package com.techelevator;

import java.util.Scanner;

public class UI {

    private Scanner input = new Scanner(System.in);
    private VendingMachine uiVendingMachine;

    public UI(VendingMachine vendingMachine) {
        this.uiVendingMachine = vendingMachine;
    }

    public int mainMenu() {

        int inputNumMainMenu = 0;

        while (true) {
            System.out.println();
            System.out.println("===========MAIN MENU===========");
            System.out.println();
            System.out.println("Please select one of these options:");
            System.out.println();
            System.out.println("(1) Display vending machine items");
            System.out.println("(2) Purchase");
            System.out.println("(5) Increase Amount of Product");
            System.out.println("(3) Exit");
            System.out.println();
            System.out.print("Type a number, then hit Enter: ");
            String userInput = input.nextLine();
            try {
                inputNumMainMenu = Integer.parseInt(userInput);
            } catch (Exception e) {
                System.out.println();
                System.out.println("INVALID INPUT. Please enter a number: 1, 2, or 3.");
                System.out.println();
            }
            if (inputNumMainMenu > 0 && inputNumMainMenu <= 5) {
                break;
            }
            System.out.println();
            System.out.println("INVALID INPUT. Please enter a number: 1, 2, 3 or 5.");
            System.out.println();
        }

        return inputNumMainMenu;
    }

    public void purchaseMenu() {

        int inputNumPurchaseMenu = 0;
        double moneyToAdd = 0;

        while (inputNumPurchaseMenu != 3) {
            System.out.println();
            System.out.println("=========PURCHASE MENU=========");
            System.out.println();
            System.out.println("Please select one of these options:");
            System.out.println();
            System.out.println("(1) Feed money");
            System.out.println("(2) Select product");
            System.out.println("(3) Finish transaction");
            System.out.println();
            System.out.println("You've got this much money in the machine: " +
                    uiVendingMachine.displayAsCurrency(uiVendingMachine.getMachineBalance()));
            System.out.println();
            System.out.print("Type a number, then hit Enter: ");
            String purchaseInput = input.nextLine();

            try {
                inputNumPurchaseMenu = Integer.parseInt(purchaseInput);
                if (inputNumPurchaseMenu > 3 || inputNumPurchaseMenu < 1) {
                    System.out.println();
                    System.out.println("INVALID INPUT. Please enter a number: 1, 2, or 3.");
                    System.out.println();
                }
                if (inputNumPurchaseMenu == 1) {
                    System.out.println();
                    System.out.println("How much money would you like to add? ($1, $2, $5, $10, or $20)");
                    System.out.println();

                    String moneyToAddStr;
                    System.out.print("Type a number, then hit Enter: ");
                    moneyToAddStr = input.nextLine();

                    try {
                        moneyToAdd += Double.parseDouble(moneyToAddStr);

                        if (moneyToAdd == 1 || moneyToAdd == 2 || moneyToAdd == 5
                                || moneyToAdd == 10 || moneyToAdd == 20) {
                            uiVendingMachine.addMoney(moneyToAdd);
                            moneyToAdd = 0;
                        } else {
                            System.out.println();
                            System.out.println("INVALID INPUT. Please enter 1, 2, 5, 10, or 20.");
                            System.out.println();
                            moneyToAdd -= moneyToAdd;
                        }

                    } catch (Exception b) {
                        System.out.println();
                        System.out.println("INVALID INPUT. Please enter 1, 2, 5, 10, or 20.");
                        System.out.println();
                    }
                }

                if (inputNumPurchaseMenu == 2) {

                    uiVendingMachine.listInventory();

                    System.out.println();
                    System.out.print("Please enter the code for the item you'd like to purchase: ");
                    String desiredItem = input.nextLine();

                    if (!uiVendingMachine.getInventory().containsKey(desiredItem)) {
                        System.out.println();
                        System.out.println("INVALID INPUT. Please try again and enter a valid item code.");
                        System.out.println();
                    } else if (uiVendingMachine.getInventory().get(desiredItem).getQuantity() == 0) {
                        System.out.println();
                        System.out.println("Sorry, that item is OUT OF STOCK. " +
                                "Please try again and select a different item.");
                        System.out.println();
                    } else {
                        if (uiVendingMachine.getMachineBalance() <
                                uiVendingMachine.getInventory().get(desiredItem).getPrice()) {
                            System.out.println();
                            System.out.println("Sorry, you haven't paid enough to purchase that item. " +
                                    "Please select a cheaper item or pay more money.");
                            System.out.println();
                        } else {
                            uiVendingMachine.transaction(desiredItem);

                            String itemType = uiVendingMachine.getInventory().get(desiredItem).getType();

                            if (itemType.equals("Candy")) {
                                System.out.println();
                                System.out.println("Munch Munch, Yum!");
                                System.out.println();
                            }
                            if (itemType.equals("Gum")) {
                                System.out.println();
                                System.out.println("Chew Chew, Yum!");
                                System.out.println();
                            }
                            if (itemType.equals("Chip")) {
                                System.out.println();
                                System.out.println("Crunch Crunch, Yum!");
                                System.out.println();
                            }
                            if (itemType.equals("Drink")) {
                                System.out.println();
                                System.out.println("Glug Glug, Yum!");
                                System.out.println();
                            }
                        }
                    }
                }

                if (inputNumPurchaseMenu == 3) {

                    double changeOwed = uiVendingMachine.roundTheDouble(uiVendingMachine.getMachineBalance());
                    System.out.println();
                    System.out.println("Your change is: " + uiVendingMachine.displayAsCurrency(changeOwed));
                    System.out.println("Here are your coins:");
                    System.out.println();

                    int[] changeArr = uiVendingMachine.getChange();
                    System.out.println(changeArr[0] + " Quarters");
                    if (changeArr[1] != 0) {
                        System.out.println(changeArr[1] + " Dimes");
                    }
                    if (changeArr[2] != 0) {
                        System.out.println(changeArr[2] + " Nickels");
                    }
                    if (changeArr[3] != 0) {
                        System.out.println(changeArr[3] + " Pennies");
                    }
                }

            } catch (Exception e) {
                System.out.println();
                System.out.println("INVALID INPUT. Please enter a number, 1, 2, or 3.");
                System.out.println();
            }
        }
    }

    public void increaseAmountofProduct() {

        int inputNumAmountofProduct = 0;

        while (inputNumAmountofProduct != 2) {
            System.out.println();
            System.out.println("===INCREASE AMOUNT OF PRODUCT===");
            System.out.println();
            System.out.println("Please select one of these options:");
            System.out.println("(1) Select product");
            System.out.println("(2) Finish action");
            System.out.println();
            System.out.print("Type a number, then hit Enter: ");
            String userInput = input.nextLine();

            try {
                inputNumAmountofProduct = Integer.parseInt(userInput);

                if (inputNumAmountofProduct < 1 || inputNumAmountofProduct > 2) {
                    System.out.println("INVALID INPUT. Please enter 1 or 2.");
                    continue;
                }

                if (inputNumAmountofProduct == 1) {
                    uiVendingMachine.listInventory();
                    
                    while (true) {
                        System.out.println();
                        System.out.print("Enter the code for the item you'd like to increase: ");
                        String productCode = input.nextLine();

                        if (!uiVendingMachine.getInventory().containsKey(productCode)) {
                            System.out.println("INVALID INPUT. Please enter a valid item code.");
                            System.out.println();
                            continue;
                        }

                        Item item = uiVendingMachine.getInventory().get(productCode);
                        int currentQty = item.getQuantity();
                        System.out.println("Current quantity of " + item.getName() + ": " + currentQty);
                        System.out.println();

                        if (currentQty == 10) {
                            System.out.println("Stock is already full. Cannot add more than 10 units.");
                            System.out.println();
                            continue;
                        }
                        
                        System.out.println();
                        System.out.print("How many units do you want to add? (Max allowed in this transaction: " + (10 - currentQty) + "): ");
                        System.out.println();
                        String amountInput = input.nextLine();

                        try {
                            int amountToAdd = Integer.parseInt(amountInput);

                            if (amountToAdd < 1 || amountToAdd > (10 - currentQty)) {
                                System.out.println("INVALID AMOUNT. You can add up to " + (10 - currentQty) + " units.");
                                System.out.println();
                            } else {
                                item.setQuantity(currentQty + amountToAdd);
                                System.out.println();
                                System.out.println("QUANTITY UPDATED! New amount of " + item.getName() + ": " + item.getQuantity());
                                System.out.println();
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("INVALID INPUT. Please enter a valid number.");
                            System.out.println();
                        }
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("INVALID INPUT. Please enter a number: 1 or 2.");
                System.out.println();
            }
        }
    } 
}
