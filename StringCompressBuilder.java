class StringCompressBuilder{
    public static String CompressBuilder(String str){
        StringBuilder sb = new StringBuilder();
        // sb.append(str.charAt(0));
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                count++;
                i++;
        
            } 
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
                // sb +=count.toString();
                // sb.toString()= sb.toString()+ count.toString();
                // sb+=count.toString();
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str ="aaaaabbbbccc";
        System.out.println(CompressBuilder(str));
    }
}