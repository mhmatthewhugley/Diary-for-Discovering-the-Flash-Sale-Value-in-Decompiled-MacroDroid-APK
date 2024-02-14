package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.i */
/* compiled from: ActivityMacrodroidProAdvert2Binding */
public final class C8005i implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final FrameLayout f19282a;
    @NonNull

    /* renamed from: b */
    public final ImageView f19283b;
    @NonNull

    /* renamed from: c */
    public final TextView f19284c;
    @NonNull

    /* renamed from: d */
    public final ImageView f19285d;
    @NonNull

    /* renamed from: e */
    public final TextView f19286e;
    @NonNull

    /* renamed from: f */
    public final ImageView f19287f;
    @NonNull

    /* renamed from: g */
    public final TextView f19288g;
    @NonNull

    /* renamed from: h */
    public final ImageView f19289h;
    @NonNull

    /* renamed from: i */
    public final LinearLayout f19290i;
    @NonNull

    /* renamed from: j */
    public final TextView f19291j;
    @NonNull

    /* renamed from: k */
    public final TextView f19292k;
    @NonNull

    /* renamed from: l */
    public final TextView f19293l;
    @NonNull

    /* renamed from: m */
    public final TextView f19294m;
    @NonNull

    /* renamed from: n */
    public final TextView f19295n;
    @NonNull

    /* renamed from: o */
    public final Button f19296o;

    private C8005i(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull ImageView imageView3, @NonNull TextView textView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull Button button) {
        this.f19282a = frameLayout;
        this.f19283b = imageView;
        this.f19284c = textView;
        this.f19285d = imageView2;
        this.f19286e = textView2;
        this.f19287f = imageView3;
        this.f19288g = textView3;
        this.f19289h = imageView4;
        this.f19290i = linearLayout;
        this.f19291j = textView4;
        this.f19292k = textView5;
        this.f19293l = textView6;
        this.f19294m = textView7;
        this.f19295n = textView8;
        this.f19296o = button;
    }

    @NonNull
    /* renamed from: a */
    public static C8005i m33339a(@NonNull View view) {
        View view2 = view;
        int i = C17532R$id.closeButton;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C17532R$id.closeButton);
        if (imageView != null) {
            i = C17532R$id.cloudBackupLabel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.cloudBackupLabel);
            if (textView != null) {
                i = C17532R$id.countDownBlockClose;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, C17532R$id.countDownBlockClose);
                if (imageView2 != null) {
                    i = C17532R$id.countdownText;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.countdownText);
                    if (textView2 != null) {
                        i = C17532R$id.endButton;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view2, C17532R$id.endButton);
                        if (imageView3 != null) {
                            i = C17532R$id.joinTheCommunityLabel;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.joinTheCommunityLabel);
                            if (textView3 != null) {
                                i = C17532R$id.logoImage;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view2, C17532R$id.logoImage);
                                if (imageView4 != null) {
                                    i = C17532R$id.macroDroidBox;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C17532R$id.macroDroidBox);
                                    if (linearLayout != null) {
                                        i = C17532R$id.macrodroidLabel;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.macrodroidLabel);
                                        if (textView4 != null) {
                                            i = C17532R$id.oneTimePaymentLabel;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.oneTimePaymentLabel);
                                            if (textView5 != null) {
                                                i = C17532R$id.proLabel;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.proLabel);
                                                if (textView6 != null) {
                                                    i = C17532R$id.removeAllAdvertsLabel;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.removeAllAdvertsLabel);
                                                    if (textView7 != null) {
                                                        i = C17532R$id.unlimitedMacrosLabel;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.unlimitedMacrosLabel);
                                                        if (textView8 != null) {
                                                            i = C17532R$id.upgradeNowButton;
                                                            Button button = (Button) ViewBindings.findChildViewById(view2, C17532R$id.upgradeNowButton);
                                                            if (button != null) {
                                                                return new C8005i((FrameLayout) view2, imageView, textView, imageView2, textView2, imageView3, textView3, imageView4, linearLayout, textView4, textView5, textView6, textView7, textView8, button);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8005i m33340c(@NonNull LayoutInflater layoutInflater) {
        return m33341d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C8005i m33341d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.activity_macrodroid_pro_advert_2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33339a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f19282a;
    }
}
