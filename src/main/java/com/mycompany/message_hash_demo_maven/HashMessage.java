/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.message_hash_demo_maven;

/**
 *
 * @author FS
 */
public class HashMessage {
// Method for hashing
    public static String createMessageHash(String messageId, int messageNumber, String messageContent) {
        // Trim the message
        messageContent = messageContent.trim();

        // Extract first word
        String firstword = messageContent.substring(0, messageContent.indexOf(" "));

        // Extract last word
        String lastword = messageContent.substring(messageContent.lastIndexOf(" ") + 1);

        // Build and return the hash in uppercase
        return messageId.substring(0, 2) + " : " + messageNumber + " : " + (firstword + lastword).toUpperCase();
    }
}