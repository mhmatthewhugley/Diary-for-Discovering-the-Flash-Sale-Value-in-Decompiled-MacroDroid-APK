package com.thebluealliance.spectrum.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;
import com.thebluealliance.spectrum.R$id;
import com.thebluealliance.spectrum.R$layout;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import p222c8.C11160b;
import p222c8.C11161c;

public class ColorItem extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    private EventBus f57706a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ImageView f57707c;
    @ColorInt

    /* renamed from: d */
    private int f57708d;

    /* renamed from: f */
    private boolean f57709f;

    /* renamed from: g */
    private int f57710g;

    /* renamed from: com.thebluealliance.spectrum.internal.ColorItem$a */
    class C11771a extends AnimatorListenerAdapter {
        C11771a() {
        }

        public void onAnimationEnd(Animator animator) {
            ColorItem.this.setItemCheckmarkAttributes(1.0f);
        }
    }

    /* renamed from: com.thebluealliance.spectrum.internal.ColorItem$b */
    class C11772b extends AnimatorListenerAdapter {
        C11772b() {
        }

        public void onAnimationEnd(Animator animator) {
            ColorItem.this.f57707c.setVisibility(4);
            ColorItem.this.setItemCheckmarkAttributes(0.0f);
        }
    }

    public ColorItem(Context context, @ColorInt int i, boolean z, EventBus eventBus) {
        super(context);
        this.f57710g = 0;
        this.f57708d = i;
        this.f57709f = z;
        this.f57706a = eventBus;
        m81988o();
        setChecked(this.f57709f);
    }

    /* renamed from: d */
    private Drawable m81986d() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        int i = this.f57710g;
        if (i != 0) {
            gradientDrawable.setStroke(i, C11160b.m74921b(this.f57708d) ? -1 : ViewCompat.MEASURED_STATE_MASK);
        }
        gradientDrawable.setColor(this.f57708d);
        return gradientDrawable;
    }

    /* renamed from: f */
    private Drawable m81987f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(ViewCompat.MEASURED_STATE_MASK);
        return new RippleDrawable(ColorStateList.valueOf(C11160b.m74920a(this.f57708d)), (Drawable) null, gradientDrawable);
    }

    /* renamed from: o */
    private void m81988o() {
        m81990q();
        this.f57706a.register(this);
        setOnClickListener(this);
        LayoutInflater.from(getContext()).inflate(R$layout.color_item, this, true);
        ImageView imageView = (ImageView) findViewById(R$id.selected_checkmark);
        this.f57707c = imageView;
        imageView.setColorFilter(C11160b.m74921b(this.f57708d) ? -1 : ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: p */
    private void m81989p() {
        this.f57707c.setVisibility(this.f57709f ? 0 : 4);
        setItemCheckmarkAttributes(1.0f);
    }

    /* renamed from: q */
    private void m81990q() {
        setForeground(m81987f());
        setBackground(m81986d());
    }

    /* access modifiers changed from: private */
    public void setItemCheckmarkAttributes(float f) {
        this.f57707c.setAlpha(f);
        this.f57707c.setScaleX(f);
        this.f57707c.setScaleY(f);
    }

    public void onClick(View view) {
        this.f57706a.post(new C11161c(this.f57708d));
    }

    @Subscribe
    public void onSelectedColorChanged(C11161c cVar) {
        setChecked(cVar.mo62357a() == this.f57708d);
    }

    public void setChecked(boolean z) {
        boolean z2 = this.f57709f;
        this.f57709f = z;
        if (!z2 && z) {
            setItemCheckmarkAttributes(0.0f);
            this.f57707c.setVisibility(0);
            this.f57707c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250).setListener(new C11771a()).start();
        } else if (!z2 || z) {
            m81989p();
        } else {
            this.f57707c.setVisibility(0);
            setItemCheckmarkAttributes(1.0f);
            this.f57707c.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(250).setListener(new C11772b()).start();
        }
    }

    public void setOutlineWidth(int i) {
        this.f57710g = i;
        m81990q();
    }

    public ColorItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57709f = false;
        this.f57710g = 0;
        m81988o();
    }
}
