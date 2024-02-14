package com.arlosoft.macrodroid.constraint;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.common.C4001c1;

/* renamed from: com.arlosoft.macrodroid.constraint.b0 */
/* compiled from: ConstraintInfo.kt */
public abstract class C4227b0 extends C4001c1 {

    /* renamed from: f */
    private final int f10794f = 2;

    @ColorRes
    /* renamed from: e */
    public int mo26463e() {
        return C17528R$color.constraints_category;
    }

    @DrawableRes
    /* renamed from: h */
    public int mo26464h(boolean z) {
        return z ? C17530R$drawable.circular_icon_background_constraint_dark : C17530R$drawable.circular_icon_background_constraint;
    }

    @ColorRes
    /* renamed from: i */
    public int mo26465i(boolean z) {
        return z ? C17528R$color.constraints_primary_dark : C17528R$color.constraints_primary;
    }

    /* renamed from: j */
    public int mo26466j() {
        return this.f10794f;
    }
}
