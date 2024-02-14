package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbty implements zzbsp, zzbtx {

    /* renamed from: a */
    private final zzbtx f27776a;

    /* renamed from: c */
    private final HashSet f27777c = new HashSet();

    public zzbty(zzbtx zzbtx) {
        this.f27776a = zzbtx;
    }

    /* renamed from: J0 */
    public final void mo42969J0(String str, zzbpu zzbpu) {
        this.f27776a.mo42969J0(str, zzbpu);
        this.f27777c.remove(new AbstractMap.SimpleEntry(str, zzbpu));
    }

    /* renamed from: L0 */
    public final void mo42970L0(String str, zzbpu zzbpu) {
        this.f27776a.mo42970L0(str, zzbpu);
        this.f27777c.add(new AbstractMap.SimpleEntry(str, zzbpu));
    }

    /* renamed from: a */
    public final void mo42994a() {
        Iterator it = this.f27777c.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            zze.m2645k("Unregistering eventhandler: ".concat(String.valueOf(((zzbpu) simpleEntry.getValue()).toString())));
            this.f27776a.mo42969J0((String) simpleEntry.getKey(), (zzbpu) simpleEntry.getValue());
        }
        this.f27777c.clear();
    }

    /* renamed from: b */
    public final /* synthetic */ void mo42953b(String str, JSONObject jSONObject) {
        zzbso.m44054b(this, str, jSONObject);
    }

    /* renamed from: d1 */
    public final /* synthetic */ void mo42972d1(String str, JSONObject jSONObject) {
        zzbso.m44056d(this, str, jSONObject);
    }

    /* renamed from: o */
    public final void mo42955o(String str) {
        this.f27776a.mo42955o(str);
    }

    /* renamed from: q */
    public final /* synthetic */ void mo42956q(String str, String str2) {
        zzbso.m44055c(this, str, str2);
    }

    /* renamed from: y */
    public final /* synthetic */ void mo42954y(String str, Map map) {
        zzbso.m44053a(this, str, map);
    }
}
