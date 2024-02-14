package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzmd extends zzmj {

    /* renamed from: a */
    private final String f43012a;

    /* renamed from: b */
    private final boolean f43013b;

    /* renamed from: c */
    private final int f43014c;

    /* synthetic */ zzmd(String str, boolean z, int i, zzmc zzmc) {
        this.f43012a = str;
        this.f43013b = z;
        this.f43014c = i;
    }

    /* renamed from: a */
    public final int mo51973a() {
        return this.f43014c;
    }

    /* renamed from: b */
    public final String mo51974b() {
        return this.f43012a;
    }

    /* renamed from: c */
    public final boolean mo51975c() {
        return this.f43013b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzmj) {
            zzmj zzmj = (zzmj) obj;
            return this.f43012a.equals(zzmj.mo51974b()) && this.f43013b == zzmj.mo51975c() && this.f43014c == zzmj.mo51973a();
        }
    }

    public final int hashCode() {
        return ((((this.f43012a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f43013b ? 1237 : 1231)) * 1000003) ^ this.f43014c;
    }

    public final String toString() {
        String str = this.f43012a;
        boolean z = this.f43013b;
        int i = this.f43014c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z + ", firelogEventType=" + i + "}";
    }
}
