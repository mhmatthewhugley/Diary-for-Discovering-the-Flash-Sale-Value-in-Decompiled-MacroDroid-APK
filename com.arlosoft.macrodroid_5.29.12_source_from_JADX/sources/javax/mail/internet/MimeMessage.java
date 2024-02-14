package javax.mail.internet;

import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.FolderClosedIOException;
import com.sun.mail.util.LineOutputStream;
import com.sun.mail.util.MessageRemovedIOException;
import com.sun.mail.util.MimeUtil;
import com.sun.mail.util.PropUtil;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.mail.Address;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.FolderClosedException;
import javax.mail.Header;
import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.internet.MimeBodyPart;
import javax.mail.util.SharedByteArrayInputStream;
import org.apache.http.protocol.HTTP;

public class MimeMessage extends Message implements MimePart {
    private static final Flags answeredFlag = new Flags(Flags.Flag.ANSWERED);
    private static final MailDateFormat mailDateFormat = new MailDateFormat();
    private boolean allowutf8;
    protected Object cachedContent;
    protected byte[] content;
    protected InputStream contentStream;

    /* renamed from: dh */
    protected DataHandler f61343dh;
    protected Flags flags;
    protected InternetHeaders headers;
    protected boolean modified;
    protected boolean saved;
    private boolean strict;

    public static class RecipientType extends Message.RecipientType {
        public static final RecipientType NEWSGROUPS = new RecipientType("Newsgroups");
        private static final long serialVersionUID = -5468290701714395543L;

        protected RecipientType(String str) {
            super(str);
        }

        /* access modifiers changed from: protected */
        public Object readResolve() throws ObjectStreamException {
            if (this.type.equals("Newsgroups")) {
                return NEWSGROUPS;
            }
            return super.readResolve();
        }
    }

    public MimeMessage(Session session) {
        super(session);
        this.saved = false;
        this.strict = true;
        this.allowutf8 = false;
        this.modified = true;
        this.headers = new InternetHeaders();
        this.flags = new Flags();
        initStrict();
    }

    private void addAddressHeader(String str, Address[] addressArr) throws MessagingException {
        String str2;
        if (addressArr != null && addressArr.length != 0) {
            Address[] addressHeader = getAddressHeader(str);
            if (!(addressHeader == null || addressHeader.length == 0)) {
                Address[] addressArr2 = new Address[(addressHeader.length + addressArr.length)];
                System.arraycopy(addressHeader, 0, addressArr2, 0, addressHeader.length);
                System.arraycopy(addressArr, 0, addressArr2, addressHeader.length, addressArr.length);
                addressArr = addressArr2;
            }
            if (this.allowutf8) {
                str2 = InternetAddress.toUnicodeString(addressArr, str.length() + 2);
            } else {
                str2 = InternetAddress.toString(addressArr, str.length() + 2);
            }
            if (str2 != null) {
                setHeader(str, str2);
            }
        }
    }

    private Address[] eliminateDuplicates(List<Address> list, Address[] addressArr) {
        Address[] addressArr2;
        boolean z;
        if (addressArr == null) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < addressArr.length; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= list.size()) {
                    z = false;
                    break;
                } else if (((InternetAddress) list.get(i3)).equals(addressArr[i2])) {
                    i++;
                    addressArr[i2] = null;
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (!z) {
                list.add(addressArr[i2]);
            }
        }
        if (i == 0) {
            return addressArr;
        }
        if (addressArr instanceof InternetAddress[]) {
            addressArr2 = new InternetAddress[(addressArr.length - i)];
        } else {
            addressArr2 = new Address[(addressArr.length - i)];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < addressArr.length; i5++) {
            if (addressArr[i5] != null) {
                addressArr2[i4] = addressArr[i5];
                i4++;
            }
        }
        return addressArr2;
    }

    private Address[] getAddressHeader(String str) throws MessagingException {
        String header = getHeader(str, ",");
        if (header == null) {
            return null;
        }
        return InternetAddress.parseHeader(header, this.strict);
    }

    private String getHeaderName(Message.RecipientType recipientType) throws MessagingException {
        if (recipientType == Message.RecipientType.f61338TO) {
            return "To";
        }
        if (recipientType == Message.RecipientType.f61337CC) {
            return "Cc";
        }
        if (recipientType == Message.RecipientType.BCC) {
            return "Bcc";
        }
        if (recipientType == RecipientType.NEWSGROUPS) {
            return "Newsgroups";
        }
        throw new MessagingException("Invalid Recipient Type");
    }

    private void initStrict() {
        Session session = this.session;
        if (session != null) {
            Properties properties = session.getProperties();
            this.strict = PropUtil.getBooleanProperty(properties, "mail.mime.address.strict", true);
            this.allowutf8 = PropUtil.getBooleanProperty(properties, "mail.mime.allowutf8", false);
        }
    }

    private void setAddressHeader(String str, Address[] addressArr) throws MessagingException {
        String str2;
        if (this.allowutf8) {
            str2 = InternetAddress.toUnicodeString(addressArr, str.length() + 2);
        } else {
            str2 = InternetAddress.toString(addressArr, str.length() + 2);
        }
        if (str2 == null) {
            removeHeader(str);
        } else {
            setHeader(str, str2);
        }
    }

    public void addFrom(Address[] addressArr) throws MessagingException {
        addAddressHeader("From", addressArr);
    }

    public void addHeader(String str, String str2) throws MessagingException {
        this.headers.addHeader(str, str2);
    }

    public void addHeaderLine(String str) throws MessagingException {
        this.headers.addHeaderLine(str);
    }

    public void addRecipients(Message.RecipientType recipientType, Address[] addressArr) throws MessagingException {
        if (recipientType == RecipientType.NEWSGROUPS) {
            String newsAddress = NewsAddress.toString(addressArr);
            if (newsAddress != null) {
                addHeader("Newsgroups", newsAddress);
                return;
            }
            return;
        }
        addAddressHeader(getHeaderName(recipientType), addressArr);
    }

    /* access modifiers changed from: protected */
    public InternetHeaders createInternetHeaders(InputStream inputStream) throws MessagingException {
        return new InternetHeaders(inputStream, this.allowutf8);
    }

    /* access modifiers changed from: protected */
    public MimeMessage createMimeMessage(Session session) throws MessagingException {
        return new MimeMessage(session);
    }

    public Enumeration<String> getAllHeaderLines() throws MessagingException {
        return this.headers.getAllHeaderLines();
    }

    public Enumeration<Header> getAllHeaders() throws MessagingException {
        return this.headers.getAllHeaders();
    }

    public Address[] getAllRecipients() throws MessagingException {
        Address[] allRecipients = super.getAllRecipients();
        Address[] recipients = getRecipients(RecipientType.NEWSGROUPS);
        if (recipients == null) {
            return allRecipients;
        }
        if (allRecipients == null) {
            return recipients;
        }
        Address[] addressArr = new Address[(allRecipients.length + recipients.length)];
        System.arraycopy(allRecipients, 0, addressArr, 0, allRecipients.length);
        System.arraycopy(recipients, 0, addressArr, allRecipients.length, recipients.length);
        return addressArr;
    }

    public Object getContent() throws IOException, MessagingException {
        Object obj = this.cachedContent;
        if (obj != null) {
            return obj;
        }
        try {
            Object content2 = getDataHandler().getContent();
            if (MimeBodyPart.cacheMultipart && (((content2 instanceof Multipart) || (content2 instanceof Message)) && !(this.content == null && this.contentStream == null))) {
                this.cachedContent = content2;
                if (content2 instanceof MimeMultipart) {
                    ((MimeMultipart) content2).parse();
                }
            }
            return content2;
        } catch (FolderClosedIOException e) {
            throw new FolderClosedException(e.getFolder(), e.getMessage());
        } catch (MessageRemovedIOException e2) {
            throw new MessageRemovedException(e2.getMessage());
        }
    }

    public String getContentID() throws MessagingException {
        return getHeader("Content-Id", (String) null);
    }

    public String[] getContentLanguage() throws MessagingException {
        return MimeBodyPart.getContentLanguage(this);
    }

    public String getContentMD5() throws MessagingException {
        return getHeader("Content-MD5", (String) null);
    }

    /* access modifiers changed from: protected */
    public InputStream getContentStream() throws MessagingException {
        InputStream inputStream = this.contentStream;
        if (inputStream != null) {
            return ((SharedInputStream) inputStream).newStream(0, -1);
        }
        if (this.content != null) {
            return new SharedByteArrayInputStream(this.content);
        }
        throw new MessagingException("No MimeMessage content");
    }

    public String getContentType() throws MessagingException {
        String cleanContentType = MimeUtil.cleanContentType(this, getHeader("Content-Type", (String) null));
        return cleanContentType == null ? "text/plain" : cleanContentType;
    }

    public synchronized DataHandler getDataHandler() throws MessagingException {
        if (this.f61343dh == null) {
            this.f61343dh = new MimeBodyPart.MimePartDataHandler(this);
        }
        return this.f61343dh;
    }

    public String getDescription() throws MessagingException {
        return MimeBodyPart.getDescription(this);
    }

    public String getDisposition() throws MessagingException {
        return MimeBodyPart.getDisposition(this);
    }

    public String getEncoding() throws MessagingException {
        return MimeBodyPart.getEncoding(this);
    }

    public String getFileName() throws MessagingException {
        return MimeBodyPart.getFileName(this);
    }

    public synchronized Flags getFlags() throws MessagingException {
        return (Flags) this.flags.clone();
    }

    public Address[] getFrom() throws MessagingException {
        Address[] addressHeader = getAddressHeader("From");
        return addressHeader == null ? getAddressHeader("Sender") : addressHeader;
    }

    public String[] getHeader(String str) throws MessagingException {
        return this.headers.getHeader(str);
    }

    public InputStream getInputStream() throws IOException, MessagingException {
        return getDataHandler().getInputStream();
    }

    public int getLineCount() throws MessagingException {
        return -1;
    }

    public Enumeration<String> getMatchingHeaderLines(String[] strArr) throws MessagingException {
        return this.headers.getMatchingHeaderLines(strArr);
    }

    public Enumeration<Header> getMatchingHeaders(String[] strArr) throws MessagingException {
        return this.headers.getMatchingHeaders(strArr);
    }

    public String getMessageID() throws MessagingException {
        return getHeader("Message-ID", (String) null);
    }

    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) throws MessagingException {
        return this.headers.getNonMatchingHeaderLines(strArr);
    }

    public Enumeration<Header> getNonMatchingHeaders(String[] strArr) throws MessagingException {
        return this.headers.getNonMatchingHeaders(strArr);
    }

    public InputStream getRawInputStream() throws MessagingException {
        return getContentStream();
    }

    public Date getReceivedDate() throws MessagingException {
        return null;
    }

    public Address[] getRecipients(Message.RecipientType recipientType) throws MessagingException {
        if (recipientType != RecipientType.NEWSGROUPS) {
            return getAddressHeader(getHeaderName(recipientType));
        }
        String header = getHeader("Newsgroups", ",");
        if (header == null) {
            return null;
        }
        return NewsAddress.parse(header);
    }

    public Address[] getReplyTo() throws MessagingException {
        Address[] addressHeader = getAddressHeader("Reply-To");
        return (addressHeader == null || addressHeader.length == 0) ? getFrom() : addressHeader;
    }

    public Address getSender() throws MessagingException {
        Address[] addressHeader = getAddressHeader("Sender");
        if (addressHeader == null || addressHeader.length == 0) {
            return null;
        }
        return addressHeader[0];
    }

    public Date getSentDate() throws MessagingException {
        Date parse;
        String header = getHeader(HTTP.DATE_HEADER, (String) null);
        if (header != null) {
            try {
                MailDateFormat mailDateFormat2 = mailDateFormat;
                synchronized (mailDateFormat2) {
                    parse = mailDateFormat2.parse(header);
                }
                return parse;
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    public int getSize() throws MessagingException {
        byte[] bArr = this.content;
        if (bArr != null) {
            return bArr.length;
        }
        InputStream inputStream = this.contentStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            int available = inputStream.available();
            if (available > 0) {
                return available;
            }
            return -1;
        } catch (IOException unused) {
            return -1;
        }
    }

    public String getSubject() throws MessagingException {
        String header = getHeader("Subject", (String) null);
        if (header == null) {
            return null;
        }
        try {
            return MimeUtility.decodeText(MimeUtility.unfold(header));
        } catch (UnsupportedEncodingException unused) {
            return header;
        }
    }

    public boolean isMimeType(String str) throws MessagingException {
        return MimeBodyPart.isMimeType(this, str);
    }

    public synchronized boolean isSet(Flags.Flag flag) throws MessagingException {
        return this.flags.contains(flag);
    }

    /* access modifiers changed from: protected */
    public void parse(InputStream inputStream) throws MessagingException {
        if (!(inputStream instanceof ByteArrayInputStream) && !(inputStream instanceof BufferedInputStream) && !(inputStream instanceof SharedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        this.headers = createInternetHeaders(inputStream);
        if (inputStream instanceof SharedInputStream) {
            SharedInputStream sharedInputStream = (SharedInputStream) inputStream;
            this.contentStream = sharedInputStream.newStream(sharedInputStream.getPosition(), -1);
        } else {
            try {
                this.content = ASCIIUtility.getBytes(inputStream);
            } catch (IOException e) {
                throw new MessagingException("IOException", e);
            }
        }
        this.modified = false;
    }

    public void removeHeader(String str) throws MessagingException {
        this.headers.removeHeader(str);
    }

    public Message reply(boolean z) throws MessagingException {
        return reply(z, true);
    }

    public void saveChanges() throws MessagingException {
        this.modified = true;
        this.saved = true;
        updateHeaders();
    }

    public void setContent(Object obj, String str) throws MessagingException {
        if (obj instanceof Multipart) {
            setContent((Multipart) obj);
        } else {
            setDataHandler(new DataHandler(obj, str));
        }
    }

    public void setContentID(String str) throws MessagingException {
        if (str == null) {
            removeHeader("Content-ID");
        } else {
            setHeader("Content-ID", str);
        }
    }

    public void setContentLanguage(String[] strArr) throws MessagingException {
        MimeBodyPart.setContentLanguage(this, strArr);
    }

    public void setContentMD5(String str) throws MessagingException {
        setHeader("Content-MD5", str);
    }

    public synchronized void setDataHandler(DataHandler dataHandler) throws MessagingException {
        this.f61343dh = dataHandler;
        this.cachedContent = null;
        MimeBodyPart.invalidateContentHeaders(this);
    }

    public void setDescription(String str) throws MessagingException {
        setDescription(str, (String) null);
    }

    public void setDisposition(String str) throws MessagingException {
        MimeBodyPart.setDisposition(this, str);
    }

    public void setFileName(String str) throws MessagingException {
        MimeBodyPart.setFileName(this, str);
    }

    public synchronized void setFlags(Flags flags2, boolean z) throws MessagingException {
        if (z) {
            this.flags.add(flags2);
        } else {
            this.flags.remove(flags2);
        }
    }

    public void setFrom(Address address) throws MessagingException {
        if (address == null) {
            removeHeader("From");
            return;
        }
        setAddressHeader("From", new Address[]{address});
    }

    public void setHeader(String str, String str2) throws MessagingException {
        this.headers.setHeader(str, str2);
    }

    public void setRecipients(Message.RecipientType recipientType, Address[] addressArr) throws MessagingException {
        if (recipientType != RecipientType.NEWSGROUPS) {
            setAddressHeader(getHeaderName(recipientType), addressArr);
        } else if (addressArr == null || addressArr.length == 0) {
            removeHeader("Newsgroups");
        } else {
            setHeader("Newsgroups", NewsAddress.toString(addressArr));
        }
    }

    public void setReplyTo(Address[] addressArr) throws MessagingException {
        setAddressHeader("Reply-To", addressArr);
    }

    public void setSender(Address address) throws MessagingException {
        if (address == null) {
            removeHeader("Sender");
            return;
        }
        setAddressHeader("Sender", new Address[]{address});
    }

    public void setSentDate(Date date) throws MessagingException {
        if (date == null) {
            removeHeader(HTTP.DATE_HEADER);
            return;
        }
        MailDateFormat mailDateFormat2 = mailDateFormat;
        synchronized (mailDateFormat2) {
            setHeader(HTTP.DATE_HEADER, mailDateFormat2.format(date));
        }
    }

    public void setSubject(String str) throws MessagingException {
        setSubject(str, (String) null);
    }

    public void setText(String str) throws MessagingException {
        setText(str, (String) null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|(2:9|10)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void updateHeaders() throws javax.mail.MessagingException {
        /*
            r3 = this;
            monitor-enter(r3)
            javax.mail.internet.MimeBodyPart.updateHeaders(r3)     // Catch:{ all -> 0x003f }
            java.lang.String r0 = "MIME-Version"
            java.lang.String r1 = "1.0"
            r3.setHeader(r0, r1)     // Catch:{ all -> 0x003f }
            java.lang.String r0 = "Date"
            java.lang.String[] r0 = r3.getHeader(r0)     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x001b
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x003f }
            r0.<init>()     // Catch:{ all -> 0x003f }
            r3.setSentDate(r0)     // Catch:{ all -> 0x003f }
        L_0x001b:
            r3.updateMessageID()     // Catch:{ all -> 0x003f }
            java.lang.Object r0 = r3.cachedContent     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003d
            javax.activation.DataHandler r0 = new javax.activation.DataHandler     // Catch:{ all -> 0x003f }
            java.lang.Object r1 = r3.cachedContent     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.getContentType()     // Catch:{ all -> 0x003f }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x003f }
            r3.f61343dh = r0     // Catch:{ all -> 0x003f }
            r0 = 0
            r3.cachedContent = r0     // Catch:{ all -> 0x003f }
            r3.content = r0     // Catch:{ all -> 0x003f }
            java.io.InputStream r1 = r3.contentStream     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            r3.contentStream = r0     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r3)
            return
        L_0x003f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.MimeMessage.updateHeaders():void");
    }

    /* access modifiers changed from: protected */
    public void updateMessageID() throws MessagingException {
        setHeader("Message-ID", "<" + UniqueValue.getUniqueMessageIDValue(this.session) + ">");
    }

    public void writeTo(OutputStream outputStream) throws IOException, MessagingException {
        writeTo(outputStream, (String[]) null);
    }

    public String getHeader(String str, String str2) throws MessagingException {
        return this.headers.getHeader(str, str2);
    }

    public Message reply(boolean z, boolean z2) throws MessagingException {
        MimeMessage createMimeMessage = createMimeMessage(this.session);
        String header = getHeader("Subject", (String) null);
        if (header != null) {
            if (!header.regionMatches(true, 0, "Re: ", 0, 4)) {
                header = "Re: " + header;
            }
            createMimeMessage.setHeader("Subject", header);
        }
        Address[] replyTo = getReplyTo();
        Message.RecipientType recipientType = Message.RecipientType.f61338TO;
        createMimeMessage.setRecipients(recipientType, replyTo);
        if (z) {
            ArrayList arrayList = new ArrayList();
            InternetAddress localAddress = InternetAddress.getLocalAddress(this.session);
            if (localAddress != null) {
                arrayList.add(localAddress);
            }
            Session session = this.session;
            String property = session != null ? session.getProperty("mail.alternates") : null;
            boolean z3 = false;
            if (property != null) {
                eliminateDuplicates(arrayList, InternetAddress.parse(property, false));
            }
            Session session2 = this.session;
            if (session2 != null) {
                z3 = PropUtil.getBooleanProperty(session2.getProperties(), "mail.replyallcc", false);
            }
            eliminateDuplicates(arrayList, replyTo);
            Address[] eliminateDuplicates = eliminateDuplicates(arrayList, getRecipients(recipientType));
            if (eliminateDuplicates != null && eliminateDuplicates.length > 0) {
                if (z3) {
                    createMimeMessage.addRecipients(Message.RecipientType.f61337CC, eliminateDuplicates);
                } else {
                    createMimeMessage.addRecipients(recipientType, eliminateDuplicates);
                }
            }
            Message.RecipientType recipientType2 = Message.RecipientType.f61337CC;
            Address[] eliminateDuplicates2 = eliminateDuplicates(arrayList, getRecipients(recipientType2));
            if (eliminateDuplicates2 != null && eliminateDuplicates2.length > 0) {
                createMimeMessage.addRecipients(recipientType2, eliminateDuplicates2);
            }
            RecipientType recipientType3 = RecipientType.NEWSGROUPS;
            Address[] recipients = getRecipients(recipientType3);
            if (recipients != null && recipients.length > 0) {
                createMimeMessage.setRecipients((Message.RecipientType) recipientType3, recipients);
            }
        }
        String header2 = getHeader("Message-Id", (String) null);
        if (header2 != null) {
            createMimeMessage.setHeader("In-Reply-To", header2);
        }
        String header3 = getHeader("References", " ");
        if (header3 == null) {
            header3 = getHeader("In-Reply-To", " ");
        }
        if (header2 == null) {
            header2 = header3;
        } else if (header3 != null) {
            header2 = MimeUtility.unfold(header3) + " " + header2;
        }
        if (header2 != null) {
            createMimeMessage.setHeader("References", MimeUtility.fold(12, header2));
        }
        if (z2) {
            try {
                setFlags(answeredFlag, true);
            } catch (MessagingException unused) {
            }
        }
        return createMimeMessage;
    }

    public void setDescription(String str, String str2) throws MessagingException {
        MimeBodyPart.setDescription(this, str, str2);
    }

    public void setSubject(String str, String str2) throws MessagingException {
        if (str == null) {
            removeHeader("Subject");
            return;
        }
        try {
            setHeader("Subject", MimeUtility.fold(9, MimeUtility.encodeText(str, str2, (String) null)));
        } catch (UnsupportedEncodingException e) {
            throw new MessagingException("Encoding error", e);
        }
    }

    public void setText(String str, String str2) throws MessagingException {
        MimeBodyPart.setText(this, str, str2, "plain");
    }

    public void writeTo(OutputStream outputStream, String[] strArr) throws IOException, MessagingException {
        if (!this.saved) {
            saveChanges();
        }
        if (this.modified) {
            MimeBodyPart.writeTo(this, outputStream, strArr);
            return;
        }
        Enumeration<String> nonMatchingHeaderLines = getNonMatchingHeaderLines(strArr);
        LineOutputStream lineOutputStream = new LineOutputStream(outputStream, this.allowutf8);
        while (nonMatchingHeaderLines.hasMoreElements()) {
            lineOutputStream.writeln(nonMatchingHeaderLines.nextElement());
        }
        lineOutputStream.writeln();
        byte[] bArr = this.content;
        if (bArr == null) {
            InputStream inputStream = null;
            byte[] bArr2 = new byte[8192];
            try {
                InputStream contentStream2 = getContentStream();
                while (true) {
                    int read = contentStream2.read(bArr2);
                    if (read <= 0) {
                        break;
                    }
                    outputStream.write(bArr2, 0, read);
                }
                contentStream2.close();
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } else {
            outputStream.write(bArr);
        }
        outputStream.flush();
    }

    public void setFrom(String str) throws MessagingException {
        if (str == null) {
            removeHeader("From");
        } else {
            setAddressHeader("From", InternetAddress.parse(str));
        }
    }

    public void setText(String str, String str2, String str3) throws MessagingException {
        MimeBodyPart.setText(this, str, str2, str3);
    }

    public void setContent(Multipart multipart) throws MessagingException {
        setDataHandler(new DataHandler(multipart, multipart.getContentType()));
        multipart.setParent(this);
    }

    public void addRecipients(Message.RecipientType recipientType, String str) throws MessagingException {
        if (recipientType != RecipientType.NEWSGROUPS) {
            addAddressHeader(getHeaderName(recipientType), InternetAddress.parse(str));
        } else if (str != null && str.length() != 0) {
            addHeader("Newsgroups", str);
        }
    }

    public void setFrom() throws MessagingException {
        try {
            InternetAddress _getLocalAddress = InternetAddress._getLocalAddress(this.session);
            if (_getLocalAddress != null) {
                setFrom((Address) _getLocalAddress);
                return;
            }
            throw new MessagingException("No From address");
        } catch (Exception e) {
            throw new MessagingException("No From address", e);
        }
    }

    public void setRecipients(Message.RecipientType recipientType, String str) throws MessagingException {
        InternetAddress[] internetAddressArr;
        if (recipientType != RecipientType.NEWSGROUPS) {
            String headerName = getHeaderName(recipientType);
            if (str == null) {
                internetAddressArr = null;
            } else {
                internetAddressArr = InternetAddress.parse(str);
            }
            setAddressHeader(headerName, internetAddressArr);
        } else if (str == null || str.length() == 0) {
            removeHeader("Newsgroups");
        } else {
            setHeader("Newsgroups", str);
        }
    }

    public MimeMessage(Session session, InputStream inputStream) throws MessagingException {
        super(session);
        this.modified = false;
        this.saved = false;
        this.strict = true;
        this.allowutf8 = false;
        this.flags = new Flags();
        initStrict();
        parse(inputStream);
        this.saved = true;
    }

    public MimeMessage(MimeMessage mimeMessage) throws MessagingException {
        super(mimeMessage.session);
        ByteArrayOutputStream byteArrayOutputStream;
        this.modified = false;
        this.saved = false;
        this.strict = true;
        this.allowutf8 = false;
        Flags flags2 = mimeMessage.getFlags();
        this.flags = flags2;
        if (flags2 == null) {
            this.flags = new Flags();
        }
        int size = mimeMessage.getSize();
        if (size > 0) {
            byteArrayOutputStream = new ByteArrayOutputStream(size);
        } else {
            byteArrayOutputStream = new ByteArrayOutputStream();
        }
        try {
            this.strict = mimeMessage.strict;
            mimeMessage.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.close();
            SharedByteArrayInputStream sharedByteArrayInputStream = new SharedByteArrayInputStream(byteArrayOutputStream.toByteArray());
            parse(sharedByteArrayInputStream);
            sharedByteArrayInputStream.close();
            this.saved = true;
        } catch (IOException e) {
            throw new MessagingException("IOException while copying message", e);
        }
    }

    protected MimeMessage(Folder folder, int i) {
        super(folder, i);
        this.modified = false;
        this.saved = false;
        this.strict = true;
        this.allowutf8 = false;
        this.flags = new Flags();
        this.saved = true;
        initStrict();
    }

    protected MimeMessage(Folder folder, InputStream inputStream, int i) throws MessagingException {
        this(folder, i);
        initStrict();
        parse(inputStream);
    }

    protected MimeMessage(Folder folder, InternetHeaders internetHeaders, byte[] bArr, int i) throws MessagingException {
        this(folder, i);
        this.headers = internetHeaders;
        this.content = bArr;
        initStrict();
    }
}
