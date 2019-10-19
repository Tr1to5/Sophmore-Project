/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.oakland.budgetapp.DB;

/**
 *
 * @author Mousumi Das
 */
import java.sql.*;

public class DbConnector {

    private Connection connect;
    private static DbConnector instance;

    private DbConnector() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://" + DBConfiguration.DBHost
                    + "/" + DBConfiguration.DBSchema + "?"
                    + "user=" + DBConfiguration.UserName
                    + "&password=" + DBConfiguration.Password + "&useSSL=False");
        } catch (ClassNotFoundException e1) {

            e1.printStackTrace();
        } catch (SQLException e2) {

            e2.printStackTrace();
        }

    }

    public static DbConnector getDBConnection() {

        if (instance == null) {
            instance = new DbConnector();
        }
        return instance;
    }

    public boolean getUserID(String emailAddress) {
        try {
            PreparedStatement statement = connect.prepareStatement("SELECT userid from user_information where email_address=?");
            statement.setString(1, emailAddress);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return false;
    }

    public boolean validateUser(String emailAddress, String password) {
        try {
            PreparedStatement statement = connect.prepareStatement("SELECT userid, firstname, lastname,"
                    + " email_address,address, "
                    + " phone,   gender, password, account_balance,"
                    + " debt_balance from user_information"
                    + " where email_address=? and password =?");
            statement.setString(1, emailAddress);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                UserInformation newUser= new UserInformation();
                newUser.setUserID(rs.getInt(1));
                newUser.setFirstName(rs.getString(2));
                newUser.setLastName(rs.getString(3));
                newUser.setEmailAddress(rs.getString(4));
                newUser.setAddress(rs.getString(5));
                newUser.setPhoneNumber(rs.getString(6));
                newUser.setGender(rs.getString(7));
               // newUser.setPassword(rs.getString(8));
                newUser.setAccount_balance(rs.getFloat(9));
                newUser.setDebt_balance(rs.getFloat(10));
                UserSession.setAuthenticatedUser(newUser);
                return true;
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return false;
    }

    public boolean saveNewUser(UserInformation newUser) {
        try {
            PreparedStatement statement = connect
                    .prepareStatement("insert into user_information "
                            + "(firstname,lastname,email_address,"
                            + "address,phone, gender, password) values"
                            + "(?,?,?,?,?,?,?)");

            statement.setString(1, newUser.getFirstName());
            statement.setString(2, newUser.getLastName());
            statement.setString(3, newUser.getEmailAddress());
            statement.setString(4, newUser.getAddress());
            statement.setString(5, newUser.getPhoneNumber());
            statement.setString(6, newUser.getGender());
            statement.setString(7, newUser.getPassword());

            statement.executeUpdate();

            return true;
        } catch (SQLException e) {

            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

}
