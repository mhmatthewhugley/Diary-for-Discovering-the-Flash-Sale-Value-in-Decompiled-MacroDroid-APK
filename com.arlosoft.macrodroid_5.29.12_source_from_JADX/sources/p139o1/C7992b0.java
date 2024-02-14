package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.b0 */
/* compiled from: FragmentTemplateStoreListUpdatesBinding */
public final class C7992b0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final FrameLayout f19223a;
    @NonNull

    /* renamed from: b */
    public final LinearLayout f19224b;
    @NonNull

    /* renamed from: c */
    public final LottieAnimationView f19225c;
    @NonNull

    /* renamed from: d */
    public final RecyclerView f19226d;

    private C7992b0(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull RecyclerView recyclerView) {
        this.f19223a = frameLayout;
        this.f19224b = linearLayout;
        this.f19225c = lottieAnimationView;
        this.f19226d = recyclerView;
    }

    @NonNull
    /* renamed from: a */
    public static C7992b0 m33296a(@NonNull View view) {
        int i = C17532R$id.emptyView;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C17532R$id.emptyView);
        if (linearLayout != null) {
            i = C17532R$id.loadingView;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, C17532R$id.loadingView);
            if (lottieAnimationView != null) {
                i = C17532R$id.updatesList;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C17532R$id.updatesList);
                if (recyclerView != null) {
                    return new C7992b0((FrameLayout) view, linearLayout, lottieAnimationView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C7992b0 m33297c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_template_store_list_updates, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33296a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f19223a;
    }
}
