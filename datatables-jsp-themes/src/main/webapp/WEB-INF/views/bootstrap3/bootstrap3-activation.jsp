<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>

<%-- Make the ugly row in the thead disappear by removing the DataTables' CSS from the bundle --%>
<dandelion:asset cssExcludes="datatables" />

<div class="row row-intro">
   <div class="span12">
      <h3>Bootstrap 3 theme</h3>
      <p>This example shows how easily the Bootstrap framework can be integrated.</p>
      <p>Note that we made the black row in the thead disappear. To do that, we used the
         Dandelion JSP taglib to modify the active scopes by excluding the Datatables' CSS as
         follows:</p>
      <p>
         <code>&lt;dandelion:asset cssExcludes="datatables" /></code>
      </p>
   </div>
</div>

<div class="row">
   <div class="span12">
   
      <datatables:table id="myTableId" data="${persons}" cssClass="table table-striped table-bordered" theme="bootstrap3">
         <datatables:column title="Id" property="id" />
         <datatables:column title="FirstName" property="firstName" />
         <datatables:column title="LastName" property="lastName" />
         <datatables:column title="Street" property="address.town.name" />
         <datatables:column title="Mail" property="mail" />
      </datatables:table>
   
   </div>
</div>