<?php 
$xml=simplexml_load_file("book.xml") or die("Error: Cannot create object");

echo "<h1 align=center> Books Information </h1>";

echo "<table border=2>";

echo "<tr> <th> Book Category </th>

<th> Book Language </th>

<th> Book Titie </th>

<th> Book Author </th>

<th> Book Year </th>

<th> Book Price </th>

</tr>";

foreach($xml->children() as $books)
{
$category=$books['category'];
 $language=$books->title[' lang'];

echo "<tr> <td> Scategory </td>

<td> Slanguage </td>

< td>Sbooks->title</td>

<td>Sbooks->author </td>
</tr>";
}