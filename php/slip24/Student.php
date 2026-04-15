<?php


$xml = new DOMDocument("1.0", "UTF-8");
$xml->formatOutput = true;

$students = $xml->createElement("students");

$s1 = $xml->createElement("student");
$s1->appendChild($xml->createElement("rollno", "1"));
$s1->appendChild($xml->createElement("name", "Amit"));
$s1->appendChild($xml->createElement("address", "Kolhapur"));
$s1->appendChild($xml->createElement("college", "ABC College"));
$s1->appendChild($xml->createElement("course", "BCA"));
$students->appendChild($s1);


$s2 = $xml->createElement("student");
$s2->appendChild($xml->createElement("rollno", "2"));
$s2->appendChild($xml->createElement("name", "Ravi"));
$s2->appendChild($xml->createElement("address", "Pune"));
$s2->appendChild($xml->createElement("college", "XYZ College"));
$s2->appendChild($xml->createElement("course", "BBA"));
$students->appendChild($s2);


$s3 = $xml->createElement("student");
$s3->appendChild($xml->createElement("rollno", "3"));
$s3->appendChild($xml->createElement("name", "Priya"));
$s3->appendChild($xml->createElement("address", "Mumbai"));
$s3->appendChild($xml->createElement("college", "ABC College"));
$s3->appendChild($xml->createElement("course", "BCA"));
$students->appendChild($s3);


$s4 = $xml->createElement("student");
$s4->appendChild($xml->createElement("rollno", "4"));
$s4->appendChild($xml->createElement("name", "Neha"));
$s4->appendChild($xml->createElement("address", "Satara"));
$s4->appendChild($xml->createElement("college", "LMN College"));
$s4->appendChild($xml->createElement("course", "BBA"));
$students->appendChild($s4);

$s5 = $xml->createElement("student");
$s5->appendChild($xml->createElement("rollno", "5"));
$s5->appendChild($xml->createElement("name", "Karan"));
$s5->appendChild($xml->createElement("address", "Sangli"));
$s5->appendChild($xml->createElement("college", "ABC College"));
$s5->appendChild($xml->createElement("course", "BCA"));
$students->appendChild($s5);

$xml->appendChild($students);

$xml->save("student.xml");



$course = $_GET['course'] ?? '';

if ($course != "") {

    
    $data = simplexml_load_file("student.xml");

    echo "<h2>Students of Course: $course</h2>";
    echo "<table border='1'>
            <tr>
                <th>Roll No</th>
                <th>Name</th>
                <th>Address</th>
                <th>College</th>
                <th>Course</th>
            </tr>";

    foreach ($data->student as $s) {
        if ($s->course == $course) {
            echo "<tr>
                    <td>$s->rollno</td>
                    <td>$s->name</td>
                    <td>$s->address</td>
                    <td>$s->college</td>
                    <td>$s->course</td>
                  </tr>";
        }
    }

    echo "</table>";
} else {
    echo "Please enter course in URL. Example: ?course=BCA";
}

?>