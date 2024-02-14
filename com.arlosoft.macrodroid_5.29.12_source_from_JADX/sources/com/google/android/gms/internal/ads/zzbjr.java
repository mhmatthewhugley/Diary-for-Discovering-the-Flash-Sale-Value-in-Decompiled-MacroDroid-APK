package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.apache.commons.p353io.FilenameUtils;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbjr {

    /* renamed from: a */
    private final List f27345a = new LinkedList();

    /* renamed from: b */
    private final Map f27346b;

    /* renamed from: c */
    private final Object f27347c;

    public zzbjr(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f27346b = linkedHashMap;
        this.f27347c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    /* renamed from: f */
    public static final zzbjo m43574f() {
        return new zzbjo(zzt.m2889b().mo21952c(), (String) null, (zzbjo) null);
    }

    /* renamed from: a */
    public final zzbjq mo42687a() {
        zzbjq zzbjq;
        boolean booleanValue = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26838D1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f27347c) {
            for (zzbjo zzbjo : this.f27345a) {
                long a = zzbjo.mo42679a();
                String c = zzbjo.mo42681c();
                zzbjo b = zzbjo.mo42680b();
                if (b != null && a > 0) {
                    sb.append(c);
                    sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                    sb.append(a - b.mo42679a());
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(b.mo42679a()))) {
                            hashMap.put(Long.valueOf(b.mo42679a()), new StringBuilder(c));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(b.mo42679a()));
                            sb2.append('+');
                            sb2.append(c);
                        }
                    }
                }
            }
            this.f27345a.clear();
            String str = null;
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append(FilenameUtils.EXTENSION_SEPARATOR);
                    sb3.append(zzt.m2889b().mo21950a() + (((Long) entry.getKey()).longValue() - zzt.m2889b().mo21952c()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbjq = new zzbjq(sb.toString(), str);
        }
        return zzbjq;
    }

    @VisibleForTesting
    /* renamed from: b */
    public final Map mo42688b() {
        Map map;
        synchronized (this.f27347c) {
            zzt.m2904q().mo43492f();
            map = this.f27346b;
        }
        return map;
    }

    /* renamed from: c */
    public final void mo42689c(@Nullable zzbjr zzbjr) {
        synchronized (this.f27347c) {
        }
    }

    /* renamed from: d */
    public final void mo42690d(String str, String str2) {
        zzbjh f;
        if (!TextUtils.isEmpty(str2) && (f = zzt.m2904q().mo43492f()) != null) {
            synchronized (this.f27347c) {
                zzbjn a = f.mo42673a(str);
                Map map = this.f27346b;
                map.put(str, a.mo42678a((String) map.get(str), str2));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo42691e(zzbjo zzbjo, long j, String... strArr) {
        synchronized (this.f27347c) {
            for (int i = 0; i <= 0; i++) {
                this.f27345a.add(new zzbjo(j, strArr[i], zzbjo));
            }
        }
        return true;
    }
}
