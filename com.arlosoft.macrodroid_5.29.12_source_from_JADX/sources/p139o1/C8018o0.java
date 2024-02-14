package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.google.android.material.card.MaterialCardView;

/* renamed from: o1.o0 */
/* compiled from: ListItemVariableMultiEntryBinding */
public final class C8018o0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final MaterialCardView f19384a;
    @NonNull

    /* renamed from: b */
    public final LinearLayout f19385b;
    @NonNull

    /* renamed from: c */
    public final TextView f19386c;
    @NonNull

    /* renamed from: d */
    public final TextView f19387d;
    @NonNull

    /* renamed from: e */
    public final TextView f19388e;

    private C8018o0(@NonNull MaterialCardView materialCardView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f19384a = materialCardView;
        this.f19385b = linearLayout;
        this.f19386c = textView;
        this.f19387d = textView2;
        this.f19388e = textView3;
    }

    @NonNull
    /* renamed from: a */
    public static C8018o0 m33385a(@NonNull View view) {
        int i = 2131362381;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, 2131362381);
        if (linearLayout != null) {
            i = C17532R$id.key;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.key);
            if (textView != null) {
                i = C17532R$id.typeLabel;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.typeLabel);
                if (textView2 != null) {
                    i = C17532R$id.value;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.value);
                    if (textView3 != null) {
                        return new C8018o0((MaterialCardView) view, linearLayout, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8018o0 m33386c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.list_item_variable_multi_entry, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33385a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public MaterialCardView getRoot() {
        return this.f19384a;
    }
}
