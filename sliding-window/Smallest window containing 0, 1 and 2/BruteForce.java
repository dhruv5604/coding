public class BruteForce {

    public static int findSmallestWindow(String s) {
        int n = s.length();
        int smallestLen = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                String subString = s.substring(i, j+1);

                if (subString.contains("0") && subString.contains("1") && subString.contains("2")) {
                    smallestLen = Math.min(smallestLen, subString.length());
                }
            }
        }

        return smallestLen == Integer.MAX_VALUE ? -1 : smallestLen;
    }

    public static void main(String[] args) {
        String s = "01212";

        int answer = findSmallestWindow(s);

        System.out.println("Smallest window length containing 0, 1 and 2 is: " + answer);
    }
}
