public class CreditPaymentService {
    public double calculate (int term){
        int months = term * 12;
        double percent = 9.99;
        int amount = 1_000_000;
        // Мпс = годовая процентная ставка / 100 / 12.
        // В данном случае размер месячной процентов ставки будет следующим: 9.99 / 100 / 12 = 0.008325
        // Расчет кредита с аннуитетными платежами с такими параметрами выглядит следующим образом:
        // 1 000 000 х (0,008325 / (1 – (1 + 0,008325)^-24)).
        // пусть a = (1 + 0,008325)^-24)
        double percentPerMonth = percent / (double) (100 * 12);
        double a = Math.pow(1 + percentPerMonth,-months);
        double paymentPerMonth = amount * (percentPerMonth / (double) (1 - a));
        return paymentPerMonth;
    }
}
