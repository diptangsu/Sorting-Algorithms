

class BozoSortAlgorithm {
	
	int  num1,num2;

    void sort(int a[]) throws Exception {
    
	boolean sorted = false;
    
	while (!sorted) {
	    int index1 = Randomize(a.length);
	    int index2 = Randomize(a.length);  
     
	    int temp = a[index2];
	    a[index2] = a[index1];
	    a[index1] = temp;
	    compex(index1, index2);
	    
	    // Is a[] sorted?
	    sorted = true;
	    for (int i = 1; i < a.length; i++)  {
		if (a[i-1] > a[i]) {
		    compex(i, i-1);
		   
		    sorted = false;
		    break;
		} 
	    }  
	} 
    }  
    
    private int Randomize( int range )  {
	
	double  rawResult;
  
	rawResult = Math.random();
	return (int) (rawResult * range);
    }
    
    private void compex(int num1, int num2)
    {
    	this.num1 = num1;
    	this.num2 = num2;
    	int temp;
    	
    		temp = num1;
    		num1 = num2;
    		num2 = temp;
    		
    	
    	
    }
}
