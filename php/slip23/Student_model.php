<?php
class Student_model extends CI_Model {

    function get_students() {
        $query = $this->db->get('student');
        return $query->result();
    }
}
?>