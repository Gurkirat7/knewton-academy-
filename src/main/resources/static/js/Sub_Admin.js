$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $(".row.myTable").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});

function myFunction() {
	  var input, table,i;
	  input = document.getElementById("type");
	  table = document.querySelectorAll(".myTable");
	  for(i=0;i<table.length;i++){
		  if(table[i].querySelector(".clo").innerText==input.value)
			  {
			  table[i].style.display=""; 
			 }
		  else 
			  table[i].style.display="none"; 

	  }
	}
function myFunction1() {
	  var input, table,i;
	  input = document.getElementById("type1");
	  table = document.querySelectorAll(".myTable");
	  for(i=0;i<table.length;i++){
		  if(table[i].querySelector(".clo1").innerText==input.value)
			  {
			  table[i].style.display=""; 
			 }
		  else 
			  table[i].style.display="none"; 

	  }
	}