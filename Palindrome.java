class Palindrome{
    public static void main(String arg[]){
    System.out.println(CheckPalindrome("noon"));

    }
    public static boolean CheckPalindrome(String str){
        for (int i=0;i<(str.length())/2;i++){
            int n= str.length();
                if (str.charAt(i)!=str.charAt(n-1-i)){
                    return false;
        }
    }
    return true;
    }
    
}