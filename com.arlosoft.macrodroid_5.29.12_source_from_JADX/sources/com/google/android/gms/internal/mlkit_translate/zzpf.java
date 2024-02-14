package com.google.android.gms.internal.mlkit_translate;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzpf extends zzpl {

    /* renamed from: a */
    private final String f44402a;

    /* renamed from: b */
    private final boolean f44403b;

    /* renamed from: c */
    private final int f44404c;

    /* synthetic */ zzpf(String str, boolean z, int i, zzpe zzpe) {
        this.f44402a = str;
        this.f44403b = z;
        this.f44404c = i;
    }

    /* renamed from: a */
    public final int mo52407a() {
        return this.f44404c;
    }

    /* renamed from: b */
    public final String mo52408b() {
        return this.f44402a;
    }

    /* renamed from: c */
    public final boolean mo52409c() {
        return this.f44403b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzpl) {
            zzpl zzpl = (zzpl) obj;
            return this.f44402a.equals(zzpl.mo52408b()) && this.f44403b == zzpl.mo52409c() && this.f44404c == zzpl.mo52407a();
        }
    }

    public final int hashCode() {
        return ((((this.f44402a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f44403b ? 1237 : 1231)) * 1000003) ^ this.f44404c;
    }

    public final String toString() {
        String str = this.f44402a;
        boolean z = this.f44403b;
        int i = this.f44404c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z + ", firelogEventType=" + i + "}";
    }
}
