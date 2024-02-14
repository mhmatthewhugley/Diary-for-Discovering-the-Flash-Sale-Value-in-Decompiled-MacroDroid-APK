package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.h0 */
/* compiled from: ListItemMyMacroSubscriptionBinding */
public final class C8004h0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final CardView f19279a;
    @NonNull

    /* renamed from: b */
    public final CardView f19280b;
    @NonNull

    /* renamed from: c */
    public final TextView f19281c;

    private C8004h0(@NonNull CardView cardView, @NonNull CardView cardView2, @NonNull TextView textView) {
        this.f19279a = cardView;
        this.f19280b = cardView2;
        this.f19281c = textView;
    }

    @NonNull
    /* renamed from: a */
    public static C8004h0 m33336a(@NonNull View view) {
        CardView cardView = (CardView) view;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.maroName);
        if (textView != null) {
            return new C8004h0(cardView, cardView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(C17532R$id.maroName)));
    }

    @NonNull
    /* renamed from: c */
    public static C8004h0 m33337c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.list_item_my_macro_subscription, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33336a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public CardView getRoot() {
        return this.f19279a;
    }
}
