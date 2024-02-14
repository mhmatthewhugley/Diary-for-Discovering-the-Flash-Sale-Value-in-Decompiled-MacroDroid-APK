package com.thebluealliance.spectrum;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;
import com.thebluealliance.spectrum.SpectrumPalette;
import p222c8.C11159a;

public class SpectrumPreference extends DialogPreference {

    /* renamed from: A */
    private SharedPreferences.OnSharedPreferenceChangeListener f57669A = new C11763a();
    @ColorInt

    /* renamed from: a */
    private int[] f57670a;
    /* access modifiers changed from: private */
    @ColorInt

    /* renamed from: c */
    public int f57671c;
    /* access modifiers changed from: private */
    @ColorInt

    /* renamed from: d */
    public int f57672d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f57673f = true;

    /* renamed from: g */
    private SpectrumPalette f57674g;

    /* renamed from: o */
    private boolean f57675o = false;

    /* renamed from: p */
    private View f57676p;

    /* renamed from: s */
    private int f57677s = 0;

    /* renamed from: z */
    private int f57678z = -1;

    /* renamed from: com.thebluealliance.spectrum.SpectrumPreference$a */
    class C11763a implements SharedPreferences.OnSharedPreferenceChangeListener {
        C11763a() {
        }

        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (SpectrumPreference.this.getKey().equals(str)) {
                SpectrumPreference spectrumPreference = SpectrumPreference.this;
                int unused = spectrumPreference.f57671c = sharedPreferences.getInt(str, spectrumPreference.f57671c);
                SpectrumPreference.this.m81964j();
            }
        }
    }

    /* renamed from: com.thebluealliance.spectrum.SpectrumPreference$b */
    class C11764b implements SpectrumPalette.C11762a {
        C11764b() {
        }

        /* renamed from: f */
        public void mo28902f(@ColorInt int i) {
            int unused = SpectrumPreference.this.f57672d = i;
            if (SpectrumPreference.this.f57673f) {
                SpectrumPreference.this.onClick((DialogInterface) null, -1);
                if (SpectrumPreference.this.getDialog() != null) {
                    SpectrumPreference.this.getDialog().dismiss();
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public SpectrumPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SpectrumPreference, 0, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(R$styleable.SpectrumPreference_spectrum_colors, 0);
            if (resourceId != 0) {
                this.f57670a = getContext().getResources().getIntArray(resourceId);
            }
            this.f57673f = obtainStyledAttributes.getBoolean(R$styleable.SpectrumPreference_spectrum_closeOnSelected, true);
            this.f57677s = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SpectrumPalette_spectrum_outlineWidth, 0);
            this.f57678z = obtainStyledAttributes.getInt(R$styleable.SpectrumPalette_spectrum_columnCount, -1);
            obtainStyledAttributes.recycle();
            setDialogLayoutResource(R$layout.dialog_color_picker);
            setWidgetLayoutResource(R$layout.color_preference_widget);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m81964j() {
        if (this.f57676p != null) {
            C11159a aVar = new C11159a(this.f57671c);
            aVar.mo62351d(this.f57677s);
            if (!isEnabled()) {
                aVar.mo62348a(ViewCompat.MEASURED_STATE_MASK);
                aVar.setAlpha(0);
                aVar.mo62351d(getContext().getResources().getDimensionPixelSize(R$dimen.color_preference_disabled_outline_size));
                aVar.mo62350c(ViewCompat.MEASURED_STATE_MASK);
                aVar.mo62349b(97);
            }
            this.f57676p.setBackground(aVar);
        }
    }

    /* renamed from: i */
    public void mo66967i(@ColorInt int i) {
        boolean z = this.f57671c != i;
        if (z || !this.f57675o) {
            this.f57671c = i;
            this.f57675o = true;
            persistInt(i);
            m81964j();
            if (z) {
                notifyChanged();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onBindDialogView(View view) {
        super.onBindDialogView(view);
        if (this.f57670a != null) {
            SpectrumPalette spectrumPalette = (SpectrumPalette) view.findViewById(R$id.palette);
            this.f57674g = spectrumPalette;
            spectrumPalette.setColors(this.f57670a);
            this.f57674g.setSelectedColor(this.f57671c);
            this.f57674g.setOutlineWidth(this.f57677s);
            this.f57674g.setFixedColumnCount(this.f57678z);
            this.f57674g.setOnColorSelectedListener(new C11764b());
            return;
        }
        throw new RuntimeException("SpectrumPreference requires a colors array");
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        super.onBindView(view);
        this.f57676p = view.findViewById(R$id.color_preference_widget);
        m81964j();
    }

    /* access modifiers changed from: protected */
    public View onCreateView(ViewGroup viewGroup) {
        getSharedPreferences().registerOnSharedPreferenceChangeListener(this.f57669A);
        return super.onCreateView(viewGroup);
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        if (z && callChangeListener(Integer.valueOf(this.f57672d))) {
            mo66967i(this.f57672d);
        }
    }

    /* access modifiers changed from: protected */
    public Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInteger(i, ViewCompat.MEASURED_STATE_MASK));
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        if (this.f57673f) {
            builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onPrepareForRemoval() {
        super.onPrepareForRemoval();
        getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this.f57669A);
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        if (z) {
            this.f57671c = getPersistedInt(ViewCompat.MEASURED_STATE_MASK);
            return;
        }
        int intValue = ((Integer) obj).intValue();
        this.f57671c = intValue;
        persistInt(intValue);
    }
}
