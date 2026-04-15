<?php
class Student_model extends CI_Model {

    function insert_data() {
        $data = array(
            array('rollno' => 1, 'name' => 'Amit', 'class' => 'FY'),
            array('rollno' => 2, 'name' => 'Ravi', 'class' => 'SY'),
            array('rollno' => 3, 'name' => 'Priya', 'class' => 'TY'),
            array('rollno' => 4, 'name' => 'Neha', 'class' => 'FY'),
            array('rollno' => 5, 'name' => 'Karan', 'class' => 'SY')
        );

        $this->db->insert_batch('student', $data);
    }
}
?>