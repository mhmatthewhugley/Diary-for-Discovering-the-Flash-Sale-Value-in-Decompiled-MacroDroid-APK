package p155r1;

import androidx.annotation.Nullable;

/* renamed from: r1.h */
/* compiled from: SendGridResponse */
public class C8192h {

    /* renamed from: a */
    private final int f19864a;

    /* renamed from: b */
    private final String f19865b;

    /* renamed from: r1.h$a */
    /* compiled from: SendGridResponse */
    static class C8193a {
        /* renamed from: a */
        static C8192h m33998a(int i, String str) {
            return C8192h.m33995b(i, C8185a.m33945a(str));
        }

        /* renamed from: b */
        static C8192h m33999b(int i) {
            return C8192h.m33995b(i, (String) null);
        }
    }

    private C8192h(int i, @Nullable String str) {
        this.f19864a = i;
        this.f19865b = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C8192h m33995b(int i, String str) {
        return new C8192h(i, str);
    }

    /* renamed from: c */
    public String mo38259c() {
        return this.f19865b;
    }

    /* renamed from: d */
    public boolean mo38260d() {
        return this.f19865b == null;
    }
}
