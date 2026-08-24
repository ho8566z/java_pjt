<%@page import="com.office.ex.VaccineConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
	<a href="<%= request.getContextPath().concat(VaccineConfig.HOME) %>">HOME</a>
	&nbsp;&nbsp; | &nbsp;&nbsp;
	<a href="<%= request.getContextPath().concat(VaccineConfig.VACCINE_RESISTER_FORM) %>">VACCINE REGISTER</a>
	&nbsp;&nbsp; | &nbsp;&nbsp;
	<a href="<%= request.getContextPath().concat(VaccineConfig.VACCINE_LIST) %>">VACCINE LIST</a>
	&nbsp;&nbsp; | &nbsp;&nbsp;
</div>