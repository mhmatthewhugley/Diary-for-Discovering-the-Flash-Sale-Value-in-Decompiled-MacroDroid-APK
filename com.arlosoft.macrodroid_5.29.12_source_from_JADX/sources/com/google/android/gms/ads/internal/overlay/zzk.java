package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzk extends zzb {

    /* renamed from: c */
    final /* synthetic */ zzl f2097c;

    /* synthetic */ zzk(zzl zzl, zzj zzj) {
        this.f2097c = zzl;
    }

    /* renamed from: a */
    public final void mo20184a() {
        BitmapDrawable bitmapDrawable;
        Bitmap a = zzt.m2910w().mo20335a(Integer.valueOf(this.f2097c.f2111c.f2057F.f2348o));
        if (a != null) {
            zzt.m2905r();
            zzl zzl = this.f2097c;
            Activity activity = zzl.f2110a;
            zzj zzj = zzl.f2111c.f2057F;
            boolean z = zzj.f2346f;
            float f = zzj.f2347g;
            if (!z || f <= 0.0f || f > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), a);
            } else {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a, a.getWidth(), a.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), a);
                }
            }
            zzs.f2304i.post(new zzi(this, bitmapDrawable));
        }
    }
}
