package com.arlosoft.macrodroid.action;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.common.C4001c1;

/* renamed from: com.arlosoft.macrodroid.action.g */
/* compiled from: ActionInfo.kt */
public abstract class C3072g extends C4001c1 {

    /* renamed from: f */
    private final int f8347f = 1;

    @ColorRes
    /* renamed from: e */
    public int mo26463e() {
        return C17528R$color.actions_category;
    }

    @DrawableRes
    /* renamed from: h */
    public int mo26464h(boolean z) {
        return z ? C17530R$drawable.circular_icon_background_action_dark : C17530R$drawable.circular_icon_background_action;
    }

    @ColorRes
    /* renamed from: i */
    public int mo26465i(boolean z) {
        return z ? C17528R$color.actions_primary_dark : C17528R$color.actions_primary;
    }

    /* renamed from: j */
    public int mo26466j() {
        return this.f8347f;
    }
}
