public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int newPayment = 1000;
        int amountBonus;
        boolean bonus = true;
        if (newPayment > 1000) {
            amountBonus = newPayment / 100;
        } else {
            amountBonus = 0;
        }
        System.out.println(amountBonus);

        long amount = balance + newPayment;
        System.out.println(amount);
        long totalBalance = amount + amountBonus;
        System.out.println(totalBalance);
    }
}


