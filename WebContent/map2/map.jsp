<%@page import="com.myframework.map.model.domain.Maps"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	List<Maps> mapsList = (List)request.getAttribute("mapsList");
	//out.print("맵리스트 사이즈 "+mapsList.size());
%>
<!DOCTYPE html>
<style>
body{margin:0px;}
</style>
<html>
<body>
<div id="googleMap" style="width:100%;height:700px;"></div>
<script src="/map/MyMarker.js"></script>

<script>
function myMap() {
	//맵을 생성!!
	var mapProp= {
	  center:new google.maps.LatLng(37.557869, 126.941553),
	  zoom:17,
	};
	var map = new google.maps.Map(document.getElementById("googleMap"),mapProp);

	//생성된 맵에 각종 속성~~~~
	<%for(int i=0;i<mapsList.size();i++){%>
	<%Maps maps = mapsList.get(i);%>
		var marker = new MyMarker(<%=maps.getLati()%>, <%=maps.getLongi()%>,"/images/<%=maps.getUrl()%>",map, "<%=maps.getMsg()%>");
	<%}%>
}
</script>

<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjVjeC63IVSLbDdl7ALW8vpGjC5b55QJc&callback=myMap"></script>

</body>
</html>