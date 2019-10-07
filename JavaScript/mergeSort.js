// const myArray = [2, 4, 1, 6, -7, 8, 5, 9, 3, 4];

const mergeSort = (arr) => {
    if (arr.length <= 1) {
        return arr;
    }

    let midIdx = Math.floor(arr.length / 2);
    let left = arr.slice(0, midIdx);
    let right = arr.slice(midIdx);

    let leftSorted = mergeSort(left);
    let rightSorted = mergeSort(right);

    return merge(leftSorted, rightSorted);

};

const merge = (arr1, arr2) => {
    let merged = [];

    while (arr1.length && arr2.length) {
        if (arr1[0] < arr2[0]) {
            merged.push(arr1.shift());
        } else {
            merged.push(arr2.shift());
        }
    }

    return [...merged, ...arr1, ...arr2];
};

//example Usage:
// let myArray = [2, 4, 1, 6, -7, 8, 5, 9, 3, 4];
// console.log(mergeSort(myArray));