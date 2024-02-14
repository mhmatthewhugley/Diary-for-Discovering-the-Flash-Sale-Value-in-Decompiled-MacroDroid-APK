package javax.mail;

import androidx.core.app.NotificationCompat;
import com.sun.mail.util.DefaultProvider;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.MailLogger;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.ServiceLoader;
import java.util.StringTokenizer;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import javax.mail.Provider;

public final class Session {
    private static final String confDir;
    private static Session defaultSession;
    /* access modifiers changed from: private */
    public final Properties addressMap = new Properties();
    private final Hashtable<URLName, PasswordAuthentication> authTable = new Hashtable<>();
    private final Authenticator authenticator;
    private boolean debug = false;
    private MailLogger logger;
    private PrintStream out;
    private final Properties props;
    private final List<Provider> providers = new ArrayList();
    private final Map<String, Provider> providersByClassName = new HashMap();
    private final Map<String, Provider> providersByProtocol = new HashMap();

    /* renamed from: q */
    private final EventQueue f61340q;

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new PrivilegedAction<String>() {
                public String run() {
                    String property = System.getProperty("java.home");
                    StringBuilder sb = new StringBuilder();
                    sb.append(property);
                    String str = File.separator;
                    sb.append(str);
                    sb.append("conf");
                    String sb2 = sb.toString();
                    if (new File(sb2).exists()) {
                        return sb2 + str;
                    }
                    return property + str + "lib" + str;
                }
            });
        } catch (Exception unused) {
            str = null;
        }
        confDir = str;
    }

    private Session(Properties properties, Authenticator authenticator2) {
        Class cls;
        this.props = properties;
        this.authenticator = authenticator2;
        if (Boolean.valueOf(properties.getProperty("mail.debug")).booleanValue()) {
            this.debug = true;
        }
        initLogger();
        this.logger.log(Level.CONFIG, "Jakarta Mail version {0}", (Object) Version.version);
        if (authenticator2 != null) {
            cls = authenticator2.getClass();
        } else {
            cls = Session.class;
        }
        loadProviders(cls);
        loadAddressMap(cls);
        this.f61340q = new EventQueue((Executor) properties.get("mail.event.executor"));
    }

    static ClassLoader getContextClassLoader() {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() {
            public ClassLoader run() {
                try {
                    return Thread.currentThread().getContextClassLoader();
                } catch (SecurityException unused) {
                    return null;
                }
            }
        });
    }

    public static synchronized Session getDefaultInstance(Properties properties, Authenticator authenticator2) {
        Session session;
        synchronized (Session.class) {
            Session session2 = defaultSession;
            if (session2 == null) {
                SecurityManager securityManager = System.getSecurityManager();
                if (securityManager != null) {
                    securityManager.checkSetFactory();
                }
                defaultSession = new Session(properties, authenticator2);
            } else {
                Authenticator authenticator3 = session2.authenticator;
                if (authenticator3 != authenticator2) {
                    if (authenticator3 == null || authenticator2 == null || authenticator3.getClass().getClassLoader() != authenticator2.getClass().getClassLoader()) {
                        throw new SecurityException("Access to default session denied");
                    }
                }
            }
            session = defaultSession;
        }
        return session;
    }

    public static Session getInstance(Properties properties, Authenticator authenticator2) {
        return new Session(properties, authenticator2);
    }

    private static InputStream getResourceAsStream(final Class<?> cls, final String str) throws IOException {
        try {
            return (InputStream) AccessController.doPrivileged(new PrivilegedExceptionAction<InputStream>() {
                public InputStream run() throws IOException {
                    try {
                        return cls.getResourceAsStream(str);
                    } catch (RuntimeException e) {
                        IOException iOException = new IOException("ClassLoader.getResourceAsStream failed");
                        iOException.initCause(e);
                        throw iOException;
                    }
                }
            });
        } catch (PrivilegedActionException e) {
            throw ((IOException) e.getException());
        }
    }

    private static URL[] getResources(final ClassLoader classLoader, final String str) {
        return (URL[]) AccessController.doPrivileged(new PrivilegedAction<URL[]>() {
            public URL[] run() {
                try {
                    ArrayList<T> list = Collections.list(classLoader.getResources(str));
                    if (list.isEmpty()) {
                        return null;
                    }
                    URL[] urlArr = new URL[list.size()];
                    list.toArray(urlArr);
                    return urlArr;
                } catch (IOException | SecurityException unused) {
                    return null;
                }
            }
        });
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:25|26|(3:36|37|38)) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r13.isAssignableFrom(r4) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r4 = java.lang.Class.forName(r11.getClassName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        if (r13.isAssignableFrom(r4) == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        throw new java.lang.ClassCastException(r13.getName() + " " + r4.getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d2, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d3, code lost:
        r10.logger.log(java.util.logging.Level.FINE, "Exception loading provider", (java.lang.Throwable) r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e3, code lost:
        throw new javax.mail.NoSuchProviderException(r11.getProtocol());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0073 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T extends javax.mail.Service> T getService(javax.mail.Provider r11, javax.mail.URLName r12, java.lang.Class<T> r13) throws javax.mail.NoSuchProviderException {
        /*
            r10 = this;
            java.lang.String r0 = " "
            java.lang.String r1 = "Exception loading provider"
            java.lang.Class<javax.mail.Session> r2 = javax.mail.Session.class
            if (r11 == 0) goto L_0x00e4
            if (r12 != 0) goto L_0x0019
            javax.mail.URLName r12 = new javax.mail.URLName
            java.lang.String r4 = r11.getProtocol()
            r5 = 0
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x0019:
            javax.mail.Authenticator r3 = r10.authenticator
            if (r3 == 0) goto L_0x0026
            java.lang.Class r3 = r3.getClass()
            java.lang.ClassLoader r3 = r3.getClassLoader()
            goto L_0x002a
        L_0x0026:
            java.lang.ClassLoader r3 = r2.getClassLoader()
        L_0x002a:
            r4 = 0
            r5 = 0
            java.lang.ClassLoader r6 = getContextClassLoader()     // Catch:{ Exception -> 0x0073 }
            if (r6 == 0) goto L_0x003c
            java.lang.String r7 = r11.getClassName()     // Catch:{ ClassNotFoundException -> 0x003b }
            java.lang.Class r4 = java.lang.Class.forName(r7, r5, r6)     // Catch:{ ClassNotFoundException -> 0x003b }
            goto L_0x003c
        L_0x003b:
        L_0x003c:
            if (r4 == 0) goto L_0x0044
            boolean r6 = r13.isAssignableFrom(r4)     // Catch:{ Exception -> 0x0073 }
            if (r6 != 0) goto L_0x004c
        L_0x0044:
            java.lang.String r4 = r11.getClassName()     // Catch:{ Exception -> 0x0073 }
            java.lang.Class r4 = java.lang.Class.forName(r4, r5, r3)     // Catch:{ Exception -> 0x0073 }
        L_0x004c:
            boolean r3 = r13.isAssignableFrom(r4)     // Catch:{ Exception -> 0x0073 }
            if (r3 == 0) goto L_0x0053
            goto L_0x0081
        L_0x0053:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException     // Catch:{ Exception -> 0x0073 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0073 }
            r6.<init>()     // Catch:{ Exception -> 0x0073 }
            java.lang.String r7 = r13.getName()     // Catch:{ Exception -> 0x0073 }
            r6.append(r7)     // Catch:{ Exception -> 0x0073 }
            r6.append(r0)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x0073 }
            r6.append(r4)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x0073 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0073 }
            throw r3     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            java.lang.String r3 = r11.getClassName()     // Catch:{ Exception -> 0x00d2 }
            java.lang.Class r4 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x00d2 }
            boolean r3 = r13.isAssignableFrom(r4)     // Catch:{ Exception -> 0x00d2 }
            if (r3 == 0) goto L_0x00b2
        L_0x0081:
            r0 = 2
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x00a0 }
            r3[r5] = r2     // Catch:{ Exception -> 0x00a0 }
            java.lang.Class<javax.mail.URLName> r2 = javax.mail.URLName.class
            r6 = 1
            r3[r6] = r2     // Catch:{ Exception -> 0x00a0 }
            java.lang.reflect.Constructor r2 = r4.getConstructor(r3)     // Catch:{ Exception -> 0x00a0 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00a0 }
            r0[r5] = r10     // Catch:{ Exception -> 0x00a0 }
            r0[r6] = r12     // Catch:{ Exception -> 0x00a0 }
            java.lang.Object r11 = r2.newInstance(r0)     // Catch:{ Exception -> 0x00a0 }
            java.lang.Object r11 = r13.cast(r11)
            javax.mail.Service r11 = (javax.mail.Service) r11
            return r11
        L_0x00a0:
            r12 = move-exception
            com.sun.mail.util.MailLogger r13 = r10.logger
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            r13.log((java.util.logging.Level) r0, (java.lang.String) r1, (java.lang.Throwable) r12)
            javax.mail.NoSuchProviderException r12 = new javax.mail.NoSuchProviderException
            java.lang.String r11 = r11.getProtocol()
            r12.<init>(r11)
            throw r12
        L_0x00b2:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException     // Catch:{ Exception -> 0x00d2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d2 }
            r2.<init>()     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r13 = r13.getName()     // Catch:{ Exception -> 0x00d2 }
            r2.append(r13)     // Catch:{ Exception -> 0x00d2 }
            r2.append(r0)     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r13 = r4.getName()     // Catch:{ Exception -> 0x00d2 }
            r2.append(r13)     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r13 = r2.toString()     // Catch:{ Exception -> 0x00d2 }
            r12.<init>(r13)     // Catch:{ Exception -> 0x00d2 }
            throw r12     // Catch:{ Exception -> 0x00d2 }
        L_0x00d2:
            r12 = move-exception
            com.sun.mail.util.MailLogger r13 = r10.logger
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            r13.log((java.util.logging.Level) r0, (java.lang.String) r1, (java.lang.Throwable) r12)
            javax.mail.NoSuchProviderException r12 = new javax.mail.NoSuchProviderException
            java.lang.String r11 = r11.getProtocol()
            r12.<init>(r11)
            throw r12
        L_0x00e4:
            javax.mail.NoSuchProviderException r11 = new javax.mail.NoSuchProviderException
            java.lang.String r12 = "null"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.Session.getService(javax.mail.Provider, javax.mail.URLName, java.lang.Class):javax.mail.Service");
    }

    private static URL[] getSystemResources(final String str) {
        return (URL[]) AccessController.doPrivileged(new PrivilegedAction<URL[]>() {
            public URL[] run() {
                try {
                    ArrayList<T> list = Collections.list(ClassLoader.getSystemResources(str));
                    if (list.isEmpty()) {
                        return null;
                    }
                    URL[] urlArr = new URL[list.size()];
                    list.toArray(urlArr);
                    return urlArr;
                } catch (IOException | SecurityException unused) {
                    return null;
                }
            }
        });
    }

    private final synchronized void initLogger() {
        this.logger = new MailLogger((Class<?>) Session.class, "DEBUG", this.debug, getDebugOut());
    }

    private void loadAddressMap(Class<?> cls) {
        C133523 r0 = new StreamLoader() {
            public void load(InputStream inputStream) throws IOException {
                Session.this.addressMap.load(inputStream);
            }
        };
        loadResource("/META-INF/javamail.default.address.map", cls, r0, true);
        loadAllResources("META-INF/javamail.address.map", cls, r0);
        try {
            String str = confDir;
            if (str != null) {
                loadFile(str + "javamail.address.map", r0);
            }
        } catch (SecurityException unused) {
        }
        if (this.addressMap.isEmpty()) {
            this.logger.config("failed to load address map, using defaults");
            this.addressMap.put("rfc822", "smtp");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006d, code lost:
        if (r6 != null) goto L_0x006f;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x007f */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0062 A[Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x0063, SecurityException -> 0x0056, all -> 0x0054, all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x007c A[SYNTHETIC, Splitter:B:53:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0083 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void loadAllResources(java.lang.String r11, java.lang.Class<?> r12, javax.mail.StreamLoader r13) {
        /*
            r10 = this;
            java.lang.String r0 = "Exception loading resource"
            r1 = 0
            java.lang.ClassLoader r2 = getContextClassLoader()     // Catch:{ Exception -> 0x008a }
            if (r2 != 0) goto L_0x000d
            java.lang.ClassLoader r2 = r12.getClassLoader()     // Catch:{ Exception -> 0x008a }
        L_0x000d:
            if (r2 == 0) goto L_0x0014
            java.net.URL[] r2 = getResources(r2, r11)     // Catch:{ Exception -> 0x008a }
            goto L_0x0018
        L_0x0014:
            java.net.URL[] r2 = getSystemResources(r11)     // Catch:{ Exception -> 0x008a }
        L_0x0018:
            if (r2 == 0) goto L_0x0088
            r3 = 0
            r4 = 0
        L_0x001c:
            int r5 = r2.length     // Catch:{ Exception -> 0x0086 }
            if (r3 >= r5) goto L_0x0093
            r5 = r2[r3]     // Catch:{ Exception -> 0x0086 }
            r6 = 0
            com.sun.mail.util.MailLogger r7 = r10.logger     // Catch:{ Exception -> 0x0086 }
            java.util.logging.Level r8 = java.util.logging.Level.CONFIG     // Catch:{ Exception -> 0x0086 }
            java.lang.String r9 = "URL {0}"
            r7.log((java.util.logging.Level) r8, (java.lang.String) r9, (java.lang.Object) r5)     // Catch:{ Exception -> 0x0086 }
            r7 = 1
            java.io.InputStream r6 = openStream(r5)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x0063, SecurityException -> 0x0056, all -> 0x0054 }
            if (r6 == 0) goto L_0x0047
            r13.load(r6)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x0063, SecurityException -> 0x0056, all -> 0x0054 }
            com.sun.mail.util.MailLogger r4 = r10.logger     // Catch:{ FileNotFoundException -> 0x0045, IOException -> 0x0043, SecurityException -> 0x0041, all -> 0x003e }
            java.lang.String r9 = "successfully loaded resource: {0}"
            r4.log((java.util.logging.Level) r8, (java.lang.String) r9, (java.lang.Object) r5)     // Catch:{ FileNotFoundException -> 0x0045, IOException -> 0x0043, SecurityException -> 0x0041, all -> 0x003e }
            r4 = 1
            goto L_0x004e
        L_0x003e:
            r2 = move-exception
            r4 = 1
            goto L_0x007a
        L_0x0041:
            r4 = move-exception
            goto L_0x0059
        L_0x0043:
            r4 = move-exception
            goto L_0x0066
        L_0x0045:
            r4 = 1
            goto L_0x0080
        L_0x0047:
            com.sun.mail.util.MailLogger r7 = r10.logger     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x0063, SecurityException -> 0x0056, all -> 0x0054 }
            java.lang.String r9 = "not loading resource: {0}"
            r7.log((java.util.logging.Level) r8, (java.lang.String) r9, (java.lang.Object) r5)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x0063, SecurityException -> 0x0056, all -> 0x0054 }
        L_0x004e:
            if (r6 == 0) goto L_0x0083
        L_0x0050:
            r6.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x0083
        L_0x0054:
            r2 = move-exception
            goto L_0x007a
        L_0x0056:
            r5 = move-exception
            r7 = r4
            r4 = r5
        L_0x0059:
            com.sun.mail.util.MailLogger r5 = r10.logger     // Catch:{ all -> 0x0078 }
            java.util.logging.Level r8 = java.util.logging.Level.CONFIG     // Catch:{ all -> 0x0078 }
            r5.log((java.util.logging.Level) r8, (java.lang.String) r0, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0078 }
            if (r6 == 0) goto L_0x0076
            goto L_0x006f
        L_0x0063:
            r5 = move-exception
            r7 = r4
            r4 = r5
        L_0x0066:
            com.sun.mail.util.MailLogger r5 = r10.logger     // Catch:{ all -> 0x0078 }
            java.util.logging.Level r8 = java.util.logging.Level.CONFIG     // Catch:{ all -> 0x0078 }
            r5.log((java.util.logging.Level) r8, (java.lang.String) r0, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0078 }
            if (r6 == 0) goto L_0x0076
        L_0x006f:
            r6.close()     // Catch:{ IOException -> 0x0076, Exception -> 0x0073 }
            goto L_0x0076
        L_0x0073:
            r2 = move-exception
            r4 = r7
            goto L_0x008c
        L_0x0076:
            r4 = r7
            goto L_0x0083
        L_0x0078:
            r2 = move-exception
            r4 = r7
        L_0x007a:
            if (r6 == 0) goto L_0x007f
            r6.close()     // Catch:{ IOException -> 0x007f }
        L_0x007f:
            throw r2     // Catch:{ Exception -> 0x0086 }
        L_0x0080:
            if (r6 == 0) goto L_0x0083
            goto L_0x0050
        L_0x0083:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0086:
            r2 = move-exception
            goto L_0x008c
        L_0x0088:
            r4 = 0
            goto L_0x0093
        L_0x008a:
            r2 = move-exception
            r4 = 0
        L_0x008c:
            com.sun.mail.util.MailLogger r3 = r10.logger
            java.util.logging.Level r5 = java.util.logging.Level.CONFIG
            r3.log((java.util.logging.Level) r5, (java.lang.String) r0, (java.lang.Throwable) r2)
        L_0x0093:
            if (r4 != 0) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "/"
            r0.append(r2)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.loadResource(r11, r12, r13, r1)
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.Session.loadAllResources(java.lang.String, java.lang.Class, javax.mail.StreamLoader):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035 A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0073 A[SYNTHETIC, Splitter:B:31:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0050=Splitter:B:25:0x0050, B:17:0x002b=Splitter:B:17:0x002b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void loadFile(java.lang.String r6, javax.mail.StreamLoader r7) {
        /*
            r5 = this;
            java.lang.String r0 = "not loading file: "
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0077, IOException -> 0x004f, SecurityException -> 0x002a }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0077, IOException -> 0x004f, SecurityException -> 0x002a }
            r3.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0077, IOException -> 0x004f, SecurityException -> 0x002a }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0077, IOException -> 0x004f, SecurityException -> 0x002a }
            r7.load(r2)     // Catch:{ FileNotFoundException -> 0x0026, IOException -> 0x0023, SecurityException -> 0x0020, all -> 0x001d }
            com.sun.mail.util.MailLogger r7 = r5.logger     // Catch:{ FileNotFoundException -> 0x0026, IOException -> 0x0023, SecurityException -> 0x0020, all -> 0x001d }
            java.util.logging.Level r1 = java.util.logging.Level.CONFIG     // Catch:{ FileNotFoundException -> 0x0026, IOException -> 0x0023, SecurityException -> 0x0020, all -> 0x001d }
            java.lang.String r3 = "successfully loaded file: {0}"
            r7.log((java.util.logging.Level) r1, (java.lang.String) r3, (java.lang.Object) r6)     // Catch:{ FileNotFoundException -> 0x0026, IOException -> 0x0023, SecurityException -> 0x0020, all -> 0x001d }
            r2.close()     // Catch:{ IOException -> 0x007a }
            goto L_0x007a
        L_0x001d:
            r6 = move-exception
            r1 = r2
            goto L_0x0071
        L_0x0020:
            r7 = move-exception
            r1 = r2
            goto L_0x002b
        L_0x0023:
            r7 = move-exception
            r1 = r2
            goto L_0x0050
        L_0x0026:
            r1 = r2
            goto L_0x0077
        L_0x0028:
            r6 = move-exception
            goto L_0x0071
        L_0x002a:
            r7 = move-exception
        L_0x002b:
            com.sun.mail.util.MailLogger r2 = r5.logger     // Catch:{ all -> 0x0028 }
            java.util.logging.Level r3 = java.util.logging.Level.CONFIG     // Catch:{ all -> 0x0028 }
            boolean r2 = r2.isLoggable(r3)     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0049
            com.sun.mail.util.MailLogger r2 = r5.logger     // Catch:{ all -> 0x0028 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r4.<init>()     // Catch:{ all -> 0x0028 }
            r4.append(r0)     // Catch:{ all -> 0x0028 }
            r4.append(r6)     // Catch:{ all -> 0x0028 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0028 }
            r2.log((java.util.logging.Level) r3, (java.lang.String) r6, (java.lang.Throwable) r7)     // Catch:{ all -> 0x0028 }
        L_0x0049:
            if (r1 == 0) goto L_0x007a
        L_0x004b:
            r1.close()     // Catch:{ IOException -> 0x007a }
            goto L_0x007a
        L_0x004f:
            r7 = move-exception
        L_0x0050:
            com.sun.mail.util.MailLogger r2 = r5.logger     // Catch:{ all -> 0x0028 }
            java.util.logging.Level r3 = java.util.logging.Level.CONFIG     // Catch:{ all -> 0x0028 }
            boolean r2 = r2.isLoggable(r3)     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x006e
            com.sun.mail.util.MailLogger r2 = r5.logger     // Catch:{ all -> 0x0028 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r4.<init>()     // Catch:{ all -> 0x0028 }
            r4.append(r0)     // Catch:{ all -> 0x0028 }
            r4.append(r6)     // Catch:{ all -> 0x0028 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0028 }
            r2.log((java.util.logging.Level) r3, (java.lang.String) r6, (java.lang.Throwable) r7)     // Catch:{ all -> 0x0028 }
        L_0x006e:
            if (r1 == 0) goto L_0x007a
            goto L_0x004b
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()     // Catch:{ IOException -> 0x0076 }
        L_0x0076:
            throw r6
        L_0x0077:
            if (r1 == 0) goto L_0x007a
            goto L_0x004b
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.Session.loadFile(java.lang.String, javax.mail.StreamLoader):void");
    }

    private void loadProviders(Class<?> cls) {
        Class<Provider> cls2 = Provider.class;
        C133512 r1 = new StreamLoader() {
            public void load(InputStream inputStream) throws IOException {
                Session.this.loadProvidersFromStream(inputStream);
            }
        };
        try {
            String str = confDir;
            if (str != null) {
                loadFile(str + "javamail.providers", r1);
            }
        } catch (SecurityException unused) {
        }
        Iterator<S> it = ServiceLoader.load(cls2).iterator();
        while (it.hasNext()) {
            Provider provider = (Provider) it.next();
            if (!provider.getClass().isAnnotationPresent(DefaultProvider.class)) {
                addProvider(provider);
            }
        }
        loadAllResources("META-INF/javamail.providers", cls, r1);
        loadResource("/META-INF/javamail.default.providers", cls, r1, false);
        Iterator<S> it2 = ServiceLoader.load(cls2).iterator();
        while (it2.hasNext()) {
            Provider provider2 = (Provider) it2.next();
            if (provider2.getClass().isAnnotationPresent(DefaultProvider.class)) {
                addProvider(provider2);
            }
        }
        if (this.providers.size() == 0) {
            this.logger.config("failed to load any providers, using defaults");
            Provider.Type type = Provider.Type.STORE;
            addProvider(new Provider(type, "imap", "com.sun.mail.imap.IMAPStore", "Oracle", Version.version));
            Provider.Type type2 = type;
            addProvider(new Provider(type2, "imaps", "com.sun.mail.imap.IMAPSSLStore", "Oracle", Version.version));
            addProvider(new Provider(type2, "pop3", "com.sun.mail.pop3.POP3Store", "Oracle", Version.version));
            addProvider(new Provider(type2, "pop3s", "com.sun.mail.pop3.POP3SSLStore", "Oracle", Version.version));
            Provider.Type type3 = Provider.Type.TRANSPORT;
            addProvider(new Provider(type3, "smtp", "com.sun.mail.smtp.SMTPTransport", "Oracle", Version.version));
            addProvider(new Provider(type3, "smtps", "com.sun.mail.smtp.SMTPSSLTransport", "Oracle", Version.version));
        }
        if (this.logger.isLoggable(Level.CONFIG)) {
            this.logger.config("Tables of loaded providers");
            MailLogger mailLogger = this.logger;
            mailLogger.config("Providers Listed By Class Name: " + this.providersByClassName.toString());
            MailLogger mailLogger2 = this.logger;
            mailLogger2.config("Providers Listed By Protocol: " + this.providersByProtocol.toString());
        }
    }

    /* access modifiers changed from: private */
    public void loadProvidersFromStream(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            LineInputStream lineInputStream = new LineInputStream(inputStream);
            while (true) {
                String readLine = lineInputStream.readLine();
                if (readLine == null) {
                    return;
                }
                if (!readLine.startsWith("#") && readLine.trim().length() != 0) {
                    StringTokenizer stringTokenizer = new StringTokenizer(readLine, ";");
                    Provider.Type type = null;
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    while (stringTokenizer.hasMoreTokens()) {
                        String trim = stringTokenizer.nextToken().trim();
                        int indexOf = trim.indexOf("=");
                        if (trim.startsWith("protocol=")) {
                            str = trim.substring(indexOf + 1);
                        } else if (trim.startsWith("type=")) {
                            String substring = trim.substring(indexOf + 1);
                            if (substring.equalsIgnoreCase("store")) {
                                type = Provider.Type.STORE;
                            } else if (substring.equalsIgnoreCase(NotificationCompat.CATEGORY_TRANSPORT)) {
                                type = Provider.Type.TRANSPORT;
                            }
                        } else if (trim.startsWith("class=")) {
                            str2 = trim.substring(indexOf + 1);
                        } else if (trim.startsWith("vendor=")) {
                            str3 = trim.substring(indexOf + 1);
                        } else if (trim.startsWith("version=")) {
                            str4 = trim.substring(indexOf + 1);
                        }
                    }
                    if (type == null || str == null || str2 == null || str.length() <= 0 || str2.length() <= 0) {
                        this.logger.log(Level.CONFIG, "Bad provider entry: {0}", (Object) readLine);
                    } else {
                        addProvider(new Provider(type, str, str2, str3, str4));
                    }
                }
            }
        }
    }

    private void loadResource(String str, Class<?> cls, StreamLoader streamLoader, boolean z) {
        InputStream inputStream = null;
        try {
            inputStream = getResourceAsStream(cls, str);
            if (inputStream != null) {
                streamLoader.load(inputStream);
                this.logger.log(Level.CONFIG, "successfully loaded resource: {0}", (Object) str);
            } else if (z) {
                this.logger.log(Level.WARNING, "expected resource not found: {0}", (Object) str);
            }
            if (inputStream == null) {
                return;
            }
        } catch (IOException e) {
            this.logger.log(Level.CONFIG, "Exception loading resource", (Throwable) e);
            if (inputStream == null) {
                return;
            }
        } catch (SecurityException e2) {
            this.logger.log(Level.CONFIG, "Exception loading resource", (Throwable) e2);
            if (inputStream == null) {
                return;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            throw th;
        }
        try {
            inputStream.close();
        } catch (IOException unused2) {
        }
    }

    private static InputStream openStream(final URL url) throws IOException {
        try {
            return (InputStream) AccessController.doPrivileged(new PrivilegedExceptionAction<InputStream>() {
                public InputStream run() throws IOException {
                    return url.openStream();
                }
            });
        } catch (PrivilegedActionException e) {
            throw ((IOException) e.getException());
        }
    }

    public synchronized void addProvider(Provider provider) {
        this.providers.add(provider);
        this.providersByClassName.put(provider.getClassName(), provider);
        if (!this.providersByProtocol.containsKey(provider.getProtocol())) {
            this.providersByProtocol.put(provider.getProtocol(), provider);
        }
    }

    public synchronized boolean getDebug() {
        return this.debug;
    }

    public synchronized PrintStream getDebugOut() {
        PrintStream printStream = this.out;
        if (printStream != null) {
            return printStream;
        }
        return System.out;
    }

    /* access modifiers changed from: package-private */
    public EventQueue getEventQueue() {
        return this.f61340q;
    }

    public Folder getFolder(URLName uRLName) throws MessagingException {
        Store store = getStore(uRLName);
        store.connect();
        return store.getFolder(uRLName);
    }

    public PasswordAuthentication getPasswordAuthentication(URLName uRLName) {
        return this.authTable.get(uRLName);
    }

    public Properties getProperties() {
        return this.props;
    }

    public String getProperty(String str) {
        return this.props.getProperty(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008b, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized javax.mail.Provider getProvider(java.lang.String r5) throws javax.mail.NoSuchProviderException {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L_0x00a3
            int r0 = r5.length()     // Catch:{ all -> 0x00ab }
            if (r0 <= 0) goto L_0x00a3
            r0 = 0
            java.util.Properties r1 = r4.props     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r2.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = "mail."
            r2.append(r3)     // Catch:{ all -> 0x00ab }
            r2.append(r5)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = ".class"
            r2.append(r3)     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = r1.getProperty(r2)     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x0058
            com.sun.mail.util.MailLogger r0 = r4.logger     // Catch:{ all -> 0x00ab }
            java.util.logging.Level r2 = java.util.logging.Level.FINE     // Catch:{ all -> 0x00ab }
            boolean r0 = r0.isLoggable(r2)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0050
            com.sun.mail.util.MailLogger r0 = r4.logger     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r2.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = "mail."
            r2.append(r3)     // Catch:{ all -> 0x00ab }
            r2.append(r5)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = ".class property exists and points to "
            r2.append(r3)     // Catch:{ all -> 0x00ab }
            r2.append(r1)     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00ab }
            r0.fine(r2)     // Catch:{ all -> 0x00ab }
        L_0x0050:
            java.util.Map<java.lang.String, javax.mail.Provider> r0 = r4.providersByClassName     // Catch:{ all -> 0x00ab }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00ab }
            javax.mail.Provider r0 = (javax.mail.Provider) r0     // Catch:{ all -> 0x00ab }
        L_0x0058:
            if (r0 == 0) goto L_0x005c
            monitor-exit(r4)
            return r0
        L_0x005c:
            java.util.Map<java.lang.String, javax.mail.Provider> r0 = r4.providersByProtocol     // Catch:{ all -> 0x00ab }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x00ab }
            javax.mail.Provider r0 = (javax.mail.Provider) r0     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x008c
            com.sun.mail.util.MailLogger r5 = r4.logger     // Catch:{ all -> 0x00ab }
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch:{ all -> 0x00ab }
            boolean r5 = r5.isLoggable(r1)     // Catch:{ all -> 0x00ab }
            if (r5 == 0) goto L_0x008a
            com.sun.mail.util.MailLogger r5 = r4.logger     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r1.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "getProvider() returning "
            r1.append(r2)     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x00ab }
            r1.append(r2)     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ab }
            r5.fine(r1)     // Catch:{ all -> 0x00ab }
        L_0x008a:
            monitor-exit(r4)
            return r0
        L_0x008c:
            javax.mail.NoSuchProviderException r0 = new javax.mail.NoSuchProviderException     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r1.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "No provider for "
            r1.append(r2)     // Catch:{ all -> 0x00ab }
            r1.append(r5)     // Catch:{ all -> 0x00ab }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x00ab }
            r0.<init>(r5)     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00a3:
            javax.mail.NoSuchProviderException r5 = new javax.mail.NoSuchProviderException     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "Invalid protocol: null"
            r5.<init>(r0)     // Catch:{ all -> 0x00ab }
            throw r5     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.Session.getProvider(java.lang.String):javax.mail.Provider");
    }

    public synchronized Provider[] getProviders() {
        Provider[] providerArr;
        providerArr = new Provider[this.providers.size()];
        this.providers.toArray(providerArr);
        return providerArr;
    }

    public Store getStore() throws NoSuchProviderException {
        return getStore(getProperty("mail.store.protocol"));
    }

    public Transport getTransport() throws NoSuchProviderException {
        String property = getProperty("mail.transport.protocol");
        if (property != null) {
            return getTransport(property);
        }
        String str = (String) this.addressMap.get("rfc822");
        if (str != null) {
            return getTransport(str);
        }
        return getTransport("smtp");
    }

    public PasswordAuthentication requestPasswordAuthentication(InetAddress inetAddress, int i, String str, String str2, String str3) {
        Authenticator authenticator2 = this.authenticator;
        if (authenticator2 != null) {
            return authenticator2.requestPasswordAuthentication(inetAddress, i, str, str2, str3);
        }
        return null;
    }

    public synchronized void setDebug(boolean z) {
        this.debug = z;
        initLogger();
        this.logger.log(Level.CONFIG, "setDebug: Jakarta Mail version {0}", (Object) Version.version);
    }

    public synchronized void setDebugOut(PrintStream printStream) {
        this.out = printStream;
        initLogger();
    }

    public void setPasswordAuthentication(URLName uRLName, PasswordAuthentication passwordAuthentication) {
        if (passwordAuthentication == null) {
            this.authTable.remove(uRLName);
        } else {
            this.authTable.put(uRLName, passwordAuthentication);
        }
    }

    public synchronized void setProtocolForAddress(String str, String str2) {
        if (str2 == null) {
            this.addressMap.remove(str);
        } else {
            this.addressMap.put(str, str2);
        }
    }

    public synchronized void setProvider(Provider provider) throws NoSuchProviderException {
        if (provider != null) {
            this.providersByProtocol.put(provider.getProtocol(), provider);
            this.providersByClassName.put(provider.getClassName(), provider);
            Properties properties = this.props;
            properties.put("mail." + provider.getProtocol() + ".class", provider.getClassName());
        } else {
            throw new NoSuchProviderException("Can't set null provider");
        }
    }

    public static Session getInstance(Properties properties) {
        return new Session(properties, (Authenticator) null);
    }

    public Store getStore(String str) throws NoSuchProviderException {
        return getStore(new URLName(str, (String) null, -1, (String) null, (String) null, (String) null));
    }

    public Store getStore(URLName uRLName) throws NoSuchProviderException {
        return getStore(getProvider(uRLName.getProtocol()), uRLName);
    }

    public Store getStore(Provider provider) throws NoSuchProviderException {
        return getStore(provider, (URLName) null);
    }

    public Transport getTransport(String str) throws NoSuchProviderException {
        return getTransport(new URLName(str, (String) null, -1, (String) null, (String) null, (String) null));
    }

    private Store getStore(Provider provider, URLName uRLName) throws NoSuchProviderException {
        if (provider != null && provider.getType() == Provider.Type.STORE) {
            return (Store) getService(provider, uRLName, Store.class);
        }
        throw new NoSuchProviderException("invalid provider");
    }

    public Transport getTransport(URLName uRLName) throws NoSuchProviderException {
        return getTransport(getProvider(uRLName.getProtocol()), uRLName);
    }

    public static Session getDefaultInstance(Properties properties) {
        return getDefaultInstance(properties, (Authenticator) null);
    }

    public Transport getTransport(Provider provider) throws NoSuchProviderException {
        return getTransport(provider, (URLName) null);
    }

    public Transport getTransport(Address address) throws NoSuchProviderException {
        String property = getProperty("mail.transport.protocol." + address.getType());
        if (property != null) {
            return getTransport(property);
        }
        String str = (String) this.addressMap.get(address.getType());
        if (str != null) {
            return getTransport(str);
        }
        throw new NoSuchProviderException("No provider for Address type: " + address.getType());
    }

    private Transport getTransport(Provider provider, URLName uRLName) throws NoSuchProviderException {
        if (provider != null && provider.getType() == Provider.Type.TRANSPORT) {
            return (Transport) getService(provider, uRLName, Transport.class);
        }
        throw new NoSuchProviderException("invalid provider");
    }
}
