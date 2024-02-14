package com.arlosoft.macrodroid.extensions;

import android.graphics.Rect;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import com.android.p023dx.rop.code.RegisterSpec;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;
import p370qa.C16269p;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.extensions.m */
/* compiled from: ViewExtensions.kt */
public final class C4666m {

    /* renamed from: com.arlosoft.macrodroid.extensions.m$a */
    /* compiled from: ViewExtensions.kt */
    public static final class C4667a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C16265l<String, C13339u> f11774a;

        C4667a(C16265l<? super String, C13339u> lVar) {
            this.f11774a = lVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f11774a.invoke(String.valueOf(editable));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.extensions.m$b */
    /* compiled from: ViewExtensions.kt */
    public static final class C4668b implements ViewTreeObserver.OnWindowFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f11775a;

        C4668b(View view) {
            this.f11775a = view;
        }

        public void onWindowFocusChanged(boolean z) {
            if (z) {
                C4666m.m18142j(this.f11775a);
                this.f11775a.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.extensions.m$c */
    /* compiled from: ViewExtensions.kt */
    public static final class C4669c implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ C16265l<Integer, C13339u> f11776a;

        C4669c(C16265l<? super Integer, C13339u> lVar) {
            this.f11776a = lVar;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C13706o.m87929f(adapterView, "parent");
            this.f11776a.invoke(Integer.valueOf(i));
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            C13706o.m87929f(adapterView, "parent");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.extensions.m$d */
    /* compiled from: ViewExtensions.kt */
    static final class C4670d extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C16270q<C15478k0, View, C13635d<? super C13339u>, Object> $handler;

        /* renamed from: $v */
        final /* synthetic */ View f11777$v;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4670d(C16270q<? super C15478k0, ? super View, ? super C13635d<? super C13339u>, ? extends Object> qVar, View view, C13635d<? super C4670d> dVar) {
            super(2, dVar);
            this.$handler = qVar;
            this.f11777$v = view;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C4670d dVar2 = new C4670d(this.$handler, this.f11777$v, dVar);
            dVar2.L$0 = obj;
            return dVar2;
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4670d) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C16270q<C15478k0, View, C13635d<? super C13339u>, Object> qVar = this.$handler;
                View view = this.f11777$v;
                this.label = 1;
                if (qVar.invoke((C15478k0) this.L$0, view, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.extensions.m$e */
    /* compiled from: ViewExtensions.kt */
    public static final class C4671e implements View.OnClickListener {

        /* renamed from: a */
        private long f11778a;

        /* renamed from: c */
        final /* synthetic */ long f11779c;

        /* renamed from: d */
        final /* synthetic */ C16254a<C13339u> f11780d;

        C4671e(long j, C16254a<C13339u> aVar) {
            this.f11779c = j;
            this.f11780d = aVar;
        }

        public void onClick(View view) {
            C13706o.m87929f(view, RegisterSpec.PREFIX);
            if (SystemClock.elapsedRealtime() - this.f11778a >= this.f11779c) {
                this.f11780d.invoke();
                this.f11778a = SystemClock.elapsedRealtime();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.extensions.m$f */
    /* compiled from: ViewExtensions.kt */
    static final class C4672f extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C16270q<C15478k0, View, C13635d<? super C13339u>, Object> $handler;

        /* renamed from: $v */
        final /* synthetic */ View f11781$v;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4672f(C16270q<? super C15478k0, ? super View, ? super C13635d<? super C13339u>, ? extends Object> qVar, View view, C13635d<? super C4672f> dVar) {
            super(2, dVar);
            this.$handler = qVar;
            this.f11781$v = view;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C4672f fVar = new C4672f(this.$handler, this.f11781$v, dVar);
            fVar.L$0 = obj;
            return fVar;
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4672f) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C16270q<C15478k0, View, C13635d<? super C13339u>, Object> qVar = this.$handler;
                View view = this.f11781$v;
                this.label = 1;
                if (qVar.invoke((C15478k0) this.L$0, view, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: f */
    public static final void m18138f(EditText editText, C16265l<? super String, C13339u> lVar) {
        C13706o.m87929f(editText, "<this>");
        C13706o.m87929f(lVar, "textChanged");
        editText.addTextChangedListener(new C4667a(lVar));
    }

    /* renamed from: g */
    public static final void m18139g(View view, int i) {
        C13706o.m87929f(view, "<this>");
        ViewParent parent = view.getParent();
        C13706o.m87927d(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        view2.post(new C4665l(view, i, view2));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m18140h(View view, int i, View view2) {
        C13706o.m87929f(view, "$this_expandTouchArea");
        C13706o.m87929f(view2, "$myParent");
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= i;
        rect.bottom += i;
        rect.left -= i;
        rect.right += i;
        view2.setTouchDelegate(new TouchDelegate(rect, view));
    }

    /* renamed from: i */
    public static final void m18141i(View view) {
        C13706o.m87929f(view, "<this>");
        view.requestFocus();
        if (view.hasWindowFocus()) {
            m18142j(view);
        } else {
            view.getViewTreeObserver().addOnWindowFocusChangeListener(new C4668b(view));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m18142j(View view) {
        if (view.isFocused()) {
            view.post(new C4664k(view));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m18143k(View view) {
        C13706o.m87929f(view, "$this_showTheKeyboardNow");
        Object systemService = view.getContext().getSystemService("input_method");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(view, 1);
    }

    /* renamed from: l */
    public static final void m18144l(View view) {
        C13706o.m87929f(view, "<this>");
        Object systemService = view.getContext().getSystemService("input_method");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: m */
    public static final void m18145m(Spinner spinner, C16265l<? super Integer, C13339u> lVar) {
        C13706o.m87929f(spinner, "<this>");
        C13706o.m87929f(lVar, "itemSelected");
        spinner.setOnItemSelectedListener(new C4669c(lVar));
    }

    /* renamed from: n */
    public static final void m18146n(View view, C13640g gVar, C16270q<? super C15478k0, ? super View, ? super C13635d<? super C13339u>, ? extends Object> qVar) {
        C13706o.m87929f(view, "<this>");
        C13706o.m87929f(gVar, "context");
        C13706o.m87929f(qVar, "handler");
        view.setOnClickListener(new C4662i(gVar, qVar));
    }

    /* renamed from: o */
    public static /* synthetic */ void m18147o(View view, C13640g gVar, C16270q qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C15186a1.m93731c();
        }
        m18146n(view, gVar, qVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m18148p(C13640g gVar, C16270q qVar, View view) {
        C13706o.m87929f(gVar, "$context");
        C13706o.m87929f(qVar, "$handler");
        C15414h.m94294c(C15503p1.f64723a, gVar, C15486m0.DEFAULT, new C4670d(qVar, view, (C13635d<? super C4670d>) null));
    }

    /* renamed from: q */
    public static final void m18149q(View view, long j, C16254a<C13339u> aVar) {
        C13706o.m87929f(view, "<this>");
        C13706o.m87929f(aVar, "action");
        view.setOnClickListener(new C4671e(j, aVar));
    }

    /* renamed from: r */
    public static /* synthetic */ void m18150r(View view, long j, C16254a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        m18149q(view, j, aVar);
    }

    /* renamed from: s */
    public static final void m18151s(View view, C13640g gVar, boolean z, C16270q<? super C15478k0, ? super View, ? super C13635d<? super C13339u>, ? extends Object> qVar) {
        C13706o.m87929f(view, "<this>");
        C13706o.m87929f(gVar, "context");
        C13706o.m87929f(qVar, "handler");
        view.setOnLongClickListener(new C4663j(gVar, z, qVar));
    }

    /* renamed from: t */
    public static /* synthetic */ void m18152t(View view, C13640g gVar, boolean z, C16270q qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C15186a1.m93731c();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        m18151s(view, gVar, z, qVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final boolean m18153u(C13640g gVar, boolean z, C16270q qVar, View view) {
        C13706o.m87929f(gVar, "$context");
        C13706o.m87929f(qVar, "$handler");
        C15414h.m94294c(C15503p1.f64723a, gVar, C15486m0.DEFAULT, new C4672f(qVar, view, (C13635d<? super C4672f>) null));
        return z;
    }

    /* renamed from: v */
    public static final void m18154v(EditText editText) {
        C13706o.m87929f(editText, "<this>");
        editText.setSelection(editText.getText().length());
    }

    /* renamed from: w */
    public static final void m18155w(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        C13706o.m87929f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(num != null ? num.intValue() : marginLayoutParams.leftMargin, num2 != null ? num2.intValue() : marginLayoutParams.topMargin, num3 != null ? num3.intValue() : marginLayoutParams.rightMargin, num4 != null ? num4.intValue() : marginLayoutParams.rightMargin);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: x */
    public static final void m18156x(View view) {
        C13706o.m87929f(view, "<this>");
        Object systemService = view.getContext().getSystemService("input_method");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(view, 1);
    }
}
