<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/29
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/echarts.js"></script>
</head>
<body>
    <div style="width: 900px;height: 400px" id="mychart"></div>
</body>
<script>
    var echart = echarts.init(document.getElementById("mychart"));
    var data = {
        xAxis: {
            type: 'category',
            data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
        },
        yAxis: {
            type: 'value'
        },
        series: [{
            data: [120, 200, 150, 80, 70, 110, 130],
            type: 'bar'
        }]
    };
    echart.setOption(data);
</script>
</html>
