package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.g0 */
/* compiled from: ListItemKeepAccessibilityRunningBinding */
public final class C8002g0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final LinearLayout f19271a;
    @NonNull

    /* renamed from: b */
    public final CheckBox f19272b;
    @NonNull

    /* renamed from: c */
    public final TextView f19273c;

    private C8002g0(@NonNull LinearLayout linearLayout, @NonNull CheckBox checkBox, @NonNull TextView textView) {
        this.f19271a = linearLayout;
        this.f19272b = checkBox;
        this.f19273c = textView;
    }

    @NonNull
    /* renamed from: a */
    public static C8002g0 m33329a(@NonNull View view) {
        int i = C17532R$id.enabledState;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, C17532R$id.enabledState);
        if (checkBox != null) {
            i = 2131363335;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, 2131363335);
            if (textView != null) {
                return new C8002g0((LinearLayout) view, checkBox, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8002g0 m33330c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.list_item_keep_accessibility_running, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33329a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f19271a;
    }
}
