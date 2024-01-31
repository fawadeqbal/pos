/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dto;

/**
 *
 * @author fawad
 */
public class Message {
    public String message;
    public MessageType type;

    public Message(String message, MessageType type) {
        this.message = message;
        this.type = type;
    }
}
