package org.apache.commons.logging.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

public class LogFactoryImpl extends LogFactory {
    public static final String ALLOW_FLAWED_CONTEXT_PROPERTY = "org.apache.commons.logging.Log.allowFlawedContext";
    public static final String ALLOW_FLAWED_DISCOVERY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedDiscovery";
    public static final String ALLOW_FLAWED_HIERARCHY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedHierarchy";
    private static final String LOGGING_IMPL_JDK14_LOGGER = "org.apache.commons.logging.impl.Jdk14Logger";
    private static final String LOGGING_IMPL_LOG4J_LOGGER = "org.apache.commons.logging.impl.Log4JLogger";
    private static final String LOGGING_IMPL_LUMBERJACK_LOGGER = "org.apache.commons.logging.impl.Jdk13LumberjackLogger";
    private static final String LOGGING_IMPL_SIMPLE_LOGGER = "org.apache.commons.logging.impl.SimpleLog";
    public static final String LOG_PROPERTY = "org.apache.commons.logging.Log";
    protected static final String LOG_PROPERTY_OLD = "org.apache.commons.logging.log";
    private static final String PKG_IMPL = "org.apache.commons.logging.impl.";
    private static final int PKG_LEN = 32;
    static /* synthetic */ Class class$java$lang$String;
    static /* synthetic */ Class class$org$apache$commons$logging$Log;
    static /* synthetic */ Class class$org$apache$commons$logging$LogFactory;
    static /* synthetic */ Class class$org$apache$commons$logging$impl$LogFactoryImpl;
    private static final String[] classesToDiscover = {LOGGING_IMPL_LOG4J_LOGGER, LOGGING_IMPL_JDK14_LOGGER, LOGGING_IMPL_LUMBERJACK_LOGGER, LOGGING_IMPL_SIMPLE_LOGGER};
    private boolean allowFlawedContext;
    private boolean allowFlawedDiscovery;
    private boolean allowFlawedHierarchy;
    protected Hashtable attributes = new Hashtable();
    private String diagnosticPrefix;
    protected Hashtable instances = new Hashtable();
    private String logClassName;
    protected Constructor logConstructor = null;
    protected Class[] logConstructorSignature;
    protected Method logMethod;
    protected Class[] logMethodSignature;
    private boolean useTCCL = true;

    public LogFactoryImpl() {
        Class[] clsArr = new Class[1];
        Class cls = class$java$lang$String;
        if (cls == null) {
            cls = class$("java.lang.String");
            class$java$lang$String = cls;
        }
        clsArr[0] = cls;
        this.logConstructorSignature = clsArr;
        this.logMethod = null;
        Class[] clsArr2 = new Class[1];
        Class cls2 = class$org$apache$commons$logging$LogFactory;
        if (cls2 == null) {
            cls2 = class$(LogFactory.FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = cls2;
        }
        clsArr2[0] = cls2;
        this.logMethodSignature = clsArr2;
        initDiagnostics();
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Instance created.");
        }
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x016e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x017c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x017d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01bb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0176 A[LOOP:0: B:4:0x0038->B:45:0x0176, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x017c A[ExcHandler: LogConfigurationException (r0v19 'e' org.apache.commons.logging.LogConfigurationException A[CUSTOM_DECLARE]), Splitter:B:5:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01f7 A[EDGE_INSN: B:63:0x01f7->B:52:0x01f7 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.apache.commons.logging.Log createLogFromClass(java.lang.String r17, java.lang.String r18, boolean r19) throws org.apache.commons.logging.LogConfigurationException {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r3 = ".class"
            java.lang.String r4 = ": "
            java.lang.String r5 = "The log adapter '"
            java.lang.String r6 = ""
            boolean r0 = isDiagnosticsEnabled()
            java.lang.String r7 = "'"
            if (r0 == 0) goto L_0x002b
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r8 = "Attempting to instantiate '"
            r0.append(r8)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r1.logDiagnostic(r0)
        L_0x002b:
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r0 = 0
            r9[r0] = r18
            java.lang.ClassLoader r0 = r16.getBaseClassLoader()
            r11 = r0
            r12 = 0
            r13 = 0
        L_0x0038:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r14 = "Trying to load '"
            r0.append(r14)
            r0.append(r2)
            java.lang.String r14 = "' from classloader "
            r0.append(r14)
            java.lang.String r15 = org.apache.commons.logging.LogFactory.objectId(r11)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r1.logDiagnostic(r0)
            boolean r0 = isDiagnosticsEnabled()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            if (r0 == 0) goto L_0x00d0
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.<init>()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r15 = 46
            r10 = 47
            java.lang.String r10 = r2.replace(r15, r10)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r10)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r3)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r0.toString()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            if (r11 == 0) goto L_0x007c
            java.net.URL r10 = r11.getResource(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            goto L_0x008f
        L_0x007c:
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.<init>()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r3)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r10 = r10.toString()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.net.URL r10 = java.lang.ClassLoader.getSystemResource(r10)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
        L_0x008f:
            java.lang.String r15 = "Class '"
            if (r10 != 0) goto L_0x00b3
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.<init>()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r15)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r2)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r15 = "' ["
            r10.append(r15)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = "] cannot be found."
            r10.append(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r10.toString()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r1.logDiagnostic(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            goto L_0x00d0
        L_0x00b3:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.<init>()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r15)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r2)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r15 = "' was found at '"
            r0.append(r15)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r10)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r7)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r0.toString()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r1.logDiagnostic(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
        L_0x00d0:
            java.lang.Class r0 = java.lang.Class.forName(r2, r8, r11)     // Catch:{ ClassNotFoundException -> 0x00d6 }
        L_0x00d4:
            r10 = r0
            goto L_0x0118
        L_0x00d6:
            r0 = move-exception
            r10 = r0
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.<init>()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r6)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r10 = r10.getMessage()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r10)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r0.toString()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.<init>()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r5)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r2)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r15 = "' is not available via classloader "
            r10.append(r15)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r15 = org.apache.commons.logging.LogFactory.objectId(r11)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r15)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r4)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r0.trim()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r10.toString()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r1.logDiagnostic(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.Class r0 = java.lang.Class.forName(r17)     // Catch:{ ClassNotFoundException -> 0x0139 }
            goto L_0x00d4
        L_0x0118:
            java.lang.Class[] r0 = r1.logConstructorSignature     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.reflect.Constructor r12 = r10.getConstructor(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.Object r0 = r12.newInstance(r9)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            boolean r15 = r0 instanceof org.apache.commons.logging.Log     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            if (r15 == 0) goto L_0x0135
            org.apache.commons.logging.Log r0 = (org.apache.commons.logging.Log) r0     // Catch:{ NoClassDefFoundError -> 0x0131, ExceptionInInitializerError -> 0x012e, LogConfigurationException -> 0x017c, all -> 0x012b }
            r13 = r10
            goto L_0x01f8
        L_0x012b:
            r0 = move-exception
            r13 = r10
            goto L_0x016f
        L_0x012e:
            r0 = move-exception
            r13 = r10
            goto L_0x017f
        L_0x0131:
            r0 = move-exception
            r13 = r10
            goto L_0x01bc
        L_0x0135:
            r1.handleFlawedHierarchy(r11, r10)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            goto L_0x0172
        L_0x0139:
            r0 = move-exception
            r10 = r0
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.<init>()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r6)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r10 = r10.getMessage()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r0.append(r10)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r0.toString()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.<init>()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r5)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r2)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r15 = "' is not available via the LogFactoryImpl class classloader: "
            r10.append(r15)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r0.trim()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r10.append(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            java.lang.String r0 = r10.toString()     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            r1.logDiagnostic(r0)     // Catch:{ NoClassDefFoundError -> 0x01bb, ExceptionInInitializerError -> 0x017e, LogConfigurationException -> 0x017c, all -> 0x016e }
            goto L_0x01f7
        L_0x016e:
            r0 = move-exception
        L_0x016f:
            r1.handleFlawedDiscovery(r2, r11, r0)
        L_0x0172:
            if (r11 != 0) goto L_0x0176
            goto L_0x01f7
        L_0x0176:
            java.lang.ClassLoader r11 = r1.getParentClassLoader(r11)
            goto L_0x0038
        L_0x017c:
            r0 = move-exception
            throw r0
        L_0x017e:
            r0 = move-exception
        L_0x017f:
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r6)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r5)
            r3.append(r2)
            java.lang.String r5 = "' is unable to initialize itself when loaded via classloader "
            r3.append(r5)
            java.lang.String r5 = org.apache.commons.logging.LogFactory.objectId(r11)
            r3.append(r5)
            r3.append(r4)
            java.lang.String r0 = r0.trim()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.logDiagnostic(r0)
            goto L_0x01f7
        L_0x01bb:
            r0 = move-exception
        L_0x01bc:
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r6)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r5)
            r3.append(r2)
            java.lang.String r5 = "' is missing dependencies when loaded via classloader "
            r3.append(r5)
            java.lang.String r5 = org.apache.commons.logging.LogFactory.objectId(r11)
            r3.append(r5)
            r3.append(r4)
            java.lang.String r0 = r0.trim()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.logDiagnostic(r0)
        L_0x01f7:
            r0 = 0
        L_0x01f8:
            if (r0 == 0) goto L_0x0274
            if (r19 == 0) goto L_0x0274
            r1.logClassName = r2
            r1.logConstructor = r12
            java.lang.String r3 = "setLogFactory"
            java.lang.Class[] r4 = r1.logMethodSignature     // Catch:{ all -> 0x0222 }
            java.lang.reflect.Method r3 = r13.getMethod(r3, r4)     // Catch:{ all -> 0x0222 }
            r1.logMethod = r3     // Catch:{ all -> 0x0222 }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ all -> 0x0222 }
            r3.<init>()     // Catch:{ all -> 0x0222 }
            java.lang.String r4 = "Found method setLogFactory(LogFactory) in '"
            r3.append(r4)     // Catch:{ all -> 0x0222 }
            r3.append(r2)     // Catch:{ all -> 0x0222 }
            r3.append(r7)     // Catch:{ all -> 0x0222 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0222 }
            r1.logDiagnostic(r3)     // Catch:{ all -> 0x0222 }
            goto L_0x024d
        L_0x0222:
            r3 = 0
            r1.logMethod = r3
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r4 = "[INFO] '"
            r3.append(r4)
            r3.append(r2)
            r3.append(r14)
            java.lang.String r4 = org.apache.commons.logging.LogFactory.objectId(r11)
            r3.append(r4)
            java.lang.String r4 = " does not declare optional method "
            r3.append(r4)
            java.lang.String r4 = "setLogFactory(LogFactory)"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.logDiagnostic(r3)
        L_0x024d:
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r4 = "Log adapter '"
            r3.append(r4)
            r3.append(r2)
            r3.append(r14)
            java.lang.ClassLoader r2 = r13.getClassLoader()
            java.lang.String r2 = org.apache.commons.logging.LogFactory.objectId(r2)
            r3.append(r2)
            java.lang.String r2 = " has been selected for use."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.logDiagnostic(r2)
        L_0x0274:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.impl.LogFactoryImpl.createLogFromClass(java.lang.String, java.lang.String, boolean):org.apache.commons.logging.Log");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.apache.commons.logging.Log discoverLogImplementation(java.lang.String r6) throws org.apache.commons.logging.LogConfigurationException {
        /*
            r5 = this;
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "Discovering a Log implementation..."
            r5.logDiagnostic(r0)
        L_0x000b:
            r5.initConfiguration()
            r0 = 0
            java.lang.String r1 = r5.findUserSpecifiedLogClassName()
            r2 = 1
            if (r1 == 0) goto L_0x0069
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x0035
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r3 = "Attempting to load user-specified log class '"
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = "'..."
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r5.logDiagnostic(r0)
        L_0x0035:
            org.apache.commons.logging.Log r6 = r5.createLogFromClass(r1, r6, r2)
            if (r6 == 0) goto L_0x003c
            return r6
        L_0x003c:
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            java.lang.String r0 = "User-specified log class '"
            r6.<init>(r0)
            r6.append(r1)
            java.lang.String r0 = "' cannot be found or is not useable."
            r6.append(r0)
            java.lang.String r0 = "org.apache.commons.logging.impl.Log4JLogger"
            r5.informUponSimilarName(r6, r1, r0)
            java.lang.String r0 = "org.apache.commons.logging.impl.Jdk14Logger"
            r5.informUponSimilarName(r6, r1, r0)
            java.lang.String r0 = "org.apache.commons.logging.impl.Jdk13LumberjackLogger"
            r5.informUponSimilarName(r6, r1, r0)
            java.lang.String r0 = "org.apache.commons.logging.impl.SimpleLog"
            r5.informUponSimilarName(r6, r1, r0)
            org.apache.commons.logging.LogConfigurationException r0 = new org.apache.commons.logging.LogConfigurationException
            java.lang.String r6 = r6.toString()
            r0.<init>((java.lang.String) r6)
            throw r0
        L_0x0069:
            boolean r1 = isDiagnosticsEnabled()
            if (r1 == 0) goto L_0x0074
            java.lang.String r1 = "No user-specified Log implementation; performing discovery using the standard supported logging implementations..."
            r5.logDiagnostic(r1)
        L_0x0074:
            r1 = 0
        L_0x0075:
            java.lang.String[] r3 = classesToDiscover
            int r4 = r3.length
            if (r1 >= r4) goto L_0x0085
            if (r0 != 0) goto L_0x0085
            r0 = r3[r1]
            org.apache.commons.logging.Log r0 = r5.createLogFromClass(r0, r6, r2)
            int r1 = r1 + 1
            goto L_0x0075
        L_0x0085:
            if (r0 == 0) goto L_0x0088
            return r0
        L_0x0088:
            org.apache.commons.logging.LogConfigurationException r6 = new org.apache.commons.logging.LogConfigurationException
            java.lang.String r0 = "No suitable Log implementation"
            r6.<init>((java.lang.String) r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.impl.LogFactoryImpl.discoverLogImplementation(java.lang.String):org.apache.commons.logging.Log");
    }

    private String findUserSpecifiedLogClassName() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.Log'");
        }
        String str = (String) getAttribute(LOG_PROPERTY);
        if (str == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.log'");
            }
            str = (String) getAttribute(LOG_PROPERTY_OLD);
        }
        if (str == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.Log'");
            }
            try {
                str = getSystemProperty(LOG_PROPERTY, (String) null);
            } catch (SecurityException e) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("No access allowed to system property 'org.apache.commons.logging.Log' - ");
                    stringBuffer.append(e.getMessage());
                    logDiagnostic(stringBuffer.toString());
                }
            }
        }
        if (str == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.log'");
            }
            try {
                str = getSystemProperty(LOG_PROPERTY_OLD, (String) null);
            } catch (SecurityException e2) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("No access allowed to system property 'org.apache.commons.logging.log' - ");
                    stringBuffer2.append(e2.getMessage());
                    logDiagnostic(stringBuffer2.toString());
                }
            }
        }
        return str != null ? str.trim() : str;
    }

    private ClassLoader getBaseClassLoader() throws LogConfigurationException {
        Class cls = class$org$apache$commons$logging$impl$LogFactoryImpl;
        if (cls == null) {
            cls = class$(LogFactory.FACTORY_DEFAULT);
            class$org$apache$commons$logging$impl$LogFactoryImpl = cls;
        }
        ClassLoader classLoader = getClassLoader(cls);
        if (!this.useTCCL) {
            return classLoader;
        }
        ClassLoader contextClassLoaderInternal = getContextClassLoaderInternal();
        ClassLoader lowestClassLoader = getLowestClassLoader(contextClassLoaderInternal, classLoader);
        if (lowestClassLoader != null) {
            if (lowestClassLoader != contextClassLoaderInternal) {
                if (!this.allowFlawedContext) {
                    throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
                } else if (isDiagnosticsEnabled()) {
                    logDiagnostic("Warning: the context classloader is an ancestor of the classloader that loaded LogFactoryImpl; it should be the same or a descendant. The application using commons-logging should ensure the context classloader is used correctly.");
                }
            }
            return lowestClassLoader;
        } else if (this.allowFlawedContext) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[WARNING] the context classloader is not part of a parent-child relationship with the classloader that loaded LogFactoryImpl.");
            }
            return contextClassLoaderInternal;
        } else {
            throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
        }
    }

    private boolean getBooleanConfiguration(String str, boolean z) {
        String configurationValue = getConfigurationValue(str);
        if (configurationValue == null) {
            return z;
        }
        return Boolean.valueOf(configurationValue).booleanValue();
    }

    protected static ClassLoader getClassLoader(Class cls) {
        return LogFactory.getClassLoader(cls);
    }

    private String getConfigurationValue(String str) {
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[ENV] Trying to get configuration for item ");
            stringBuffer.append(str);
            logDiagnostic(stringBuffer.toString());
        }
        Object attribute = getAttribute(str);
        if (attribute != null) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Found LogFactory attribute [");
                stringBuffer2.append(attribute);
                stringBuffer2.append("] for ");
                stringBuffer2.append(str);
                logDiagnostic(stringBuffer2.toString());
            }
            return attribute.toString();
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("[ENV] No LogFactory attribute found for ");
            stringBuffer3.append(str);
            logDiagnostic(stringBuffer3.toString());
        }
        try {
            String systemProperty = getSystemProperty(str, (String) null);
            if (systemProperty != null) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("[ENV] Found system property [");
                    stringBuffer4.append(systemProperty);
                    stringBuffer4.append("] for ");
                    stringBuffer4.append(str);
                    logDiagnostic(stringBuffer4.toString());
                }
                return systemProperty;
            }
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] No system property found for property ");
                stringBuffer5.append(str);
                logDiagnostic(stringBuffer5.toString());
            }
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("[ENV] No configuration defined for item ");
                stringBuffer6.append(str);
                logDiagnostic(stringBuffer6.toString());
            }
            return null;
        } catch (SecurityException unused) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append("[ENV] Security prevented reading system property ");
                stringBuffer7.append(str);
                logDiagnostic(stringBuffer7.toString());
            }
        }
    }

    protected static ClassLoader getContextClassLoader() throws LogConfigurationException {
        return LogFactory.getContextClassLoader();
    }

    private static ClassLoader getContextClassLoaderInternal() throws LogConfigurationException {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                return LogFactory.directGetContextClassLoader();
            }
        });
    }

    private ClassLoader getLowestClassLoader(ClassLoader classLoader, ClassLoader classLoader2) {
        if (classLoader == null) {
            return classLoader2;
        }
        if (classLoader2 == null) {
            return classLoader;
        }
        for (ClassLoader classLoader3 = classLoader; classLoader3 != null; classLoader3 = classLoader3.getParent()) {
            if (classLoader3 == classLoader2) {
                return classLoader;
            }
        }
        for (ClassLoader classLoader4 = classLoader2; classLoader4 != null; classLoader4 = classLoader4.getParent()) {
            if (classLoader4 == classLoader) {
                return classLoader2;
            }
        }
        return null;
    }

    private ClassLoader getParentClassLoader(final ClassLoader classLoader) {
        try {
            return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() {
                public Object run() {
                    return classLoader.getParent();
                }
            });
        } catch (SecurityException unused) {
            logDiagnostic("[SECURITY] Unable to obtain parent classloader");
            return null;
        }
    }

    private static String getSystemProperty(final String str, final String str2) throws SecurityException {
        return (String) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                return System.getProperty(str, str2);
            }
        });
    }

    private void handleFlawedDiscovery(String str, ClassLoader classLoader, Throwable th) {
        Throwable targetException;
        Throwable exception;
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Could not instantiate Log '");
            stringBuffer.append(str);
            stringBuffer.append("' -- ");
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append(": ");
            stringBuffer.append(th.getLocalizedMessage());
            logDiagnostic(stringBuffer.toString());
            if ((th instanceof InvocationTargetException) && (targetException = ((InvocationTargetException) th).getTargetException()) != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("... InvocationTargetException: ");
                stringBuffer2.append(targetException.getClass().getName());
                stringBuffer2.append(": ");
                stringBuffer2.append(targetException.getLocalizedMessage());
                logDiagnostic(stringBuffer2.toString());
                if ((targetException instanceof ExceptionInInitializerError) && (exception = ((ExceptionInInitializerError) targetException).getException()) != null) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("... ExceptionInInitializerError: ");
                    stringBuffer3.append(exception.getClass().getName());
                    stringBuffer3.append(": ");
                    stringBuffer3.append(exception.getLocalizedMessage());
                    logDiagnostic(stringBuffer3.toString());
                }
            }
        }
        if (!this.allowFlawedDiscovery) {
            throw new LogConfigurationException(th);
        }
    }

    private void handleFlawedHierarchy(ClassLoader classLoader, Class cls) throws LogConfigurationException {
        Class cls2 = class$org$apache$commons$logging$Log;
        if (cls2 == null) {
            cls2 = class$(LOG_PROPERTY);
            class$org$apache$commons$logging$Log = cls2;
        }
        String name = cls2.getName();
        Class[] interfaces = cls.getInterfaces();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= interfaces.length) {
                break;
            } else if (name.equals(interfaces[i].getName())) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            if (isDiagnosticsEnabled()) {
                try {
                    Class cls3 = class$org$apache$commons$logging$Log;
                    if (cls3 == null) {
                        cls3 = class$(LOG_PROPERTY);
                        class$org$apache$commons$logging$Log = cls3;
                    }
                    ClassLoader classLoader2 = getClassLoader(cls3);
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Class '");
                    stringBuffer.append(cls.getName());
                    stringBuffer.append("' was found in classloader ");
                    stringBuffer.append(LogFactory.objectId(classLoader));
                    stringBuffer.append(". It is bound to a Log interface which is not");
                    stringBuffer.append(" the one loaded from classloader ");
                    stringBuffer.append(LogFactory.objectId(classLoader2));
                    logDiagnostic(stringBuffer.toString());
                } catch (Throwable unused) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Error while trying to output diagnostics about bad class '");
                    stringBuffer2.append(cls);
                    stringBuffer2.append("'");
                    logDiagnostic(stringBuffer2.toString());
                }
            }
            if (!this.allowFlawedHierarchy) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Terminating logging for this context ");
                stringBuffer3.append("due to bad log hierarchy. ");
                stringBuffer3.append("You have more than one version of '");
                Class cls4 = class$org$apache$commons$logging$Log;
                if (cls4 == null) {
                    cls4 = class$(LOG_PROPERTY);
                    class$org$apache$commons$logging$Log = cls4;
                }
                stringBuffer3.append(cls4.getName());
                stringBuffer3.append("' visible.");
                if (isDiagnosticsEnabled()) {
                    logDiagnostic(stringBuffer3.toString());
                }
                throw new LogConfigurationException(stringBuffer3.toString());
            } else if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Warning: bad log hierarchy. ");
                stringBuffer4.append("You have more than one version of '");
                Class cls5 = class$org$apache$commons$logging$Log;
                if (cls5 == null) {
                    cls5 = class$(LOG_PROPERTY);
                    class$org$apache$commons$logging$Log = cls5;
                }
                stringBuffer4.append(cls5.getName());
                stringBuffer4.append("' visible.");
                logDiagnostic(stringBuffer4.toString());
            }
        } else if (!this.allowFlawedDiscovery) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("Terminating logging for this context. ");
            stringBuffer5.append("Log class '");
            stringBuffer5.append(cls.getName());
            stringBuffer5.append("' does not implement the Log interface.");
            if (isDiagnosticsEnabled()) {
                logDiagnostic(stringBuffer5.toString());
            }
            throw new LogConfigurationException(stringBuffer5.toString());
        } else if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("[WARNING] Log class '");
            stringBuffer6.append(cls.getName());
            stringBuffer6.append("' does not implement the Log interface.");
            logDiagnostic(stringBuffer6.toString());
        }
    }

    private void informUponSimilarName(StringBuffer stringBuffer, String str, String str2) {
        if (!str.equals(str2)) {
            if (str.regionMatches(true, 0, str2, 0, PKG_LEN + 5)) {
                stringBuffer.append(" Did you mean '");
                stringBuffer.append(str2);
                stringBuffer.append("'?");
            }
        }
    }

    private void initConfiguration() {
        this.allowFlawedContext = getBooleanConfiguration(ALLOW_FLAWED_CONTEXT_PROPERTY, true);
        this.allowFlawedDiscovery = getBooleanConfiguration(ALLOW_FLAWED_DISCOVERY_PROPERTY, true);
        this.allowFlawedHierarchy = getBooleanConfiguration(ALLOW_FLAWED_HIERARCHY_PROPERTY, true);
    }

    private void initDiagnostics() {
        String str;
        ClassLoader classLoader = getClassLoader(getClass());
        if (classLoader == null) {
            str = "BOOTLOADER";
        } else {
            try {
                str = LogFactory.objectId(classLoader);
            } catch (SecurityException unused) {
                str = "UNKNOWN";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactoryImpl@");
        stringBuffer.append(System.identityHashCode(this));
        stringBuffer.append(" from ");
        stringBuffer.append(str);
        stringBuffer.append("] ");
        this.diagnosticPrefix = stringBuffer.toString();
    }

    protected static boolean isDiagnosticsEnabled() {
        return LogFactory.isDiagnosticsEnabled();
    }

    private boolean isLogLibraryAvailable(String str, String str2) {
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Checking for '");
            stringBuffer.append(str);
            stringBuffer.append("'.");
            logDiagnostic(stringBuffer.toString());
        }
        try {
            if (createLogFromClass(str2, getClass().getName(), false) == null) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Did not find '");
                    stringBuffer2.append(str);
                    stringBuffer2.append("'.");
                    logDiagnostic(stringBuffer2.toString());
                }
                return false;
            } else if (!isDiagnosticsEnabled()) {
                return true;
            } else {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Found '");
                stringBuffer3.append(str);
                stringBuffer3.append("'.");
                logDiagnostic(stringBuffer3.toString());
                return true;
            }
        } catch (LogConfigurationException unused) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Logging system '");
                stringBuffer4.append(str);
                stringBuffer4.append("' is available but not useable.");
                logDiagnostic(stringBuffer4.toString());
            }
            return false;
        }
    }

    public Object getAttribute(String str) {
        return this.attributes.get(str);
    }

    public String[] getAttributeNames() {
        Vector vector = new Vector();
        Enumeration keys = this.attributes.keys();
        while (keys.hasMoreElements()) {
            vector.addElement((String) keys.nextElement());
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    public Log getInstance(Class cls) throws LogConfigurationException {
        return getInstance(cls.getName());
    }

    /* access modifiers changed from: protected */
    public String getLogClassName() {
        if (this.logClassName == null) {
            discoverLogImplementation(getClass().getName());
        }
        return this.logClassName;
    }

    /* access modifiers changed from: protected */
    public Constructor getLogConstructor() throws LogConfigurationException {
        if (this.logConstructor == null) {
            discoverLogImplementation(getClass().getName());
        }
        return this.logConstructor;
    }

    /* access modifiers changed from: protected */
    public boolean isJdk13LumberjackAvailable() {
        return isLogLibraryAvailable("Jdk13Lumberjack", LOGGING_IMPL_LUMBERJACK_LOGGER);
    }

    /* access modifiers changed from: protected */
    public boolean isJdk14Available() {
        return isLogLibraryAvailable("Jdk14", LOGGING_IMPL_JDK14_LOGGER);
    }

    /* access modifiers changed from: protected */
    public boolean isLog4JAvailable() {
        return isLogLibraryAvailable("Log4J", LOGGING_IMPL_LOG4J_LOGGER);
    }

    /* access modifiers changed from: protected */
    public void logDiagnostic(String str) {
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.diagnosticPrefix);
            stringBuffer.append(str);
            LogFactory.logRawDiagnostic(stringBuffer.toString());
        }
    }

    /* access modifiers changed from: protected */
    public Log newInstance(String str) throws LogConfigurationException {
        Log log;
        try {
            Constructor constructor = this.logConstructor;
            if (constructor == null) {
                log = discoverLogImplementation(str);
            } else {
                log = (Log) constructor.newInstance(new Object[]{str});
            }
            Method method = this.logMethod;
            if (method != null) {
                method.invoke(log, new Object[]{this});
            }
            return log;
        } catch (LogConfigurationException e) {
            throw e;
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException != null) {
                throw new LogConfigurationException(targetException);
            }
            throw new LogConfigurationException((Throwable) e2);
        } catch (Throwable th) {
            throw new LogConfigurationException(th);
        }
    }

    public void release() {
        logDiagnostic("Releasing all known loggers");
        this.instances.clear();
    }

    public void removeAttribute(String str) {
        this.attributes.remove(str);
    }

    public void setAttribute(String str, Object obj) {
        if (this.logConstructor != null) {
            logDiagnostic("setAttribute: call too late; configuration already performed.");
        }
        if (obj == null) {
            this.attributes.remove(str);
        } else {
            this.attributes.put(str, obj);
        }
        if (str.equals(LogFactory.TCCL_KEY)) {
            this.useTCCL = Boolean.valueOf(obj.toString()).booleanValue();
        }
    }

    public Log getInstance(String str) throws LogConfigurationException {
        Log log = (Log) this.instances.get(str);
        if (log != null) {
            return log;
        }
        Log newInstance = newInstance(str);
        this.instances.put(str, newInstance);
        return newInstance;
    }
}
