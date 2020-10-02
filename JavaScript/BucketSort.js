const insertionSort = bucket => {
    for(i=0; i < bucket.length; i++){
        const up = bucket[i]
        let j = i-1
        while(j >= 0 && bucket[j] > up){
            bucket[j+1] = bucket[j]
            j--
        }
        bucket[j+1] = up
    }
    return bucket
}

const bucketSort = initialArray => {
    const numBuckets = 10
    let array = []
    for(let i=0; i < numBuckets; i++){
        array.push([])
    }

    // put array elements in respective buckets
    for(elem of initialArray){
        const bucketIndex = parseInt(numBuckets * elem)
        array[bucketIndex].push(elem)
    }

    // insertion sort on buckets individually
    for(let i=0; i < numBuckets; i++){
        array[i] = insertionSort(array[i])
    }

    // concatenate the result
    let k = 0
    for(i=0; i < numBuckets; i++){
        for(elem of array[i]){
            initialArray[k] = elem
            k++
        }
    }
    return initialArray
}

const initialArray = [0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434]
const sortedArray = bucketSort(initialArray)
console.log(sortedArray)