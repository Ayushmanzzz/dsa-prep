public class appearOnce {
    public static int getSingleElement(int[] arr) {
        int xorr = 0;

        for (int num : arr) {
            xorr ^= num;
        }

        return xorr;
    }

}
