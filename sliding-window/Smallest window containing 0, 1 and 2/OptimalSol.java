public class OptimalSol {

    public static int findSmallestWindow(String s) {

        int n = s.length();
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int[] count = new int[3];

        for (int right = 0; right < n; right++) {
            count[s.charAt(right) - '0']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                minLen = Math.min(minLen, right - left + 1);
                count[s.charAt(left) - '0']--;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }

    public static void main(String[] args) {
        String s = "01212";

        int answer = findSmallestWindow(s);
        System.out.println("Smallest window length containing 0, 1 and 2 is: " + answer);
    }
}
