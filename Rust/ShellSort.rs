/// Author - Aditya Rana
/// Generic Shell Sort in rust

pub fn shell_sort<T: Ord + Copy>(arr: &mut [T]) {
    let len = arr.len();
    let mut gap = len as i32 / 2;

    while gap > 0 {
        for i in gap..len as i32 {
            let temp = arr[i as usize];
            let mut j = i;

            while j >= gap && arr[j as usize - gap as usize] > temp {
                arr.swap(j as usize, j as usize - gap as usize);
                j -= gap;
            }

            arr[j as usize] = temp;
        }
        gap /= 2;
    }
}

fn main() {
    println!("Sort numbers ascending");
    
    let mut numbers = [4, 65, 2, -31, 0, 99, 2, 83, 782, 1];
    println!("Before: {:?}", numbers);
    
    shell_sort(&mut numbers);
    println!("After:  {:?}\n", numbers);

    println!("Sort strings alphabetically");
    
    let mut strings = ["beach", "hotel", "airplane", "car", "house", "art"];
    println!("Before: {:?}", strings);
    
    shell_sort(&mut strings);
    println!("After:  {:?}\n", strings);
}