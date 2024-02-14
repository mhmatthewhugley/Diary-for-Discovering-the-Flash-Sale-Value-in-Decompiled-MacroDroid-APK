package p139o1;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;

/* renamed from: o1.d0 */
/* compiled from: IncludeOkCancelButtonsBinding */
public final class C7996d0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final LinearLayout f19243a;
    @NonNull

    /* renamed from: b */
    public final LinearLayout f19244b;
    @NonNull

    /* renamed from: c */
    public final Button f19245c;
    @NonNull

    /* renamed from: d */
    public final Button f19246d;

    private C7996d0(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull Button button, @NonNull Button button2) {
        this.f19243a = linearLayout;
        this.f19244b = linearLayout2;
        this.f19245c = button;
        this.f19246d = button2;
    }

    @NonNull
    /* renamed from: a */
    public static C7996d0 m33310a(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C17532R$id.cancelButton;
        Button button = (Button) ViewBindings.findChildViewById(view, C17532R$id.cancelButton);
        if (button != null) {
            i = C17532R$id.okButton;
            Button button2 = (Button) ViewBindings.findChildViewById(view, C17532R$id.okButton);
            if (button2 != null) {
                return new C7996d0(linearLayout, linearLayout, button, button2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f19243a;
    }
}
