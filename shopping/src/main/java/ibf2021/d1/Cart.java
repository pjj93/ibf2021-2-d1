package ibf2021.d1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cart {
    private List<String> items = new ArrayList<>();
    
    public Cart() {
        System.out.println("Welcome to your shopping cart");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cart cart = new Cart();
        
        while (true) {
            String action = scan.next();
            if (action.equals("list"))
                cart.show();
            else if (action.equals("add")) {
                if (scan.hasNextLine())
                    cart.addItems(scan.nextLine().trim());
            }
            else if (action.equals("delete")) {
                if (scan.hasNextInt())
                    try {
                        cart.delete(scan.nextInt());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Incorrect item index");
                    }
                else
                    System.out.println(scan.nextLine() + " is not a valid index number");
            }
            else if (action.equals("stop"))
                break;
        }
        
        scan.close();
    }

    public void show()
    {
        if (!this.items.isEmpty()) {
            for (int i = 1; i <= this.items.size(); i++)
                System.out.println(i + ". " + this.items.get(i-1));
        }
        else
            System.out.println("Your cart is empty");

    }

    public void addItems(String s)
    {
        List<String> newItems = Arrays.asList(s.split(", "));
        for (int i = 0; i < newItems.size(); i++)
        {
            if (this.items.contains(newItems.get(i)))
                System.out.println("You have " + newItems.get(i) + " in your cart");
            else {
                this.items.add(newItems.get(i));
                System.out.println(newItems.get(i) + " added to cart");
            }
        }
    }

    public void delete(int index)
    {
        System.out.println(this.items.get(index - 1) + " removed from cart");
        this.items.remove(index-1);
    }

    public String getItem(int index)
    {
        return this.items.get(index-1);
    }
}
