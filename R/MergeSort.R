#Merge Sort  
merge.sort <- function(in1, in2)
{
  
  if(!is.vector(in1)) {stop("Parameter must be a vector")}
  if(!is.vector(in2)) {stop("Parameter must be a vector")}
  if(!is.numeric(in1)) {stop("Parameter must be a numeric")}
  if(!is.numeric(in2)) {stop("Parameter must be a numeric")}
  if(is.unsorted(in1)) {stop("Vectors must be sorted")}
  if(is.unsorted(in2)) {stop("Vectors must be sorted")}
  end.vector <- c()
  
  while(length(in1) > 0 && length(in2) > 0)
  {
    if(in1[1] <= in2[1])
    {
      end.vector <- c(end.vector, in1[1])
      in1 <- in1[-1]
    } 
    else
    {
      end.vector <- c(end.vector, in2[1])
      in2 <- in2[-1]
    }         
  }
  if(length(in1) > 0)
  {
    end.vector <- c(end.vector, in1)
  }
  if(length(in2) > 0) 
  {
    end.vector <- c(end.vector, in2)
  }
  end.vector
}

#Test
x<-c(1,2,3,4)
y<- c(1.5,3,5)
merge.sort(x,y)

