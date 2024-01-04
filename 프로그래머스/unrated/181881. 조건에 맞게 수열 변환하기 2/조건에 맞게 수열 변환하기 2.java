class Solution {
    public int solution(int[] arr) {
        int len = arr.length;
        int count = 0;
        int x = 0;
        while (count < len)
        {
            for (int i = 0; i < len ; i++)
            {
                if (arr[i] == 0)
                    continue;
                if (arr[i] < 50 && arr[i] % 2 == 1)
                    arr[i] = arr[i] * 2 + 1;
                else if (50 <= arr[i] && arr[i] % 2 == 0)
                    arr[i] /= 2;
                else {
                    count++;
                    arr[i] = 0;
                }
            }
            x++;
        }
        return x - 1;
    }
}