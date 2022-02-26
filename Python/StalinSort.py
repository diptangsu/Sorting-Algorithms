def stalin_sort(lis):
    i = 0

    #  While i is less than len of lis
    while i < len(lis) - 1:

        #  If element i is bigger than next element
        #  Remove element i
        #  and decrease i by one if i is not zero
        if lis[i] > lis[i + 1]:

            del lis[i]
            if i != 0:
                i -= 1

        # Else
        # Add to i by one
        else:    i += 1


    return lis

# Driver code 
if __name__ == '__main__':
    lis = [20,0,1,188,20,100,2,10]
    print(f"Uncorrected list: {lis}")
    print(f"Corrected list: {stalin_sort(lis)}")
