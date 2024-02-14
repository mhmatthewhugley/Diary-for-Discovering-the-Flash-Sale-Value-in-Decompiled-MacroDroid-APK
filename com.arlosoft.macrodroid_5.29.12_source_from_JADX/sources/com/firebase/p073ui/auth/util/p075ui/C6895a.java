package com.firebase.p073ui.auth.util.p075ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.RestrictTo;
import java.util.Collections;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.util.ui.a */
/* compiled from: BucketedTextChangeListener */
public final class C6895a implements TextWatcher {

    /* renamed from: a */
    private final EditText f16138a;

    /* renamed from: c */
    private final C6896a f16139c;

    /* renamed from: d */
    private final String[] f16140d;

    /* renamed from: f */
    private final String f16141f;

    /* renamed from: g */
    private final int f16142g;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.firebase.ui.auth.util.ui.a$a */
    /* compiled from: BucketedTextChangeListener */
    public interface C6896a {
        /* renamed from: a */
        void mo34260a();

        /* renamed from: b */
        void mo34261b();
    }

    public C6895a(EditText editText, int i, String str, C6896a aVar) {
        this.f16138a = editText;
        this.f16142g = i;
        this.f16140d = m26051a(str, i);
        this.f16139c = aVar;
        this.f16141f = str;
    }

    /* renamed from: a */
    private static String[] m26051a(CharSequence charSequence, int i) {
        String[] strArr = new String[(i + 1)];
        for (int i2 = 0; i2 <= i; i2++) {
            strArr[i2] = TextUtils.join("", Collections.nCopies(i2, charSequence));
        }
        return strArr;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C6896a aVar;
        String replaceAll = charSequence.toString().replaceAll(" ", "").replaceAll(this.f16141f, "");
        int min = Math.min(replaceAll.length(), this.f16142g);
        String substring = replaceAll.substring(0, min);
        this.f16138a.removeTextChangedListener(this);
        EditText editText = this.f16138a;
        editText.setText(substring + this.f16140d[this.f16142g - min]);
        this.f16138a.setSelection(min);
        this.f16138a.addTextChangedListener(this);
        if (min != this.f16142g || (aVar = this.f16139c) == null) {
            C6896a aVar2 = this.f16139c;
            if (aVar2 != null) {
                aVar2.mo34260a();
                return;
            }
            return;
        }
        aVar.mo34261b();
    }
}
