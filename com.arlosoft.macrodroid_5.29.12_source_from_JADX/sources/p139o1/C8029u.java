package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.widget.SquareMaterialCardView;

/* renamed from: o1.u */
/* compiled from: DialogQuickRunMacroBinding */
public final class C8029u implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final FrameLayout f19463a;
    @NonNull

    /* renamed from: b */
    public final ImageView f19464b;
    @NonNull

    /* renamed from: c */
    public final ImageView f19465c;
    @NonNull

    /* renamed from: d */
    public final TextView f19466d;
    @NonNull

    /* renamed from: e */
    public final ImageView f19467e;
    @NonNull

    /* renamed from: f */
    public final RecyclerView f19468f;
    @NonNull

    /* renamed from: g */
    public final FrameLayout f19469g;
    @NonNull

    /* renamed from: h */
    public final SquareMaterialCardView f19470h;
    @NonNull

    /* renamed from: i */
    public final TextView f19471i;
    @NonNull

    /* renamed from: j */
    public final ConstraintLayout f19472j;

    private C8029u(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull ImageView imageView3, @NonNull RecyclerView recyclerView, @NonNull FrameLayout frameLayout2, @NonNull SquareMaterialCardView squareMaterialCardView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout) {
        this.f19463a = frameLayout;
        this.f19464b = imageView;
        this.f19465c = imageView2;
        this.f19466d = textView;
        this.f19467e = imageView3;
        this.f19468f = recyclerView;
        this.f19469g = frameLayout2;
        this.f19470h = squareMaterialCardView;
        this.f19471i = textView2;
        this.f19472j = constraintLayout;
    }

    @NonNull
    /* renamed from: a */
    public static C8029u m33423a(@NonNull View view) {
        int i = C17532R$id.addButton;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C17532R$id.addButton);
        if (imageView != null) {
            i = C17532R$id.editButton;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, C17532R$id.editButton);
            if (imageView2 != null) {
                i = C17532R$id.emptyText;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.emptyText);
                if (textView != null) {
                    i = 2131362906;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, 2131362906);
                    if (imageView3 != null) {
                        i = C17532R$id.macroGrid;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C17532R$id.macroGrid);
                        if (recyclerView != null) {
                            FrameLayout frameLayout = (FrameLayout) view;
                            i = C17532R$id.tileContainer;
                            SquareMaterialCardView squareMaterialCardView = (SquareMaterialCardView) ViewBindings.findChildViewById(view, C17532R$id.tileContainer);
                            if (squareMaterialCardView != null) {
                                i = 2131364038;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, 2131364038);
                                if (textView2 != null) {
                                    i = C17532R$id.topLevelContainer;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, C17532R$id.topLevelContainer);
                                    if (constraintLayout != null) {
                                        return new C8029u(frameLayout, imageView, imageView2, textView, imageView3, recyclerView, frameLayout, squareMaterialCardView, textView2, constraintLayout);
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
    public static C8029u m33424c(@NonNull LayoutInflater layoutInflater) {
        return m33425d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C8029u m33425d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.dialog_quick_run_macro, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33423a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f19463a;
    }
}
