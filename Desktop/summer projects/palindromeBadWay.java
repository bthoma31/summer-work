public class palindromeBadWay {
    public boolean isPalindrome(int x) {
        String number=String.valueOf(x);
        String reverse="";
        for(int i=number.length()-1;i>=0;i--){
            reverse=reverse+number.charAt(i);
        }
        if(number.equals(reverse)){
            return true;
        }
        else{
            return false;
        }
    }
}
