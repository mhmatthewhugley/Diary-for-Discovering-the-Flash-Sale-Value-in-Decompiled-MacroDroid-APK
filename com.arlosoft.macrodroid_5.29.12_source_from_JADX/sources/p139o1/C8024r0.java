package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.r0 */
/* compiled from: ViewTranslationEntryBinding */
public final class C8024r0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final CardView f19426a;
    @NonNull

    /* renamed from: b */
    public final FrameLayout f19427b;
    @NonNull

    /* renamed from: c */
    public final ImageView f19428c;
    @NonNull

    /* renamed from: d */
    public final ConstraintLayout f19429d;
    @NonNull

    /* renamed from: e */
    public final TextView f19430e;
    @NonNull

    /* renamed from: f */
    public final TextView f19431f;
    @NonNull

    /* renamed from: g */
    public final TextView f19432g;

    private C8024r0(@NonNull CardView cardView, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f19426a = cardView;
        this.f19427b = frameLayout;
        this.f19428c = imageView;
        this.f19429d = constraintLayout;
        this.f19430e = textView;
        this.f19431f = textView2;
        this.f19432g = textView3;
    }

    @NonNull
    /* renamed from: a */
    public static C8024r0 m33406a(@NonNull View view) {
        int i = C17532R$id.flagContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, C17532R$id.flagContainer);
        if (frameLayout != null) {
            i = C17532R$id.flagImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C17532R$id.flagImage);
            if (imageView != null) {
                i = C17532R$id.languageContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, C17532R$id.languageContainer);
                if (constraintLayout != null) {
                    i = C17532R$id.languageEnglish;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.languageEnglish);
                    if (textView != null) {
                        i = C17532R$id.languageName;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.languageName);
                        if (textView2 != null) {
                            i = C17532R$id.percentComplete;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.percentComplete);
                            if (textView3 != null) {
                                return new C8024r0((CardView) view, frameLayout, imageView, constraintLayout, textView, textView2, textView3);
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
    public static C8024r0 m33407c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.view_translation_entry, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33406a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public CardView getRoot() {
        return this.f19426a;
    }
}
