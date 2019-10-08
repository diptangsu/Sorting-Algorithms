const countingSort = (list = []) => {
    let i
    let z = 0
    const min = Math.min(...list)
    const max = Math.max(...list)
    const count = []
    for (i = min; i <= max; i++)
        count[i] = 0
    for (i=0; i < list.length; i++)
        count[list[i]]++
    for (i = min; i <= max; i++) {
        while (count[i]-- > 0)
            list[z++] = i
    }
    return list
}

//Example Usage:
// let myArray = [2, 4, 1, 6, -7, 8, 5, 9, 3, 4];
// console.log(countingSort(myArray));