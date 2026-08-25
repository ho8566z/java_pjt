<%@page import="com.office.ex.VaccineDto"%>
<%@page import="java.util.List"%>
<%@page import="com.office.ex.VaccineConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VACCINE MANAGEMENT SYSTEM</title>

<script>

function vaccineDelete(fvp_no) {
	console.log('vaccineDelete() called');
	console.log('fvp_no : ', fvp_no);
	
	let result = confirm('정말 삭제하겠습니까?');
	console.log('result : ', result);
	
	if (result) {
		location.href = '/vaccinepjt/vaccine_delete.vc?fvp_no=' + fvp_no;
	}
	
}

</script>

</head>
<body>

	<h1>백신 접종 현황 - 리스트</h1>
	
	<jsp:include page="./include/nav.jsp" />

	<div>
		<table>
			<tr>
				<td>이름</td>
				<td>주민번호</td>
				<td>메일</td>
				<td>연락처</td>
				<td>접종처 이름</td>
				<td>접종처 주소</td>
				<td>접종처 연락처</td>
				<td>접종처 담당자</td>
				<td>백신 타입</td>
				<td>백신 제조국</td>
				<td>백신 제조일</td>
				<td>삭제</td>
			</tr>
			
			<%
				List<VaccineDto> vaccineDtos = (List<VaccineDto>) request.getAttribute("vaccineDtos");
				for (int i = 0; i < vaccineDtos.size(); i++) {
			%>
					<tr>
						<td><%= vaccineDtos.get(i).getFvp_name() %></td>
						<td><%= vaccineDtos.get(i).getSs_number() %></td>
						<td><%= vaccineDtos.get(i).getFvp_mail() %></td>
						<td><%= vaccineDtos.get(i).getFvp_phone() %></td>
						<td><%= vaccineDtos.get(i).getFv_location_name() %></td>
						<td><%= vaccineDtos.get(i).getFv_location_addr() %></td>
						<td><%= vaccineDtos.get(i).getFv_location_phone() %></td>
						<td><%= vaccineDtos.get(i).getFv_location_manager() %></td>
						<td><%= vaccineDtos.get(i).getFv_type() %></td>
						<td><%= vaccineDtos.get(i).getFv_type_manuf_country() %></td>
						<td><%= vaccineDtos.get(i).getFv_type_manuf_date() %></td>
						<td>
							<a href="#none" onclick="vaccineDelete(<%= vaccineDtos.get(i).getFvp_no() %>);">삭제</a>
						</td>
					</tr>
			<%
				}
			%>

		</table>
	
	</div>

</body>
</html>









