package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17535R$layout;
import com.google.android.material.card.MaterialCardView;

/* renamed from: o1.t0 */
/* compiled from: ViewVideosEntryBinding */
public final class C8028t0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final MaterialCardView f19459a;
    @NonNull

    /* renamed from: b */
    public final MaterialCardView f19460b;
    @NonNull

    /* renamed from: c */
    public final ImageView f19461c;
    @NonNull

    /* renamed from: d */
    public final TextView f19462d;

    private C8028t0(@NonNull MaterialCardView materialCardView, @NonNull MaterialCardView materialCardView2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f19459a = materialCardView;
        this.f19460b = materialCardView2;
        this.f19461c = imageView;
        this.f19462d = textView;
    }

    @NonNull
    /* renamed from: a */
    public static C8028t0 m33420a(@NonNull View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i = 2131362929;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, 2131362929);
        if (imageView != null) {
            i = 2131364038;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, 2131364038);
            if (textView != null) {
                return new C8028t0(materialCardView, materialCardView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8028t0 m33421c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.view_videos_entry, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33420a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public MaterialCardView getRoot() {
        return this.f19459a;
    }
}
