package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzclc implements zzbpu {
    @Nullable
    /* renamed from: b */
    private static final Integer m45672b(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            zzcgp.m45229g("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42867a(Object obj, Map map) {
        zzclb zzclb;
        zzckt zzckt;
        Map map2 = map;
        zzciy zzciy = (zzciy) obj;
        if (zzcgp.m45232j(3)) {
            JSONObject jSONObject = new JSONObject(map2);
            jSONObject.remove("google.afma.Notify_dt");
            zzcgp.m45224b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcku A = zzt.m2886A();
        if (!map2.containsKey("abort")) {
            String str = (String) map2.get("src");
            Integer b = m45672b(map2, "periodicReportIntervalMs");
            Integer b2 = m45672b(map2, "exoPlayerRenderingIntervalMs");
            Integer b3 = m45672b(map2, "exoPlayerIdleIntervalMs");
            zzcix zzcix = new zzcix((String) map2.get("flags"));
            boolean z = zzcix.f28595n;
            if (str != null) {
                String[] strArr = {str};
                String str2 = (String) map2.get("demuxed");
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            strArr2[i] = jSONArray.getString(i);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused) {
                        zzcgp.m45229g("Malformed demuxed URL list for precache: ".concat(str2));
                        strArr = null;
                    }
                }
                if (strArr == null) {
                    strArr = new String[]{str};
                }
                if (z) {
                    Iterator it = A.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zzckt = null;
                            break;
                        }
                        zzckt zzckt2 = (zzckt) it.next();
                        if (zzckt2.f28785c == zzciy && str.equals(zzckt2.mo43882e())) {
                            zzckt = zzckt2;
                            break;
                        }
                    }
                } else {
                    zzckt = A.mo43883c(zzciy);
                }
                if (zzckt != null) {
                    zzcgp.m45229g("Precache task is already running.");
                    return;
                } else if (zzciy.mo43757k() == null) {
                    zzcgp.m45229g("Precache requires a dependency provider.");
                    return;
                } else {
                    Integer b4 = m45672b(map2, "player");
                    if (b4 == null) {
                        b4 = 0;
                    }
                    if (b != null) {
                        zzciy.mo43744E(b.intValue());
                    }
                    if (b2 != null) {
                        zzciy.mo43752f0(b2.intValue());
                    }
                    if (b3 != null) {
                        zzciy.mo43765v0(b3.intValue());
                    }
                    int intValue = b4.intValue();
                    zzckn zzckn = zzciy.mo43757k().f2316b;
                    if (intValue > 0) {
                        int b0 = zzcip.m45390b0();
                        if (b0 < zzcix.f28589h) {
                            zzclb = new zzclk(zzciy, zzcix);
                        } else if (b0 < zzcix.f28583b) {
                            zzclb = new zzclh(zzciy, zzcix);
                        } else {
                            zzclb = new zzclf(zzciy);
                        }
                    } else {
                        zzclb = new zzcle(zzciy);
                    }
                    new zzckt(zzciy, zzclb, str, strArr).mo20314b();
                }
            } else {
                zzckt c = A.mo43883c(zzciy);
                if (c != null) {
                    zzclb = c.f28786d;
                } else {
                    zzcgp.m45229g("Precache must specify a source.");
                    return;
                }
            }
            Integer b5 = m45672b(map2, "minBufferMs");
            if (b5 != null) {
                zzclb.mo43903r(b5.intValue());
            }
            Integer b6 = m45672b(map2, "maxBufferMs");
            if (b6 != null) {
                zzclb.mo43902q(b6.intValue());
            }
            Integer b7 = m45672b(map2, "bufferForPlaybackMs");
            if (b7 != null) {
                zzclb.mo43900o(b7.intValue());
            }
            Integer b8 = m45672b(map2, "bufferForPlaybackAfterRebufferMs");
            if (b8 != null) {
                zzclb.mo43901p(b8.intValue());
            }
        } else if (!A.mo43886h(zzciy)) {
            zzcgp.m45229g("Precache abort but no precache task running.");
        }
    }
}
