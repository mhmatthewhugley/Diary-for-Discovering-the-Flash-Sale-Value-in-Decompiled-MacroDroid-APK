package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzdpx implements zzbpu {

    /* renamed from: a */
    public final /* synthetic */ zzdqb f32766a;

    public /* synthetic */ zzdpx(zzdqb zzdqb) {
        this.f32766a = zzdqb;
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        zzcmp zzcmp = (zzcmp) obj;
        zzcmp.mo44044e0().mo44085I(new zzdqa(this.f32766a, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzcmp.loadData(str, "text/html", "UTF-8");
        } else {
            zzcmp.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
