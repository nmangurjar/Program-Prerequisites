import java.util.HashSet;
import java.util.Set;

public class OTP {

    // generate a 6-digit OTP number
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000; // Generates a random number between 100000 and 999999
    }

    // check if all OTPs in the array are unique
    public static boolean areUniqueOTPs(int[] otps) {
        Set<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueOTPs.add(otp)) {
                return false; // Duplicate found
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Print generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check if all OTPs are unique
        boolean unique = areUniqueOTPs(otps);

        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}
