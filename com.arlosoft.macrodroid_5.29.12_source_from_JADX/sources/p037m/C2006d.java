package p037m;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.R$attr;
import com.afollestad.materialdialogs.R$dimen;
import com.afollestad.materialdialogs.R$id;
import com.afollestad.materialdialogs.R$layout;
import com.afollestad.materialdialogs.R$style;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import java.util.ArrayList;
import java.util.Arrays;
import p037m.C2009f;
import p039n.C2036a;
import p039n.C2037b;
import p040o.C2039a;
import p329me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable;
import p329me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable;
import p329me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;

/* renamed from: m.d */
/* compiled from: DialogInit */
class C2006d {
    /* renamed from: a */
    private static void m8353a(ProgressBar progressBar) {
    }

    @LayoutRes
    /* renamed from: b */
    static int m8354b(C2009f.C2014d dVar) {
        if (dVar.f6223s != null) {
            return R$layout.md_dialog_custom;
        }
        if (dVar.f6209l == null && dVar.f6183W == null) {
            if (dVar.f6206j0 > -2) {
                return R$layout.md_dialog_progress;
            }
            if (dVar.f6202h0) {
                if (dVar.f6148A0) {
                    return R$layout.md_dialog_progress_indeterminate_horizontal;
                }
                return R$layout.md_dialog_progress_indeterminate;
            } else if (dVar.f6214n0 != null) {
                if (dVar.f6230v0 != null) {
                    return R$layout.md_dialog_input_check;
                }
                return R$layout.md_dialog_input;
            } else if (dVar.f6230v0 != null) {
                return R$layout.md_dialog_basic_check;
            } else {
                return R$layout.md_dialog_basic;
            }
        } else if (dVar.f6230v0 != null) {
            return R$layout.md_dialog_list_check;
        } else {
            return R$layout.md_dialog_list;
        }
    }

    @StyleRes
    /* renamed from: c */
    static int m8355c(@NonNull C2009f.C2014d dVar) {
        Context context = dVar.f6187a;
        int i = R$attr.md_dark_theme;
        C2024h hVar = dVar.f6165J;
        C2024h hVar2 = C2024h.DARK;
        boolean k = C2039a.m8441k(context, i, hVar == hVar2);
        if (!k) {
            hVar2 = C2024h.LIGHT;
        }
        dVar.f6165J = hVar2;
        return k ? R$style.MD_Dark : R$style.MD_Light;
    }

    @UiThread
    /* renamed from: d */
    static void m8356d(C2009f fVar) {
        C2009f.C2014d dVar = fVar.f6134d;
        fVar.setCancelable(dVar.f6167K);
        fVar.setCanceledOnTouchOutside(dVar.f6169L);
        if (dVar.f6198f0 == 0) {
            dVar.f6198f0 = C2039a.m8443m(dVar.f6187a, R$attr.md_background_color, C2039a.m8442l(fVar.getContext(), R$attr.colorBackgroundFloating));
        }
        if (dVar.f6198f0 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(dVar.f6187a.getResources().getDimension(R$dimen.md_bg_corner_radius));
            gradientDrawable.setColor(dVar.f6198f0);
            fVar.getWindow().setBackgroundDrawable(gradientDrawable);
        }
        if (!dVar.f6156E0) {
            dVar.f6229v = C2039a.m8439i(dVar.f6187a, R$attr.md_positive_color, dVar.f6229v);
        }
        if (!dVar.f6158F0) {
            dVar.f6233x = C2039a.m8439i(dVar.f6187a, R$attr.md_neutral_color, dVar.f6233x);
        }
        if (!dVar.f6160G0) {
            dVar.f6231w = C2039a.m8439i(dVar.f6187a, R$attr.md_negative_color, dVar.f6231w);
        }
        if (!dVar.f6162H0) {
            dVar.f6225t = C2039a.m8443m(dVar.f6187a, R$attr.md_widget_color, dVar.f6225t);
        }
        if (!dVar.f6150B0) {
            dVar.f6203i = C2039a.m8443m(dVar.f6187a, R$attr.md_title_color, C2039a.m8442l(fVar.getContext(), 16842806));
        }
        if (!dVar.f6152C0) {
            dVar.f6205j = C2039a.m8443m(dVar.f6187a, R$attr.md_content_color, C2039a.m8442l(fVar.getContext(), 16842808));
        }
        if (!dVar.f6154D0) {
            dVar.f6200g0 = C2039a.m8443m(dVar.f6187a, R$attr.md_item_color, dVar.f6205j);
        }
        fVar.f6137o = (TextView) fVar.f6114a.findViewById(R$id.md_title);
        fVar.f6136g = (ImageView) fVar.f6114a.findViewById(R$id.md_icon);
        fVar.f6122A = fVar.f6114a.findViewById(R$id.md_titleFrame);
        fVar.f6138p = (TextView) fVar.f6114a.findViewById(R$id.md_content);
        fVar.f6140z = (RecyclerView) fVar.f6114a.findViewById(R$id.md_contentRecyclerView);
        fVar.f6128G = (CheckBox) fVar.f6114a.findViewById(R$id.md_promptCheckbox);
        fVar.f6129H = (MDButton) fVar.f6114a.findViewById(R$id.md_buttonDefaultPositive);
        fVar.f6130I = (MDButton) fVar.f6114a.findViewById(R$id.md_buttonDefaultNeutral);
        fVar.f6131J = (MDButton) fVar.f6114a.findViewById(R$id.md_buttonDefaultNegative);
        if (dVar.f6214n0 != null && dVar.f6211m == null) {
            dVar.f6211m = dVar.f6187a.getText(17039370);
        }
        fVar.f6129H.setVisibility(dVar.f6211m != null ? 0 : 8);
        fVar.f6130I.setVisibility(dVar.f6213n != null ? 0 : 8);
        fVar.f6131J.setVisibility(dVar.f6215o != null ? 0 : 8);
        fVar.f6129H.setFocusable(true);
        fVar.f6130I.setFocusable(true);
        fVar.f6131J.setFocusable(true);
        if (dVar.f6217p) {
            fVar.f6129H.requestFocus();
        }
        if (dVar.f6219q) {
            fVar.f6130I.requestFocus();
        }
        if (dVar.f6221r) {
            fVar.f6131J.requestFocus();
        }
        if (dVar.f6180T != null) {
            fVar.f6136g.setVisibility(0);
            fVar.f6136g.setImageDrawable(dVar.f6180T);
        } else {
            Drawable p = C2039a.m8446p(dVar.f6187a, R$attr.md_icon);
            if (p != null) {
                fVar.f6136g.setVisibility(0);
                fVar.f6136g.setImageDrawable(p);
            } else {
                fVar.f6136g.setVisibility(8);
            }
        }
        int i = dVar.f6182V;
        if (i == -1) {
            i = C2039a.m8444n(dVar.f6187a, R$attr.md_icon_max_size);
        }
        if (dVar.f6181U || C2039a.m8440j(dVar.f6187a, R$attr.md_icon_limit_icon_to_default_size)) {
            i = dVar.f6187a.getResources().getDimensionPixelSize(R$dimen.md_icon_max_size);
        }
        if (i > -1) {
            fVar.f6136g.setAdjustViewBounds(true);
            fVar.f6136g.setMaxHeight(i);
            fVar.f6136g.setMaxWidth(i);
            fVar.f6136g.requestLayout();
        }
        if (!dVar.f6164I0) {
            dVar.f6196e0 = C2039a.m8443m(dVar.f6187a, R$attr.md_divider_color, C2039a.m8442l(fVar.getContext(), R$attr.md_divider));
        }
        fVar.f6114a.setDividerColor(dVar.f6196e0);
        TextView textView = fVar.f6137o;
        if (textView != null) {
            fVar.mo24060B(textView, dVar.f6179S);
            fVar.f6137o.setTextColor(dVar.f6203i);
            fVar.f6137o.setGravity(dVar.f6191c.mo24057b());
            fVar.f6137o.setTextAlignment(dVar.f6191c.mo24058d());
            CharSequence charSequence = dVar.f6189b;
            if (charSequence == null) {
                fVar.f6122A.setVisibility(8);
            } else {
                fVar.f6137o.setText(charSequence);
                fVar.f6122A.setVisibility(0);
            }
        }
        TextView textView2 = fVar.f6138p;
        if (textView2 != null) {
            textView2.setMovementMethod(new LinkMovementMethod());
            fVar.mo24060B(fVar.f6138p, dVar.f6178R);
            fVar.f6138p.setLineSpacing(0.0f, dVar.f6171M);
            ColorStateList colorStateList = dVar.f6235y;
            if (colorStateList == null) {
                fVar.f6138p.setLinkTextColor(C2039a.m8442l(fVar.getContext(), 16842806));
            } else {
                fVar.f6138p.setLinkTextColor(colorStateList);
            }
            fVar.f6138p.setTextColor(dVar.f6205j);
            fVar.f6138p.setGravity(dVar.f6193d.mo24057b());
            fVar.f6138p.setTextAlignment(dVar.f6193d.mo24058d());
            CharSequence charSequence2 = dVar.f6207k;
            if (charSequence2 != null) {
                fVar.f6138p.setText(charSequence2);
                fVar.f6138p.setVisibility(0);
            } else {
                fVar.f6138p.setVisibility(8);
            }
        }
        CheckBox checkBox = fVar.f6128G;
        if (checkBox != null) {
            checkBox.setText(dVar.f6230v0);
            fVar.f6128G.setChecked(dVar.f6232w0);
            fVar.f6128G.setOnCheckedChangeListener(dVar.f6234x0);
            fVar.mo24060B(fVar.f6128G, dVar.f6178R);
            fVar.f6128G.setTextColor(dVar.f6205j);
            C2037b.m8424c(fVar.f6128G, dVar.f6225t);
        }
        fVar.f6114a.setButtonGravity(dVar.f6199g);
        fVar.f6114a.setButtonStackedGravity(dVar.f6195e);
        fVar.f6114a.setStackingBehavior(dVar.f6192c0);
        boolean k = C2039a.m8441k(dVar.f6187a, 16843660, true);
        if (k) {
            k = C2039a.m8441k(dVar.f6187a, R$attr.textAllCaps, true);
        }
        MDButton mDButton = fVar.f6129H;
        fVar.mo24060B(mDButton, dVar.f6179S);
        mDButton.setAllCapsCompat(k);
        mDButton.setText(dVar.f6211m);
        mDButton.setTextColor(dVar.f6229v);
        MDButton mDButton2 = fVar.f6129H;
        C2004b bVar = C2004b.POSITIVE;
        mDButton2.setStackedSelector(fVar.mo24066q(bVar, true));
        fVar.f6129H.setDefaultSelector(fVar.mo24066q(bVar, false));
        fVar.f6129H.setTag(bVar);
        fVar.f6129H.setOnClickListener(fVar);
        MDButton mDButton3 = fVar.f6131J;
        fVar.mo24060B(mDButton3, dVar.f6179S);
        mDButton3.setAllCapsCompat(k);
        mDButton3.setText(dVar.f6215o);
        mDButton3.setTextColor(dVar.f6231w);
        MDButton mDButton4 = fVar.f6131J;
        C2004b bVar2 = C2004b.NEGATIVE;
        mDButton4.setStackedSelector(fVar.mo24066q(bVar2, true));
        fVar.f6131J.setDefaultSelector(fVar.mo24066q(bVar2, false));
        fVar.f6131J.setTag(bVar2);
        fVar.f6131J.setOnClickListener(fVar);
        MDButton mDButton5 = fVar.f6130I;
        fVar.mo24060B(mDButton5, dVar.f6179S);
        mDButton5.setAllCapsCompat(k);
        mDButton5.setText(dVar.f6213n);
        mDButton5.setTextColor(dVar.f6233x);
        MDButton mDButton6 = fVar.f6130I;
        C2004b bVar3 = C2004b.NEUTRAL;
        mDButton6.setStackedSelector(fVar.mo24066q(bVar3, true));
        fVar.f6130I.setDefaultSelector(fVar.mo24066q(bVar3, false));
        fVar.f6130I.setTag(bVar3);
        fVar.f6130I.setOnClickListener(fVar);
        if (dVar.f6159G != null) {
            fVar.f6133L = new ArrayList();
        }
        if (fVar.f6140z != null) {
            RecyclerView.Adapter<?> adapter = dVar.f6183W;
            if (adapter == null) {
                if (dVar.f6157F != null) {
                    fVar.f6132K = C2009f.C2021k.SINGLE;
                } else if (dVar.f6159G != null) {
                    fVar.f6132K = C2009f.C2021k.MULTI;
                    if (dVar.f6175O != null) {
                        fVar.f6133L = new ArrayList(Arrays.asList(dVar.f6175O));
                        dVar.f6175O = null;
                    }
                } else {
                    fVar.f6132K = C2009f.C2021k.REGULAR;
                }
                dVar.f6183W = new C2000a(fVar, C2009f.C2021k.m8406b(fVar.f6132K));
            } else if (adapter instanceof C2036a) {
                ((C2036a) adapter).mo24120a(fVar);
            }
        }
        m8358f(fVar);
        m8357e(fVar);
        if (dVar.f6223s != null) {
            ((MDRootLayout) fVar.f6114a.findViewById(R$id.md_root)).mo16920t();
            FrameLayout frameLayout = (FrameLayout) fVar.f6114a.findViewById(R$id.md_customViewFrame);
            fVar.f6123B = frameLayout;
            View view = dVar.f6223s;
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (dVar.f6194d0) {
                Resources resources = fVar.getContext().getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.md_dialog_frame_margin);
                ScrollView scrollView = new ScrollView(fVar.getContext());
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.md_content_padding_top);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(R$dimen.md_content_padding_bottom);
                scrollView.setClipToPadding(false);
                if (view instanceof EditText) {
                    scrollView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
                } else {
                    scrollView.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize3);
                    view.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                }
                scrollView.addView(view, new FrameLayout.LayoutParams(-1, -2));
                view = scrollView;
            }
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
        DialogInterface.OnShowListener onShowListener = dVar.f6190b0;
        if (onShowListener != null) {
            fVar.setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = dVar.f6186Z;
        if (onCancelListener != null) {
            fVar.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = dVar.f6185Y;
        if (onDismissListener != null) {
            fVar.setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = dVar.f6188a0;
        if (onKeyListener != null) {
            fVar.setOnKeyListener(onKeyListener);
        }
        fVar.mo24049b();
        fVar.mo24074v();
        fVar.mo24050d(fVar.f6114a);
        fVar.mo24062f();
        Display defaultDisplay = fVar.getWindow().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i2 = point.x;
        int i3 = point.y;
        int dimensionPixelSize4 = dVar.f6187a.getResources().getDimensionPixelSize(R$dimen.md_dialog_vertical_margin);
        int dimensionPixelSize5 = dVar.f6187a.getResources().getDimensionPixelSize(R$dimen.md_dialog_horizontal_margin);
        fVar.f6114a.setMaxHeight(i3 - (dimensionPixelSize4 * 2));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(fVar.getWindow().getAttributes());
        layoutParams.width = Math.min(dVar.f6187a.getResources().getDimensionPixelSize(R$dimen.md_dialog_max_width), i2 - (dimensionPixelSize5 * 2));
        fVar.getWindow().setAttributes(layoutParams);
    }

    /* renamed from: e */
    private static void m8357e(C2009f fVar) {
        C2009f.C2014d dVar = fVar.f6134d;
        EditText editText = (EditText) fVar.f6114a.findViewById(16908297);
        fVar.f6139s = editText;
        if (editText != null) {
            fVar.mo24060B(editText, dVar.f6178R);
            CharSequence charSequence = dVar.f6210l0;
            if (charSequence != null) {
                fVar.f6139s.setText(charSequence);
            }
            fVar.mo24076z();
            fVar.f6139s.setHint(dVar.f6212m0);
            fVar.f6139s.setSingleLine();
            fVar.f6139s.setTextColor(dVar.f6205j);
            fVar.f6139s.setHintTextColor(C2039a.m8431a(dVar.f6205j, 0.3f));
            C2037b.m8426e(fVar.f6139s, fVar.f6134d.f6225t);
            int i = dVar.f6218p0;
            if (i != -1) {
                fVar.f6139s.setInputType(i);
                int i2 = dVar.f6218p0;
                if (i2 != 144 && (i2 & 128) == 128) {
                    fVar.f6139s.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
            TextView textView = (TextView) fVar.f6114a.findViewById(R$id.md_minMax);
            fVar.f6127F = textView;
            if (dVar.f6222r0 > 0 || dVar.f6224s0 > -1) {
                fVar.mo24073u(fVar.f6139s.getText().toString().length(), !dVar.f6216o0);
                return;
            }
            textView.setVisibility(8);
            fVar.f6127F = null;
        }
    }

    /* renamed from: f */
    private static void m8358f(C2009f fVar) {
        C2009f.C2014d dVar = fVar.f6134d;
        if (dVar.f6202h0 || dVar.f6206j0 > -2) {
            ProgressBar progressBar = (ProgressBar) fVar.f6114a.findViewById(16908301);
            fVar.f6124C = progressBar;
            if (progressBar != null) {
                if (!dVar.f6202h0) {
                    HorizontalProgressDrawable horizontalProgressDrawable = new HorizontalProgressDrawable(dVar.mo24090j());
                    horizontalProgressDrawable.setTint(dVar.f6225t);
                    fVar.f6124C.setProgressDrawable(horizontalProgressDrawable);
                    fVar.f6124C.setIndeterminateDrawable(horizontalProgressDrawable);
                } else if (dVar.f6148A0) {
                    IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable = new IndeterminateHorizontalProgressDrawable(dVar.mo24090j());
                    indeterminateHorizontalProgressDrawable.setTint(dVar.f6225t);
                    fVar.f6124C.setProgressDrawable(indeterminateHorizontalProgressDrawable);
                    fVar.f6124C.setIndeterminateDrawable(indeterminateHorizontalProgressDrawable);
                } else {
                    IndeterminateCircularProgressDrawable indeterminateCircularProgressDrawable = new IndeterminateCircularProgressDrawable(dVar.mo24090j());
                    indeterminateCircularProgressDrawable.setTint(dVar.f6225t);
                    fVar.f6124C.setProgressDrawable(indeterminateCircularProgressDrawable);
                    fVar.f6124C.setIndeterminateDrawable(indeterminateCircularProgressDrawable);
                }
                boolean z = dVar.f6202h0;
                if (!z || dVar.f6148A0) {
                    fVar.f6124C.setIndeterminate(z && dVar.f6148A0);
                    fVar.f6124C.setProgress(0);
                    fVar.f6124C.setMax(dVar.f6208k0);
                    TextView textView = (TextView) fVar.f6114a.findViewById(R$id.md_label);
                    fVar.f6125D = textView;
                    if (textView != null) {
                        textView.setTextColor(dVar.f6205j);
                        fVar.mo24060B(fVar.f6125D, dVar.f6179S);
                        fVar.f6125D.setText(dVar.f6238z0.format(0));
                    }
                    TextView textView2 = (TextView) fVar.f6114a.findViewById(R$id.md_minMax);
                    fVar.f6126E = textView2;
                    if (textView2 != null) {
                        textView2.setTextColor(dVar.f6205j);
                        fVar.mo24060B(fVar.f6126E, dVar.f6178R);
                        if (dVar.f6204i0) {
                            fVar.f6126E.setVisibility(0);
                            fVar.f6126E.setText(String.format(dVar.f6236y0, new Object[]{0, Integer.valueOf(dVar.f6208k0)}));
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.f6124C.getLayoutParams();
                            marginLayoutParams.leftMargin = 0;
                            marginLayoutParams.rightMargin = 0;
                        } else {
                            fVar.f6126E.setVisibility(8);
                        }
                    } else {
                        dVar.f6204i0 = false;
                    }
                }
            } else {
                return;
            }
        }
        ProgressBar progressBar2 = fVar.f6124C;
        if (progressBar2 != null) {
            m8353a(progressBar2);
        }
    }
}
