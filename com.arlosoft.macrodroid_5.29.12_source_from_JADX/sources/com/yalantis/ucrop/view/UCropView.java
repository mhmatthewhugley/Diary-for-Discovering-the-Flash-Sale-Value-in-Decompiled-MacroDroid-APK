package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.yalantis.ucrop.R$id;
import com.yalantis.ucrop.R$layout;
import com.yalantis.ucrop.R$styleable;
import p368q8.C16234c;
import p368q8.C16235d;

public class UCropView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public GestureCropImageView f58076a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final OverlayView f58077c;

    /* renamed from: com.yalantis.ucrop.view.UCropView$a */
    class C11924a implements C16234c {
        C11924a() {
        }

        /* renamed from: a */
        public void mo67313a(float f) {
            UCropView.this.f58077c.setTargetAspectRatio(f);
        }
    }

    /* renamed from: com.yalantis.ucrop.view.UCropView$b */
    class C11925b implements C16235d {
        C11925b() {
        }

        /* renamed from: a */
        public void mo67314a(RectF rectF) {
            UCropView.this.f58076a.setCropRect(rectF);
        }
    }

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    private void m82275c() {
        this.f58076a.setCropBoundsChangeListener(new C11924a());
        this.f58077c.setOverlayViewChangeListener(new C11925b());
    }

    @NonNull
    public GestureCropImageView getCropImageView() {
        return this.f58076a;
    }

    @NonNull
    public OverlayView getOverlayView() {
        return this.f58077c;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public UCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R$layout.ucrop_view, this, true);
        this.f58076a = (GestureCropImageView) findViewById(R$id.image_view_crop);
        OverlayView overlayView = (OverlayView) findViewById(R$id.view_overlay);
        this.f58077c = overlayView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ucrop_UCropView);
        overlayView.mo67267g(obtainStyledAttributes);
        this.f58076a.mo67248w(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        m82275c();
    }
}
