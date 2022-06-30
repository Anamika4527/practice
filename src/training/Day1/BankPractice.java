package training.Day1;

public class BankPractice {
    public static void main(String[] args){

        int a = 5;
        int b = 2;

        int c =addTwoNumbers(a,b);
        // int c = a+b;
        System.out.println(c);

        int d = 5;
        int e = 5;

        int f = addTwoNumbers(d,e);
        //int f = d+e;
        System.out.println(f);

        int g = 5;
        int h = 10;

        int i = addTwoNumbers(g,h);
        //int i = g+h;
        System.out.println(i);

    }

    public static int addTwoNumbers(int a, int b)
    {
        int temp = a+b;
        return temp;
        //System.out.println(temp);
    }
}
