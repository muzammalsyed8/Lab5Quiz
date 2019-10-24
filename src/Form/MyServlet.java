package Form;

import DB.DbConnection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        int id= Integer.parseInt(request.getParameter("id"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Date dob = Date.valueOf(request.getParameter(("dob")));
        String email = request.getParameter("email");
        int phone= Integer.parseInt(request.getParameter("phone"));
        int fee= Integer.parseInt(request.getParameter("fee"));
        String course = request.getParameter("fsc");
        String gender = request.getParameter("male");


        PrintWriter out=response.getWriter();
       // out.println("Username: "+username);
        DbConnection obj=new DbConnection();
        obj.insertData(id,username,password,email,dob,phone,fee,course,gender);
        out.println("Record added successfully");


        //ServletContext sc= getServletContext();
        //response.sendRedirect("retrieveData.jsp");
       /* ResultSet result = obj.displayRecords();
        String r="<html><head></head><body> <table> <tr> <th>Username</th> <th>Password</th> <th>Confirm Password</th> <th>FirstName</th> <th>LastName</th> <th>Date Of Birth</th> <th>Email address</th> </tr>";

        try {
            while (result.next()){
                r = r+"<tr><td>"+result.getString("username")+"</td>";
                r = r+"<td>"+result.getString("password")+"</td>";
                r = r+"<td>"+result.getString("confirm_password")+"</td>";
                r = r+"<td>"+result.getString("fName")+"</td>";
                r = r+"<td>"+result.getString("lName")+"</td>";
                r = r+"<td>"+result.getString("dob")+"</td>";
                r = r+"<td>"+result.getString("email")+"</td> </tr>";

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        r = r+"</table></body></html>";
        out.write(r+"");


       /* ResultSet result = obj.displayRecords();
        try {
            while (result.next()){
                out.println("<HTML><body><table>");
                out.println("<tr><td>"+"Username"+"Password"+"Confirm Password"+"First Name"+"Last Name"+"DOB"+"Email"+"</td></tr>");
                out.println("<tr><td>" +result.getString("username")+"</td></tr>");
                out.println("<tr><td>" +result.getString("password")+"</td></tr>");
                out.println("<tr><td>" +result.getString("confirm_password")+"</td></tr>");
                out.println("<tr><td>" +result.getString("fName")+"</td></tr>");
                out.println("<tr><td>" +result.getString("lName")+"</td></tr>");
                out.println("<tr><td>" +result.getDate("dob") +"</td></tr>");
                out.println("<tr><td>" +result.getString("email") +"</td></tr>");
               // out.write(" \n");

                out.println("</table></body></HTML>");

                //System.out.println("RegNo is "+result.getString("reg_no"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        obj.displayRecords();

       /* request.getParameter("page");
        request.getRequestDispatcher("retrieveData.jsp").forward(request, response);*/

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter out=response.getWriter();
        out.write("Hi! Mr. Cool you are in Servlet");
    }
}
