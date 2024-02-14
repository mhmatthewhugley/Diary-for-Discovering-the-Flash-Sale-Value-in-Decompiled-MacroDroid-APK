package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbye extends zzbyf implements zzbpu {

    /* renamed from: c */
    private final zzcmp f27981c;

    /* renamed from: d */
    private final Context f27982d;

    /* renamed from: e */
    private final WindowManager f27983e;

    /* renamed from: f */
    private final zzbim f27984f;

    /* renamed from: g */
    DisplayMetrics f27985g;

    /* renamed from: h */
    private float f27986h;

    /* renamed from: i */
    int f27987i = -1;

    /* renamed from: j */
    int f27988j = -1;

    /* renamed from: k */
    private int f27989k;

    /* renamed from: l */
    int f27990l = -1;

    /* renamed from: m */
    int f27991m = -1;

    /* renamed from: n */
    int f27992n = -1;

    /* renamed from: o */
    int f27993o = -1;

    public zzbye(zzcmp zzcmp, Context context, zzbim zzbim) {
        super(zzcmp, "");
        this.f27981c = zzcmp;
        this.f27982d = context;
        this.f27984f = zzbim;
        this.f27983e = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: a */
    public final /* synthetic */ void mo42867a(Object obj, Map map) {
        JSONObject jSONObject;
        zzcmp zzcmp = (zzcmp) obj;
        this.f27985g = new DisplayMetrics();
        Display defaultDisplay = this.f27983e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f27985g);
        this.f27986h = this.f27985g.density;
        this.f27989k = defaultDisplay.getRotation();
        zzaw.m1917b();
        DisplayMetrics displayMetrics = this.f27985g;
        this.f27987i = zzcgi.m45185u(displayMetrics, displayMetrics.widthPixels);
        zzaw.m1917b();
        DisplayMetrics displayMetrics2 = this.f27985g;
        this.f27988j = zzcgi.m45185u(displayMetrics2, displayMetrics2.heightPixels);
        Activity i = this.f27981c.mo43756i();
        if (i == null || i.getWindow() == null) {
            this.f27990l = this.f27987i;
            this.f27991m = this.f27988j;
        } else {
            zzt.m2905r();
            int[] n = zzs.m2763n(i);
            zzaw.m1917b();
            this.f27990l = zzcgi.m45185u(this.f27985g, n[0]);
            zzaw.m1917b();
            this.f27991m = zzcgi.m45185u(this.f27985g, n[1]);
        }
        if (this.f27981c.mo44009C().mo44186i()) {
            this.f27992n = this.f27987i;
            this.f27993o = this.f27988j;
        } else {
            this.f27981c.measure(0, 0);
        }
        mo43220e(this.f27987i, this.f27988j, this.f27990l, this.f27991m, this.f27986h, this.f27989k);
        zzbyd zzbyd = new zzbyd();
        zzbim zzbim = this.f27984f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbyd.mo43215e(zzbim.mo42642a(intent));
        zzbim zzbim2 = this.f27984f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbyd.mo43213c(zzbim2.mo42642a(intent2));
        zzbyd.mo43211a(this.f27984f.mo42643b());
        zzbyd.mo43214d(this.f27984f.mo42644c());
        zzbyd.mo43212b(true);
        boolean h = zzbyd.f27976a;
        boolean j = zzbyd.f27977b;
        boolean f = zzbyd.f27978c;
        boolean i2 = zzbyd.f27979d;
        boolean g = zzbyd.f27980e;
        zzcmp zzcmp2 = this.f27981c;
        try {
            jSONObject = new JSONObject().put("sms", h).put("tel", j).put("calendar", f).put("storePicture", i2).put("inlineVideo", g);
        } catch (JSONException e) {
            zzcgp.m45227e("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzcmp2.mo42953b("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.f27981c.getLocationOnScreen(iArr);
        mo43216h(zzaw.m1917b().mo43547c(this.f27982d, iArr[0]), zzaw.m1917b().mo43547c(this.f27982d, iArr[1]));
        if (zzcgp.m45232j(2)) {
            zzcgp.m45228f("Dispatching Ready Event.");
        }
        mo43219d(this.f27981c.mo43759m().f28446a);
    }

    /* renamed from: h */
    public final void mo43216h(int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.f27982d instanceof Activity) {
            zzt.m2905r();
            i3 = zzs.m2764o((Activity) this.f27982d)[0];
        } else {
            i3 = 0;
        }
        if (this.f27981c.mo44009C() == null || !this.f27981c.mo44009C().mo44186i()) {
            int width = this.f27981c.getWidth();
            int height = this.f27981c.getHeight();
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26956P)).booleanValue()) {
                if (width == 0) {
                    width = this.f27981c.mo44009C() != null ? this.f27981c.mo44009C().f29155c : 0;
                }
                if (height == 0) {
                    if (this.f27981c.mo44009C() != null) {
                        i4 = this.f27981c.mo44009C().f29154b;
                    }
                    this.f27992n = zzaw.m1917b().mo43547c(this.f27982d, width);
                    this.f27993o = zzaw.m1917b().mo43547c(this.f27982d, i4);
                }
            }
            i4 = height;
            this.f27992n = zzaw.m1917b().mo43547c(this.f27982d, width);
            this.f27993o = zzaw.m1917b().mo43547c(this.f27982d, i4);
        }
        mo43217b(i, i2 - i3, this.f27992n, this.f27993o);
        this.f27981c.mo44044e0().mo44117v(i, i2);
    }
}
