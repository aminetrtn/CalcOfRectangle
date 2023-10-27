import java.util.Scanner;
public class RectangleArea {
    double a,b,area;
     void GetData()
    {
        System.out.println("Hello.Enter the length of the rectangle !");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        System.out.println("Hello.Enter the width of the rectangle !");
        b = sc.nextDouble();

    }
    double ComputeFiled(){
         area=a*b;
        return area;
    }
    void DisplayFields()
    {
        System.out.println(area);
    }
}
