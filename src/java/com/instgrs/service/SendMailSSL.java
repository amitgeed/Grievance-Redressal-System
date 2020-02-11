
package com.instgrs.service;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendMailSSL {
  public static void sendEmail(String toEmail)
  {
     //Get the session object
         Properties props = new Properties();
         props.put("mail.smtp.host", "smtp.gmail.com");
         props.put("mail.smtp.socketFactory.port", "465");
         props.put("mail.smtp.socketFactory.class",
            "javax.net.ssl.SSLSocketFactory");
         props.put("mail.smtp.auth", "true");
         props.put("mail.smtp.port", "465");
         Session session = Session.getDefaultInstance(props,
   new javax.mail.Authenticator() {
   @Override
   protected PasswordAuthentication getPasswordAuthentication() {
        //char  password[] = "9009557337".toCharArray();
        return new PasswordAuthentication("status.experts@gmail.com","status99");//change accordingly
   }
  });

  //compose message
        try {
           MimeMessage message = new MimeMessage(session);
           message.setFrom(new InternetAddress("status.experts@gmail.com"));//change accordingly
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(toEmail));
           message.setSubject("Thank you for register");
           String data = "<h1>Dear User</h1>To verify account click on verify button<br><a href='http://localhost:8084/Institutional_GRS/verify.jsp?email="+toEmail+"'><button>Verify</button></a><p>This is verifiaction mail, do not respond to this email<br>Thanks,<br>Institutional GRS Team.</p>";
           message.setContent(data,"text/html");
          Transport.send(message);
           System.out.println("message sent successfully");
        } catch (MessagingException e)
        {
            e.printStackTrace();
        }
    }
}
