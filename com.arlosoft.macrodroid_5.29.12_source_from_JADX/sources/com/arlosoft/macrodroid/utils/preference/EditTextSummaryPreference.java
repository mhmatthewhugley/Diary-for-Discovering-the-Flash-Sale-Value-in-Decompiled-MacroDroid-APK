package com.arlosoft.macrodroid.utils.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.cli.HelpFormatter;
import p482y3.C17514a;

/* compiled from: EditTextSummaryPreference.kt */
public final class EditTextSummaryPreference extends EditTextPreference {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditTextSummaryPreference(Context context) {
        super(context);
        C13706o.m87929f(context, "context");
        m24716d();
    }

    /* renamed from: d */
    private final void m24716d() {
        setOnPreferenceChangeListener(new C17514a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m24717e(EditTextSummaryPreference editTextSummaryPreference, Preference preference, Object obj) {
        C13706o.m87929f(editTextSummaryPreference, "this$0");
        editTextSummaryPreference.setSummary((CharSequence) obj.toString());
        return true;
    }

    public CharSequence getSummary() {
        String text = getText();
        return text == null ? HelpFormatter.DEFAULT_OPT_PREFIX : text;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditTextSummaryPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C13706o.m87929f(context, "context");
        m24716d();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditTextSummaryPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13706o.m87929f(context, "context");
        m24716d();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditTextSummaryPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C13706o.m87929f(context, "context");
        C13706o.m87929f(attributeSet, "attrs");
        m24716d();
    }
}
