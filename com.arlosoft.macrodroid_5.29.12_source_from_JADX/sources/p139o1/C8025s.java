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

/* renamed from: o1.s */
/* compiled from: DialogFavouritesBinding */
public final class C8025s implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final FrameLayout f19433a;
    @NonNull

    /* renamed from: b */
    public final TextView f19434b;
    @NonNull

    /* renamed from: c */
    public final ImageView f19435c;
    @NonNull

    /* renamed from: d */
    public final RecyclerView f19436d;
    @NonNull

    /* renamed from: e */
    public final FrameLayout f19437e;
    @NonNull

    /* renamed from: f */
    public final SquareMaterialCardView f19438f;
    @NonNull

    /* renamed from: g */
    public final TextView f19439g;
    @NonNull

    /* renamed from: h */
    public final ConstraintLayout f19440h;

    private C8025s(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull FrameLayout frameLayout2, @NonNull SquareMaterialCardView squareMaterialCardView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout) {
        this.f19433a = frameLayout;
        this.f19434b = textView;
        this.f19435c = imageView;
        this.f19436d = recyclerView;
        this.f19437e = frameLayout2;
        this.f19438f = squareMaterialCardView;
        this.f19439g = textView2;
        this.f19440h = constraintLayout;
    }

    @NonNull
    /* renamed from: a */
    public static C8025s m33409a(@NonNull View view) {
        int i = C17532R$id.emptyText;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.emptyText);
        if (textView != null) {
            i = 2131362906;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, 2131362906);
            if (imageView != null) {
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
                                return new C8025s(frameLayout, textView, imageView, recyclerView, frameLayout, squareMaterialCardView, textView2, constraintLayout);
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
    public static C8025s m33410c(@NonNull LayoutInflater layoutInflater) {
        return m33411d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C8025s m33411d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.dialog_favourites, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33409a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f19433a;
    }
}
