/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.components;

import model.dto.MessageType;
import model.dto.Response;
import raven.glasspanepopup.GlassPanePopup;
import ui.MessageUI;

/**
 *
 * @author fawad
 */
public class CommonHandler {
    public static void handleResponse(Response response) {
        if (response.isSuccessfull()) {
            GlassPanePopup.showPopup(new MessageUI(response.getInfoMessages(), MessageType.Information));
        } else {
            GlassPanePopup.showPopup(new MessageUI(response.getErrorMessages(), MessageType.Error));
        }
    }
}

