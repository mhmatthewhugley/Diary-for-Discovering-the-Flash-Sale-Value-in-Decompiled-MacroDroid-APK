package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.C10462R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ViewUtils;

public class SwitchMaterial extends SwitchCompat {

    /* renamed from: g */
    private static final int f50295g = C10462R.style.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: o */
    private static final int[][] f50296o = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @NonNull

    /* renamed from: a */
    private final ElevationOverlayProvider f50297a;
    @Nullable

    /* renamed from: c */
    private ColorStateList f50298c;
    @Nullable

    /* renamed from: d */
    private ColorStateList f50299d;

    /* renamed from: f */
    private boolean f50300f;

    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.switchStyle);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f50298c == null) {
            int d = MaterialColors.m68104d(this, C10462R.attr.colorSurface);
            int d2 = MaterialColors.m68104d(this, C10462R.attr.colorControlActivated);
            float dimension = getResources().getDimension(C10462R.dimen.mtrl_switch_thumb_elevation);
            if (this.f50297a.mo57762e()) {
                dimension += ViewUtils.m68841h(this);
            }
            int c = this.f50297a.mo57760c(d, dimension);
            int[][] iArr = f50296o;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = MaterialColors.m68108h(d, d2, 1.0f);
            iArr2[1] = c;
            iArr2[2] = MaterialColors.m68108h(d, d2, 0.38f);
            iArr2[3] = c;
            this.f50298c = new ColorStateList(iArr, iArr2);
        }
        return this.f50298c;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f50299d == null) {
            int[][] iArr = f50296o;
            int[] iArr2 = new int[iArr.length];
            int d = MaterialColors.m68104d(this, C10462R.attr.colorSurface);
            int d2 = MaterialColors.m68104d(this, C10462R.attr.colorControlActivated);
            int d3 = MaterialColors.m68104d(this, C10462R.attr.colorOnSurface);
            iArr2[0] = MaterialColors.m68108h(d, d2, 0.54f);
            iArr2[1] = MaterialColors.m68108h(d, d3, 0.32f);
            iArr2[2] = MaterialColors.m68108h(d, d2, 0.12f);
            iArr2[3] = MaterialColors.m68108h(d, d3, 0.12f);
            this.f50299d = new ColorStateList(iArr, iArr2);
        }
        return this.f50299d;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f50300f && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f50300f && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f50300f = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList((ColorStateList) null);
        setTrackTintList((ColorStateList) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchMaterial(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f50295g
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            com.google.android.material.elevation.ElevationOverlayProvider r7 = new com.google.android.material.elevation.ElevationOverlayProvider
            r7.<init>(r0)
            r6.f50297a = r7
            int[] r2 = com.google.android.material.C10462R.styleable.SwitchMaterial
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.m68822h(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.C10462R.styleable.SwitchMaterial_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f50300f = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
