//package com.runoob.test;
//
//// �ļ��� SendEmail.java
//import java.io.*;
//import java.util.*;
//import javax.servlet.*;
//import javax.servlet.http.*;
//import javax.mail.*;
//import javax.mail.internet.*;
//import javax.activation.*;
//
//public class SendEmail extends HttpServlet{
//
//    public void doGet(HttpServletRequest request,
//                      HttpServletResponse response)
//            throws ServletException, IOException
//    {
//        // �ռ��˵ĵ����ʼ� ID
//        String to = "ligang@longcheer.com";
//
//        // �����˵ĵ����ʼ� ID
//        String from = "kylin27@126.com";
//
//        // �������Ǵӱ����������͵����ʼ�
//        String host = "localhost";
//
//        // ��ȡϵͳ������
//        Properties properties = System.getProperties();
//
//        // �����ʼ�������
//        properties.setProperty("mail.smtp.host", host);
//
//        // ��ȡĬ�ϵ� Session ����
//        Session session = Session.getDefaultInstance(properties);
//
//        // ������Ӧ��������
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//
//        try{
//            // ����һ��Ĭ�ϵ� MimeMessage ����
//            MimeMessage message = new MimeMessage(session);
//            // ���� From: header field of the header.
//            message.setFrom(new InternetAddress(from));
//            // ���� To: header field of the header.
//            message.addRecipient(Message.RecipientType.TO,
//                    new InternetAddress(to));
//            // ���� Subject: header field
//            message.setSubject("This is the Subject Line!");
//            // ��������ʵ����Ϣ
//            message.setText("This is actual message");
//            // ������Ϣ
//            Transport.send(message);
//            String title = "���͵����ʼ�";
//            String res = "�ɹ�������Ϣ...";
//            String docType = "<!DOCTYPE html> \n";
//            out.println(docType +
//                    "<html>\n" +
//                    "<head><title>" + title + "</title></head>\n" +
//                    "<body bgcolor=\"#f0f0f0\">\n" +
//                    "<h1 align=\"center\">" + title + "</h1>\n" +
//                    "<p align=\"center\">" + res + "</p>\n" +
//                    "</body></html>");
//        }catch (MessagingException mex) {
//            mex.printStackTrace();
//        }
//    }
//}