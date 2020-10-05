#Bubble Sort

sort.b <- function(x)
{
  if(!is.unsorted(x)) {stop("Vector is already sorted")}
  if(length(x)<2){stop("vector is not long enough") } 
  if ( !is.vector(x) )  { stop("parameter must be a vector") }
  if ( !is.numeric(x) ) { stop("parameter must be numeric") }
  
  n = length(x)
  v = x
  
  for(j in 1:(n-1))
  {
    for(i in 1:(n-j))
    {
      if(v[i+1]<v[i])
      {
        t = v[i+1]
        v[i+1] = v[i]
        v[i] = t    
      }
    }
  }
  print(v)
  x = v
}

#Test
x<-c(2,1,7,9,3,6,20,30,3,5,8,6,3)
sort.b(x)
