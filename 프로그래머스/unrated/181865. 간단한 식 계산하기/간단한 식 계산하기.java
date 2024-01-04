class Solution {
    public int solution(String binomial) {
        String[] input = binomial.split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[2]);
        if (input[1].equals("+"))
            return a + b;
        else if (input[1].equals("-"))
            return a - b;
        else
            return a * b;
    }
}