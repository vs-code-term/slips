<?php
$dom = new DOMDocument();
$dom->load("movie.xml");

echo "<h2> Movie Title </h2>";
$mtitle = $dom->getElementsByTagName("MovieTitle");

foreach($mtitle as $mt)
{
    echo "<b>" . $mt->textContent . "</b><br><br>";
}

echo "<h2> Actor Name </h2>";
$aname = $dom->getElementsByTagName("ActorName");

foreach($aname as $an)
{
    echo "<b>" . $an->textContent . "</b><br><br>";
}
?>