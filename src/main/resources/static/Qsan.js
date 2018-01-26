function Q3(uuid)
{
    $.ajax({
        url: "Q3?time=" + new Date().getTime(),
        type: "POST",
        data: JSON.stringify({a1:a1,a2:a2,a3:a3,a4:a4}),//和上面一行都可用
        dataType: "json",
        contentType: "application/json;charset=utf-8",
        success: function (d) {
            alert(d['id'])
        }
    })
}