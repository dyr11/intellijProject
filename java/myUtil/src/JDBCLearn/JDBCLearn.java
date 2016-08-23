package JDBCLearn;

import java.net.CookieHandler;
import java.sql.*;

/**
 * Created by dyr on 2016/7/31.
 */
public class JDBCLearn {
    static Connection connection;
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/world", "user", "password");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from city limit 10");
            while (resultSet.next()){
                System.out.println(resultSet.getString(4));
            }

            PreparedStatement preparedStatement=connection.prepareStatement("select * from where city=?");
            preparedStatement.setString(1,new String("dd"));

            callProcedure();
            callProcedureWithParams();
            CallableStatementWithOutParams();
            transaction();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void transaction() {
        try {
            connection.setAutoCommit(false);
            //do something;
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }

    private static void CallableStatementWithOutParams() {
        try {
            CallableStatement callableStatement=connection.prepareCall("call hello_in_out(?,?)");
            callableStatement.setString(1,"a");
            callableStatement.registerOutParameter(2,Types.INTEGER);
            callableStatement.execute();
            int result=callableStatement.getInt(2);
            System.out.println("count:"+result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void callProcedureWithParams() {
        try {
            CallableStatement callableStatement=connection.prepareCall("call hello_in(?)");
            callableStatement.setString(1,"a");
            callableStatement.execute();
            ResultSet resultSet=callableStatement.getResultSet();
            while(resultSet.next()){

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void callProcedure() {
        try {
            CallableStatement callableStatement=connection.prepareCall("call hello()");
            callableStatement.execute();
            ResultSet resultSet=callableStatement.getResultSet();
            while (resultSet.next()){
                System.out.print(resultSet.getString(4));
                System.out.println(": "+resultSet.getString("name"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}