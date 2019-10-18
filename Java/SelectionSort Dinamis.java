import java.util.Arrays;
import java.util.Scanner;

public class NewClass {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("");
        System.out.print("Input Range Data : ");    
        n = scan.nextInt();

        int[] data = new int[n];        
        System.out.println();
        for(int x = 0; x < n; x++)
        {
            System.out.print("Input Data "+(x+1)+" : ");
            data[x] = scan.nextInt();
        }

        System.out.println();
        System.out.print("Data Before Sorting : ");
        for(int x = 0; x < n; x++)
            System.out.print(data[x]+" ");
        
        System.out.println("\n\nProcces Selection Sort");
        for(int x = 0; x < n-1; x++){
            System.out.println("Iterasi ke-"+(x+1)+" : ");
            for(int y = 0; y < n; y++)
                System.out.print(data[y]+" ");

            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = "   No change";
            for(int y = x+1; y < n; y++){
                if(min > data[y]){
                    tukar = true;
                    index = y;
                    min = data[y];
                }
            }

            if(tukar == true){
                pesan = "   Data "+data[x]+" change with "+data[index];
                int temp = data[x];
                data[x] = data[index];
                data[index] = temp;
            }

            for(int y = 0; y < n; y++)
                System.out.print(data[y]+" ");

            System.out.println(pesan+"\n");
        }

    System.out.print("Data After Sorting : ");
        for(int x = 0; x < n; x++)
            System.out.print(data[x]+" ");

    }
}
