package com.arlosoft.macrodroid.triggers;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.common.C4001c1;

/* renamed from: com.arlosoft.macrodroid.triggers.c8 */
/* compiled from: TriggerInfo.kt */
public abstract class C5889c8 extends C4001c1 {

    /* renamed from: f */
    private final int f13984f;

    @ColorRes
    /* renamed from: e */
    public int mo26463e() {
        return C17528R$color.trigger_category;
    }

    @DrawableRes
    /* renamed from: h */
    public int mo26464h(boolean z) {
        return z ? C17530R$drawable.circular_icon_background_trigger_dark : C17530R$drawable.circular_icon_background_trigger;
    }

    @ColorRes
    /* renamed from: i */
    public int mo26465i(boolean z) {
        return z ? C17528R$color.trigger_primary_dark : C17528R$color.trigger_primary;
    }

    /* renamed from: j */
    public int mo26466j() {
        return this.f13984f;
    }
}
