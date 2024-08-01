
class Solution {
    public int reverse(int x) {
        Integer x1=new Integer(x);
        char[] ch=Integer.toString(x).toCharArray();
        if(ch.length==0|| ch.length==1) return x;
        StringBuffer str=new StringBuffer();
        char[] ch1=new char[ch.length];
        int num=0;
        int a;
        if (ch[0]=='-'){
            for (int i=1; i<ch.length;i++){
                a=num*10+ch[ch.length-i]-48;
                if((a+48-ch[ch.length-i])/10!=num){
                    return 0;
                }
                num=a;
            }
            return -num;
        }else{
            for(int i=0;i<ch.length;i++){
                a=num*10+ch[ch.length-i-1]-48;
                if((a+48-ch[ch.length-i-1])/10!=num){
                    return 0;
                }
                num=a;
            }
            return num;
        }
    }
}