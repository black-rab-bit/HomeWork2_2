public class Main {
    public static void main(String[] args) {
        int clientAccount = 90;
        int replenishmentAmount = 800;
        // int finalCount;

        // if (replenishmentAmount > 1000){
        //    finalCount = replenishmentAmount + replenishmentAmount/100 + clientAccount;
        //} else {
        //    finalCount = replenishmentAmount + clientAccount;

        //}
        int finalCount = replenishmentAmount > 1000 ? replenishmentAmount + replenishmentAmount/100 + clientAccount : replenishmentAmount + clientAccount;
        System.out.println("Ваш счет составляет " + finalCount + " рублей");
    }
}
