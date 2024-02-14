package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
abstract class zzl extends zzj {

    /* renamed from: d */
    private static final WeakReference f3982d = new WeakReference((Object) null);

    /* renamed from: c */
    private WeakReference f3983c = f3982d;

    zzl(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z8 */
    public abstract byte[] mo21973Z8();

    /* access modifiers changed from: package-private */
    /* renamed from: g8 */
    public final byte[] mo21975g8() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f3983c.get();
            if (bArr == null) {
                bArr = mo21973Z8();
                this.f3983c = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
