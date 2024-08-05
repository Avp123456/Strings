class ShortestPath{
    public static float GetShortest(String path){
        int x=0,y=0;
        for (int i=0;i<path.length();i++){
                    char s =path.charAt(i);
                    

             if(s== 'W'){
                x--;
            }
            
            if(s== 'N'){
                y++;
            }
               
            if(s== 'E'){
                x++;
            }
            if(s=='S'){
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);

    }
    public static void main(String arg[]){
        String path = "WNEENESENNN";
        System.out.println(GetShortest(path));

    }
}