package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzblo extends RelativeLayout {

    /* renamed from: c */
    private static final float[] f27519c = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    @Nullable

    /* renamed from: a */
    private AnimationDrawable f27520a;

    public zzblo(Context context, zzbln zzbln, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.m4488k(zzbln);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f27519c, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(zzbln.mo42736d());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzbln.mo42738f())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzbln.mo42738f());
            textView.setTextColor(zzbln.mo42735b());
            textView.setTextSize((float) zzbln.mo42732Kb());
            zzaw.m1917b();
            int w = zzcgi.m45187w(context, 4);
            zzaw.m1917b();
            textView.setPadding(w, 0, zzcgi.m45187w(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzblq> Lb = zzbln.mo42733Lb();
        if (Lb != null && Lb.size() > 1) {
            this.f27520a = new AnimationDrawable();
            for (zzblq c : Lb) {
                try {
                    this.f27520a.addFrame((Drawable) ObjectWrapper.m5050A1(c.mo42743c()), zzbln.zzb());
                } catch (Exception e) {
                    zzcgp.m45227e("Error while getting drawable.", e);
                }
            }
            imageView.setBackground(this.f27520a);
        } else if (Lb.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) ObjectWrapper.m5050A1(((zzblq) Lb.get(0)).mo42743c()));
            } catch (Exception e2) {
                zzcgp.m45227e("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f27520a;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
