$(document).ready(function(){
    $("appForm").submit(function(e){
        let name=$("#name").val().trim();
         let email=$("#email").val().trim();
          let phone=$("#phone").val().trim();
           let gender=$("#gender").val().trim();
           let course=$("#course").val().trim();
           if(name===""||email===""||phone===""||gender===""||course===""){
            console.log("Please fill all fields before submitting.");
            e.preventDefault();
           }
    });
});