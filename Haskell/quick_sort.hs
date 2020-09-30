main :: IO()
main = undefined

quickSort :: [Int] -> [Int]
quickSort [] = []
quickSort list = quickSort left_sublist
              ++ pivot_list
              ++ quickSort right_sublist
  where
    pivot :: Int
    pivot = head list

    left_sublist :: [Int]
    left_sublist = filter (<pivot) list
    pivot_list :: [Int]
    pivot_list = filter(==pivot) list
    right_sublist :: [Int]
    right_sublist = filter(>pivot) list