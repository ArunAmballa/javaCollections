package Arrays;

import java.util.Arrays;
public class ArrayBasics {
    
    public static void main(String args[]){
        
        System.out.println("Array Class Methods");
        System.out.println("------------------------");

        System.out.println("Array Initialization");
        System.out.println("------------------------");

        int []marks={1,2,3,4,5,9,8,0};
        int []points=new int[10];
        points[0]=1;
        points[1]=10;
        points[2]=100;
        points[3]=1000;

        int []zeros=new int[15];
        Arrays.fill(zeros,0);


        System.out.println("Array Methods");
        System.out.println("------------------------");

        System.out.println("Sort an Array");
        Arrays.sort(marks);

        System.out.println("Printing an Array");
        System.out.println(Arrays.toString(marks));


        System.out.println("Enchanced for Loop");
        for(int mark:marks){
            System.out.println(mark);
        }

        System.out.println("Binary Search on Array");
        int index=Arrays.binarySearch(marks,8);
        System.out.println("Element 8 Found At Index "+index);

        System.out.println("Find Max of Array");
        int maxi=Arrays.stream(marks).max().getAsInt();
        System.out.println("Maximum Element "+maxi);

        System.out.println("Find Min of Array");
        int mini=Arrays.stream(marks).min().getAsInt();
        System.out.println("Minimum of Array "+mini);


        System.out.println("Sum of Array Elements");
        int sum=Arrays.stream(marks).sum();
        System.out.println("Sum of Array Elemenets "+sum);

        System.out.println("Average of Elements");
        Double average=Arrays.stream(marks).average().getAsDouble();
        System.out.println("Average Value of Array "+average);

    }
}
