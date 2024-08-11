import java.sql.*;


public class preparedStatement_Demo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/AshutoshDemoDb";
        String user = "postgres";
        String password = "trigger.11";
        String Sql = "insert into public.students values(?,?,?)";


        try {
            Connection conn = DriverManager.getConnection(url,user,password);
            PreparedStatement stmt = conn.prepareStatement(Sql);
            int id = 13;
            String name = "Ashutosh Rath 13";

            String collage = "GGi";

            stmt.setInt(1,id);
            stmt.setString(2,name);
            stmt.setString(3,collage);

            stmt.executeUpdate();


            conn.close();

            System.out.println("Successfully inserted");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
