package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import p331n6.C15755a;

public class ColorPreferenceCompat extends Preference implements C15755a {

    /* renamed from: A */
    private int f57414A;

    /* renamed from: B */
    private int[] f57415B;

    /* renamed from: C */
    private int f57416C;

    /* renamed from: a */
    private C11673a f57417a;

    /* renamed from: c */
    private int f57418c = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: d */
    private boolean f57419d;

    /* renamed from: f */
    private int f57420f;

    /* renamed from: g */
    private int f57421g;

    /* renamed from: o */
    private boolean f57422o;

    /* renamed from: p */
    private boolean f57423p;

    /* renamed from: s */
    private boolean f57424s;

    /* renamed from: z */
    private boolean f57425z;

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPreferenceCompat$a */
    public interface C11673a {
        /* renamed from: a */
        void mo65697a(String str, int i);
    }

    public ColorPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m81779e(attributeSet);
    }

    /* renamed from: e */
    private void m81779e(AttributeSet attributeSet) {
        setPersistent(true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPreference);
        this.f57419d = obtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showDialog, true);
        this.f57420f = obtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_dialogType, 1);
        this.f57421g = obtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_colorShape, 1);
        this.f57422o = obtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowPresets, true);
        this.f57423p = obtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowCustom, true);
        this.f57424s = obtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showAlphaSlider, false);
        this.f57425z = obtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showColorShades, true);
        this.f57414A = obtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_previewSize, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_colorPresets, 0);
        this.f57416C = obtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_dialogTitle, R$string.cpv_default_title);
        if (resourceId != 0) {
            this.f57415B = getContext().getResources().getIntArray(resourceId);
        } else {
            this.f57415B = C11680c.f57446L;
        }
        if (this.f57421g == 1) {
            setWidgetLayoutResource(this.f57414A == 1 ? R$layout.cpv_preference_circle_large : R$layout.cpv_preference_circle);
        } else {
            setWidgetLayoutResource(this.f57414A == 1 ? R$layout.cpv_preference_square_large : R$layout.cpv_preference_square);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: U */
    public void mo24603U(int i, @ColorInt int i2) {
        mo65696f(i2);
    }

    /* renamed from: V0 */
    public void mo24604V0(int i) {
    }

    /* renamed from: b */
    public FragmentActivity mo65694b() {
        Context context = getContext();
        if (context instanceof FragmentActivity) {
            return (FragmentActivity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof FragmentActivity) {
                return (FragmentActivity) baseContext;
            }
        }
        throw new IllegalStateException("Error getting activity from context");
    }

    /* renamed from: d */
    public String mo65695d() {
        return "color_" + getKey();
    }

    /* renamed from: f */
    public void mo65696f(@ColorInt int i) {
        this.f57418c = i;
        persistInt(i);
        notifyChanged();
        callChangeListener(Integer.valueOf(i));
    }

    public void onAttached() {
        C11680c cVar;
        super.onAttached();
        if (this.f57419d && (cVar = (C11680c) mo65694b().getSupportFragmentManager().findFragmentByTag(mo65695d())) != null) {
            cVar.mo65718m0(this);
        }
    }

    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        ColorPanelView colorPanelView = (ColorPanelView) preferenceViewHolder.itemView.findViewById(R$id.cpv_preference_preview_color_panel);
        if (colorPanelView != null) {
            colorPanelView.setColor(this.f57418c);
        }
    }

    /* access modifiers changed from: protected */
    public void onClick() {
        super.onClick();
        C11673a aVar = this.f57417a;
        if (aVar != null) {
            aVar.mo65697a((String) getTitle(), this.f57418c);
        } else if (this.f57419d) {
            C11680c a = C11680c.m81798g0().mo65738h(this.f57420f).mo65737g(this.f57416C).mo65735e(this.f57421g).mo65739i(this.f57415B).mo65733c(this.f57422o).mo65732b(this.f57423p).mo65742l(this.f57424s).mo65743m(this.f57425z).mo65734d(this.f57418c).mo65731a();
            a.mo65718m0(this);
            mo65694b().getSupportFragmentManager().beginTransaction().add((Fragment) a, mo65695d()).commitAllowingStateLoss();
        }
    }

    /* access modifiers changed from: protected */
    public Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInteger(i, ViewCompat.MEASURED_STATE_MASK));
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(Object obj) {
        super.onSetInitialValue(obj);
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            this.f57418c = intValue;
            persistInt(intValue);
            return;
        }
        this.f57418c = getPersistedInt(ViewCompat.MEASURED_STATE_MASK);
    }

    public ColorPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m81779e(attributeSet);
    }
}
