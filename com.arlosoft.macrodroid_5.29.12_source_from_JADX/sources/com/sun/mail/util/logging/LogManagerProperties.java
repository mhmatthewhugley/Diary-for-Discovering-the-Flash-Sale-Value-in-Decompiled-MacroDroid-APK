package com.sun.mail.util.logging;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectStreamException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.UndeclaredThrowableException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Properties;
import java.util.logging.ErrorManager;
import java.util.logging.Filter;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.LoggingPermission;
import org.apache.commons.p353io.FilenameUtils;

final class LogManagerProperties extends Properties {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object LOG_MANAGER = loadLogManager();
    private static final Method LR_GET_INSTANT;
    private static final Method LR_GET_LONG_TID;
    private static volatile String[] REFLECT_NAMES = null;
    private static final Method ZDT_OF_INSTANT;
    private static final Method ZI_SYSTEM_DEFAULT;
    private static final long serialVersionUID = -2239983349056806252L;
    private final String prefix;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r3 != null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x009d, code lost:
        if (r0 != null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a7, code lost:
        if (r0 != null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b1, code lost:
        if (r0 != null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00b4, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00af  */
    static {
        /*
            java.lang.String r0 = "java.time.ZoneId"
            java.lang.Class<com.sun.mail.util.logging.LogManagerProperties> r1 = com.sun.mail.util.logging.LogManagerProperties.class
            r1 = 0
            r2 = 0
            java.lang.Class<java.util.logging.LogRecord> r3 = java.util.logging.LogRecord.class
            java.lang.String r4 = "getLongThreadID"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception | LinkageError | RuntimeException -> 0x0011 }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ Exception | LinkageError | RuntimeException -> 0x0011 }
            goto L_0x0012
        L_0x0011:
            r3 = r2
        L_0x0012:
            LR_GET_LONG_TID = r3
            java.lang.Class<java.util.logging.LogRecord> r3 = java.util.logging.LogRecord.class
            java.lang.String r4 = "getInstant"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ RuntimeException -> 0x00aa, Exception -> 0x00a0, LinkageError -> 0x0096, all -> 0x0092 }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ RuntimeException -> 0x00aa, Exception -> 0x00a0, LinkageError -> 0x0096, all -> 0x0092 }
            java.lang.Class r4 = findClass(r0)     // Catch:{ LinkageError -> 0x0089 }
            java.lang.String r5 = "systemDefault"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ LinkageError -> 0x0089 }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ LinkageError -> 0x0089 }
            int r5 = r4.getModifiers()     // Catch:{ LinkageError -> 0x007e }
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)     // Catch:{ LinkageError -> 0x007e }
            if (r5 == 0) goto L_0x0078
            java.lang.String r5 = "java.time.ZonedDateTime"
            java.lang.Class r5 = findClass(r5)     // Catch:{ LinkageError -> 0x007e }
            java.lang.String r6 = "ofInstant"
            r7 = 2
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ LinkageError -> 0x007e }
            java.lang.String r8 = "java.time.Instant"
            java.lang.Class r8 = findClass(r8)     // Catch:{ LinkageError -> 0x007e }
            r7[r1] = r8     // Catch:{ LinkageError -> 0x007e }
            r1 = 1
            java.lang.Class r0 = findClass(r0)     // Catch:{ LinkageError -> 0x007e }
            r7[r1] = r0     // Catch:{ LinkageError -> 0x007e }
            java.lang.reflect.Method r0 = r5.getMethod(r6, r7)     // Catch:{ LinkageError -> 0x007e }
            int r1 = r0.getModifiers()     // Catch:{ RuntimeException -> 0x0075, Exception -> 0x0073, LinkageError -> 0x0071, all -> 0x006f }
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch:{ RuntimeException -> 0x0075, Exception -> 0x0073, LinkageError -> 0x0071, all -> 0x006f }
            if (r1 == 0) goto L_0x006c
            java.lang.Class<java.lang.Comparable> r1 = java.lang.Comparable.class
            java.lang.Class r5 = r0.getReturnType()     // Catch:{ RuntimeException -> 0x0075, Exception -> 0x0073, LinkageError -> 0x0071, all -> 0x006f }
            boolean r1 = r1.isAssignableFrom(r5)     // Catch:{ RuntimeException -> 0x0075, Exception -> 0x0073, LinkageError -> 0x0071, all -> 0x006f }
            if (r1 == 0) goto L_0x006c
            if (r3 == 0) goto L_0x00b6
            goto L_0x00b4
        L_0x006c:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ LinkageError -> 0x007e }
            throw r2     // Catch:{ RuntimeException -> 0x0082, Exception -> 0x0080, all -> 0x007b }
        L_0x006f:
            r1 = move-exception
            goto L_0x0087
        L_0x0071:
            goto L_0x0099
        L_0x0073:
            goto L_0x00a3
        L_0x0075:
            goto L_0x00ad
        L_0x0078:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ LinkageError -> 0x0089 }
            throw r2     // Catch:{ RuntimeException -> 0x008f, Exception -> 0x008c, all -> 0x0084 }
        L_0x007b:
            r1 = move-exception
            r0 = r2
            goto L_0x0087
        L_0x007e:
            r0 = r2
            goto L_0x0099
        L_0x0080:
            r0 = r2
            goto L_0x00a3
        L_0x0082:
            r0 = r2
            goto L_0x00ad
        L_0x0084:
            r1 = move-exception
            r0 = r2
            r4 = r0
        L_0x0087:
            r2 = r3
            goto L_0x0095
        L_0x0089:
            r0 = r2
            r4 = r0
            goto L_0x0099
        L_0x008c:
            r0 = r2
            r4 = r0
            goto L_0x00a3
        L_0x008f:
            r0 = r2
            r4 = r0
            goto L_0x00ad
        L_0x0092:
            r1 = move-exception
            r0 = r2
            r4 = r0
        L_0x0095:
            throw r1
        L_0x0096:
            r0 = r2
            r3 = r0
            r4 = r3
        L_0x0099:
            if (r3 == 0) goto L_0x00b6
            if (r4 == 0) goto L_0x00b6
            if (r0 != 0) goto L_0x00b4
            goto L_0x00b6
        L_0x00a0:
            r0 = r2
            r3 = r0
            r4 = r3
        L_0x00a3:
            if (r3 == 0) goto L_0x00b6
            if (r4 == 0) goto L_0x00b6
            if (r0 != 0) goto L_0x00b4
            goto L_0x00b6
        L_0x00aa:
            r0 = r2
            r3 = r0
            r4 = r3
        L_0x00ad:
            if (r3 == 0) goto L_0x00b6
            if (r4 == 0) goto L_0x00b6
            if (r0 != 0) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            r2 = r3
            goto L_0x00b8
        L_0x00b6:
            r0 = r2
            r4 = r0
        L_0x00b8:
            LR_GET_INSTANT = r2
            ZI_SYSTEM_DEFAULT = r4
            ZDT_OF_INSTANT = r0
            java.lang.Object r0 = loadLogManager()
            LOG_MANAGER = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.LogManagerProperties.<clinit>():void");
    }

    LogManagerProperties(Properties properties, String str) {
        super(properties);
        if (properties == null || str == null) {
            throw null;
        }
        this.prefix = str;
    }

    static void checkLogManagerAccess() {
        Object obj = LOG_MANAGER;
        boolean z = false;
        if (obj != null) {
            try {
                if (obj instanceof LogManager) {
                    z = true;
                    ((LogManager) obj).checkAccess();
                }
            } catch (SecurityException e) {
                if (0 != 0) {
                    throw e;
                }
            } catch (LinkageError | RuntimeException unused) {
            }
        }
        if (!z) {
            checkLoggingAccess();
        }
    }

    private static void checkLoggingAccess() {
        SecurityManager securityManager;
        Logger logger = Logger.getLogger("global");
        boolean z = false;
        try {
            if (Logger.class == logger.getClass()) {
                logger.removeHandler((Handler) null);
                z = true;
            }
        } catch (NullPointerException unused) {
        }
        if (!z && (securityManager = System.getSecurityManager()) != null) {
            securityManager.checkPermission(new LoggingPermission("control", (String) null));
        }
    }

    private Properties exportCopy(Properties properties) {
        Thread.holdsLock(this);
        Properties properties2 = new Properties(properties);
        properties2.putAll(this);
        return properties2;
    }

    private static Class<?> findClass(String str) throws ClassNotFoundException {
        ClassLoader[] classLoaders = getClassLoaders();
        if (classLoaders[0] == null) {
            return tryLoad(str, classLoaders[1]);
        }
        try {
            return Class.forName(str, false, classLoaders[0]);
        } catch (ClassNotFoundException unused) {
            return tryLoad(str, classLoaders[1]);
        }
    }

    static String fromLogManager(String str) {
        Objects.requireNonNull(str);
        Object obj = LOG_MANAGER;
        try {
            if (obj instanceof Properties) {
                return ((Properties) obj).getProperty(str);
            }
        } catch (RuntimeException unused) {
        }
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof LogManager) {
                return ((LogManager) obj).getProperty(str);
            }
            return null;
        } catch (LinkageError | RuntimeException unused2) {
            return null;
        }
    }

    private static ClassLoader[] getClassLoaders() {
        return (ClassLoader[]) AccessController.doPrivileged(new PrivilegedAction<ClassLoader[]>() {
            public ClassLoader[] run() {
                ClassLoader[] classLoaderArr = new ClassLoader[2];
                try {
                    classLoaderArr[0] = ClassLoader.getSystemClassLoader();
                } catch (SecurityException unused) {
                    classLoaderArr[0] = null;
                }
                try {
                    classLoaderArr[1] = Thread.currentThread().getContextClassLoader();
                } catch (SecurityException unused2) {
                    classLoaderArr[1] = null;
                }
                return classLoaderArr;
            }
        });
    }

    static String getLocalHost(Object obj) throws Exception {
        try {
            Method method = obj.getClass().getMethod("getLocalHost", new Class[0]);
            if (!Modifier.isStatic(method.getModifiers()) && method.getReturnType() == String.class) {
                return (String) method.invoke(obj, new Object[0]);
            }
            throw new NoSuchMethodException(method.toString());
        } catch (ExceptionInInitializerError e) {
            throw wrapOrThrow(e);
        } catch (InvocationTargetException e2) {
            throw paramOrError(e2);
        }
    }

    static Long getLongThreadID(LogRecord logRecord) {
        Objects.requireNonNull(logRecord);
        Method method = LR_GET_LONG_TID;
        if (method == null) {
            return null;
        }
        try {
            return (Long) method.invoke(logRecord, new Object[0]);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw ((Error) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new UndeclaredThrowableException(e);
            }
        } catch (Exception | RuntimeException unused) {
            return null;
        }
    }

    static Comparable<?> getZonedDateTime(LogRecord logRecord) {
        Objects.requireNonNull(logRecord);
        Method method = ZDT_OF_INSTANT;
        if (method != null) {
            try {
                return (Comparable) method.invoke((Object) null, new Object[]{LR_GET_INSTANT.invoke(logRecord, new Object[0]), ZI_SYSTEM_DEFAULT.invoke((Object) null, new Object[0])});
            } catch (Exception | RuntimeException unused) {
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Error) {
                    throw ((Error) cause);
                } else if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else {
                    throw new UndeclaredThrowableException(e);
                }
            }
        }
        return null;
    }

    static boolean hasLogManager() {
        Object obj = LOG_MANAGER;
        return obj != null && !(obj instanceof Properties);
    }

    static boolean isReflectionClass(String str) throws Exception {
        String[] strArr = REFLECT_NAMES;
        if (strArr == null) {
            strArr = reflectionClassNames();
            REFLECT_NAMES = strArr;
        }
        for (String equals : strArr) {
            if (str.equals(equals)) {
                return true;
            }
        }
        findClass(str);
        return false;
    }

    static boolean isStaticUtilityClass(String str) throws Exception {
        Class<?> findClass = findClass(str);
        Class<Object> cls = Object.class;
        if (findClass == cls) {
            return false;
        }
        Method[] methods = findClass.getMethods();
        if (methods.length == 0) {
            return false;
        }
        for (Method method : methods) {
            if (method.getDeclaringClass() != cls && !Modifier.isStatic(method.getModifiers())) {
                return false;
            }
        }
        return true;
    }

    private static Object loadLogManager() {
        try {
            return LogManager.getLogManager();
        } catch (LinkageError unused) {
            return readConfiguration();
        } catch (RuntimeException unused2) {
            return readConfiguration();
        }
    }

    static Comparator<? super LogRecord> newComparator(String str) throws Exception {
        return (Comparator) newObjectFrom(str, Comparator.class);
    }

    static ErrorManager newErrorManager(String str) throws Exception {
        return (ErrorManager) newObjectFrom(str, ErrorManager.class);
    }

    static Filter newFilter(String str) throws Exception {
        return (Filter) newObjectFrom(str, Filter.class);
    }

    static Formatter newFormatter(String str) throws Exception {
        return (Formatter) newObjectFrom(str, Formatter.class);
    }

    static <T> T newObjectFrom(String str, Class<T> cls) throws Exception {
        try {
            Class<?> findClass = findClass(str);
            if (cls.isAssignableFrom(findClass)) {
                return cls.cast(findClass.getConstructor(new Class[0]).newInstance(new Object[0]));
            }
            throw new ClassCastException(findClass.getName() + " cannot be cast to " + cls.getName());
        } catch (InvocationTargetException e) {
            throw paramOrError(e);
        } catch (NoClassDefFoundError e2) {
            throw new ClassNotFoundException(e2.toString(), e2);
        } catch (ExceptionInInitializerError e3) {
            throw wrapOrThrow(e3);
        }
    }

    private static Exception paramOrError(InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause == null || (!(cause instanceof VirtualMachineError) && !(cause instanceof ThreadDeath))) {
            return invocationTargetException;
        }
        throw ((Error) cause);
    }

    static long parseDurationToMillis(CharSequence charSequence) throws Exception {
        Objects.requireNonNull(charSequence);
        try {
            Class<?> findClass = findClass("java.time.Duration");
            Method method = findClass.getMethod("parse", new Class[]{CharSequence.class});
            if (!findClass.isAssignableFrom(method.getReturnType()) || !Modifier.isStatic(method.getModifiers())) {
                throw new NoSuchMethodException(method.toString());
            }
            Method method2 = findClass.getMethod("toMillis", new Class[0]);
            if (!Long.TYPE.isAssignableFrom(method2.getReturnType()) || Modifier.isStatic(method2.getModifiers())) {
                throw new NoSuchMethodException(method2.toString());
            }
            return ((Long) method2.invoke(method.invoke((Object) null, new Object[]{charSequence}), new Object[0])).longValue();
        } catch (ExceptionInInitializerError e) {
            throw wrapOrThrow(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof ArithmeticException) {
                throw ((ArithmeticException) cause);
            }
            throw paramOrError(e2);
        }
    }

    private Object preWrite(Object obj) {
        return get(obj);
    }

    private static Properties readConfiguration() {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        try {
            String property = System.getProperty("java.util.logging.config.file");
            if (property != null) {
                fileInputStream = new FileInputStream(new File(property).getCanonicalFile());
                properties.load(fileInputStream);
                fileInputStream.close();
            }
        } catch (Exception | LinkageError | RuntimeException unused) {
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
        return properties;
    }

    private static String[] reflectionClassNames() throws Exception {
        Class<LogManagerProperties> cls = LogManagerProperties.class;
        try {
            HashSet hashSet = new HashSet();
            Throwable newInstance = Throwable.class.getConstructor(new Class[0]).newInstance(new Object[0]);
            for (StackTraceElement stackTraceElement : newInstance.getStackTrace()) {
                if (cls.getName().equals(stackTraceElement.getClassName())) {
                    break;
                }
                hashSet.add(stackTraceElement.getClassName());
            }
            Throwable.class.getMethod("fillInStackTrace", new Class[0]).invoke(newInstance, new Object[0]);
            for (StackTraceElement stackTraceElement2 : newInstance.getStackTrace()) {
                if (cls.getName().equals(stackTraceElement2.getClassName())) {
                    break;
                }
                hashSet.add(stackTraceElement2.getClassName());
            }
            return (String[]) hashSet.toArray(new String[hashSet.size()]);
        } catch (InvocationTargetException e) {
            throw paramOrError(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[ExcHandler: ReflectiveOperationException | RuntimeException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> java.util.Comparator<T> reverseOrder(java.util.Comparator<T> r5) {
        /*
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            java.lang.Class r1 = r5.getClass()     // Catch:{ InvocationTargetException -> 0x0039, ReflectiveOperationException | RuntimeException -> 0x0037 }
            java.lang.String r2 = "reversed"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ InvocationTargetException -> 0x0039, ReflectiveOperationException | RuntimeException -> 0x0037 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ InvocationTargetException -> 0x0039, ReflectiveOperationException | RuntimeException -> 0x0037 }
            int r2 = r1.getModifiers()     // Catch:{ InvocationTargetException -> 0x0039, ReflectiveOperationException | RuntimeException -> 0x0037 }
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch:{ InvocationTargetException -> 0x0039, ReflectiveOperationException | RuntimeException -> 0x0037 }
            if (r2 != 0) goto L_0x003d
            java.lang.Class<java.util.Comparator> r2 = java.util.Comparator.class
            java.lang.Class r4 = r1.getReturnType()     // Catch:{ InvocationTargetException -> 0x0039, ReflectiveOperationException | RuntimeException -> 0x0037 }
            boolean r2 = r2.isAssignableFrom(r4)     // Catch:{ InvocationTargetException -> 0x0039, ReflectiveOperationException | RuntimeException -> 0x0037 }
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ ExceptionInInitializerError -> 0x0031, ReflectiveOperationException | RuntimeException -> 0x0037 }
            java.lang.Object r1 = r1.invoke(r5, r2)     // Catch:{ ExceptionInInitializerError -> 0x0031, ReflectiveOperationException | RuntimeException -> 0x0037 }
            java.util.Comparator r1 = (java.util.Comparator) r1     // Catch:{ ExceptionInInitializerError -> 0x0031, ReflectiveOperationException | RuntimeException -> 0x0037 }
            r0 = r1
            goto L_0x003d
        L_0x0031:
            r1 = move-exception
            java.lang.reflect.InvocationTargetException r1 = wrapOrThrow(r1)     // Catch:{ InvocationTargetException -> 0x0039, ReflectiveOperationException | RuntimeException -> 0x0037 }
            throw r1     // Catch:{ InvocationTargetException -> 0x0039, ReflectiveOperationException | RuntimeException -> 0x0037 }
        L_0x0037:
            goto L_0x003d
        L_0x0039:
            r1 = move-exception
            paramOrError(r1)
        L_0x003d:
            if (r0 != 0) goto L_0x0043
            java.util.Comparator r0 = java.util.Collections.reverseOrder(r5)
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.LogManagerProperties.reverseOrder(java.util.Comparator):java.util.Comparator");
    }

    static String toLanguageTag(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        char[] cArr = new char[(language.length() + country.length() + variant.length() + 2)];
        int length = language.length();
        language.getChars(0, length, cArr, 0);
        if (!(country.length() == 0 && (language.length() == 0 || variant.length() == 0))) {
            cArr[length] = '-';
            int i = length + 1;
            country.getChars(0, country.length(), cArr, i);
            length = i + country.length();
        }
        if (!(variant.length() == 0 || (language.length() == 0 && country.length() == 0))) {
            cArr[length] = '-';
            int i2 = length + 1;
            variant.getChars(0, variant.length(), cArr, i2);
            length = i2 + variant.length();
        }
        return String.valueOf(cArr, 0, length);
    }

    private static Class<?> tryLoad(String str, ClassLoader classLoader) throws ClassNotFoundException {
        if (classLoader != null) {
            return Class.forName(str, false, classLoader);
        }
        return Class.forName(str);
    }

    private static InvocationTargetException wrapOrThrow(ExceptionInInitializerError exceptionInInitializerError) {
        if (!(exceptionInInitializerError.getCause() instanceof Error)) {
            return new InvocationTargetException(exceptionInInitializerError);
        }
        throw exceptionInInitializerError;
    }

    private synchronized Object writeReplace() throws ObjectStreamException {
        return exportCopy((Properties) this.defaults.clone());
    }

    public synchronized Object clone() {
        return exportCopy(this.defaults);
    }

    public synchronized boolean containsKey(Object obj) {
        boolean z;
        boolean z2 = true;
        z = (obj instanceof String) && getProperty((String) obj) != null;
        if (!z) {
            if (!this.defaults.containsKey(obj) && !super.containsKey(obj)) {
                z2 = false;
            }
            z = z2;
        }
        return z;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Properties)) {
            return false;
        }
        return super.equals(obj);
    }

    public synchronized Object get(Object obj) {
        Object property;
        property = obj instanceof String ? getProperty((String) obj) : null;
        if (property == null && (property = this.defaults.get(obj)) == null && !this.defaults.containsKey(obj)) {
            property = super.get(obj);
        }
        return property;
    }

    public synchronized String getProperty(String str) {
        String property;
        property = this.defaults.getProperty(str);
        if (property == null) {
            if (str.length() > 0) {
                property = fromLogManager(this.prefix + FilenameUtils.EXTENSION_SEPARATOR + str);
            }
            if (property == null) {
                property = fromLogManager(str);
            }
            if (property != null) {
                super.put(str, property);
            } else {
                Object obj = super.get(str);
                property = obj instanceof String ? (String) obj : null;
            }
        }
        return property;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Enumeration<?> propertyNames() {
        return super.propertyNames();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object put(java.lang.Object r2, java.lang.Object r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0017
            boolean r0 = r3 instanceof java.lang.String     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r1.preWrite(r2)     // Catch:{ all -> 0x001d }
            java.lang.Object r2 = super.put(r2, r3)     // Catch:{ all -> 0x001d }
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r0 = r2
        L_0x0015:
            monitor-exit(r1)
            return r0
        L_0x0017:
            java.lang.Object r2 = super.put(r2, r3)     // Catch:{ all -> 0x001d }
            monitor-exit(r1)
            return r2
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.LogManagerProperties.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public synchronized Object remove(Object obj) {
        Object preWrite;
        preWrite = preWrite(obj);
        Object remove = super.remove(obj);
        if (remove != null) {
            preWrite = remove;
        }
        return preWrite;
    }

    public Object setProperty(String str, String str2) {
        return put(str, str2);
    }

    public String getProperty(String str, String str2) {
        String property = getProperty(str);
        return property == null ? str2 : property;
    }
}
