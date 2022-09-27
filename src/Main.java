import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SalesManager sale = new SalesManager(new long[]{50000, 60000, 456000, 34500, 2300, 120000});

        System.out.println(sale.max());
    }
}