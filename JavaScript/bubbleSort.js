let bubbleLoop = (first) => {
    if (typeof first !== "object") {
        return ["invalid list"];
    }
    var i = 0;
    for (i; i < first.length - 1; i++) {
        var k = i + 1;
        for(k; k < first.length; k++) {
            var compareFirst = first[i];
            var compareSecond = first[k];
            if (compareSecond < compareFirst) {
                first[i] = compareSecond;
                first[k] = compareFirst;
            }
            
        }
    }
    return first;
}


// Example usage:
// let list = [9,4,2,7,2,8,1];
// console.log('original list',list);
// let sorted = bubbleLoop(list);
// console.log('list sorted',sorted);
