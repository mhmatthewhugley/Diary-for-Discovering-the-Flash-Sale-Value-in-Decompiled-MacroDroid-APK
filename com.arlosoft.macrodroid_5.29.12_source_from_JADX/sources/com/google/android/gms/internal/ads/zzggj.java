package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzggj {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map f36816a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map f36817b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map f36818c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map f36819d;

    public zzggj() {
        this.f36816a = new HashMap();
        this.f36817b = new HashMap();
        this.f36818c = new HashMap();
        this.f36819d = new HashMap();
    }

    /* renamed from: a */
    public final zzggj mo46792a(zzgfl zzgfl) throws GeneralSecurityException {
        zzggl zzggl = new zzggl(zzgfl.mo46773b(), zzgfl.mo46772a(), (zzggk) null);
        if (this.f36817b.containsKey(zzggl)) {
            zzgfl zzgfl2 = (zzgfl) this.f36817b.get(zzggl);
            if (!zzgfl2.equals(zzgfl) || !zzgfl.equals(zzgfl2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzggl.toString()));
            }
        } else {
            this.f36817b.put(zzggl, zzgfl);
        }
        return this;
    }

    /* renamed from: b */
    public final zzggj mo46793b(zzgfo zzgfo) throws GeneralSecurityException {
        zzggn zzggn = new zzggn(zzgfo.mo46774a(), zzgfo.mo46775b(), (zzggm) null);
        if (this.f36816a.containsKey(zzggn)) {
            zzgfo zzgfo2 = (zzgfo) this.f36816a.get(zzggn);
            if (!zzgfo2.equals(zzgfo) || !zzgfo.equals(zzgfo2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzggn.toString()));
            }
        } else {
            this.f36816a.put(zzggn, zzgfo);
        }
        return this;
    }

    /* renamed from: c */
    public final zzggj mo46794c(zzggb zzggb) throws GeneralSecurityException {
        zzggl zzggl = new zzggl(zzggb.mo46788b(), zzggb.mo46787a(), (zzggk) null);
        if (this.f36819d.containsKey(zzggl)) {
            zzggb zzggb2 = (zzggb) this.f36819d.get(zzggl);
            if (!zzggb2.equals(zzggb) || !zzggb.equals(zzggb2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzggl.toString()));
            }
        } else {
            this.f36819d.put(zzggl, zzggb);
        }
        return this;
    }

    /* renamed from: d */
    public final zzggj mo46795d(zzgge zzgge) throws GeneralSecurityException {
        zzggn zzggn = new zzggn(zzgge.mo46789a(), zzgge.mo46790b(), (zzggm) null);
        if (this.f36818c.containsKey(zzggn)) {
            zzgge zzgge2 = (zzgge) this.f36818c.get(zzggn);
            if (!zzgge2.equals(zzgge) || !zzgge.equals(zzgge2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzggn.toString()));
            }
        } else {
            this.f36818c.put(zzggn, zzgge);
        }
        return this;
    }

    public zzggj(zzggp zzggp) {
        this.f36816a = new HashMap(zzggp.f36824a);
        this.f36817b = new HashMap(zzggp.f36825b);
        this.f36818c = new HashMap(zzggp.f36826c);
        this.f36819d = new HashMap(zzggp.f36827d);
    }
}
