package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;

public class SwitchPreference extends TwoStatePreference {
    private final Listener mListener;
    private CharSequence mSwitchOff;
    private CharSequence mSwitchOn;

    private class Listener implements CompoundButton.OnCheckedChangeListener {
        Listener() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreference.this.callChangeListener(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreference.this.setChecked(z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mListener = new Listener();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0996R.styleable.SwitchPreference, i, i2);
        setSummaryOn((CharSequence) TypedArrayUtils.getString(obtainStyledAttributes, C0996R.styleable.SwitchPreference_summaryOn, C0996R.styleable.SwitchPreference_android_summaryOn));
        setSummaryOff((CharSequence) TypedArrayUtils.getString(obtainStyledAttributes, C0996R.styleable.SwitchPreference_summaryOff, C0996R.styleable.SwitchPreference_android_summaryOff));
        setSwitchTextOn((CharSequence) TypedArrayUtils.getString(obtainStyledAttributes, C0996R.styleable.SwitchPreference_switchTextOn, C0996R.styleable.SwitchPreference_android_switchTextOn));
        setSwitchTextOff((CharSequence) TypedArrayUtils.getString(obtainStyledAttributes, C0996R.styleable.SwitchPreference_switchTextOff, C0996R.styleable.SwitchPreference_android_switchTextOff));
        setDisableDependentsState(TypedArrayUtils.getBoolean(obtainStyledAttributes, C0996R.styleable.SwitchPreference_disableDependentsState, C0996R.styleable.SwitchPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    private void syncSwitchView(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.mChecked);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.mSwitchOn);
            switchR.setTextOff(this.mSwitchOff);
            switchR.setOnCheckedChangeListener(this.mListener);
        }
    }

    private void syncViewIfAccessibilityEnabled(View view) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            syncSwitchView(view.findViewById(16908352));
            syncSummaryView(view.findViewById(16908304));
        }
    }

    public CharSequence getSwitchTextOff() {
        return this.mSwitchOff;
    }

    public CharSequence getSwitchTextOn() {
        return this.mSwitchOn;
    }

    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        syncSwitchView(preferenceViewHolder.findViewById(16908352));
        syncSummaryView(preferenceViewHolder);
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void performClick(View view) {
        super.performClick(view);
        syncViewIfAccessibilityEnabled(view);
    }

    public void setSwitchTextOff(CharSequence charSequence) {
        this.mSwitchOff = charSequence;
        notifyChanged();
    }

    public void setSwitchTextOn(CharSequence charSequence) {
        this.mSwitchOn = charSequence;
        notifyChanged();
    }

    public void setSwitchTextOff(int i) {
        setSwitchTextOff((CharSequence) getContext().getString(i));
    }

    public void setSwitchTextOn(int i) {
        setSwitchTextOn((CharSequence) getContext().getString(i));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, C0996R.attr.switchPreferenceStyle, 16843629));
    }

    public SwitchPreference(Context context) {
        this(context, (AttributeSet) null);
    }
}
