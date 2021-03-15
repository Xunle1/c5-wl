import java.sql.*;

/**
 * @author Xunle
 */
public class Task1 {
    public static void main(String[] args) {
        Statement statement =null;
        Connection connection = null;
        ResultSet resultSet1 = null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            connection = DriverManager.getConnection("jdbc:mysql:///cas","root","root");
            String sql = "insert into student_temp values" +
                    "('s001','老大',20,'计算机学院')," +
                    "('s002','老二',19,'计算机学院')," +
                    "('s003','老三',18,'计算机学院')," +
                    "('s004','老四',17,'计算机学院');";
            //获取执行sql语句对象
            statement = connection.createStatement();
            statement.executeUpdate(sql);

            resultSet1 = statement.executeQuery("select * from student_temp");

            System.out.println("第一题效果：");
            System.out.println("----------------------------");

            while (resultSet1.next()) {
                System.out.println(resultSet1.getString(1) + "," + resultSet1.getString(2) +
                        "," + resultSet1.getInt(3) + "," + resultSet1.getString(4));
            }

            System.out.println("----------------------------");
            System.out.println("第二题效果");
            System.out.println("----------------------------");

            resultSet1 = statement.executeQuery("select * from student_temp");
            while (resultSet1.next()) {
                System.out.println(resultSet1.getString(1) + "," + resultSet1.getString(2) +
                        "," + resultSet1.getInt(3) + "," + resultSet1.getString(4));
            }

            System.out.println("----------------------------");
            System.out.println("第三题效果");
            System.out.println("----------------------------");

            statement.executeUpdate("delete from student_temp where SNO='s004'");
            resultSet1 = statement.executeQuery("select * from student_temp");
            while (resultSet1.next()) {
                System.out.println(resultSet1.getString(1) + "," + resultSet1.getString(2) +
                        "," + resultSet1.getInt(3) + "," + resultSet1.getString(4));
            }

            System.out.println("----------------------------");
            System.out.println("第四题效果");
            System.out.println("----------------------------");

            ResultSet resultSet2 = statement.executeQuery("select * from student_temp where SNO='s003'");
            while (resultSet2.next()) {
                Student student = new Student(resultSet2.getString("SNO"),
                        resultSet2.getString("Name"),
                        resultSet2.getInt("Age"),
                        resultSet2.getString("College"));
                System.out.println(student);
            }

            System.out.println("----------------------------");
            System.out.println("第五题效果");
            System.out.println("----------------------------");

            statement.executeUpdate("update student_temp set College='通信学院' where SNO='s001'");
            resultSet1 = statement.executeQuery("select * from student_temp");
            while (resultSet1.next()) {
                System.out.println(resultSet1.getString(1) + "," + resultSet1.getString(2) +
                        "," + resultSet1.getInt(3) + "," + resultSet1.getString(4));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try{
                connection.close();
                statement.close();
                resultSet1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
