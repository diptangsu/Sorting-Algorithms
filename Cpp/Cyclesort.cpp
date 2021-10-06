#include <iostream>
#include <vector>

void cycleSort(std::vector<int> &arr) {
    for (int currentIndex = 0; currentIndex < arr.size() - 1; currentIndex++) {
        int item = arr[currentIndex];
        int currentIndexCopy = currentIndex;

        for (int i = currentIndex + 1; i < arr.size(); i++)
            if (arr[i] < item)
                currentIndexCopy++;
      
        if (currentIndexCopy == currentIndex)
            continue;

        while (item == arr[currentIndexCopy])
            currentIndexCopy++;

        int temp = arr[currentIndexCopy];
        arr[currentIndexCopy] = item;
        item = temp;

        while (currentIndexCopy != currentIndex) {

            currentIndexCopy = currentIndex;

            for (int i = currentIndex + 1; i < arr.size(); i++)
                if (arr[i] < item)
                    currentIndexCopy++;

            while (item == arr[currentIndexCopy])
                currentIndexCopy++;

            temp = arr[currentIndexCopy];
            arr[currentIndexCopy] = item;
            item = temp;
        }
    }
}
