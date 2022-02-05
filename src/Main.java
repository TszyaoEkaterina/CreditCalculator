public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // срок 1 год
        int term = 1;
        double paymentPerMonth = service.calculate(term);
        System.out.println("ежемесячный платёж: "+ Math.round(paymentPerMonth));

        // срок 2 года
        term = 2;
        paymentPerMonth = service.calculate(term);
        System.out.println("ежемесячный платёж: "+ Math.round(paymentPerMonth));

        // срок 3 года
        term = 3;
        paymentPerMonth = service.calculate(term);
        System.out.println("ежемесячный платёж: "+ Math.round(paymentPerMonth));
    }
}
