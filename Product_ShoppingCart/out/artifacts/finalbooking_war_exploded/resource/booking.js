$(function () {
    $("#btnbook").click(booking);
$("#payrev").click(paymentstore);

function booking() {
    var movnm=  $("#smovie").value;
    var movdate=  $("#sdate").value;
    var movtime=$("#stime").value;
    var nseat=$("#nseat").value;
    movtime="120sec";
    movnm="dfd";
    movdate="1/2/2311";
nseat="4";
  //  var result= {smovie:movnm,sdate:movdate,stime:movtime,nseat:nseat};
//    $.post("reviewOrder",{ result:JSON.stringify(result)},reviewbooking,"json");
var test= {dateofshow:movdate,showtime:movtime,noseat:nseat};
     $.post("reviewOrder",{ticket:JSON.stringify(test)},reviewbooking,"json");
}
function reviewbooking(data) {
   // alert("succes")
    $("#ticket").remove();
     var movnm=  $("<div>",{"html":data.movie.name});
  var movlang=  $("<div>",{"html": data.movie.language});
  var movtime=$("<div>",{"html":data.movie.showtime});
  var movdate=$("<div>",{"html":data.dateofshow});
  var movdur=$("<div>",{"html":data.showtime});
  var movseat= $("<div>",{"html":data.noseat});
  var movtotal=$("<div>",{"html":data.movie.price * data.noseat});
    var btnpay= $("<input>",{"type": "submit","value": "make payment", "id":"pay"});
  $("#book").append($("<img>",{"src":"","alt":"movie"}));
    $("#book").append(movnm).append($("<br>")).append(movlang).append($("<br>")).append(movtime).append($("<br>"))
        .append(movdate).append($("<br>")).append(movdur).append($("<br>")).append(movseat)
        .append($("<br>")).append(movtotal).append(btnpay);
    $("#pay").click(payment);
   // $("#pay").click(payment);
   // alert("hhh");
}


function payment() {
    $("#book").remove();
    var l1= $("<label>").html("CARD NUMBER:");
    var l2= $("<label>").html("NAME CARD:");
    var l3= $("<label>").html("CARD TYPE:");
    var l4= $("<label>").html("CVV NUMBER:");
    var l5= $("<label>").html("EXPIRY MONTH:");
    var l6= $("<label>").html("EXPIRY YEAR:");
    var l7= $("<label>").html("AMOUNT:");

    var cardno = $("<input>", {"id": "cardno"});
    var cardname = $("<input>", {"id": "cardname"});
    var cvvno = $("<input>", {"id": "cvvno"});
    var cardtype = $("<input>", {"id": "cardtype"});
    var month = $("<input>", {"id": "month"});
    var year= $("<input>",{"id":"year"});
    var amount= $("<input>",{"id":"amount",});
    var btnpay= $("<input>",{"type": "submit","value": "make payment", "id":"payrev"}).click(paymentstore);
    $("#payment").append(l1).append(cardno).append("<br>").append(l2).append(cardname).append("<br>").append(l3).append(cvvno).append("<br>").append(l4).append(cardtype).append("<br>")

        .append(l5).append(month).append("<br>").append(l6).append(year).append("<br>").append(l7).append(amount).append("<br>").append(btnpay);

} function paymentstore() {

     var cardname=  $("#smovie").val();
     var cardno=  $("#sdate").val();
     var cardtype=$("#stime").val();
     var cvvno=$("#nseat").val();
     var month=$("#stime").val();
     var year=$("#nseat").val();
     var amount=$("#amount").val()

     var cardname=  "feven";
     var cardno= "123624724";
     var cardtype="visa";
   var  cvvno="345";
    var  month=06;
    var  year="21";
     var amount=43768;

     // $.ajax("reviewPayment",{"type":"POST","data":{
     //         "cardno":cardno,"cardname":cardname,"cardtype":cardtype,
     //         "cvvno":cvvno,"month":month,"year":year,"amount":amount
     //     }}).done(paymentreview()).fail();
     var test1={cardno:cardno,nameoncard:cardname,cardtype:cardtype,month:month,year:year,cvvno:cvvno,amount:amount};
     $.post("reviewPayment",{paymentinfo:JSON.stringify(test1)},paymentreview,function () { alert("error")
     },"json");

    // $.post("reviewPayment",{payment:JSON.stringify(test1)},paymentreview,"json");
 }
function paymentreview(data) {
  //  $.post('reviewOrder',type:"post", processData, "json")
alert("succes");
    $("#payment").remove();
    var movnm=  $("<div>",{"html":data.cardno});
    var movlang=  $("<div>",{"html": data.nameoncard});
    var movtime=$("<div>",{"html":data.cardtype});
    var movdate=$("<div>",{"html":data.month});
    var movdur=$("<div>",{"html":data.year});
    var movseat= $("<div>",{"html":data.cvvno});
    var movtotal=$("<div>",{"html":data.amount });
    var btnpay= $("<input>",{"type": "button","value": "my Booking", "id":"mybook"});
    $("#paymentrev").append($("<img>",{"src":"","alt":"movie"}));
    $("#paymentrev").append(movnm).append($("<br>")).append(movlang).append($("<br>")).append(movtime).append($("<br>"))
        .append(movdate).append($("<br>")).append(movdur).append($("<br>")).append(movseat)
        .append($("<br>")).append(movtotal).append(btnpay);
 //   $("#mybook").click()
}

});