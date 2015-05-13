package com.wow.dao;

import java.sql.*;

    public class SubscriberDAO {
    
        public static void main(String[] args) {


try
        {
            
        
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:Wise_dsn","","");
        Statement statement=con.createStatement();
        String count="";
       if (a!=null && a.length()>0)

        statement.executeUpdate("insert into Subscription values('"+ a +"')");

       
       String queryCheck = "SELECT * from messages WHERE email = " ;
       ResultSet rs1 = statement.executeQuery(queryCheck);  
       if(rs1.next())
         {
             out.println("Already Subscribed");
         }
            
            
            
        count = "Select count(*) from Subscription" ;
        ResultSet rs = statement.executeQuery(count);
              int i=0;

              while(rs.next()){
                  count= rs.getString(1);
              }

            out.println("No of users subscribed "+ count);
            session.setAttribute("count", count);
        // response.sendRedirect("newjsp.jsp");
                }
                catch(Exception ee)
                {
                    System.out.println(ee.toString());
                }

        }

}
