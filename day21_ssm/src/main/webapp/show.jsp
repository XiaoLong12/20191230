<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-1.11.0.min.js"></script>
    <script src="js/echarts.js"></script>
</head>
<body>
<div id="mychart" style="width: 600px; height: 450px"/>
</body>
<script>
    var echart = echarts.init(document.getElementById("mychart"));
    function loadData() {
        $.post("productList.action",function(data){
            echart.setOption({
                xAxis: {
                    type: 'category',
                    data: data.xData
                },
                yAxis: {
                    type: 'value'
                },
                series: [{
                    data: data.seriesData,
                    type: 'bar'
                }]
            })
        },"json")
    }
    loadData();
    window.setInterval("loadData()",3000);
</script>
</html>
