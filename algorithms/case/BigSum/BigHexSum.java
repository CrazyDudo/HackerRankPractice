import java.math.BigInteger;

/**
 * 需求：循环发送递增APDU包（128+5），得出整个过程耗时 分析：大数字递增（128次）
 * 
 */

// APDU
// atr=3B9D13813160378031C0694D54434F5373020205
// 00A40000023F0000
// 00A4000002304000
// 00B000000040
// 00B000400010
// 00B000E00010

// 00B000000040
// 00B000400040
// 00B000800040
// 00B000C00040
// 00B001000040
// ....
// 00B01FC00040

public class BigHexSum {

    private static BigInteger bigIntegerStart;
    private static BigInteger bigIntegerEnd;

    public static void main(String[] args) {

        bigIntegerStart = new BigInteger("00B000000040", 16);
        bigIntegerEnd = new BigInteger("00B01FC00040", 16);

        // System.out.println(new BigInteger("00B000000040",16).add(new
        // BigInteger("400000",16)).toString(16));

        while (bigIntegerStart.compareTo(bigIntegerEnd) <= 0) {
            System.out.println(bigIntegerStart.toString(16).toUpperCase());
            bigSum();
        }
    }

    // 00B000000040
    // 00B000400040
    // 00B000800040
    // 00B000C00040
    // 00B001000040
    // ....
    // 00B01FC00040

    // 固定增加：0x400000
    private static void bigSum() {
        bigIntegerStart = bigIntegerStart.add(new BigInteger("400000", 16));
    }

}
