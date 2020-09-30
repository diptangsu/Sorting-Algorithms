const insertion_sort = bucket => {
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

const bucket_sort = initial_array => {
    const num_buckets = 10
    let array = []
    for(let i=0; i < num_buckets; i++){
        array.push([])
    }

    // put array elements in respective buckets
    for(elem of initial_array){
        const bucket_index = parseInt(num_buckets * elem)
        array[bucket_index].push(elem)
    }

    // insertion sort on buckets individually
    for(let i=0; i < num_buckets; i++){
        array[i] = insertion_sort(array[i])
    }

    // concatenate the result
    let k = 0
    for(i=0; i < num_buckets; i++){
        for(elem of array[i]){
            initial_array[k] = elem
            k++
        }
    }
    return initial_array
}

const initial_array = [0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434]
const sorted_array = bucket_sort(initial_array)
console.log(sorted_array)