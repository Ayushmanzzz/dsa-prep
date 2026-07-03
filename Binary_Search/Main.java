package Binary_Search;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = median2SortedArrays.median2SortedArrays(nums1, nums2);

        System.out.println("The median of the two sorted arrays is: " + median);
    }
}
