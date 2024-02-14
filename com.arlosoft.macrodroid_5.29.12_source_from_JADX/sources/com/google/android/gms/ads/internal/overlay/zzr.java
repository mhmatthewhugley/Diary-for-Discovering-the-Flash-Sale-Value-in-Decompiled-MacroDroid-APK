package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.impl.C1721R;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzr extends FrameLayout implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ImageButton f2124a;

    /* renamed from: c */
    private final zzad f2125c;

    public zzr(Context context, zzq zzq, @Nullable zzad zzad) {
        super(context);
        this.f2125c = zzad;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f2124a = imageButton;
        m2474d();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzaw.m1917b();
        int w = zzcgi.m45187w(context, zzq.f2120a);
        zzaw.m1917b();
        int w2 = zzcgi.m45187w(context, 0);
        zzaw.m1917b();
        int w3 = zzcgi.m45187w(context, zzq.f2121b);
        zzaw.m1917b();
        imageButton.setPadding(w, w2, w3, zzcgi.m45187w(context, zzq.f2122c));
        imageButton.setContentDescription("Interstitial close button");
        zzaw.m1917b();
        int w4 = zzcgi.m45187w(context, zzq.f2123d + zzq.f2120a + zzq.f2121b);
        zzaw.m1917b();
        addView(imageButton, new FrameLayout.LayoutParams(w4, zzcgi.m45187w(context, zzq.f2123d + zzq.f2122c), 17));
        long longValue = ((Long) zzay.m1924c().mo42663b(zzbjc.f27026W0)).longValue();
        if (longValue > 0) {
            zzp zzp = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27035X0)).booleanValue() ? new zzp(this) : null;
            imageButton.setAlpha(0.0f);
            imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(zzp);
        }
    }

    /* renamed from: d */
    private final void m2474d() {
        String str = (String) zzay.m1924c().mo42663b(zzbjc.f27017V0);
        if (!PlatformVersion.m4901f() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.f2124a.setImageResource(17301527);
            return;
        }
        Resources d = zzt.m2904q().mo43491d();
        if (d != null) {
            Drawable drawable = null;
            try {
                if ("white".equals(str)) {
                    drawable = d.getDrawable(C1721R.C1722drawable.admob_close_button_white_circle_black_cross);
                } else if ("black".equals(str)) {
                    drawable = d.getDrawable(C1721R.C1722drawable.admob_close_button_black_circle_white_cross);
                }
            } catch (Resources.NotFoundException unused) {
                zzcgp.m45224b("Close button resource not found, falling back to default.");
            }
            if (drawable == null) {
                this.f2124a.setImageResource(17301527);
                return;
            }
            this.f2124a.setImageDrawable(drawable);
            this.f2124a.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        this.f2124a.setImageResource(17301527);
    }

    /* renamed from: b */
    public final void mo20225b(boolean z) {
        if (z) {
            this.f2124a.setVisibility(8);
            if (((Long) zzay.m1924c().mo42663b(zzbjc.f27026W0)).longValue() > 0) {
                this.f2124a.animate().cancel();
                this.f2124a.clearAnimation();
                return;
            }
            return;
        }
        this.f2124a.setVisibility(0);
    }

    public final void onClick(View view) {
        zzad zzad = this.f2125c;
        if (zzad != null) {
            zzad.mo20176A1();
        }
    }
}
