function Q1(uuid)
{
    // alert("年后")
    var a1 = $('#a1').val()
    var a2 = $('#a2').val()
    var a3 = $('#a3').val()
    var a4 = $('#a4').val()
    $.ajax({
        url: "Q1?time=" + new Date().getTime(),
        type: "POST",
        data: JSON.stringify({a1:a1,a2:a2,a3:a3,a4:a4}),//和上面一行都可用
        dataType: "json",
        contentType: "application/json;charset=utf-8",
        success: function (d) {
            alert(d['id'])
        }
    })
}