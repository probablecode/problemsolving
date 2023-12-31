import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int bnum = 1;
        int fnum = 5;
        
        while (fnum <= r)
        {
            if (l <= fnum)
                list.add(fnum);
            bnum++;
            fnum = 0;
            for (int f = 5, b = bnum; 0 < b;f *= 10, b /= 2)
                fnum += (b % 2) * f;
        }
        int len = list.size();
        int[] ans;
        if (len == 0) {
            ans = new int[1];
            ans[0] = -1;
        }
        else
        {
            ans = new int[len];
            int i = 0;
            for (int e : list)
                ans[i++] = e;
        } 
            return ans;
    }
}