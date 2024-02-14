package org.slf4j;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.helpers.C16080c;
import org.slf4j.helpers.C16082e;
import org.slf4j.helpers.C16083f;
import org.slf4j.impl.StaticLoggerBinder;
import p339ne.C15789a;
import p339ne.C15790b;

public final class LoggerFactory {

    /* renamed from: a */
    static int f66039a;

    /* renamed from: b */
    static C16082e f66040b = new C16082e();

    /* renamed from: c */
    static C16080c f66041c = new C16080c();

    /* renamed from: d */
    private static final String[] f66042d = {"1.6"};

    /* renamed from: e */
    private static String f66043e = "org/slf4j/impl/StaticLoggerBinder.class";

    /* renamed from: f */
    static /* synthetic */ Class f66044f;

    private LoggerFactory() {
    }

    /* renamed from: a */
    private static final void m96686a() {
        try {
            Set e = m96690e();
            m96698m(e);
            StaticLoggerBinder.getSingleton();
            f66039a = 3;
            m96697l(e);
            m96688c();
        } catch (NoClassDefFoundError e2) {
            if (m96695j(e2.getMessage())) {
                f66039a = 4;
                C16083f.m96710a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                C16083f.m96710a("Defaulting to no-operation (NOP) logger implementation");
                C16083f.m96710a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                return;
            }
            m96689d(e2);
            throw e2;
        } catch (NoSuchMethodError e3) {
            String message = e3.getMessage();
            if (!(message == null || message.indexOf("org.slf4j.impl.StaticLoggerBinder.getSingleton()") == -1)) {
                f66039a = 2;
                C16083f.m96710a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                C16083f.m96710a("Your binding is version 1.5.5 or earlier.");
                C16083f.m96710a("Upgrade your binding to version 1.6.x.");
            }
            throw e3;
        } catch (Exception e4) {
            m96689d(e4);
            throw new IllegalStateException("Unexpected initialization failure", e4);
        }
    }

    /* renamed from: b */
    static /* synthetic */ Class m96687b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* renamed from: c */
    private static final void m96688c() {
        List b = f66040b.mo78413b();
        if (b.size() != 0) {
            C16083f.m96710a("The following loggers will not work because they were created");
            C16083f.m96710a("during the default configuration phase of the underlying logging system.");
            C16083f.m96710a("See also http://www.slf4j.org/codes.html#substituteLogger");
            for (int i = 0; i < b.size(); i++) {
                C16083f.m96710a((String) b.get(i));
            }
        }
    }

    /* renamed from: d */
    static void m96689d(Throwable th) {
        f66039a = 2;
        C16083f.m96711b("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* renamed from: e */
    private static Set m96690e() {
        Enumeration<URL> enumeration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            Class cls = f66044f;
            if (cls == null) {
                cls = m96687b("org.slf4j.LoggerFactory");
                f66044f = cls;
            }
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader == null) {
                enumeration = ClassLoader.getSystemResources(f66043e);
            } else {
                enumeration = classLoader.getResources(f66043e);
            }
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add(enumeration.nextElement());
            }
        } catch (IOException e) {
            C16083f.m96711b("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* renamed from: f */
    public static C15789a m96691f() {
        if (f66039a == 0) {
            f66039a = 1;
            m96696k();
        }
        int i = f66039a;
        if (i == 1) {
            return f66040b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        } else if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        } else {
            if (i == 4) {
                return f66041c;
            }
            throw new IllegalStateException("Unreachable code");
        }
    }

    /* renamed from: g */
    public static C15790b m96692g(Class cls) {
        return m96693h(cls.getName());
    }

    /* renamed from: h */
    public static C15790b m96693h(String str) {
        return m96691f().mo75501a(str);
    }

    /* renamed from: i */
    private static boolean m96694i(Set set) {
        return set.size() > 1;
    }

    /* renamed from: j */
    private static boolean m96695j(String str) {
        if (str == null) {
            return false;
        }
        return (str.indexOf("org/slf4j/impl/StaticLoggerBinder") == -1 && str.indexOf("org.slf4j.impl.StaticLoggerBinder") == -1) ? false : true;
    }

    /* renamed from: k */
    private static final void m96696k() {
        m96686a();
        if (f66039a == 3) {
            m96699n();
        }
    }

    /* renamed from: l */
    private static void m96697l(Set set) {
        if (m96694i(set)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Actual binding is of type [");
            stringBuffer.append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
            stringBuffer.append("]");
            C16083f.m96710a(stringBuffer.toString());
        }
    }

    /* renamed from: m */
    private static void m96698m(Set set) {
        if (m96694i(set)) {
            C16083f.m96710a("Class path contains multiple SLF4J bindings.");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Found binding in [");
                stringBuffer.append((URL) it.next());
                stringBuffer.append("]");
                C16083f.m96710a(stringBuffer.toString());
            }
            C16083f.m96710a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: n */
    private static final void m96699n() {
        String[] strArr;
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            int i = 0;
            boolean z = false;
            while (true) {
                strArr = f66042d;
                if (i >= strArr.length) {
                    break;
                }
                if (str.startsWith(strArr[i])) {
                    z = true;
                }
                i++;
            }
            if (!z) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("The requested version ");
                stringBuffer.append(str);
                stringBuffer.append(" by your slf4j binding is not compatible with ");
                stringBuffer.append(Arrays.asList(strArr).toString());
                C16083f.m96710a(stringBuffer.toString());
                C16083f.m96710a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C16083f.m96711b("Unexpected problem occured during version sanity check", th);
        }
    }
}
