package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaj {
    @Nullable

    /* renamed from: a */
    private String f24813a;
    @Nullable

    /* renamed from: b */
    private Uri f24814b;

    /* renamed from: c */
    private final zzal f24815c = new zzal();

    /* renamed from: d */
    private final zzar f24816d = new zzar((zzaq) null);

    /* renamed from: e */
    private final List f24817e = Collections.emptyList();

    /* renamed from: f */
    private final zzfvn f24818f = zzfvn.m51135w();

    /* renamed from: g */
    private final zzau f24819g = new zzau();

    /* renamed from: h */
    private final zzbd f24820h = zzbd.f26639c;

    /* renamed from: a */
    public final zzaj mo41523a(String str) {
        this.f24813a = str;
        return this;
    }

    /* renamed from: b */
    public final zzaj mo41524b(@Nullable Uri uri) {
        this.f24814b = uri;
        return this;
    }

    /* renamed from: c */
    public final zzbg mo41525c() {
        Uri uri = this.f24814b;
        zzba zzba = uri != null ? new zzba(uri, (String) null, (zzas) null, (zzai) null, this.f24817e, (String) null, this.f24818f, (Object) null, (zzaz) null) : null;
        String str = this.f24813a;
        if (str == null) {
            str = "";
        }
        return new zzbg(str, new zzap(this.f24815c, (zzao) null), zzba, new zzaw(this.f24819g), zzbm.f27537v, this.f24820h, (zzbf) null);
    }
}
