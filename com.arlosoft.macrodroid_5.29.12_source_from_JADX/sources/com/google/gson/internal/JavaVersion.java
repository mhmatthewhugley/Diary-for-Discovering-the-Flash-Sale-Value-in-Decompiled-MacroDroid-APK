package com.google.gson.internal;

public final class JavaVersion {

    /* renamed from: a */
    private static final int f55860a = m78457a();

    private JavaVersion() {
    }

    /* renamed from: a */
    private static int m78457a() {
        return m78460d(System.getProperty("java.version"));
    }

    /* renamed from: b */
    private static int m78458b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static int m78459c() {
        return f55860a;
    }

    /* renamed from: d */
    static int m78460d(String str) {
        int f = m78462f(str);
        if (f == -1) {
            f = m78458b(str);
        }
        if (f == -1) {
            return 6;
        }
        return f;
    }

    /* renamed from: e */
    public static boolean m78461e() {
        return f55860a >= 9;
    }

    /* renamed from: f */
    private static int m78462f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
