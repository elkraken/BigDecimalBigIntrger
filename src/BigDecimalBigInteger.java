import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalBigInteger {
    public static void main (String [] args) {
        BigDecimal bostonCondo = new BigDecimal("1234567.8901");
        BigDecimal santaMonicaCondo = new BigDecimal("2345678.9012");
        BigDecimal dcCondo = new BigDecimal("1987654.3210");
        BigDecimal seattleCondo = new BigDecimal("2918736.5421");


        BigDecimal condoTotals = new BigDecimal("0");

        condoTotals = bostonCondo.add(santaMonicaCondo).add(dcCondo).add(seattleCondo);

        System.out.println("the total cost of the condos is : " + condoTotals + "\n");


        BigInteger bostonSalesCount = new BigInteger("1234567");
        BigInteger santaMonicaSalesTotal = new BigInteger("2345678");
        BigInteger dcSalesCount = new BigInteger("1987654");
        BigInteger seattleSalesCount = new BigInteger("2918736");

        BigInteger salesCountTotals = new BigInteger("0");

        salesCountTotals = bostonSalesCount.add(salesCountTotals).add(dcSalesCount).add(seattleSalesCount);

        System.out.println("Condo sales count total: " +salesCountTotals + "\n");

        //salesCountTotals = salesCountTotals.divde(new BigInteger("5"));
    }
}
