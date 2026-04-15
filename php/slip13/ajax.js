$(document).ready(function(){
$(‘#name’).on(‘input’,function(){
Var name =$(this).val();
$.ajax({

    url:‘server.php’,
    type:‘POST’,
    data:{name:name},
    success:function(response){

        $(‘#response’).html(response);
    }
});

});

});