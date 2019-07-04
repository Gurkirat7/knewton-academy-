var c1=document.getElementById("c1");
var c2=document.getElementById("c2");
var c3=document.getElementById("c3");
var card1=document.querySelector(".card1");
var card2=document.querySelector(".card2");
var card3=document.querySelector(".card3");
c1.addEventListener("click",function(){
	card1.classList.remove("displayOff");
	card2.classList.add("displayOff");
	card3.classList.add("displayOff");
})
c2.addEventListener("click",function(){
	card1.classList.add("displayOff");
	card2.classList.remove("displayOff");
	card3.classList.add("displayOff");
})
c3.addEventListener("click",function(){
	card1.classList.add("displayOff");
	card2.classList.add("displayOff");
	card3.classList.remove("displayOff");
})