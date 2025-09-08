package com.example.notifications;


public class WhatsAppDecorator extends NotifierDecorator {
  private final String username;

  public WhatsAppDecorator(Notifier notifier, String username) {
    super(notifier);
    this.username = username;
  }

  @Override
  public void notify(String text) {
    super.notify(text);
    System.out.println("[WHATSAPP -> " + username + "]: " + text);
  }
}
