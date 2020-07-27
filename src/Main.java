public class Main {
    public static void main(String[] args) {
        int balance = 400;
        int newPayment = 1600;
        boolean rightPayment = true;
        if (rightPayment) {
            int amountBonus = newPayment / 100;
        } else  {
            int amountBonus = 0;
        }
        int amountBonus = newPayment / 100;
        long minLimit = newPayment;
        if (newPayment > 1000 )
        System.out.println(amountBonus);

        long amount = balance + newPayment;
                System.out.println(amount);
                long totalBalance = amount + amountBonus;
        System.out.println(totalBalance);
    }
}


