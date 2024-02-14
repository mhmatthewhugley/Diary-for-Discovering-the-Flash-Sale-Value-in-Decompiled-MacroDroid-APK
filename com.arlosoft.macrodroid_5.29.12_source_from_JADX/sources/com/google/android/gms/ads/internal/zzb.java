package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcdq;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzb {

    /* renamed from: a */
    private final Context f2317a;

    /* renamed from: b */
    private boolean f2318b;
    @Nullable

    /* renamed from: c */
    private final zzcdq f2319c;

    /* renamed from: d */
    private final zzcaq f2320d = new zzcaq(false, Collections.emptyList());

    public zzb(Context context, @Nullable zzcdq zzcdq, @Nullable zzcaq zzcaq) {
        this.f2317a = context;
        this.f2319c = zzcdq;
    }

    /* renamed from: d */
    private final boolean m2796d() {
        zzcdq zzcdq = this.f2319c;
        return (zzcdq != null && zzcdq.zza().f28254o) || this.f2320d.f28113a;
    }

    /* renamed from: a */
    public final void mo20414a() {
        this.f2318b = true;
    }

    /* renamed from: b */
    public final void mo20415b(@Nullable String str) {
        List<String> list;
        if (m2796d()) {
            if (str == null) {
                str = "";
            }
            zzcdq zzcdq = this.f2319c;
            if (zzcdq != null) {
                zzcdq.mo43393a(str, (Map) null, 3);
                return;
            }
            zzcaq zzcaq = this.f2320d;
            if (zzcaq.f28113a && (list = zzcaq.f28114c) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzt.m2905r();
                        zzs.m2757h(this.f2317a, "", replace);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo20416c() {
        return !m2796d() || this.f2318b;
    }
}
