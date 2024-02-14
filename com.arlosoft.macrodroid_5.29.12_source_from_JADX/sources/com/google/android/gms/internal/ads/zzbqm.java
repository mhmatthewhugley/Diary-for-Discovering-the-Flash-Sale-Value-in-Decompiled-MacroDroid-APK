package com.google.android.gms.internal.ads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbqm implements zzbpu {

    /* renamed from: a */
    private final Context f27660a;

    public zzbqm(Context context) {
        this.f27660a = context;
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        if (map.containsKey("text") && !TextUtils.isEmpty((CharSequence) map.get("text"))) {
            zze.m2645k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
            if (map.containsKey("title")) {
                intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
            }
            try {
                zzt.m2905r();
                zzs.m2759j(this.f27660a, intent);
            } catch (ActivityNotFoundException e) {
                zzt.m2904q().mo43503t(e, "ShareSheetGmsgHandler.onGmsg");
            }
        }
    }
}
