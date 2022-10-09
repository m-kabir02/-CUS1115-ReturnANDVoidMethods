import java.util.Scanner;
public class returnAndVoidMethods {
    public static void main(String[] args)
    {
//first way is to just call it and pass the 3 values for month day and year as integers
// today is 11 2 2020 let's pass that value
// to pass you just call the name of the method and put in ( ) the values

        showDate(3,31,2021);

        // second way is to use assignment statements

        int m= 12;int d=2;int y=2020;

        //now you can pass the variable names in as the arguments

        System.out.println("I think study day is :");
        showDate(m,d,y);

        //third way is to interactively ask the user for the values;
Scanner kb=new Scanner(System.in);

System.out.println("Please tell us your birthday:");

System.out.print("Enter month as an integer:");

int myMonth=kb.nextInt();

System.out.print("Enter day as an integer:");

int myDay=kb.nextInt();

System.out.print("Enter year as an integer:");

int myYear=kb.nextInt();showDate(myMonth,myDay,myYear);

//call the showTime method with time class ends 10:30:10  as just a pass
showTime(10,30,10);

//assign hours as 9 mins as 44 and seconds as 10 for time now
int hours=9;int mins=44;int seconds=10;

showTime(hours,mins,seconds);

//interactively ask for hours mins and seconds for time you woke up.

        System.out.println("What time did you wake up:");

        System.out.print("Enter hours as an integer:");

        int h=kb.nextInt();

        System.out.print("Enter minutes as an integer:");

        int mi=kb.nextInt();

        System.out.print("Enter seconds as an integer:");

int s=kb.nextInt();
//call this method for those values
showTime(h,mi,s);

//now we want to call the return method calcArea for a passed values of 10 and 5
        System.out.println("Area is "+calcArea(10,5));

        // returns to the location of code a value
        // but in order to see it the call must be inside an output statement

        int length=15;int width=20;

        System.out.println("Area is "+calcArea(length,width));

        System.out.println("We will calculate the area of the rectangle");

        System.out.print("Enter length as an integer:");

        int l=kb.nextInt();

        System.out.print("Enter width as an integer:");

        int w=kb.nextInt();

        System.out.println("Area is "+calcArea(l,w));
        System.out.println("Volume is "+calcVolume(5,10,15));
        int length2=12;
        int width2=14;
        int height2=18;
        System.out.println("Volume is "+calcVolume(length2,width2, height2));
        System.out.print("Enter length as an integer:");

        int l2=kb.nextInt();

        System.out.print("Enter width as an integer:");

        int w2=kb.nextInt();

        System.out.print("Enter height as an integer:");

        int h2=kb.nextInt();
        System.out.print("Volume is "+calcVolume(l2,w2,h2));


    }//closes main method
    // outside of main method is where you would define any other user define methods.
    public static void showDate(int month, int day, int year)
    {
        System.out.println(month+"/"+day+"/"+year);
    }
    //create an additional void method called showTime that will take in hours mins and seconds as integers.
    // It will display the time as hours:mins:seconds
    public static void showTime(int hours, int mins, int seconds)
    {
        System.out.println(hours+":"+mins+":"+seconds);
    }
    public static int calcArea(int l, int w)
    {
        int area= l*w;return area;
    }
    public static int calcVolume(int l, int w, int h)
    {
        int Volume= l*w*h;
        return Volume;
    }
//closes main method
// outside of main method is where you would define any other user define methods

/*
3/31/2021
I think study day is :
12/2/2020
Please tell us your birthday:
Enter month as an integer:11
Enter day as an integer:19
Enter year as an integer:2002
11/19/2002
10:30:10
9:44:10
What time did you wake up:
Enter hours as an integer:09
Enter minutes as an integer:05
Enter seconds as an integer:00
9:5:0
Area is 50
Area is 300
We will calculate the area of the rectangle
Enter length as an integer:10
Enter width as an integer:5
Area is 50
Volume is 750
Volume is 3024
Enter length as an integer:10
Enter width as an integer:5
Enter height as an integer:2
Volume is 100
Process finished with exit code 0

 */



    }//closes class

