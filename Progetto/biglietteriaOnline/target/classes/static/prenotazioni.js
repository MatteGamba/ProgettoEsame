$(function(){
    console.log(window.location.search);
    

    $("#submit").on("click", function(){
    $.ajax({
        type: "post",
        url: "http://localhost:8080/api/biglietto/addbiglietto",
        dataType: "json",
        data: {
            codCliente: $("#codicecliente").val(),
            codReplica: $("#codicereplica").val(),
            tipoPagamento: $("#tipodipagamento").val(),
            quantita: $("#bigliettirichiesti").val()
        },
        success: function (response){
            console.log(response);
        }
        
    })
            $("#codicecliente").val(""),
            $("#codicereplica").val(""),
            $("#tipodipagamento").val(""),
            $("#bigliettirichiesti").val("")
		console.log("Funziona")
})

})