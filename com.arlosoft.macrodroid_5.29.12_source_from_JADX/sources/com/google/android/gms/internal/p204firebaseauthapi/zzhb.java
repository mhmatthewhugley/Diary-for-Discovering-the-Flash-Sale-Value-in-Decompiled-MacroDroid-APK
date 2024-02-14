package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzhb {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map f40116a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map f40117b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map f40118c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map f40119d;

    public zzhb() {
        this.f40116a = new HashMap();
        this.f40117b = new HashMap();
        this.f40118c = new HashMap();
        this.f40119d = new HashMap();
    }

    /* renamed from: a */
    public final zzhb mo49449a(zzfv zzfv) throws GeneralSecurityException {
        zzhd zzhd = new zzhd(zzfv.mo49418d(), zzfv.mo49417c(), (zzhc) null);
        if (this.f40117b.containsKey(zzhd)) {
            zzfv zzfv2 = (zzfv) this.f40117b.get(zzhd);
            if (!zzfv2.equals(zzfv) || !zzfv.equals(zzfv2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhd.toString()));
            }
        } else {
            this.f40117b.put(zzhd, zzfv);
        }
        return this;
    }

    /* renamed from: b */
    public final zzhb mo49450b(zzfz zzfz) throws GeneralSecurityException {
        zzhf zzhf = new zzhf(zzfz.mo49419b(), zzfz.mo49420c(), (zzhe) null);
        if (this.f40116a.containsKey(zzhf)) {
            zzfz zzfz2 = (zzfz) this.f40116a.get(zzhf);
            if (!zzfz2.equals(zzfz) || !zzfz.equals(zzfz2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhf.toString()));
            }
        } else {
            this.f40116a.put(zzhf, zzfz);
        }
        return this;
    }

    /* renamed from: c */
    public final zzhb mo49451c(zzgr zzgr) throws GeneralSecurityException {
        zzhd zzhd = new zzhd(zzgr.mo49435c(), zzgr.mo49434b(), (zzhc) null);
        if (this.f40119d.containsKey(zzhd)) {
            zzgr zzgr2 = (zzgr) this.f40119d.get(zzhd);
            if (!zzgr2.equals(zzgr) || !zzgr.equals(zzgr2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhd.toString()));
            }
        } else {
            this.f40119d.put(zzhd, zzgr);
        }
        return this;
    }

    /* renamed from: d */
    public final zzhb mo49452d(zzgv zzgv) throws GeneralSecurityException {
        zzhf zzhf = new zzhf(zzgv.mo49436b(), zzgv.mo49437c(), (zzhe) null);
        if (this.f40118c.containsKey(zzhf)) {
            zzgv zzgv2 = (zzgv) this.f40118c.get(zzhf);
            if (!zzgv2.equals(zzgv) || !zzgv.equals(zzgv2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhf.toString()));
            }
        } else {
            this.f40118c.put(zzhf, zzgv);
        }
        return this;
    }

    public zzhb(zzhh zzhh) {
        this.f40116a = new HashMap(zzhh.f40124a);
        this.f40117b = new HashMap(zzhh.f40125b);
        this.f40118c = new HashMap(zzhh.f40126c);
        this.f40119d = new HashMap(zzhh.f40127d);
    }
}
