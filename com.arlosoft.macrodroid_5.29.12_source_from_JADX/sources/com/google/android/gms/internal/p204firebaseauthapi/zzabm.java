package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.internal.p204firebaseauthapi.zzabl;
import com.google.android.gms.internal.p204firebaseauthapi.zzabm;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class zzabm<MessageType extends zzabm<MessageType, BuilderType>, BuilderType extends zzabl<MessageType, BuilderType>> implements zzaek {
    protected int zza = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo48858b(zzaew zzaew) {
        throw null;
    }

    /* renamed from: c */
    public final void mo48859c(OutputStream outputStream) throws IOException {
        zzacn i = zzacn.m56315i(outputStream, zzacn.m56309c(mo49083p()));
        mo49075a(i);
        i.mo48979m();
    }

    /* renamed from: l */
    public final zzacc mo48860l() {
        try {
            int p = mo49083p();
            zzacc zzacc = zzacc.f39635a;
            byte[] bArr = new byte[p];
            zzacn h = zzacn.m56314h(bArr);
            mo49075a(h);
            h.mo48994j();
            return new zzabz(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: s */
    public final byte[] mo48861s() {
        try {
            byte[] bArr = new byte[mo49083p()];
            zzacn h = zzacn.m56314h(bArr);
            mo49075a(h);
            h.mo48994j();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
