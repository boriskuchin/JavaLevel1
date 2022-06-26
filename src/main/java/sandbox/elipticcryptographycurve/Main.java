package sandbox.elipticcryptographycurve;
import java.math.BigInteger;


public class Main {
            public static void main(String[] args) {
                BigInteger p = new BigInteger("115792089237316195423570985008687907853269984665640564039457584007908834671663");
                BigInteger x = new BigInteger("49790390825249384486033144355916864607616083520101638681403973749255924539515");
                BigInteger y = new BigInteger("59574132161899900045862086493921015780032175291755807399284007721050341297360");
/*                BigInteger y = new BigInteger("12");
                BigInteger x = new BigInteger("12");
                BigInteger p = new BigInteger("17");*/


                System.out.println(celcEcc(x, y, p));
            }
            public static BigInteger celcEcc(BigInteger x, BigInteger y, BigInteger p) {
                return (x.pow(3).add(new BigInteger("7")).subtract(y.pow(2))).mod(p);
            }
}
