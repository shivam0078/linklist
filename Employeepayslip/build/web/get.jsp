<%@page import="java.util.ArrayList,EmployeeTest.*" %>
<html>
    <head>
    </head>
    <body>
        <center>
            <h1>Salary</h1>
            <table border="1">
                <tr>
                    <td>Eid</td>
                    <td>Name</td>
                    <td>Email</td>
                    <td>Designation</td>
                    <td>Working Days</td>
                    <td>Per day Salary</td>
                    <td>Leaves</td>
                    <td>Deducted Salary</td>
                    <td>Total Salary</td>
                                        
                </tr>
                
                <%
                Emp_Dao obj=new Emp_Dao();
                ArrayList<Emp_Pojo> data=obj.Insert(request.getParameter("txteid").toString(),request.getParameter("txtwd").toString(),request.getParameter("txtleaves").toString(),request.getParameter("txtps").toString(),request.getParameter("txtname").toString(),request.getParameter("txtemail").toString(),request.getParameter("txtdes").toString());
                for(Emp_Pojo ds:data)
                    {

                %>
                <tr>
                    <td><%=ds.getEid()%></td>
                    <td><%=ds.getName()%></td>
                    <td><%=ds.getEmail()%></td>
                    <td><%=ds.getDesig()%></td>
                    <td><%=ds.getWd()%></td>
                    <td><%=ds.getPs()%></td>
                    <td><%=ds.getLeaves()%></td>
                    <td><%=ds.getDs()%></td>
                    <td><%=ds.getTs()%></td>

                </tr>
                <% }%>
            </table>
        </center>

    </body>
</html>
