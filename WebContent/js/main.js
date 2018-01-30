$(document).ready(function () {
	function apagar(){
    		 $.ajax({
    	            url: "http://localhost:8080/restfuljerseyfiledownloadimage/rest/actions/apagar",
    	            data: index,
    	            dataType: 'json',           
    	            type: 'POST',
    	            contentType: "text/plain",
    	            success: function (success) {

    	            },
    	            error: function (error) {
    	                console.log(error);
    	            }
    	        });  	
    }
    
    function acender(){
    		 $.ajax({
    	            url: "http://localhost:8080/restfuljerseyfiledownloadimage/rest/actions/acender",
    	            data: index,
    	            dataType: 'json',           
    	            type: 'POST',
    	            contentType: "text/plain",
    	            success: function (success) {

    	            },
    	            error: function (error) {
    	                console.log(error);
    	            }
    	        });
    };   
    
    $('#offButton').click(function(){
    	$('#image1').attr('src', 'img/off-light.png');        
		$('#image2').attr('src', 'img/on.png');  
    });
    
    $('#onButton').click(function(){
    	$('#image2').attr('src', 'img/on-light.png');  
		$('#image1').attr('src', 'img/off.png');    		
    });
});