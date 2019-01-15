package v1;

import dao.Test;

import java.sql.*;

public class WjSimpleExecutor implements WjExecutor {

    @Override
    public <T> T query(String statement, String parameter) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Test test = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://redis.f6car:3306/f6report_new_dev?useUnicode=true&amp;characterEncoding=utf-8&amp;useSSL=false&amp;useJDBCCompliantTimezoneShift=true&amp;useLegacyDatetimeCode=false&amp;serverTimezone=UTC", "root", "root");
            preparedStatement = connection.prepareStatement(String.format(statement, Integer.valueOf(parameter)));
            //preparedStatement.setInt(1, Integer.valueOf(parameter));
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                test = new Test();
                test.setId(rs.getInt(1));
                test.setNums(rs.getInt(2));
                test.setName(rs.getString(3));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != connection) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return (T)test;
    }

}
