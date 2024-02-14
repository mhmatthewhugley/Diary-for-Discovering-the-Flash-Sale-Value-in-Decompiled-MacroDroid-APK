package com.takisoft.preferencex;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.C0146R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.preference.C0996R;
import androidx.preference.PreferenceViewHolder;

public class SwitchPreferenceCompat extends androidx.preference.SwitchPreferenceCompat {

    /* renamed from: f */
    private static final int[] f57644f = {C0146R.attr.controlBackground, R$attr.colorControlNormal};

    /* renamed from: a */
    private final View.OnClickListener f57645a = new C11742a();

    /* renamed from: c */
    private final View.OnClickListener f57646c = new C11743b();

    /* renamed from: d */
    private boolean f57647d = false;

    /* renamed from: com.takisoft.preferencex.SwitchPreferenceCompat$a */
    class C11742a implements View.OnClickListener {
        C11742a() {
        }

        public void onClick(View view) {
            SwitchPreferenceCompat.this.performClick((View) view.getParent());
        }
    }

    /* renamed from: com.takisoft.preferencex.SwitchPreferenceCompat$b */
    class C11743b implements View.OnClickListener {
        C11743b() {
        }

        public void onClick(View view) {
            boolean z = !SwitchPreferenceCompat.this.isChecked();
            if (SwitchPreferenceCompat.this.callChangeListener(Boolean.valueOf(z))) {
                SwitchPreferenceCompat.this.setChecked(z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m81932d(false);
    }

    /* renamed from: d */
    private void m81932d(boolean z) {
        if (m81933e(getFragment() != null) && z) {
            notifyHierarchyChanged();
        }
    }

    /* renamed from: e */
    private boolean m81933e(boolean z) {
        if (this.f57647d == z) {
            return false;
        }
        this.f57647d = z;
        if (z) {
            setLayoutResource(R$layout.preference_material_ext);
            return true;
        }
        setLayoutResource(C0996R.C1001layout.preference_material);
        return true;
    }

    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        if (this.f57647d) {
            preferenceViewHolder.findViewById(16908312).setOnClickListener(this.f57646c);
            preferenceViewHolder.findViewById(R$id.pref_content_frame).setOnClickListener(this.f57645a);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(f57644f);
            if (obtainStyledAttributes.length() > 0 && obtainStyledAttributes.getIndexCount() > 0) {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    preferenceViewHolder.findViewById(C0996R.C0999id.switchWidget).setBackgroundDrawable(AppCompatResources.getDrawable(getContext(), resourceId));
                }
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
                if (colorStateList != null) {
                    preferenceViewHolder.findViewById(R$id.pref_separator).setBackgroundColor(colorStateList.getColorForState(isEnabled() ? new int[]{16842910} : new int[]{-16842910}, colorStateList.getDefaultColor()));
                }
            }
            obtainStyledAttributes.recycle();
        }
        preferenceViewHolder.itemView.setClickable(!this.f57647d);
        preferenceViewHolder.itemView.setFocusable(!this.f57647d);
    }

    /* access modifiers changed from: protected */
    public void onClick() {
        if (!this.f57647d) {
            super.onClick();
        }
    }

    public void setFragment(String str) {
        super.setFragment(str);
        m81932d(true);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m81932d(false);
    }
}
