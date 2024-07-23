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
/*
 * im lowkey stupid with this one will redo using a stack next time.
 * but i took the integer and made it into a string 
 * then i created an empty string that would hold the reverse of the orignial string
 * then loop through the  string backwords and add it to the empty string
 * finally check if both string equal each other if true they are palindromes otherwise false
 */
