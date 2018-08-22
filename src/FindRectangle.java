import java.util.Scanner;

public class FindRectangle {

    private double x_point1;
    private double y_point1;
    private double x_point2;
    private double y_point2;
    private double x_point3;
    private double y_point3;
    private double x_point4;
    private double y_point4;
    private double area;

    private double x_Max;
    private double x_Min;
    private double y_Max;
    private double y_Min;

    public void enterPoint() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter coordinate x and y point one");
        x_point1 = scan.nextInt();

        //System.out.println("Enter coordinate y point one");
        y_point1 = scan.nextInt();

        System.out.println("Enter coordinate x and y point two");
        x_point2 = scan.nextInt();

        //System.out.println("Enter coordinate y point two");
        y_point2 = scan.nextInt();


        x_point3 = x_point1;
        y_point3 = y_point2;

        x_point4 = x_point2;
        y_point4 = y_point1;
    }


    public void computeArea(){
        double side1_3;
        double side1_4;

        side1_3 = searchSide(x_point1,x_point4);
        side1_4 = searchSide(y_point1, y_point3);

        area = side1_3 * side1_4;

        System.out.println( " The area of the rectangle is " + area);
        System.out.println("Side one " + side1_3 + " Side Two " + side1_4 + "\n");
    }


   public void minMax(){
        x_Max = Math.max(x_point1,x_point4);
        x_Min = Math.min(x_point1,x_point4);
        y_Max = Math.max(y_point1, y_point2);
        y_Min = Math.min(y_point1, y_point2);

    }


    public void findeAreaRectThree(FindRectangle A, FindRectangle B){

        double side_x = 0;
        double side_y = 0;
        double newArea;

        if(B.x_Min > A.x_Min && B.x_Max < A.x_Max){
            side_x = searchSide(B.x_Min, B.x_Max);
        }

        else if(A.x_Min > B.x_Min && A.x_Max < B.x_Max){
            side_x = searchSide(A.x_Min, A.x_Max);
        }

        else if(B.x_Min > A.x_Min && B.x_Min < A.x_Max){
            side_x = searchSide(B.x_Min, A.x_Max);
        }
        else if(B.x_Max > A.x_Min && B.x_Max < A.x_Max){
            side_x = searchSide(A.x_Min,B.x_Max);
        }


        if(B.y_Min > A.y_Min && B.y_Max < A.y_Max) {
            side_y = searchSide(B.y_Min, B.y_Max);
        }

        else if(A.y_Min > B.y_Min && A.y_Max < B.y_Max) {
            side_y = searchSide(A.y_Min, A.y_Max);
        }

        else if(B.y_Min > A.y_Min && B.y_Min < A.y_Max){
            side_y = searchSide(B.y_Min, A.y_Max);
        }
        else if(B.y_Max > A.y_Min && B.y_Max < A.y_Max){
            side_y = searchSide(A.y_Min, B.y_Max);
        }


        newArea = side_x * side_y;

        if(newArea == 0){
            System.out.println("Rectangles NOT intersection");
        }
        else {
            System.out.println("The area intersection of the rectangles is " + newArea);
            System.out.println("Side one " + side_x + " Side Two " + side_y);
        }
    }

        double searchSide(double a, double b){
            if((a < 0 && b < 0) || (a > 0 && b > 0)){
                return Math.abs(a - b);
            }
            else {
                return Math.abs(a) + Math.abs(b);
            }
        }
    }