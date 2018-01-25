function qingChu1(uuid)
{
    $.ajax({
        url: "q?time=" + new Date().getTime(),
        type: "POST",
        data: JSON.stringify({uuid: uuid}),//和上面一行都可用
        dataType: "json",
        contentType: "application/json;charset=utf-8",
        success: function (d) {
            alert(d['id'])
        }
    })
}