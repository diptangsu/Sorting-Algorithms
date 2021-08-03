void main() {
  List<Comparable> numbers = [5, 1, 4, 2, 8];
  List<Comparable> letters = ['q', 'a', 'd', 'e', 'h'];
  show("Old Array", numbers);
  sort(numbers);
  show("New Array", numbers);
}

void sort(List<Comparable> a) {
  List<Comparable> aux = new List<Comparable>(a.length);
  sortHighLow(a, aux, 0, a.length - 1);
}

// merge sort a[low..high] using auxiliary list aux[low..high]
void sortHighLow(List<Comparable> a, List<Comparable> aux, int low, int high) {
  if (high <= low) {
    return;
  }

  int mid = low + ((high - low) / 2).toInt();
  sortHighLow(a, aux, low, mid);
  sortHighLow(a, aux, mid + 1, high);
  merge(a, aux, low, mid, high);
}

// stably merge a[low..mid] with a[mid+1..high] using aux[low..high]
void merge(
    List<Comparable> a, List<Comparable> aux, int low, int mid, int high) {
  // copy to aux[]
  for (int k = low; k <= high; k++) {
    aux[k] = a[k];
  }

  // merge back to a[]
  int i = low, j = mid + 1;
  for (int k = low; k <= high; k++) {
    if (i > mid) {
      a[k] = aux[j++];
    } else if (j > high) {
      a[k] = aux[i++];
    } else if (isLess(aux[j], aux[i])) {
      a[k] = aux[j++];
    } else {
      a[k] = aux[i++];
    }
  }
}

bool isLess(Comparable v, Comparable w) {
  return (v.compareTo(w) < 0);
}

show(String text, List<Comparable> a) {
  print(text);
  for (int i = 0; i < a.length; i++) {
    print(a[i]);
  }
}
