package com.sun.mail.util;

import java.util.Properties;
import javax.mail.Session;

public class PropUtil {
    private PropUtil() {
    }

    private static boolean getBoolean(Object obj, boolean z) {
        if (obj == null) {
            return z;
        }
        if (!(obj instanceof String)) {
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
        }
        if (z) {
            return !((String) obj).equalsIgnoreCase("false");
        }
        return ((String) obj).equalsIgnoreCase("true");
    }

    public static boolean getBooleanProperty(Properties properties, String str, boolean z) {
        return getBoolean(getProp(properties, str), z);
    }

    @Deprecated
    public static boolean getBooleanSessionProperty(Session session, String str, boolean z) {
        return getBoolean(getProp(session.getProperties(), str), z);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|(1:6)(1:(2:8|9)(2:10|11))) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        return r1.equalsIgnoreCase("true");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r1 = java.lang.System.getProperty(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r1 == null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r2 != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return !r1.equalsIgnoreCase("false");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean getBooleanSystemProperty(java.lang.String r1, boolean r2) {
        /*
            java.util.Properties r0 = java.lang.System.getProperties()     // Catch:{ SecurityException -> 0x000d }
            java.lang.Object r0 = getProp(r0, r1)     // Catch:{ SecurityException -> 0x000d }
            boolean r1 = getBoolean(r0, r2)     // Catch:{ SecurityException -> 0x000d }
            return r1
        L_0x000d:
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ SecurityException -> 0x0026 }
            if (r1 != 0) goto L_0x0014
            return r2
        L_0x0014:
            if (r2 == 0) goto L_0x001f
            java.lang.String r0 = "false"
            boolean r1 = r1.equalsIgnoreCase(r0)     // Catch:{ SecurityException -> 0x0026 }
            r1 = r1 ^ 1
            return r1
        L_0x001f:
            java.lang.String r0 = "true"
            boolean r1 = r1.equalsIgnoreCase(r0)     // Catch:{ SecurityException -> 0x0026 }
            return r1
        L_0x0026:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.PropUtil.getBooleanSystemProperty(java.lang.String, boolean):boolean");
    }

    private static int getInt(Object obj, int i) {
        if (obj == null) {
            return i;
        }
        if (obj instanceof String) {
            try {
                String str = (String) obj;
                if (str.startsWith("0x")) {
                    return Integer.parseInt(str.substring(2), 16);
                }
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return obj instanceof Integer ? ((Integer) obj).intValue() : i;
    }

    public static int getIntProperty(Properties properties, String str, int i) {
        return getInt(getProp(properties, str), i);
    }

    @Deprecated
    public static int getIntSessionProperty(Session session, String str, int i) {
        return getInt(getProp(session.getProperties(), str), i);
    }

    private static Object getProp(Properties properties, String str) {
        Object obj = properties.get(str);
        if (obj != null) {
            return obj;
        }
        return properties.getProperty(str);
    }
}
