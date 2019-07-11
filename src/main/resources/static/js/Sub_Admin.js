$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $(".row.myTable").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});

$(document).ready(function(){
	  $("#type ").change( function() {
//	    var value = $(this).val().toLowerCase();
//	    $(".row.myTable").filter(function() {
//	      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
//	    });
		  alert("tghyu");
	  });		 
	});