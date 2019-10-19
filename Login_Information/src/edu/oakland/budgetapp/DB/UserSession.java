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
public class UserSession {

    private static boolean isUserAuthenticated = false;
    private static UserInformation currentUser;

    public static void setAuthenticatedUser(UserInformation user) {
        currentUser = user;
        isUserAuthenticated = true;
    }

    public static UserInformation getAuthenticatedUser() {
        return currentUser;
    }

    public boolean getAuthenticationStatus() {
        return isUserAuthenticated;
    }
}
