public class FindMaxConsecutive1s {
    int nums[]={1,1,0,1,1,1};
    public int findMaxConsecutiveOnes() {
        int max = 0;
        int current = 0;
        for (int i : nums) {
            if (i == 1) {
                current++;
            } else {
                if (current > max) {
                    max = current;
                }
                if (max >= nums.length / 2) {
                    return max;
                }
                current = 0;
            }
        }
        return Math.max(max, current);
    }

    public static void main(String[] args) {
        FindMaxConsecutive1s obj = new FindMaxConsecutive1s();

        System.out.println(obj.findMaxConsecutiveOnes());

    }
}
