package p165s5;

import androidx.annotation.RestrictTo;
import com.google.android.material.textfield.TextInputLayout;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: s5.e */
/* compiled from: RequiredFieldValidator */
public class C10237e extends C10233a {
    public C10237e(TextInputLayout textInputLayout, String str) {
        super(textInputLayout);
        this.f23369b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo40844a(CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0;
    }
}
