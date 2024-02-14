package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzaex {

    /* renamed from: a */
    public final int f24180a;

    public zzaex(int i) {
        this.f24180a = i;
    }

    /* renamed from: a */
    public static int m41221a(int i) {
        return (i >> 24) & 255;
    }

    /* renamed from: b */
    public static String m41222b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return m41222b(this.f24180a);
    }
}
