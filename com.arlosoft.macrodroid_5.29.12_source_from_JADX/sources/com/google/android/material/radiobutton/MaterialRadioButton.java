package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.C10462R;
import com.google.android.material.color.MaterialColors;

public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: d */
    private static final int f49900d = C10462R.style.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: f */
    private static final int[][] f49901f = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @Nullable

    /* renamed from: a */
    private ColorStateList f49902a;

    /* renamed from: c */
    private boolean f49903c;

    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.radioButtonStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f49902a == null) {
            int d = MaterialColors.m68104d(this, C10462R.attr.colorControlActivated);
            int d2 = MaterialColors.m68104d(this, C10462R.attr.colorOnSurface);
            int d3 = MaterialColors.m68104d(this, C10462R.attr.colorSurface);
            int[][] iArr = f49901f;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = MaterialColors.m68108h(d3, d, 1.0f);
            iArr2[1] = MaterialColors.m68108h(d3, d2, 0.54f);
            iArr2[2] = MaterialColors.m68108h(d3, d2, 0.38f);
            iArr2[3] = MaterialColors.m68108h(d3, d2, 0.38f);
            this.f49902a = new ColorStateList(iArr, iArr2);
        }
        return this.f49902a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f49903c && CompoundButtonCompat.getButtonTintList(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f49903c = z;
        if (z) {
            CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.setButtonTintList(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialRadioButton(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.Nullable android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f49900d
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.C10462R.styleable.MaterialRadioButton
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.m68822h(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.C10462R.styleable.MaterialRadioButton_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = com.google.android.material.resources.MaterialResources.m69121a(r8, r9, r10)
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(r7, r8)
        L_0x0028:
            int r8 = com.google.android.material.C10462R.styleable.MaterialRadioButton_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f49903c = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.MaterialRadioButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
