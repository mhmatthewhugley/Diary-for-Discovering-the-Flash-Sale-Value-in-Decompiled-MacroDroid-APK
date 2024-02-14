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

/* renamed from: o1.f0 */
/* compiled from: ListItemActionBlockTestOutputBinding */
public final class C8000f0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final MaterialCardView f19264a;
    @NonNull

    /* renamed from: b */
    public final LinearLayout f19265b;
    @NonNull

    /* renamed from: c */
    public final TextView f19266c;
    @NonNull

    /* renamed from: d */
    public final TextView f19267d;
    @NonNull

    /* renamed from: e */
    public final TextView f19268e;

    private C8000f0(@NonNull MaterialCardView materialCardView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f19264a = materialCardView;
        this.f19265b = linearLayout;
        this.f19266c = textView;
        this.f19267d = textView2;
        this.f19268e = textView3;
    }

    @NonNull
    /* renamed from: a */
    public static C8000f0 m33322a(@NonNull View view) {
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
                        return new C8000f0((MaterialCardView) view, linearLayout, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8000f0 m33323c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.list_item_action_block_test_output, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33322a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public MaterialCardView getRoot() {
        return this.f19264a;
    }
}
