package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.afollestad.materialdialogs.R$dimen;
import p037m.C2007e;
import p040o.C2039a;

public class MDButton extends TextView {

    /* renamed from: a */
    private boolean f778a = false;

    /* renamed from: c */
    private C2007e f779c;

    /* renamed from: d */
    private int f780d;

    /* renamed from: f */
    private Drawable f781f;

    /* renamed from: g */
    private Drawable f782g;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m659a(context);
    }

    /* renamed from: a */
    private void m659a(Context context) {
        this.f780d = context.getResources().getDimensionPixelSize(R$dimen.md_dialog_frame_margin);
        this.f779c = C2007e.END;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16906b(boolean z, boolean z2) {
        if (this.f778a != z || z2) {
            setGravity(z ? this.f779c.mo24057b() | 16 : 17);
            setTextAlignment(z ? this.f779c.mo24058d() : 4);
            C2039a.m8450t(this, z ? this.f781f : this.f782g);
            if (z) {
                setPadding(this.f780d, getPaddingTop(), this.f780d, getPaddingBottom());
            }
            this.f778a = z;
        }
    }

    public void setAllCapsCompat(boolean z) {
        setAllCaps(z);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f782g = drawable;
        if (!this.f778a) {
            mo16906b(false, true);
        }
    }

    public void setStackedGravity(C2007e eVar) {
        this.f779c = eVar;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f781f = drawable;
        if (this.f778a) {
            mo16906b(true, true);
        }
    }

    public MDButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m659a(context);
    }
}
