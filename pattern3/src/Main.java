public class Main {
    public static void main(String[] args) {
        int i ,j;
        for(i=1;i<=100;i++)
        {
            for(j=100;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}