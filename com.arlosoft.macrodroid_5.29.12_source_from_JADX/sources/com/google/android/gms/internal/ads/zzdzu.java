package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdzu {

    /* renamed from: a */
    private final Context f33485a;

    /* renamed from: b */
    private final ApplicationInfo f33486b;

    /* renamed from: c */
    private final int f33487c;

    /* renamed from: d */
    private final int f33488d;

    /* renamed from: e */
    private String f33489e = "";

    public zzdzu(Context context) {
        this.f33485a = context;
        this.f33486b = context.getApplicationInfo();
        this.f33487c = ((Integer) zzay.m1924c().mo42663b(zzbjc.f26984R7)).intValue();
        this.f33488d = ((Integer) zzay.m1924c().mo42663b(zzbjc.f26994S7)).intValue();
    }

    /* renamed from: a */
    public final JSONObject mo45107a() throws JSONException {
        Drawable drawable;
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", Wrappers.m4929a(this.f33485a).mo21961d(this.f33486b.packageName));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f33486b.packageName);
        zzt.m2905r();
        jSONObject.put("adMobAppId", zzs.m2738L(this.f33485a));
        if (this.f33489e.isEmpty()) {
            try {
                drawable = (Drawable) Wrappers.m4929a(this.f33485a).mo21962e(this.f33486b.packageName).second;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                str = "";
            } else {
                drawable.setBounds(0, 0, this.f33487c, this.f33488d);
                Bitmap createBitmap = Bitmap.createBitmap(this.f33487c, this.f33488d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f33489e = str;
        }
        if (!this.f33489e.isEmpty()) {
            jSONObject.put("icon", this.f33489e);
            jSONObject.put("iconWidthPx", this.f33487c);
            jSONObject.put("iconHeightPx", this.f33488d);
        }
        return jSONObject;
    }
}
