public class Main {
    public static void main(String[] args) {
        // Начальное значение счета
        int account = 100;
        // Сумма пополнения
        int refill = 1050;


        boolean bonusYes = refill > 1000;
        int totalAccount = account + refill;
        if (bonusYes) {
            int bonus = refill / 100;
            totalAccount = totalAccount + bonus;
            System.out.println("Вы получаете от нас бонус " + bonus + " руб.");
            System.out.println("Сумма средств на вашем счете c учетом полученных бонусов: " + totalAccount + " руб.");
        } else {
            System.out.println("Сумма средств на вашем счете: " + totalAccount + " руб. Бонусных рублей не начислено");
        }
    }
    // Для практики с тернарным оператором

//        boolean bonusYes = refill > 1000;
//        int bonus = refill / 100;
//        int totalAccount = account + refill;
//        totalAccount = bonusYes ? totalAccount + bonus : totalAccount;
//        if (bonusYes) {
//            System.out.println("Вы получаете от нас бонус " + bonus + " руб.");
//        }
//        System.out.println("Сумма средств на вашем счете: " + totalAccount + " руб.");
//  }
}