package com.google.android.gms.internal.mlkit_translate;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public abstract class zzat {

    /* renamed from: a */
    private static final zzat f43120a = new zzaq("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b */
    private static final zzat f43121b = new zzaq("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c */
    private static final zzat f43122c = new zzas("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d */
    private static final zzat f43123d = new zzas("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e */
    private static final zzat f43124e = new zzap("base16()", "0123456789ABCDEF");

    zzat() {
    }

    /* renamed from: d */
    public static zzat m61598d() {
        return f43120a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo52062a(byte[] bArr, CharSequence charSequence) throws zzar;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo52063b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public CharSequence mo52064c(CharSequence charSequence) {
        throw null;
    }

    /* renamed from: e */
    public final byte[] mo52068e(CharSequence charSequence) {
        try {
            CharSequence c = mo52064c(charSequence);
            int b = mo52063b(c.length());
            byte[] bArr = new byte[b];
            int a = mo52062a(bArr, c);
            if (a == b) {
                return bArr;
            }
            byte[] bArr2 = new byte[a];
            System.arraycopy(bArr, 0, bArr2, 0, a);
            return bArr2;
        } catch (zzar e) {
            throw new IllegalArgumentException(e);
        }
    }
}
