package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.h */
/* compiled from: ActivityMacroLogFilterBinding */
public final class C8003h implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final LinearLayout f19274a;
    @NonNull

    /* renamed from: b */
    public final LinearLayout f19275b;
    @NonNull

    /* renamed from: c */
    public final TextView f19276c;
    @NonNull

    /* renamed from: d */
    public final RecyclerView f19277d;
    @NonNull

    /* renamed from: e */
    public final Toolbar f19278e;

    private C8003h(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull Toolbar toolbar) {
        this.f19274a = linearLayout;
        this.f19275b = linearLayout2;
        this.f19276c = textView;
        this.f19277d = recyclerView;
        this.f19278e = toolbar;
    }

    @NonNull
    /* renamed from: a */
    public static C8003h m33332a(@NonNull View view) {
        int i = C17532R$id.emptyView;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C17532R$id.emptyView);
        if (linearLayout != null) {
            i = C17532R$id.macrolist_emptyLabel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.macrolist_emptyLabel);
            if (textView != null) {
                i = C17532R$id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C17532R$id.recyclerView);
                if (recyclerView != null) {
                    i = 2131364057;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, 2131364057);
                    if (toolbar != null) {
                        return new C8003h((LinearLayout) view, linearLayout, textView, recyclerView, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8003h m33333c(@NonNull LayoutInflater layoutInflater) {
        return m33334d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C8003h m33334d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.activity_macro_log_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33332a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f19274a;
    }
}
