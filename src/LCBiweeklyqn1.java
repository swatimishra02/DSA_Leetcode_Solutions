public class LCBiweeklyqn1 {
    public static void main(String[] args) {
        int purchaseAmount = 43;
        int answer = accountBalanceAfterPurchase(purchaseAmount);
        System.out.println(answer);
    }
    static int accountBalanceAfterPurchase(int purchaseAmount) {
        int amount = 0;  // (purchaseAmount / 10) * 10;
        return Math.round(purchaseAmount / 10.0f) * 10;
    }


}


