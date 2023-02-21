package changedispenser;
import java.util.*;


public class ChangeDispenser {
    public static void main(String[] args) {
        int itemCost = 0;
        int moneyInserted = 0;
        int changeToReturn = 0;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of item: ");
        itemCost = sc.nextInt();


        System.out.println("Insert money to grab the item..");
        moneyInserted = sc.nextInt();


        if (moneyInserted < 100) {
            System.out.println("This vending machine accepts only one dollar bills. Please try to   insert one dollar..!");
        } else if (itemCost >= 25 && itemCost <= 100 && (itemCost % 5) == 0) {
            changeToReturn = moneyInserted - itemCost;
        } else {
            System.out.println("Please enter the correct cost of the item you picked...!");
        }


        If (changeToReturn > 0) {
            System.out.println("The remaining change to be returned is " + changeToReturn);
        }
    }
}