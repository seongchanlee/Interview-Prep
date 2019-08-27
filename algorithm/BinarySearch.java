class BinarySearch {
  /*
   * https://leetcode.com/problems/binary-search/
   */
  public static void main(String[] args) {
    int[] nums = new int[]{-1,0,3,5,9,12};

    int sol1 = binarySearch(nums, 9);
    System.out.println("Position of 9 in [-1,0,3,5,9,12] is: " + sol1);

    int sol2 = binarySearch(nums, 6);
    System.out.println("Position of 9 in [-1,0,3,5,9,12] is: " + sol2);
  }

  private static int binarySearch(int[] nums, int target) {
    /*
     * Assuming the array is sorted;
     * binary search first declares low and high variables as the first element and last element
     */
    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
      // declare mid variable
      int mid = (low + high) / 2;

      if (nums[mid] < target) {
        // if nums[mid] is smaller than target, then the target must be in the later half
        low = mid + 1;
      } else if (nums[mid] > target) {
        // if nums[mid] is bigger than target, then the target must be in the first half
        high = mid - 1;
      } else {
        // if nums[mid] is target, then the target is found and we return the position
        return mid;
      }
    }

    // if not found, return -1
    return -1;
  }
}