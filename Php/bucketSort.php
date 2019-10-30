function BucketSort(&$data) { 
    $min = $data[0];
    $max = $data[0]; 
    $dataLength = count($data);
    for ($i = 1; $i < $dataLength; $i++) { 
         if ($data[$i] > $max) 
             $max = $data[$i]; 
         if ($data[$i] < $min) 
             $min = $data[$i];
    } 
    $bucket = array();
    $bucketLength = $max - $min + 1; 
    for ($i = 0; $i < $bucketLength; $i++) { 
         $bucket[$i] = array(); 
    }
    for ($i = 0; $i < $dataLength; $i++) { 
         array_push($bucket[$data[$i] - $min], $data[$i]); 
    } 
    $k = 0; 
    for ($i = 0; $i < $bucketLength; $i++) { 
         $bucketCount = count($bucket[$i]); 
         if ($bucketCount > 0) { 
              for ($j = 0; $j < $bucketCount; $j++) { 
                   $data[$k] = $bucket[$i][$j]; 
                   $k++; 
              } 
        } 
    }
 }
