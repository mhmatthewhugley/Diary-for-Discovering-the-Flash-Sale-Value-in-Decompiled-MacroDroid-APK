package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.c0 */
/* compiled from: FragmentTemplateStoreMySubscriptionsBinding */
public final class C7994c0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final FrameLayout f19233a;
    @NonNull

    /* renamed from: b */
    public final TextView f19234b;
    @NonNull

    /* renamed from: c */
    public final LinearLayout f19235c;
    @NonNull

    /* renamed from: d */
    public final LottieAnimationView f19236d;
    @NonNull

    /* renamed from: e */
    public final RecyclerView f19237e;

    private C7994c0(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull RecyclerView recyclerView) {
        this.f19233a = frameLayout;
        this.f19234b = textView;
        this.f19235c = linearLayout;
        this.f19236d = lottieAnimationView;
        this.f19237e = recyclerView;
    }

    @NonNull
    /* renamed from: a */
    public static C7994c0 m33303a(@NonNull View view) {
        int i = C17532R$id.emptyMessageText;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.emptyMessageText);
        if (textView != null) {
            i = C17532R$id.emptyView;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C17532R$id.emptyView);
            if (linearLayout != null) {
                i = C17532R$id.loadingView;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, C17532R$id.loadingView);
                if (lottieAnimationView != null) {
                    i = C17532R$id.updatesList;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C17532R$id.updatesList);
                    if (recyclerView != null) {
                        return new C7994c0((FrameLayout) view, textView, linearLayout, lottieAnimationView, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C7994c0 m33304c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_template_store_my_subscriptions, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33303a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f19233a;
    }
}
