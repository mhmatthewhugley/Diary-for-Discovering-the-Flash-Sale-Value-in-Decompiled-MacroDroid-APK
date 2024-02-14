package com.sun.mail.handlers;

import java.io.IOException;
import java.io.OutputStream;
import javax.activation.ActivationDataFlavor;
import javax.activation.DataSource;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.MimeMultipart;

public class multipart_mixed extends handler_base {
    private static ActivationDataFlavor[] myDF = {new ActivationDataFlavor(Multipart.class, "multipart/mixed", "Multipart")};

    public Object getContent(DataSource dataSource) throws IOException {
        try {
            return new MimeMultipart(dataSource);
        } catch (MessagingException e) {
            IOException iOException = new IOException("Exception while constructing MimeMultipart");
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* access modifiers changed from: protected */
    public ActivationDataFlavor[] getDataFlavors() {
        return myDF;
    }

    public void writeTo(Object obj, String str, OutputStream outputStream) throws IOException {
        if (obj instanceof Multipart) {
            try {
                ((Multipart) obj).writeTo(outputStream);
            } catch (MessagingException e) {
                IOException iOException = new IOException("Exception writing Multipart");
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            throw new IOException("\"" + getDataFlavors()[0].getMimeType() + "\" DataContentHandler requires Multipart object, was given object of type " + obj.getClass().toString() + "; obj.cl " + obj.getClass().getClassLoader() + ", Multipart.cl " + Multipart.class.getClassLoader());
        }
    }
}
