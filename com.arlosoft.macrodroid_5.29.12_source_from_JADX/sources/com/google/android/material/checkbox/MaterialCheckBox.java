package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.C10462R;
import com.google.android.material.color.MaterialColors;

public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: d */
    private static final int f48963d = C10462R.style.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: f */
    private static final int[][] f48964f = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @Nullable

    /* renamed from: a */
    private ColorStateList f48965a;

    /* renamed from: c */
    private boolean f48966c;

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.checkboxStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f48965a == null) {
            int[][] iArr = f48964f;
            int[] iArr2 = new int[iArr.length];
            int d = MaterialColors.m68104d(this, C10462R.attr.colorControlActivated);
            int d2 = MaterialColors.m68104d(this, C10462R.attr.colorSurface);
            int d3 = MaterialColors.m68104d(this, C10462R.attr.colorOnSurface);
            iArr2[0] = MaterialColors.m68108h(d2, d, 1.0f);
            iArr2[1] = MaterialColors.m68108h(d2, d3, 0.54f);
            iArr2[2] = MaterialColors.m68108h(d2, d3, 0.38f);
            iArr2[3] = MaterialColors.m68108h(d2, d3, 0.38f);
            this.f48965a = new ColorStateList(iArr, iArr2);
        }
        return this.f48965a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f48966c && CompoundButtonCompat.getButtonTintList(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f48966c = z;
        if (z) {
            CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.setButtonTintList(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCheckBox(android.content.Context r8, @androidx.annotation.Nullable android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f48963d
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.C10462R.styleable.MaterialCheckBox
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.m68822h(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.C10462R.styleable.MaterialCheckBox_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = com.google.android.material.resources.MaterialResources.m69121a(r8, r9, r10)
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(r7, r8)
        L_0x0028:
            int r8 = com.google.android.material.C10462R.styleable.MaterialCheckBox_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f48966c = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
