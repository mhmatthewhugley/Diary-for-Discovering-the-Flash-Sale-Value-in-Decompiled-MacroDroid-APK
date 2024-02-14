package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.q */
/* compiled from: ActivityVariableLogFilterBinding */
public final class C8021q implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final LinearLayout f19407a;
    @NonNull

    /* renamed from: b */
    public final LottieAnimationView f19408b;
    @NonNull

    /* renamed from: c */
    public final LinearLayout f19409c;
    @NonNull

    /* renamed from: d */
    public final RecyclerView f19410d;
    @NonNull

    /* renamed from: e */
    public final Toolbar f19411e;

    private C8021q(@NonNull LinearLayout linearLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull Toolbar toolbar) {
        this.f19407a = linearLayout;
        this.f19408b = lottieAnimationView;
        this.f19409c = linearLayout2;
        this.f19410d = recyclerView;
        this.f19411e = toolbar;
    }

    @NonNull
    /* renamed from: a */
    public static C8021q m33395a(@NonNull View view) {
        int i = C17532R$id.animation_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, C17532R$id.animation_view);
        if (lottieAnimationView != null) {
            i = C17532R$id.emptyView;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C17532R$id.emptyView);
            if (linearLayout != null) {
                i = C17532R$id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C17532R$id.recyclerView);
                if (recyclerView != null) {
                    i = 2131364057;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, 2131364057);
                    if (toolbar != null) {
                        return new C8021q((LinearLayout) view, lottieAnimationView, linearLayout, recyclerView, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8021q m33396c(@NonNull LayoutInflater layoutInflater) {
        return m33397d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C8021q m33397d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.activity_variable_log_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33395a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f19407a;
    }
}
