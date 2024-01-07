class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int len = rank.length;
        int rank_a = len + 1, rank_b = len + 1, rank_c = len + 1;
        int num_a = -1, num_b = -1, num_c = -1;
        for (int i = 0; i < len; i++)
        {
            if (!attendance[i])
                continue;
            if (rank[i] < rank_a)
            {
                rank_c = rank_b;
                num_c = num_b;
                rank_b = rank_a;
                num_b = num_a;
                rank_a = rank[i];
                num_a = i;
            }
            else if (rank[i] < rank_b)
            {
                rank_c = rank_b;
                num_c = num_b;
                rank_b = rank[i];
                num_b = i;
            }
            else if (rank[i] < rank_c){
                rank_c = rank[i];
                num_c = i;
            }
        }
        return num_a * 10000 + num_b * 100 + num_c;
    }
}