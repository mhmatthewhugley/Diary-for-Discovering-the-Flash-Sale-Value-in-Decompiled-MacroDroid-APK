package p165s5;

import android.content.res.Resources;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.R$plurals;
import com.google.android.material.textfield.TextInputLayout;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: s5.d */
/* compiled from: PasswordFieldValidator */
public class C10236d extends C10233a {

    /* renamed from: d */
    private int f23371d;

    public C10236d(TextInputLayout textInputLayout, int i) {
        super(textInputLayout);
        this.f23371d = i;
        Resources resources = this.f23368a.getResources();
        int i2 = R$plurals.fui_error_weak_password;
        int i3 = this.f23371d;
        this.f23369b = resources.getQuantityString(i2, i3, new Object[]{Integer.valueOf(i3)});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo40844a(CharSequence charSequence) {
        return charSequence.length() >= this.f23371d;
    }
}
