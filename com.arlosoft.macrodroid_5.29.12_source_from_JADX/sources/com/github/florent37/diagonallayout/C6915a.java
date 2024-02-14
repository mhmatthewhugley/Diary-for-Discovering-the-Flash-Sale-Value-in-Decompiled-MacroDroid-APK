package com.github.florent37.diagonallayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: com.github.florent37.diagonallayout.a */
/* compiled from: DiagonalLayoutSettings */
public class C6915a {

    /* renamed from: a */
    private float f16196a = 15.0f;

    /* renamed from: b */
    private boolean f16197b;

    /* renamed from: c */
    private boolean f16198c = false;

    /* renamed from: d */
    private boolean f16199d = false;

    /* renamed from: e */
    private float f16200e;

    C6915a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DiagonalLayout, 0, 0);
        this.f16196a = (float) obtainStyledAttributes.getInt(R$styleable.DiagonalLayout_diagonal_angle, 0);
        int i = obtainStyledAttributes.getInt(R$styleable.DiagonalLayout_diagonal_gravity, 0);
        boolean z = true;
        this.f16198c = (i & 2) == 2;
        this.f16199d = (i & 8) != 8 ? false : z;
        this.f16197b = obtainStyledAttributes.getBoolean(R$styleable.DiagonalLayout_diagonal_handleMargins, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public float mo34309a() {
        return this.f16196a;
    }

    /* renamed from: b */
    public float mo34310b() {
        return this.f16200e;
    }

    /* renamed from: c */
    public boolean mo34311c() {
        return !this.f16199d;
    }

    /* renamed from: d */
    public boolean mo34312d() {
        return !this.f16198c;
    }

    /* renamed from: e */
    public boolean mo34313e() {
        return this.f16197b;
    }

    /* renamed from: f */
    public void mo34314f(float f) {
        this.f16200e = f;
    }
}
