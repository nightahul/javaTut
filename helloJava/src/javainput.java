import java.util.Scanner;

public class javainput
{
    static Scanner userinput = new Scanner(System.in);
    //static means only class can call it
    
    public static void main(String []args)
    {
        System.out.println("your favourite number ?");
        if (userinput.hasNextInt())
        {
            int x = userinput.nextInt();
            System.out.println("you entered " + x);//that's some awesome stuff
            //add string n int
                    
        }
    }
    
}