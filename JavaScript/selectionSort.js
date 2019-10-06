function selectionSort(arr) {
  let minIdx,
    aux,
    len = arr.length;
  for (let i = 0; i < len; i++) {
    minIdx = i;
    for (let j = i + 1; j < len; j++) {
      if (arr[j] < arr[minIdx]) {
        minIdx = j;
      }
    }
    aux = arr[i];
    arr[i] = arr[minIdx];
    arr[minIdx] = aux;
  }
  return arr;
}

// Ex. Usage
// let elements = [14,2,1,-2,8,-3,15,-5,1];
// console.log('sorted elements', selectionSort(elements))
// expected output: sorted elements [ -5, -3, -2, 1, 1, 2, 8, 14, 15 ]
