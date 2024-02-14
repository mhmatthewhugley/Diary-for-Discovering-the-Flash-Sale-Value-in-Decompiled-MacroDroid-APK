package com.google.android.gms.internal.p204firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbp {

    /* renamed from: a */
    private final Class f39916a;

    /* renamed from: b */
    private ConcurrentMap f39917b = new ConcurrentHashMap();

    /* renamed from: c */
    private zzbq f39918c;

    /* renamed from: d */
    private zzjc f39919d;

    /* synthetic */ zzbp(Class cls, zzbo zzbo) {
        this.f39916a = cls;
        this.f39919d = zzjc.f40202b;
    }

    /* renamed from: e */
    private final zzbp m56975e(Object obj, zzoe zzoe, boolean z) throws GeneralSecurityException {
        byte[] bArr;
        if (this.f39917b == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        } else if (zzoe.mo49679L() == 3) {
            ConcurrentMap concurrentMap = this.f39917b;
            Integer valueOf = Integer.valueOf(zzoe.mo49675C());
            if (zzoe.mo49677G() == zzoy.RAW) {
                valueOf = null;
            }
            zzaw a = zzgn.m57303b().mo49429a(zzgy.m57318a(zzoe.mo49676D().mo49659H(), zzoe.mo49676D().mo49658G(), zzoe.mo49676D().mo49657D(), zzoe.mo49677G(), valueOf), zzca.m57014a());
            int ordinal = zzoe.mo49677G().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        bArr = zzas.f39898a;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(zzoe.mo49675C()).array();
            } else {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(zzoe.mo49675C()).array();
            }
            zzbq zzbq = new zzbq(obj, bArr, zzoe.mo49679L(), zzoe.mo49677G(), zzoe.mo49675C(), a);
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzbq);
            zzbs zzbs = new zzbs(zzbq.mo49351f(), (zzbr) null);
            List list = (List) concurrentMap.put(zzbs, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(zzbq);
                concurrentMap.put(zzbs, Collections.unmodifiableList(arrayList2));
            }
            if (z) {
                if (this.f39918c == null) {
                    this.f39918c = zzbq;
                } else {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
            }
            return this;
        } else {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
    }

    /* renamed from: a */
    public final zzbp mo49342a(Object obj, zzoe zzoe) throws GeneralSecurityException {
        m56975e(obj, zzoe, true);
        return this;
    }

    /* renamed from: b */
    public final zzbp mo49343b(Object obj, zzoe zzoe) throws GeneralSecurityException {
        m56975e(obj, zzoe, false);
        return this;
    }

    /* renamed from: c */
    public final zzbp mo49344c(zzjc zzjc) {
        if (this.f39917b != null) {
            this.f39919d = zzjc;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    /* renamed from: d */
    public final zzbu mo49345d() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.f39917b;
        if (concurrentMap != null) {
            zzbu zzbu = new zzbu(concurrentMap, this.f39918c, this.f39919d, this.f39916a, (zzbt) null);
            this.f39917b = null;
            return zzbu;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
