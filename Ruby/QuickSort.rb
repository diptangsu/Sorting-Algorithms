#!/usr/bin/env ruby

# Run it from a terminal as a ruby script, with space separated numbers:
# ruby QuickSort 23 12 3 99 129 482 12

array = ARGV
array.map!(&:to_i)
puts 'Your unsorted numbers'
p array

class QuickSort
  class << self
    def sort(array, first, last)
      if first < last
        partitionIndex = partition(array, first, last)
        sort(array, first, partitionIndex-1)
        sort(array, partitionIndex+1, last)
      end
      return array
    end

    private

    def partition(array, first, last)
      pivot = array[last] # Pivot
      partitionIndex = first # Partition index
      for i in first...last
        if array[i] <= pivot
          array[i], array[partitionIndex] = array[partitionIndex], array[i] # Swapping
          partitionIndex += 1
        end
      end
      i += 1

      array[i], array[partitionIndex] = array[partitionIndex], array[i] # Swapping

      return partitionIndex
    end
  end
end

puts "\nNumbers sorted:"
p QuickSort.sort(array, 0, array.size-1)
