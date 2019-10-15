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

import edu.oakland.budgetapp.login_information.UserInformation;

public class DbConnector {
	private Connection connect;
        private static DbConnector instance;
        
        

	private DbConnector() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://" + DBConfiguration.DBHost + 
                                "/" + DBConfiguration.DBSchema + "?"
				+ "user=" + DBConfiguration.UserName + 
                                "&password=" + DBConfiguration.Password);
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		} catch (SQLException e2) {

			e2.printStackTrace();
		}

	}

        public static DbConnector getDBConnection(){
        
            if (instance==null)
                instance =new DbConnector();
            return instance;
        }
	
	

	public boolean saveNewUser(UserInformation newUser) {
		try {
			PreparedStatement statement = connect
					.prepareStatement("insert into user_information "
							+ "(firstname,lastname,email_address,"+
                                                "address,phone, gender, password) values"
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