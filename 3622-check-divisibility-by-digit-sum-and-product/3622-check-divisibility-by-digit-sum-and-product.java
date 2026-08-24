class Solution {
    public boolean checkDivisibility(int n) {
        int og=n;
        int sum=0;
        int pro=1;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            pro=pro*digit;
            n=n/10;
        }
        return og%(sum+pro)==0;
    }
}