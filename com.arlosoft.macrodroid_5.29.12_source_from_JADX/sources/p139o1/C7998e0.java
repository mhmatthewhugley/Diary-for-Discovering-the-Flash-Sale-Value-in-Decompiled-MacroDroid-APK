package p139o1;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;

/* renamed from: o1.e0 */
/* compiled from: InfoCardBinding */
public final class C7998e0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final CardView f19252a;
    @NonNull

    /* renamed from: b */
    public final LinearLayout f19253b;
    @NonNull

    /* renamed from: c */
    public final TextView f19254c;
    @NonNull

    /* renamed from: d */
    public final Button f19255d;
    @NonNull

    /* renamed from: e */
    public final TextView f19256e;
    @NonNull

    /* renamed from: f */
    public final CardView f19257f;

    private C7998e0(@NonNull CardView cardView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull Button button, @NonNull TextView textView2, @NonNull CardView cardView2) {
        this.f19252a = cardView;
        this.f19253b = linearLayout;
        this.f19254c = textView;
        this.f19255d = button;
        this.f19256e = textView2;
        this.f19257f = cardView2;
    }

    @NonNull
    /* renamed from: a */
    public static C7998e0 m33316a(@NonNull View view) {
        int i = C17532R$id.info_card;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C17532R$id.info_card);
        if (linearLayout != null) {
            i = C17532R$id.infoCardDetail;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.infoCardDetail);
            if (textView != null) {
                i = C17532R$id.infoCardGotIt;
                Button button = (Button) ViewBindings.findChildViewById(view, C17532R$id.infoCardGotIt);
                if (button != null) {
                    i = C17532R$id.infoCardTitle;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.infoCardTitle);
                    if (textView2 != null) {
                        CardView cardView = (CardView) view;
                        return new C7998e0(cardView, linearLayout, textView, button, textView2, cardView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: b */
    public CardView getRoot() {
        return this.f19252a;
    }
}
