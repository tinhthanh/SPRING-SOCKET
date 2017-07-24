package com.theotherian.chat;

public class ChatMessage {
  
  private String recipient;
  
  // nguoi nhan 
  public String getRecipient() { return recipient; }
  public void setRecipient(String recipient) { this.recipient = recipient; }
  
  
  // nguoi gui 
  private String sender;
  
  public String getSender() { return sender; }
  public void setSender(String sender) { this.sender = sender; }
  
  private String message;
  
  public String getMessage() { return message; }
  public void setMessage(String message) { this.message = message; }

}
