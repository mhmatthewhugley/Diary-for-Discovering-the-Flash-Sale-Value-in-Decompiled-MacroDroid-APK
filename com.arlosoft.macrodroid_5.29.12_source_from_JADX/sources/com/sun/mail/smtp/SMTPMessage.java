package com.sun.mail.smtp;

import java.io.InputStream;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;

public class SMTPMessage extends MimeMessage {
    public static final int NOTIFY_DELAY = 4;
    public static final int NOTIFY_FAILURE = 2;
    public static final int NOTIFY_NEVER = -1;
    public static final int NOTIFY_SUCCESS = 1;
    public static final int RETURN_FULL = 1;
    public static final int RETURN_HDRS = 2;
    private static final String[] returnOptionString = {null, "FULL", "HDRS"};
    private boolean allow8bitMIME = false;
    private String envelopeFrom;
    private String extension = null;
    private int notifyOptions = 0;
    private int returnOption = 0;
    private boolean sendPartial = false;
    private String submitter = null;

    public SMTPMessage(Session session) {
        super(session);
    }

    public boolean getAllow8bitMIME() {
        return this.allow8bitMIME;
    }

    /* access modifiers changed from: package-private */
    public String getDSNNotify() {
        int i = this.notifyOptions;
        if (i == 0) {
            return null;
        }
        if (i == -1) {
            return "NEVER";
        }
        StringBuilder sb = new StringBuilder();
        if ((this.notifyOptions & 1) != 0) {
            sb.append("SUCCESS");
        }
        if ((this.notifyOptions & 2) != 0) {
            if (sb.length() != 0) {
                sb.append(',');
            }
            sb.append("FAILURE");
        }
        if ((this.notifyOptions & 4) != 0) {
            if (sb.length() != 0) {
                sb.append(',');
            }
            sb.append("DELAY");
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public String getDSNRet() {
        return returnOptionString[this.returnOption];
    }

    public String getEnvelopeFrom() {
        return this.envelopeFrom;
    }

    public String getMailExtension() {
        return this.extension;
    }

    public int getNotifyOptions() {
        return this.notifyOptions;
    }

    public int getReturnOption() {
        return this.returnOption;
    }

    public boolean getSendPartial() {
        return this.sendPartial;
    }

    public String getSubmitter() {
        return this.submitter;
    }

    public void setAllow8bitMIME(boolean z) {
        this.allow8bitMIME = z;
    }

    public void setEnvelopeFrom(String str) {
        this.envelopeFrom = str;
    }

    public void setMailExtension(String str) {
        this.extension = str;
    }

    public void setNotifyOptions(int i) {
        if (i < -1 || i >= 8) {
            throw new IllegalArgumentException("Bad return option");
        }
        this.notifyOptions = i;
    }

    public void setReturnOption(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Bad return option");
        }
        this.returnOption = i;
    }

    public void setSendPartial(boolean z) {
        this.sendPartial = z;
    }

    public void setSubmitter(String str) {
        this.submitter = str;
    }

    public SMTPMessage(Session session, InputStream inputStream) throws MessagingException {
        super(session, inputStream);
    }

    public SMTPMessage(MimeMessage mimeMessage) throws MessagingException {
        super(mimeMessage);
    }
}
