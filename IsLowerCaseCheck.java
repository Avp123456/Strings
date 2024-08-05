class IsLowerCaseCheck{

    public static int LowerCase(String str){
        int count=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (Character.isLowerCase(ch)){
                count++;
            }
          

        }
        return count;
    }
    public static void main(String[] args){
        String str ="I am happY today";
        System.out.println(LowerCase(str));


    }
}