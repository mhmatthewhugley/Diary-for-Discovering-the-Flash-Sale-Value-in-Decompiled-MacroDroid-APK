package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
abstract class zzj extends zzy {

    /* renamed from: a */
    private final int f3980a;

    protected zzj(byte[] bArr) {
        Preconditions.m4478a(bArr.length == 25);
        this.f3980a = Arrays.hashCode(bArr);
    }

    /* renamed from: A1 */
    protected static byte[] m4938A1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final int mo21835a() {
        return this.f3980a;
    }

    /* renamed from: d */
    public final IObjectWrapper mo21836d() {
        return ObjectWrapper.m5051g8(mo21975g8());
    }

    public final boolean equals(@Nullable Object obj) {
        IObjectWrapper d;
        if (obj != null && (obj instanceof zzz)) {
            try {
                zzz zzz = (zzz) obj;
                if (zzz.mo21835a() != this.f3980a || (d = zzz.mo21836d()) == null) {
                    return false;
                }
                return Arrays.equals(mo21975g8(), (byte[]) ObjectWrapper.m5050A1(d));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g8 */
    public abstract byte[] mo21975g8();

    public final int hashCode() {
        return this.f3980a;
    }
}
