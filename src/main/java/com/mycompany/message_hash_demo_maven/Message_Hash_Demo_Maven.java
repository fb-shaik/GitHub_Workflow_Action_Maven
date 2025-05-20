/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.message_hash_demo_maven;

/**
 *
 * @author FS
 */
public class Message_Hash_Demo_Maven {

    public static void main(String[] args) {
        String messageID = "0763369799";
        int messageNumber = 1;
        String message = " Hi there, thanks ";

        String hash = HashMessage.createMessageHash(messageID, messageNumber, message);
        System.out.println("Generated hash is: " + hash);
    
    }
}
