package com.thebluealliance.spectrum;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceViewHolder;
import p222c8.C11159a;

public class SpectrumPreferenceCompat extends DialogPreference {
    @ColorInt

    /* renamed from: a */
    private int[] f57681a;
    /* access modifiers changed from: private */
    @ColorInt

    /* renamed from: c */
    public int f57682c;

    /* renamed from: d */
    private boolean f57683d = true;

    /* renamed from: f */
    private boolean f57684f = false;

    /* renamed from: g */
    private View f57685g;

    /* renamed from: o */
    private int f57686o = 0;

    /* renamed from: p */
    private int f57687p = -1;

    /* renamed from: s */
    private SharedPreferences.OnSharedPreferenceChangeListener f57688s = new C11765a();

    /* renamed from: com.thebluealliance.spectrum.SpectrumPreferenceCompat$a */
    class C11765a implements SharedPreferences.OnSharedPreferenceChangeListener {
        C11765a() {
        }

        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (SpectrumPreferenceCompat.this.getKey().equals(str)) {
                SpectrumPreferenceCompat spectrumPreferenceCompat = SpectrumPreferenceCompat.this;
                int unused = spectrumPreferenceCompat.f57682c = sharedPreferences.getInt(str, spectrumPreferenceCompat.f57682c);
                SpectrumPreferenceCompat.this.m81970f();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public SpectrumPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SpectrumPreference, 0, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(R$styleable.SpectrumPreference_spectrum_colors, 0);
            if (resourceId != 0) {
                this.f57681a = getContext().getResources().getIntArray(resourceId);
            }
            this.f57683d = obtainStyledAttributes.getBoolean(R$styleable.SpectrumPreference_spectrum_closeOnSelected, true);
            this.f57686o = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SpectrumPalette_spectrum_outlineWidth, 0);
            this.f57687p = obtainStyledAttributes.getInt(R$styleable.SpectrumPalette_spectrum_columnCount, -1);
            obtainStyledAttributes.recycle();
            setDialogLayoutResource(R$layout.dialog_color_picker);
            setWidgetLayoutResource(R$layout.color_preference_widget);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m81970f() {
        if (this.f57685g != null) {
            C11159a aVar = new C11159a(this.f57682c);
            aVar.mo62351d(this.f57686o);
            if (!isEnabled()) {
                aVar.mo62348a(-1);
                aVar.setAlpha(0);
                aVar.mo62351d(getContext().getResources().getDimensionPixelSize(R$dimen.color_preference_disabled_outline_size));
                aVar.mo62350c(ViewCompat.MEASURED_STATE_MASK);
                aVar.mo62349b(97);
            }
            this.f57685g.setBackground(aVar);
        }
    }

    public void onAttached() {
        super.onAttached();
        getSharedPreferences().registerOnSharedPreferenceChangeListener(this.f57688s);
    }

    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        this.f57685g = preferenceViewHolder.findViewById(R$id.color_preference_widget);
        m81970f();
    }

    /* access modifiers changed from: protected */
    public Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInteger(i, ViewCompat.MEASURED_STATE_MASK));
    }

    /* access modifiers changed from: protected */
    public void onPrepareForRemoval() {
        super.onPrepareForRemoval();
        getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this.f57688s);
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        if (z) {
            this.f57682c = getPersistedInt(ViewCompat.MEASURED_STATE_MASK);
            return;
        }
        int intValue = ((Integer) obj).intValue();
        this.f57682c = intValue;
        persistInt(intValue);
    }
}
