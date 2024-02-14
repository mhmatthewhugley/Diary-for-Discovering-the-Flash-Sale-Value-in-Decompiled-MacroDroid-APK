package com.sun.mail.util.logging;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.ErrorManager;
import java.util.logging.Filter;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileTypeMap;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessageContext;
import javax.mail.MessagingException;
import javax.mail.Part;
import javax.mail.PasswordAuthentication;
import javax.mail.Service;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.ContentType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimePart;
import javax.mail.internet.MimeUtility;
import javax.mail.util.ByteArrayDataSource;
import org.apache.commons.p353io.FilenameUtils;

public class MailHandler extends Handler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Filter[] EMPTY_FILTERS = new Filter[0];
    private static final Formatter[] EMPTY_FORMATTERS = new Formatter[0];
    private static final PrivilegedAction<Object> MAILHANDLER_LOADER = new GetAndSetContext(MailHandler.class);
    private static final int MIN_HEADER_SIZE = 1024;
    private static final ThreadLocal<Integer> MUTEX = new ThreadLocal<>();
    private static final Integer MUTEX_LINKAGE = -8;
    private static final Integer MUTEX_PUBLISH = -2;
    private static final Integer MUTEX_REPORT = -4;
    private static final int offValue = Level.OFF.intValue();
    private volatile Filter[] attachmentFilters;
    private Formatter[] attachmentFormatters;
    private Formatter[] attachmentNames;
    private Authenticator auth;
    private int capacity;
    private Comparator<? super LogRecord> comparator;
    private FileTypeMap contentTypes;
    private LogRecord[] data;
    private String encoding;
    private volatile ErrorManager errorManager = defaultErrorManager();
    private volatile Filter filter;
    private Formatter formatter;
    private boolean isWriting;
    private volatile Level logLevel = Level.ALL;
    private Properties mailProps;
    private int[] matched;
    private Filter pushFilter;
    private Level pushLevel;
    private volatile boolean sealed;
    private Session session;
    private int size;
    private Formatter subjectFormatter;

    private static final class DefaultAuthenticator extends Authenticator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final String pass;

        static {
            Class<MailHandler> cls = MailHandler.class;
        }

        private DefaultAuthenticator(String str) {
            this.pass = str;
        }

        /* renamed from: of */
        static Authenticator m81922of(String str) {
            return new DefaultAuthenticator(str);
        }

        /* access modifiers changed from: protected */
        public final PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(getDefaultUserName(), this.pass);
        }
    }

    private static final class GetAndSetContext implements PrivilegedAction<Object> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        public static final Object NOT_MODIFIED = GetAndSetContext.class;
        private final Object source;

        static {
            Class<MailHandler> cls = MailHandler.class;
        }

        GetAndSetContext(Object obj) {
            this.source = obj;
        }

        public final Object run() {
            ClassLoader classLoader;
            Thread currentThread = Thread.currentThread();
            ClassLoader contextClassLoader = currentThread.getContextClassLoader();
            Object obj = this.source;
            if (obj == null) {
                classLoader = null;
            } else if (obj instanceof ClassLoader) {
                classLoader = (ClassLoader) obj;
            } else if (obj instanceof Class) {
                classLoader = ((Class) obj).getClassLoader();
            } else if (obj instanceof Thread) {
                classLoader = ((Thread) obj).getContextClassLoader();
            } else {
                classLoader = obj.getClass().getClassLoader();
            }
            if (contextClassLoader == classLoader) {
                return NOT_MODIFIED;
            }
            currentThread.setContextClassLoader(classLoader);
            return contextClassLoader;
        }
    }

    private static final class TailNameFormatter extends Formatter {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final String name;

        static {
            Class<MailHandler> cls = MailHandler.class;
        }

        private TailNameFormatter(String str) {
            this.name = str;
        }

        /* renamed from: of */
        static Formatter m81923of(String str) {
            return new TailNameFormatter(str);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof TailNameFormatter) {
                return this.name.equals(((TailNameFormatter) obj).name);
            }
            return false;
        }

        public final String format(LogRecord logRecord) {
            return "";
        }

        public final String getTail(Handler handler) {
            return this.name;
        }

        public final int hashCode() {
            return TailNameFormatter.class.hashCode() + this.name.hashCode();
        }

        public final String toString() {
            return this.name;
        }
    }

    static {
        Class<MailHandler> cls = MailHandler.class;
    }

    public MailHandler() {
        init((Properties) null);
        this.sealed = true;
        checkAccess();
    }

    private boolean alignAttachmentFilters() {
        int length = this.attachmentFormatters.length;
        int length2 = this.attachmentFilters.length;
        boolean z = false;
        if (length2 != length) {
            this.attachmentFilters = (Filter[]) Arrays.copyOf(this.attachmentFilters, length, Filter[].class);
            clearMatches(length2);
            if (length2 != 0) {
                z = true;
            }
            Filter filter2 = this.filter;
            if (filter2 != null) {
                while (length2 < length) {
                    this.attachmentFilters[length2] = filter2;
                    length2++;
                }
            }
        }
        if (length == 0) {
            this.attachmentFilters = emptyFilterArray();
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021 A[LOOP:0: B:8:0x0021->B:12:0x0037, LOOP_START, PHI: r3 
      PHI: (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:6:0x0018, B:12:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean alignAttachmentNames() {
        /*
            r5 = this;
            java.util.logging.Formatter[] r0 = r5.attachmentFormatters
            int r0 = r0.length
            java.util.logging.Formatter[] r1 = r5.attachmentNames
            int r2 = r1.length
            r3 = 0
            if (r2 == r0) goto L_0x0017
            java.lang.Class<java.util.logging.Formatter[]> r4 = java.util.logging.Formatter[].class
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0, r4)
            java.util.logging.Formatter[] r1 = (java.util.logging.Formatter[]) r1
            r5.attachmentNames = r1
            if (r2 == 0) goto L_0x0017
            r1 = 1
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            if (r0 != 0) goto L_0x0021
            java.util.logging.Formatter[] r0 = emptyFormatterArray()
            r5.attachmentNames = r0
            goto L_0x003a
        L_0x0021:
            if (r3 >= r0) goto L_0x003a
            java.util.logging.Formatter[] r2 = r5.attachmentNames
            r4 = r2[r3]
            if (r4 != 0) goto L_0x0037
            java.util.logging.Formatter[] r4 = r5.attachmentFormatters
            r4 = r4[r3]
            java.lang.String r4 = r5.toString(r4)
            java.util.logging.Formatter r4 = com.sun.mail.util.logging.MailHandler.TailNameFormatter.m81923of(r4)
            r2[r3] = r4
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.MailHandler.alignAttachmentNames():boolean");
    }

    private boolean allowRestrictedHeaders() {
        return LogManagerProperties.hasLogManager();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046 A[Catch:{ MessagingException -> 0x0074 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void appendContentLang(javax.mail.internet.MimePart r7, java.util.Locale r8) {
        /*
            r6 = this;
            java.lang.String r0 = "\r\n\t"
            java.lang.String r1 = "Content-Language"
            java.lang.String r8 = com.sun.mail.util.logging.LogManagerProperties.toLanguageTag(r8)     // Catch:{ MessagingException -> 0x0074 }
            int r2 = r8.length()     // Catch:{ MessagingException -> 0x0074 }
            if (r2 == 0) goto L_0x007d
            r2 = 0
            java.lang.String r2 = r7.getHeader(r1, r2)     // Catch:{ MessagingException -> 0x0074 }
            boolean r3 = isEmpty(r2)     // Catch:{ MessagingException -> 0x0074 }
            if (r3 == 0) goto L_0x001d
            r7.setHeader(r1, r8)     // Catch:{ MessagingException -> 0x0074 }
            goto L_0x007d
        L_0x001d:
            boolean r3 = r2.equalsIgnoreCase(r8)     // Catch:{ MessagingException -> 0x0074 }
            if (r3 != 0) goto L_0x007d
            java.lang.String r3 = ","
            java.lang.String r8 = r3.concat(r8)     // Catch:{ MessagingException -> 0x0074 }
            r3 = 0
        L_0x002a:
            int r3 = r2.indexOf(r8, r3)     // Catch:{ MessagingException -> 0x0074 }
            r4 = -1
            if (r3 <= r4) goto L_0x0044
            int r4 = r8.length()     // Catch:{ MessagingException -> 0x0074 }
            int r3 = r3 + r4
            int r4 = r2.length()     // Catch:{ MessagingException -> 0x0074 }
            if (r3 == r4) goto L_0x0044
            char r4 = r2.charAt(r3)     // Catch:{ MessagingException -> 0x0074 }
            r5 = 44
            if (r4 != r5) goto L_0x002a
        L_0x0044:
            if (r3 >= 0) goto L_0x007d
            int r3 = r2.lastIndexOf(r0)     // Catch:{ MessagingException -> 0x0074 }
            if (r3 >= 0) goto L_0x0053
            int r3 = r2.length()     // Catch:{ MessagingException -> 0x0074 }
            int r3 = r3 + 20
            goto L_0x005a
        L_0x0053:
            int r4 = r2.length()     // Catch:{ MessagingException -> 0x0074 }
            int r4 = r4 - r3
            int r3 = r4 + 8
        L_0x005a:
            int r4 = r8.length()     // Catch:{ MessagingException -> 0x0074 }
            int r3 = r3 + r4
            r4 = 76
            if (r3 <= r4) goto L_0x006c
            java.lang.String r8 = r0.concat(r8)     // Catch:{ MessagingException -> 0x0074 }
            java.lang.String r8 = r2.concat(r8)     // Catch:{ MessagingException -> 0x0074 }
            goto L_0x0070
        L_0x006c:
            java.lang.String r8 = r2.concat(r8)     // Catch:{ MessagingException -> 0x0074 }
        L_0x0070:
            r7.setHeader(r1, r8)     // Catch:{ MessagingException -> 0x0074 }
            goto L_0x007d
        L_0x0074:
            r7 = move-exception
            java.lang.String r8 = r7.getMessage()
            r0 = 5
            r6.reportError((java.lang.String) r8, (java.lang.Exception) r7, (int) r0)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.MailHandler.appendContentLang(javax.mail.internet.MimePart, java.util.Locale):void");
    }

    private void appendFileName(Part part, String str) {
        if (str == null) {
            reportNullError(5);
        } else if (str.length() > 0) {
            appendFileName0(part, str);
        }
    }

    private void appendFileName0(Part part, String str) {
        try {
            String replaceAll = str.replaceAll("[\\x00-\\x1F\\x7F]+", "");
            String fileName = part.getFileName();
            if (fileName != null) {
                replaceAll = fileName.concat(replaceAll);
            }
            part.setFileName(replaceAll);
        } catch (MessagingException e) {
            reportError(e.getMessage(), (Exception) e, 5);
        }
    }

    private void appendSubject(Message message, String str) {
        if (str == null) {
            reportNullError(5);
        } else if (str.length() > 0) {
            appendSubject0(message, str);
        }
    }

    private void appendSubject0(Message message, String str) {
        try {
            String replaceAll = str.replaceAll("[\\x00-\\x1F\\x7F]+", "");
            String encodingName = getEncodingName();
            String subject = message.getSubject();
            MimeMessage mimeMessage = (MimeMessage) message;
            if (subject != null) {
                replaceAll = subject.concat(replaceAll);
            }
            mimeMessage.setSubject(replaceAll, MimeUtility.mimeCharset(encodingName));
        } catch (MessagingException e) {
            reportError(e.getMessage(), (Exception) e, 5);
        }
    }

    private static String atIndexMsg(int i) {
        return "At index: " + i + FilenameUtils.EXTENSION_SEPARATOR;
    }

    private static MessagingException attach(MessagingException messagingException, Exception exc) {
        if (exc != null && !messagingException.setNextException(exc)) {
            if (exc instanceof MessagingException) {
                MessagingException messagingException2 = (MessagingException) exc;
                if (messagingException2.setNextException(messagingException)) {
                    return messagingException2;
                }
            }
            if (exc != messagingException) {
                messagingException.addSuppressed(exc);
            }
        }
        return messagingException;
    }

    private static RuntimeException attachmentMismatch(String str) {
        return new IndexOutOfBoundsException(str);
    }

    private void checkAccess() {
        if (this.sealed) {
            LogManagerProperties.checkLogManagerAccess();
        }
    }

    private void clearMatches(int i) {
        for (int i2 = 0; i2 < this.size; i2++) {
            int[] iArr = this.matched;
            if (iArr[i2] >= i) {
                iArr[i2] = MUTEX_PUBLISH.intValue();
            }
        }
    }

    private String contentWithEncoding(String str, String str2) {
        try {
            ContentType contentType = new ContentType(str);
            contentType.setParameter("charset", MimeUtility.mimeCharset(str2));
            String contentType2 = contentType.toString();
            if (!isEmpty(contentType2)) {
                return contentType2;
            }
            return str;
        } catch (MessagingException e) {
            reportError(str, (Exception) e, 5);
            return str;
        }
    }

    private MimeBodyPart createBodyPart() throws MessagingException {
        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setDisposition(Part.INLINE);
        mimeBodyPart.setDescription(descriptionFrom(getFormatter(), getFilter(), this.subjectFormatter));
        setAcceptLang(mimeBodyPart);
        return mimeBodyPart;
    }

    private static Formatter createSimpleFormatter() {
        return Formatter.class.cast(new SimpleFormatter());
    }

    private ErrorManager defaultErrorManager() {
        ErrorManager errorManager2;
        try {
            errorManager2 = super.getErrorManager();
        } catch (LinkageError | RuntimeException unused) {
            errorManager2 = null;
        }
        return errorManager2 == null ? new ErrorManager() : errorManager2;
    }

    private String descriptionFrom(Comparator<?> comparator2, Level level, Filter filter2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Sorted using ");
        if (comparator2 == null) {
            str = "no comparator";
        } else {
            str = comparator2.getClass().getName();
        }
        sb.append(str);
        sb.append(", pushed when ");
        sb.append(level.getName());
        sb.append(", and ");
        if (filter2 == null) {
            str2 = "no push filter";
        } else {
            str2 = filter2.getClass().getName();
        }
        sb.append(str2);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        return sb.toString();
    }

    private static Filter[] emptyFilterArray() {
        return EMPTY_FILTERS;
    }

    private static Formatter[] emptyFormatterArray() {
        return EMPTY_FORMATTERS;
    }

    private void envelopeFor(Message message, boolean z) {
        setAcceptLang(message);
        setFrom(message);
        Message.RecipientType recipientType = Message.RecipientType.f61338TO;
        if (!setRecipient(message, "mail.to", recipientType)) {
            setDefaultRecipient(message, recipientType);
        }
        setRecipient(message, "mail.cc", Message.RecipientType.f61337CC);
        setRecipient(message, "mail.bcc", Message.RecipientType.BCC);
        setReplyTo(message);
        setSender(message);
        setMailer(message);
        setAutoSubmitted(message);
        if (z) {
            setPriority(message);
        }
        try {
            message.setSentDate(new Date());
        } catch (MessagingException e) {
            reportError(e.getMessage(), (Exception) e, 5);
        }
    }

    private String format(Formatter formatter2, LogRecord logRecord) {
        try {
            return formatter2.format(logRecord);
        } catch (RuntimeException e) {
            reportError(e.getMessage(), (Exception) e, 5);
            return "";
        }
    }

    private Object getAndSetContextClassLoader(Object obj) {
        PrivilegedAction privilegedAction;
        if (obj != GetAndSetContext.NOT_MODIFIED) {
            try {
                if (obj instanceof PrivilegedAction) {
                    privilegedAction = (PrivilegedAction) obj;
                } else {
                    privilegedAction = new GetAndSetContext(obj);
                }
                return AccessController.doPrivileged(privilegedAction);
            } catch (SecurityException unused) {
            }
        }
        return GetAndSetContext.NOT_MODIFIED;
    }

    private String getClassId(Formatter formatter2) {
        if (formatter2 instanceof TailNameFormatter) {
            return String.class.getName();
        }
        return formatter2.getClass().getName();
    }

    private String getContentType(String str) {
        String contentType = this.contentTypes.getContentType(str);
        if ("application/octet-stream".equalsIgnoreCase(contentType)) {
            return null;
        }
        return contentType;
    }

    private String getEncodingName() {
        String encoding2 = getEncoding();
        return encoding2 == null ? MimeUtility.getDefaultJavaCharset() : encoding2;
    }

    private String getLocalHost(Service service) {
        try {
            return LogManagerProperties.getLocalHost(service);
        } catch (LinkageError | NoSuchMethodException | SecurityException unused) {
            return null;
        } catch (Exception e) {
            reportError(service.toString(), e, 4);
            return null;
        }
    }

    private int getMatchedPart() {
        Integer num = MUTEX.get();
        if (num == null || num.intValue() >= readOnlyAttachmentFilters().length) {
            num = MUTEX_PUBLISH;
        }
        return num.intValue();
    }

    private Session getSession(Message message) {
        Objects.requireNonNull(message);
        return new MessageContext(message).getSession();
    }

    private void grow() {
        LogRecord[] logRecordArr = this.data;
        int length = logRecordArr.length;
        int i = (length >> 1) + length + 1;
        int i2 = this.capacity;
        if (i > i2 || i < length) {
            i = i2;
        }
        this.data = (LogRecord[]) Arrays.copyOf(logRecordArr, i, LogRecord[].class);
        this.matched = Arrays.copyOf(this.matched, i);
    }

    private static boolean hasValue(String str) {
        return !isEmpty(str) && !"null".equalsIgnoreCase(str);
    }

    private String head(Formatter formatter2) {
        try {
            return formatter2.getHead(this);
        } catch (RuntimeException e) {
            reportError(e.getMessage(), (Exception) e, 5);
            return "";
        }
    }

    /* JADX INFO: finally extract failed */
    private synchronized void init(Properties properties) {
        String name = getClass().getName();
        this.mailProps = new Properties();
        Object andSetContextClassLoader = getAndSetContextClassLoader(MAILHANDLER_LOADER);
        try {
            this.contentTypes = FileTypeMap.getDefaultFileTypeMap();
            getAndSetContextClassLoader(andSetContextClassLoader);
            initErrorManager(name);
            initLevel(name);
            initFilter(name);
            initCapacity(name);
            initAuthenticator(name);
            initEncoding(name);
            initFormatter(name);
            initComparator(name);
            initPushLevel(name);
            initPushFilter(name);
            initSubject(name);
            initAttachmentFormaters(name);
            initAttachmentFilters(name);
            initAttachmentNames(name);
            if (properties == null && LogManagerProperties.fromLogManager(name.concat(".verify")) != null) {
                verifySettings(initSession());
            }
            intern();
        } catch (Throwable th) {
            getAndSetContextClassLoader(andSetContextClassLoader);
            throw th;
        }
    }

    private void initAttachmentFilters(String str) {
        String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".attachment.filters"));
        if (!isEmpty(fromLogManager)) {
            String[] split = fromLogManager.split(",");
            int length = split.length;
            Filter[] filterArr = new Filter[length];
            for (int i = 0; i < length; i++) {
                split[i] = split[i].trim();
                if (!"null".equalsIgnoreCase(split[i])) {
                    try {
                        filterArr[i] = LogManagerProperties.newFilter(split[i]);
                    } catch (SecurityException e) {
                        throw e;
                    } catch (Exception e2) {
                        reportError(e2.getMessage(), e2, 4);
                    }
                }
            }
            this.attachmentFilters = filterArr;
            if (alignAttachmentFilters()) {
                reportError("Attachment filters.", (Exception) attachmentMismatch("Length mismatch."), 4);
                return;
            }
            return;
        }
        this.attachmentFilters = emptyFilterArray();
        alignAttachmentFilters();
    }

    private void initAttachmentFormaters(String str) {
        Formatter[] formatterArr;
        String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".attachment.formatters"));
        if (!isEmpty(fromLogManager)) {
            String[] split = fromLogManager.split(",");
            if (split.length == 0) {
                formatterArr = emptyFormatterArray();
            } else {
                formatterArr = new Formatter[split.length];
            }
            for (int i = 0; i < formatterArr.length; i++) {
                split[i] = split[i].trim();
                if (!"null".equalsIgnoreCase(split[i])) {
                    try {
                        formatterArr[i] = LogManagerProperties.newFormatter(split[i]);
                        if (formatterArr[i] instanceof TailNameFormatter) {
                            reportError("Attachment formatter.", (Exception) new ClassNotFoundException(formatterArr[i].toString()), 4);
                            formatterArr[i] = createSimpleFormatter();
                        }
                    } catch (SecurityException e) {
                        throw e;
                    } catch (Exception e2) {
                        reportError(e2.getMessage(), e2, 4);
                        formatterArr[i] = createSimpleFormatter();
                    }
                } else {
                    reportError("Attachment formatter.", (Exception) new NullPointerException(atIndexMsg(i)), 4);
                    formatterArr[i] = createSimpleFormatter();
                }
            }
            this.attachmentFormatters = formatterArr;
            return;
        }
        this.attachmentFormatters = emptyFormatterArray();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|11|12|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        reportError(r3.getMessage(), r3, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void initAttachmentNames(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = ".attachment.names"
            java.lang.String r8 = r8.concat(r0)
            java.lang.String r8 = com.sun.mail.util.logging.LogManagerProperties.fromLogManager(r8)
            boolean r0 = isEmpty(r8)
            if (r0 != 0) goto L_0x0071
            java.lang.String r0 = ","
            java.lang.String[] r8 = r8.split(r0)
            int r0 = r8.length
            java.util.logging.Formatter[] r1 = new java.util.logging.Formatter[r0]
            r2 = 0
        L_0x001a:
            java.lang.String r3 = "Attachment names."
            r4 = 4
            if (r2 >= r0) goto L_0x005f
            r5 = r8[r2]
            java.lang.String r5 = r5.trim()
            r8[r2] = r5
            r5 = r8[r2]
            java.lang.String r6 = "null"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 != 0) goto L_0x0050
            r3 = r8[r2]     // Catch:{ ClassCastException | ClassNotFoundException -> 0x003e }
            java.util.logging.Formatter r3 = com.sun.mail.util.logging.LogManagerProperties.newFormatter(r3)     // Catch:{ ClassCastException | ClassNotFoundException -> 0x003e }
            r1[r2] = r3     // Catch:{ ClassCastException | ClassNotFoundException -> 0x003e }
            goto L_0x005c
        L_0x003a:
            r3 = move-exception
            goto L_0x0047
        L_0x003c:
            r8 = move-exception
            goto L_0x004f
        L_0x003e:
            r3 = r8[r2]     // Catch:{ SecurityException -> 0x003c, Exception -> 0x003a }
            java.util.logging.Formatter r3 = com.sun.mail.util.logging.MailHandler.TailNameFormatter.m81923of(r3)     // Catch:{ SecurityException -> 0x003c, Exception -> 0x003a }
            r1[r2] = r3     // Catch:{ SecurityException -> 0x003c, Exception -> 0x003a }
            goto L_0x005c
        L_0x0047:
            java.lang.String r5 = r3.getMessage()
            r7.reportError((java.lang.String) r5, (java.lang.Exception) r3, (int) r4)
            goto L_0x005c
        L_0x004f:
            throw r8
        L_0x0050:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = atIndexMsg(r2)
            r5.<init>(r6)
            r7.reportError((java.lang.String) r3, (java.lang.Exception) r5, (int) r4)
        L_0x005c:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x005f:
            r7.attachmentNames = r1
            boolean r8 = r7.alignAttachmentNames()
            if (r8 == 0) goto L_0x007a
            java.lang.String r8 = "Length mismatch."
            java.lang.RuntimeException r8 = attachmentMismatch(r8)
            r7.reportError((java.lang.String) r3, (java.lang.Exception) r8, (int) r4)
            goto L_0x007a
        L_0x0071:
            java.util.logging.Formatter[] r8 = emptyFormatterArray()
            r7.attachmentNames = r8
            r7.alignAttachmentNames()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.MailHandler.initAttachmentNames(java.lang.String):void");
    }

    private void initAuthenticator(String str) {
        String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".authenticator"));
        if (fromLogManager != null && !"null".equalsIgnoreCase(fromLogManager)) {
            if (fromLogManager.length() != 0) {
                try {
                    this.auth = (Authenticator) LogManagerProperties.newObjectFrom(fromLogManager, Authenticator.class);
                } catch (SecurityException e) {
                    throw e;
                } catch (ClassCastException | ClassNotFoundException unused) {
                    this.auth = DefaultAuthenticator.m81922of(fromLogManager);
                } catch (Exception e2) {
                    reportError(e2.getMessage(), e2, 4);
                }
            } else {
                this.auth = DefaultAuthenticator.m81922of(fromLogManager);
            }
        }
    }

    private void initCapacity(String str) {
        try {
            String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".capacity"));
            if (fromLogManager != null) {
                setCapacity0(Integer.parseInt(fromLogManager));
            } else {
                setCapacity0(1000);
            }
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            reportError(e2.getMessage(), (Exception) e2, 4);
        }
        if (this.capacity <= 0) {
            this.capacity = 1000;
        }
        LogRecord[] logRecordArr = new LogRecord[1];
        this.data = logRecordArr;
        this.matched = new int[logRecordArr.length];
    }

    private void initComparator(String str) {
        try {
            String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".comparator"));
            String fromLogManager2 = LogManagerProperties.fromLogManager(str.concat(".comparator.reverse"));
            if (hasValue(fromLogManager)) {
                this.comparator = LogManagerProperties.newComparator(fromLogManager);
                if (Boolean.parseBoolean(fromLogManager2)) {
                    this.comparator = LogManagerProperties.reverseOrder(this.comparator);
                }
            } else if (!isEmpty(fromLogManager2)) {
                throw new IllegalArgumentException("No comparator to reverse.");
            }
        } catch (SecurityException e) {
            throw e;
        } catch (Exception e2) {
            reportError(e2.getMessage(), e2, 4);
        }
    }

    private void initEncoding(String str) {
        try {
            String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".encoding"));
            if (fromLogManager != null) {
                setEncoding0(fromLogManager);
            }
        } catch (SecurityException e) {
            throw e;
        } catch (UnsupportedEncodingException | RuntimeException e2) {
            reportError(e2.getMessage(), e2, 4);
        }
    }

    private void initErrorManager(String str) {
        try {
            String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".errorManager"));
            if (fromLogManager != null) {
                setErrorManager0(LogManagerProperties.newErrorManager(fromLogManager));
            }
        } catch (SecurityException e) {
            throw e;
        } catch (Exception e2) {
            reportError(e2.getMessage(), e2, 4);
        }
    }

    private void initFilter(String str) {
        try {
            String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".filter"));
            if (hasValue(fromLogManager)) {
                this.filter = LogManagerProperties.newFilter(fromLogManager);
            }
        } catch (SecurityException e) {
            throw e;
        } catch (Exception e2) {
            reportError(e2.getMessage(), e2, 4);
        }
    }

    private void initFormatter(String str) {
        try {
            String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".formatter"));
            if (hasValue(fromLogManager)) {
                Formatter newFormatter = LogManagerProperties.newFormatter(fromLogManager);
                if (!(newFormatter instanceof TailNameFormatter)) {
                    this.formatter = newFormatter;
                } else {
                    this.formatter = createSimpleFormatter();
                }
            } else {
                this.formatter = createSimpleFormatter();
            }
        } catch (SecurityException e) {
            throw e;
        } catch (Exception e2) {
            reportError(e2.getMessage(), e2, 4);
            this.formatter = createSimpleFormatter();
        }
    }

    private void initLevel(String str) {
        try {
            String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".level"));
            if (fromLogManager != null) {
                this.logLevel = Level.parse(fromLogManager);
            } else {
                this.logLevel = Level.WARNING;
            }
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            reportError(e2.getMessage(), (Exception) e2, 4);
            this.logLevel = Level.WARNING;
        }
    }

    private void initPushFilter(String str) {
        try {
            String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".pushFilter"));
            if (hasValue(fromLogManager)) {
                this.pushFilter = LogManagerProperties.newFilter(fromLogManager);
            }
        } catch (SecurityException e) {
            throw e;
        } catch (Exception e2) {
            reportError(e2.getMessage(), e2, 4);
        }
    }

    private void initPushLevel(String str) {
        try {
            String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".pushLevel"));
            if (fromLogManager != null) {
                this.pushLevel = Level.parse(fromLogManager);
            }
        } catch (RuntimeException e) {
            reportError(e.getMessage(), (Exception) e, 4);
        }
        if (this.pushLevel == null) {
            this.pushLevel = Level.OFF;
        }
    }

    private Session initSession() {
        Session instance = Session.getInstance(new LogManagerProperties(this.mailProps, getClass().getName()), this.auth);
        this.session = instance;
        return instance;
    }

    private void initSubject(String str) {
        String fromLogManager = LogManagerProperties.fromLogManager(str.concat(".subject"));
        if (fromLogManager == null) {
            fromLogManager = "com.sun.mail.util.logging.CollectorFormatter";
        }
        if (hasValue(fromLogManager)) {
            try {
                this.subjectFormatter = LogManagerProperties.newFormatter(fromLogManager);
            } catch (SecurityException e) {
                throw e;
            } catch (ClassCastException | ClassNotFoundException unused) {
                this.subjectFormatter = TailNameFormatter.m81923of(fromLogManager);
            } catch (Exception e2) {
                this.subjectFormatter = TailNameFormatter.m81923of(fromLogManager);
                reportError(e2.getMessage(), e2, 4);
            }
        } else {
            this.subjectFormatter = TailNameFormatter.m81923of(fromLogManager);
        }
    }

    private void intern() {
        try {
            HashMap hashMap = new HashMap();
            try {
                intern(hashMap, this.errorManager);
            } catch (SecurityException e) {
                reportError(e.getMessage(), (Exception) e, 4);
            }
            try {
                Filter filter2 = this.filter;
                Object intern = intern(hashMap, filter2);
                if (intern != filter2 && (intern instanceof Filter)) {
                    this.filter = (Filter) intern;
                }
                Formatter formatter2 = this.formatter;
                Object intern2 = intern(hashMap, formatter2);
                if (intern2 != formatter2 && (intern2 instanceof Formatter)) {
                    this.formatter = (Formatter) intern2;
                }
            } catch (SecurityException e2) {
                reportError(e2.getMessage(), (Exception) e2, 4);
            }
            Formatter formatter3 = this.subjectFormatter;
            Object intern3 = intern(hashMap, formatter3);
            if (intern3 != formatter3 && (intern3 instanceof Formatter)) {
                this.subjectFormatter = (Formatter) intern3;
            }
            Filter filter3 = this.pushFilter;
            Object intern4 = intern(hashMap, filter3);
            if (intern4 != filter3 && (intern4 instanceof Filter)) {
                this.pushFilter = (Filter) intern4;
            }
            int i = 0;
            while (true) {
                Formatter[] formatterArr = this.attachmentFormatters;
                if (i < formatterArr.length) {
                    Formatter formatter4 = formatterArr[i];
                    Object intern5 = intern(hashMap, formatter4);
                    if (intern5 != formatter4 && (intern5 instanceof Formatter)) {
                        this.attachmentFormatters[i] = (Formatter) intern5;
                    }
                    Filter filter4 = this.attachmentFilters[i];
                    Object intern6 = intern(hashMap, filter4);
                    if (intern6 != filter4 && (intern6 instanceof Filter)) {
                        this.attachmentFilters[i] = (Filter) intern6;
                    }
                    Formatter formatter5 = this.attachmentNames[i];
                    Object intern7 = intern(hashMap, formatter5);
                    if (intern7 != formatter5 && (intern7 instanceof Formatter)) {
                        this.attachmentNames[i] = (Formatter) intern7;
                    }
                    i++;
                } else {
                    return;
                }
            }
        } catch (Exception e3) {
            reportError(e3.getMessage(), e3, 4);
        } catch (LinkageError e4) {
            reportError(e4.getMessage(), (Exception) new InvocationTargetException(e4), 4);
        }
    }

    private boolean isAttachmentLoggable(LogRecord logRecord) {
        Filter[] readOnlyAttachmentFilters = readOnlyAttachmentFilters();
        for (int i = 0; i < readOnlyAttachmentFilters.length; i++) {
            Filter filter2 = readOnlyAttachmentFilters[i];
            if (filter2 == null || filter2.isLoggable(logRecord)) {
                setMatchedPart(i);
                return true;
            }
        }
        return false;
    }

    private static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    private boolean isPushable(LogRecord logRecord) {
        int intValue = getPushLevel().intValue();
        if (intValue == offValue || logRecord.getLevel().intValue() < intValue) {
            return false;
        }
        Filter pushFilter2 = getPushFilter();
        if (pushFilter2 == null) {
            return true;
        }
        int matchedPart = getMatchedPart();
        if ((matchedPart != -1 || getFilter() != pushFilter2) && (matchedPart < 0 || this.attachmentFilters[matchedPart] != pushFilter2)) {
            return pushFilter2.isLoggable(logRecord);
        }
        return true;
    }

    private Locale localeFor(LogRecord logRecord) {
        ResourceBundle resourceBundle = logRecord.getResourceBundle();
        if (resourceBundle == null) {
            return null;
        }
        Locale locale = resourceBundle.getLocale();
        return (locale == null || isEmpty(locale.getLanguage())) ? Locale.getDefault() : locale;
    }

    private void publish0(LogRecord logRecord) {
        Message message;
        boolean z;
        synchronized (this) {
            int i = this.size;
            if (i == this.data.length && i < this.capacity) {
                grow();
            }
            int i2 = this.size;
            message = null;
            if (i2 < this.data.length) {
                this.matched[i2] = getMatchedPart();
                LogRecord[] logRecordArr = this.data;
                int i3 = this.size;
                logRecordArr[i3] = logRecord;
                this.size = i3 + 1;
                z = isPushable(logRecord);
                if (z || this.size >= this.capacity) {
                    message = writeLogRecords(1);
                }
            } else {
                z = false;
            }
        }
        if (message != null) {
            send(message, z, 1);
        }
    }

    private Filter[] readOnlyAttachmentFilters() {
        return this.attachmentFilters;
    }

    private void releaseMutex() {
        MUTEX.remove();
    }

    private void reportFilterError(LogRecord logRecord) {
        Formatter createSimpleFormatter = createSimpleFormatter();
        reportError("Log record " + logRecord.getSequenceNumber() + " was filtered from all message parts.  " + head(createSimpleFormatter) + format(createSimpleFormatter, logRecord) + tail(createSimpleFormatter, ""), (Exception) new IllegalArgumentException(getFilter() + ", " + Arrays.asList(readOnlyAttachmentFilters())), 5);
    }

    private void reportLinkageError(Throwable th, int i) {
        if (th != null) {
            ThreadLocal<Integer> threadLocal = MUTEX;
            Integer num = threadLocal.get();
            if (num == null || num.intValue() > MUTEX_LINKAGE.intValue()) {
                threadLocal.set(MUTEX_LINKAGE);
                try {
                    Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
                    if (num != null) {
                        threadLocal.set(num);
                    } else {
                        threadLocal.remove();
                    }
                } catch (LinkageError | RuntimeException unused) {
                    if (num != null) {
                        MUTEX.set(num);
                    } else {
                        MUTEX.remove();
                    }
                } catch (Throwable th2) {
                    if (num != null) {
                        MUTEX.set(num);
                    } else {
                        MUTEX.remove();
                    }
                    throw th2;
                }
            }
        } else {
            throw new NullPointerException(String.valueOf(i));
        }
    }

    private void reportNonDiscriminating(Object obj, Object obj2) {
        reportError("Non discriminating equals implementation.", (Exception) new IllegalArgumentException(obj.getClass().getName() + " should not be equal to " + obj2.getClass().getName()), 4);
    }

    private void reportNonSymmetric(Object obj, Object obj2) {
        reportError("Non symmetric equals implementation.", (Exception) new IllegalArgumentException(obj.getClass().getName() + " is not equal to " + obj2.getClass().getName()), 4);
    }

    private void reportNullError(int i) {
        reportError("null", (Exception) new NullPointerException(), i);
    }

    private void reportUnPublishedError(LogRecord logRecord) {
        String str;
        ThreadLocal<Integer> threadLocal = MUTEX;
        Integer num = threadLocal.get();
        if (num == null || num.intValue() > MUTEX_REPORT.intValue()) {
            threadLocal.set(MUTEX_REPORT);
            if (logRecord != null) {
                try {
                    Formatter createSimpleFormatter = createSimpleFormatter();
                    str = "Log record " + logRecord.getSequenceNumber() + " was not published. " + head(createSimpleFormatter) + format(createSimpleFormatter, logRecord) + tail(createSimpleFormatter, "");
                } catch (Throwable th) {
                    if (num != null) {
                        MUTEX.set(num);
                    } else {
                        MUTEX.remove();
                    }
                    throw th;
                }
            } else {
                str = null;
            }
            reportError(str, (Exception) new IllegalStateException("Recursive publish detected by thread " + Thread.currentThread()), 1);
            if (num != null) {
                threadLocal.set(num);
            } else {
                threadLocal.remove();
            }
        }
    }

    private void reportUnexpectedSend(MimeMessage mimeMessage, String str, Exception exc) {
        MessagingException messagingException = new MessagingException("An empty message was sent.", exc);
        setErrorContent(mimeMessage, str, messagingException);
        reportError((Message) mimeMessage, (Exception) messagingException, 4);
    }

    private void reset() {
        int i = this.size;
        LogRecord[] logRecordArr = this.data;
        if (i < logRecordArr.length) {
            Arrays.fill(logRecordArr, 0, i, (Object) null);
        } else {
            Arrays.fill(logRecordArr, (Object) null);
        }
        this.size = 0;
    }

    private void saveChangesNoContent(Message message, String str) {
        if (message != null) {
            try {
                message.saveChanges();
            } catch (NullPointerException e) {
                if (message.getHeader("Content-Transfer-Encoding") == null) {
                    message.setHeader("Content-Transfer-Encoding", "base64");
                    message.saveChanges();
                    return;
                }
                throw e;
            } catch (RuntimeException | MessagingException e2) {
                if (e2 != e) {
                    try {
                        e2.addSuppressed(e);
                    } catch (RuntimeException | MessagingException e3) {
                        reportError(str, e3, 5);
                        return;
                    }
                }
                throw e2;
            }
        }
    }

    private void send(Message message, boolean z, int i) {
        Object andSetContextClassLoader;
        try {
            envelopeFor(message, z);
            andSetContextClassLoader = getAndSetContextClassLoader(MAILHANDLER_LOADER);
            Transport.send(message);
            getAndSetContextClassLoader(andSetContextClassLoader);
        } catch (RuntimeException e) {
            reportError(message, (Exception) e, i);
        } catch (Exception e2) {
            reportError(message, e2, i);
        } catch (Throwable th) {
            getAndSetContextClassLoader(andSetContextClassLoader);
            throw th;
        }
    }

    private void setAcceptLang(Part part) {
        try {
            String languageTag = LogManagerProperties.toLanguageTag(Locale.getDefault());
            if (languageTag.length() != 0) {
                part.setHeader("Accept-Language", languageTag);
            }
        } catch (MessagingException e) {
            reportError(e.getMessage(), (Exception) e, 5);
        }
    }

    private void setAuthenticator0(Authenticator authenticator) {
        Session updateSession;
        checkAccess();
        synchronized (this) {
            if (!this.isWriting) {
                this.auth = authenticator;
                updateSession = updateSession();
            } else {
                throw new IllegalStateException();
            }
        }
        verifySettings(updateSession);
    }

    private void setAutoSubmitted(Message message) {
        if (allowRestrictedHeaders()) {
            try {
                message.setHeader("auto-submitted", "auto-generated");
            } catch (MessagingException e) {
                reportError(e.getMessage(), (Exception) e, 5);
            }
        }
    }

    private synchronized void setCapacity0(int i) {
        checkAccess();
        if (i <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        } else if (this.isWriting) {
            throw new IllegalStateException();
        } else if (this.capacity < 0) {
            this.capacity = -i;
        } else {
            this.capacity = i;
        }
    }

    private void setContent(MimePart mimePart, CharSequence charSequence, String str) throws MessagingException {
        String encodingName = getEncodingName();
        if (str == null || "text/plain".equalsIgnoreCase(str)) {
            mimePart.setText(charSequence.toString(), MimeUtility.mimeCharset(encodingName));
            return;
        }
        try {
            mimePart.setDataHandler(new DataHandler((DataSource) new ByteArrayDataSource(charSequence.toString(), contentWithEncoding(str, encodingName))));
        } catch (IOException e) {
            reportError(e.getMessage(), (Exception) e, 5);
            mimePart.setText(charSequence.toString(), encodingName);
        }
    }

    private void setDefaultFrom(Message message) {
        try {
            message.setFrom();
        } catch (MessagingException e) {
            reportError(e.getMessage(), (Exception) e, 5);
        }
    }

    private void setDefaultRecipient(Message message, Message.RecipientType recipientType) {
        try {
            InternetAddress localAddress = InternetAddress.getLocalAddress(getSession(message));
            if (localAddress != null) {
                message.setRecipient(recipientType, localAddress);
                return;
            }
            MimeMessage mimeMessage = new MimeMessage(getSession(message));
            mimeMessage.setFrom();
            Address[] from = mimeMessage.getFrom();
            if (from.length > 0) {
                message.setRecipients(recipientType, from);
                return;
            }
            throw new MessagingException("No local address.");
        } catch (RuntimeException | MessagingException e) {
            reportError("Unable to compute a default recipient.", e, 5);
        }
    }

    private void setEncoding0(String str) throws UnsupportedEncodingException {
        if (str != null) {
            try {
                if (!Charset.isSupported(str)) {
                    throw new UnsupportedEncodingException(str);
                }
            } catch (IllegalCharsetNameException unused) {
                throw new UnsupportedEncodingException(str);
            }
        }
        synchronized (this) {
            this.encoding = str;
        }
    }

    private void setErrorContent(MimeMessage mimeMessage, String str, Throwable th) {
        MimeBodyPart createBodyPart;
        String descriptionFrom;
        String classId;
        String str2;
        try {
            synchronized (this) {
                createBodyPart = createBodyPart();
                descriptionFrom = descriptionFrom((Comparator<?>) this.comparator, this.pushLevel, this.pushFilter);
                classId = getClassId(this.subjectFormatter);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Formatted using ");
            if (th == null) {
                str2 = Throwable.class.getName();
            } else {
                str2 = th.getClass().getName();
            }
            sb.append(str2);
            sb.append(", filtered with ");
            sb.append(str);
            sb.append(", and named by ");
            sb.append(classId);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            createBodyPart.setDescription(sb.toString());
            setContent(createBodyPart, toMsgString(th), "text/plain");
            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(createBodyPart);
            mimeMessage.setContent(mimeMultipart);
            mimeMessage.setDescription(descriptionFrom);
            setAcceptLang(mimeMessage);
            mimeMessage.saveChanges();
        } catch (RuntimeException | MessagingException e) {
            reportError("Unable to create body.", e, 4);
        }
    }

    private void setErrorManager0(ErrorManager errorManager2) {
        Objects.requireNonNull(errorManager2);
        try {
            synchronized (this) {
                this.errorManager = errorManager2;
                super.setErrorManager(errorManager2);
            }
        } catch (LinkageError | RuntimeException unused) {
        }
    }

    private void setFrom(Message message) {
        String property = getSession(message).getProperty("mail.from");
        if (property != null) {
            try {
                InternetAddress[] parse = InternetAddress.parse(property, false);
                if (parse.length <= 0) {
                    return;
                }
                if (parse.length == 1) {
                    message.setFrom(parse[0]);
                } else {
                    message.addFrom(parse);
                }
            } catch (MessagingException e) {
                reportError(e.getMessage(), (Exception) e, 5);
                setDefaultFrom(message);
            }
        } else {
            setDefaultFrom(message);
        }
    }

    private void setIncompleteCopy(Message message) {
        try {
            message.setHeader("Incomplete-Copy", "");
        } catch (MessagingException e) {
            reportError(e.getMessage(), (Exception) e, 5);
        }
    }

    private void setMailProperties0(Properties properties) {
        Session updateSession;
        checkAccess();
        Properties properties2 = (Properties) properties.clone();
        synchronized (this) {
            if (!this.isWriting) {
                this.mailProps = properties2;
                updateSession = updateSession();
            } else {
                throw new IllegalStateException();
            }
        }
        verifySettings(updateSession);
    }

    private void setMailer(Message message) {
        String str;
        String str2;
        Class<MailHandler> cls = MailHandler.class;
        try {
            Class<?> cls2 = getClass();
            if (cls2 == cls) {
                str = cls.getName();
            } else {
                try {
                    str2 = MimeUtility.encodeText(cls2.getName());
                } catch (UnsupportedEncodingException e) {
                    reportError(e.getMessage(), (Exception) e, 5);
                    str2 = cls2.getName().replaceAll("[^\\x00-\\x7F]", "\u001a");
                }
                str = MimeUtility.fold(10, cls.getName() + " using the " + str2 + " extension.");
            }
            message.setHeader("X-Mailer", str);
        } catch (MessagingException e2) {
            reportError(e2.getMessage(), (Exception) e2, 5);
        }
    }

    private void setMatchedPart(int i) {
        Integer num = MUTEX_PUBLISH;
        ThreadLocal<Integer> threadLocal = MUTEX;
        if (num.equals(threadLocal.get())) {
            threadLocal.set(Integer.valueOf(i));
        }
    }

    private void setPriority(Message message) {
        try {
            message.setHeader("Importance", "High");
            message.setHeader("Priority", "urgent");
            message.setHeader("X-Priority", ExifInterface.GPS_MEASUREMENT_2D);
        } catch (MessagingException e) {
            reportError(e.getMessage(), (Exception) e, 5);
        }
    }

    private boolean setRecipient(Message message, String str, Message.RecipientType recipientType) {
        String property = getSession(message).getProperty(str);
        boolean z = property != null;
        if (!isEmpty(property)) {
            try {
                InternetAddress[] parse = InternetAddress.parse(property, false);
                if (parse.length > 0) {
                    message.setRecipients(recipientType, parse);
                }
            } catch (MessagingException e) {
                reportError(e.getMessage(), (Exception) e, 5);
            }
        }
        return z;
    }

    private void setReplyTo(Message message) {
        String property = getSession(message).getProperty("mail.reply.to");
        if (!isEmpty(property)) {
            try {
                InternetAddress[] parse = InternetAddress.parse(property, false);
                if (parse.length > 0) {
                    message.setReplyTo(parse);
                }
            } catch (MessagingException e) {
                reportError(e.getMessage(), (Exception) e, 5);
            }
        }
    }

    private void setSender(Message message) {
        String property = getSession(message).getProperty("mail.sender");
        if (!isEmpty(property)) {
            try {
                InternetAddress[] parse = InternetAddress.parse(property, false);
                if (parse.length > 0) {
                    ((MimeMessage) message).setSender(parse[0]);
                    if (parse.length > 1) {
                        reportError("Ignoring other senders.", (Exception) tooManyAddresses(parse, 1), 5);
                    }
                }
            } catch (MessagingException e) {
                reportError(e.getMessage(), (Exception) e, 5);
            }
        }
    }

    private void sort() {
        Comparator<? super LogRecord> comparator2 = this.comparator;
        if (comparator2 != null) {
            try {
                int i = this.size;
                if (i != 1) {
                    Arrays.sort(this.data, 0, i, comparator2);
                    return;
                }
                LogRecord[] logRecordArr = this.data;
                if (comparator2.compare(logRecordArr[0], logRecordArr[0]) != 0) {
                    throw new IllegalArgumentException(this.comparator.getClass().getName());
                }
            } catch (RuntimeException e) {
                reportError(e.getMessage(), (Exception) e, 5);
            }
        }
    }

    private String tail(Formatter formatter2, String str) {
        try {
            return formatter2.getTail(this);
        } catch (RuntimeException e) {
            reportError(e.getMessage(), (Exception) e, 5);
            return str;
        }
    }

    private String toMsgString(Throwable th) {
        PrintWriter printWriter;
        if (th == null) {
            return "null";
        }
        String encodingName = getEncodingName();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, encodingName);
            try {
                printWriter = new PrintWriter(outputStreamWriter);
                printWriter.println(th.getMessage());
                th.printStackTrace(printWriter);
                printWriter.flush();
                printWriter.close();
                outputStreamWriter.close();
                return byteArrayOutputStream.toString(encodingName);
            } catch (Throwable th2) {
                outputStreamWriter.close();
                throw th2;
            }
        } catch (RuntimeException e) {
            return th.toString() + ' ' + e.toString();
        } catch (Exception e2) {
            return th.toString() + ' ' + e2.toString();
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
        throw th;
    }

    private String toRawString(Message message) throws MessagingException, IOException {
        if (message == null) {
            return null;
        }
        Object andSetContextClassLoader = getAndSetContextClassLoader(MAILHANDLER_LOADER);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(message.getSize() + 1024, 1024));
            message.writeTo(byteArrayOutputStream);
            return byteArrayOutputStream.toString("UTF-8");
        } finally {
            getAndSetContextClassLoader(andSetContextClassLoader);
        }
    }

    private String toString(Formatter formatter2) {
        String obj = formatter2.toString();
        if (!isEmpty(obj)) {
            return obj;
        }
        return getClassId(formatter2);
    }

    private AddressException tooManyAddresses(Address[] addressArr, int i) {
        return new AddressException(Arrays.asList(addressArr).subList(i, addressArr.length).toString());
    }

    private boolean tryMutex() {
        ThreadLocal<Integer> threadLocal = MUTEX;
        if (threadLocal.get() != null) {
            return false;
        }
        threadLocal.set(MUTEX_PUBLISH);
        return true;
    }

    private Session updateSession() {
        if (this.mailProps.getProperty("verify") != null) {
            return initSession();
        }
        this.session = null;
        return null;
    }

    private static void verifyAddresses(Address[] addressArr) throws AddressException {
        if (addressArr != null) {
            for (InternetAddress internetAddress : addressArr) {
                if (internetAddress instanceof InternetAddress) {
                    internetAddress.validate();
                }
            }
        }
    }

    private static InetAddress verifyHost(String str) throws IOException {
        InetAddress inetAddress;
        if (isEmpty(str)) {
            inetAddress = InetAddress.getLocalHost();
        } else {
            inetAddress = InetAddress.getByName(str);
        }
        if (inetAddress.getCanonicalHostName().length() != 0) {
            return inetAddress;
        }
        throw new UnknownHostException();
    }

    private static void verifyProperties(Session session2, String str) {
        session2.getProperty("mail.from");
        session2.getProperty("mail." + str + ".from");
        session2.getProperty("mail.dsn.ret");
        session2.getProperty("mail." + str + ".dsn.ret");
        session2.getProperty("mail.dsn.notify");
        session2.getProperty("mail." + str + ".dsn.notify");
        session2.getProperty("mail." + str + ".port");
        session2.getProperty("mail.user");
        session2.getProperty("mail." + str + ".user");
        session2.getProperty("mail." + str + ".localport");
    }

    private void verifySettings(Session session2) {
        if (session2 != null) {
            try {
                Object put = session2.getProperties().put("verify", "");
                if (put instanceof String) {
                    String str = (String) put;
                    if (hasValue(str)) {
                        verifySettings0(session2, str);
                    }
                } else if (put != null) {
                    verifySettings0(session2, put.getClass().toString());
                }
            } catch (LinkageError e) {
                reportLinkageError(e, 4);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0287, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r2 = new javax.mail.MessagingException(r7, r0);
        setErrorContent(r5, r3, r2);
        reportError((javax.mail.Message) r5, (java.lang.Exception) r2, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0397, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0398, code lost:
        setErrorContent(r5, r3, r0);
        reportError((javax.mail.Message) r5, r0, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01de, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r2 = new javax.mail.MessagingException(r7, r0);
        setErrorContent(r5, r3, r2);
        reportError((javax.mail.Message) r5, (java.lang.Exception) r2, 4);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:70:0x01bd, B:110:0x0230] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0239 A[Catch:{ MessagingException -> 0x038c, all -> 0x038a, RuntimeException -> 0x03a0, Exception -> 0x0397 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x025f A[Catch:{ MessagingException -> 0x038c, all -> 0x038a, RuntimeException -> 0x03a0, Exception -> 0x0397 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0316 A[Catch:{ MessagingException -> 0x038c, all -> 0x038a, RuntimeException -> 0x03a0, Exception -> 0x0397 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0382 A[Catch:{ MessagingException -> 0x038c, all -> 0x038a, RuntimeException -> 0x03a0, Exception -> 0x0397 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0397 A[ExcHandler: Exception (r0v14 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:110:0x0230] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void verifySettings0(javax.mail.Session r17, java.lang.String r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            java.lang.String r0 = "local"
            boolean r0 = r0.equals(r3)
            r4 = 4
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "remote"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "limited"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "resolve"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "login"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "Verify must be 'limited', local', 'resolve', 'login', or 'remote'."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r3)
            r1.reportError((java.lang.String) r0, (java.lang.Exception) r2, (int) r4)
            return
        L_0x003a:
            javax.mail.internet.MimeMessage r5 = new javax.mail.internet.MimeMessage
            r5.<init>((javax.mail.Session) r2)
            java.lang.String r0 = "limited"
            boolean r0 = r0.equals(r3)
            r6 = 5
            if (r0 != 0) goto L_0x007b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "Local address is "
            r0.append(r7)
            javax.mail.internet.InternetAddress r7 = javax.mail.internet.InternetAddress.getLocalAddress(r17)
            r0.append(r7)
            r7 = 46
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = r16.getEncodingName()     // Catch:{ RuntimeException -> 0x006a }
            java.nio.charset.Charset.forName(r0)     // Catch:{ RuntimeException -> 0x006a }
            goto L_0x007d
        L_0x006a:
            r0 = move-exception
            java.io.UnsupportedEncodingException r8 = new java.io.UnsupportedEncodingException
            java.lang.String r9 = r0.toString()
            r8.<init>(r9)
            r8.initCause(r0)
            r1.reportError((java.lang.String) r7, (java.lang.Exception) r8, (int) r6)
            goto L_0x007d
        L_0x007b:
            java.lang.String r7 = "Skipping local address check."
        L_0x007d:
            monitor-enter(r16)
            java.util.logging.Formatter r0 = r1.subjectFormatter     // Catch:{ all -> 0x03a9 }
            java.lang.String r0 = r1.head(r0)     // Catch:{ all -> 0x03a9 }
            r1.appendSubject(r5, r0)     // Catch:{ all -> 0x03a9 }
            java.util.logging.Formatter r0 = r1.subjectFormatter     // Catch:{ all -> 0x03a9 }
            java.lang.String r8 = ""
            java.lang.String r0 = r1.tail(r0, r8)     // Catch:{ all -> 0x03a9 }
            r1.appendSubject(r5, r0)     // Catch:{ all -> 0x03a9 }
            java.util.logging.Formatter[] r0 = r1.attachmentNames     // Catch:{ all -> 0x03a9 }
            int r8 = r0.length     // Catch:{ all -> 0x03a9 }
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ all -> 0x03a9 }
            r10 = 0
            r0 = 0
        L_0x0099:
            if (r0 >= r8) goto L_0x00cf
            java.util.logging.Formatter[] r11 = r1.attachmentNames     // Catch:{ all -> 0x03a9 }
            r11 = r11[r0]     // Catch:{ all -> 0x03a9 }
            java.lang.String r11 = r1.head(r11)     // Catch:{ all -> 0x03a9 }
            r9[r0] = r11     // Catch:{ all -> 0x03a9 }
            r11 = r9[r0]     // Catch:{ all -> 0x03a9 }
            int r11 = r11.length()     // Catch:{ all -> 0x03a9 }
            if (r11 != 0) goto L_0x00ba
            java.util.logging.Formatter[] r11 = r1.attachmentNames     // Catch:{ all -> 0x03a9 }
            r11 = r11[r0]     // Catch:{ all -> 0x03a9 }
            java.lang.String r12 = ""
            java.lang.String r11 = r1.tail(r11, r12)     // Catch:{ all -> 0x03a9 }
            r9[r0] = r11     // Catch:{ all -> 0x03a9 }
            goto L_0x00cc
        L_0x00ba:
            r11 = r9[r0]     // Catch:{ all -> 0x03a9 }
            java.util.logging.Formatter[] r12 = r1.attachmentNames     // Catch:{ all -> 0x03a9 }
            r12 = r12[r0]     // Catch:{ all -> 0x03a9 }
            java.lang.String r13 = ""
            java.lang.String r12 = r1.tail(r12, r13)     // Catch:{ all -> 0x03a9 }
            java.lang.String r11 = r11.concat(r12)     // Catch:{ all -> 0x03a9 }
            r9[r0] = r11     // Catch:{ all -> 0x03a9 }
        L_0x00cc:
            int r0 = r0 + 1
            goto L_0x0099
        L_0x00cf:
            monitor-exit(r16)     // Catch:{ all -> 0x03a9 }
            r1.setIncompleteCopy(r5)
            r0 = 1
            r1.envelopeFor(r5, r0)
            r1.saveChangesNoContent(r5, r7)
            javax.mail.Address[] r0 = r5.getAllRecipients()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r0 != 0) goto L_0x00e2
            javax.mail.internet.InternetAddress[] r0 = new javax.mail.internet.InternetAddress[r10]     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
        L_0x00e2:
            r11 = r0
            int r0 = r11.length     // Catch:{ MessagingException -> 0x0108 }
            if (r0 == 0) goto L_0x00e8
            r0 = r11
            goto L_0x00ec
        L_0x00e8:
            javax.mail.Address[] r0 = r5.getFrom()     // Catch:{ MessagingException -> 0x0108 }
        L_0x00ec:
            if (r0 == 0) goto L_0x00fd
            int r12 = r0.length     // Catch:{ MessagingException -> 0x0108 }
            if (r12 == 0) goto L_0x00fd
            r0 = r0[r10]     // Catch:{ MessagingException -> 0x0108 }
            javax.mail.Transport r0 = r2.getTransport((javax.mail.Address) r0)     // Catch:{ MessagingException -> 0x0108 }
            java.lang.String r12 = "mail.transport.protocol"
            r2.getProperty(r12)     // Catch:{ MessagingException -> 0x0108 }
            goto L_0x0117
        L_0x00fd:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch:{ MessagingException -> 0x0108 }
            java.lang.String r12 = "No recipient or from address."
            r0.<init>(r12)     // Catch:{ MessagingException -> 0x0108 }
            r1.reportError((java.lang.String) r7, (java.lang.Exception) r0, (int) r4)     // Catch:{ MessagingException -> 0x0108 }
            throw r0     // Catch:{ MessagingException -> 0x0108 }
        L_0x0108:
            r0 = move-exception
            r12 = r0
            java.security.PrivilegedAction<java.lang.Object> r0 = MAILHANDLER_LOADER     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.Object r13 = r1.getAndSetContextClassLoader(r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            javax.mail.Transport r0 = r17.getTransport()     // Catch:{ MessagingException -> 0x038c }
            r1.getAndSetContextClassLoader(r13)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
        L_0x0117:
            r12 = r0
            java.lang.String r0 = "remote"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r0 != 0) goto L_0x01ee
            java.lang.String r0 = "login"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r0 == 0) goto L_0x012a
            goto L_0x01ee
        L_0x012a:
            javax.mail.URLName r0 = r12.getURLName()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r0 = r0.getProtocol()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            verifyProperties(r2, r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r13.<init>()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r14 = "mail."
            r13.append(r14)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r13.append(r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r14 = ".host"
            r13.append(r14)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r13 = r13.toString()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r13 = r2.getProperty(r13)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            boolean r14 = isEmpty(r13)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r14 == 0) goto L_0x015c
            java.lang.String r13 = "mail.host"
            java.lang.String r13 = r2.getProperty(r13)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            goto L_0x0161
        L_0x015c:
            java.lang.String r14 = "mail.host"
            r2.getProperty(r14)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
        L_0x0161:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r14.<init>()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r15 = "mail."
            r14.append(r15)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r14.append(r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r15 = ".localhost"
            r14.append(r15)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r14 = r14.toString()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r14 = r2.getProperty(r14)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            boolean r15 = isEmpty(r14)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r15 == 0) goto L_0x019c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r14.<init>()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r15 = "mail."
            r14.append(r15)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r14.append(r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r0 = ".localaddress"
            r14.append(r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r0 = r14.toString()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r14 = r2.getProperty(r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            goto L_0x01b5
        L_0x019c:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r15.<init>()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r10 = "mail."
            r15.append(r10)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r15.append(r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r0 = ".localaddress"
            r15.append(r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r0 = r15.toString()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r2.getProperty(r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
        L_0x01b5:
            java.lang.String r0 = "resolve"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r0 == 0) goto L_0x0267
            javax.mail.URLName r0 = r12.getURLName()     // Catch:{ RuntimeException -> 0x01e0, IOException -> 0x01de, Exception -> 0x0397 }
            java.lang.String r0 = r0.getHost()     // Catch:{ RuntimeException -> 0x01e0, IOException -> 0x01de, Exception -> 0x0397 }
            boolean r2 = isEmpty(r0)     // Catch:{ RuntimeException -> 0x01e0, IOException -> 0x01de, Exception -> 0x0397 }
            if (r2 != 0) goto L_0x01d9
            verifyHost(r0)     // Catch:{ RuntimeException -> 0x01e0, IOException -> 0x01de, Exception -> 0x0397 }
            boolean r0 = r0.equalsIgnoreCase(r13)     // Catch:{ RuntimeException -> 0x01e0, IOException -> 0x01de, Exception -> 0x0397 }
            if (r0 != 0) goto L_0x0267
            verifyHost(r13)     // Catch:{ RuntimeException -> 0x01e0, IOException -> 0x01de, Exception -> 0x0397 }
            goto L_0x0267
        L_0x01d9:
            verifyHost(r13)     // Catch:{ RuntimeException -> 0x01e0, IOException -> 0x01de, Exception -> 0x0397 }
            goto L_0x0267
        L_0x01de:
            r0 = move-exception
            goto L_0x01e1
        L_0x01e0:
            r0 = move-exception
        L_0x01e1:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r2.<init>(r7, r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r1.setErrorContent(r5, r3, r2)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r1.reportError((javax.mail.Message) r5, (java.lang.Exception) r2, (int) r4)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            goto L_0x0267
        L_0x01ee:
            r12.connect()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r10 = 0
            java.lang.String r13 = r1.getLocalHost(r12)     // Catch:{ all -> 0x0227 }
            java.lang.String r0 = "remote"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0224 }
            if (r0 == 0) goto L_0x0201
            r12.sendMessage(r5, r11)     // Catch:{ all -> 0x0224 }
        L_0x0201:
            r12.close()     // Catch:{ MessagingException -> 0x0206 }
            r14 = r10
            goto L_0x0208
        L_0x0206:
            r0 = move-exception
            r14 = r0
        L_0x0208:
            java.lang.String r0 = "remote"
            boolean r0 = r0.equals(r3)     // Catch:{ SendFailedException -> 0x0222, MessagingException -> 0x0220 }
            if (r0 == 0) goto L_0x0214
            r1.reportUnexpectedSend(r5, r3, r10)     // Catch:{ SendFailedException -> 0x0222, MessagingException -> 0x0220 }
            goto L_0x025d
        L_0x0214:
            javax.mail.URLName r0 = r12.getURLName()     // Catch:{ SendFailedException -> 0x0222, MessagingException -> 0x0220 }
            java.lang.String r0 = r0.getProtocol()     // Catch:{ SendFailedException -> 0x0222, MessagingException -> 0x0220 }
            verifyProperties(r2, r0)     // Catch:{ SendFailedException -> 0x0222, MessagingException -> 0x0220 }
            goto L_0x025d
        L_0x0220:
            r0 = move-exception
            goto L_0x0233
        L_0x0222:
            r0 = move-exception
            goto L_0x0242
        L_0x0224:
            r0 = move-exception
            r2 = r0
            goto L_0x022a
        L_0x0227:
            r0 = move-exception
            r2 = r0
            r13 = r10
        L_0x022a:
            r12.close()     // Catch:{ MessagingException -> 0x022e }
            goto L_0x0230
        L_0x022e:
            r0 = move-exception
            r10 = r0
        L_0x0230:
            throw r2     // Catch:{ SendFailedException -> 0x0240, MessagingException -> 0x0231 }
        L_0x0231:
            r0 = move-exception
            r14 = r10
        L_0x0233:
            boolean r2 = r1.isMissingContent(r5, r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r2 != 0) goto L_0x025d
            r1.setErrorContent(r5, r3, r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r1.reportError((javax.mail.Message) r5, (java.lang.Exception) r0, (int) r4)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            goto L_0x025d
        L_0x0240:
            r0 = move-exception
            r14 = r10
        L_0x0242:
            javax.mail.Address[] r2 = r0.getInvalidAddresses()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r2 == 0) goto L_0x0251
            int r2 = r2.length     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r2 == 0) goto L_0x0251
            r1.setErrorContent(r5, r3, r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r1.reportError((javax.mail.Message) r5, (java.lang.Exception) r0, (int) r4)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
        L_0x0251:
            javax.mail.Address[] r2 = r0.getValidSentAddresses()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r2 == 0) goto L_0x025d
            int r2 = r2.length     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r2 == 0) goto L_0x025d
            r1.reportUnexpectedSend(r5, r3, r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
        L_0x025d:
            if (r14 == 0) goto L_0x0266
            r1.setErrorContent(r5, r3, r14)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r0 = 3
            r1.reportError((javax.mail.Message) r5, (java.lang.Exception) r14, (int) r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
        L_0x0266:
            r14 = r13
        L_0x0267:
            java.lang.String r0 = "limited"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r0 != 0) goto L_0x0313
            java.lang.String r0 = "remote"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x0289, IOException -> 0x0287, Exception -> 0x0397 }
            if (r0 != 0) goto L_0x0283
            java.lang.String r0 = "login"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x0289, IOException -> 0x0287, Exception -> 0x0397 }
            if (r0 != 0) goto L_0x0283
            java.lang.String r14 = r1.getLocalHost(r12)     // Catch:{ RuntimeException -> 0x0289, IOException -> 0x0287, Exception -> 0x0397 }
        L_0x0283:
            verifyHost(r14)     // Catch:{ RuntimeException -> 0x0289, IOException -> 0x0287, Exception -> 0x0397 }
            goto L_0x0295
        L_0x0287:
            r0 = move-exception
            goto L_0x028a
        L_0x0289:
            r0 = move-exception
        L_0x028a:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r2.<init>(r7, r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r1.setErrorContent(r5, r3, r2)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r1.reportError((javax.mail.Message) r5, (java.lang.Exception) r2, (int) r4)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
        L_0x0295:
            java.security.PrivilegedAction<java.lang.Object> r0 = MAILHANDLER_LOADER     // Catch:{ IOException -> 0x0307 }
            java.lang.Object r2 = r1.getAndSetContextClassLoader(r0)     // Catch:{ IOException -> 0x0307 }
            javax.mail.internet.MimeMultipart r0 = new javax.mail.internet.MimeMultipart     // Catch:{ all -> 0x0302 }
            r0.<init>()     // Catch:{ all -> 0x0302 }
            javax.mail.internet.MimeBodyPart[] r10 = new javax.mail.internet.MimeBodyPart[r8]     // Catch:{ all -> 0x0302 }
            monitor-enter(r16)     // Catch:{ all -> 0x0302 }
            java.util.logging.Formatter r12 = r16.getFormatter()     // Catch:{ all -> 0x02ff }
            java.lang.String r12 = r1.contentTypeOf((java.util.logging.Formatter) r12)     // Catch:{ all -> 0x02ff }
            javax.mail.internet.MimeBodyPart r13 = r16.createBodyPart()     // Catch:{ all -> 0x02ff }
            r14 = 0
        L_0x02b0:
            if (r14 >= r8) goto L_0x02cb
            javax.mail.internet.MimeBodyPart r15 = r1.createBodyPart(r14)     // Catch:{ all -> 0x02ff }
            r10[r14] = r15     // Catch:{ all -> 0x02ff }
            r15 = r10[r14]     // Catch:{ all -> 0x02ff }
            r4 = r9[r14]     // Catch:{ all -> 0x02ff }
            r15.setFileName(r4)     // Catch:{ all -> 0x02ff }
            r4 = r9[r14]     // Catch:{ all -> 0x02ff }
            java.lang.String r4 = r1.getContentType(r4)     // Catch:{ all -> 0x02ff }
            r9[r14] = r4     // Catch:{ all -> 0x02ff }
            int r14 = r14 + 1
            r4 = 4
            goto L_0x02b0
        L_0x02cb:
            monitor-exit(r16)     // Catch:{ all -> 0x02ff }
            r13.setDescription(r3)     // Catch:{ all -> 0x0302 }
            java.lang.String r4 = ""
            r1.setContent(r13, r4, r12)     // Catch:{ all -> 0x0302 }
            r0.addBodyPart(r13)     // Catch:{ all -> 0x0302 }
            r4 = 0
        L_0x02d8:
            if (r4 >= r8) goto L_0x02eb
            r12 = r10[r4]     // Catch:{ all -> 0x0302 }
            r12.setDescription(r3)     // Catch:{ all -> 0x0302 }
            r12 = r10[r4]     // Catch:{ all -> 0x0302 }
            java.lang.String r13 = ""
            r14 = r9[r4]     // Catch:{ all -> 0x0302 }
            r1.setContent(r12, r13, r14)     // Catch:{ all -> 0x0302 }
            int r4 = r4 + 1
            goto L_0x02d8
        L_0x02eb:
            r5.setContent(r0)     // Catch:{ all -> 0x0302 }
            r5.saveChanges()     // Catch:{ all -> 0x0302 }
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0302 }
            r4 = 1024(0x400, float:1.435E-42)
            r0.<init>(r4)     // Catch:{ all -> 0x0302 }
            r5.writeTo(r0)     // Catch:{ all -> 0x0302 }
            r1.getAndSetContextClassLoader(r2)     // Catch:{ IOException -> 0x0307 }
            goto L_0x0313
        L_0x02ff:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x02ff }
            throw r0     // Catch:{ all -> 0x0302 }
        L_0x0302:
            r0 = move-exception
            r1.getAndSetContextClassLoader(r2)     // Catch:{ IOException -> 0x0307 }
            throw r0     // Catch:{ IOException -> 0x0307 }
        L_0x0307:
            r0 = move-exception
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r2.<init>(r7, r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r1.setErrorContent(r5, r3, r2)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r1.reportError((javax.mail.Message) r5, (java.lang.Exception) r2, (int) r6)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
        L_0x0313:
            int r0 = r11.length     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r0 == 0) goto L_0x0382
            verifyAddresses(r11)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            javax.mail.Address[] r0 = r5.getFrom()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            javax.mail.Address r2 = r5.getSender()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            boolean r4 = r2 instanceof javax.mail.internet.InternetAddress     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r4 == 0) goto L_0x032b
            r4 = r2
            javax.mail.internet.InternetAddress r4 = (javax.mail.internet.InternetAddress) r4     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r4.validate()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
        L_0x032b:
            java.lang.String r4 = "From"
            java.lang.String r6 = ","
            java.lang.String r4 = r5.getHeader(r4, r6)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r4 == 0) goto L_0x036b
            int r4 = r0.length     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r4 == 0) goto L_0x036b
            verifyAddresses(r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r10 = 0
        L_0x033c:
            int r4 = r0.length     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r10 >= r4) goto L_0x036d
            r4 = r0[r10]     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            boolean r4 = r4.equals(r2)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            if (r4 != 0) goto L_0x034a
            int r10 = r10 + 1
            goto L_0x033c
        L_0x034a:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r4.<init>()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r6 = "Sender address '"
            r4.append(r6)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r4.append(r2)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r2 = "' equals from address."
            r4.append(r2)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r2 = r4.toString()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r0.<init>(r2)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r2.<init>(r7, r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            throw r2     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
        L_0x036b:
            if (r2 == 0) goto L_0x0375
        L_0x036d:
            javax.mail.Address[] r0 = r5.getReplyTo()     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            verifyAddresses(r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            goto L_0x03a8
        L_0x0375:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r2 = "No from or sender address."
            r0.<init>(r2)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            r2.<init>(r7, r0)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            throw r2     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
        L_0x0382:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            java.lang.String r2 = "No recipient addresses."
            r0.<init>(r2)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            throw r0     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
        L_0x038a:
            r0 = move-exception
            goto L_0x0393
        L_0x038c:
            r0 = move-exception
            r2 = r0
            javax.mail.MessagingException r0 = attach(r12, r2)     // Catch:{ all -> 0x038a }
            throw r0     // Catch:{ all -> 0x038a }
        L_0x0393:
            r1.getAndSetContextClassLoader(r13)     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
            throw r0     // Catch:{ RuntimeException -> 0x03a0, Exception -> 0x0397 }
        L_0x0397:
            r0 = move-exception
            r1.setErrorContent(r5, r3, r0)
            r2 = 4
            r1.reportError((javax.mail.Message) r5, (java.lang.Exception) r0, (int) r2)
            goto L_0x03a8
        L_0x03a0:
            r0 = move-exception
            r2 = 4
            r1.setErrorContent(r5, r3, r0)
            r1.reportError((javax.mail.Message) r5, (java.lang.Exception) r0, (int) r2)
        L_0x03a8:
            return
        L_0x03a9:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x03a9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.MailHandler.verifySettings0(javax.mail.Session, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private javax.mail.Message writeLogRecords(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)     // Catch:{ RuntimeException -> 0x0035, Exception -> 0x002c }
            int r0 = r2.size     // Catch:{ all -> 0x0029 }
            if (r0 <= 0) goto L_0x0027
            boolean r0 = r2.isWriting     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0027
            r0 = 1
            r2.isWriting = r0     // Catch:{ all -> 0x0029 }
            r0 = 0
            javax.mail.Message r1 = r2.writeLogRecords0()     // Catch:{ all -> 0x001c }
            r2.isWriting = r0     // Catch:{ all -> 0x0029 }
            int r0 = r2.size     // Catch:{ all -> 0x0029 }
            if (r0 <= 0) goto L_0x001a
            r2.reset()     // Catch:{ all -> 0x0029 }
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return r1
        L_0x001c:
            r1 = move-exception
            r2.isWriting = r0     // Catch:{ all -> 0x0029 }
            int r0 = r2.size     // Catch:{ all -> 0x0029 }
            if (r0 <= 0) goto L_0x0026
            r2.reset()     // Catch:{ all -> 0x0029 }
        L_0x0026:
            throw r1     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            goto L_0x003d
        L_0x0029:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            throw r0     // Catch:{ RuntimeException -> 0x0035, Exception -> 0x002c }
        L_0x002c:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            r2.reportError((java.lang.String) r1, (java.lang.Exception) r0, (int) r3)
            goto L_0x003d
        L_0x0035:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            r2.reportError((java.lang.String) r1, (java.lang.Exception) r0, (int) r3)
        L_0x003d:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.MailHandler.writeLogRecords(int):javax.mail.Message");
    }

    private Message writeLogRecords0() throws Exception {
        MimePart mimePart;
        StringBuilder sb;
        Filter filter2;
        boolean z;
        sort();
        if (this.session == null) {
            initSession();
        }
        MimeMessage mimeMessage = new MimeMessage(this.session);
        int length = this.attachmentFormatters.length;
        MimeBodyPart[] mimeBodyPartArr = new MimeBodyPart[length];
        StringBuilder[] sbArr = new StringBuilder[length];
        if (length == 0) {
            mimeMessage.setDescription(descriptionFrom(getFormatter(), getFilter(), this.subjectFormatter));
            mimePart = mimeMessage;
        } else {
            mimeMessage.setDescription(descriptionFrom((Comparator<?>) this.comparator, this.pushLevel, this.pushFilter));
            mimePart = createBodyPart();
        }
        appendSubject(mimeMessage, head(this.subjectFormatter));
        Formatter formatter2 = getFormatter();
        Filter filter3 = getFilter();
        LogRecord logRecord = null;
        StringBuilder sb2 = null;
        Locale locale = null;
        int i = 0;
        while (i < this.size) {
            int i2 = this.matched[i];
            LogRecord[] logRecordArr = this.data;
            LogRecord logRecord2 = logRecordArr[i];
            logRecordArr[i] = logRecord;
            Locale localeFor = localeFor(logRecord2);
            appendSubject(mimeMessage, format(this.subjectFormatter, logRecord2));
            if (filter3 == null || i2 == -1 || length == 0 || (i2 < -1 && filter3.isLoggable(logRecord2))) {
                if (sb2 == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(head(formatter2));
                    sb2 = sb3;
                }
                sb2.append(format(formatter2, logRecord2));
                if (localeFor != null && !localeFor.equals(locale)) {
                    appendContentLang(mimePart, localeFor);
                }
                filter2 = filter3;
                z = true;
            } else {
                z = false;
                filter2 = null;
            }
            Filter filter4 = filter3;
            Filter filter5 = filter2;
            int i3 = 0;
            while (i3 < length) {
                StringBuilder sb4 = sb2;
                Filter filter6 = this.attachmentFilters[i3];
                if (filter6 == null || filter5 == filter6 || i2 == i3 || (i2 < i3 && filter6.isLoggable(logRecord2))) {
                    if (filter5 == null && filter6 != null) {
                        filter5 = filter6;
                    }
                    if (mimeBodyPartArr[i3] == null) {
                        mimeBodyPartArr[i3] = createBodyPart(i3);
                        sbArr[i3] = new StringBuilder();
                        sbArr[i3].append(head(this.attachmentFormatters[i3]));
                        appendFileName(mimeBodyPartArr[i3], head(this.attachmentNames[i3]));
                    }
                    appendFileName(mimeBodyPartArr[i3], format(this.attachmentNames[i3], logRecord2));
                    sbArr[i3].append(format(this.attachmentFormatters[i3], logRecord2));
                    if (localeFor != null && !localeFor.equals(locale)) {
                        appendContentLang(mimeBodyPartArr[i3], localeFor);
                    }
                    z = true;
                }
                i3++;
                sb2 = sb4;
            }
            StringBuilder sb5 = sb2;
            if (!z) {
                reportFilterError(logRecord2);
            } else if (!(mimePart == mimeMessage || localeFor == null || localeFor.equals(locale))) {
                appendContentLang(mimeMessage, localeFor);
            }
            i++;
            locale = localeFor;
            filter3 = filter4;
            sb2 = sb5;
            logRecord = null;
        }
        this.size = 0;
        for (int i4 = length - 1; i4 >= 0; i4--) {
            if (mimeBodyPartArr[i4] != null) {
                appendFileName(mimeBodyPartArr[i4], tail(this.attachmentNames[i4], NotificationCompat.CATEGORY_ERROR));
                sbArr[i4].append(tail(this.attachmentFormatters[i4], ""));
                if (sbArr[i4].length() > 0) {
                    String fileName = mimeBodyPartArr[i4].getFileName();
                    if (isEmpty(fileName)) {
                        fileName = toString(this.attachmentFormatters[i4]);
                        mimeBodyPartArr[i4].setFileName(fileName);
                    }
                    setContent(mimeBodyPartArr[i4], sbArr[i4], getContentType(fileName));
                    sb = null;
                } else {
                    setIncompleteCopy(mimeMessage);
                    sb = null;
                    mimeBodyPartArr[i4] = null;
                }
                sbArr[i4] = sb;
            }
        }
        if (sb2 != null) {
            sb2.append(tail(formatter2, ""));
        } else {
            sb2 = new StringBuilder(0);
        }
        appendSubject(mimeMessage, tail(this.subjectFormatter, ""));
        String contentTypeOf = contentTypeOf((CharSequence) sb2);
        String contentTypeOf2 = contentTypeOf(formatter2);
        if (contentTypeOf2 != null) {
            contentTypeOf = contentTypeOf2;
        }
        setContent(mimePart, sb2, contentTypeOf);
        if (mimePart != mimeMessage) {
            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart((BodyPart) mimePart);
            for (int i5 = 0; i5 < length; i5++) {
                if (mimeBodyPartArr[i5] != null) {
                    mimeMultipart.addBodyPart(mimeBodyPartArr[i5]);
                }
            }
            mimeMessage.setContent(mimeMultipart);
        }
        return mimeMessage;
    }

    public void close() {
        Message writeLogRecords;
        try {
            checkAccess();
            synchronized (this) {
                try {
                    writeLogRecords = writeLogRecords(3);
                    this.logLevel = Level.OFF;
                    int i = this.capacity;
                    if (i > 0) {
                        this.capacity = -i;
                    }
                    if (this.size == 0 && this.data.length != 1) {
                        LogRecord[] logRecordArr = new LogRecord[1];
                        this.data = logRecordArr;
                        this.matched = new int[logRecordArr.length];
                    }
                } catch (Throwable th) {
                    this.logLevel = Level.OFF;
                    if (this.capacity > 0) {
                        this.capacity = -this.capacity;
                    }
                    if (this.size == 0 && this.data.length != 1) {
                        LogRecord[] logRecordArr2 = new LogRecord[1];
                        this.data = logRecordArr2;
                        this.matched = new int[logRecordArr2.length];
                    }
                    throw th;
                }
            }
            if (writeLogRecords != null) {
                send(writeLogRecords, false, 3);
            }
        } catch (LinkageError e) {
            reportLinkageError(e, 3);
        }
    }

    /* access modifiers changed from: package-private */
    public final String contentTypeOf(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return null;
        }
        if (charSequence.length() > 25) {
            charSequence = charSequence.subSequence(0, 25);
        }
        try {
            return URLConnection.guessContentTypeFromStream(new ByteArrayInputStream(charSequence.toString().getBytes(getEncodingName())));
        } catch (IOException e) {
            reportError(e.getMessage(), (Exception) e, 5);
            return null;
        }
    }

    public void flush() {
        push(false, 2);
    }

    public final Filter[] getAttachmentFilters() {
        return (Filter[]) readOnlyAttachmentFilters().clone();
    }

    public final Formatter[] getAttachmentFormatters() {
        Formatter[] formatterArr;
        synchronized (this) {
            formatterArr = this.attachmentFormatters;
        }
        return (Formatter[]) formatterArr.clone();
    }

    public final Formatter[] getAttachmentNames() {
        Formatter[] formatterArr;
        synchronized (this) {
            formatterArr = this.attachmentNames;
        }
        return (Formatter[]) formatterArr.clone();
    }

    public final synchronized Authenticator getAuthenticator() {
        checkAccess();
        return this.auth;
    }

    public final synchronized int getCapacity() {
        return Math.abs(this.capacity);
    }

    public final synchronized Comparator<? super LogRecord> getComparator() {
        return this.comparator;
    }

    public synchronized String getEncoding() {
        return this.encoding;
    }

    public ErrorManager getErrorManager() {
        checkAccess();
        return this.errorManager;
    }

    public Filter getFilter() {
        return this.filter;
    }

    public synchronized Formatter getFormatter() {
        return this.formatter;
    }

    public Level getLevel() {
        return this.logLevel;
    }

    public final Properties getMailProperties() {
        Properties properties;
        checkAccess();
        synchronized (this) {
            properties = this.mailProps;
        }
        return (Properties) properties.clone();
    }

    public final synchronized Filter getPushFilter() {
        return this.pushFilter;
    }

    public final synchronized Level getPushLevel() {
        return this.pushLevel;
    }

    public final synchronized Formatter getSubject() {
        return this.subjectFormatter;
    }

    public boolean isLoggable(LogRecord logRecord) {
        int intValue;
        if (logRecord == null || logRecord.getLevel().intValue() < (intValue = getLevel().intValue()) || intValue == offValue) {
            return false;
        }
        Filter filter2 = getFilter();
        if (filter2 != null && !filter2.isLoggable(logRecord)) {
            return isAttachmentLoggable(logRecord);
        }
        setMatchedPart(-1);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean isMissingContent(Message message, Throwable th) {
        Object andSetContextClassLoader = getAndSetContextClassLoader(MAILHANDLER_LOADER);
        try {
            message.writeTo(new ByteArrayOutputStream(1024));
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            String message2 = e2.getMessage();
            if (!isEmpty(message2)) {
                int i = 0;
                while (true) {
                    if (th == null) {
                        break;
                    } else if (e2.getClass() != th.getClass() || !message2.equals(th.getMessage())) {
                        Throwable cause = th.getCause();
                        th = (cause != null || !(th instanceof MessagingException)) ? cause : ((MessagingException) th).getNextException();
                        i++;
                        if (i == 65536) {
                            break;
                        }
                    } else {
                        getAndSetContextClassLoader(andSetContextClassLoader);
                        return true;
                    }
                }
            }
        } catch (Throwable th2) {
            getAndSetContextClassLoader(andSetContextClassLoader);
            throw th2;
        }
        getAndSetContextClassLoader(andSetContextClassLoader);
        return false;
    }

    public void postConstruct() {
    }

    public void preDestroy() {
        push(false, 3);
    }

    public void publish(LogRecord logRecord) {
        if (tryMutex()) {
            try {
                if (isLoggable(logRecord)) {
                    if (logRecord != null) {
                        logRecord.getSourceMethodName();
                        publish0(logRecord);
                    } else {
                        reportNullError(1);
                    }
                }
            } catch (LinkageError e) {
                reportLinkageError(e, 1);
            } catch (Throwable th) {
                releaseMutex();
                throw th;
            }
            releaseMutex();
            return;
        }
        reportUnPublishedError(logRecord);
    }

    public void push() {
        push(true, 2);
    }

    /* access modifiers changed from: protected */
    public void reportError(String str, Exception exc, int i) {
        if (str != null) {
            try {
                this.errorManager.error(Level.SEVERE.getName().concat(": ").concat(str), exc, i);
            } catch (LinkageError | RuntimeException e) {
                reportLinkageError(e, i);
            }
        } else {
            this.errorManager.error((String) null, exc, i);
        }
    }

    public final void setAttachmentFilters(Filter... filterArr) {
        Filter[] filterArr2;
        checkAccess();
        if (filterArr.length == 0) {
            filterArr2 = emptyFilterArray();
        } else {
            filterArr2 = (Filter[]) Arrays.copyOf(filterArr, filterArr.length, Filter[].class);
        }
        synchronized (this) {
            Formatter[] formatterArr = this.attachmentFormatters;
            if (formatterArr.length != filterArr2.length) {
                throw attachmentMismatch(formatterArr.length, filterArr2.length);
            } else if (!this.isWriting) {
                if (this.size != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= filterArr2.length) {
                            break;
                        } else if (filterArr2[i] != this.attachmentFilters[i]) {
                            clearMatches(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                this.attachmentFilters = filterArr2;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void setAttachmentFormatters(Formatter... formatterArr) {
        Formatter[] formatterArr2;
        checkAccess();
        if (formatterArr.length == 0) {
            formatterArr2 = emptyFormatterArray();
        } else {
            formatterArr2 = (Formatter[]) Arrays.copyOf(formatterArr, formatterArr.length, Formatter[].class);
            int i = 0;
            while (i < formatterArr2.length) {
                if (formatterArr2[i] != null) {
                    i++;
                } else {
                    throw new NullPointerException(atIndexMsg(i));
                }
            }
        }
        synchronized (this) {
            if (!this.isWriting) {
                this.attachmentFormatters = formatterArr2;
                alignAttachmentFilters();
                alignAttachmentNames();
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void setAttachmentNames(String... strArr) {
        Formatter[] formatterArr;
        checkAccess();
        if (strArr.length == 0) {
            formatterArr = emptyFormatterArray();
        } else {
            formatterArr = new Formatter[strArr.length];
        }
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            if (str == null) {
                throw new NullPointerException(atIndexMsg(i));
            } else if (str.length() > 0) {
                formatterArr[i] = TailNameFormatter.m81923of(str);
                i++;
            } else {
                throw new IllegalArgumentException(atIndexMsg(i));
            }
        }
        synchronized (this) {
            Formatter[] formatterArr2 = this.attachmentFormatters;
            if (formatterArr2.length != strArr.length) {
                throw attachmentMismatch(formatterArr2.length, strArr.length);
            } else if (!this.isWriting) {
                this.attachmentNames = formatterArr;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void setAuthenticator(Authenticator authenticator) {
        setAuthenticator0(authenticator);
    }

    public final synchronized void setComparator(Comparator<? super LogRecord> comparator2) {
        checkAccess();
        if (!this.isWriting) {
            this.comparator = comparator2;
        } else {
            throw new IllegalStateException();
        }
    }

    public void setEncoding(String str) throws UnsupportedEncodingException {
        checkAccess();
        setEncoding0(str);
    }

    public void setErrorManager(ErrorManager errorManager2) {
        checkAccess();
        setErrorManager0(errorManager2);
    }

    public void setFilter(Filter filter2) {
        checkAccess();
        synchronized (this) {
            if (filter2 != this.filter) {
                clearMatches(-1);
            }
            this.filter = filter2;
        }
    }

    public synchronized void setFormatter(Formatter formatter2) throws SecurityException {
        checkAccess();
        if (formatter2 != null) {
            this.formatter = formatter2;
        } else {
            throw new NullPointerException();
        }
    }

    public void setLevel(Level level) {
        Objects.requireNonNull(level);
        checkAccess();
        synchronized (this) {
            if (this.capacity > 0) {
                this.logLevel = level;
            }
        }
    }

    public final void setMailProperties(Properties properties) {
        setMailProperties0(properties);
    }

    public final synchronized void setPushFilter(Filter filter2) {
        checkAccess();
        if (!this.isWriting) {
            this.pushFilter = filter2;
        } else {
            throw new IllegalStateException();
        }
    }

    public final synchronized void setPushLevel(Level level) {
        checkAccess();
        if (level == null) {
            throw new NullPointerException();
        } else if (!this.isWriting) {
            this.pushLevel = level;
        } else {
            throw new IllegalStateException();
        }
    }

    public final void setSubject(String str) {
        if (str != null) {
            setSubject(TailNameFormatter.m81923of(str));
        } else {
            checkAccess();
            throw null;
        }
    }

    private static RuntimeException attachmentMismatch(int i, int i2) {
        return attachmentMismatch("Attachments mismatched, expected " + i + " but given " + i2 + FilenameUtils.EXTENSION_SEPARATOR);
    }

    private void push(boolean z, int i) {
        if (tryMutex()) {
            try {
                Message writeLogRecords = writeLogRecords(i);
                if (writeLogRecords != null) {
                    send(writeLogRecords, z, i);
                }
            } catch (LinkageError e) {
                reportLinkageError(e, i);
            } catch (Throwable th) {
                releaseMutex();
                throw th;
            }
            releaseMutex();
            return;
        }
        reportUnPublishedError((LogRecord) null);
    }

    public final void setAuthenticator(char... cArr) {
        if (cArr == null) {
            setAuthenticator0((Authenticator) null);
        } else {
            setAuthenticator0(DefaultAuthenticator.m81922of(new String(cArr)));
        }
    }

    private String descriptionFrom(Formatter formatter2, Filter filter2, Formatter formatter3) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Formatted using ");
        sb.append(getClassId(formatter2));
        sb.append(", filtered with ");
        if (filter2 == null) {
            str = "no filter";
        } else {
            str = filter2.getClass().getName();
        }
        sb.append(str);
        sb.append(", and named by ");
        sb.append(getClassId(formatter3));
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        return sb.toString();
    }

    public final void setSubject(Formatter formatter2) {
        checkAccess();
        Objects.requireNonNull(formatter2);
        synchronized (this) {
            if (!this.isWriting) {
                this.subjectFormatter = formatter2;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    private void reportError(Message message, Exception exc, int i) {
        try {
            this.errorManager.error(toRawString(message), exc, i);
        } catch (RuntimeException e) {
            reportError(toMsgString(e), exc, i);
        } catch (Exception e2) {
            try {
                reportError(toMsgString(e2), exc, i);
            } catch (LinkageError e3) {
                reportLinkageError(e3, i);
            }
        }
    }

    public MailHandler(int i) {
        init((Properties) null);
        this.sealed = true;
        setCapacity0(i);
    }

    private MimeBodyPart createBodyPart(int i) throws MessagingException {
        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setDisposition(Part.ATTACHMENT);
        mimeBodyPart.setDescription(descriptionFrom(this.attachmentFormatters[i], this.attachmentFilters[i], this.attachmentNames[i]));
        setAcceptLang(mimeBodyPart);
        return mimeBodyPart;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        r7 = r7.getSuperclass();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String contentTypeOf(java.util.logging.Formatter r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0067
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = r6.getContentType(r0)
            if (r0 == 0) goto L_0x0011
            return r0
        L_0x0011:
            java.lang.Class r7 = r7.getClass()
        L_0x0015:
            java.lang.Class<java.util.logging.Formatter> r0 = java.util.logging.Formatter.class
            if (r7 == r0) goto L_0x0067
            java.lang.String r0 = r7.getSimpleName()     // Catch:{ InternalError -> 0x001e }
            goto L_0x0022
        L_0x001e:
            java.lang.String r0 = r7.getName()
        L_0x0022:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r1)
            r1 = 36
            int r1 = r0.indexOf(r1)
            r2 = 1
            int r1 = r1 + r2
        L_0x0030:
            java.lang.String r3 = "ml"
            int r1 = r0.indexOf(r3, r1)
            r3 = -1
            if (r1 <= r3) goto L_0x0062
            if (r1 <= 0) goto L_0x005f
            int r3 = r1 + -1
            char r4 = r0.charAt(r3)
            r5 = 120(0x78, float:1.68E-43)
            if (r4 != r5) goto L_0x0048
            java.lang.String r7 = "application/xml"
            return r7
        L_0x0048:
            if (r1 <= r2) goto L_0x005f
            int r4 = r1 + -2
            char r4 = r0.charAt(r4)
            r5 = 104(0x68, float:1.46E-43)
            if (r4 != r5) goto L_0x005f
            char r3 = r0.charAt(r3)
            r4 = 116(0x74, float:1.63E-43)
            if (r3 != r4) goto L_0x005f
            java.lang.String r7 = "text/html"
            return r7
        L_0x005f:
            int r1 = r1 + 2
            goto L_0x0030
        L_0x0062:
            java.lang.Class r7 = r7.getSuperclass()
            goto L_0x0015
        L_0x0067:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.MailHandler.contentTypeOf(java.util.logging.Formatter):java.lang.String");
    }

    public MailHandler(Properties properties) {
        Objects.requireNonNull(properties);
        init(properties);
        this.sealed = true;
        setMailProperties0(properties);
    }

    public final void setAttachmentNames(Formatter... formatterArr) {
        Formatter[] formatterArr2;
        checkAccess();
        if (formatterArr.length == 0) {
            formatterArr2 = emptyFormatterArray();
        } else {
            formatterArr2 = (Formatter[]) Arrays.copyOf(formatterArr, formatterArr.length, Formatter[].class);
        }
        int i = 0;
        while (i < formatterArr2.length) {
            if (formatterArr2[i] != null) {
                i++;
            } else {
                throw new NullPointerException(atIndexMsg(i));
            }
        }
        synchronized (this) {
            Formatter[] formatterArr3 = this.attachmentFormatters;
            if (formatterArr3.length != formatterArr2.length) {
                throw attachmentMismatch(formatterArr3.length, formatterArr2.length);
            } else if (!this.isWriting) {
                this.attachmentNames = formatterArr2;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    private Object intern(Map<Object, Object> map, Object obj) throws Exception {
        Object obj2;
        if (obj == null) {
            return null;
        }
        if (obj.getClass().getName().equals(TailNameFormatter.class.getName())) {
            obj2 = obj;
        } else {
            obj2 = obj.getClass().getConstructor(new Class[0]).newInstance(new Object[0]);
        }
        if (obj2.getClass() != obj.getClass()) {
            return obj;
        }
        Object obj3 = map.get(obj2);
        if (obj3 == null) {
            boolean equals = obj2.equals(obj);
            boolean equals2 = obj.equals(obj2);
            if (equals && equals2) {
                Object put = map.put(obj, obj);
                if (put == null) {
                    return obj;
                }
                reportNonDiscriminating(obj2, put);
                Object remove = map.remove(obj2);
                if (remove == obj) {
                    return obj;
                }
                reportNonDiscriminating(obj2, remove);
                map.clear();
                return obj;
            } else if (equals == equals2) {
                return obj;
            } else {
                reportNonSymmetric(obj, obj2);
                return obj;
            }
        } else if (obj.getClass() == obj3.getClass()) {
            return obj3;
        } else {
            reportNonDiscriminating(obj, obj3);
            return obj;
        }
    }
}
