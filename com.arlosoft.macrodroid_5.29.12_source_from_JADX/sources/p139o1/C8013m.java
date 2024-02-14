package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.widget.BetterCheckBox;

/* renamed from: o1.m */
/* compiled from: ActivitySystemLogBinding */
public final class C8013m implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final LinearLayout f19336a;
    @NonNull

    /* renamed from: b */
    public final LottieAnimationView f19337b;
    @NonNull

    /* renamed from: c */
    public final LinearLayout f19338c;
    @NonNull

    /* renamed from: d */
    public final LinearLayout f19339d;
    @NonNull

    /* renamed from: e */
    public final C7998e0 f19340e;
    @NonNull

    /* renamed from: f */
    public final Spinner f19341f;
    @NonNull

    /* renamed from: g */
    public final Button f19342g;
    @NonNull

    /* renamed from: h */
    public final TextView f19343h;
    @NonNull

    /* renamed from: i */
    public final RecyclerView f19344i;
    @NonNull

    /* renamed from: j */
    public final LinearLayout f19345j;
    @NonNull

    /* renamed from: k */
    public final BetterCheckBox f19346k;
    @NonNull

    /* renamed from: l */
    public final BetterCheckBox f19347l;
    @NonNull

    /* renamed from: m */
    public final BetterCheckBox f19348m;
    @NonNull

    /* renamed from: n */
    public final TextView f19349n;
    @NonNull

    /* renamed from: o */
    public final Toolbar f19350o;
    @NonNull

    /* renamed from: p */
    public final Button f19351p;
    @NonNull

    /* renamed from: q */
    public final ViewFlipper f19352q;

    private C8013m(@NonNull LinearLayout linearLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull C7998e0 e0Var, @NonNull Spinner spinner, @NonNull Button button, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout4, @NonNull BetterCheckBox betterCheckBox, @NonNull BetterCheckBox betterCheckBox2, @NonNull BetterCheckBox betterCheckBox3, @NonNull TextView textView2, @NonNull Toolbar toolbar, @NonNull Button button2, @NonNull ViewFlipper viewFlipper) {
        this.f19336a = linearLayout;
        this.f19337b = lottieAnimationView;
        this.f19338c = linearLayout2;
        this.f19339d = linearLayout3;
        this.f19340e = e0Var;
        this.f19341f = spinner;
        this.f19342g = button;
        this.f19343h = textView;
        this.f19344i = recyclerView;
        this.f19345j = linearLayout4;
        this.f19346k = betterCheckBox;
        this.f19347l = betterCheckBox2;
        this.f19348m = betterCheckBox3;
        this.f19349n = textView2;
        this.f19350o = toolbar;
        this.f19351p = button2;
        this.f19352q = viewFlipper;
    }

    @NonNull
    /* renamed from: a */
    public static C8013m m33367a(@NonNull View view) {
        View view2 = view;
        int i = C17532R$id.animationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view2, C17532R$id.animationView);
        if (lottieAnimationView != null) {
            i = C17532R$id.emptyView;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C17532R$id.emptyView);
            if (linearLayout != null) {
                i = C17532R$id.filterPanel;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view2, C17532R$id.filterPanel);
                if (linearLayout2 != null) {
                    i = C17532R$id.infoCard;
                    View findChildViewById = ViewBindings.findChildViewById(view2, C17532R$id.infoCard);
                    if (findChildViewById != null) {
                        C7998e0 a = C7998e0.m33316a(findChildViewById);
                        i = C17532R$id.logLevelSpinner;
                        Spinner spinner = (Spinner) ViewBindings.findChildViewById(view2, C17532R$id.logLevelSpinner);
                        if (spinner != null) {
                            i = C17532R$id.macroFilterButton;
                            Button button = (Button) ViewBindings.findChildViewById(view2, C17532R$id.macroFilterButton);
                            if (button != null) {
                                i = C17532R$id.macroName;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.macroName);
                                if (textView != null) {
                                    i = C17532R$id.recyclerView;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, C17532R$id.recyclerView);
                                    if (recyclerView != null) {
                                        LinearLayout linearLayout3 = (LinearLayout) view2;
                                        i = C17532R$id.showActions;
                                        BetterCheckBox betterCheckBox = (BetterCheckBox) ViewBindings.findChildViewById(view2, C17532R$id.showActions);
                                        if (betterCheckBox != null) {
                                            i = C17532R$id.showConstraints;
                                            BetterCheckBox betterCheckBox2 = (BetterCheckBox) ViewBindings.findChildViewById(view2, C17532R$id.showConstraints);
                                            if (betterCheckBox2 != null) {
                                                i = C17532R$id.showTriggers;
                                                BetterCheckBox betterCheckBox3 = (BetterCheckBox) ViewBindings.findChildViewById(view2, C17532R$id.showTriggers);
                                                if (betterCheckBox3 != null) {
                                                    i = 2131364038;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, 2131364038);
                                                    if (textView2 != null) {
                                                        i = 2131364057;
                                                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view2, 2131364057);
                                                        if (toolbar != null) {
                                                            i = C17532R$id.variablesFilterButton;
                                                            Button button2 = (Button) ViewBindings.findChildViewById(view2, C17532R$id.variablesFilterButton);
                                                            if (button2 != null) {
                                                                i = C17532R$id.viewFlipper;
                                                                ViewFlipper viewFlipper = (ViewFlipper) ViewBindings.findChildViewById(view2, C17532R$id.viewFlipper);
                                                                if (viewFlipper != null) {
                                                                    return new C8013m(linearLayout3, lottieAnimationView, linearLayout, linearLayout2, a, spinner, button, textView, recyclerView, linearLayout3, betterCheckBox, betterCheckBox2, betterCheckBox3, textView2, toolbar, button2, viewFlipper);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8013m m33368c(@NonNull LayoutInflater layoutInflater) {
        return m33369d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C8013m m33369d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.activity_system_log, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33367a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f19336a;
    }
}
