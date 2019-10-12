#!/usr/bin/env ruby

# Run from a terminal as a Ruby script, with space separated numbers:
# ruby BubbleSort 23 12 3 99 129 482 12

array = ARGV
array.map!(&:to_i)
puts 'Your unsorted numbers'
p array

class BubbleSort
  class << self
    def sort(array)
      return array if array.size <= 1
      swap = true
      while swap
        swap = false
        (array.length - 1).times do |x|
          if array[x] > array[x+1]
            array[x], array[x+1] = array[x+1], array[x]
            swap = true
          end
        end
      end
      array
    end
  end
end

puts "\nNumbers sorted:"
p BubbleSort.sort(array)
