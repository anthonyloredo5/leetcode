class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // If concatenations dont mathc, no common divisor exsts
        if (!(str1 + str2).equals(str2+ str1)) {
            return "";
        }

        // Find GCD of lengths
        int gcdlength = gcd(str1.length(), str2.length());

        // The result is the prefix of the length gcdlength
        return str1.substring(0, gcdlength);
    }

    // Euclidean algorithm for gcd
    private int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
