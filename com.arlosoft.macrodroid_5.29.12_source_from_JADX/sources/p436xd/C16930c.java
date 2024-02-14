package p436xd;

import java.io.InputStream;
import p291ie.C12517a;

/* renamed from: xd.c */
/* compiled from: PluginFileReader */
class C16930c {
    C16930c() {
    }

    /* renamed from: b */
    private static String m100051b(String str) {
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        return str.trim();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo80121a(InputStream inputStream) {
        for (String b : C12517a.m83628c(inputStream)) {
            String b2 = m100051b(b);
            if (b2.length() > 0) {
                return b2;
            }
        }
        return null;
    }
}
