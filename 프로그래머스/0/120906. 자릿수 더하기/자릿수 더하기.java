class Solution {
    public int solution(int n) {
        int sum = 0;
        String strNum = ""+n;
        for(int i=0; i<strNum.length(); i++)
            sum += Integer.parseInt(""+strNum.charAt(i));
        return sum;
    }
}