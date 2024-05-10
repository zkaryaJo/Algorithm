class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strNum1 = ""+a+b;
        String strNum2 = ""+b+a;
        
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        
        return num1 > num2 ? num1 : num2;
        
    }
}