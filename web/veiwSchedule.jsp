<%-- 
    Document   : veiwSchedule
    Created on : Dec 19, 2022, 7:56:21 AM
    Author     : hp
--%>

<%@page import="java.util.LinkedList"%>
<%@page import="Model.Class"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Schedule</title>
    </head>
    <body>
         
             <%
                 LinkedList<Class> classes = (LinkedList<Class>)request.getAttribute("scheduledata");
              %>
              
              <table>
                    <tr>
                        <td>
                            Class Name
                        </td>
                        <td>
                            Class Time
                        </td>
                         <td>
                            Class Day
                        </td>
                         <td>
                            Room Number
                        </td>
                        </tr>
                        
                             <%
                                  for(int i =0 ; i < classes.size(); i++){
                              %>
                          <tr>
                              <td>
                              <%= classes.get(i).getClassname()%>
                              </td>
                              <td>
                              <%= classes.get(i).getClasstime()%>
                              </td>
                              <td>
                              <%= classes.get(i).getClassday()%>
                              </td>
                              <td>
                              <%= classes.get(i).getRoomno()%>
                              </td>
                           </tr>
                    <%}%>
                    
              </table>

   
    </body>
</html>
