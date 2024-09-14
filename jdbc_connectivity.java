import java.sql.*;

public class jdbc_connectivity {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost/employeedetail";
        String user="root";
        String password="root";
        Connection connection= DriverManager.getConnection(url,user,password);

        Statement stmt = connection.createStatement();

        stmt.execute("""
                create table employeedetail.empDetails (empcode int unique not null, empname varchar(50), empage int, salary int);
               """);
        stmt.execute("""
                insert into employeedetail.empDetails (empcode,empname,empage,salary) values(101,"Jenny",25,10000),(102,"Jacky",30,20000),(103,"Joe",20,40000),(104,"John",40,80000),(105,"Shameer",25,90000);             
               """);

        ResultSet resultSet= stmt.executeQuery("select * from employeedetail.empDetails;");


        while (resultSet.next()){

            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3)
                    +" "+resultSet.getInt(4)
            );
        }


        connection.close();
        stmt.close();
        resultSet.close();

    }
}
