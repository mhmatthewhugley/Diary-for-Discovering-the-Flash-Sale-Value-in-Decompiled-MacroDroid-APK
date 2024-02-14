package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzio;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class zzio<MessageType extends zzio<MessageType, BuilderType>, BuilderType extends zzin<MessageType, BuilderType>> implements zzlm {
    protected int zzb = 0;

    /* renamed from: g */
    protected static void m60316g(Iterable iterable, List list) {
        zzkn.m60542e(iterable);
        if (iterable instanceof zzku) {
            List e = ((zzku) iterable).mo51481e();
            zzku zzku = (zzku) list;
            int size = list.size();
            for (Object next : e) {
                if (next == null) {
                    int size2 = zzku.size();
                    String str = "Element at index " + (size2 - size) + " is null.";
                    int size3 = zzku.size();
                    while (true) {
                        size3--;
                        if (size3 >= size) {
                            zzku.remove(size3);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (next instanceof zzje) {
                    zzku.mo51478X1((zzje) next);
                } else {
                    zzku.add((String) next);
                }
            }
        } else if (!(iterable instanceof zzlt)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    int size5 = list.size();
                    String str2 = "Element at index " + (size5 - size4) + " is null.";
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 >= size4) {
                            list.remove(size6);
                        } else {
                            throw new NullPointerException(str2);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    /* renamed from: c */
    public final zzje mo51304c() {
        try {
            int d = mo51448d();
            zzje zzje = zzje.f41539a;
            byte[] bArr = new byte[d];
            zzjm c = zzjm.m60398c(bArr);
            mo51446a(c);
            c.mo51370d();
            return new zzjb(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo51305f(zzlx zzlx) {
        throw null;
    }

    /* renamed from: h */
    public final byte[] mo51306h() {
        try {
            byte[] bArr = new byte[mo51448d()];
            zzjm c = zzjm.m60398c(bArr);
            mo51446a(c);
            c.mo51370d();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
