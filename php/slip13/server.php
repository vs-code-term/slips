<?php
$name=$_POST[‘name’];

if(empty($name)){
echo‘Stranger,pleasetellmeyourname!’;
}

elseif($name==‘Rohit’||$name==‘Virat’||$name===‘Dhoni’||$name==‘Ashwin’||$name==‘Harbhajan’){
echo‘Hello,master!;
}

else{

Echo$name.‘,Idon\’tknowyou!’;
}
?>


