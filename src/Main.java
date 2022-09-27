import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SalesManager sale = new SalesManager(new int[]{50000, 60000, 89000, 5670, 120000});

        System.out.println(sale.max());
    }
}