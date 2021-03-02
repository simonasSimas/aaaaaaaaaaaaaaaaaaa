package com.company.exceptions;

import java.util.List;

public class EmailSender extends NetworkConnector{

    public void sendEmail(List<Email> emailList) throws NoNetworkException {
        for (Email email :emailList){
            try{
                System.out.println("Sending email to " + email.getReceiver());
                send(email);
                email.setState("delivered");
                System.out.println("Email to " + email.getReceiver() + " " + email.getState());

            } catch (NoNetworkException e){
                System.out.println(("Failed to send an email to " + email.getReceiver()));
                email.setState("redelivered");
                System.out.println("Redelivering email to " + email.getReceiver());
                System.out.println("Email to " + email.getReceiver() + " " + email.getState());
            }
        }
    }
}
