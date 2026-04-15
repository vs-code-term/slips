<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Number extends CI_Controller {

    public function index() {
        $this->load->view('number_view');
    }
}