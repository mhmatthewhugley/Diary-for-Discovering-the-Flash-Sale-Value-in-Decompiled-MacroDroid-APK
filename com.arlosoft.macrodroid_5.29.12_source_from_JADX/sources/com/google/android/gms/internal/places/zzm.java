package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.zzm;
import com.google.android.gms.internal.places.zzo;
import java.io.IOException;

public abstract class zzm<MessageType extends zzm<MessageType, BuilderType>, BuilderType extends zzo<MessageType, BuilderType>> implements zzck {
    private static boolean zzdu = false;
    protected int zzdt = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo53452g(int i) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo53453h() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: w */
    public final zzw mo53534w() {
        try {
            zzae w = zzw.m63869w(mo53446b());
            mo53449e(w.mo53308b());
            return w.mo53307a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
