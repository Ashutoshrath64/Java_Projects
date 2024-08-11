import java.sql.*;


public class JDBC_Demo {
    public static void main(String[] args) {
        /*
        * 1-Import packages
        * 2-creating and registring conncetion
        *Create the conection
        *Create statement
        * Execute statement
        * Close connection
        * */

        try {

            String url = "jdbc:postgresql://localhost:5432/AshutoshDemoDb";
            String user = "postgres";
            String password = "trigger.11";
            String Sql = "insert into public.students values(12,'Ashutosh Rath 11','GGI')";

          //Class.forName("org.postgresql.Driver");
          Connection conn = DriverManager.getConnection(url,user,password);
          Statement stmt = conn.createStatement();

//          rs.next();
//          System.out.println("Connected to PostgreSQL database wit qurrry to be: "+rs.getString("name"));

            boolean stat = stmt.execute(Sql);
            System.out.println(stat);

            Sql = "select * from public.students";

            ResultSet rs = stmt.executeQuery(Sql);

            while (rs.next()){
                System.out.print(rs.getInt(1)+"-");
                System.out.println(rs.getString(2)+"-");
                System.out.println(rs.getString(3));

            }






            conn.close();



        }catch (Exception e){
           System.out.println(e);
        }
    }
}
