package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.p */
/* compiled from: ActivityValidatePurchaseBinding */
public final class C8019p implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final FrameLayout f19389a;
    @NonNull

    /* renamed from: b */
    public final EditText f19390b;
    @NonNull

    /* renamed from: c */
    public final FrameLayout f19391c;
    @NonNull

    /* renamed from: d */
    public final Button f19392d;
    @NonNull

    /* renamed from: e */
    public final EditText f19393e;
    @NonNull

    /* renamed from: f */
    public final Button f19394f;
    @NonNull

    /* renamed from: g */
    public final Button f19395g;
    @NonNull

    /* renamed from: h */
    public final Button f19396h;

    private C8019p(@NonNull FrameLayout frameLayout, @NonNull EditText editText, @NonNull FrameLayout frameLayout2, @NonNull Button button, @NonNull EditText editText2, @NonNull Button button2, @NonNull Button button3, @NonNull Button button4) {
        this.f19389a = frameLayout;
        this.f19390b = editText;
        this.f19391c = frameLayout2;
        this.f19392d = button;
        this.f19393e = editText2;
        this.f19394f = button2;
        this.f19395g = button3;
        this.f19396h = button4;
    }

    @NonNull
    /* renamed from: a */
    public static C8019p m33388a(@NonNull View view) {
        int i = C17532R$id.emailAddress;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, C17532R$id.emailAddress);
        if (editText != null) {
            i = C17532R$id.loadingBlocker;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, C17532R$id.loadingBlocker);
            if (frameLayout != null) {
                i = C17532R$id.revertToFreeButton;
                Button button = (Button) ViewBindings.findChildViewById(view, C17532R$id.revertToFreeButton);
                if (button != null) {
                    i = C17532R$id.serialCode;
                    EditText editText2 = (EditText) ViewBindings.findChildViewById(view, C17532R$id.serialCode);
                    if (editText2 != null) {
                        i = C17532R$id.uninstallButton;
                        Button button2 = (Button) ViewBindings.findChildViewById(view, C17532R$id.uninstallButton);
                        if (button2 != null) {
                            i = C17532R$id.upgradeNowButton;
                            Button button3 = (Button) ViewBindings.findChildViewById(view, C17532R$id.upgradeNowButton);
                            if (button3 != null) {
                                i = C17532R$id.upgradeWithSerialButton;
                                Button button4 = (Button) ViewBindings.findChildViewById(view, C17532R$id.upgradeWithSerialButton);
                                if (button4 != null) {
                                    return new C8019p((FrameLayout) view, editText, frameLayout, button, editText2, button2, button3, button4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8019p m33389c(@NonNull LayoutInflater layoutInflater) {
        return m33390d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C8019p m33390d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.activity_validate_purchase, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33388a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f19389a;
    }
}
