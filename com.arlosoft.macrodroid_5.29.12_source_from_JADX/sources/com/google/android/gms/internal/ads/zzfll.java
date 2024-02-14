package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import androidx.annotation.VisibleForTesting;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfll {

    /* renamed from: a */
    private static final zzfll f36062a = new zzfll();

    private zzfll() {
    }

    /* renamed from: a */
    public static final zzfll m50478a() {
        return f36062a;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: b */
    public final void mo45915b(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (r6 > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb.append("\"\"");
                    } else if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append('\"');
                            sb.append(obj2);
                            sb.append('\"');
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                webView.loadUrl(sb2);
            } else {
                handler.post(new zzflk(this, webView, sb2));
            }
        } else {
            String concat = "The WebView is null for ".concat(str);
            if (zzfko.f35989a.booleanValue() && !TextUtils.isEmpty(concat)) {
                Log.i("OMIDLIB", concat);
            }
        }
    }

    /* renamed from: c */
    public final void mo45916c(WebView webView) {
        mo45915b(webView, "finishSession", new Object[0]);
    }

    /* renamed from: d */
    public final void mo45917d(WebView webView, JSONObject jSONObject) {
        mo45915b(webView, "init", jSONObject);
    }

    /* renamed from: e */
    public final void mo45918e(WebView webView, float f) {
        mo45915b(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: f */
    public final void mo45919f(WebView webView, String str) {
        mo45915b(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: g */
    public final void mo45920g(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo45915b(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
