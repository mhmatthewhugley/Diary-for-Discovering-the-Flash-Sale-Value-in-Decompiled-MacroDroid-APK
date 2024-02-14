package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.n */
/* compiled from: ActivityTranslationsBinding */
public final class C8015n implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final LinearLayout f19357a;
    @NonNull

    /* renamed from: b */
    public final RecyclerView f19358b;
    @NonNull

    /* renamed from: c */
    public final FrameLayout f19359c;
    @NonNull

    /* renamed from: d */
    public final NestedScrollView f19360d;
    @NonNull

    /* renamed from: e */
    public final Toolbar f19361e;

    private C8015n(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull FrameLayout frameLayout, @NonNull NestedScrollView nestedScrollView, @NonNull Toolbar toolbar) {
        this.f19357a = linearLayout;
        this.f19358b = recyclerView;
        this.f19359c = frameLayout;
        this.f19360d = nestedScrollView;
        this.f19361e = toolbar;
    }

    @NonNull
    /* renamed from: a */
    public static C8015n m33374a(@NonNull View view) {
        int i = C17532R$id.languageEntries;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C17532R$id.languageEntries);
        if (recyclerView != null) {
            i = C17532R$id.loadingView;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, C17532R$id.loadingView);
            if (frameLayout != null) {
                i = 2131363679;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, 2131363679);
                if (nestedScrollView != null) {
                    i = 2131364057;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, 2131364057);
                    if (toolbar != null) {
                        return new C8015n((LinearLayout) view, recyclerView, frameLayout, nestedScrollView, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8015n m33375c(@NonNull LayoutInflater layoutInflater) {
        return m33376d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C8015n m33376d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.activity_translations, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33374a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f19357a;
    }
}
