package se.lexicon;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Welcome to Array world!
 */
public class App {
    public static void main( String[] args ) {

        //Write a program which will store elements in an array of type ‘int’ and print it out.  Expected output: 11 23 39 etc.
        Scanner sc= new Scanner(System.in);
        int length=0;
        System.out.println("How many elements you want to store in an array");
        length=sc.nextInt();

        int[] firstarray = new int[length];

        for(int i=0;i<length;i++)
            firstarray[i]=sc.nextInt();
        System.out.print("The elements you entered are ");
        for(int i=0;i<length;i++)                              //The number of elements are : 11 23 39.
            System.out.print(firstarray[i]+ " ");

        /*
         Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
         If the element doesn’t exist your method should return -1 as value.
         Expected output: Index position of number 5 is: 2
        */

        int[] secondarray = new int[] {11,22,33,44,55};
        System.out.println("[11,22,33,44,55]");                          // exampel of a given array // [23,  12, 43,  66,  50]
        System.out.println("Enter the element which you want to see the index ");     // the indexes are [ 0   1   2     3    4]
        int element=sc.nextInt();                                                     // If the user ask for 50, output  4
        int index= CallM.indexOf(secondarray,element);
        if(index== -1)
            System.out.println("There is no such element in the array");
        else
            System.out.println("The index of the element is " + index);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        /*
     Write a program which will sort string array.
    Expected output:
    String array:      [Paris, London, New York, Stockholm]
    Sort string array: [London, New York, Paris, Stockholm]
*/

        System.out.println("The elements before sorting are");
        String Inputstring= "Paris,London,New York,Stockholm";
        String[] sortedArray = Inputstring.split(",");
        for(int i=0;i<sortedArray.length;i++)
            System.out.print(sortedArray[i] + " ");
        System.out.println("\n");
//  System.out.println(Arrays.toString(sortedArray));                   //Sort arrays
        System.out.println("The elements after sorting are");
        for(int i=0;i<sortedArray.length;i++)
            System.out.print(sortedArray[i] + " ");
        /*
     Write a program which will copy the elements of one array into another array.
     Expected output: Elements from first array: 1 15 20
     Elements from second array: 1 15 20
        */

        int[] sourcearray = new int[] {11,22,33,44,55};
        System.out.println("\n");
        System.out.print("The elements of source array are " );
        System.out.println(Arrays.toString(sourcearray));

        int[] targetarray = new int[5];
        System.out.print("The elements of target array before copying elements are " );
        System.out.println(Arrays.toString(targetarray));

        for(int i=0; i<sourcearray.length;i++)             //Copy array elements
            targetarray[i]=sourcearray[i];
        System.out.print("The elements of source array are " );
        System.out.println(Arrays.toString(targetarray));

        /*
     Create a two-dimensional string array [2][2].
     Assign values to the 2d array containing any Country and City.
     Expected output:  France  Paris
                   Sweden  Stockholm
*/

        String [][] twodimension = {{"France","Paris"}, {"Sweden","Stockholm"}};

        for(int i=0;i<twodimension.length;i++)
        {
            System.out.println("\n");
            for(int j=0;j<twodimension.length;j++)
                System.out.print(twodimension[i][j]+"  ");
        }
        System.out.println("\n");

        /*
     Write a program which will set up an array to hold the next
     values in this order: 43, 5, 23, 17, 2, 14 and
     print the average of these 6 numbers.
     Expected output: Average is: 17.3
      */

        float[] averarray = {43,5,23,17,2,14};
        float average=0;
        for(int i=0;i<averarray.length;i++)
            average= average + averarray[i];
        System.out.println("Average is " + average/6);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

/*
     Write a program which will set up an array to hold 10 numbers and
     print out only the uneven numbers.
     Expected output: Array: 1 2 4 7 9 12 Odd Array: 1 7 9
*/
        int[] given = {1,2,4,7,9,12};
        int[] uneven= new int[5];

        for(int i=0;i<uneven.length;i++)
        {
            if ((given[i]%2)!=0)
                uneven[i]=given[i];
        }
        System.out.print("The uneven elements are  : ");
        for(int i=0;i<uneven.length;i++)
            if(uneven[i]!=0)
                System.out.print(uneven[i]+ " ");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        /*
    Write a program which will remove the duplicate elements of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50].
    Expected output:                 Array: 20 20 40 20 30 40 50 60 50
    Array without duplicate values: 20 40 30 50 60
*/
        int[] givenarr = {20, 20, 40,20, 30, 20, 50, 60, 50};
        int compare;
        for(int i=0;i<9;i++) {
            int engång=0;

            for (int j = 0; j < 8; j++)
            {
                compare = givenarr[i];
                if (compare == givenarr[j + 1])
                {
                    if(engång<1)
                        givenarr[j + 1] = givenarr[i];
                    else
                        givenarr[j+1]=0;
                    engång++;
                }
            }
        }
        System.out.println(Arrays.toString(givenarr));
        System.out.print("The non-duplicate elements are : ");
        for(int i=0;i<givenarr.length;i++)
            if(givenarr[i]!=0)
                System.out.print(givenarr[i]+ " ");

     /*
    Write a method which will add elements in an array.
    Remember that arrays are fixed in size so you need to come up with a solution to “expand” the array.
*/
        System.out.println("Solution 9. Write a method which will add elements in an array.  Remember that arrays are fixed in size so you need to come up with a solution to “expand” the array");
        Scanner sc3= new Scanner(System.in);
        int newlength5=0;
        System.out.println("How many elements you want to store in an array");
        newlength5=sc3.nextInt();

        int[] newarray3 = new int[newlength5];
        // int[] newarray5 = new int[0];

        for(int i=0;i<newlength5;i++)
            newarray3[i]=sc3.nextInt();
        System.out.print("The elements you entered are ");

        for(int i=0;i<newlength5;i++)
            System.out.print(newarray3[i]+ " ");

        System.out.println("Enter the element to add");
        int newelement=sc3.nextInt();
        int[] newarray5=CallM.add(newarray3,newelement);

        for(int i=0;i<newlength5+1;i++)
      /*
     Write a program which will represent multiplication table stored in multidimensional array.
     We have two-dimensional array with values  [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
       */

        System.out.println("Solution 10. Write a program which will represent multiplication table stored in multidimensional array.  \n");
        System.out.println("Output of a program which will represent multiplication table stored in multidimensional array.");
        int[] adimension= new int[11];
        for(int i=1;i<11;i++)
        {
            System.out.print("\n");
            for(int j=1;j<11;j++)
                if((i*j)<10)
                    System.out.print(adimension[j]+ i*j+"   ");
                else
                    System.out.print(adimension[j]+ i*j+"  ");
        }
        System.out.println("\n");

        /*
     Write a program that ask the user for an integer and repeat that question until user give you a specific value
     that user already has been told about as a message in your program. Store these values in an array and print that array.
     After that reverse the array elements so that the first element becomes the last element, the second element becomes the second to last element, etc.
     Do not just reverse the order in which they are printed. You need to change the way they are stored in the array
*/

        System.out.println("Write a program that ask the user for an integer and repeat that question until user give you a specific value that user already has been told about as a message in your program. Store these values in an array and print that array. After that reverse the array elements so that the first element becomes the last element, the second element becomes the second to last element, etc. Do not just reverse the order in which they are printed. You need to change the way they are stored in the array.  \n" +               " ");
        sc = new Scanner(System.in);
        int newlength=0;
        System.out.println("How many elements you want to store in an array");
        newlength=sc.nextInt();

        int[] newarray = new int[newlength];
        int[] newarray1 = new int[newlength];
        for(int i=0;i<newlength;i++)
            newarray[i]=sc.nextInt();
        System.out.print("The elements you entered are ");

        for(int i=0;i<newlength;i++)
            System.out.print(newarray[i]+ " ");
        System.out.println("\n");
        int num=newlength;
        System.out.println("Reverse is \n");
        for(int i=0;i < newlength;i++)
        {
            num--;
            newarray1[i]=newarray[num];
            System.out.print(newarray1[i]+" ");
        }
        System.out.println("\n");

        /*
        Write a program which will print the diagonal elements of twodimensional array.
        Expected output: 1 4 9

         */
        System.out.println(" Write a program which will print the diagonal elements of twodimensional array.");
        int[] printDiagonal = new int[11];
        for(int i=1;i<4;i++)
        {
            System.out.print("\n");
            for(int j=1;j<4;j++)
                System.out.print(printDiagonal[j]+ i*j+"   ");
        }
        System.out.println("\n");
        System.out.println("The diagonal elements are ");
        for(int i=1;i<4;i++)
        {
            for(int j=1;j<4;j++) {
                if(i==j)
                    System.out.print(printDiagonal[j] + i * j + "   ");

            }
        }
        System.out.println("\n");
        System.out.println("\n");

        /*
    Create two arrays with arbitrary size and fill one with random numbers. Then copy over the numbers from the array with random numbers
    so that the even numbers are located in the rear (the right side) part of the array and
    the odd numbers are located in the front part (the left side).
*/
        System.out.println("Solution Create two arrays with arbitrary size and fill one with random numbers. Then copy over the numbers from the array with random numbers so that the even numbers are located in the rear (the right side) part of the array and the odd numbers are located in the front part (the left side).");

        //Expected output: Array: 1 2 4 7 9 12 Odd Array: 1 7 9
        // int[] source = {1,2,3,7,9,12};
        //int[] target= new int[6];

        Random randomnumber;
        int arraylength;
        int var1;
        try (Scanner sctarget = new Scanner(System.in)) {
            randomnumber = new Random();
            arraylength = 0;

            System.out.println("How many elements you want to store in an array");
            arraylength = sctarget.nextInt();
        }

        int[] source = new int[arraylength];

        for(int i=0; i<arraylength;i++) {


            var1=randomnumber.nextInt(1000);
            source[i] =var1;
        }

        System.out.println("The random numbers generated are  : ");
        for(int i=0;i<source.length;i++)
            System.out.print(source[i]+ " ");
        System.out.println("\n");

        int[] target= new int[arraylength];

        int right=arraylength-1;
        int left=0;

        for(int i=0;i<source.length;i++)
        {
            if ((source[i]%2)==0) {
                target[right] = source[i];
                right--;
            }
            else
            {
                target[left]=source[i];
                left++;
            }
        }

        System.out.println("The output(Even number on the right and Odd numbers on the left side is shown) is  : ");
        for(int i=0;i<target.length;i++)
            if(target[i]!=0)
                System.out.print(target[i]+ " ");
        System.out.println("\n");
        System.out.println("\n");

    }
}
