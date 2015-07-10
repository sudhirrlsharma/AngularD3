$(document).ready(function(){

    var currentstate = 0;
  //  console.log("i jquery");
    $("#step1").hide();
    $("#step2").hide();
    
 //   console.log($("h1").attr("reply"));
    
    $("#button1").click(function () {
        
         $("#step1").show();
        $("#step2").hide();
        
        currentstate = 1;
        
        //update others
    });
    
    $("#button2").click(function () {
        
         $("#step2").show();
        $("#step1").hide();
        
        currentstate = 2;
        
        //update others
    });


});