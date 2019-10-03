#!/usr/bin/env ruby

# Run it from a terminal as a ruby script, with space separated numbers:
# ruby MergeSort 23 12 3 99 129 482 12

array = ARGV
array.map!(&:to_i)
puts 'Your unsorted numbers'
p array

class MergeSort
  class << self
    def sort(array)
      return array if array.size <= 1

      mid = array.size / 2

      left = self.sort(array[0...mid])
      right = self.sort(array[mid...array.size])

      merge(left, right)
    end

    private

    def merge(left, right)
      result = []

      until left.empty? || right.empty?
        sorted = left[0] <= right[0] ? left : right
        result << sorted.shift
      end

      result + left + right
    end
  end
end

puts "\nNumbers sorted:"
p MergeSort.sort(array)
