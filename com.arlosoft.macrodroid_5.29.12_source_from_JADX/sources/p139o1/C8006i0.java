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
import com.arlosoft.macrodroid.avatar.views.AvatarView;

/* renamed from: o1.i0 */
/* compiled from: ListItemMyUserSubscriptionBinding */
public final class C8006i0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final CardView f19297a;
    @NonNull

    /* renamed from: b */
    public final AvatarView f19298b;
    @NonNull

    /* renamed from: c */
    public final CardView f19299c;
    @NonNull

    /* renamed from: d */
    public final TextView f19300d;

    private C8006i0(@NonNull CardView cardView, @NonNull AvatarView avatarView, @NonNull CardView cardView2, @NonNull TextView textView) {
        this.f19297a = cardView;
        this.f19298b = avatarView;
        this.f19299c = cardView2;
        this.f19300d = textView;
    }

    @NonNull
    /* renamed from: a */
    public static C8006i0 m33343a(@NonNull View view) {
        int i = C17532R$id.avatarImage;
        AvatarView avatarView = (AvatarView) ViewBindings.findChildViewById(view, C17532R$id.avatarImage);
        if (avatarView != null) {
            CardView cardView = (CardView) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.maroName);
            if (textView != null) {
                return new C8006i0(cardView, avatarView, cardView, textView);
            }
            i = C17532R$id.maroName;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8006i0 m33344c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.list_item_my_user_subscription, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33343a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public CardView getRoot() {
        return this.f19297a;
    }
}
