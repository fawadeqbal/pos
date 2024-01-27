package model.validators;

import model.dto.Message;
import model.dto.MessageType;
import model.dto.Response;
import model.dto.UserDTO;


public class CommonValidator {

    public static void validateUser(UserDTO objUser, Response objResponse) {
        isValidUsername(objUser.getUsername(), objResponse);
        if(objResponse.isSuccessfull())
        isValidPassword(objUser.getPassword(), objResponse);
    }

   
    private static void isValidUsername(String username, Response objResponse) {
        if (username == null || username.length() < 6) {
            objResponse.messagesList.add(new Message("Email is not valid, provide valid email (standard email abc@xyz.co) with at least 6 characters.", MessageType.Error));
            return;
        }
    }

    private static void isValidPassword(String password, Response objResponse) {
        if (password == null || password.length() < 3) {
            objResponse.messagesList.add(new Message("Password is not valid, provide valid password with at least 3 characters.", MessageType.Error));
        }

    }
}
