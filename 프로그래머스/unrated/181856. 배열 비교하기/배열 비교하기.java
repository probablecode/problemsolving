class Solution {
    public int sum (int[] arr)
    {
        int sum = 0;
        for (int num : arr)
            sum += num;
        return sum;
    }
    public int solution(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        if (len1 == len2)
        {
            int sum1 = sum(arr1);
            int sum2 = sum(arr2);
            return (sum1 < sum2 ? -1 : (sum1 == sum2 ? 0 : 1));
        }
        return len1 < len2 ? -1 : 1;
    }
}