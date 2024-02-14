package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgbn {

    /* renamed from: a */
    private final Class f36649a;

    /* renamed from: b */
    private ConcurrentMap f36650b = new ConcurrentHashMap();

    /* renamed from: c */
    private zzgbo f36651c;

    /* renamed from: d */
    private zzghm f36652d;

    /* synthetic */ zzgbn(Class cls, zzgbm zzgbm) {
        this.f36649a = cls;
        this.f36652d = zzghm.f36847b;
    }

    /* renamed from: e */
    private final zzgbn m51542e(Object obj, zzgmj zzgmj, boolean z) throws GeneralSecurityException {
        byte[] bArr;
        if (this.f36650b == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        } else if (zzgmj.mo46995M() == 3) {
            zzgbs zzgbs = new zzgbs(zzgmj.mo46993G().mo46972J(), zzgmj.mo46996N(), (zzgbr) null);
            int N = zzgmj.mo46996N() - 2;
            if (N != 1) {
                if (N != 2) {
                    if (N == 3) {
                        bArr = zzgap.f36622a;
                    } else if (N != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgmj.mo46992F()).array();
            } else {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgmj.mo46992F()).array();
            }
            zzgbo zzgbo = new zzgbo(obj, bArr, zzgmj.mo46995M(), zzgmj.mo46996N(), zzgmj.mo46992F(), zzgbs);
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzgbo);
            zzgbq zzgbq = new zzgbq(zzgbo.mo46702d(), (zzgbp) null);
            List list = (List) this.f36650b.put(zzgbq, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(zzgbo);
                this.f36650b.put(zzgbq, Collections.unmodifiableList(arrayList2));
            }
            if (z) {
                if (this.f36651c == null) {
                    this.f36651c = zzgbo;
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
    public final zzgbn mo46695a(Object obj, zzgmj zzgmj) throws GeneralSecurityException {
        m51542e(obj, zzgmj, true);
        return this;
    }

    /* renamed from: b */
    public final zzgbn mo46696b(Object obj, zzgmj zzgmj) throws GeneralSecurityException {
        m51542e(obj, zzgmj, false);
        return this;
    }

    /* renamed from: c */
    public final zzgbn mo46697c(zzghm zzghm) {
        if (this.f36650b != null) {
            this.f36652d = zzghm;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    /* renamed from: d */
    public final zzgbu mo46698d() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.f36650b;
        if (concurrentMap != null) {
            zzgbu zzgbu = new zzgbu(concurrentMap, this.f36651c, this.f36652d, this.f36649a, (zzgbt) null);
            this.f36650b = null;
            return zzgbu;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
