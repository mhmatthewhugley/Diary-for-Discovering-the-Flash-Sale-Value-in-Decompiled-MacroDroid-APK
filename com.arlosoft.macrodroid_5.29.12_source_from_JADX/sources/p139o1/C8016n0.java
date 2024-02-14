package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.avatar.views.AvatarView;

/* renamed from: o1.n0 */
/* compiled from: ListItemSubscriptionUpdateBinding */
public final class C8016n0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final CardView f19362a;
    @NonNull

    /* renamed from: b */
    public final AvatarView f19363b;
    @NonNull

    /* renamed from: c */
    public final CardView f19364c;
    @NonNull

    /* renamed from: d */
    public final ImageView f19365d;
    @NonNull

    /* renamed from: e */
    public final LinearLayout f19366e;
    @NonNull

    /* renamed from: f */
    public final TextView f19367f;
    @NonNull

    /* renamed from: g */
    public final TextView f19368g;
    @NonNull

    /* renamed from: h */
    public final TextView f19369h;
    @NonNull

    /* renamed from: i */
    public final FrameLayout f19370i;
    @NonNull

    /* renamed from: j */
    public final TextView f19371j;

    private C8016n0(@NonNull CardView cardView, @NonNull AvatarView avatarView, @NonNull CardView cardView2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull FrameLayout frameLayout, @NonNull TextView textView4) {
        this.f19362a = cardView;
        this.f19363b = avatarView;
        this.f19364c = cardView2;
        this.f19365d = imageView;
        this.f19366e = linearLayout;
        this.f19367f = textView;
        this.f19368g = textView2;
        this.f19369h = textView3;
        this.f19370i = frameLayout;
        this.f19371j = textView4;
    }

    @NonNull
    /* renamed from: a */
    public static C8016n0 m33378a(@NonNull View view) {
        int i = C17532R$id.avatarImage;
        AvatarView avatarView = (AvatarView) ViewBindings.findChildViewById(view, C17532R$id.avatarImage);
        if (avatarView != null) {
            CardView cardView = (CardView) view;
            i = 2131362906;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, 2131362906);
            if (imageView != null) {
                i = C17532R$id.item;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C17532R$id.item);
                if (linearLayout != null) {
                    i = C17532R$id.timeLabel;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.timeLabel);
                    if (textView != null) {
                        i = 2131364038;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, 2131364038);
                        if (textView2 != null) {
                            i = C17532R$id.updateText;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.updateText);
                            if (textView3 != null) {
                                i = C17532R$id.userContainer;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, C17532R$id.userContainer);
                                if (frameLayout != null) {
                                    i = C17532R$id.userNameLabel;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.userNameLabel);
                                    if (textView4 != null) {
                                        return new C8016n0(cardView, avatarView, cardView, imageView, linearLayout, textView, textView2, textView3, frameLayout, textView4);
                                    }
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
    public static C8016n0 m33379c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.list_item_subscription_update, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33378a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public CardView getRoot() {
        return this.f19362a;
    }
}
