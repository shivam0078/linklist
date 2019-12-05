<%-- 
    Document   : index
    Created on : Aug 20, 2019, 7:20:32 PM
    Author     : sir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="get.jsp" method="POST">
            
            <center>
                <table border="1">
                    <tr>
                        <td>Id</td>
                        <td><input type="number" name="txteid"/></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="txtname"/></td>
                    </tr> <tr>
                        <td>Email</td>
                        <td><input type="email" name="txtemail"/></td>
                    </tr> 
                     <tr>
                        <td>Designation</td>
                        <td><input type="text" name="txtdes"/></td>
                    </tr>
                    
                     <tr>
                        <td>Working Days</td>
                        <td><input type="number" name="txtwd"/></td>
                    </tr>
                    
                     <tr>
                        <td>Per day salary</td>
                        <td><input type="number" name="txtps"/></td>
                    </tr>
                    
                     <tr>
                        <td>Leaves</td>
                        <td><input type="number" name="txtleaves"/></td>
                    </tr>
                    <tr>
                        
                        <td></td>
                        <td><input type="submit" value="Save"/></td>
                    </tr>
                </table>
                
            </center>
        </form>

    </body>
</html>
