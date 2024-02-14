package com.arlosoft.macrodroid.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.EditTextPreference;
import p148q0.C8151a;

public class EncryptedEditTextPreference extends EditTextPreference {

    /* renamed from: a */
    private final C4012f1 f10322a = new C4012f1();

    public EncryptedEditTextPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public String getText() {
        String text = super.getText();
        if (text != null) {
            try {
                if (text.length() > 0) {
                    return this.f10322a.mo27914a(text);
                }
            } catch (Exception e) {
                C8151a.m33873n(new RuntimeException("EncryptedTextPreference: Failed to decrypt: " + e.getMessage()));
            }
        }
        return text;
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        super.setText(z ? getPersistedString((String) null) : (String) obj);
    }

    public void setText(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    super.setText(this.f10322a.mo27915b(str));
                }
            } catch (Exception e) {
                C8151a.m33873n(new RuntimeException("EncryptedTextPreference: Failed to encrypt: " + e.getMessage()));
            }
        }
    }

    public EncryptedEditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EncryptedEditTextPreference(Context context) {
        super(context);
    }
}
