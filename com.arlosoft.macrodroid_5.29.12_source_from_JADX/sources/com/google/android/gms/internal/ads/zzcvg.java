package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcvg implements zzbud {

    /* renamed from: a */
    private final Context f31652a;

    /* renamed from: b */
    private final zzbbm f31653b;

    /* renamed from: c */
    private final PowerManager f31654c;

    public zzcvg(Context context, zzbbm zzbbm) {
        this.f31652a = context;
        this.f31653b = zzbbm;
        this.f31654c = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: a */
    public final JSONObject mo42999c(zzcvj zzcvj) throws JSONException {
        JSONObject jSONObject;
        Integer num;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbbp zzbbp = zzcvj.f31664f;
        if (zzbbp == null) {
            jSONObject = new JSONObject();
        } else if (this.f31653b.mo42392d() != null) {
            boolean z = zzbbp.f26520a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f31653b.mo42390b()).put("activeViewJSON", this.f31653b.mo42392d()).put("timestamp", zzcvj.f31662d).put("adFormat", this.f31653b.mo42389a()).put("hashCode", this.f31653b.mo42391c()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcvj.f31660b).put("isNative", this.f31653b.mo42393e()).put("isScreenOn", this.f31654c.isInteractive()).put("appMuted", zzt.m2907t().mo20259e()).put("appVolume", (double) zzt.m2907t().mo20256a()).put("deviceVolume", (double) zzab.m2520b(this.f31652a.getApplicationContext()));
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26941N4)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.f31652a.getApplicationContext().getSystemService("audio");
                if (audioManager == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(audioManager.getMode());
                }
                if (num != null) {
                    jSONObject3.put("audioMode", num);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f31652a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzbbp.f26521b).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzbbp.f26522c.top).put("bottom", zzbbp.f26522c.bottom).put("left", zzbbp.f26522c.left).put("right", zzbbp.f26522c.right)).put("adBox", new JSONObject().put("top", zzbbp.f26523d.top).put("bottom", zzbbp.f26523d.bottom).put("left", zzbbp.f26523d.left).put("right", zzbbp.f26523d.right)).put("globalVisibleBox", new JSONObject().put("top", zzbbp.f26524e.top).put("bottom", zzbbp.f26524e.bottom).put("left", zzbbp.f26524e.left).put("right", zzbbp.f26524e.right)).put("globalVisibleBoxVisible", zzbbp.f26525f).put("localVisibleBox", new JSONObject().put("top", zzbbp.f26526g.top).put("bottom", zzbbp.f26526g.bottom).put("left", zzbbp.f26526g.left).put("right", zzbbp.f26526g.right)).put("localVisibleBoxVisible", zzbbp.f26527h).put("hitBox", new JSONObject().put("top", zzbbp.f26528i.top).put("bottom", zzbbp.f26528i.bottom).put("left", zzbbp.f26528i.left).put("right", zzbbp.f26528i.right)).put("screenDensity", (double) this.f31652a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcvj.f31659a);
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27143i1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbbp.f26530k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcvj.f31663e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
