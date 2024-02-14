package com.arlosoft.macrodroid.utils;

import android.content.Context;
import android.preference.EditTextPreference;
import android.util.AttributeSet;
import android.widget.Toast;
import com.google.common.base.Charsets;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

public class PwdEditTextPreference extends EditTextPreference {
    public PwdEditTextPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setText(String str) {
        String text = super.getText();
        if (str == null || str.trim().length() < 4) {
            Toast.makeText(getContext(), "Le mot de passe doit être composé d'un minimum de 4 caractères", 1).show();
        } else if (text == null || text.trim().length() == 0 || text.equals(str)) {
            super.setText(str);
        } else if (!text.equals(str)) {
            HashFunction a = Hashing.m29758a();
            super.setText(a.mo36964a(str + "8L9f7BL5Ot5jCJ0Hu7iO", Charsets.f4139c).toString());
        }
    }

    public PwdEditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
