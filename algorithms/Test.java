
import javax.xml.bind.DatatypeConverter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        
        System.out.println("test E");
        
        // base64Test(); 
        // getTotalX();

    
    }








    
    private static void base64Test() {
        Base64.Decoder decoder = Base64.getDecoder();

        String s = "Rk1SACAyMAAAAAG2AAABZQGIAMUAxQEAAABWREC8AG1tYkA1AUDFYoCGAF5wYEDEAL1tX4BiASfP\n"
                + "XUCQAKZ1XECEARvaWkBxAFbwWIBQAFd9WIDGAS3hWEBBATXJWEDsAUBhWEClAB9yVkB4AVzYVUBK\n"
                + "ADx3VIB6ASnXVEDFACBxUoDmAG1uUkB/AMt9UUCwAJltUEBAAM2VUEAqANIRUICkALDsUEB/AO2D\n"
                + "UIBYAN2XT0BlABFyTkDlAMflToDXAPTjToBcAQy3ToAqALQJTkEFAL7oTUAgAHSATEAqAKCYTED3\n"
                + "ASdjSoD4ARrpSoC6ABbpSUEfAJdjSEBBALSWRIApAJyXQ0BrARXJQoAUADuBQUA1ALSVQYAfAG0H\n"
                + "QYD/AL7jQEDLAD3oP0CmAUdbP0ElAMNkOoDQAA99OUATAEF9N4EfAMFoN0DrAPrjN0EYARtmN0Aa\n"
                + "ACp4NoB9AWReNkAhATQ8NkARAHWDNQATAHqHMQAOAHqHMQBrAQ/NMQAVAF79LwAjAKgNLgAdAHiC\n"
                + "LgEaALrhLgEcARDnLQAqAKidLQEaAKThLAAYAKiUKwD1ACfuKQAA\n";

        String zhiang = "Rk1SACAyMAAAAACiAAABAAFoAMUAxQEAAAA8FQCLADpqFAClADzqFABeAEFtFAC5AEJoFAB+AETr\n"
                + "FACiAE1pFABxAGZtFADBAHzpFACsAH1nFADNAINoFABPAIpzFADLAJ/lFABSAKV1FABrAKj0FACF\n"
                + "ALhtFAC4AMlnFACnAPBqFACHAPluFACRAQTpFAC2ARhjFABtARp2FAAGAAIABgAAAAAAAAAAAAAA\n"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA==\n";

        byte[] bytes = DatatypeConverter.parseBase64Binary(zhiang);

        String s1 = byteArrayToHexStr(bytes);
        System.out.println(s1);
    }

    public static String byteArrayToHexStr(byte[] byteArray) {
        if (byteArray == null) {
            return null;
        }
        char[] hexArray = "0123456789ABCDEF".toCharArray();
        char[] hexChars = new char[byteArray.length * 2];
        for (int j = 0; j < byteArray.length; j++) {
            int v = byteArray[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

    public static int getTotalX() {

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        // 2 4
        // 16 32 96
        a.add(2);
        a.add(4);

        b.add(16);
        b.add(32);
        b.add(96);
        Collections.sort(a);
        Collections.sort(b);
        int maxA = a.get(a.size() - 1);
        int minB = b.get(0);

        int integersBetween = 0;
        intCheck: for (int i = maxA; i <= minB; i += maxA) {
            // Check if all A are a factor of i
            for (int num : a) {
                if (i % num != 0) {
                    continue intCheck;
                }
            }

            // Check if i is a factor of all B
            for (int num : b) {
                if (num % i != 0) {
                    continue intCheck;
                }
            }
            integersBetween++;
        }
        System.out.println(integersBetween);

        return integersBetween;
    }

    public void forLoopExample() {

        //
        // int count = 0;
        //
        //
        // for (int i = 0; i < 10; i++) {
        // count++;
        // System.out.println(count);
        // if (count == 5) {
        // break;
        // }
        // }
        //

        int[] x = new int[] { 2, 3, 4 };
        for (int a : x) {
            System.out.println(a);
        }

    }
}
