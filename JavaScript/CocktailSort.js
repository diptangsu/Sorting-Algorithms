const cocktailSort = (arrInput) => {
	let startIndex = 0, endIndex = arrInput.length, isSwapped = true;
	while (isSwapped) {
		isSwapped = false;
		for (let i = startIndex; i < endIndex - 1; i++) {
			if (arrInput[i] > arrInput[i + 1]) {
				let temp = arrInput[i];
				arrInput[i] = arrInput[i + 1];
				arrInput[i + 1] = temp;
				isSwapped = true;
			}
		}
		endIndex--;
		if (!isSwapped)    break;
		isSwapped = false;
		for (let i = endIndex - 1; i > startIndex; i--) {
			if (arrInput[i - 1] > arrInput[i]) {
				let temp = arrInput[i];
				arrInput[i] = arrInput[i - 1];
				arrInput[i - 1] = temp;
				isSwapped = true;
			}
		}
		startIndex++;
	}
	return arrInput;
}
//Cocktail Sort is a variatio of bubble sort.
//Example Usage : 
// let myArr = [8, 6, -4, 1, 84, 35]
// console.log(cocktailSort(myArr))
