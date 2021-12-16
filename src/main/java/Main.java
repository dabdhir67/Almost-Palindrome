public class Main {
    public static void main(String[] args){
        System.out.println(AlmostPalindrome("abcdcbg"));
        System.out.println(AlmostPalindrome("abccia"));
        System.out.println(AlmostPalindrome("abcdaaa"));
        System.out.println(AlmostPalindrome("1234312"));
    }

    public static boolean AlmostPalindrome(String str){
        int count = 0;
        char[] chars = str.toCharArray();
        int strlength = str.length();
        for(int i=0; i< strlength/2; i++){
            if(chars[i] != chars[strlength-(i+1)]){
                count ++;
            }
        }
        if(count == 1){
            return true;
        }
        return false;
    }
}
