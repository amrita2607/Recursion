package Main;

public class Recursion
{
    static void countdown(int num)
    {
        if(num<=0)
            return;

            System.out.println(num);
            countdown(num - 1);

    }

    public static void main(String[] args)
    {
        countdown(10);

    }


}
