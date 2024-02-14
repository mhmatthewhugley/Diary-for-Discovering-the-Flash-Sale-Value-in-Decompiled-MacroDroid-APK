package p037m;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.UiThread;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.R$attr;
import com.afollestad.materialdialogs.R$color;
import com.afollestad.materialdialogs.R$layout;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.apache.commons.p353io.IOUtils;
import p037m.C2000a;
import p039n.C2037b;
import p039n.C2038c;
import p040o.C2039a;
import p040o.C2042b;
import p040o.C2043c;

/* renamed from: m.f */
/* compiled from: MaterialDialog */
public class C2009f extends C2005c implements View.OnClickListener, C2000a.C2003c {

    /* renamed from: A */
    View f6122A;

    /* renamed from: B */
    FrameLayout f6123B;

    /* renamed from: C */
    ProgressBar f6124C;

    /* renamed from: D */
    TextView f6125D;

    /* renamed from: E */
    TextView f6126E;

    /* renamed from: F */
    TextView f6127F;

    /* renamed from: G */
    CheckBox f6128G;

    /* renamed from: H */
    MDButton f6129H;

    /* renamed from: I */
    MDButton f6130I;

    /* renamed from: J */
    MDButton f6131J;

    /* renamed from: K */
    C2021k f6132K;

    /* renamed from: L */
    List<Integer> f6133L;

    /* renamed from: d */
    protected final C2014d f6134d;

    /* renamed from: f */
    private final Handler f6135f = new Handler();

    /* renamed from: g */
    protected ImageView f6136g;

    /* renamed from: o */
    protected TextView f6137o;

    /* renamed from: p */
    protected TextView f6138p;

    /* renamed from: s */
    EditText f6139s;

    /* renamed from: z */
    RecyclerView f6140z;

    /* renamed from: m.f$a */
    /* compiled from: MaterialDialog */
    class C2010a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: m.f$a$a */
        /* compiled from: MaterialDialog */
        class C2011a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f6142a;

            C2011a(int i) {
                this.f6142a = i;
            }

            public void run() {
                C2009f.this.f6140z.requestFocus();
                C2009f.this.f6134d.f6184X.scrollToPosition(this.f6142a);
            }
        }

        C2010a() {
        }

        public void onGlobalLayout() {
            int i;
            C2009f.this.f6140z.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C2009f fVar = C2009f.this;
            C2021k kVar = fVar.f6132K;
            C2021k kVar2 = C2021k.SINGLE;
            if (kVar == kVar2 || kVar == C2021k.MULTI) {
                if (kVar == kVar2) {
                    i = fVar.f6134d.f6173N;
                    if (i < 0) {
                        return;
                    }
                } else {
                    List<Integer> list = fVar.f6133L;
                    if (list != null && list.size() != 0) {
                        Collections.sort(C2009f.this.f6133L);
                        i = C2009f.this.f6133L.get(0).intValue();
                    } else {
                        return;
                    }
                }
                C2009f.this.f6140z.post(new C2011a(i));
            }
        }
    }

    /* renamed from: m.f$b */
    /* compiled from: MaterialDialog */
    class C2012b implements TextWatcher {
        C2012b() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int length = charSequence.toString().length();
            C2009f fVar = C2009f.this;
            boolean z = false;
            if (!fVar.f6134d.f6216o0) {
                if (length == 0) {
                    z = true;
                }
                fVar.mo24063o(C2004b.POSITIVE).setEnabled(!z);
            }
            C2009f.this.mo24073u(length, z);
            C2009f fVar2 = C2009f.this;
            C2014d dVar = fVar2.f6134d;
            if (dVar.f6220q0) {
                dVar.f6214n0.mo24105a(fVar2, charSequence);
            }
        }
    }

    /* renamed from: m.f$c */
    /* compiled from: MaterialDialog */
    static /* synthetic */ class C2013c {

        /* renamed from: a */
        static final /* synthetic */ int[] f6145a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6146b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                m.f$k[] r0 = p037m.C2009f.C2021k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6146b = r0
                r1 = 1
                m.f$k r2 = p037m.C2009f.C2021k.REGULAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6146b     // Catch:{ NoSuchFieldError -> 0x001d }
                m.f$k r3 = p037m.C2009f.C2021k.SINGLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f6146b     // Catch:{ NoSuchFieldError -> 0x0028 }
                m.f$k r4 = p037m.C2009f.C2021k.MULTI     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                m.b[] r3 = p037m.C2004b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f6145a = r3
                m.b r4 = p037m.C2004b.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f6145a     // Catch:{ NoSuchFieldError -> 0x0043 }
                m.b r3 = p037m.C2004b.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f6145a     // Catch:{ NoSuchFieldError -> 0x004d }
                m.b r1 = p037m.C2004b.POSITIVE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p037m.C2009f.C2013c.<clinit>():void");
        }
    }

    /* renamed from: m.f$d */
    /* compiled from: MaterialDialog */
    public static class C2014d {

        /* renamed from: A */
        protected C2022l f6147A;

        /* renamed from: A0 */
        protected boolean f6148A0;

        /* renamed from: B */
        protected C2022l f6149B;

        /* renamed from: B0 */
        protected boolean f6150B0;

        /* renamed from: C */
        protected C2022l f6151C;

        /* renamed from: C0 */
        protected boolean f6152C0;

        /* renamed from: D */
        protected C2017g f6153D;

        /* renamed from: D0 */
        protected boolean f6154D0;

        /* renamed from: E */
        protected C2020j f6155E;

        /* renamed from: E0 */
        protected boolean f6156E0;

        /* renamed from: F */
        protected C2019i f6157F;

        /* renamed from: F0 */
        protected boolean f6158F0;

        /* renamed from: G */
        protected C2018h f6159G;

        /* renamed from: G0 */
        protected boolean f6160G0;

        /* renamed from: H */
        protected boolean f6161H;

        /* renamed from: H0 */
        protected boolean f6162H0;

        /* renamed from: I */
        protected boolean f6163I;

        /* renamed from: I0 */
        protected boolean f6164I0;

        /* renamed from: J */
        protected C2024h f6165J;
        @DrawableRes

        /* renamed from: J0 */
        protected int f6166J0;

        /* renamed from: K */
        protected boolean f6167K;
        @DrawableRes

        /* renamed from: K0 */
        protected int f6168K0;

        /* renamed from: L */
        protected boolean f6169L;
        @DrawableRes

        /* renamed from: L0 */
        protected int f6170L0;

        /* renamed from: M */
        protected float f6171M;
        @DrawableRes

        /* renamed from: M0 */
        protected int f6172M0;

        /* renamed from: N */
        protected int f6173N;
        @DrawableRes

        /* renamed from: N0 */
        protected int f6174N0;

        /* renamed from: O */
        protected Integer[] f6175O;

        /* renamed from: P */
        protected Integer[] f6176P;

        /* renamed from: Q */
        protected boolean f6177Q;

        /* renamed from: R */
        protected Typeface f6178R;

        /* renamed from: S */
        protected Typeface f6179S;

        /* renamed from: T */
        protected Drawable f6180T;

        /* renamed from: U */
        protected boolean f6181U;

        /* renamed from: V */
        protected int f6182V;

        /* renamed from: W */
        protected RecyclerView.Adapter<?> f6183W;

        /* renamed from: X */
        protected RecyclerView.LayoutManager f6184X;

        /* renamed from: Y */
        protected DialogInterface.OnDismissListener f6185Y;

        /* renamed from: Z */
        protected DialogInterface.OnCancelListener f6186Z;

        /* renamed from: a */
        protected final Context f6187a;

        /* renamed from: a0 */
        protected DialogInterface.OnKeyListener f6188a0;

        /* renamed from: b */
        protected CharSequence f6189b;

        /* renamed from: b0 */
        protected DialogInterface.OnShowListener f6190b0;

        /* renamed from: c */
        protected C2007e f6191c;

        /* renamed from: c0 */
        protected C2023g f6192c0;

        /* renamed from: d */
        protected C2007e f6193d;

        /* renamed from: d0 */
        protected boolean f6194d0;

        /* renamed from: e */
        protected C2007e f6195e = C2007e.END;

        /* renamed from: e0 */
        protected int f6196e0;

        /* renamed from: f */
        protected C2007e f6197f;

        /* renamed from: f0 */
        protected int f6198f0;

        /* renamed from: g */
        protected C2007e f6199g;

        /* renamed from: g0 */
        protected int f6200g0;

        /* renamed from: h */
        protected int f6201h;

        /* renamed from: h0 */
        protected boolean f6202h0;

        /* renamed from: i */
        protected int f6203i;

        /* renamed from: i0 */
        protected boolean f6204i0;

        /* renamed from: j */
        protected int f6205j;

        /* renamed from: j0 */
        protected int f6206j0;

        /* renamed from: k */
        protected CharSequence f6207k;

        /* renamed from: k0 */
        protected int f6208k0;

        /* renamed from: l */
        protected ArrayList<CharSequence> f6209l;

        /* renamed from: l0 */
        protected CharSequence f6210l0;

        /* renamed from: m */
        protected CharSequence f6211m;

        /* renamed from: m0 */
        protected CharSequence f6212m0;

        /* renamed from: n */
        protected CharSequence f6213n;

        /* renamed from: n0 */
        protected C2016f f6214n0;

        /* renamed from: o */
        protected CharSequence f6215o;

        /* renamed from: o0 */
        protected boolean f6216o0;

        /* renamed from: p */
        protected boolean f6217p;

        /* renamed from: p0 */
        protected int f6218p0;

        /* renamed from: q */
        protected boolean f6219q;

        /* renamed from: q0 */
        protected boolean f6220q0;

        /* renamed from: r */
        protected boolean f6221r;

        /* renamed from: r0 */
        protected int f6222r0;

        /* renamed from: s */
        protected View f6223s;

        /* renamed from: s0 */
        protected int f6224s0;

        /* renamed from: t */
        protected int f6225t;

        /* renamed from: t0 */
        protected int f6226t0;

        /* renamed from: u */
        protected ColorStateList f6227u;

        /* renamed from: u0 */
        protected int[] f6228u0;

        /* renamed from: v */
        protected ColorStateList f6229v;

        /* renamed from: v0 */
        protected CharSequence f6230v0;

        /* renamed from: w */
        protected ColorStateList f6231w;

        /* renamed from: w0 */
        protected boolean f6232w0;

        /* renamed from: x */
        protected ColorStateList f6233x;

        /* renamed from: x0 */
        protected CompoundButton.OnCheckedChangeListener f6234x0;

        /* renamed from: y */
        protected ColorStateList f6235y;

        /* renamed from: y0 */
        protected String f6236y0;

        /* renamed from: z */
        protected C2022l f6237z;

        /* renamed from: z0 */
        protected NumberFormat f6238z0;

        public C2014d(@NonNull Context context) {
            C2007e eVar = C2007e.START;
            this.f6191c = eVar;
            this.f6193d = eVar;
            this.f6197f = eVar;
            this.f6199g = eVar;
            this.f6201h = 0;
            this.f6203i = -1;
            this.f6205j = -1;
            this.f6161H = false;
            this.f6163I = false;
            C2024h hVar = C2024h.LIGHT;
            this.f6165J = hVar;
            this.f6167K = true;
            this.f6169L = true;
            this.f6171M = 1.2f;
            this.f6173N = -1;
            this.f6175O = null;
            this.f6176P = null;
            this.f6177Q = true;
            this.f6182V = -1;
            this.f6206j0 = -2;
            this.f6208k0 = 0;
            this.f6218p0 = -1;
            this.f6222r0 = -1;
            this.f6224s0 = -1;
            this.f6226t0 = 0;
            this.f6150B0 = false;
            this.f6152C0 = false;
            this.f6154D0 = false;
            this.f6156E0 = false;
            this.f6158F0 = false;
            this.f6160G0 = false;
            this.f6162H0 = false;
            this.f6164I0 = false;
            this.f6187a = context;
            int m = C2039a.m8443m(context, R$attr.colorAccent, C2039a.m8433c(context, R$color.md_material_blue_600));
            this.f6225t = m;
            int m2 = C2039a.m8443m(context, 16843829, m);
            this.f6225t = m2;
            this.f6229v = C2039a.m8432b(context, m2);
            this.f6231w = C2039a.m8432b(context, this.f6225t);
            this.f6233x = C2039a.m8432b(context, this.f6225t);
            this.f6235y = C2039a.m8432b(context, C2039a.m8443m(context, R$attr.md_link_color, this.f6225t));
            this.f6201h = C2039a.m8443m(context, R$attr.md_btn_ripple_color, C2039a.m8443m(context, R$attr.colorControlHighlight, C2039a.m8442l(context, 16843820)));
            this.f6238z0 = NumberFormat.getPercentInstance();
            this.f6236y0 = "%1d/%2d";
            this.f6165J = !C2039a.m8437g(C2039a.m8442l(context, 16842806)) ? C2024h.DARK : hVar;
            m8377d();
            this.f6191c = C2039a.m8448r(context, R$attr.md_title_gravity, this.f6191c);
            this.f6193d = C2039a.m8448r(context, R$attr.md_content_gravity, this.f6193d);
            this.f6195e = C2039a.m8448r(context, R$attr.md_btnstacked_gravity, this.f6195e);
            this.f6197f = C2039a.m8448r(context, R$attr.md_items_gravity, this.f6197f);
            this.f6199g = C2039a.m8448r(context, R$attr.md_buttons_gravity, this.f6199g);
            try {
                mo24102v(C2039a.m8449s(context, R$attr.md_medium_font), C2039a.m8449s(context, R$attr.md_regular_font));
            } catch (Throwable unused) {
            }
            if (this.f6179S == null) {
                try {
                    this.f6179S = Typeface.create("sans-serif-medium", 0);
                } catch (Throwable unused2) {
                    this.f6179S = Typeface.DEFAULT_BOLD;
                }
            }
            if (this.f6178R == null) {
                try {
                    this.f6178R = Typeface.create("sans-serif", 0);
                } catch (Throwable unused3) {
                    Typeface typeface = Typeface.SANS_SERIF;
                    this.f6178R = typeface;
                    if (typeface == null) {
                        this.f6178R = Typeface.DEFAULT;
                    }
                }
            }
        }

        /* renamed from: d */
        private void m8377d() {
            if (C2038c.m8430b(false) != null) {
                C2038c a = C2038c.m8429a();
                if (a.f6261a) {
                    this.f6165J = C2024h.DARK;
                }
                int i = a.f6262b;
                if (i != 0) {
                    this.f6203i = i;
                }
                int i2 = a.f6263c;
                if (i2 != 0) {
                    this.f6205j = i2;
                }
                ColorStateList colorStateList = a.f6264d;
                if (colorStateList != null) {
                    this.f6229v = colorStateList;
                }
                ColorStateList colorStateList2 = a.f6265e;
                if (colorStateList2 != null) {
                    this.f6233x = colorStateList2;
                }
                ColorStateList colorStateList3 = a.f6266f;
                if (colorStateList3 != null) {
                    this.f6231w = colorStateList3;
                }
                int i3 = a.f6268h;
                if (i3 != 0) {
                    this.f6200g0 = i3;
                }
                Drawable drawable = a.f6269i;
                if (drawable != null) {
                    this.f6180T = drawable;
                }
                int i4 = a.f6270j;
                if (i4 != 0) {
                    this.f6198f0 = i4;
                }
                int i5 = a.f6271k;
                if (i5 != 0) {
                    this.f6196e0 = i5;
                }
                int i6 = a.f6274n;
                if (i6 != 0) {
                    this.f6168K0 = i6;
                }
                int i7 = a.f6273m;
                if (i7 != 0) {
                    this.f6166J0 = i7;
                }
                int i8 = a.f6275o;
                if (i8 != 0) {
                    this.f6170L0 = i8;
                }
                int i9 = a.f6276p;
                if (i9 != 0) {
                    this.f6172M0 = i9;
                }
                int i10 = a.f6277q;
                if (i10 != 0) {
                    this.f6174N0 = i10;
                }
                int i11 = a.f6267g;
                if (i11 != 0) {
                    this.f6225t = i11;
                }
                ColorStateList colorStateList4 = a.f6272l;
                if (colorStateList4 != null) {
                    this.f6235y = colorStateList4;
                }
                this.f6191c = a.f6278r;
                this.f6193d = a.f6279s;
                this.f6195e = a.f6280t;
                this.f6197f = a.f6281u;
                this.f6199g = a.f6282v;
            }
        }

        /* renamed from: a */
        public C2014d mo24082a(boolean z) {
            this.f6177Q = z;
            return this;
        }

        @UiThread
        /* renamed from: b */
        public C2009f mo24083b() {
            return new C2009f(this);
        }

        /* renamed from: c */
        public C2014d mo24084c(boolean z) {
            this.f6167K = z;
            this.f6169L = z;
            return this;
        }

        /* renamed from: e */
        public C2014d mo24085e(@StringRes int i) {
            return mo24086f(i, false);
        }

        /* renamed from: f */
        public C2014d mo24086f(@StringRes int i, boolean z) {
            CharSequence text = this.f6187a.getText(i);
            if (z) {
                text = Html.fromHtml(text.toString().replace(IOUtils.LINE_SEPARATOR_UNIX, "<br/>"));
            }
            return mo24087g(text);
        }

        /* renamed from: g */
        public C2014d mo24087g(@NonNull CharSequence charSequence) {
            if (this.f6223s == null) {
                this.f6207k = charSequence;
                return this;
            }
            throw new IllegalStateException("You cannot set content() when you're using a custom view.");
        }

        /* renamed from: h */
        public C2014d mo24088h(@NonNull View view, boolean z) {
            if (this.f6207k != null) {
                throw new IllegalStateException("You cannot use customView() when you have content set.");
            } else if (this.f6209l != null) {
                throw new IllegalStateException("You cannot use customView() when you have items set.");
            } else if (this.f6214n0 != null) {
                throw new IllegalStateException("You cannot use customView() with an input dialog");
            } else if (this.f6206j0 > -2 || this.f6202h0) {
                throw new IllegalStateException("You cannot use customView() with a progress dialog");
            } else {
                if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                this.f6223s = view;
                this.f6194d0 = z;
                return this;
            }
        }

        /* renamed from: i */
        public C2014d mo24089i(@NonNull DialogInterface.OnDismissListener onDismissListener) {
            this.f6185Y = onDismissListener;
            return this;
        }

        /* renamed from: j */
        public final Context mo24090j() {
            return this.f6187a;
        }

        /* renamed from: k */
        public C2014d mo24091k(@NonNull Drawable drawable) {
            this.f6180T = drawable;
            return this;
        }

        /* renamed from: l */
        public C2014d mo24092l(@NonNull CharSequence... charSequenceArr) {
            if (this.f6223s == null) {
                ArrayList<CharSequence> arrayList = new ArrayList<>();
                this.f6209l = arrayList;
                Collections.addAll(arrayList, charSequenceArr);
                return this;
            }
            throw new IllegalStateException("You cannot set items() when you're using a custom view.");
        }

        /* renamed from: m */
        public C2014d mo24093m(@Nullable Integer[] numArr, @NonNull C2018h hVar) {
            this.f6175O = numArr;
            this.f6153D = null;
            this.f6157F = null;
            this.f6159G = hVar;
            return this;
        }

        /* renamed from: n */
        public C2014d mo24094n(int i, @NonNull C2019i iVar) {
            this.f6173N = i;
            this.f6153D = null;
            this.f6157F = iVar;
            this.f6159G = null;
            return this;
        }

        /* renamed from: o */
        public C2014d mo24095o(@NonNull CharSequence charSequence) {
            this.f6215o = charSequence;
            return this;
        }

        /* renamed from: p */
        public C2014d mo24096p(@NonNull C2022l lVar) {
            this.f6151C = lVar;
            return this;
        }

        /* renamed from: q */
        public C2014d mo24097q(@NonNull CharSequence charSequence) {
            this.f6211m = charSequence;
            return this;
        }

        /* renamed from: r */
        public C2014d mo24098r(boolean z, int i) {
            if (this.f6223s == null) {
                if (z) {
                    this.f6202h0 = true;
                    this.f6206j0 = -2;
                } else {
                    this.f6148A0 = false;
                    this.f6202h0 = false;
                    this.f6206j0 = -1;
                    this.f6208k0 = i;
                }
                return this;
            }
            throw new IllegalStateException("You cannot set progress() when you're using a custom view.");
        }

        @UiThread
        /* renamed from: s */
        public C2009f mo24099s() {
            C2009f b = mo24083b();
            b.show();
            return b;
        }

        /* renamed from: t */
        public C2014d mo24100t(@StringRes int i) {
            mo24101u(this.f6187a.getText(i));
            return this;
        }

        /* renamed from: u */
        public C2014d mo24101u(@NonNull CharSequence charSequence) {
            this.f6189b = charSequence;
            return this;
        }

        /* renamed from: v */
        public C2014d mo24102v(@Nullable String str, @Nullable String str2) {
            if (str != null && !str.trim().isEmpty()) {
                Typeface a = C2043c.m8453a(this.f6187a, str);
                this.f6179S = a;
                if (a == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str + "\"");
                }
            }
            if (str2 != null && !str2.trim().isEmpty()) {
                Typeface a2 = C2043c.m8453a(this.f6187a, str2);
                this.f6178R = a2;
                if (a2 == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str2 + "\"");
                }
            }
            return this;
        }

        /* renamed from: w */
        public C2014d mo24103w(@ColorInt int i) {
            this.f6225t = i;
            this.f6162H0 = true;
            return this;
        }

        /* renamed from: x */
        public C2014d mo24104x(@ColorRes int i) {
            return mo24103w(C2039a.m8433c(this.f6187a, i));
        }
    }

    /* renamed from: m.f$e */
    /* compiled from: MaterialDialog */
    private static class C2015e extends WindowManager.BadTokenException {
        C2015e(String str) {
            super(str);
        }
    }

    /* renamed from: m.f$f */
    /* compiled from: MaterialDialog */
    public interface C2016f {
        /* renamed from: a */
        void mo24105a(@NonNull C2009f fVar, CharSequence charSequence);
    }

    /* renamed from: m.f$g */
    /* compiled from: MaterialDialog */
    public interface C2017g {
        /* renamed from: a */
        void mo24106a(C2009f fVar, View view, int i, CharSequence charSequence);
    }

    /* renamed from: m.f$h */
    /* compiled from: MaterialDialog */
    public interface C2018h {
        /* renamed from: a */
        boolean mo16975a(C2009f fVar, Integer[] numArr, CharSequence[] charSequenceArr);
    }

    /* renamed from: m.f$i */
    /* compiled from: MaterialDialog */
    public interface C2019i {
        /* renamed from: a */
        boolean mo16962a(C2009f fVar, View view, int i, CharSequence charSequence);
    }

    /* renamed from: m.f$j */
    /* compiled from: MaterialDialog */
    public interface C2020j {
        /* renamed from: a */
        boolean mo24107a(C2009f fVar, View view, int i, CharSequence charSequence);
    }

    /* renamed from: m.f$k */
    /* compiled from: MaterialDialog */
    enum C2021k {
        REGULAR,
        SINGLE,
        MULTI;

        /* renamed from: b */
        public static int m8406b(C2021k kVar) {
            int i = C2013c.f6146b[kVar.ordinal()];
            if (i == 1) {
                return R$layout.md_listitem;
            }
            if (i == 2) {
                return R$layout.md_listitem_singlechoice;
            }
            if (i == 3) {
                return R$layout.md_listitem_multichoice;
            }
            throw new IllegalArgumentException("Not a valid list type");
        }
    }

    /* renamed from: m.f$l */
    /* compiled from: MaterialDialog */
    public interface C2022l {
        /* renamed from: a */
        void mo16934a(@NonNull C2009f fVar, @NonNull C2004b bVar);
    }

    protected C2009f(C2014d dVar) {
        super(dVar.f6187a, C2006d.m8355c(dVar));
        this.f6134d = dVar;
        this.f6114a = (MDRootLayout) LayoutInflater.from(dVar.f6187a).inflate(C2006d.m8354b(dVar), (ViewGroup) null);
        C2006d.m8356d(this);
    }

    /* renamed from: x */
    private boolean m8361x() {
        if (this.f6134d.f6159G == null) {
            return false;
        }
        Collections.sort(this.f6133L);
        ArrayList arrayList = new ArrayList();
        for (Integer next : this.f6133L) {
            if (next.intValue() >= 0 && next.intValue() <= this.f6134d.f6209l.size() - 1) {
                arrayList.add(this.f6134d.f6209l.get(next.intValue()));
            }
        }
        C2018h hVar = this.f6134d.f6159G;
        List<Integer> list = this.f6133L;
        return hVar.mo16975a(this, (Integer[]) list.toArray(new Integer[list.size()]), (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]));
    }

    /* renamed from: y */
    private boolean m8362y(View view) {
        C2014d dVar = this.f6134d;
        if (dVar.f6157F == null) {
            return false;
        }
        CharSequence charSequence = null;
        int i = dVar.f6173N;
        if (i >= 0 && i < dVar.f6209l.size()) {
            C2014d dVar2 = this.f6134d;
            charSequence = dVar2.f6209l.get(dVar2.f6173N);
        }
        C2014d dVar3 = this.f6134d;
        return dVar3.f6157F.mo16962a(this, view, dVar3.f6173N, charSequence);
    }

    @UiThread
    /* renamed from: A */
    public final void mo24059A(CharSequence... charSequenceArr) {
        C2014d dVar = this.f6134d;
        if (dVar.f6183W != null) {
            if (charSequenceArr != null) {
                dVar.f6209l = new ArrayList<>(charSequenceArr.length);
                Collections.addAll(this.f6134d.f6209l, charSequenceArr);
            } else {
                dVar.f6209l = null;
            }
            if (this.f6134d.f6183W instanceof C2000a) {
                mo24075w();
                return;
            }
            throw new IllegalStateException("When using a custom adapter, setItems() cannot be used. Set items through the adapter instead.");
        }
        throw new IllegalStateException("This MaterialDialog instance does not yet have an adapter set to it. You cannot use setItems().");
    }

    /* renamed from: B */
    public final void mo24060B(TextView textView, Typeface typeface) {
        if (typeface != null) {
            textView.setPaintFlags(textView.getPaintFlags() | 128);
            textView.setTypeface(typeface);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e4, code lost:
        r4 = r3.f6134d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f7, code lost:
        r4 = r3.f6134d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24048a(p037m.C2009f r4, android.view.View r5, int r6, java.lang.CharSequence r7, boolean r8) {
        /*
            r3 = this;
            boolean r4 = r5.isEnabled()
            r7 = 0
            if (r4 != 0) goto L_0x0008
            return r7
        L_0x0008:
            m.f$k r4 = r3.f6132K
            r0 = 1
            if (r4 == 0) goto L_0x00d9
            m.f$k r1 = p037m.C2009f.C2021k.REGULAR
            if (r4 != r1) goto L_0x0013
            goto L_0x00d9
        L_0x0013:
            m.f$k r8 = p037m.C2009f.C2021k.MULTI
            if (r4 != r8) goto L_0x0087
            int r4 = com.afollestad.materialdialogs.R$id.md_control
            android.view.View r4 = r5.findViewById(r4)
            android.widget.CheckBox r4 = (android.widget.CheckBox) r4
            boolean r5 = r4.isEnabled()
            if (r5 != 0) goto L_0x0026
            return r7
        L_0x0026:
            java.util.List<java.lang.Integer> r5 = r3.f6133L
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.contains(r8)
            r5 = r5 ^ r0
            if (r5 == 0) goto L_0x005d
            java.util.List<java.lang.Integer> r5 = r3.f6133L
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.add(r7)
            m.f$d r5 = r3.f6134d
            boolean r5 = r5.f6161H
            if (r5 == 0) goto L_0x0058
            boolean r5 = r3.m8361x()
            if (r5 == 0) goto L_0x004d
            r4.setChecked(r0)
            goto L_0x010a
        L_0x004d:
            java.util.List<java.lang.Integer> r4 = r3.f6133L
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4.remove(r5)
            goto L_0x010a
        L_0x0058:
            r4.setChecked(r0)
            goto L_0x010a
        L_0x005d:
            java.util.List<java.lang.Integer> r5 = r3.f6133L
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r5.remove(r8)
            m.f$d r5 = r3.f6134d
            boolean r5 = r5.f6161H
            if (r5 == 0) goto L_0x0082
            boolean r5 = r3.m8361x()
            if (r5 == 0) goto L_0x0077
            r4.setChecked(r7)
            goto L_0x010a
        L_0x0077:
            java.util.List<java.lang.Integer> r4 = r3.f6133L
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4.add(r5)
            goto L_0x010a
        L_0x0082:
            r4.setChecked(r7)
            goto L_0x010a
        L_0x0087:
            m.f$k r8 = p037m.C2009f.C2021k.SINGLE
            if (r4 != r8) goto L_0x010a
            int r4 = com.afollestad.materialdialogs.R$id.md_control
            android.view.View r4 = r5.findViewById(r4)
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4
            boolean r8 = r4.isEnabled()
            if (r8 != 0) goto L_0x009a
            return r7
        L_0x009a:
            m.f$d r8 = r3.f6134d
            int r1 = r8.f6173N
            boolean r2 = r8.f6177Q
            if (r2 == 0) goto L_0x00b1
            java.lang.CharSequence r2 = r8.f6211m
            if (r2 != 0) goto L_0x00b1
            r3.dismiss()
            m.f$d r8 = r3.f6134d
            r8.f6173N = r6
            r3.m8362y(r5)
            goto L_0x00c1
        L_0x00b1:
            boolean r7 = r8.f6163I
            if (r7 == 0) goto L_0x00c0
            r8.f6173N = r6
            boolean r7 = r3.m8362y(r5)
            m.f$d r5 = r3.f6134d
            r5.f6173N = r1
            goto L_0x00c1
        L_0x00c0:
            r7 = 1
        L_0x00c1:
            if (r7 == 0) goto L_0x010a
            m.f$d r5 = r3.f6134d
            r5.f6173N = r6
            r4.setChecked(r0)
            m.f$d r4 = r3.f6134d
            androidx.recyclerview.widget.RecyclerView$Adapter<?> r4 = r4.f6183W
            r4.notifyItemChanged(r1)
            m.f$d r4 = r3.f6134d
            androidx.recyclerview.widget.RecyclerView$Adapter<?> r4 = r4.f6183W
            r4.notifyItemChanged(r6)
            goto L_0x010a
        L_0x00d9:
            m.f$d r4 = r3.f6134d
            boolean r4 = r4.f6177Q
            if (r4 == 0) goto L_0x00e2
            r3.dismiss()
        L_0x00e2:
            if (r8 != 0) goto L_0x00f5
            m.f$d r4 = r3.f6134d
            m.f$g r7 = r4.f6153D
            if (r7 == 0) goto L_0x00f5
            java.util.ArrayList<java.lang.CharSequence> r4 = r4.f6209l
            java.lang.Object r4 = r4.get(r6)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r7.mo24106a(r3, r5, r6, r4)
        L_0x00f5:
            if (r8 == 0) goto L_0x010a
            m.f$d r4 = r3.f6134d
            m.f$j r7 = r4.f6155E
            if (r7 == 0) goto L_0x010a
            java.util.ArrayList<java.lang.CharSequence> r4 = r4.f6209l
            java.lang.Object r4 = r4.get(r6)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = r7.mo24107a(r3, r5, r6, r4)
            return r4
        L_0x010a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p037m.C2009f.mo24048a(m.f, android.view.View, int, java.lang.CharSequence, boolean):boolean");
    }

    public void dismiss() {
        if (this.f6139s != null) {
            C2039a.m8436f(this, this.f6134d);
        }
        super.dismiss();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo24062f() {
        RecyclerView recyclerView = this.f6140z;
        if (recyclerView != null) {
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new C2010a());
        }
    }

    public /* bridge */ /* synthetic */ View findViewById(int i) {
        return super.findViewById(i);
    }

    /* renamed from: o */
    public final MDButton mo24063o(@NonNull C2004b bVar) {
        int i = C2013c.f6145a[bVar.ordinal()];
        if (i == 1) {
            return this.f6130I;
        }
        if (i != 2) {
            return this.f6129H;
        }
        return this.f6131J;
    }

    public final void onClick(View view) {
        EditText editText;
        C2004b bVar = (C2004b) view.getTag();
        int i = C2013c.f6145a[bVar.ordinal()];
        if (i == 1) {
            Objects.requireNonNull(this.f6134d);
            C2022l lVar = this.f6134d.f6149B;
            if (lVar != null) {
                lVar.mo16934a(this, bVar);
            }
            if (this.f6134d.f6177Q) {
                dismiss();
            }
        } else if (i == 2) {
            Objects.requireNonNull(this.f6134d);
            C2022l lVar2 = this.f6134d.f6147A;
            if (lVar2 != null) {
                lVar2.mo16934a(this, bVar);
            }
            if (this.f6134d.f6177Q) {
                cancel();
            }
        } else if (i == 3) {
            Objects.requireNonNull(this.f6134d);
            C2022l lVar3 = this.f6134d.f6237z;
            if (lVar3 != null) {
                lVar3.mo16934a(this, bVar);
            }
            if (!this.f6134d.f6163I) {
                m8362y(view);
            }
            if (!this.f6134d.f6161H) {
                m8361x();
            }
            C2014d dVar = this.f6134d;
            C2016f fVar = dVar.f6214n0;
            if (!(fVar == null || (editText = this.f6139s) == null || dVar.f6220q0)) {
                fVar.mo24105a(this, editText.getText());
            }
            if (this.f6134d.f6177Q) {
                dismiss();
            }
        }
        C2022l lVar4 = this.f6134d.f6151C;
        if (lVar4 != null) {
            lVar4.mo16934a(this, bVar);
        }
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (this.f6139s != null) {
            C2039a.m8451u(this, this.f6134d);
            if (this.f6139s.getText().length() > 0) {
                EditText editText = this.f6139s;
                editText.setSelection(editText.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    /* renamed from: p */
    public final C2014d mo24065p() {
        return this.f6134d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Drawable mo24066q(C2004b bVar, boolean z) {
        if (z) {
            C2014d dVar = this.f6134d;
            if (dVar.f6168K0 != 0) {
                return ResourcesCompat.getDrawable(dVar.f6187a.getResources(), this.f6134d.f6168K0, (Resources.Theme) null);
            }
            Context context = dVar.f6187a;
            int i = R$attr.md_btn_stacked_selector;
            Drawable p = C2039a.m8446p(context, i);
            if (p != null) {
                return p;
            }
            return C2039a.m8446p(getContext(), i);
        }
        int i2 = C2013c.f6145a[bVar.ordinal()];
        if (i2 == 1) {
            C2014d dVar2 = this.f6134d;
            if (dVar2.f6172M0 != 0) {
                return ResourcesCompat.getDrawable(dVar2.f6187a.getResources(), this.f6134d.f6172M0, (Resources.Theme) null);
            }
            Context context2 = dVar2.f6187a;
            int i3 = R$attr.md_btn_neutral_selector;
            Drawable p2 = C2039a.m8446p(context2, i3);
            if (p2 != null) {
                return p2;
            }
            Drawable p3 = C2039a.m8446p(getContext(), i3);
            C2042b.m8452a(p3, this.f6134d.f6201h);
            return p3;
        } else if (i2 != 2) {
            C2014d dVar3 = this.f6134d;
            if (dVar3.f6170L0 != 0) {
                return ResourcesCompat.getDrawable(dVar3.f6187a.getResources(), this.f6134d.f6170L0, (Resources.Theme) null);
            }
            Context context3 = dVar3.f6187a;
            int i4 = R$attr.md_btn_positive_selector;
            Drawable p4 = C2039a.m8446p(context3, i4);
            if (p4 != null) {
                return p4;
            }
            Drawable p5 = C2039a.m8446p(getContext(), i4);
            C2042b.m8452a(p5, this.f6134d.f6201h);
            return p5;
        } else {
            C2014d dVar4 = this.f6134d;
            if (dVar4.f6174N0 != 0) {
                return ResourcesCompat.getDrawable(dVar4.f6187a.getResources(), this.f6134d.f6174N0, (Resources.Theme) null);
            }
            Context context4 = dVar4.f6187a;
            int i5 = R$attr.md_btn_negative_selector;
            Drawable p6 = C2039a.m8446p(context4, i5);
            if (p6 != null) {
                return p6;
            }
            Drawable p7 = C2039a.m8446p(getContext(), i5);
            C2042b.m8452a(p7, this.f6134d.f6201h);
            return p7;
        }
    }

    @Nullable
    /* renamed from: r */
    public final EditText mo24067r() {
        return this.f6139s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final Drawable mo24068s() {
        C2014d dVar = this.f6134d;
        if (dVar.f6166J0 != 0) {
            return ResourcesCompat.getDrawable(dVar.f6187a.getResources(), this.f6134d.f6166J0, (Resources.Theme) null);
        }
        Context context = dVar.f6187a;
        int i = R$attr.md_list_selector;
        Drawable p = C2039a.m8446p(context, i);
        if (p != null) {
            return p;
        }
        return C2039a.m8446p(getContext(), i);
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(int i) throws IllegalAccessError {
        super.setContentView(i);
    }

    @UiThread
    public final void setTitle(CharSequence charSequence) {
        this.f6137o.setText(charSequence);
    }

    @UiThread
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
            throw new C2015e("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    /* renamed from: t */
    public final View mo24072t() {
        return this.f6114a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo24073u(int i, boolean z) {
        C2014d dVar;
        int i2;
        TextView textView = this.f6127F;
        if (textView != null) {
            boolean z2 = false;
            if (this.f6134d.f6224s0 > 0) {
                textView.setText(String.format(Locale.getDefault(), "%d/%d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f6134d.f6224s0)}));
                this.f6127F.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            if ((z && i == 0) || (((i2 = dVar.f6224s0) > 0 && i > i2) || i < (dVar = this.f6134d).f6222r0)) {
                z2 = true;
            }
            C2014d dVar2 = this.f6134d;
            int i3 = z2 ? dVar2.f6226t0 : dVar2.f6205j;
            C2014d dVar3 = this.f6134d;
            int i4 = z2 ? dVar3.f6226t0 : dVar3.f6225t;
            if (this.f6134d.f6224s0 > 0) {
                this.f6127F.setTextColor(i3);
            }
            C2037b.m8426e(this.f6139s, i4);
            mo24063o(C2004b.POSITIVE).setEnabled(!z2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo24074v() {
        if (this.f6140z != null) {
            ArrayList<CharSequence> arrayList = this.f6134d.f6209l;
            if ((arrayList != null && arrayList.size() != 0) || this.f6134d.f6183W != null) {
                C2014d dVar = this.f6134d;
                if (dVar.f6184X == null) {
                    dVar.f6184X = new LinearLayoutManager(getContext());
                }
                if (this.f6140z.getLayoutManager() == null) {
                    this.f6140z.setLayoutManager(this.f6134d.f6184X);
                }
                this.f6140z.setAdapter(this.f6134d.f6183W);
                if (this.f6132K != null) {
                    ((C2000a) this.f6134d.f6183W).mo24045G(this);
                }
            }
        }
    }

    @UiThread
    /* renamed from: w */
    public final void mo24075w() {
        this.f6134d.f6183W.notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo24076z() {
        EditText editText = this.f6139s;
        if (editText != null) {
            editText.addTextChangedListener(new C2012b());
        }
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(@NonNull View view) throws IllegalAccessError {
        super.setContentView(view);
    }

    @UiThread
    public final void setTitle(@StringRes int i) {
        setTitle((CharSequence) this.f6134d.f6187a.getString(i));
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessError {
        super.setContentView(view, layoutParams);
    }
}
