class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {0, 0, 0, 0, 0, 0};
        dice[a - 1]++;
        dice[b - 1]++;
        dice[c - 1]++;
        dice[d - 1]++;
        int num1 = 0, num2 = 0, dup = 0, trip = 0; 
        for (int i = 0; i < 6; i++)
        {
            if (dice[i] == 1)
            {
                if (num2 != 0)
                   return num1;
                if (num1 != 0)
                    num2 = i + 1;
                else
                    num1 = i + 1;
            }
            else if (dice[i] == 2)
            {
                if (dup != 0) // a, a, b, b
                    return (i + 1 + dup) * (i + 1 - dup);
                dup = i + 1;
            }
            else if (dice[i] == 3)
                trip = i + 1;
            else if (dice[i] == 4) // a, a, a, a
                return 1111 * (i + 1);
        }
        if (trip == 0) // a, a, b, c
            return num1 * num2;
        else // a, a, a, c
            return (int)Math.pow(10 * trip + num1, 2);
    }
}