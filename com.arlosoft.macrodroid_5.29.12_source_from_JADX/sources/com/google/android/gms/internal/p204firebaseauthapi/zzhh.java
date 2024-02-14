package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzhh {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map f40124a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map f40125b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map f40126c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map f40127d;

    /* synthetic */ zzhh(zzhb zzhb, zzhg zzhg) {
        this.f40124a = new HashMap(zzhb.f40116a);
        this.f40125b = new HashMap(zzhb.f40117b);
        this.f40126c = new HashMap(zzhb.f40118c);
        this.f40127d = new HashMap(zzhb.f40119d);
    }

    /* renamed from: a */
    public final zzaw mo49459a(zzha zzha, zzca zzca) throws GeneralSecurityException {
        zzhd zzhd = new zzhd(zzha.getClass(), zzha.mo49441d(), (zzhc) null);
        if (this.f40125b.containsKey(zzhd)) {
            return ((zzfv) this.f40125b.get(zzhd)).mo49415a(zzha, zzca);
        }
        String obj = zzhd.toString();
        throw new GeneralSecurityException("No Key Parser for requested key type " + obj + " available");
    }
}
