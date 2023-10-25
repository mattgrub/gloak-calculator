import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class gloakv2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Glen Oak Tip Calcuator");
        System.out.println("****by matt gruber****");
        System.out.println("-----------------------");
        Scanner sc = new Scanner(System.in);

       
        Map<String, Double> employees = new HashMap<>();

 
        while (true) {
            System.out.println("Enter employee name (or 'done' to finish): ");
            String name = sc.next();
            if (name.toLowerCase().equals("done")) {
                break;
            }
            System.out.println("Enter " +  name + "'s hours: ");
            double hours = sc.nextDouble();
            employees.put(name, hours);
        }


        double totalHours = 0;
        for (double hours : employees.values()) {
            totalHours += hours;
        }


        System.out.println("Enter the total amount of cash earned: ");
        double cash = sc.nextDouble();


        for (Map.Entry<String, Double> entry : employees.entrySet()) {
            String name = entry.getKey();
            double hours = entry.getValue();
            double share = (hours / totalHours) * cash;
            System.out.println(name + ": $" + share);
        }
    }
}
