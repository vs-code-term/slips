<?php
class Student extends CI_Controller {

    function __construct() {
        parent::__construct();
        $this->load->model('Student_model');
    }

    function insert() {
        $this->Student_model->insert_data();
        echo "5 Records Inserted Successfully";
    }
}
?>