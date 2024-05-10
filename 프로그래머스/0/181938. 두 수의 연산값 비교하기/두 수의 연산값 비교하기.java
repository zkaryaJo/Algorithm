class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int num1 = Integer.parseInt(""+a+b);
        int mul  = 2*a*b;
        
        return Math.max(num1, mul);
    
    }
}