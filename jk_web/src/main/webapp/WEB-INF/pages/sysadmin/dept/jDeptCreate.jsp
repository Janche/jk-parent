<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title></title>
</head>

<body>
<form name="icform" method="post">

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
<li id="save"><a href="#" onclick="formSubmit('${ctx}/dept/insert','_self');this.blur();">保存</a></li>
<li id="back"><a href="#" onclick="history.go(-1);">返回</a></li>
</ul>
  </div>
</div>
</div>
</div>
   
  <div class="textbox-title">
	<img src="${ctx }/skin/default/images/icon/currency_yen.png"/>
   新增部门
  </div> 
  

 
    <div>
		<table class="commonTable" cellspacing="1">
	        <tr>
	            <td class="columnTitle">上级部门：</td>
	            <td class="tableContent">
	            	<!-- 传统做法 -->
	            	<select name="parent.id">
	            		<option>--请选择--</option>
	            		<c:forEach items="${deptList}" var="dept">
	            			<option value="${dept.id}">${dept.deptName}</option>
	            		</c:forEach>
	            	</select>
	            	<!-- struts2提供的标签：
	            		name：代表下拉框的名称
	            		list：绑定的集合名	list<Dept>
	            		headerKey：代表首选项的value属性
	            		headerValue:代表首选项的文本
	            	 -->
	            	
	            	<!-- <s:select name="parent.id" list="#deptList" headerKey="" headerValue="--请选择--" listKey="id" listValue="deptName"></s:select> -->
	            </td>
	        </tr>		
	        <tr>
	            <td class="columnTitle">部门名称：</td>
	            <td class="tableContent"><input type="text" name="deptName" value=""/></td>
	        </tr>		
		</table>
	</div>
 </form>
</body>
</html>