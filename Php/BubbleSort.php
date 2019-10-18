<?php 
    $arr = array(5,3,1,5,6,2,3);
    for($i=0;$i<count($arr);$i++){
        echo $arr[$i];
    }
    echo "-";
    $arr2 = bubbleSort($arr);
    for($i=0;$i<count($arr2);$i++){
        echo $arr2[$i];
    }

    function bubbleSort($arr){
        $n = count($arr);
        $flag;
        for($i=0;$i<$n;$i++){
            $flag = false;
            for($j=0;$j<$n-$i-1; $j++){
                if($arr[$j]>$arr[$j+1]){
                    $tmp = $arr[$j];
                    $arr[$j] = $arr[$j+1];
                    $arr[$j+1] = $tmp;
                }
            }
        }
        return $arr;
    }
?>