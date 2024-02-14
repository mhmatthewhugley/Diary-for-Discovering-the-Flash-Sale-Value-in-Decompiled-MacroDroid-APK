package com.firebase.p073ui.auth.util.p075ui;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.util.ui.d */
/* compiled from: TextHelper */
public class C6901d {
    /* renamed from: a */
    public static void m26060a(@NonNull SpannableStringBuilder spannableStringBuilder, @NonNull String str, @NonNull String str2) {
        int i = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf(str2, i);
            int length = str2.length() + indexOf;
            if (indexOf != -1 && length <= str.length()) {
                spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, length, 17);
                i = length + 1;
            } else {
                return;
            }
        }
    }
}
