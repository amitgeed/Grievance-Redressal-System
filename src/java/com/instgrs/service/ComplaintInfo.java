
package com.instgrs.service;
import com.instgrs.dao.ComplaintDAO;
import com.instgrs.model.Complaint;
import java.util.ArrayList;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;


public class ComplaintInfo {
  public static void sendEmail(String toEmail,String dept,String date,String complaint)
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
           message.setSubject("Complaint Registered !");
           String data = "<h1>Dear User</h1>Your complaint has been registered we will inform you as soon as your complaint has been resolved <br>"
                   + "Your Complaint Domain is: "+dept+"<br>"
                   + "Complaint Date : "+date+"<br>"
                   + "Complaint Description : "+complaint+""
                   + "<br><p>This is confirmation mail, do not respond to this email<br>Thanks,<br>Institutional GRS Team.</p>";
           message.setContent(data,"text/html");
          Transport.send(message);
           System.out.println("message sent successfully");
        } catch (MessagingException e)
        {
            e.printStackTrace();
        }
    }
}
