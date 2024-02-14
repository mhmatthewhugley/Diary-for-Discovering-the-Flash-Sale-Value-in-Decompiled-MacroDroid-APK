package com.sun.mail.handlers;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import javax.activation.ActivationDataFlavor;
import javax.activation.DataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessageAware;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;

public class message_rfc822 extends handler_base {
    private static ActivationDataFlavor[] ourDataFlavor = {new ActivationDataFlavor(Message.class, "message/rfc822", "Message")};

    public Object getContent(DataSource dataSource) throws IOException {
        Session session;
        try {
            if (dataSource instanceof MessageAware) {
                session = ((MessageAware) dataSource).getMessageContext().getSession();
            } else {
                session = Session.getDefaultInstance(new Properties(), (Authenticator) null);
            }
            return new MimeMessage(session, dataSource.getInputStream());
        } catch (MessagingException e) {
            IOException iOException = new IOException("Exception creating MimeMessage in message/rfc822 DataContentHandler");
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* access modifiers changed from: protected */
    public ActivationDataFlavor[] getDataFlavors() {
        return ourDataFlavor;
    }

    public void writeTo(Object obj, String str, OutputStream outputStream) throws IOException {
        if (obj instanceof Message) {
            try {
                ((Message) obj).writeTo(outputStream);
            } catch (MessagingException e) {
                IOException iOException = new IOException("Exception writing message");
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            throw new IOException("\"" + getDataFlavors()[0].getMimeType() + "\" DataContentHandler requires Message object, was given object of type " + obj.getClass().toString() + "; obj.cl " + obj.getClass().getClassLoader() + ", Message.cl " + Message.class.getClassLoader());
        }
    }
}
