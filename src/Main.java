import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner NEw_sca = new Scanner(System.in);
        String[] String_array;
        int number_of_Array, number_of_Array_Const;
        String First_char, last_char;
        int i=0;
        System.out.println("Hello, please write length of your array");
        number_of_Array = NEw_sca.nextInt();
        number_of_Array_Const = number_of_Array;
        String_array = new String[number_of_Array];
        System.out.println("Please write "+ number_of_Array + " elements in your array, please ");
        System.out.println("Please make a space between the elements of the array");
        while (i<number_of_Array){
            String_array[i] = NEw_sca.next();
            i++;
        }
        i=0;
        while(i<number_of_Array){
            System.out.print(String_array[i]+" ");
            i++;
        }
        i=0;
        System.out.println(" ");
        System.out.println("So, you write the correct array, and I wrote the reverse array");
        while(i<number_of_Array){
            First_char = String_array[i];
            last_char = String_array[number_of_Array-1];
            String_array[i] = last_char;
            String_array[number_of_Array-1]=First_char;
            i++;
            number_of_Array--;
        }
        number_of_Array = number_of_Array_Const;
        i=0;
        while(i<number_of_Array){
            System.out.print(String_array[i]+" ");
            i++;
        }
    }
}
