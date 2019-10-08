const quickSort = (arry = []) => {
    if (arry.length === 0)
        return [];
    let left = [], right =[], pivot = arry[0];
    for (let i=1; i< arry.length; i++) {
        if(arry[i] < pivot)
            left.push(arry[i]);
        else
            right.push(arry[i]);
    };

    return [...quickSort(left), pivot, ...quickSort(right)];
}

//Example Usage:
// let myArray = [2, 4, 1, 6, -7, 8, 5, 9, 3, 4];
// console.log(quickSort(myArray));