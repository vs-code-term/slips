<?php 
$fp = fopen('contact.dat’,'r'); 
echo "<table border=1>"; 
echo 
"<tr><th>Sr. 
No.</th><th>Name</th><th>Residence No.</th><th>Mob. 
no.</th><th>Relation</th></tr>";
while(Srow = fscanf(Sfp,"%s %s %s %s %s")) 
{
echo "<tr>"; 
foreach(Srow as $r)
{
echo "<td>Sr</td>";
}
echo "</tr>";
}
echo "</table>"; 
fclose(Sfp); 
?>