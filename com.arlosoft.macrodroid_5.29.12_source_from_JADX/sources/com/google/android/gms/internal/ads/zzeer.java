package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.cookie.C16050SM;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeer implements zzfhk {

    /* renamed from: d */
    private static final Pattern f33833d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* renamed from: a */
    private final String f33834a;

    /* renamed from: b */
    private final zzfjj f33835b;

    /* renamed from: c */
    private final zzfju f33836c;

    public zzeer(String str, zzfju zzfju, zzfjj zzfjj) {
        this.f33834a = str;
        this.f33836c = zzfju;
        this.f33835b = zzfjj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo44523a(Object obj) throws Exception {
        String str;
        zzeeq zzeeq = (zzeeq) obj;
        int optInt = zzeeq.f33831a.optInt("http_timeout_millis", 60000);
        zzcbf a = zzeeq.f33832b;
        String str2 = "";
        if (a.mo43277a() == -2) {
            HashMap hashMap = new HashMap();
            if (zzeeq.f33832b.mo43284h() && !TextUtils.isEmpty(this.f33834a)) {
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26887I0)).booleanValue()) {
                    String str3 = this.f33834a;
                    if (TextUtils.isEmpty(str3)) {
                        str = str2;
                    } else {
                        Matcher matcher = f33833d.matcher(str3);
                        str = str2;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str)) {
                                        str = str.concat("; ");
                                    }
                                    str = str.concat(group);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(C16050SM.COOKIE, str);
                    }
                } else {
                    hashMap.put(C16050SM.COOKIE, this.f33834a);
                }
            }
            if (zzeeq.f33832b.mo43285i()) {
                JSONObject optJSONObject = zzeeq.f33831a.optJSONObject("pii");
                if (optJSONObject != null) {
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos", str2))) {
                        hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", str2));
                    }
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", str2))) {
                        hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", str2));
                    }
                } else {
                    zze.m2645k("DSID signal does not exist.");
                }
            }
            if (zzeeq.f33832b != null && !TextUtils.isEmpty(zzeeq.f33832b.mo43280d())) {
                str2 = zzeeq.f33832b.mo43280d();
            }
            zzfju zzfju = this.f33836c;
            zzfjj zzfjj = this.f33835b;
            zzfjj.mo45801o0(true);
            zzfju.mo45822a(zzfjj);
            return new zzeem(zzeeq.f33832b.mo43281e(), optInt, hashMap, str2.getBytes(zzfsk.f36339c), "");
        }
        zzfju zzfju2 = this.f33836c;
        zzfjj zzfjj2 = this.f33835b;
        zzfjj2.mo45801o0(false);
        zzfju2.mo45822a(zzfjj2);
        if (a.mo43277a() == 1) {
            if (a.mo43282f() != null) {
                str2 = TextUtils.join(", ", a.mo43282f());
                zzcgp.m45226d(str2);
            }
            throw new zzebh(2, "Error building request URL: ".concat(String.valueOf(str2)));
        }
        throw new zzebh(1);
    }
}
