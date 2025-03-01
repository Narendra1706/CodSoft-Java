import java.util.Scanner;

class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rateUSDToINR = 83.2;  // Example rate, you can fetch real-time data from an API
        double rateUSDToEUR = 0.92;
        System.out.println("Choose currency to convert from (1: USD, 2: INR): ");
        int from = sc.nextInt();
        System.out.println("Choose currency to convert to (1: USD, 2: INR, 3: EUR): ");
        int to = sc.nextInt();
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        double converted = 0;
        if (from == 1 && to == 2) converted = amount * rateUSDToINR;
        else if (from == 1 && to == 3) converted = amount * rateUSDToEUR;
        else if (from == 2 && to == 1) converted = amount / rateUSDToINR;
        else System.out.println("Invalid selection!");

        System.out.println("Converted Amount: " + converted);
        sc.close();
    }
}