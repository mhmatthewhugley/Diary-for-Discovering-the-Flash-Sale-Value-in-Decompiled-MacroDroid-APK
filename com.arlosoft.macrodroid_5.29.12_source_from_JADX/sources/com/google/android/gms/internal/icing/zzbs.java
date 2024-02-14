package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbr;
import com.google.android.gms.internal.icing.zzbs;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public abstract class zzbs<MessageType extends zzbs<MessageType, BuilderType>, BuilderType extends zzbr<MessageType, BuilderType>> implements zzee {
    protected int zza = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo50183b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo50184c(int i) {
        throw null;
    }

    /* renamed from: f */
    public final zzcf mo50185f() {
        try {
            int l = mo50312l();
            zzcf zzcf = zzcf.f40792a;
            byte[] bArr = new byte[l];
            zzcm x = zzcm.m58707x(bArr);
            mo50309a(x);
            x.mo50247c();
            return new zzcd(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
