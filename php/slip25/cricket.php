cricket.php 
<?php 
$xml=simplexml_load_file("cricket.xm!") or die("Error: Cannot create object"); 
$Team=$xml->addChild('Team'); 
$Team->addAttribute('Country','srilanka'); 
$Team->addChild('Player','jaysurya'); 
$Team->addChild('Runs','5000'); 
$Team->addChild('Wickets','520'); 
$xml->asXML('cricket.xml'); 
echo "Record added successfully....... *";
?>