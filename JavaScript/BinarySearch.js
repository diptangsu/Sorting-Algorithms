iterative = function (data, target){
    var start = 0;
    var end = data.length - 1;

    while (start <= end){
        var middle = Math.floor((start + end) / 2);
        if (target < data[middle]){
            end = middle - 1;
        }
        else if (target > data[middle]){
            start = middle + 1;
        }
        else {
            return true;
        }
    }
    return false;
}

recursive = function (data, target, start, end) {
    if (start > end) {
        return false;
    }
    else {
        var middle = Math.floor((start + end) / 2);
        if (target === data[middle]) {
            return true;
        } else if (target < data[middle]) {
            return recursive(data, target, start, middle - 1);
        } else {
            return recursive(data, target, middle + 1, end);
        }

    }
}

/* Test data

var data = [5,12,16,18,23,27,28,34,38,43,47,50,53,59];
var target = 39;

if (iterative(data, target)){
    console.log("True");
}
else {console.log("False");}

if (recursive(data, target, 0, data.length - 1)){
    console.log("True");
}
else {console.log("False");}
*/
