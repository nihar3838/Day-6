import java.util.Random;
public class Collectcoupons {

    public static void main(String[] args) {
        int N = 10;
        int totalRandomNumbers = collectCoupons(N);
        System.out.println("Total random numbers needed to have all distinct coupons: " + totalRandomNumbers);
    }

    public static int generateRandomCoupon(int N) {
        Random random = new Random();
        return random.nextInt(N) + 1;
    }

    public static int collectCoupons(int N) {
        boolean[] collectedCoupons = new boolean[N];
        int countCollected = 0;
        int randomNumbersCount = 0;

        while (countCollected < N) {
            int newCoupon = generateRandomCoupon(N);
            randomNumbersCount++;
            if (!collectedCoupons[newCoupon - 1]) {
                collectedCoupons[newCoupon - 1] = true;
                countCollected++;
            }
        }
        return randomNumbersCount;
    }
}
