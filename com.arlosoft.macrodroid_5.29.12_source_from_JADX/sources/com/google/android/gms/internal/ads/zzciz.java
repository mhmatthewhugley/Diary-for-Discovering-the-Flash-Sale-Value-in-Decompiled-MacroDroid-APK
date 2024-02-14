package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbc;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzk;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzciz {

    /* renamed from: a */
    private final Context f28599a;

    /* renamed from: b */
    private final String f28600b;

    /* renamed from: c */
    private final zzcgv f28601c;
    @Nullable

    /* renamed from: d */
    private final zzbjo f28602d;
    @Nullable

    /* renamed from: e */
    private final zzbjr f28603e;

    /* renamed from: f */
    private final zzbf f28604f;

    /* renamed from: g */
    private final long[] f28605g;

    /* renamed from: h */
    private final String[] f28606h;

    /* renamed from: i */
    private boolean f28607i = false;

    /* renamed from: j */
    private boolean f28608j = false;

    /* renamed from: k */
    private boolean f28609k = false;

    /* renamed from: l */
    private boolean f28610l = false;

    /* renamed from: m */
    private boolean f28611m;

    /* renamed from: n */
    private zzcie f28612n;

    /* renamed from: o */
    private boolean f28613o;

    /* renamed from: p */
    private boolean f28614p;

    /* renamed from: q */
    private long f28615q = -1;

    public zzciz(Context context, zzcgv zzcgv, String str, @Nullable zzbjr zzbjr, @Nullable zzbjo zzbjo) {
        zzbd zzbd = new zzbd();
        zzbd zzbd2 = zzbd;
        zzbd2.mo20320a("min_1", Double.MIN_VALUE, 1.0d);
        zzbd2.mo20320a("1_5", 1.0d, 5.0d);
        zzbd2.mo20320a("5_10", 5.0d, 10.0d);
        zzbd2.mo20320a("10_20", 10.0d, 20.0d);
        zzbd2.mo20320a("20_30", 20.0d, 30.0d);
        zzbd2.mo20320a("30_max", 30.0d, Double.MAX_VALUE);
        this.f28604f = zzbd.mo20321b();
        this.f28599a = context;
        this.f28601c = zzcgv;
        this.f28600b = str;
        this.f28603e = zzbjr;
        this.f28602d = zzbjo;
        String str2 = (String) zzay.m1924c().mo42663b(zzbjc.f27301y);
        if (str2 == null) {
            this.f28606h = new String[0];
            this.f28605g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f28606h = new String[length];
        this.f28605g = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f28605g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                zzcgp.m45230h("Unable to parse frame hash target time number.", e);
                this.f28605g[i] = -1;
            }
        }
    }

    /* renamed from: a */
    public final void mo43770a(zzcie zzcie) {
        zzbjj.m43560a(this.f28603e, this.f28602d, "vpc2");
        this.f28607i = true;
        this.f28603e.mo42690d("vpn", zzcie.mo43629q());
        this.f28612n = zzcie;
    }

    /* renamed from: b */
    public final void mo43771b() {
        if (this.f28607i && !this.f28608j) {
            zzbjj.m43560a(this.f28603e, this.f28602d, "vfr2");
            this.f28608j = true;
        }
    }

    /* renamed from: c */
    public final void mo43772c() {
        this.f28611m = true;
        if (this.f28608j && !this.f28609k) {
            zzbjj.m43560a(this.f28603e, this.f28602d, "vfp2");
            this.f28609k = true;
        }
    }

    /* renamed from: d */
    public final void mo43773d() {
        if (((Boolean) zzblg.f27502a.mo42728e()).booleanValue() && !this.f28613o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f28600b);
            bundle.putString("player", this.f28612n.mo43629q());
            for (zzbc zzbc : this.f28604f.mo20322a()) {
                bundle.putString("fps_c_".concat(String.valueOf(zzbc.f2202a)), Integer.toString(zzbc.f2206e));
                bundle.putString("fps_p_".concat(String.valueOf(zzbc.f2202a)), Double.toString(zzbc.f2205d));
            }
            int i = 0;
            while (true) {
                long[] jArr = this.f28605g;
                if (i < jArr.length) {
                    String str = this.f28606h[i];
                    if (str != null) {
                        bundle.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str);
                    }
                    i++;
                } else {
                    zzt.m2905r();
                    Context context = this.f28599a;
                    String str2 = this.f28601c.f28446a;
                    zzt.m2905r();
                    bundle.putString("device", zzs.m2740N());
                    bundle.putString("eids", TextUtils.join(",", zzbjc.m43540a()));
                    zzaw.m1917b();
                    zzcgi.m45186v(context, str2, "gmob-apps", bundle, true, new zzk(context, str2));
                    this.f28613o = true;
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo43774e() {
        this.f28611m = false;
    }

    /* renamed from: f */
    public final void mo43775f(zzcie zzcie) {
        if (this.f28609k && !this.f28610l) {
            if (zze.m2647m() && !this.f28610l) {
                zze.m2645k("VideoMetricsMixin first frame");
            }
            zzbjj.m43560a(this.f28603e, this.f28602d, "vff2");
            this.f28610l = true;
        }
        long b = zzt.m2889b().mo21951b();
        if (this.f28611m && this.f28614p && this.f28615q != -1) {
            this.f28604f.mo20323b(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (b - this.f28615q)));
        }
        this.f28614p = this.f28611m;
        this.f28615q = b;
        long longValue = ((Long) zzay.m1924c().mo42663b(zzbjc.f27311z)).longValue();
        long h = (long) zzcie.mo43608h();
        int i = 0;
        while (true) {
            String[] strArr = this.f28606h;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > Math.abs(h - this.f28605g[i])) {
                String[] strArr2 = this.f28606h;
                int i2 = 8;
                Bitmap bitmap = zzcie.getBitmap(8, 8);
                long j = 63;
                long j2 = 0;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j);
                        i4++;
                        j--;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
            zzcie zzcie2 = zzcie;
            i++;
        }
    }
}
