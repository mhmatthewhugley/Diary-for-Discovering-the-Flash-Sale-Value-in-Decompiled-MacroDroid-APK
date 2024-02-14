package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzmb extends zzmi {

    /* renamed from: a */
    private String f43008a;

    /* renamed from: b */
    private boolean f43009b;

    /* renamed from: c */
    private int f43010c;

    /* renamed from: d */
    private byte f43011d;

    zzmb() {
    }

    /* renamed from: a */
    public final zzmi mo51969a(boolean z) {
        this.f43009b = true;
        this.f43011d = (byte) (1 | this.f43011d);
        return this;
    }

    /* renamed from: b */
    public final zzmi mo51970b(int i) {
        this.f43010c = 1;
        this.f43011d = (byte) (this.f43011d | 2);
        return this;
    }

    /* renamed from: c */
    public final zzmj mo51971c() {
        String str;
        if (this.f43011d == 3 && (str = this.f43008a) != null) {
            return new zzmd(str, this.f43009b, this.f43010c, (zzmc) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f43008a == null) {
            sb.append(" libraryName");
        }
        if ((this.f43011d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f43011d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final zzmi mo51972d(String str) {
        this.f43008a = "common";
        return this;
    }
}
