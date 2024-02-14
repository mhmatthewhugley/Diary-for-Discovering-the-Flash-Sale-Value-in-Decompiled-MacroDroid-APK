package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.o */
/* compiled from: ActivityUpgrade2Binding */
public final class C8017o implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final FrameLayout f19372a;
    @NonNull

    /* renamed from: b */
    public final LinearLayout f19373b;
    @NonNull

    /* renamed from: c */
    public final TextView f19374c;
    @NonNull

    /* renamed from: d */
    public final TextView f19375d;
    @NonNull

    /* renamed from: e */
    public final TextView f19376e;
    @NonNull

    /* renamed from: f */
    public final FrameLayout f19377f;
    @NonNull

    /* renamed from: g */
    public final TextView f19378g;
    @NonNull

    /* renamed from: h */
    public final ViewFlipper f19379h;
    @NonNull

    /* renamed from: i */
    public final RecyclerView f19380i;
    @NonNull

    /* renamed from: j */
    public final Toolbar f19381j;
    @NonNull

    /* renamed from: k */
    public final Button f19382k;
    @NonNull

    /* renamed from: l */
    public final TextView f19383l;

    private C8017o(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull FrameLayout frameLayout2, @NonNull TextView textView4, @NonNull ViewFlipper viewFlipper, @NonNull RecyclerView recyclerView, @NonNull Toolbar toolbar, @NonNull Button button, @NonNull TextView textView5) {
        this.f19372a = frameLayout;
        this.f19373b = linearLayout;
        this.f19374c = textView;
        this.f19375d = textView2;
        this.f19376e = textView3;
        this.f19377f = frameLayout2;
        this.f19378g = textView4;
        this.f19379h = viewFlipper;
        this.f19380i = recyclerView;
        this.f19381j = toolbar;
        this.f19382k = button;
        this.f19383l = textView5;
    }

    @NonNull
    /* renamed from: a */
    public static C8017o m33381a(@NonNull View view) {
        int i = C17532R$id.flashSaleContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C17532R$id.flashSaleContainer);
        if (linearLayout != null) {
            i = C17532R$id.flashSaleTimeRemaining;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.flashSaleTimeRemaining);
            if (textView != null) {
                i = C17532R$id.flashSaleTitle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.flashSaleTitle);
                if (textView2 != null) {
                    i = C17532R$id.helpButton;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.helpButton);
                    if (textView3 != null) {
                        i = C17532R$id.priceContainer;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, C17532R$id.priceContainer);
                        if (frameLayout != null) {
                            i = C17532R$id.priceText;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.priceText);
                            if (textView4 != null) {
                                i = C17532R$id.priceViewFlipper;
                                ViewFlipper viewFlipper = (ViewFlipper) ViewBindings.findChildViewById(view, C17532R$id.priceViewFlipper);
                                if (viewFlipper != null) {
                                    i = C17532R$id.recyclerView;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C17532R$id.recyclerView);
                                    if (recyclerView != null) {
                                        i = 2131364057;
                                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, 2131364057);
                                        if (toolbar != null) {
                                            i = C17532R$id.upgradeNowButton;
                                            Button button = (Button) ViewBindings.findChildViewById(view, C17532R$id.upgradeNowButton);
                                            if (button != null) {
                                                i = C17532R$id.wasPrice;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.wasPrice);
                                                if (textView5 != null) {
                                                    return new C8017o((FrameLayout) view, linearLayout, textView, textView2, textView3, frameLayout, textView4, viewFlipper, recyclerView, toolbar, button, textView5);
                                                }
                                            }
                                        }
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
    public static C8017o m33382c(@NonNull LayoutInflater layoutInflater) {
        return m33383d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C8017o m33383d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.activity_upgrade_2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33381a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f19372a;
    }
}
