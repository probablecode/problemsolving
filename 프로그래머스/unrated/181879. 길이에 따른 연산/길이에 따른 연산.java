class Solution {
    public int sumd(int[] list){
        int sum = 0;
        for (int num : list)
            sum += num;
        return sum;        
    }
    public int prod(int[] list){
        int pro = 1;
        for (int num : list)
            pro *= num;
        return pro;        
    }   
    public int solution(int[] num_list) {
        if (num_list.length <= 10)
            return prod(num_list);
        else
            return sumd(num_list);
    }
}