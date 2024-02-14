package com.arlosoft.macrodroid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;

/* compiled from: BetterCheckBox.kt */
public final class BetterCheckBox extends AppCompatCheckBox {

    /* renamed from: a */
    private CompoundButton.OnCheckedChangeListener f15379a;

    /* renamed from: c */
    public Map<Integer, View> f15380c = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BetterCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C13706o.m87929f(context, "context");
    }

    /* renamed from: b */
    public final void mo32876b(boolean z, boolean z2) {
        if (!z2) {
            super.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            super.setChecked(z);
            super.setOnCheckedChangeListener(this.f15379a);
            return;
        }
        super.setChecked(z);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f15379a = onCheckedChangeListener;
        super.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BetterCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13706o.m87929f(context, "context");
    }
}
