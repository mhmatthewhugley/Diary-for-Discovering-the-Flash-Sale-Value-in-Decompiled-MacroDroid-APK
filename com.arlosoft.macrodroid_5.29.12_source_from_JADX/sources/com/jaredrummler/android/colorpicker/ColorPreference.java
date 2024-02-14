package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import p331n6.C15755a;

public class ColorPreference extends Preference implements C15755a {

    /* renamed from: A */
    private int f57402A;

    /* renamed from: B */
    private int[] f57403B;

    /* renamed from: C */
    private int f57404C;

    /* renamed from: a */
    private C11672a f57405a;

    /* renamed from: c */
    private int f57406c = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: d */
    private boolean f57407d;

    /* renamed from: f */
    private int f57408f;

    /* renamed from: g */
    private int f57409g;

    /* renamed from: o */
    private boolean f57410o;

    /* renamed from: p */
    private boolean f57411p;

    /* renamed from: s */
    private boolean f57412s;

    /* renamed from: z */
    private boolean f57413z;

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPreference$a */
    public interface C11672a {
        /* renamed from: a */
        void mo65693a(String str, int i);
    }

    public ColorPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m81773d(attributeSet);
    }

    /* renamed from: d */
    private void m81773d(AttributeSet attributeSet) {
        setPersistent(true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPreference);
        this.f57407d = obtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showDialog, true);
        this.f57408f = obtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_dialogType, 1);
        this.f57409g = obtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_colorShape, 1);
        this.f57410o = obtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowPresets, true);
        this.f57411p = obtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_allowCustom, true);
        this.f57412s = obtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showAlphaSlider, false);
        this.f57413z = obtainStyledAttributes.getBoolean(R$styleable.ColorPreference_cpv_showColorShades, true);
        this.f57402A = obtainStyledAttributes.getInt(R$styleable.ColorPreference_cpv_previewSize, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_colorPresets, 0);
        this.f57404C = obtainStyledAttributes.getResourceId(R$styleable.ColorPreference_cpv_dialogTitle, R$string.cpv_default_title);
        if (resourceId != 0) {
            this.f57403B = getContext().getResources().getIntArray(resourceId);
        } else {
            this.f57403B = C11680c.f57446L;
        }
        if (this.f57409g == 1) {
            setWidgetLayoutResource(this.f57402A == 1 ? R$layout.cpv_preference_circle_large : R$layout.cpv_preference_circle);
        } else {
            setWidgetLayoutResource(this.f57402A == 1 ? R$layout.cpv_preference_square_large : R$layout.cpv_preference_square);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: U */
    public void mo24603U(int i, @ColorInt int i2) {
        mo65687e(i2);
    }

    /* renamed from: V0 */
    public void mo24604V0(int i) {
    }

    /* renamed from: b */
    public String mo65686b() {
        return "color_" + getKey();
    }

    /* renamed from: e */
    public void mo65687e(@ColorInt int i) {
        this.f57406c = i;
        persistInt(i);
        notifyChanged();
        callChangeListener(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToActivity() {
        C11680c cVar;
        super.onAttachedToActivity();
        if (this.f57407d && (cVar = (C11680c) ((FragmentActivity) getContext()).getSupportFragmentManager().findFragmentByTag(mo65686b())) != null) {
            cVar.mo65718m0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        super.onBindView(view);
        ColorPanelView colorPanelView = (ColorPanelView) view.findViewById(R$id.cpv_preference_preview_color_panel);
        if (colorPanelView != null) {
            colorPanelView.setColor(this.f57406c);
        }
    }

    /* access modifiers changed from: protected */
    public void onClick() {
        super.onClick();
        C11672a aVar = this.f57405a;
        if (aVar != null) {
            aVar.mo65693a((String) getTitle(), this.f57406c);
        } else if (this.f57407d) {
            C11680c a = C11680c.m81798g0().mo65738h(this.f57408f).mo65737g(this.f57404C).mo65735e(this.f57409g).mo65739i(this.f57403B).mo65733c(this.f57410o).mo65732b(this.f57411p).mo65742l(this.f57412s).mo65743m(this.f57413z).mo65734d(this.f57406c).mo65731a();
            a.mo65718m0(this);
            ((FragmentActivity) getContext()).getSupportFragmentManager().beginTransaction().add((Fragment) a, mo65686b()).commitAllowingStateLoss();
        }
    }

    /* access modifiers changed from: protected */
    public Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInteger(i, ViewCompat.MEASURED_STATE_MASK));
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        if (z) {
            this.f57406c = getPersistedInt(ViewCompat.MEASURED_STATE_MASK);
            return;
        }
        int intValue = ((Integer) obj).intValue();
        this.f57406c = intValue;
        persistInt(intValue);
    }

    public ColorPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m81773d(attributeSet);
    }
}
