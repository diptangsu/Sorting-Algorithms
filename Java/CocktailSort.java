
public class CocktailSort {
    void cocktailSort(int array[]) 
    { 
        boolean swapped = true; 
        int start = 0; 
        int end = array.length; 
  
        while (swapped == true) { 
            swapped = false; 
 
            for (int i = start; i < end - 1; ++i) { 
                if (array[i] > array[i + 1]) { 
                    int temp = array[i]; 
                    array[i] = array[i + 1]; 
                    array[i + 1] = temp; 
                    swapped = true; 
                } 
            } 
  
            if (swapped == false) 
                break; 
  
            swapped = false; 
            end = end - 1; 
            
            for (int i = end - 1; i >= start; i--) { 
                if (array[i] > array[i + 1]) { 
                    int temp = array[i]; 
                    array[i] = array[i + 1]; 
                    array[i + 1] = temp; 
                    swapped = true; 
                } 
            } 

            start = start + 1; 
        } 
    } 
	
	public static void main(String[] args) { 
        CocktailSort cs = new CocktailSort(); 
        int array[] = { 5, 8, 3, 6, 4, 9, 1, 7, 2}; 
        cs.cocktailSort(array); 
        System.out.println("Sorted array :");
        
        for(int i = 0; i < array.length; i++) {
        	System.out.println(array[i] + " "); 
        } 
	} 
}
