package model.validators;

import java.util.ArrayList;
import model.dto.Message;
import model.dto.MessageType;
import model.dto.Response;
import model.dto.UserDTO;


public class CommonValidator {

    public static void validateUser(UserDTO objUser, Response objResponse) {
        isValidUsername(objUser.getUsername(), objResponse);
        isValidPassword(objUser.getPassword(), objResponse);
    }

   
    private static void isValidUsername(String username, Response objResponse) {
        if (username == null || username.length() < 6) {
            objResponse.messagesList.add(new Message("Email is not valid, provide valid username with at least 6 characters.", MessageType.Error));
            return;
        }
    }

    private static void isValidPassword(String password, Response objResponse) {
        if (password == null || password.length() < 3) {
            objResponse.messagesList.add(new Message("Password is not valid, provide valid password with at least 3 characters.", MessageType.Error));
        }

    }

    public static void validateUsers(ArrayList<UserDTO> users, Response responseObj) {
        for(UserDTO user:users){
            validateUser(user,responseObj);
        }
    }
}
