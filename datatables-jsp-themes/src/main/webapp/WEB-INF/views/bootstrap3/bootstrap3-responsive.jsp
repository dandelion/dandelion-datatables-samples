<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>

<%-- Make the ugly row in the thead disappear by removing the DataTables' CSS from the bundle --%>
<dandelion:asset cssExcludes="datatables" />

<div class="row row-intro">
   <div class="span12">
      <h3>Bootstrap 3 responsive theme</h3>
      <p>
         This example uses the <strong>bootstrap2-responsive</strong> extension to add a responsive
         behaviour to the table.</p>
      <p>Try to resize your window to see it in action!</p>
   </div>
</div>

<div class="row">
   <div class="span12">
   
      <datatables:table id="myTableId" data="${persons}" cssClass="table table-striped table-bordered" theme="bootstrap3" ext="responsive">
         <datatables:column title="Id" property="id" data-class="expand" />
         <datatables:column title="FirstName" property="firstName" />
         <datatables:column title="LastName" property="lastName" />
         <datatables:column title="Street" property="address.town.name" data-hide="phone,tablet" />
         <datatables:column title="Mail" property="mail" data-hide="phone,tablet" />
      </datatables:table>
   
   </div>
</div>