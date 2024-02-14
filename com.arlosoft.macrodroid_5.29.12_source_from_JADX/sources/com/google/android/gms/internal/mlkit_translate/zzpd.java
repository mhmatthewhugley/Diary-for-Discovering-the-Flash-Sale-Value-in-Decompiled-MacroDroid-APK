package com.google.android.gms.internal.mlkit_translate;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzpd extends zzpk {

    /* renamed from: a */
    private String f44398a;

    /* renamed from: b */
    private boolean f44399b;

    /* renamed from: c */
    private int f44400c;

    /* renamed from: d */
    private byte f44401d;

    zzpd() {
    }

    /* renamed from: a */
    public final zzpk mo52403a(boolean z) {
        this.f44399b = true;
        this.f44401d = (byte) (1 | this.f44401d);
        return this;
    }

    /* renamed from: b */
    public final zzpk mo52404b(int i) {
        this.f44400c = 1;
        this.f44401d = (byte) (this.f44401d | 2);
        return this;
    }

    /* renamed from: c */
    public final zzpl mo52405c() {
        String str;
        if (this.f44401d == 3 && (str = this.f44398a) != null) {
            return new zzpf(str, this.f44399b, this.f44400c, (zzpe) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f44398a == null) {
            sb.append(" libraryName");
        }
        if ((this.f44401d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f44401d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final zzpk mo52406d(String str) {
        this.f44398a = str;
        return this;
    }
}
