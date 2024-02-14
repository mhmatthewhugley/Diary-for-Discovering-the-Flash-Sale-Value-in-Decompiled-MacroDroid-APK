package org.apache.harmony.misc;

public class SystemUtils {
    public static final int ARC_IA32 = 1;
    public static final int ARC_IA64 = 2;
    public static final int ARC_UNKNOWN = -1;
    public static final int OS_LINUX = 2;
    public static final int OS_UNKNOWN = -1;
    public static final int OS_WINDOWS = 1;
    private static int arc;

    /* renamed from: os */
    private static int f66001os;

    public static int getOS() {
        if (f66001os == 0) {
            String substring = System.getProperty("os.name").substring(0, 3);
            if (substring.compareToIgnoreCase("win") == 0) {
                f66001os = 1;
            } else if (substring.compareToIgnoreCase("lin") == 0) {
                f66001os = 2;
            } else {
                f66001os = -1;
            }
        }
        return f66001os;
    }
}
