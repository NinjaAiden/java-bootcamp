import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[4];

        for (int i = 0; i < price.length; i++) {
            afterTax[i] = (price[i] / 100) * 13 + price[i]; // add 13% tax to price and add to new array
        }

        System.out.println("The original prices are: " + Arrays.toString(price));
        System.out.println("The prices after tax are: " + Arrays.toString(afterTax));
    }
}
