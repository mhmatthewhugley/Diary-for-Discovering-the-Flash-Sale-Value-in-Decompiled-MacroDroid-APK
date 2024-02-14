package com.google.android.gms.ads.nonagon.signalgeneration;

import android.webkit.ValueCallback;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzcgp;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzap extends QueryInfoGenerationCallback {

    /* renamed from: a */
    final /* synthetic */ String f2531a;

    /* renamed from: b */
    final /* synthetic */ TaggingLibraryJsInterface f2532b;

    zzap(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.f2532b = taggingLibraryJsInterface;
        this.f2531a = str;
    }

    /* renamed from: a */
    public final void mo20678a(String str) {
        zzcgp.m45229g("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        this.f2532b.f2461b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", new Object[]{this.f2531a, str}), (ValueCallback) null);
    }

    /* renamed from: b */
    public final void mo20679b(QueryInfo queryInfo) {
        String str;
        String b = queryInfo.mo20703b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f2531a);
            jSONObject.put("signal", b);
            str = String.format("window.postMessage(%1$s, '*');", new Object[]{jSONObject});
        } catch (JSONException unused) {
            str = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", new Object[]{this.f2531a, queryInfo.mo20703b()});
        }
        this.f2532b.f2461b.evaluateJavascript(str, (ValueCallback) null);
    }
}
