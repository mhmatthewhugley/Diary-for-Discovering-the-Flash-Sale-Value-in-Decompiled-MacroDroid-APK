package p165s5;

import androidx.annotation.RestrictTo;
import com.google.android.material.textfield.TextInputLayout;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: s5.a */
/* compiled from: BaseValidator */
public class C10233a {

    /* renamed from: a */
    protected TextInputLayout f23368a;

    /* renamed from: b */
    protected String f23369b = "";

    /* renamed from: c */
    protected String f23370c;

    public C10233a(TextInputLayout textInputLayout) {
        this.f23368a = textInputLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo40844a(CharSequence charSequence) {
        throw null;
    }

    /* renamed from: b */
    public boolean mo40845b(CharSequence charSequence) {
        if (this.f23370c != null && (charSequence == null || charSequence.length() == 0)) {
            this.f23368a.setError(this.f23370c);
            return false;
        } else if (mo40844a(charSequence)) {
            this.f23368a.setError("");
            return true;
        } else {
            this.f23368a.setError(this.f23369b);
            return false;
        }
    }
}
