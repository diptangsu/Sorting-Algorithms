<?php 
    $arr = array(5,3,1,5,6,2,3);
    for($i=0;$i<count($arr);$i++){
        echo $arr[$i];
    }
    echo "-";
    $arr2 = insertionSort($arr);
    for($i=0;$i<count($arr2);$i++){
        echo $arr2[$i];
    }

    function insertionSort($arr) {
        for ($i = 1; $i < count($arr); $i++) {
            $tmp = $arr[$i];
            for ($j = $i; $j > 0; $j--) {
                if ($arr[$j - 1] > $tmp)
                    $arr[$j] = $arr[$j - 1];
                else
                    break;
            }
            $arr[$j] = $tmp;
        }
        return $arr;
    }
?>