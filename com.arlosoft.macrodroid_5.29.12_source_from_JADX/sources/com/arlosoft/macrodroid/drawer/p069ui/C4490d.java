package com.arlosoft.macrodroid.drawer.p069ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MotionEventCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.events.CloseDrawerEvent;
import com.arlosoft.macrodroid.utils.C6362a0;
import java.util.HashSet;
import java.util.Set;
import p149q1.C8153b;
import p161s1.C10180a;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.d */
/* compiled from: DrawerItemViewHolder */
public abstract class C4490d extends RecyclerView.ViewHolder {
    @ColorInt

    /* renamed from: a */
    private int f11432a;

    /* renamed from: b */
    private Set<ImageView> f11433b = new HashSet();

    /* renamed from: c */
    private C4481a f11434c;

    /* renamed from: d */
    private C8153b f11435d;

    public C4490d(View view, C4481a aVar) {
        super(view);
        this.f11434c = aVar;
        mo28893v();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ boolean m17754B(View view) {
        C4481a aVar = this.f11434c;
        if (aVar == null) {
            return true;
        }
        aVar.mo28834b(this);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ boolean m17755C(View view, MotionEvent motionEvent) {
        C4481a aVar;
        if (MotionEventCompat.getActionMasked(motionEvent) != 0 || (aVar = this.f11434c) == null) {
            return false;
        }
        aVar.mo28833a(this);
        return false;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: A */
    public TextView[] mo28842A() {
        return new TextView[0];
    }

    @CallSuper
    /* renamed from: D */
    public void mo28843D(@NonNull C8153b bVar, boolean z) {
        this.f11435d = bVar;
    }

    /* renamed from: E */
    public void mo28847E() {
    }

    /* renamed from: F */
    public void mo28887F(@ColorInt int i) {
        this.f11432a = i;
        for (ImageView imageView : mo28845z()) {
            if (!this.f11433b.contains(imageView)) {
                mo28891J(imageView);
            }
        }
        for (TextView textColor : mo28842A()) {
            textColor.setTextColor(i);
        }
    }

    /* renamed from: G */
    public void mo28888G(ImageView imageView, C8153b bVar, int i) {
        if (bVar.getImagePackageName() == null || bVar.getImagePackageName().equals("com.arlosoft.macrodroid")) {
            this.f11433b.remove(imageView);
        } else {
            this.f11433b.add(imageView);
        }
        if (bVar.getImagePackageName() == null || !bVar.getImagePackageName().equals("UserIcon")) {
            Drawable I = C4061t1.m15960I(this.itemView.getContext(), bVar.getImagePackageName(), bVar.getImageResourceName());
            if (I != null) {
                imageView.setImageDrawable(I);
            } else {
                imageView.setImageResource(i);
            }
        } else {
            Bitmap f = C6362a0.m24600f(bVar.getImageResourceName());
            if (f != null) {
                imageView.setImageBitmap(f);
                return;
            }
            this.f11433b.remove(imageView);
            imageView.setImageResource(i);
        }
    }

    /* renamed from: H */
    public void mo28889H(ImageView imageView) {
        this.f11433b.add(imageView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo28890I(ImageView imageView) {
        mo28891J(imageView);
        imageView.setOnTouchListener(new C4487c(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo28891J(@NonNull ImageView imageView) {
        DrawableCompat.setTintList(DrawableCompat.wrap(imageView.getDrawable()).mutate(), new ColorStateList(new int[][]{new int[0]}, new int[]{this.f11432a}));
    }

    /* renamed from: K */
    public void mo28892K() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo28893v() {
        this.itemView.setOnLongClickListener(new C4484b(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo28894w() {
        C10180a.m40075a().mo80018i(new CloseDrawerEvent());
    }

    /* renamed from: x */
    public Context mo28895x() {
        return this.itemView.getContext();
    }

    /* renamed from: y */
    public C8153b mo28896y() {
        return this.f11435d;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: z */
    public ImageView[] mo28845z() {
        return new ImageView[0];
    }
}
