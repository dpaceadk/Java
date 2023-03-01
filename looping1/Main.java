public class Main{
    public static void main(String[] args){
        //int[] x={10,20,30};
        int[][] y = {{10,20,30,50},
        {20,90,100,60},
        {50,30,40,70}};
        //System.out.println(x[1]);
        //for(int i=0; i<3;i++){
            //System.out.println(x[i]);
       // }
       for (int i=0; i<y.length;i++){
        //System.out.println("looping in row");
        for(int j=0; j<y[i].length; j++){
            System.out.println(y[i][j]);
        }
       }
    }
}