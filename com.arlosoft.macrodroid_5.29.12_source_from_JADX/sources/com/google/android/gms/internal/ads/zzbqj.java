package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.p353io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbqj implements zzbpu {

    /* renamed from: a */
    private final Object f27657a = new Object();

    /* renamed from: b */
    private final Map f27658b = new HashMap();

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        String str;
        String str2 = (String) map.get("id");
        String str3 = (String) map.get("fail");
        String str4 = (String) map.get("fail_reason");
        String str5 = (String) map.get("fail_stack");
        String str6 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            str = IOUtils.LINE_SEPARATOR_UNIX.concat(String.valueOf(str5));
        }
        synchronized (this.f27657a) {
            zzbqi zzbqi = (zzbqi) this.f27658b.remove(str2);
            if (zzbqi == null) {
                zzcgp.m45229g("Received result for unexpected method invocation: " + str2);
            } else if (!TextUtils.isEmpty(str3)) {
                zzbqi.mo42886o(str4 + str);
            } else if (str6 == null) {
                zzbqi.mo42885a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (zze.m2647m()) {
                        String jSONObject2 = jSONObject.toString(2);
                        zze.m2645k("Result GMSG: " + jSONObject2);
                    }
                    zzbqi.mo42885a(jSONObject);
                } catch (JSONException e) {
                    zzbqi.mo42886o(e.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    public final zzfzp mo42887b(zzbta zzbta, String str, JSONObject jSONObject) {
        zzchh zzchh = new zzchh();
        zzt.m2905r();
        String uuid = UUID.randomUUID().toString();
        mo42888c(uuid, new zzbqh(this, zzchh));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzbta.mo42972d1(str, jSONObject2);
        } catch (Exception e) {
            zzchh.mo43575d(e);
        }
        return zzchh;
    }

    /* renamed from: c */
    public final void mo42888c(String str, zzbqi zzbqi) {
        synchronized (this.f27657a) {
            this.f27658b.put(str, zzbqi);
        }
    }
}
