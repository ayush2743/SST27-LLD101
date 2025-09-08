package com.example.notifications;

/**
 * Starter demo that uses only the existing Email notifier.
 * TODOs guide you to add decorators and compose them.
 */
public class Demo {
  public static void main(String[] args) {
    Notifier base = new EmailNotifier("user@example.com");

    // Baseline behavior (already works)
    base.notify("Baseline email only.");


    Notifier smsAndEmail = new SmsDecorator(base, "1234567890");
    smsAndEmail.notify("done");

    Notifier whatsappAndEmail = new WhatsAppDecorator(base, "user");
    whatsappAndEmail.notify("done");

    Notifier slackAndEmail = new SlackDecorator(base, "deployments");
    slackAndEmail.notify("done");

    Notifier full = new SlackDecorator(new WhatsAppDecorator(base, "user"), "deployments");
    full.notify("done");

  }
}
