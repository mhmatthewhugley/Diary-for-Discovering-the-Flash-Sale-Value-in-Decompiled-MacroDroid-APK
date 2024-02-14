package p139o1;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.navigation.NavigationView;
import com.hanks.htextview.scale.ScaleTextView;
import net.cachapa.expandablelayout.ExpandableLayout;

/* renamed from: o1.w */
/* compiled from: FragmentHomeBinding */
public final class C8031w implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final DrawerLayout f19486a;
    @NonNull

    /* renamed from: b */
    public final AppBarLayout f19487b;
    @NonNull

    /* renamed from: c */
    public final View f19488c;
    @NonNull

    /* renamed from: d */
    public final Button f19489d;
    @NonNull

    /* renamed from: e */
    public final ImageButton f19490e;
    @NonNull

    /* renamed from: f */
    public final DrawerLayout f19491f;
    @NonNull

    /* renamed from: g */
    public final ScaleTextView f19492g;
    @NonNull

    /* renamed from: h */
    public final TextView f19493h;
    @NonNull

    /* renamed from: i */
    public final RecyclerView f19494i;
    @NonNull

    /* renamed from: j */
    public final ExpandableLayout f19495j;
    @NonNull

    /* renamed from: k */
    public final FrameLayout f19496k;
    @NonNull

    /* renamed from: l */
    public final ImageView f19497l;
    @NonNull

    /* renamed from: m */
    public final TextView f19498m;
    @NonNull

    /* renamed from: n */
    public final NavigationView f19499n;
    @NonNull

    /* renamed from: o */
    public final SwitchCompat f19500o;
    @NonNull

    /* renamed from: p */
    public final ShimmerFrameLayout f19501p;
    @NonNull

    /* renamed from: q */
    public final TextView f19502q;
    @NonNull

    /* renamed from: r */
    public final Toolbar f19503r;
    @NonNull

    /* renamed from: s */
    public final LinearLayout f19504s;
    @NonNull

    /* renamed from: t */
    public final LinearLayout f19505t;
    @NonNull

    /* renamed from: u */
    public final Button f19506u;
    @NonNull

    /* renamed from: v */
    public final TextView f19507v;

    private C8031w(@NonNull DrawerLayout drawerLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, @NonNull Button button, @NonNull ImageButton imageButton, @NonNull DrawerLayout drawerLayout2, @NonNull ScaleTextView scaleTextView, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull ExpandableLayout expandableLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull NavigationView navigationView, @NonNull SwitchCompat switchCompat, @NonNull ShimmerFrameLayout shimmerFrameLayout, @NonNull TextView textView3, @NonNull Toolbar toolbar, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull Button button2, @NonNull TextView textView4) {
        this.f19486a = drawerLayout;
        this.f19487b = appBarLayout;
        this.f19488c = view;
        this.f19489d = button;
        this.f19490e = imageButton;
        this.f19491f = drawerLayout2;
        this.f19492g = scaleTextView;
        this.f19493h = textView;
        this.f19494i = recyclerView;
        this.f19495j = expandableLayout;
        this.f19496k = frameLayout;
        this.f19497l = imageView;
        this.f19498m = textView2;
        this.f19499n = navigationView;
        this.f19500o = switchCompat;
        this.f19501p = shimmerFrameLayout;
        this.f19502q = textView3;
        this.f19503r = toolbar;
        this.f19504s = linearLayout;
        this.f19505t = linearLayout2;
        this.f19506u = button2;
        this.f19507v = textView4;
    }

    @NonNull
    /* renamed from: a */
    public static C8031w m33430a(@NonNull View view) {
        View view2 = view;
        int i = C17532R$id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view2, C17532R$id.appBarLayout);
        if (appBarLayout != null) {
            i = C17532R$id.barBottomSpace;
            View findChildViewById = ViewBindings.findChildViewById(view2, C17532R$id.barBottomSpace);
            if (findChildViewById != null) {
                i = C17532R$id.configureButton;
                Button button = (Button) ViewBindings.findChildViewById(view2, C17532R$id.configureButton);
                if (button != null) {
                    i = C17532R$id.drawMenuToggle;
                    ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view2, C17532R$id.drawMenuToggle);
                    if (imageButton != null) {
                        DrawerLayout drawerLayout = (DrawerLayout) view2;
                        i = C17532R$id.flashSaleText;
                        ScaleTextView scaleTextView = (ScaleTextView) ViewBindings.findChildViewById(view2, C17532R$id.flashSaleText);
                        if (scaleTextView != null) {
                            i = C17532R$id.flashSaleTimeRemaining;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.flashSaleTimeRemaining);
                            if (textView != null) {
                                i = C17532R$id.homeScreenGrid;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, C17532R$id.homeScreenGrid);
                                if (recyclerView != null) {
                                    i = C17532R$id.infoBar;
                                    ExpandableLayout expandableLayout = (ExpandableLayout) ViewBindings.findChildViewById(view2, C17532R$id.infoBar);
                                    if (expandableLayout != null) {
                                        i = C17532R$id.infoBarBg;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view2, C17532R$id.infoBarBg);
                                        if (frameLayout != null) {
                                            i = C17532R$id.infoBarDismissButton;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C17532R$id.infoBarDismissButton);
                                            if (imageView != null) {
                                                i = C17532R$id.infoText;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.infoText);
                                                if (textView2 != null) {
                                                    i = C17532R$id.navigationView;
                                                    NavigationView navigationView = (NavigationView) ViewBindings.findChildViewById(view2, C17532R$id.navigationView);
                                                    if (navigationView != null) {
                                                        i = C17532R$id.onOffSwitch;
                                                        SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view2, C17532R$id.onOffSwitch);
                                                        if (switchCompat != null) {
                                                            i = C17532R$id.shimmerLayout;
                                                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(view2, C17532R$id.shimmerLayout);
                                                            if (shimmerFrameLayout != null) {
                                                                i = C17532R$id.titleText;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.titleText);
                                                                if (textView3 != null) {
                                                                    i = 2131364057;
                                                                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view2, 2131364057);
                                                                    if (toolbar != null) {
                                                                        i = C17532R$id.topLevelLayout;
                                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C17532R$id.topLevelLayout);
                                                                        if (linearLayout != null) {
                                                                            i = C17532R$id.upgradeBar;
                                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view2, C17532R$id.upgradeBar);
                                                                            if (linearLayout2 != null) {
                                                                                i = C17532R$id.upgradeButton;
                                                                                Button button2 = (Button) ViewBindings.findChildViewById(view2, C17532R$id.upgradeButton);
                                                                                if (button2 != null) {
                                                                                    i = C17532R$id.upgradeReason;
                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.upgradeReason);
                                                                                    if (textView4 != null) {
                                                                                        return new C8031w(drawerLayout, appBarLayout, findChildViewById, button, imageButton, drawerLayout, scaleTextView, textView, recyclerView, expandableLayout, frameLayout, imageView, textView2, navigationView, switchCompat, shimmerFrameLayout, textView3, toolbar, linearLayout, linearLayout2, button2, textView4);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: b */
    public DrawerLayout getRoot() {
        return this.f19486a;
    }
}
