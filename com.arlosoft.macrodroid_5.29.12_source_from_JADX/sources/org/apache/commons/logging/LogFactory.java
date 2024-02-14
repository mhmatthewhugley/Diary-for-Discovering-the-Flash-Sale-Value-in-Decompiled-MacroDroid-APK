package org.apache.commons.logging;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

public abstract class LogFactory {
    public static final String DIAGNOSTICS_DEST_PROPERTY = "org.apache.commons.logging.diagnostics.dest";
    public static final String FACTORY_DEFAULT = "org.apache.commons.logging.impl.LogFactoryImpl";
    public static final String FACTORY_PROPERTIES = "commons-logging.properties";
    public static final String FACTORY_PROPERTY = "org.apache.commons.logging.LogFactory";
    public static final String HASHTABLE_IMPLEMENTATION_PROPERTY = "org.apache.commons.logging.LogFactory.HashtableImpl";
    public static final String PRIORITY_KEY = "priority";
    protected static final String SERVICE_ID = "META-INF/services/org.apache.commons.logging.LogFactory";
    public static final String TCCL_KEY = "use_tccl";
    private static final String WEAK_HASHTABLE_CLASSNAME = "org.apache.commons.logging.impl.WeakHashtable";
    static /* synthetic */ Class class$java$lang$Thread;
    static /* synthetic */ Class class$org$apache$commons$logging$LogFactory;
    private static String diagnosticPrefix;
    private static PrintStream diagnosticsStream;
    protected static Hashtable factories = createFactoryStore();
    protected static LogFactory nullClassLoaderFactory;
    private static ClassLoader thisClassLoader;

    static {
        Class cls = class$org$apache$commons$logging$LogFactory;
        if (cls == null) {
            cls = class$(FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = cls;
        }
        thisClassLoader = getClassLoader(cls);
        initDiagnostics();
        Class cls2 = class$org$apache$commons$logging$LogFactory;
        if (cls2 == null) {
            cls2 = class$(FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = cls2;
        }
        logClassLoaderEnvironment(cls2);
        if (isDiagnosticsEnabled()) {
            logDiagnostic("BOOTSTRAP COMPLETED");
        }
    }

    protected LogFactory() {
    }

    private static void cacheFactory(ClassLoader classLoader, LogFactory logFactory) {
        if (logFactory == null) {
            return;
        }
        if (classLoader == null) {
            nullClassLoaderFactory = logFactory;
        } else {
            factories.put(classLoader, logFactory);
        }
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0099 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.lang.Object createFactory(java.lang.String r5, java.lang.ClassLoader r6) {
        /*
            java.lang.String r0 = "org.apache.commons.logging.LogFactory"
            r1 = 0
            if (r6 == 0) goto L_0x0192
            java.lang.Class r1 = r6.loadClass(r5)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            java.lang.Class r2 = class$org$apache$commons$logging$LogFactory     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            if (r2 != 0) goto L_0x0013
            java.lang.Class r2 = class$(r0)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            class$org$apache$commons$logging$LogFactory = r2     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
        L_0x0013:
            boolean r2 = r2.isAssignableFrom(r1)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            if (r2 == 0) goto L_0x0044
            boolean r2 = isDiagnosticsEnabled()     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            if (r2 == 0) goto L_0x0092
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            r2.<init>()     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            java.lang.String r3 = "Loaded class "
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            java.lang.String r3 = r1.getName()     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            java.lang.String r3 = " from classloader "
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            java.lang.String r3 = objectId(r6)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            java.lang.String r2 = r2.toString()     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            logDiagnostic(r2)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            goto L_0x0092
        L_0x0044:
            boolean r2 = isDiagnosticsEnabled()     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            if (r2 == 0) goto L_0x0092
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            r2.<init>()     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            java.lang.String r3 = "Factory class "
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            java.lang.String r3 = r1.getName()     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            java.lang.String r3 = " loaded from classloader "
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            java.lang.ClassLoader r3 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            java.lang.String r3 = objectId(r3)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            java.lang.String r3 = " does not extend '"
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            java.lang.Class r3 = class$org$apache$commons$logging$LogFactory     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            if (r3 != 0) goto L_0x007a
            java.lang.Class r3 = class$(r0)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            class$org$apache$commons$logging$LogFactory = r3     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
        L_0x007a:
            java.lang.String r3 = r3.getName()     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            java.lang.String r3 = "' as loaded by this classloader."
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            java.lang.String r2 = r2.toString()     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            logDiagnostic(r2)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            java.lang.String r2 = "[BAD CL TREE] "
            logHierarchy(r2, r6)     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
        L_0x0092:
            java.lang.Object r2 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            org.apache.commons.logging.LogFactory r2 = (org.apache.commons.logging.LogFactory) r2     // Catch:{ ClassNotFoundException -> 0x0166, NoClassDefFoundError -> 0x012b, ClassCastException -> 0x0099 }
            return r2
        L_0x0099:
            java.lang.ClassLoader r2 = thisClassLoader     // Catch:{ Exception -> 0x01c0 }
            if (r6 != r2) goto L_0x0192
            boolean r6 = implementsLogFactory(r1)     // Catch:{ Exception -> 0x01c0 }
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x01c0 }
            r2.<init>()     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r3 = "The application has specified that a custom LogFactory implementation should be used but Class '"
            r2.append(r3)     // Catch:{ Exception -> 0x01c0 }
            r2.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = "' cannot be converted to '"
            r2.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.Class r5 = class$org$apache$commons$logging$LogFactory     // Catch:{ Exception -> 0x01c0 }
            if (r5 != 0) goto L_0x00bd
            java.lang.Class r5 = class$(r0)     // Catch:{ Exception -> 0x01c0 }
            class$org$apache$commons$logging$LogFactory = r5     // Catch:{ Exception -> 0x01c0 }
        L_0x00bd:
            java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x01c0 }
            r2.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = "'. "
            r2.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x01c0 }
            if (r6 == 0) goto L_0x00fa
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x01c0 }
            r6.<init>()     // Catch:{ Exception -> 0x01c0 }
            r6.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = "The conflict is caused by the presence of multiple LogFactory classes in incompatible classloaders. "
            r6.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = "Background can be found in http://commons.apache.org/logging/tech.html. "
            r6.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = "If you have not explicitly specified a custom LogFactory then it is likely that "
            r6.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = "the container has set one without your knowledge. "
            r6.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = "In this case, consider using the commons-logging-adapters.jar file or "
            r6.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = "specifying the standard LogFactory from the command line. "
            r6.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x01c0 }
            goto L_0x010b
        L_0x00fa:
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x01c0 }
            r6.<init>()     // Catch:{ Exception -> 0x01c0 }
            r6.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = "Please check the custom implementation. "
            r6.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x01c0 }
        L_0x010b:
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x01c0 }
            r6.<init>()     // Catch:{ Exception -> 0x01c0 }
            r6.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = "Help can be found @http://commons.apache.org/logging/troubleshooting.html."
            r6.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x01c0 }
            boolean r6 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x01c0 }
            if (r6 == 0) goto L_0x0125
            logDiagnostic(r5)     // Catch:{ Exception -> 0x01c0 }
        L_0x0125:
            java.lang.ClassCastException r6 = new java.lang.ClassCastException     // Catch:{ Exception -> 0x01c0 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x01c0 }
            throw r6     // Catch:{ Exception -> 0x01c0 }
        L_0x012b:
            r2 = move-exception
            java.lang.ClassLoader r3 = thisClassLoader     // Catch:{ Exception -> 0x01c0 }
            if (r6 != r3) goto L_0x0192
            boolean r3 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x01c0 }
            if (r3 == 0) goto L_0x0165
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x01c0 }
            r3.<init>()     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r4 = "Class '"
            r3.append(r4)     // Catch:{ Exception -> 0x01c0 }
            r3.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = "' cannot be loaded"
            r3.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = " via classloader "
            r3.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = objectId(r6)     // Catch:{ Exception -> 0x01c0 }
            r3.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = " - it depends on some other class that cannot"
            r3.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = " be found."
            r3.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = r3.toString()     // Catch:{ Exception -> 0x01c0 }
            logDiagnostic(r5)     // Catch:{ Exception -> 0x01c0 }
        L_0x0165:
            throw r2     // Catch:{ Exception -> 0x01c0 }
        L_0x0166:
            r2 = move-exception
            java.lang.ClassLoader r3 = thisClassLoader     // Catch:{ Exception -> 0x01c0 }
            if (r6 != r3) goto L_0x0192
            boolean r3 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x01c0 }
            if (r3 == 0) goto L_0x0191
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x01c0 }
            r3.<init>()     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r4 = "Unable to locate any class called '"
            r3.append(r4)     // Catch:{ Exception -> 0x01c0 }
            r3.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = "' via classloader "
            r3.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = objectId(r6)     // Catch:{ Exception -> 0x01c0 }
            r3.append(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = r3.toString()     // Catch:{ Exception -> 0x01c0 }
            logDiagnostic(r5)     // Catch:{ Exception -> 0x01c0 }
        L_0x0191:
            throw r2     // Catch:{ Exception -> 0x01c0 }
        L_0x0192:
            boolean r2 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x01c0 }
            if (r2 == 0) goto L_0x01b5
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x01c0 }
            r2.<init>()     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r3 = "Unable to load factory class via classloader "
            r2.append(r3)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r6 = objectId(r6)     // Catch:{ Exception -> 0x01c0 }
            r2.append(r6)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r6 = " - trying the classloader associated with this LogFactory."
            r2.append(r6)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x01c0 }
            logDiagnostic(r6)     // Catch:{ Exception -> 0x01c0 }
        L_0x01b5:
            java.lang.Class r1 = java.lang.Class.forName(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.Object r5 = r1.newInstance()     // Catch:{ Exception -> 0x01c0 }
            org.apache.commons.logging.LogFactory r5 = (org.apache.commons.logging.LogFactory) r5     // Catch:{ Exception -> 0x01c0 }
            return r5
        L_0x01c0:
            r5 = move-exception
            boolean r6 = isDiagnosticsEnabled()
            if (r6 == 0) goto L_0x01cc
            java.lang.String r6 = "Unable to create LogFactory instance."
            logDiagnostic(r6)
        L_0x01cc:
            if (r1 == 0) goto L_0x01e6
            java.lang.Class r6 = class$org$apache$commons$logging$LogFactory
            if (r6 != 0) goto L_0x01d8
            java.lang.Class r6 = class$(r0)
            class$org$apache$commons$logging$LogFactory = r6
        L_0x01d8:
            boolean r6 = r6.isAssignableFrom(r1)
            if (r6 != 0) goto L_0x01e6
            org.apache.commons.logging.LogConfigurationException r6 = new org.apache.commons.logging.LogConfigurationException
            java.lang.String r0 = "The chosen LogFactory implementation does not extend LogFactory. Please check your configuration."
            r6.<init>(r0, r5)
            return r6
        L_0x01e6:
            org.apache.commons.logging.LogConfigurationException r6 = new org.apache.commons.logging.LogConfigurationException
            r6.<init>((java.lang.Throwable) r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.createFactory(java.lang.String, java.lang.ClassLoader):java.lang.Object");
    }

    private static final Hashtable createFactoryStore() {
        String str;
        Hashtable hashtable = null;
        try {
            str = getSystemProperty(HASHTABLE_IMPLEMENTATION_PROPERTY, (String) null);
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = WEAK_HASHTABLE_CLASSNAME;
        }
        try {
            hashtable = (Hashtable) Class.forName(str).newInstance();
        } catch (Throwable unused2) {
            if (!WEAK_HASHTABLE_CLASSNAME.equals(str)) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[ERROR] LogFactory: Load of custom hashtable failed");
                } else {
                    System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
                }
            }
        }
        return hashtable == null ? new Hashtable() : hashtable;
    }

    protected static ClassLoader directGetContextClassLoader() throws LogConfigurationException {
        try {
            Class cls = class$java$lang$Thread;
            if (cls == null) {
                cls = class$("java.lang.Thread");
                class$java$lang$Thread = cls;
            }
            return (ClassLoader) cls.getMethod("getContextClassLoader", (Class[]) null).invoke(Thread.currentThread(), (Object[]) null);
        } catch (IllegalAccessException e) {
            throw new LogConfigurationException("Unexpected IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getTargetException() instanceof SecurityException) {
                return null;
            }
            throw new LogConfigurationException("Unexpected InvocationTargetException", e2.getTargetException());
        } catch (NoSuchMethodException unused) {
            Class cls2 = class$org$apache$commons$logging$LogFactory;
            if (cls2 == null) {
                cls2 = class$(FACTORY_PROPERTY);
                class$org$apache$commons$logging$LogFactory = cls2;
            }
            return getClassLoader(cls2);
        }
    }

    private static LogFactory getCachedFactory(ClassLoader classLoader) {
        if (classLoader == null) {
            return nullClassLoaderFactory;
        }
        return (LogFactory) factories.get(classLoader);
    }

    protected static ClassLoader getClassLoader(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to get classloader for class '");
                stringBuffer.append(cls);
                stringBuffer.append("' due to security restrictions - ");
                stringBuffer.append(e.getMessage());
                logDiagnostic(stringBuffer.toString());
            }
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.util.Properties getConfigurationFile(java.lang.ClassLoader r14, java.lang.String r15) {
        /*
            r0 = 0
            java.util.Enumeration r14 = getResources(r14, r15)     // Catch:{ SecurityException -> 0x00dc }
            if (r14 != 0) goto L_0x0008
            return r0
        L_0x0008:
            r1 = 0
            r3 = r0
            r4 = r1
        L_0x000c:
            boolean r6 = r14.hasMoreElements()     // Catch:{ SecurityException -> 0x00da }
            if (r6 == 0) goto L_0x00e8
            java.lang.Object r6 = r14.nextElement()     // Catch:{ SecurityException -> 0x00da }
            java.net.URL r6 = (java.net.URL) r6     // Catch:{ SecurityException -> 0x00da }
            java.util.Properties r7 = getProperties(r6)     // Catch:{ SecurityException -> 0x00da }
            if (r7 == 0) goto L_0x000c
            java.lang.String r8 = "priority"
            java.lang.String r9 = " with priority "
            java.lang.String r10 = "'"
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = r7.getProperty(r8)     // Catch:{ SecurityException -> 0x0059 }
            if (r0 == 0) goto L_0x0032
            double r3 = java.lang.Double.parseDouble(r0)     // Catch:{ SecurityException -> 0x0059 }
            r4 = r3
            goto L_0x0033
        L_0x0032:
            r4 = r1
        L_0x0033:
            boolean r0 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x0059 }
            if (r0 == 0) goto L_0x0056
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x0059 }
            r0.<init>()     // Catch:{ SecurityException -> 0x0059 }
            java.lang.String r3 = "[LOOKUP] Properties file found at '"
            r0.append(r3)     // Catch:{ SecurityException -> 0x0059 }
            r0.append(r6)     // Catch:{ SecurityException -> 0x0059 }
            r0.append(r10)     // Catch:{ SecurityException -> 0x0059 }
            r0.append(r9)     // Catch:{ SecurityException -> 0x0059 }
            r0.append(r4)     // Catch:{ SecurityException -> 0x0059 }
            java.lang.String r0 = r0.toString()     // Catch:{ SecurityException -> 0x0059 }
            logDiagnostic(r0)     // Catch:{ SecurityException -> 0x0059 }
        L_0x0056:
            r3 = r6
            r0 = r7
            goto L_0x000c
        L_0x0059:
            r3 = r6
            r0 = r7
            goto L_0x00dd
        L_0x005d:
            java.lang.String r8 = r7.getProperty(r8)     // Catch:{ SecurityException -> 0x00da }
            if (r8 == 0) goto L_0x0068
            double r11 = java.lang.Double.parseDouble(r8)     // Catch:{ SecurityException -> 0x00da }
            goto L_0x0069
        L_0x0068:
            r11 = r1
        L_0x0069:
            java.lang.String r8 = "[LOOKUP] Properties file at '"
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x00a6
            boolean r13 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x00da }
            if (r13 == 0) goto L_0x00a1
            java.lang.StringBuffer r13 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x00da }
            r13.<init>()     // Catch:{ SecurityException -> 0x00da }
            r13.append(r8)     // Catch:{ SecurityException -> 0x00da }
            r13.append(r6)     // Catch:{ SecurityException -> 0x00da }
            r13.append(r10)     // Catch:{ SecurityException -> 0x00da }
            r13.append(r9)     // Catch:{ SecurityException -> 0x00da }
            r13.append(r11)     // Catch:{ SecurityException -> 0x00da }
            java.lang.String r8 = " overrides file at '"
            r13.append(r8)     // Catch:{ SecurityException -> 0x00da }
            r13.append(r3)     // Catch:{ SecurityException -> 0x00da }
            r13.append(r10)     // Catch:{ SecurityException -> 0x00da }
            r13.append(r9)     // Catch:{ SecurityException -> 0x00da }
            r13.append(r4)     // Catch:{ SecurityException -> 0x00da }
            java.lang.String r4 = r13.toString()     // Catch:{ SecurityException -> 0x00da }
            logDiagnostic(r4)     // Catch:{ SecurityException -> 0x00da }
        L_0x00a1:
            r3 = r6
            r0 = r7
            r4 = r11
            goto L_0x000c
        L_0x00a6:
            boolean r7 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x00da }
            if (r7 == 0) goto L_0x000c
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x00da }
            r7.<init>()     // Catch:{ SecurityException -> 0x00da }
            r7.append(r8)     // Catch:{ SecurityException -> 0x00da }
            r7.append(r6)     // Catch:{ SecurityException -> 0x00da }
            r7.append(r10)     // Catch:{ SecurityException -> 0x00da }
            r7.append(r9)     // Catch:{ SecurityException -> 0x00da }
            r7.append(r11)     // Catch:{ SecurityException -> 0x00da }
            java.lang.String r6 = " does not override file at '"
            r7.append(r6)     // Catch:{ SecurityException -> 0x00da }
            r7.append(r3)     // Catch:{ SecurityException -> 0x00da }
            r7.append(r10)     // Catch:{ SecurityException -> 0x00da }
            r7.append(r9)     // Catch:{ SecurityException -> 0x00da }
            r7.append(r4)     // Catch:{ SecurityException -> 0x00da }
            java.lang.String r6 = r7.toString()     // Catch:{ SecurityException -> 0x00da }
            logDiagnostic(r6)     // Catch:{ SecurityException -> 0x00da }
            goto L_0x000c
        L_0x00da:
            goto L_0x00dd
        L_0x00dc:
            r3 = r0
        L_0x00dd:
            boolean r14 = isDiagnosticsEnabled()
            if (r14 == 0) goto L_0x00e8
            java.lang.String r14 = "SecurityException thrown while trying to find/read config files."
            logDiagnostic(r14)
        L_0x00e8:
            boolean r14 = isDiagnosticsEnabled()
            if (r14 == 0) goto L_0x012b
            if (r0 != 0) goto L_0x010a
            java.lang.StringBuffer r14 = new java.lang.StringBuffer
            r14.<init>()
            java.lang.String r1 = "[LOOKUP] No properties file of name '"
            r14.append(r1)
            r14.append(r15)
            java.lang.String r15 = "' found."
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            logDiagnostic(r14)
            goto L_0x012b
        L_0x010a:
            java.lang.StringBuffer r14 = new java.lang.StringBuffer
            r14.<init>()
            java.lang.String r1 = "[LOOKUP] Properties file of name '"
            r14.append(r1)
            r14.append(r15)
            java.lang.String r15 = "' found at '"
            r14.append(r15)
            r14.append(r3)
            r15 = 34
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            logDiagnostic(r14)
        L_0x012b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.getConfigurationFile(java.lang.ClassLoader, java.lang.String):java.util.Properties");
    }

    protected static ClassLoader getContextClassLoader() throws LogConfigurationException {
        return directGetContextClassLoader();
    }

    private static ClassLoader getContextClassLoaderInternal() throws LogConfigurationException {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                return LogFactory.directGetContextClassLoader();
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r7 = r6.getProperty(TCCL_KEY);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0113 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.apache.commons.logging.LogFactory getFactory() throws org.apache.commons.logging.LogConfigurationException {
        /*
            java.lang.String r0 = "META-INF/services/org.apache.commons.logging.LogFactory"
            java.lang.String r1 = "]. Trying alternative implementations..."
            java.lang.String r2 = "[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: ["
            java.lang.String r3 = "org.apache.commons.logging.LogFactory"
            java.lang.ClassLoader r4 = getContextClassLoaderInternal()
            if (r4 != 0) goto L_0x0019
            boolean r5 = isDiagnosticsEnabled()
            if (r5 == 0) goto L_0x0019
            java.lang.String r5 = "Context classloader is null."
            logDiagnostic(r5)
        L_0x0019:
            org.apache.commons.logging.LogFactory r5 = getCachedFactory(r4)
            if (r5 == 0) goto L_0x0020
            return r5
        L_0x0020:
            boolean r6 = isDiagnosticsEnabled()
            if (r6 == 0) goto L_0x0043
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            java.lang.String r7 = "[LOOKUP] LogFactory implementation requested for the first time for context classloader "
            r6.append(r7)
            java.lang.String r7 = objectId(r4)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            logDiagnostic(r6)
            java.lang.String r6 = "[LOOKUP] "
            logHierarchy(r6, r4)
        L_0x0043:
            java.lang.String r6 = "commons-logging.properties"
            java.util.Properties r6 = getConfigurationFile(r4, r6)
            if (r6 == 0) goto L_0x0060
            java.lang.String r7 = "use_tccl"
            java.lang.String r7 = r6.getProperty(r7)
            if (r7 == 0) goto L_0x0060
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x0060
            java.lang.ClassLoader r7 = thisClassLoader
            goto L_0x0061
        L_0x0060:
            r7 = r4
        L_0x0061:
            boolean r8 = isDiagnosticsEnabled()
            if (r8 == 0) goto L_0x006c
            java.lang.String r8 = "[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use..."
            logDiagnostic(r8)
        L_0x006c:
            r8 = 0
            java.lang.String r8 = getSystemProperty(r3, r8)     // Catch:{ SecurityException -> 0x00cf, RuntimeException -> 0x00a6 }
            if (r8 == 0) goto L_0x009a
            boolean r9 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x00cf, RuntimeException -> 0x00a6 }
            if (r9 == 0) goto L_0x0095
            java.lang.StringBuffer r9 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x00cf, RuntimeException -> 0x00a6 }
            r9.<init>()     // Catch:{ SecurityException -> 0x00cf, RuntimeException -> 0x00a6 }
            java.lang.String r10 = "[LOOKUP] Creating an instance of LogFactory class '"
            r9.append(r10)     // Catch:{ SecurityException -> 0x00cf, RuntimeException -> 0x00a6 }
            r9.append(r8)     // Catch:{ SecurityException -> 0x00cf, RuntimeException -> 0x00a6 }
            java.lang.String r10 = "' as specified by system property "
            r9.append(r10)     // Catch:{ SecurityException -> 0x00cf, RuntimeException -> 0x00a6 }
            r9.append(r3)     // Catch:{ SecurityException -> 0x00cf, RuntimeException -> 0x00a6 }
            java.lang.String r9 = r9.toString()     // Catch:{ SecurityException -> 0x00cf, RuntimeException -> 0x00a6 }
            logDiagnostic(r9)     // Catch:{ SecurityException -> 0x00cf, RuntimeException -> 0x00a6 }
        L_0x0095:
            org.apache.commons.logging.LogFactory r5 = newFactory(r8, r7, r4)     // Catch:{ SecurityException -> 0x00cf, RuntimeException -> 0x00a6 }
            goto L_0x00f3
        L_0x009a:
            boolean r8 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x00cf, RuntimeException -> 0x00a6 }
            if (r8 == 0) goto L_0x00f3
            java.lang.String r8 = "[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined."
            logDiagnostic(r8)     // Catch:{ SecurityException -> 0x00cf, RuntimeException -> 0x00a6 }
            goto L_0x00f3
        L_0x00a6:
            r0 = move-exception
            boolean r1 = isDiagnosticsEnabled()
            if (r1 == 0) goto L_0x00ce
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: ["
            r1.append(r2)
            java.lang.String r2 = r0.getMessage()
            java.lang.String r2 = trim(r2)
            r1.append(r2)
            java.lang.String r2 = "] as specified by a system property."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            logDiagnostic(r1)
        L_0x00ce:
            throw r0
        L_0x00cf:
            r8 = move-exception
            boolean r9 = isDiagnosticsEnabled()
            if (r9 == 0) goto L_0x00f3
            java.lang.StringBuffer r9 = new java.lang.StringBuffer
            r9.<init>()
            r9.append(r2)
            java.lang.String r8 = r8.getMessage()
            java.lang.String r8 = trim(r8)
            r9.append(r8)
            r9.append(r1)
            java.lang.String r8 = r9.toString()
            logDiagnostic(r8)
        L_0x00f3:
            if (r5 != 0) goto L_0x0190
            boolean r8 = isDiagnosticsEnabled()
            if (r8 == 0) goto L_0x0100
            java.lang.String r8 = "[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use..."
            logDiagnostic(r8)
        L_0x0100:
            java.io.InputStream r8 = getResourceAsStream(r4, r0)     // Catch:{ Exception -> 0x016c }
            if (r8 == 0) goto L_0x0160
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ UnsupportedEncodingException -> 0x0113 }
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ UnsupportedEncodingException -> 0x0113 }
            java.lang.String r11 = "UTF-8"
            r10.<init>(r8, r11)     // Catch:{ UnsupportedEncodingException -> 0x0113 }
            r9.<init>(r10)     // Catch:{ UnsupportedEncodingException -> 0x0113 }
            goto L_0x011d
        L_0x0113:
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ Exception -> 0x016c }
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x016c }
            r10.<init>(r8)     // Catch:{ Exception -> 0x016c }
            r9.<init>(r10)     // Catch:{ Exception -> 0x016c }
        L_0x011d:
            java.lang.String r8 = r9.readLine()     // Catch:{ Exception -> 0x016c }
            r9.close()     // Catch:{ Exception -> 0x016c }
            if (r8 == 0) goto L_0x0190
            java.lang.String r9 = ""
            boolean r9 = r9.equals(r8)     // Catch:{ Exception -> 0x016c }
            if (r9 != 0) goto L_0x0190
            boolean r9 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x016c }
            if (r9 == 0) goto L_0x015a
            java.lang.StringBuffer r9 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x016c }
            r9.<init>()     // Catch:{ Exception -> 0x016c }
            java.lang.String r10 = "[LOOKUP]  Creating an instance of LogFactory class "
            r9.append(r10)     // Catch:{ Exception -> 0x016c }
            r9.append(r8)     // Catch:{ Exception -> 0x016c }
            java.lang.String r10 = " as specified by file '"
            r9.append(r10)     // Catch:{ Exception -> 0x016c }
            r9.append(r0)     // Catch:{ Exception -> 0x016c }
            java.lang.String r0 = "' which was present in the path of the context"
            r9.append(r0)     // Catch:{ Exception -> 0x016c }
            java.lang.String r0 = " classloader."
            r9.append(r0)     // Catch:{ Exception -> 0x016c }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x016c }
            logDiagnostic(r0)     // Catch:{ Exception -> 0x016c }
        L_0x015a:
            org.apache.commons.logging.LogFactory r0 = newFactory(r8, r7, r4)     // Catch:{ Exception -> 0x016c }
            r5 = r0
            goto L_0x0190
        L_0x0160:
            boolean r0 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x016c }
            if (r0 == 0) goto L_0x0190
            java.lang.String r0 = "[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found."
            logDiagnostic(r0)     // Catch:{ Exception -> 0x016c }
            goto L_0x0190
        L_0x016c:
            r0 = move-exception
            boolean r8 = isDiagnosticsEnabled()
            if (r8 == 0) goto L_0x0190
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            r8.append(r2)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = trim(r0)
            r8.append(r0)
            r8.append(r1)
            java.lang.String r0 = r8.toString()
            logDiagnostic(r0)
        L_0x0190:
            if (r5 != 0) goto L_0x01e1
            if (r6 == 0) goto L_0x01d6
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x019f
            java.lang.String r0 = "[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use..."
            logDiagnostic(r0)
        L_0x019f:
            java.lang.String r0 = r6.getProperty(r3)
            if (r0 == 0) goto L_0x01ca
            boolean r1 = isDiagnosticsEnabled()
            if (r1 == 0) goto L_0x01c4
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "[LOOKUP] Properties file specifies LogFactory subclass '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            logDiagnostic(r1)
        L_0x01c4:
            org.apache.commons.logging.LogFactory r0 = newFactory(r0, r7, r4)
            r5 = r0
            goto L_0x01e1
        L_0x01ca:
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x01e1
            java.lang.String r0 = "[LOOKUP] Properties file has no entry specifying LogFactory subclass."
            logDiagnostic(r0)
            goto L_0x01e1
        L_0x01d6:
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x01e1
            java.lang.String r0 = "[LOOKUP] No properties file available to determine LogFactory subclass from.."
            logDiagnostic(r0)
        L_0x01e1:
            if (r5 != 0) goto L_0x01f6
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x01ee
            java.lang.String r0 = "[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader)."
            logDiagnostic(r0)
        L_0x01ee:
            java.lang.ClassLoader r0 = thisClassLoader
            java.lang.String r1 = "org.apache.commons.logging.impl.LogFactoryImpl"
            org.apache.commons.logging.LogFactory r5 = newFactory(r1, r0, r4)
        L_0x01f6:
            if (r5 == 0) goto L_0x0215
            cacheFactory(r4, r5)
            if (r6 == 0) goto L_0x0215
            java.util.Enumeration r0 = r6.propertyNames()
        L_0x0201:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L_0x0215
            java.lang.Object r1 = r0.nextElement()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r6.getProperty(r1)
            r5.setAttribute(r1, r2)
            goto L_0x0201
        L_0x0215:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.getFactory():org.apache.commons.logging.LogFactory");
    }

    public static Log getLog(Class cls) throws LogConfigurationException {
        return getFactory().getInstance(cls);
    }

    private static Properties getProperties(final URL url) {
        return (Properties) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                try {
                    InputStream openStream = url.openStream();
                    if (openStream == null) {
                        return null;
                    }
                    Properties properties = new Properties();
                    properties.load(openStream);
                    openStream.close();
                    return properties;
                } catch (IOException unused) {
                    if (!LogFactory.isDiagnosticsEnabled()) {
                        return null;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Unable to read URL ");
                    stringBuffer.append(url);
                    LogFactory.logDiagnostic(stringBuffer.toString());
                    return null;
                }
            }
        });
    }

    private static InputStream getResourceAsStream(final ClassLoader classLoader, final String str) {
        return (InputStream) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                ClassLoader classLoader = classLoader;
                if (classLoader != null) {
                    return classLoader.getResourceAsStream(str);
                }
                return ClassLoader.getSystemResourceAsStream(str);
            }
        });
    }

    private static Enumeration getResources(final ClassLoader classLoader, final String str) {
        return (Enumeration) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                try {
                    ClassLoader classLoader = classLoader;
                    if (classLoader != null) {
                        return classLoader.getResources(str);
                    }
                    return ClassLoader.getSystemResources(str);
                } catch (IOException e) {
                    if (LogFactory.isDiagnosticsEnabled()) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Exception while trying to find configuration file ");
                        stringBuffer.append(str);
                        stringBuffer.append(":");
                        stringBuffer.append(e.getMessage());
                        LogFactory.logDiagnostic(stringBuffer.toString());
                    }
                    return null;
                } catch (NoSuchMethodError unused) {
                    return null;
                }
            }
        });
    }

    private static String getSystemProperty(final String str, final String str2) throws SecurityException {
        return (String) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                return System.getProperty(str, str2);
            }
        });
    }

    private static boolean implementsLogFactory(Class cls) {
        boolean z = false;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    logDiagnostic("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                } else {
                    logHierarchy("[CUSTOM LOG FACTORY] ", classLoader);
                    z = Class.forName(FACTORY_PROPERTY, false, classLoader).isAssignableFrom(cls);
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("[CUSTOM LOG FACTORY] ");
                        stringBuffer.append(cls.getName());
                        stringBuffer.append(" implements LogFactory but was loaded by an incompatible classloader.");
                        logDiagnostic(stringBuffer.toString());
                    } else {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("[CUSTOM LOG FACTORY] ");
                        stringBuffer2.append(cls.getName());
                        stringBuffer2.append(" does not implement LogFactory.");
                        logDiagnostic(stringBuffer2.toString());
                    }
                }
            } catch (SecurityException e) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer3.append(e.getMessage());
                logDiagnostic(stringBuffer3.toString());
            } catch (LinkageError e2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer4.append(e2.getMessage());
                logDiagnostic(stringBuffer4.toString());
            } catch (ClassNotFoundException unused) {
                logDiagnostic("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            }
        }
        return z;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void initDiagnostics() {
        /*
            java.lang.String r0 = "org.apache.commons.logging.diagnostics.dest"
            r1 = 0
            java.lang.String r0 = getSystemProperty(r0, r1)     // Catch:{ SecurityException -> 0x0057 }
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            java.lang.String r1 = "STDOUT"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0017
            java.io.PrintStream r0 = java.lang.System.out
            diagnosticsStream = r0
            goto L_0x0031
        L_0x0017:
            java.lang.String r1 = "STDERR"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0024
            java.io.PrintStream r0 = java.lang.System.err
            diagnosticsStream = r0
            goto L_0x0031
        L_0x0024:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{  }
            r2 = 1
            r1.<init>(r0, r2)     // Catch:{  }
            java.io.PrintStream r0 = new java.io.PrintStream     // Catch:{  }
            r0.<init>(r1)     // Catch:{  }
            diagnosticsStream = r0     // Catch:{  }
        L_0x0031:
            java.lang.ClassLoader r0 = thisClassLoader     // Catch:{ SecurityException -> 0x003d }
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "BOOTLOADER"
            goto L_0x003f
        L_0x0038:
            java.lang.String r0 = objectId(r0)     // Catch:{ SecurityException -> 0x003d }
            goto L_0x003f
        L_0x003d:
            java.lang.String r0 = "UNKNOWN"
        L_0x003f:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "[LogFactory from "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "] "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            diagnosticPrefix = r0
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.initDiagnostics():void");
    }

    protected static boolean isDiagnosticsEnabled() {
        return diagnosticsStream != null;
    }

    private static void logClassLoaderEnvironment(Class cls) {
        if (isDiagnosticsEnabled()) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("[ENV] Extension directories (java.ext.dir): ");
                stringBuffer.append(System.getProperty("java.ext.dir"));
                logDiagnostic(stringBuffer.toString());
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Application classpath (java.class.path): ");
                stringBuffer2.append(System.getProperty("java.class.path"));
                logDiagnostic(stringBuffer2.toString());
            } catch (SecurityException unused) {
                logDiagnostic("[ENV] Security setting prevent interrogation of system classpaths.");
            }
            String name = cls.getName();
            try {
                ClassLoader classLoader = getClassLoader(cls);
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[ENV] Class ");
                stringBuffer3.append(name);
                stringBuffer3.append(" was loaded via classloader ");
                stringBuffer3.append(objectId(classLoader));
                logDiagnostic(stringBuffer3.toString());
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[ENV] Ancestry of classloader which loaded ");
                stringBuffer4.append(name);
                stringBuffer4.append(" is ");
                logHierarchy(stringBuffer4.toString(), classLoader);
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] Security forbids determining the classloader for ");
                stringBuffer5.append(name);
                logDiagnostic(stringBuffer5.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void logDiagnostic(String str) {
        PrintStream printStream = diagnosticsStream;
        if (printStream != null) {
            printStream.print(diagnosticPrefix);
            diagnosticsStream.println(str);
            diagnosticsStream.flush();
        }
    }

    private static void logHierarchy(String str, ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            if (classLoader != null) {
                String obj = classLoader.toString();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(objectId(classLoader));
                stringBuffer.append(" == '");
                stringBuffer.append(obj);
                stringBuffer.append("'");
                logDiagnostic(stringBuffer.toString());
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append("ClassLoader tree:");
                    StringBuffer stringBuffer3 = new StringBuffer(stringBuffer2.toString());
                    do {
                        stringBuffer3.append(objectId(classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer3.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer3.append(" --> ");
                        } catch (SecurityException unused) {
                            stringBuffer3.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer3.append("BOOT");
                    logDiagnostic(stringBuffer3.toString());
                }
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(str);
                stringBuffer4.append("Security forbids determining the system classloader.");
                logDiagnostic(stringBuffer4.toString());
            }
        }
    }

    protected static final void logRawDiagnostic(String str) {
        PrintStream printStream = diagnosticsStream;
        if (printStream != null) {
            printStream.println(str);
            diagnosticsStream.flush();
        }
    }

    protected static LogFactory newFactory(final String str, final ClassLoader classLoader, ClassLoader classLoader2) throws LogConfigurationException {
        Object doPrivileged = AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                return LogFactory.createFactory(str, classLoader);
            }
        });
        if (doPrivileged instanceof LogConfigurationException) {
            LogConfigurationException logConfigurationException = (LogConfigurationException) doPrivileged;
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("An error occurred while loading the factory class:");
                stringBuffer.append(logConfigurationException.getMessage());
                logDiagnostic(stringBuffer.toString());
            }
            throw logConfigurationException;
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Created object ");
            stringBuffer2.append(objectId(doPrivileged));
            stringBuffer2.append(" to manage classloader ");
            stringBuffer2.append(objectId(classLoader2));
            logDiagnostic(stringBuffer2.toString());
        }
        return (LogFactory) doPrivileged;
    }

    public static String objectId(Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(System.identityHashCode(obj));
        return stringBuffer.toString();
    }

    public static void release(ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Releasing factory for classloader ");
            stringBuffer.append(objectId(classLoader));
            logDiagnostic(stringBuffer.toString());
        }
        synchronized (factories) {
            if (classLoader == null) {
                LogFactory logFactory = nullClassLoaderFactory;
                if (logFactory != null) {
                    logFactory.release();
                    nullClassLoaderFactory = null;
                }
            } else {
                LogFactory logFactory2 = (LogFactory) factories.get(classLoader);
                if (logFactory2 != null) {
                    logFactory2.release();
                    factories.remove(classLoader);
                }
            }
        }
    }

    public static void releaseAll() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Releasing factory for all classloaders.");
        }
        synchronized (factories) {
            Enumeration elements = factories.elements();
            while (elements.hasMoreElements()) {
                ((LogFactory) elements.nextElement()).release();
            }
            factories.clear();
            LogFactory logFactory = nullClassLoaderFactory;
            if (logFactory != null) {
                logFactory.release();
                nullClassLoaderFactory = null;
            }
        }
    }

    private static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public abstract Object getAttribute(String str);

    public abstract String[] getAttributeNames();

    public abstract Log getInstance(Class cls) throws LogConfigurationException;

    public abstract Log getInstance(String str) throws LogConfigurationException;

    public abstract void release();

    public abstract void removeAttribute(String str);

    public abstract void setAttribute(String str, Object obj);

    public static Log getLog(String str) throws LogConfigurationException {
        return getFactory().getInstance(str);
    }

    protected static LogFactory newFactory(String str, ClassLoader classLoader) {
        return newFactory(str, classLoader, (ClassLoader) null);
    }
}
