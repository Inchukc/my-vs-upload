$(document).ready(function(){
  $("img").hide().fadeIn(1000);
});
$("nav a").on("click",function(){
  $("nav a").removeclass("active");
  $(this).addclass("active");
});

