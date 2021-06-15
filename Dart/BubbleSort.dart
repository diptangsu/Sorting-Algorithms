void main() {
  List<Comparable> numbers = [5, 1, 4, 2, 8];
  List<Comparable> letters = ['q', 'a', 'd', 'e', 'h'];
  show("Old Array", numbers);
  sort(numbers);
  show("New Array", numbers);
}

// bubble sort
sort(List<Comparable> a) {
  bool swapped = true;
  while (swapped) {
    // assume this is last pass over array
    swapped = false;
    for (int i = 0; i < a.length - 1; i++) {
      if (isLess(a[i + 1], a[i])) {
        // exchange a[i] and a[j]
        exchange(a, i, i + 1);
        // after an exchange, must look again
        swapped = true;
      }
    }
  }
}

bool isLess(Comparable v, Comparable w) {
  return (v.compareTo(w) < 0);
}

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
