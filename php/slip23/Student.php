<?php
class Student extends CI_Controller {

    function __construct() {
        parent::__construct();
        $this->load->model('Student_model');
    }

    function index() {
        $data['students'] = $this->Student_model->get_students();
        $this->load->view('student_view', $data);
    }
}
?>