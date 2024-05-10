class Solution {
    public int solution(int n) {
        int answer = 0;
        return n/7+ (n%7==0?0:1);
    }
}