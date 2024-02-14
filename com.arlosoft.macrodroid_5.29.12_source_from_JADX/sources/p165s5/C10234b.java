package p165s5;

import android.util.Patterns;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.R$string;
import com.google.android.material.textfield.TextInputLayout;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: s5.b */
/* compiled from: EmailFieldValidator */
public class C10234b extends C10233a {
    public C10234b(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f23369b = this.f23368a.getResources().getString(R$string.fui_invalid_email_address);
        this.f23370c = this.f23368a.getResources().getString(R$string.fui_missing_email_address);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo40844a(CharSequence charSequence) {
        return Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
    }
}
