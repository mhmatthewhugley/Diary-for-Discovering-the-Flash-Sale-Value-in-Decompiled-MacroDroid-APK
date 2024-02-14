package com.google.android.gms.internal.nearby;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzth {

    /* renamed from: a */
    private static final zzth f45139a = new zztd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b */
    private static final zzth f45140b = new zztd("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c */
    private static final zzth f45141c = new zztg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d */
    private static final zzth f45142d = new zztg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e */
    private static final zzth f45143e = new zztc("base16()", "0123456789ABCDEF");

    zzth() {
    }

    /* renamed from: d */
    public static zzth m63061d() {
        return f45143e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo53295a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo53296b(int i);

    /* renamed from: c */
    public abstract zzth mo53297c(String str, int i);

    /* renamed from: e */
    public final String mo53303e(byte[] bArr, int i, int i2) {
        zzsg.m62989g(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(mo53296b(i2));
        try {
            mo53295a(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
