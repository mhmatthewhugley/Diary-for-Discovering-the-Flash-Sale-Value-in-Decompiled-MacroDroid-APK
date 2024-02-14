package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import p001a0.C0006d;
import p001a0.C0010h;
import p012b0.C1398b;
import p012b0.C1399c;
import p012b0.C1401e;
import p048t.C2097e;

public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: K */
    private static final String f843K = LottieAnimationView.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: L */
    public static final C1489h<Throwable> f844L = new C1452a();

    /* renamed from: A */
    private boolean f845A = false;

    /* renamed from: B */
    private boolean f846B = false;

    /* renamed from: C */
    private boolean f847C = false;

    /* renamed from: D */
    private boolean f848D = false;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f849E = true;

    /* renamed from: F */
    private C1500o f850F = C1500o.AUTOMATIC;

    /* renamed from: G */
    private final Set<C1491j> f851G = new HashSet();

    /* renamed from: H */
    private int f852H = 0;
    @Nullable

    /* renamed from: I */
    private C1494m<C1463d> f853I;
    @Nullable

    /* renamed from: J */
    private C1463d f854J;

    /* renamed from: a */
    private final C1489h<C1463d> f855a = new C1453b();

    /* renamed from: c */
    private final C1489h<Throwable> f856c = new C1454c();
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public C1489h<Throwable> f857d;
    /* access modifiers changed from: private */
    @DrawableRes

    /* renamed from: f */
    public int f858f = 0;

    /* renamed from: g */
    private final C1472f f859g = new C1472f();

    /* renamed from: o */
    private boolean f860o;

    /* renamed from: p */
    private String f861p;
    @RawRes

    /* renamed from: s */
    private int f862s;

    /* renamed from: z */
    private boolean f863z = false;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1451a();

        /* renamed from: a */
        String f864a;

        /* renamed from: c */
        int f865c;

        /* renamed from: d */
        float f866d;

        /* renamed from: f */
        boolean f867f;

        /* renamed from: g */
        String f868g;

        /* renamed from: o */
        int f869o;

        /* renamed from: p */
        int f870p;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$a */
        class C1451a implements Parcelable.Creator<SavedState> {
            C1451a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C1452a) null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C1452a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f864a);
            parcel.writeFloat(this.f866d);
            parcel.writeInt(this.f867f ? 1 : 0);
            parcel.writeString(this.f868g);
            parcel.writeInt(this.f869o);
            parcel.writeInt(this.f870p);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f864a = parcel.readString();
            this.f866d = parcel.readFloat();
            this.f867f = parcel.readInt() != 1 ? false : true;
            this.f868g = parcel.readString();
            this.f869o = parcel.readInt();
            this.f870p = parcel.readInt();
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    class C1452a implements C1489h<Throwable> {
        C1452a() {
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            if (C0010h.m81k(th)) {
                C0006d.m33d("Unable to load composition.", th);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    class C1453b implements C1489h<C1463d> {
        C1453b() {
        }

        /* renamed from: a */
        public void onResult(C1463d dVar) {
            LottieAnimationView.this.setComposition(dVar);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$c */
    class C1454c implements C1489h<Throwable> {
        C1454c() {
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.f858f != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f858f);
            }
            (LottieAnimationView.this.f857d == null ? LottieAnimationView.f844L : LottieAnimationView.this.f857d).onResult(th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$d */
    class C1455d implements Callable<C1493l<C1463d>> {

        /* renamed from: a */
        final /* synthetic */ int f873a;

        C1455d(int i) {
            this.f873a = i;
        }

        /* renamed from: a */
        public C1493l<C1463d> call() {
            return LottieAnimationView.this.f849E ? C1464e.m775o(LottieAnimationView.this.getContext(), this.f873a) : C1464e.m776p(LottieAnimationView.this.getContext(), this.f873a, (String) null);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$e */
    class C1456e implements Callable<C1493l<C1463d>> {

        /* renamed from: a */
        final /* synthetic */ String f875a;

        C1456e(String str) {
            this.f875a = str;
        }

        /* renamed from: a */
        public C1493l<C1463d> call() {
            return LottieAnimationView.this.f849E ? C1464e.m766f(LottieAnimationView.this.getContext(), this.f875a) : C1464e.m767g(LottieAnimationView.this.getContext(), this.f875a, (String) null);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$f */
    class C1457f extends C1399c<T> {

        /* renamed from: d */
        final /* synthetic */ C1401e f877d;

        C1457f(C1401e eVar) {
            this.f877d = eVar;
        }

        /* renamed from: a */
        public T mo16818a(C1398b<T> bVar) {
            return this.f877d.mo16826a(bVar);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$g */
    static /* synthetic */ class C1458g {

        /* renamed from: a */
        static final /* synthetic */ int[] f879a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.o[] r0 = com.airbnb.lottie.C1500o.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f879a = r0
                com.airbnb.lottie.o r1 = com.airbnb.lottie.C1500o.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f879a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.o r1 = com.airbnb.lottie.C1500o.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f879a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.o r1 = com.airbnb.lottie.C1500o.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.C1458g.<clinit>():void");
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m714n(attributeSet, R$attr.lottieAnimationViewStyle);
    }

    /* renamed from: h */
    private void m709h() {
        C1494m<C1463d> mVar = this.f853I;
        if (mVar != null) {
            mVar.mo17168k(this.f855a);
            this.f853I.mo17167j(this.f856c);
        }
    }

    /* renamed from: i */
    private void m710i() {
        this.f854J = null;
        this.f859g.mo17127i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r3 != false) goto L_0x0041;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m711k() {
        /*
            r5 = this;
            int[] r0 = com.airbnb.lottie.LottieAnimationView.C1458g.f879a
            com.airbnb.lottie.o r1 = r5.f850F
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x0041
            if (r0 == r1) goto L_0x0013
            r3 = 3
            if (r0 == r3) goto L_0x0015
        L_0x0013:
            r1 = 1
            goto L_0x0041
        L_0x0015:
            com.airbnb.lottie.d r0 = r5.f854J
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.mo17067p()
            if (r0 == 0) goto L_0x0027
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L_0x0027
            goto L_0x003f
        L_0x0027:
            com.airbnb.lottie.d r0 = r5.f854J
            if (r0 == 0) goto L_0x0033
            int r0 = r0.mo17063l()
            r4 = 4
            if (r0 <= r4) goto L_0x0033
            goto L_0x003f
        L_0x0033:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r0 == r4) goto L_0x003f
            r4 = 25
            if (r0 != r4) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r3 = 1
        L_0x003f:
            if (r3 == 0) goto L_0x0013
        L_0x0041:
            int r0 = r5.getLayerType()
            if (r1 == r0) goto L_0x004b
            r0 = 0
            r5.setLayerType(r1, r0)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.m711k():void");
    }

    /* renamed from: l */
    private C1494m<C1463d> m712l(String str) {
        if (isInEditMode()) {
            return new C1494m<>(new C1456e(str), true);
        }
        return this.f849E ? C1464e.m764d(getContext(), str) : C1464e.m765e(getContext(), str, (String) null);
    }

    /* renamed from: m */
    private C1494m<C1463d> m713m(@RawRes int i) {
        if (isInEditMode()) {
            return new C1494m<>(new C1455d(i), true);
        }
        return this.f849E ? C1464e.m773m(getContext(), i) : C1464e.m774n(getContext(), i, (String) null);
    }

    /* renamed from: n */
    private void m714n(@Nullable AttributeSet attributeSet, @AttrRes int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.LottieAnimationView, i, 0);
        this.f849E = obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_cacheComposition, true);
        int i2 = R$styleable.LottieAnimationView_lottie_rawRes;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        int i3 = R$styleable.LottieAnimationView_lottie_fileName;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i3);
        int i4 = R$styleable.LottieAnimationView_lottie_url;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i4);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(i3);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(i4)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(R$styleable.LottieAnimationView_lottie_fallbackRes, 0));
            if (obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_autoPlay, false)) {
                this.f846B = true;
                this.f848D = true;
            }
            if (obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_loop, false)) {
                this.f859g.mo17119f0(-1);
            }
            int i5 = R$styleable.LottieAnimationView_lottie_repeatMode;
            if (obtainStyledAttributes.hasValue(i5)) {
                setRepeatMode(obtainStyledAttributes.getInt(i5, 1));
            }
            int i6 = R$styleable.LottieAnimationView_lottie_repeatCount;
            if (obtainStyledAttributes.hasValue(i6)) {
                setRepeatCount(obtainStyledAttributes.getInt(i6, -1));
            }
            int i7 = R$styleable.LottieAnimationView_lottie_speed;
            if (obtainStyledAttributes.hasValue(i7)) {
                setSpeed(obtainStyledAttributes.getFloat(i7, 1.0f));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(R$styleable.LottieAnimationView_lottie_imageAssetsFolder));
            setProgress(obtainStyledAttributes.getFloat(R$styleable.LottieAnimationView_lottie_progress, 0.0f));
            mo16993j(obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
            int i8 = R$styleable.LottieAnimationView_lottie_colorFilter;
            if (obtainStyledAttributes.hasValue(i8)) {
                C1501p pVar = new C1501p(AppCompatResources.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(i8, -1)).getDefaultColor());
                mo16977e(new C2097e("**"), C1492k.f984E, new C1399c(pVar));
            }
            int i9 = R$styleable.LottieAnimationView_lottie_scale;
            if (obtainStyledAttributes.hasValue(i9)) {
                this.f859g.mo17128i0(obtainStyledAttributes.getFloat(i9, 1.0f));
            }
            int i10 = R$styleable.LottieAnimationView_lottie_renderMode;
            if (obtainStyledAttributes.hasValue(i10)) {
                C1500o oVar = C1500o.AUTOMATIC;
                int i11 = obtainStyledAttributes.getInt(i10, oVar.ordinal());
                if (i11 >= C1500o.values().length) {
                    i11 = oVar.ordinal();
                }
                setRenderMode(C1500o.values()[i11]);
            }
            setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
            obtainStyledAttributes.recycle();
            C1472f fVar = this.f859g;
            if (C0010h.m76f(getContext()) != 0.0f) {
                z = true;
            }
            fVar.mo17133k0(Boolean.valueOf(z));
            m711k();
            this.f860o = true;
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    private void setCompositionTask(C1494m<C1463d> mVar) {
        m710i();
        m709h();
        this.f853I = mVar.mo17166f(this.f855a).mo17165e(this.f856c);
    }

    /* renamed from: u */
    private void m715u() {
        boolean o = mo16994o();
        setImageDrawable((Drawable) null);
        setImageDrawable(this.f859g);
        if (o) {
            this.f859g.mo17098M();
        }
    }

    public void buildDrawingCache(boolean z) {
        C1461c.m735a("buildDrawingCache");
        this.f852H++;
        super.buildDrawingCache(z);
        if (this.f852H == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(C1500o.HARDWARE);
        }
        this.f852H--;
        C1461c.m736b("buildDrawingCache");
    }

    /* renamed from: e */
    public <T> void mo16977e(C2097e eVar, T t, C1399c<T> cVar) {
        this.f859g.mo17114c(eVar, t, cVar);
    }

    /* renamed from: f */
    public <T> void mo16978f(C2097e eVar, T t, C1401e<T> eVar2) {
        this.f859g.mo17114c(eVar, t, new C1457f(eVar2));
    }

    @MainThread
    /* renamed from: g */
    public void mo16979g() {
        this.f846B = false;
        this.f845A = false;
        this.f863z = false;
        this.f859g.mo17125h();
        m711k();
    }

    @Nullable
    public C1463d getComposition() {
        return this.f854J;
    }

    public long getDuration() {
        C1463d dVar = this.f854J;
        if (dVar != null) {
            return (long) dVar.mo17055d();
        }
        return 0;
    }

    public int getFrame() {
        return this.f859g.mo17140s();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f859g.mo17148v();
    }

    public float getMaxFrame() {
        return this.f859g.mo17149w();
    }

    public float getMinFrame() {
        return this.f859g.mo17150y();
    }

    @Nullable
    public C1497n getPerformanceTracker() {
        return this.f859g.mo17151z();
    }

    @FloatRange(from = 0.0d, mo592to = 1.0d)
    public float getProgress() {
        return this.f859g.mo17086A();
    }

    public int getRepeatCount() {
        return this.f859g.mo17087B();
    }

    public int getRepeatMode() {
        return this.f859g.mo17088C();
    }

    public float getScale() {
        return this.f859g.mo17089D();
    }

    public float getSpeed() {
        return this.f859g.mo17090E();
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C1472f fVar = this.f859g;
        if (drawable2 == fVar) {
            super.invalidateDrawable(fVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* renamed from: j */
    public void mo16993j(boolean z) {
        this.f859g.mo17135m(z);
    }

    /* renamed from: o */
    public boolean mo16994o() {
        return this.f859g.mo17093H();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && (this.f848D || this.f846B)) {
            mo17001q();
            this.f848D = false;
            this.f846B = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (mo16994o()) {
            mo16979g();
            this.f846B = true;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f864a;
        this.f861p = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f861p);
        }
        int i = savedState.f865c;
        this.f862s = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.f866d);
        if (savedState.f867f) {
            mo17001q();
        }
        this.f859g.mo17105T(savedState.f868g);
        setRepeatMode(savedState.f869o);
        setRepeatCount(savedState.f870p);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f864a = this.f861p;
        savedState.f865c = this.f862s;
        savedState.f866d = this.f859g.mo17086A();
        savedState.f867f = this.f859g.mo17093H() || (!ViewCompat.isAttachedToWindow(this) && this.f846B);
        savedState.f868g = this.f859g.mo17148v();
        savedState.f869o = this.f859g.mo17088C();
        savedState.f870p = this.f859g.mo17087B();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(@NonNull View view, int i) {
        if (this.f860o) {
            if (isShown()) {
                if (this.f845A) {
                    mo17002r();
                } else if (this.f863z) {
                    mo17001q();
                }
                this.f845A = false;
                this.f863z = false;
            } else if (mo16994o()) {
                mo17000p();
                this.f845A = true;
            }
        }
    }

    @MainThread
    /* renamed from: p */
    public void mo17000p() {
        this.f848D = false;
        this.f846B = false;
        this.f845A = false;
        this.f863z = false;
        this.f859g.mo17095J();
        m711k();
    }

    @MainThread
    /* renamed from: q */
    public void mo17001q() {
        if (isShown()) {
            this.f859g.mo17096K();
            m711k();
            return;
        }
        this.f863z = true;
    }

    @MainThread
    /* renamed from: r */
    public void mo17002r() {
        if (isShown()) {
            this.f859g.mo17098M();
            m711k();
            return;
        }
        this.f863z = false;
        this.f845A = true;
    }

    /* renamed from: s */
    public void mo17003s(InputStream inputStream, @Nullable String str) {
        setCompositionTask(C1464e.m768h(inputStream, str));
    }

    public void setAnimation(@RawRes int i) {
        this.f862s = i;
        this.f861p = null;
        setCompositionTask(m713m(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        mo17035t(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f849E ? C1464e.m777q(getContext(), str) : C1464e.m778r(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f859g.mo17099N(z);
    }

    public void setCacheComposition(boolean z) {
        this.f849E = z;
    }

    public void setComposition(@NonNull C1463d dVar) {
        if (C1461c.f881a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Set Composition \n");
            sb.append(dVar);
        }
        this.f859g.setCallback(this);
        this.f854J = dVar;
        this.f847C = true;
        boolean O = this.f859g.mo17100O(dVar);
        this.f847C = false;
        m711k();
        if (getDrawable() != this.f859g || O) {
            if (!O) {
                m715u();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (C1491j a : this.f851G) {
                a.mo17160a(dVar);
            }
        }
    }

    public void setFailureListener(@Nullable C1489h<Throwable> hVar) {
        this.f857d = hVar;
    }

    public void setFallbackResource(@DrawableRes int i) {
        this.f858f = i;
    }

    public void setFontAssetDelegate(C1459a aVar) {
        this.f859g.mo17101P(aVar);
    }

    public void setFrame(int i) {
        this.f859g.mo17102Q(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f859g.mo17103R(z);
    }

    public void setImageAssetDelegate(C1460b bVar) {
        this.f859g.mo17104S(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f859g.mo17105T(str);
    }

    public void setImageBitmap(Bitmap bitmap) {
        m709h();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        m709h();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        m709h();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f859g.mo17106U(i);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        this.f859g.mo17108W(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f859g.mo17110Y(str);
    }

    public void setMinFrame(int i) {
        this.f859g.mo17111Z(i);
    }

    public void setMinProgress(float f) {
        this.f859g.mo17113b0(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f859g.mo17115c0(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f859g.mo17116d0(z);
    }

    public void setProgress(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        this.f859g.mo17118e0(f);
    }

    public void setRenderMode(C1500o oVar) {
        this.f850F = oVar;
        m711k();
    }

    public void setRepeatCount(int i) {
        this.f859g.mo17119f0(i);
    }

    public void setRepeatMode(int i) {
        this.f859g.mo17120g0(i);
    }

    public void setSafeMode(boolean z) {
        this.f859g.mo17126h0(z);
    }

    public void setScale(float f) {
        this.f859g.mo17128i0(f);
        if (getDrawable() == this.f859g) {
            m715u();
        }
    }

    public void setSpeed(float f) {
        this.f859g.mo17132j0(f);
    }

    public void setTextDelegate(C1502q qVar) {
        this.f859g.mo17134l0(qVar);
    }

    /* renamed from: t */
    public void mo17035t(String str, @Nullable String str2) {
        mo17003s(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void unscheduleDrawable(Drawable drawable) {
        C1472f fVar;
        if (!this.f847C && drawable == (fVar = this.f859g) && fVar.mo17093H()) {
            mo17000p();
        } else if (!this.f847C && (drawable instanceof C1472f)) {
            C1472f fVar2 = (C1472f) drawable;
            if (fVar2.mo17093H()) {
                fVar2.mo17095J();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f859g.mo17107V(str);
    }

    public void setMinFrame(String str) {
        this.f859g.mo17112a0(str);
    }

    public void setAnimation(String str) {
        this.f861p = str;
        this.f862s = 0;
        setCompositionTask(m712l(str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m714n(attributeSet, i);
    }
}
