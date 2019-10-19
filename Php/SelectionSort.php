<?php 
    $arr = array(5,3,1,5,6,2,3);
    for($i=0;$i<count($arr);$i++){
        echo $arr[$i];
    }
    echo "-";
    $arr2 = selectionSort($arr);
    for($i=0;$i<count($arr2);$i++){
        echo $arr2[$i];
    }

    function selectionSort($arr){
        for($i = 0; $i< count($arr);$i++){
            $pos = $i;
            for ($j = $i + 1; $j < count($arr); $j++) {
                if ($arr[$j] < $arr[$pos])
                    $pos = $j;
            }
            $tmp = $arr[$i];
            $arr[$i] = $arr[$pos];
            $arr[$pos] = $tmp;
        }

        return $arr;
    }
?>