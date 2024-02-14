package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcyq extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final Context f31859a;

    /* renamed from: c */
    private View f31860c;

    private zzcyq(Context context) {
        super(context);
        this.f31859a = context;
    }

    /* renamed from: a */
    public static zzcyq m47038a(Context context, View view, zzfdk zzfdk) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcyq zzcyq = new zzcyq(context);
        if (!(zzfdk.f35556v.isEmpty() || (resources = zzcyq.f31859a.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
            zzfdl zzfdl = (zzfdl) zzfdk.f35556v.get(0);
            float f = displayMetrics.density;
            zzcyq.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) zzfdl.f35561a) * f), (int) (((float) zzfdl.f35562b) * f)));
        }
        zzcyq.f31860c = view;
        zzcyq.addView(view);
        zzt.m2913z();
        zzchp.m45263b(zzcyq, zzcyq);
        zzt.m2913z();
        zzchp.m45262a(zzcyq, zzcyq);
        JSONObject jSONObject = zzfdk.f35538j0;
        RelativeLayout relativeLayout = new RelativeLayout(zzcyq.f31859a);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcyq.m47040c(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcyq.m47040c(optJSONObject2, relativeLayout, 12);
        }
        zzcyq.addView(relativeLayout);
        return zzcyq;
    }

    /* renamed from: b */
    private final int m47039b(double d) {
        zzaw.m1917b();
        return zzcgi.m45187w(this.f31859a, (int) d);
    }

    /* renamed from: c */
    private final void m47040c(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.f31859a);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int b = m47039b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, b, 0, b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, m47039b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f31860c.setY((float) (-iArr[1]));
    }

    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f31860c.setY((float) (-iArr[1]));
    }
}
