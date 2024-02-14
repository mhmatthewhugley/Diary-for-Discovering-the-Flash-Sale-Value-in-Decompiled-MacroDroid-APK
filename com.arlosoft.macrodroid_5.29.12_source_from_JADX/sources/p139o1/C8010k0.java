package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.k0 */
/* compiled from: ListItemReportCommentBinding */
public final class C8010k0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final FrameLayout f19326a;
    @NonNull

    /* renamed from: b */
    public final TextView f19327b;

    private C8010k0(@NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.f19326a = frameLayout;
        this.f19327b = textView;
    }

    @NonNull
    /* renamed from: a */
    public static C8010k0 m33357a(@NonNull View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.commentText);
        if (textView != null) {
            return new C8010k0((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(C17532R$id.commentText)));
    }

    @NonNull
    /* renamed from: c */
    public static C8010k0 m33358c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.list_item_report_comment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33357a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f19326a;
    }
}
