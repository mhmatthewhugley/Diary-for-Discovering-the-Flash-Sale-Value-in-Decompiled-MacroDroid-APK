package p345o7;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.p353io.IOUtils;

/* renamed from: o7.b */
/* compiled from: Headers */
public final class C15808b {

    /* renamed from: a */
    private final String[] f65217a;

    /* renamed from: o7.b$b */
    /* compiled from: Headers */
    public static final class C15810b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<String> f65218a = new ArrayList(20);

        /* renamed from: d */
        private void m95374d(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i), str}));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt2 = str2.charAt(i2);
                        if (charAt2 <= 31 || charAt2 >= 127) {
                            throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", new Object[]{Integer.valueOf(charAt2), Integer.valueOf(i2), str2}));
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("value == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C15810b mo75579b(String str, String str2) {
            this.f65218a.add(str);
            this.f65218a.add(str2.trim());
            return this;
        }

        /* renamed from: c */
        public C15808b mo75580c() {
            return new C15808b(this);
        }

        /* renamed from: e */
        public C15810b mo75581e(String str) {
            int i = 0;
            while (i < this.f65218a.size()) {
                if (str.equalsIgnoreCase(this.f65218a.get(i))) {
                    this.f65218a.remove(i);
                    this.f65218a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: f */
        public C15810b mo75582f(String str, String str2) {
            m95374d(str, str2);
            mo75581e(str);
            mo75579b(str, str2);
            return this;
        }
    }

    /* renamed from: a */
    public String mo75575a(int i) {
        int i2 = i * 2;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f65217a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    /* renamed from: b */
    public int mo75576b() {
        return this.f65217a.length / 2;
    }

    /* renamed from: c */
    public String mo75577c(int i) {
        int i2 = (i * 2) + 1;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f65217a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int b = mo75576b();
        for (int i = 0; i < b; i++) {
            sb.append(mo75575a(i));
            sb.append(": ");
            sb.append(mo75577c(i));
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }

    private C15808b(C15810b bVar) {
        this.f65217a = (String[]) bVar.f65218a.toArray(new String[bVar.f65218a.size()]);
    }
}
