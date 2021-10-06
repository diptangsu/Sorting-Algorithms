/// Author - Aditya Rana
/// Generic Cocktail Sort in rust

pub fn cocktail_sort<T: Ord>(arr: &mut [T]) {
    let last = arr.len() - 1;
    loop {
        let mut swapped = false;
        for i in 0..last {
            if arr[i] > arr[i + 1] {
                arr.swap(i, i + 1);
                swapped = true;
            }
        }

        if swapped == false {
            return;
        }

        swapped = false;
        for i in (0..last - 1).rev() {
            if arr[i] > arr[i + 1] {
                arr.swap(i, i + 1);
                swapped = true;
            }
        }

        if swapped == false {
            return;
        }
    }
}

fn main() {
    println!("Sort numbers ascending");

    let mut numbers = [4, 65, 2, -31, 0, 99, 2, 83, 782, 1];
    println!("Before: {:?}", numbers);

    cocktail_sort(&mut numbers);
    println!("After:  {:?}\n", numbers);

    println!("Sort strings alphabetically");

    let mut strings = ["beach", "hotel", "airplane", "car", "house", "art"];
    println!("Before: {:?}", strings);
    
    cocktail_sort(&mut strings);
    println!("After:  {:?}\n", strings);
}