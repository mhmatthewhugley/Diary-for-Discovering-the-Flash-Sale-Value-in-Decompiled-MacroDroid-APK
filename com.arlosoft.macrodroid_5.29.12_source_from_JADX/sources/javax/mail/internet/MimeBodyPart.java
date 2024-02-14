package javax.mail.internet;

import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.FolderClosedIOException;
import com.sun.mail.util.LineOutputStream;
import com.sun.mail.util.MessageRemovedIOException;
import com.sun.mail.util.MimeUtil;
import com.sun.mail.util.PropUtil;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.EncodingAware;
import javax.mail.FolderClosedException;
import javax.mail.Header;
import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.internet.HeaderTokenizer;
import org.apache.http.protocol.HTTP;

public class MimeBodyPart extends BodyPart implements MimePart {
    private static final boolean allowutf8 = PropUtil.getBooleanSystemProperty("mail.mime.allowutf8", true);
    static final boolean cacheMultipart = PropUtil.getBooleanSystemProperty("mail.mime.cachemultipart", true);
    private static final boolean decodeFileName = PropUtil.getBooleanSystemProperty("mail.mime.decodefilename", false);
    private static final boolean encodeFileName = PropUtil.getBooleanSystemProperty("mail.mime.encodefilename", false);
    private static final boolean ignoreMultipartEncoding = PropUtil.getBooleanSystemProperty("mail.mime.ignoremultipartencoding", true);
    private static final boolean setContentTypeFileName = PropUtil.getBooleanSystemProperty("mail.mime.setcontenttypefilename", true);
    private static final boolean setDefaultTextCharset = PropUtil.getBooleanSystemProperty("mail.mime.setdefaulttextcharset", true);
    protected Object cachedContent;
    protected byte[] content;
    protected InputStream contentStream;

    /* renamed from: dh */
    protected DataHandler f61342dh;
    protected InternetHeaders headers;

    private static class EncodedFileDataSource extends FileDataSource implements EncodingAware {
        private String contentType;
        private String encoding;

        public EncodedFileDataSource(File file, String str, String str2) {
            super(file);
            this.contentType = str;
            this.encoding = str2;
        }

        public String getContentType() {
            String str = this.contentType;
            return str != null ? str : super.getContentType();
        }

        public String getEncoding() {
            return this.encoding;
        }
    }

    static class MimePartDataHandler extends DataHandler {
        MimePart part;

        public MimePartDataHandler(MimePart mimePart) {
            super((DataSource) new MimePartDataSource(mimePart));
            this.part = mimePart;
        }

        /* access modifiers changed from: package-private */
        public InputStream getContentStream() throws MessagingException {
            MimePart mimePart = this.part;
            if (mimePart instanceof MimeBodyPart) {
                return ((MimeBodyPart) mimePart).getContentStream();
            }
            if (mimePart instanceof MimeMessage) {
                return ((MimeMessage) mimePart).getContentStream();
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public MimePart getPart() {
            return this.part;
        }
    }

    public MimeBodyPart() {
        this.headers = new InternetHeaders();
    }

    static void invalidateContentHeaders(MimePart mimePart) throws MessagingException {
        mimePart.removeHeader("Content-Type");
        mimePart.removeHeader("Content-Transfer-Encoding");
    }

    static String restrictEncoding(MimePart mimePart, String str) throws MessagingException {
        String contentType;
        if (!ignoreMultipartEncoding || str == null || str.equalsIgnoreCase("7bit") || str.equalsIgnoreCase("8bit") || str.equalsIgnoreCase("binary") || (contentType = mimePart.getContentType()) == null) {
            return str;
        }
        try {
            ContentType contentType2 = new ContentType(contentType);
            if (contentType2.match("multipart/*")) {
                return null;
            }
            if (!contentType2.match("message/*") || PropUtil.getBooleanSystemProperty("mail.mime.allowencodedmessages", false)) {
                return str;
            }
            return null;
        } catch (ParseException unused) {
        }
    }

    static void setEncoding(MimePart mimePart, String str) throws MessagingException {
        mimePart.setHeader("Content-Transfer-Encoding", str);
    }

    public void addHeader(String str, String str2) throws MessagingException {
        this.headers.addHeader(str, str2);
    }

    public void addHeaderLine(String str) throws MessagingException {
        this.headers.addHeaderLine(str);
    }

    public void attachFile(File file) throws IOException, MessagingException {
        FileDataSource fileDataSource = new FileDataSource(file);
        setDataHandler(new DataHandler((DataSource) fileDataSource));
        setFileName(fileDataSource.getName());
        setDisposition(Part.ATTACHMENT);
    }

    public Enumeration<String> getAllHeaderLines() throws MessagingException {
        return this.headers.getAllHeaderLines();
    }

    public Enumeration<Header> getAllHeaders() throws MessagingException {
        return this.headers.getAllHeaders();
    }

    public Object getContent() throws IOException, MessagingException {
        Object obj = this.cachedContent;
        if (obj != null) {
            return obj;
        }
        try {
            Object content2 = getDataHandler().getContent();
            if (cacheMultipart && (((content2 instanceof Multipart) || (content2 instanceof Message)) && !(this.content == null && this.contentStream == null))) {
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
        return getContentLanguage(this);
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
            return new ByteArrayInputStream(this.content);
        }
        throw new MessagingException("No MimeBodyPart content");
    }

    public String getContentType() throws MessagingException {
        String cleanContentType = MimeUtil.cleanContentType(this, getHeader("Content-Type", (String) null));
        return cleanContentType == null ? "text/plain" : cleanContentType;
    }

    public DataHandler getDataHandler() throws MessagingException {
        if (this.f61342dh == null) {
            this.f61342dh = new MimePartDataHandler(this);
        }
        return this.f61342dh;
    }

    public String getDescription() throws MessagingException {
        return getDescription(this);
    }

    public String getDisposition() throws MessagingException {
        return getDisposition(this);
    }

    public String getEncoding() throws MessagingException {
        return getEncoding(this);
    }

    public String getFileName() throws MessagingException {
        return getFileName(this);
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

    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) throws MessagingException {
        return this.headers.getNonMatchingHeaderLines(strArr);
    }

    public Enumeration<Header> getNonMatchingHeaders(String[] strArr) throws MessagingException {
        return this.headers.getNonMatchingHeaders(strArr);
    }

    public InputStream getRawInputStream() throws MessagingException {
        return getContentStream();
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

    public boolean isMimeType(String str) throws MessagingException {
        return isMimeType(this, str);
    }

    public void removeHeader(String str) throws MessagingException {
        this.headers.removeHeader(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.BufferedOutputStream} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|10|11|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0021 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b A[SYNTHETIC, Splitter:B:17:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0032 A[SYNTHETIC, Splitter:B:21:0x0032] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void saveFile(java.io.File r5) throws java.io.IOException, javax.mail.MessagingException {
        /*
            r4 = this;
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0027 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0027 }
            r2.<init>(r5)     // Catch:{ all -> 0x0027 }
            r1.<init>(r2)     // Catch:{ all -> 0x0027 }
            java.io.InputStream r0 = r4.getInputStream()     // Catch:{ all -> 0x0025 }
            r5 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x0025 }
        L_0x0013:
            int r2 = r0.read(r5)     // Catch:{ all -> 0x0025 }
            if (r2 <= 0) goto L_0x001e
            r3 = 0
            r1.write(r5, r3, r2)     // Catch:{ all -> 0x0025 }
            goto L_0x0013
        L_0x001e:
            r0.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            r1.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            return
        L_0x0025:
            r5 = move-exception
            goto L_0x0029
        L_0x0027:
            r5 = move-exception
            r1 = r0
        L_0x0029:
            if (r0 == 0) goto L_0x0030
            r0.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0030
        L_0x002f:
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.MimeBodyPart.saveFile(java.io.File):void");
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
        setContentLanguage(this, strArr);
    }

    public void setContentMD5(String str) throws MessagingException {
        setHeader("Content-MD5", str);
    }

    public void setDataHandler(DataHandler dataHandler) throws MessagingException {
        this.f61342dh = dataHandler;
        this.cachedContent = null;
        invalidateContentHeaders(this);
    }

    public void setDescription(String str) throws MessagingException {
        setDescription(str, (String) null);
    }

    public void setDisposition(String str) throws MessagingException {
        setDisposition(this, str);
    }

    public void setFileName(String str) throws MessagingException {
        setFileName(this, str);
    }

    public void setHeader(String str, String str2) throws MessagingException {
        this.headers.setHeader(str, str2);
    }

    public void setText(String str) throws MessagingException {
        setText(str, (String) null);
    }

    /* access modifiers changed from: protected */
    public void updateHeaders() throws MessagingException {
        updateHeaders(this);
        if (this.cachedContent != null) {
            this.f61342dh = new DataHandler(this.cachedContent, getContentType());
            this.cachedContent = null;
            this.content = null;
            InputStream inputStream = this.contentStream;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            this.contentStream = null;
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException, MessagingException {
        writeTo(this, outputStream, (String[]) null);
    }

    static String[] getContentLanguage(MimePart mimePart) throws MessagingException {
        String header = mimePart.getHeader("Content-Language", (String) null);
        if (header == null) {
            return null;
        }
        HeaderTokenizer headerTokenizer = new HeaderTokenizer(header, HeaderTokenizer.MIME);
        ArrayList arrayList = new ArrayList();
        while (true) {
            HeaderTokenizer.Token next = headerTokenizer.next();
            int type = next.getType();
            if (type == -4) {
                break;
            } else if (type == -1) {
                arrayList.add(next.getValue());
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    static String getDescription(MimePart mimePart) throws MessagingException {
        String header = mimePart.getHeader("Content-Description", (String) null);
        if (header == null) {
            return null;
        }
        try {
            return MimeUtility.decodeText(MimeUtility.unfold(header));
        } catch (UnsupportedEncodingException unused) {
            return header;
        }
    }

    static String getDisposition(MimePart mimePart) throws MessagingException {
        String header = mimePart.getHeader("Content-Disposition", (String) null);
        if (header == null) {
            return null;
        }
        return new ContentDisposition(header).getDisposition();
    }

    static String getEncoding(MimePart mimePart) throws MessagingException {
        HeaderTokenizer.Token next;
        int type;
        String header = mimePart.getHeader("Content-Transfer-Encoding", (String) null);
        if (header == null) {
            return null;
        }
        String trim = header.trim();
        if (trim.length() == 0) {
            return null;
        }
        if (trim.equalsIgnoreCase("7bit") || trim.equalsIgnoreCase("8bit") || trim.equalsIgnoreCase("quoted-printable") || trim.equalsIgnoreCase("binary") || trim.equalsIgnoreCase("base64")) {
            return trim;
        }
        HeaderTokenizer headerTokenizer = new HeaderTokenizer(trim, HeaderTokenizer.MIME);
        do {
            next = headerTokenizer.next();
            type = next.getType();
            if (type == -4) {
                return trim;
            }
        } while (type != -1);
        return next.getValue();
    }

    static String getFileName(MimePart mimePart) throws MessagingException {
        String cleanContentType;
        String header = mimePart.getHeader("Content-Disposition", (String) null);
        String parameter = header != null ? new ContentDisposition(header).getParameter("filename") : null;
        if (parameter == null && (cleanContentType = MimeUtil.cleanContentType(mimePart, mimePart.getHeader("Content-Type", (String) null))) != null) {
            try {
                parameter = new ContentType(cleanContentType).getParameter("name");
            } catch (ParseException unused) {
            }
        }
        if (!decodeFileName || parameter == null) {
            return parameter;
        }
        try {
            return MimeUtility.decodeText(parameter);
        } catch (UnsupportedEncodingException e) {
            throw new MessagingException("Can't decode filename", e);
        }
    }

    static boolean isMimeType(MimePart mimePart, String str) throws MessagingException {
        String contentType = mimePart.getContentType();
        try {
            return new ContentType(contentType).match(str);
        } catch (ParseException unused) {
            try {
                int indexOf = contentType.indexOf(59);
                if (indexOf > 0) {
                    return new ContentType(contentType.substring(0, indexOf)).match(str);
                }
            } catch (ParseException unused2) {
            }
            return contentType.equalsIgnoreCase(str);
        }
    }

    static void setContentLanguage(MimePart mimePart, String[] strArr) throws MessagingException {
        StringBuilder sb = new StringBuilder(strArr[0]);
        int length = 18 + strArr[0].length();
        for (int i = 1; i < strArr.length; i++) {
            sb.append(',');
            int i2 = length + 1;
            if (i2 > 76) {
                sb.append("\r\n\t");
                i2 = 8;
            }
            sb.append(strArr[i]);
            length = i2 + strArr[i].length();
        }
        mimePart.setHeader("Content-Language", sb.toString());
    }

    static void setDisposition(MimePart mimePart, String str) throws MessagingException {
        if (str == null) {
            mimePart.removeHeader("Content-Disposition");
            return;
        }
        String header = mimePart.getHeader("Content-Disposition", (String) null);
        if (header != null) {
            ContentDisposition contentDisposition = new ContentDisposition(header);
            contentDisposition.setDisposition(str);
            str = contentDisposition.toString();
        }
        mimePart.setHeader("Content-Disposition", str);
    }

    static void setFileName(MimePart mimePart, String str) throws MessagingException {
        String cleanContentType;
        boolean z = encodeFileName;
        if (z && str != null) {
            try {
                str = MimeUtility.encodeText(str);
            } catch (UnsupportedEncodingException e) {
                throw new MessagingException("Can't encode filename", e);
            }
        }
        String header = mimePart.getHeader("Content-Disposition", (String) null);
        if (header == null) {
            header = Part.ATTACHMENT;
        }
        ContentDisposition contentDisposition = new ContentDisposition(header);
        String defaultMIMECharset = MimeUtility.getDefaultMIMECharset();
        ParameterList parameterList = contentDisposition.getParameterList();
        if (parameterList == null) {
            parameterList = new ParameterList();
            contentDisposition.setParameterList(parameterList);
        }
        if (z) {
            parameterList.setLiteral("filename", str);
        } else {
            parameterList.set("filename", str, defaultMIMECharset);
        }
        mimePart.setHeader("Content-Disposition", contentDisposition.toString());
        if (setContentTypeFileName && (cleanContentType = MimeUtil.cleanContentType(mimePart, mimePart.getHeader("Content-Type", (String) null))) != null) {
            try {
                ContentType contentType = new ContentType(cleanContentType);
                ParameterList parameterList2 = contentType.getParameterList();
                if (parameterList2 == null) {
                    parameterList2 = new ParameterList();
                    contentType.setParameterList(parameterList2);
                }
                if (z) {
                    parameterList2.setLiteral("name", str);
                } else {
                    parameterList2.set("name", str, defaultMIMECharset);
                }
                mimePart.setHeader("Content-Type", contentType.toString());
            } catch (ParseException unused) {
            }
        }
    }

    static void writeTo(MimePart mimePart, OutputStream outputStream, String[] strArr) throws IOException, MessagingException {
        LineOutputStream lineOutputStream;
        if (outputStream instanceof LineOutputStream) {
            lineOutputStream = (LineOutputStream) outputStream;
        } else {
            lineOutputStream = new LineOutputStream(outputStream, allowutf8);
        }
        Enumeration<String> nonMatchingHeaderLines = mimePart.getNonMatchingHeaderLines(strArr);
        while (nonMatchingHeaderLines.hasMoreElements()) {
            lineOutputStream.writeln(nonMatchingHeaderLines.nextElement());
        }
        lineOutputStream.writeln();
        InputStream inputStream = null;
        try {
            DataHandler dataHandler = mimePart.getDataHandler();
            if (dataHandler instanceof MimePartDataHandler) {
                MimePartDataHandler mimePartDataHandler = (MimePartDataHandler) dataHandler;
                if (mimePartDataHandler.getPart().getEncoding() != null) {
                    inputStream = mimePartDataHandler.getContentStream();
                }
            }
            if (inputStream != null) {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                }
            } else {
                outputStream = MimeUtility.encode(outputStream, restrictEncoding(mimePart, mimePart.getEncoding()));
                mimePart.getDataHandler().writeTo(outputStream);
            }
            outputStream.flush();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public String getHeader(String str, String str2) throws MessagingException {
        return this.headers.getHeader(str, str2);
    }

    public void setDescription(String str, String str2) throws MessagingException {
        setDescription(this, str, str2);
    }

    public void setText(String str, String str2) throws MessagingException {
        setText(this, str, str2, "plain");
    }

    public MimeBodyPart(InputStream inputStream) throws MessagingException {
        if (!(inputStream instanceof ByteArrayInputStream) && !(inputStream instanceof BufferedInputStream) && !(inputStream instanceof SharedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        this.headers = new InternetHeaders(inputStream);
        if (inputStream instanceof SharedInputStream) {
            SharedInputStream sharedInputStream = (SharedInputStream) inputStream;
            this.contentStream = sharedInputStream.newStream(sharedInputStream.getPosition(), -1);
            return;
        }
        try {
            this.content = ASCIIUtility.getBytes(inputStream);
        } catch (IOException e) {
            throw new MessagingException("Error reading input stream", e);
        }
    }

    static void setDescription(MimePart mimePart, String str, String str2) throws MessagingException {
        if (str == null) {
            mimePart.removeHeader("Content-Description");
            return;
        }
        try {
            mimePart.setHeader("Content-Description", MimeUtility.fold(21, MimeUtility.encodeText(str, str2, (String) null)));
        } catch (UnsupportedEncodingException e) {
            throw new MessagingException("Encoding error", e);
        }
    }

    public void setText(String str, String str2, String str3) throws MessagingException {
        setText(this, str, str2, str3);
    }

    static void setText(MimePart mimePart, String str, String str2, String str3) throws MessagingException {
        if (str2 == null) {
            str2 = MimeUtility.checkAscii(str) != 1 ? MimeUtility.getDefaultMIMECharset() : "us-ascii";
        }
        mimePart.setContent(str, "text/" + str3 + HTTP.CHARSET_PARAM + MimeUtility.quote(str2, HeaderTokenizer.MIME));
    }

    public void setContent(Multipart multipart) throws MessagingException {
        setDataHandler(new DataHandler(multipart, multipart.getContentType()));
        multipart.setParent(this);
    }

    public void attachFile(String str) throws IOException, MessagingException {
        attachFile(new File(str));
    }

    public void attachFile(File file, String str, String str2) throws IOException, MessagingException {
        EncodedFileDataSource encodedFileDataSource = new EncodedFileDataSource(file, str, str2);
        setDataHandler(new DataHandler((DataSource) encodedFileDataSource));
        setFileName(encodedFileDataSource.getName());
        setDisposition(Part.ATTACHMENT);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (r7.match("message/rfc822") != false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void updateHeaders(javax.mail.internet.MimePart r9) throws javax.mail.MessagingException {
        /*
            java.lang.String r0 = "charset"
            java.lang.String r1 = "Content-Type"
            javax.activation.DataHandler r2 = r9.getDataHandler()
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.String r3 = r2.getContentType()     // Catch:{ IOException -> 0x0134 }
            java.lang.String[] r4 = r9.getHeader(r1)     // Catch:{ IOException -> 0x0134 }
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L_0x0019
            r4 = 1
            goto L_0x001a
        L_0x0019:
            r4 = 0
        L_0x001a:
            javax.mail.internet.ContentType r7 = new javax.mail.internet.ContentType     // Catch:{ IOException -> 0x0134 }
            r7.<init>(r3)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r8 = "multipart/*"
            boolean r8 = r7.match((java.lang.String) r8)     // Catch:{ IOException -> 0x0134 }
            if (r8 == 0) goto L_0x0083
            boolean r5 = r9 instanceof javax.mail.internet.MimeBodyPart     // Catch:{ IOException -> 0x0134 }
            if (r5 == 0) goto L_0x0038
            r5 = r9
            javax.mail.internet.MimeBodyPart r5 = (javax.mail.internet.MimeBodyPart) r5     // Catch:{ IOException -> 0x0134 }
            java.lang.Object r5 = r5.cachedContent     // Catch:{ IOException -> 0x0134 }
            if (r5 == 0) goto L_0x0033
            goto L_0x004d
        L_0x0033:
            java.lang.Object r5 = r2.getContent()     // Catch:{ IOException -> 0x0134 }
            goto L_0x004d
        L_0x0038:
            boolean r5 = r9 instanceof javax.mail.internet.MimeMessage     // Catch:{ IOException -> 0x0134 }
            if (r5 == 0) goto L_0x0049
            r5 = r9
            javax.mail.internet.MimeMessage r5 = (javax.mail.internet.MimeMessage) r5     // Catch:{ IOException -> 0x0134 }
            java.lang.Object r5 = r5.cachedContent     // Catch:{ IOException -> 0x0134 }
            if (r5 == 0) goto L_0x0044
            goto L_0x004d
        L_0x0044:
            java.lang.Object r5 = r2.getContent()     // Catch:{ IOException -> 0x0134 }
            goto L_0x004d
        L_0x0049:
            java.lang.Object r5 = r2.getContent()     // Catch:{ IOException -> 0x0134 }
        L_0x004d:
            boolean r8 = r5 instanceof javax.mail.internet.MimeMultipart     // Catch:{ IOException -> 0x0134 }
            if (r8 == 0) goto L_0x0057
            javax.mail.internet.MimeMultipart r5 = (javax.mail.internet.MimeMultipart) r5     // Catch:{ IOException -> 0x0134 }
            r5.updateHeaders()     // Catch:{ IOException -> 0x0134 }
            goto L_0x008b
        L_0x0057:
            javax.mail.MessagingException r9 = new javax.mail.MessagingException     // Catch:{ IOException -> 0x0134 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0134 }
            r0.<init>()     // Catch:{ IOException -> 0x0134 }
            java.lang.String r1 = "MIME part of type \""
            r0.append(r1)     // Catch:{ IOException -> 0x0134 }
            r0.append(r3)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r1 = "\" contains object of type "
            r0.append(r1)     // Catch:{ IOException -> 0x0134 }
            java.lang.Class r1 = r5.getClass()     // Catch:{ IOException -> 0x0134 }
            java.lang.String r1 = r1.getName()     // Catch:{ IOException -> 0x0134 }
            r0.append(r1)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r1 = " instead of MimeMultipart"
            r0.append(r1)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0134 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x0134 }
            throw r9     // Catch:{ IOException -> 0x0134 }
        L_0x0083:
            java.lang.String r8 = "message/rfc822"
            boolean r8 = r7.match((java.lang.String) r8)     // Catch:{ IOException -> 0x0134 }
            if (r8 == 0) goto L_0x008c
        L_0x008b:
            r5 = 1
        L_0x008c:
            boolean r6 = r2 instanceof javax.mail.internet.MimeBodyPart.MimePartDataHandler     // Catch:{ IOException -> 0x0134 }
            if (r6 == 0) goto L_0x00ac
            r6 = r2
            javax.mail.internet.MimeBodyPart$MimePartDataHandler r6 = (javax.mail.internet.MimeBodyPart.MimePartDataHandler) r6     // Catch:{ IOException -> 0x0134 }
            javax.mail.internet.MimePart r6 = r6.getPart()     // Catch:{ IOException -> 0x0134 }
            if (r6 == r9) goto L_0x00ab
            if (r4 == 0) goto L_0x00a2
            java.lang.String r8 = r6.getContentType()     // Catch:{ IOException -> 0x0134 }
            r9.setHeader(r1, r8)     // Catch:{ IOException -> 0x0134 }
        L_0x00a2:
            java.lang.String r6 = r6.getEncoding()     // Catch:{ IOException -> 0x0134 }
            if (r6 == 0) goto L_0x00ac
            setEncoding(r9, r6)     // Catch:{ IOException -> 0x0134 }
        L_0x00ab:
            return
        L_0x00ac:
            if (r5 != 0) goto L_0x00ed
            java.lang.String r5 = "Content-Transfer-Encoding"
            java.lang.String[] r5 = r9.getHeader(r5)     // Catch:{ IOException -> 0x0134 }
            if (r5 != 0) goto L_0x00bd
            java.lang.String r2 = javax.mail.internet.MimeUtility.getEncoding((javax.activation.DataHandler) r2)     // Catch:{ IOException -> 0x0134 }
            setEncoding(r9, r2)     // Catch:{ IOException -> 0x0134 }
        L_0x00bd:
            if (r4 == 0) goto L_0x00ed
            boolean r2 = setDefaultTextCharset     // Catch:{ IOException -> 0x0134 }
            if (r2 == 0) goto L_0x00ed
            java.lang.String r2 = "text/*"
            boolean r2 = r7.match((java.lang.String) r2)     // Catch:{ IOException -> 0x0134 }
            if (r2 == 0) goto L_0x00ed
            java.lang.String r2 = r7.getParameter(r0)     // Catch:{ IOException -> 0x0134 }
            if (r2 != 0) goto L_0x00ed
            java.lang.String r2 = r9.getEncoding()     // Catch:{ IOException -> 0x0134 }
            if (r2 == 0) goto L_0x00e2
            java.lang.String r3 = "7bit"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch:{ IOException -> 0x0134 }
            if (r2 == 0) goto L_0x00e2
            java.lang.String r2 = "us-ascii"
            goto L_0x00e6
        L_0x00e2:
            java.lang.String r2 = javax.mail.internet.MimeUtility.getDefaultMIMECharset()     // Catch:{ IOException -> 0x0134 }
        L_0x00e6:
            r7.setParameter(r0, r2)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r3 = r7.toString()     // Catch:{ IOException -> 0x0134 }
        L_0x00ed:
            if (r4 == 0) goto L_0x0133
            boolean r0 = setContentTypeFileName     // Catch:{ IOException -> 0x0134 }
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = "Content-Disposition"
            r2 = 0
            java.lang.String r0 = r9.getHeader(r0, r2)     // Catch:{ IOException -> 0x0134 }
            if (r0 == 0) goto L_0x0130
            javax.mail.internet.ContentDisposition r2 = new javax.mail.internet.ContentDisposition     // Catch:{ IOException -> 0x0134 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r0 = "filename"
            java.lang.String r0 = r2.getParameter(r0)     // Catch:{ IOException -> 0x0134 }
            if (r0 == 0) goto L_0x0130
            javax.mail.internet.ParameterList r2 = r7.getParameterList()     // Catch:{ IOException -> 0x0134 }
            if (r2 != 0) goto L_0x0117
            javax.mail.internet.ParameterList r2 = new javax.mail.internet.ParameterList     // Catch:{ IOException -> 0x0134 }
            r2.<init>()     // Catch:{ IOException -> 0x0134 }
            r7.setParameterList(r2)     // Catch:{ IOException -> 0x0134 }
        L_0x0117:
            boolean r3 = encodeFileName     // Catch:{ IOException -> 0x0134 }
            java.lang.String r4 = "name"
            if (r3 == 0) goto L_0x0125
            java.lang.String r0 = javax.mail.internet.MimeUtility.encodeText(r0)     // Catch:{ IOException -> 0x0134 }
            r2.setLiteral(r4, r0)     // Catch:{ IOException -> 0x0134 }
            goto L_0x012c
        L_0x0125:
            java.lang.String r3 = javax.mail.internet.MimeUtility.getDefaultMIMECharset()     // Catch:{ IOException -> 0x0134 }
            r2.set(r4, r0, r3)     // Catch:{ IOException -> 0x0134 }
        L_0x012c:
            java.lang.String r3 = r7.toString()     // Catch:{ IOException -> 0x0134 }
        L_0x0130:
            r9.setHeader(r1, r3)     // Catch:{ IOException -> 0x0134 }
        L_0x0133:
            return
        L_0x0134:
            r9 = move-exception
            javax.mail.MessagingException r0 = new javax.mail.MessagingException
            java.lang.String r1 = "IOException updating headers"
            r0.<init>(r1, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.MimeBodyPart.updateHeaders(javax.mail.internet.MimePart):void");
    }

    public void saveFile(String str) throws IOException, MessagingException {
        saveFile(new File(str));
    }

    public void attachFile(String str, String str2, String str3) throws IOException, MessagingException {
        attachFile(new File(str), str2, str3);
    }

    public MimeBodyPart(InternetHeaders internetHeaders, byte[] bArr) throws MessagingException {
        this.headers = internetHeaders;
        this.content = bArr;
    }
}
