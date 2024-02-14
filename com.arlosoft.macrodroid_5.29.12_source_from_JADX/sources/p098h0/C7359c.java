package p098h0;

import android.content.Context;
import com.arlosoft.macrodroid.utils.C6383g0;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.Base64;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.model.Message;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.AuthenticationFailedException;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;
import org.apache.commons.p353io.IOUtils;

/* renamed from: h0.c */
/* compiled from: GMailOauthSender */
public class C7359c {

    /* renamed from: h0.c$a */
    /* compiled from: GMailOauthSender */
    class C7360a extends FileDataSource {
        C7360a(File file) {
            super(file);
        }

        public String getContentType() {
            return "application/octet-stream";
        }
    }

    /* renamed from: a */
    private static Message m30402a(MimeMessage mimeMessage) throws MessagingException, IOException {
        Message message = new Message();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mimeMessage.writeTo(byteArrayOutputStream);
            message.mo60926o(Base64.m72636c(byteArrayOutputStream.toByteArray()));
        } catch (Throwable unused) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z");
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Date: " + simpleDateFormat.format(new Date()) + IOUtils.LINE_SEPARATOR_WINDOWS);
            stringBuffer.append("From: " + mimeMessage.getFrom()[0] + IOUtils.LINE_SEPARATOR_WINDOWS);
            stringBuffer.append("To: " + mimeMessage.getAllRecipients()[0] + IOUtils.LINE_SEPARATOR_WINDOWS);
            stringBuffer.append("Subject: " + mimeMessage.getSubject() + IOUtils.LINE_SEPARATOR_WINDOWS);
            stringBuffer.append("MIME-Version: 1.0\r\n");
            stringBuffer.append("Content-Type: text/plain; charset=us-ascii\r\n");
            stringBuffer.append("Content-Transfer-Encoding: 7bit\r\n");
            stringBuffer.append("\r\n\r\n" + mimeMessage.getContent());
            message.mo60926o(Base64.m72636c(stringBuffer.toString().getBytes()));
        }
        return message;
    }

    /* renamed from: b */
    public synchronized void mo37334b(Context context, String str, String str2, String str3, String str4, String str5) throws Exception {
        C6383g0 d = C6383g0.m24633d(context.getApplicationContext());
        GoogleAccountCredential c = d.mo32426c();
        if (c.mo60271b() != null) {
            Session defaultInstance = Session.getDefaultInstance(new Properties(), (Authenticator) null);
            String str6 = c.mo60270a().name;
            MimeMessage mimeMessage = new MimeMessage(defaultInstance);
            mimeMessage.setFrom((Address) new InternetAddress(str6));
            for (String internetAddress : str5.split("[,;]")) {
                mimeMessage.addRecipient(Message.RecipientType.f61338TO, new InternetAddress(internetAddress));
            }
            mimeMessage.setSubject(str);
            mimeMessage.setText(str2);
            new Gmail.Builder(AndroidHttp.m71648a(), JacksonFactory.m72308m(), c).mo60802i("MacroDroid").mo60801h().mo60800l().mo60806a().mo60822a(str6, m30402a(mimeMessage)).mo60316h();
        } else {
            d.mo32428g();
            throw new AuthenticationFailedException();
        }
    }

    /* renamed from: c */
    public synchronized void mo37335c(Context context, String str, String str2, String str3, String str4, String str5, File file) throws Exception {
        mo37336d(context, str, str2, str3, str4, str5, file, file.getName());
    }

    /* renamed from: d */
    public synchronized void mo37336d(Context context, String str, String str2, String str3, String str4, String str5, File file, String str6) throws Exception {
        C6383g0 d = C6383g0.m24633d(context.getApplicationContext());
        GoogleAccountCredential c = d.mo32426c();
        if (c.mo60271b() != null) {
            Session defaultInstance = Session.getDefaultInstance(new Properties(), (Authenticator) null);
            String str7 = c.mo60270a().name;
            MimeMessage mimeMessage = new MimeMessage(defaultInstance);
            mimeMessage.setFrom((Address) new InternetAddress(str7));
            mimeMessage.addRecipient(Message.RecipientType.f61338TO, new InternetAddress(str5));
            mimeMessage.setSubject(str);
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(str2, "text/plain");
            mimeBodyPart.setHeader("Content-Type", "text/plain; charset=\"UTF-8\"");
            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(mimeBodyPart);
            MimeBodyPart mimeBodyPart2 = new MimeBodyPart();
            mimeBodyPart2.setDataHandler(new DataHandler((DataSource) new C7360a(file)));
            mimeBodyPart2.setFileName(MimeUtility.encodeText(str6));
            mimeMultipart.addBodyPart(mimeBodyPart2);
            mimeMessage.setContent(mimeMultipart);
            Gmail h = new Gmail.Builder(AndroidHttp.m71648a(), JacksonFactory.m72308m(), c).mo60802i("MacroDroid").mo60801h();
            h.mo60800l().mo60806a().mo60822a(str7, m30402a(mimeMessage)).mo60316h();
        } else {
            d.mo32428g();
            throw new AuthenticationFailedException();
        }
    }
}
