package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzch;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzckp implements zzbpu {

    /* renamed from: a */
    private boolean f28782a;

    /* renamed from: b */
    private static int m45646b(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                zzaw.m1917b();
                i = zzcgi.m45187w(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zzcgp.m45229g("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (zze.m2647m()) {
            zze.m2645k("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    /* renamed from: c */
    private static void m45647c(zzcim zzcim, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcim.mo43674j(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzcgp.m45229g(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            zzcim.mo43673h(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcim.mo43670I(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcim.mo43671J(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcim.mo43676l(Integer.parseInt(str5));
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42867a(Object obj, Map map) {
        int i;
        int i2;
        int i3;
        Map map2 = map;
        zzciy zzciy = (zzciy) obj;
        Integer num = null;
        Integer valueOf = map2.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map2.get("playerId"))) : null;
        Integer v = (zzciy.mo43768x0() == null || zzciy.mo43768x0().mo43687a() == null) ? null : zzciy.mo43768x0().mo43687a().mo43683v();
        if (valueOf == null || v == null || valueOf.equals(v)) {
            String str = (String) map2.get("action");
            if (str == null) {
                zzcgp.m45229g("Action missing from video GMSG.");
                return;
            }
            if (zzcgp.m45232j(3)) {
                JSONObject jSONObject = new JSONObject(map2);
                jSONObject.remove("google.afma.Notify_dt");
                zzcgp.m45224b("Video GMSG: " + str + " " + jSONObject.toString());
            }
            if ("background".equals(str)) {
                String str2 = (String) map2.get(TypedValues.Custom.S_COLOR);
                if (TextUtils.isEmpty(str2)) {
                    zzcgp.m45229g("Color parameter missing from background video GMSG.");
                    return;
                }
                try {
                    zzciy.setBackgroundColor(Color.parseColor(str2));
                } catch (IllegalArgumentException unused) {
                    zzcgp.m45229g("Invalid color parameter in background video GMSG.");
                }
            } else if ("playerBackground".equals(str)) {
                String str3 = (String) map2.get(TypedValues.Custom.S_COLOR);
                if (TextUtils.isEmpty(str3)) {
                    zzcgp.m45229g("Color parameter missing from playerBackground video GMSG.");
                    return;
                }
                try {
                    zzciy.mo43747b0(Color.parseColor(str3));
                } catch (IllegalArgumentException unused2) {
                    zzcgp.m45229g("Invalid color parameter in playerBackground video GMSG.");
                }
            } else if ("decoderProps".equals(str)) {
                String str4 = (String) map2.get("mimeTypes");
                if (str4 == null) {
                    zzcgp.m45229g("No MIME types specified for decoder properties inspection.");
                    HashMap hashMap = new HashMap();
                    hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                    hashMap.put("error", "missingMimeTypes");
                    zzciy.mo42954y("onVideoEvent", hashMap);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                for (String str5 : str4.split(",")) {
                    hashMap2.put(str5, zzch.m2634a(str5.trim()));
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                hashMap3.put("mimeTypes", hashMap2);
                zzciy.mo42954y("onVideoEvent", hashMap3);
            } else {
                zzcin x0 = zzciy.mo43768x0();
                if (x0 == null) {
                    zzcgp.m45229g("Could not get underlay container for a video GMSG.");
                    return;
                }
                boolean equals = "new".equals(str);
                boolean equals2 = "position".equals(str);
                if (equals || equals2) {
                    Context context = zzciy.getContext();
                    int b = m45646b(context, map2, "x", 0);
                    int b2 = m45646b(context, map2, "y", 0);
                    int b3 = m45646b(context, map2, "w", -1);
                    zzbiu zzbiu = zzbjc.f27046Y2;
                    if (!((Boolean) zzay.m1924c().mo42663b(zzbiu)).booleanValue()) {
                        if (zze.m2647m()) {
                            zze.m2645k("Calculate width with original width " + b3 + ", videoHost.getVideoBoundingWidth() " + zzciy.mo43755h() + ", x " + b + ".");
                        }
                        i = Math.min(b3, zzciy.mo43755h() - b);
                    } else if (b3 == -1) {
                        i = zzciy.mo43755h();
                    } else {
                        i = Math.min(b3, zzciy.mo43755h());
                    }
                    int b4 = m45646b(context, map2, "h", -1);
                    if (!((Boolean) zzay.m1924c().mo42663b(zzbiu)).booleanValue()) {
                        if (zze.m2647m()) {
                            zze.m2645k("Calculate height with original height " + b4 + ", videoHost.getVideoBoundingHeight() " + zzciy.mo43753g() + ", y " + b2 + ".");
                        }
                        i2 = Math.min(b4, zzciy.mo43753g() - b2);
                    } else if (b4 == -1) {
                        i2 = zzciy.mo43753g();
                    } else {
                        i2 = Math.min(b4, zzciy.mo43753g());
                    }
                    int i4 = i2;
                    try {
                        i3 = Integer.parseInt((String) map2.get("player"));
                    } catch (NumberFormatException unused3) {
                        i3 = 0;
                    }
                    boolean parseBoolean = Boolean.parseBoolean((String) map2.get("spherical"));
                    if (!equals || x0.mo43687a() != null) {
                        x0.mo43688b(b, b2, i, i4);
                        return;
                    }
                    x0.mo43689c(b, b2, i, i4, i3, parseBoolean, new zzcix((String) map2.get("flags")), valueOf);
                    zzcim a = x0.mo43687a();
                    if (a != null) {
                        m45647c(a, map2);
                        return;
                    }
                    return;
                }
                zzcnl p = zzciy.mo43761p();
                if (p != null) {
                    if ("timeupdate".equals(str)) {
                        String str6 = (String) map2.get("currentTime");
                        if (str6 == null) {
                            zzcgp.m45229g("currentTime parameter missing from timeupdate video GMSG.");
                            return;
                        }
                        try {
                            p.mo44168Ob(Float.parseFloat(str6));
                            return;
                        } catch (NumberFormatException unused4) {
                            zzcgp.m45229g("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                            return;
                        }
                    } else if ("skip".equals(str)) {
                        p.mo44170u();
                        return;
                    }
                }
                zzcim a2 = x0.mo43687a();
                if (a2 == null) {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
                    zzciy.mo42954y("onVideoEvent", hashMap4);
                } else if ("click".equals(str)) {
                    Context context2 = zzciy.getContext();
                    int b5 = m45646b(context2, map2, "x", 0);
                    int b6 = m45646b(context2, map2, "y", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) b5, (float) b6, 0);
                    a2.mo43669H(obtain);
                    obtain.recycle();
                } else if ("currentTime".equals(str)) {
                    String str7 = (String) map2.get("time");
                    if (str7 == null) {
                        zzcgp.m45229g("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        a2.mo43668G((int) (Float.parseFloat(str7) * 1000.0f));
                    } catch (NumberFormatException unused5) {
                        zzcgp.m45229g("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                    }
                } else if ("hide".equals(str)) {
                    a2.setVisibility(4);
                } else if ("load".equals(str)) {
                    a2.mo43663B();
                } else if ("loadControl".equals(str)) {
                    m45647c(a2, map2);
                } else if ("muted".equals(str)) {
                    if (Boolean.parseBoolean((String) map2.get("muted"))) {
                        a2.mo43664C();
                    } else {
                        a2.mo43682r();
                    }
                } else if ("pause".equals(str)) {
                    a2.mo43666E();
                } else if ("play".equals(str)) {
                    a2.mo43667F();
                } else if ("show".equals(str)) {
                    a2.setVisibility(0);
                } else if ("src".equals(str)) {
                    String str8 = (String) map2.get("src");
                    if (map2.containsKey("periodicReportIntervalMs")) {
                        try {
                            num = Integer.valueOf(Integer.parseInt((String) map2.get("periodicReportIntervalMs")));
                        } catch (NumberFormatException unused6) {
                            zzcgp.m45229g("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map2.get("periodicReportIntervalMs"))));
                        }
                    }
                    String[] strArr = {str8};
                    String str9 = (String) map2.get("demuxed");
                    if (str9 != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(str9);
                            String[] strArr2 = new String[jSONArray.length()];
                            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                                strArr2[i5] = jSONArray.getString(i5);
                            }
                            strArr = strArr2;
                        } catch (JSONException unused7) {
                            zzcgp.m45229g("Malformed demuxed URL list for playback: ".concat(str9));
                            strArr = new String[]{str8};
                        }
                    }
                    if (num != null) {
                        zzciy.mo43744E(num.intValue());
                    }
                    a2.mo43677m(str8, strArr);
                } else if ("touchMove".equals(str)) {
                    Context context3 = zzciy.getContext();
                    a2.mo43681p((float) m45646b(context3, map2, "dx", 0), (float) m45646b(context3, map2, "dy", 0));
                    if (!this.f28782a) {
                        zzciy.mo43746K();
                        this.f28782a = true;
                    }
                } else if ("volume".equals(str)) {
                    String str10 = (String) map2.get("volume");
                    if (str10 == null) {
                        zzcgp.m45229g("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        a2.mo43679o(Float.parseFloat(str10));
                    } catch (NumberFormatException unused8) {
                        zzcgp.m45229g("Could not parse volume parameter from volume video GMSG: ".concat(str10));
                    }
                } else if ("watermark".equals(str)) {
                    a2.mo43684x();
                } else {
                    zzcgp.m45229g("Unknown video action: ".concat(str));
                }
            }
        } else {
            zzcgp.m45228f(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", new Object[]{valueOf, v}));
        }
    }
}
