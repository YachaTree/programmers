class Solution {
    public int solution(int price) {
        double discount;

        if (price >= 500000) {
            discount = 0.20;
        } else if (price >= 300000) {
            discount = 0.10;
        } else if (price >= 100000) {
            discount = 0.05;
        } else {
            discount = 0;
        }

        int discountedPrice = (int) (price * (1 - discount));

        return discountedPrice;
    }
}