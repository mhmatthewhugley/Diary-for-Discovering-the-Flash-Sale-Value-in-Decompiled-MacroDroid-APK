package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzegy implements zzegz {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    @androidx.annotation.Nullable
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzfkw m48820e(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L_0x0020
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0043
            if (r4 == r3) goto L_0x0040
            if (r4 == r2) goto L_0x003d
            r4 = 0
            return r4
        L_0x003d:
            com.google.android.gms.internal.ads.zzfkw r4 = com.google.android.gms.internal.ads.zzfkw.VIDEO
            return r4
        L_0x0040:
            com.google.android.gms.internal.ads.zzfkw r4 = com.google.android.gms.internal.ads.zzfkw.NATIVE_DISPLAY
            return r4
        L_0x0043:
            com.google.android.gms.internal.ads.zzfkw r4 = com.google.android.gms.internal.ads.zzfkw.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegy.m48820e(java.lang.String):com.google.android.gms.internal.ads.zzfkw");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzfky m48821f(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L_0x0020
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0044
            if (r4 == r3) goto L_0x0041
            if (r4 == r2) goto L_0x003e
            com.google.android.gms.internal.ads.zzfky r4 = com.google.android.gms.internal.ads.zzfky.UNSPECIFIED
            return r4
        L_0x003e:
            com.google.android.gms.internal.ads.zzfky r4 = com.google.android.gms.internal.ads.zzfky.ONE_PIXEL
            return r4
        L_0x0041:
            com.google.android.gms.internal.ads.zzfky r4 = com.google.android.gms.internal.ads.zzfky.DEFINED_BY_JAVASCRIPT
            return r4
        L_0x0044:
            com.google.android.gms.internal.ads.zzfky r4 = com.google.android.gms.internal.ads.zzfky.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegy.m48821f(java.lang.String):com.google.android.gms.internal.ads.zzfky");
    }

    /* renamed from: g */
    private static zzfkz m48822g(@Nullable String str) {
        if ("native".equals(str)) {
            return zzfkz.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzfkz.JAVASCRIPT;
        }
        return zzfkz.NONE;
    }

    @Nullable
    /* renamed from: a */
    public final IObjectWrapper mo45291a(String str, WebView webView, String str2, String str3, @Nullable String str4, zzehb zzehb, zzeha zzeha, @Nullable String str5) {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27126g4)).booleanValue() || !zzfkp.m50420b()) {
            return null;
        }
        zzfla a = zzfla.m50451a("Google", str);
        zzfkz g = m48822g("javascript");
        zzfkw e = m48820e(zzeha.toString());
        zzfkz zzfkz = zzfkz.NONE;
        if (g == zzfkz) {
            zzcgp.m45229g("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        } else if (e == null) {
            zzcgp.m45229g("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzeha)));
            return null;
        } else {
            zzfkz g2 = m48822g(str4);
            if (e == zzfkw.VIDEO && g2 == zzfkz) {
                zzcgp.m45229g("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                return null;
            }
            return ObjectWrapper.m5051g8(zzfkr.m50423a(zzfks.m50428a(e, m48821f(zzehb.toString()), g, g2, true), zzfkt.m50430b(a, webView, str5, "")));
        }
    }

    @Nullable
    /* renamed from: b */
    public final IObjectWrapper mo45292b(String str, WebView webView, String str2, String str3, @Nullable String str4, String str5, zzehb zzehb, zzeha zzeha, @Nullable String str6) {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27126g4)).booleanValue() || !zzfkp.m50420b()) {
            return null;
        }
        zzfla a = zzfla.m50451a(str5, str);
        zzfkz g = m48822g("javascript");
        zzfkz g2 = m48822g(str4);
        zzfkw e = m48820e(zzeha.toString());
        zzfkz zzfkz = zzfkz.NONE;
        if (g == zzfkz) {
            zzcgp.m45229g("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        } else if (e == null) {
            zzcgp.m45229g("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzeha)));
            return null;
        } else if (e == zzfkw.VIDEO && g2 == zzfkz) {
            zzcgp.m45229g("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        } else {
            return ObjectWrapper.m5051g8(zzfkr.m50423a(zzfks.m50428a(e, m48821f(zzehb.toString()), g, g2, true), zzfkt.m50431c(a, webView, str6, "")));
        }
    }

    /* renamed from: c */
    public final void mo45293c(IObjectWrapper iObjectWrapper, View view) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27126g4)).booleanValue() && zzfkp.m50420b()) {
            Object A1 = ObjectWrapper.m5050A1(iObjectWrapper);
            if (A1 instanceof zzfkr) {
                ((zzfkr) A1).mo45868d(view);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo45294d(Context context) {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27126g4)).booleanValue()) {
            zzcgp.m45229g("Omid flag is disabled");
            return false;
        } else if (zzfkp.m50420b()) {
            return true;
        } else {
            zzfkp.m50419a(context);
            return zzfkp.m50420b();
        }
    }

    /* renamed from: d0 */
    public final void mo45295d0(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27126g4)).booleanValue() && zzfkp.m50420b()) {
            Object A1 = ObjectWrapper.m5050A1(iObjectWrapper);
            if (A1 instanceof zzfkr) {
                ((zzfkr) A1).mo45869e();
            }
        }
    }
}
