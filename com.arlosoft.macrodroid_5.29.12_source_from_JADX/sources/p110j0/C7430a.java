package p110j0;

import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Security;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

/* renamed from: j0.a */
/* compiled from: GMailSender */
public class C7430a extends Authenticator {

    /* renamed from: a */
    private final String f18184a = "smtp.gmail.com";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f18185b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f18186c;

    /* renamed from: d */
    private final Session f18187d;

    /* renamed from: j0.a$a */
    /* compiled from: GMailSender */
    class C7431a extends Authenticator {
        C7431a() {
        }

        /* access modifiers changed from: protected */
        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(C7430a.this.f18185b, C7430a.this.f18186c);
        }
    }

    /* renamed from: j0.a$b */
    /* compiled from: GMailSender */
    class C7432b extends FileDataSource {
        C7432b(File file) {
            super(file);
        }

        public String getContentType() {
            return "application/octet-stream";
        }
    }

    /* renamed from: j0.a$c */
    /* compiled from: GMailSender */
    public class C7433c implements DataSource {

        /* renamed from: a */
        private final byte[] f18190a;

        /* renamed from: b */
        private String f18191b;

        public C7433c(byte[] bArr, String str) {
            this.f18190a = bArr;
            this.f18191b = str;
        }

        public String getContentType() {
            String str = this.f18191b;
            return str == null ? "application/octet-stream" : str;
        }

        public InputStream getInputStream() throws IOException {
            return new ByteArrayInputStream(this.f18190a);
        }

        public String getName() {
            return "ByteArrayDataSource";
        }

        public OutputStream getOutputStream() throws IOException {
            throw new IOException("Not Supported");
        }
    }

    static {
        Security.addProvider(new C7434c());
    }

    public C7430a(String str, String str2) {
        this.f18185b = str;
        this.f18186c = str2;
        Properties properties = new Properties();
        properties.setProperty("mail.transport.protocol", "smtp");
        properties.setProperty("mail.host", "smtp.gmail.com");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.fallback", "false");
        properties.setProperty("mail.smtp.quitwait", "false");
        this.f18187d = Session.getInstance(properties, new C7431a());
    }

    /* renamed from: c */
    public synchronized void mo37546c(String str, String str2, String str3, String str4) throws Exception {
        try {
            MimeMessage mimeMessage = new MimeMessage(this.f18187d);
            DataHandler dataHandler = new DataHandler((DataSource) new C7433c(str2.getBytes(), "text/plain"));
            mimeMessage.setSender(new InternetAddress(str3));
            mimeMessage.setSubject(str);
            mimeMessage.setDataHandler(dataHandler);
            if (str4.indexOf(44) > 0) {
                mimeMessage.setRecipients(Message.RecipientType.f61338TO, (Address[]) InternetAddress.parse(str4));
            } else {
                mimeMessage.setRecipient(Message.RecipientType.f61338TO, new InternetAddress(str4));
            }
            Transport.send(mimeMessage);
        } catch (Throwable th) {
            C4878b.m18868g("Could not send email: " + th);
        }
        return;
    }

    /* renamed from: d */
    public synchronized void mo37547d(String str, String str2, String str3, String str4, File file) throws Exception {
        mo37548e(str, str2, str3, str4, file, file.getName());
    }

    /* renamed from: e */
    public synchronized void mo37548e(String str, String str2, String str3, String str4, File file, String str5) throws Exception {
        MimeMessage mimeMessage = new MimeMessage(this.f18187d);
        mimeMessage.setSender(new InternetAddress(str3));
        mimeMessage.setSubject(str);
        mimeMessage.setSentDate(new Date());
        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setDataHandler(new DataHandler((DataSource) new C7432b(file)));
        mimeBodyPart.setFileName(MimeUtility.encodeText(str5));
        MimeMultipart mimeMultipart = new MimeMultipart();
        mimeMultipart.addBodyPart(mimeBodyPart);
        mimeMessage.setContent(mimeMultipart);
        if (str4.indexOf(44) > 0) {
            mimeMessage.setRecipients(Message.RecipientType.f61338TO, (Address[]) InternetAddress.parse(str4));
        } else {
            mimeMessage.setRecipient(Message.RecipientType.f61338TO, new InternetAddress(str4));
        }
        Transport.send(mimeMessage);
    }
}
