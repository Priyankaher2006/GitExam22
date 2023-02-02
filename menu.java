import java,util.*;
class menu
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch (ch) {
            case 1:
                int add=a+b;
                System.out.println("Add= "+add);
                break;
            case 2:
                int sub=a-b;
                System.out.println("Sub= "+sub);
                break; 
            default:
                break;
        }
    }
}