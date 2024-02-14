package com.google.android.gms.location.places.internal;

import android.util.Log;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.places.zzbk;
import com.google.android.gms.internal.places.zzl;
import java.util.List;

public class zzaw extends DataBufferRef {
    public zzaw(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: k */
    private final byte[] m64743k(String str, byte[] bArr) {
        if (!mo21558e(str) || mo21560f(str)) {
            return null;
        }
        return mo21554a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final float mo54310h(String str, float f) {
        return (!mo21558e(str) || mo21560f(str)) ? f : mo21555b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo54311i(String str, String str2) {
        return (!mo21558e(str) || mo21560f(str)) ? str2 : mo21557d(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final List<Integer> mo54312j(String str, List<Integer> list) {
        byte[] k = m64743k(str, (byte[]) null);
        if (k == null) {
            return list;
        }
        try {
            zzl t = zzl.m63823t(k);
            return t.mo53663v() == 0 ? list : t.mo53662u();
        } catch (zzbk e) {
            if (Log.isLoggable("SafeDataBufferRef", 6)) {
                Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            }
            return list;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo54313l(String str, int i) {
        return (!mo21558e(str) || mo21560f(str)) ? i : mo21556c(str);
    }
}
