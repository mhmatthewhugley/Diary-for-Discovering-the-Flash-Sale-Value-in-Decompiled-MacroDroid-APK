package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcum implements zzctw {

    /* renamed from: a */
    private final CookieManager f31590a;

    public zzcum(Context context) {
        this.f31590a = zzt.m2906s().mo20247b(context);
    }

    /* renamed from: a */
    public final void mo44375a(Map map) {
        if (this.f31590a != null) {
            if (((String) map.get("clear")) != null) {
                String str = (String) zzay.m1924c().mo42663b(zzbjc.f26877H0);
                String cookie = this.f31590a.getCookie(str);
                if (cookie != null) {
                    List f = zzftk.m50964c(zzfsj.m50923c(';')).mo46185f(cookie);
                    int i = 0;
                    while (i < f.size()) {
                        CookieManager cookieManager = this.f31590a;
                        Iterator it = zzftk.m50964c(zzfsj.m50923c('=')).mo46184d((String) f.get(i)).iterator();
                        Objects.requireNonNull(it);
                        if (it.hasNext()) {
                            cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) zzay.m1924c().mo42663b(zzbjc.f27262u0))));
                            i++;
                        } else {
                            throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (" + 0 + ")");
                        }
                    }
                    return;
                }
                return;
            }
            String str2 = (String) map.get("cookie");
            if (!TextUtils.isEmpty(str2)) {
                this.f31590a.setCookie((String) zzay.m1924c().mo42663b(zzbjc.f26877H0), str2);
            }
        }
    }
}
