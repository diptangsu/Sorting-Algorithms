void main() {
  List<Comparable> numbers = [5, 1, 4, 2, 8];
  List<Comparable> letters = ['q', 'a', 'd', 'e', 'h'];
  show("Old Array", numbers);
  sort(numbers);
  show("New Array", numbers);
}

// Selection Sort
void sort(List<Comparable> a) {
  int N = a.length;
  for (int i = 0; i < N; i++) {
    int min = i;
    for (int j = i + 1; j < N; j++) {
      if (isLess(a[j], a[min])) {
        min = j;
      }
    }
    // exchange a[i] and a[j]
    exchange(a, i, min);
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
