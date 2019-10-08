const insertionSort = (arr = []) => {
    const len = arr.length;
    for (let i = 0; i < len; i++) {
      let el = arr[i];
      let j;
      for (j = i - 1; j >= 0 && arr[j] > el; j--)
        arr[j + 1] = arr[j];
      arr[j + 1] = el;
    }
    return arr;
  }

//Example Usage:
// let myArray = [2, 4, 1, 6, -7, 8, 5, 9, 3, 4];
// console.log(insertionSort(myArray));