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

/* renamed from: o1.s0 */
/* compiled from: ViewVariableFilterEntryBinding */
public final class C8026s0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final LinearLayout f19441a;
    @NonNull

    /* renamed from: b */
    public final CheckBox f19442b;
    @NonNull

    /* renamed from: c */
    public final TextView f19443c;

    private C8026s0(@NonNull LinearLayout linearLayout, @NonNull CheckBox checkBox, @NonNull TextView textView) {
        this.f19441a = linearLayout;
        this.f19442b = checkBox;
        this.f19443c = textView;
    }

    @NonNull
    /* renamed from: a */
    public static C8026s0 m33413a(@NonNull View view) {
        int i = C17532R$id.filterEnabledCheckbox;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, C17532R$id.filterEnabledCheckbox);
        if (checkBox != null) {
            i = C17532R$id.variableName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.variableName);
            if (textView != null) {
                return new C8026s0((LinearLayout) view, checkBox, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8026s0 m33414c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.view_variable_filter_entry, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33413a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f19441a;
    }
}
