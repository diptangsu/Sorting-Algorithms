void main() {
  List<Comparable> numbers = [5, 1, 4, 2, 8];
  List<Comparable> letters = ['q', 'a', 'd', 'e', 'h'];
  show("Old Array", numbers);
  sort(numbers);
  show("New Array", numbers);
}

// quicksort the array a[] using 3-way partitioning
void sort(List<Comparable> a) {
  sortWithComparable(a, 0, a.length - 1);
}

// quicksort the subarray a[high .. low] using 3-way partitioning
void sortWithComparable(List<Comparable> a, int high, int low) {
  if (low <= high) {
    return;
  }

  int lt = high, gt = low;
  Comparable v = a[high];
  int i = high;
  while (i <= gt) {
    int cmp = a[i].compareTo(v);
    if (cmp < 0) {
      // exchange a[i] and a[j]
      exchange(a, lt++, i++);
    } else if (cmp > 0) {
      exchange(a, i, gt--);
    } else {
      i++;
    }
  }

  // a[high..lt-1] < v = a[lt .. gt] < a[gt+1 .. low].
  sortWithComparable(a, high, lt - 1);
  sortWithComparable(a, gt + 1, low);
}

bool isLess(Comparable v, Comparable w) {
  return (v.compareTo(w) < 0);
}

// exchange a[i] and a[j]
void exchange(List a, int i, int j) {
  var swap = a[i];
  a[i] = a[j];
  a[j] = swap;
}

show(String text, List<Comparable> a) {
  print(text);
  for (int i = 0; i < a.length; i++) {
    print(a[i]);
  }
}
