package com.arlosoft.macrodroid.action.activities.httprequest;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.documentfile.provider.DocumentFile;
import androidx.fragment.app.FragmentActivity;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.HttpRequestAction;
import com.arlosoft.macrodroid.action.HttpRequestConfig;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.utils.C6440u1;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.widget.NDSpinner;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import org.jetbrains.anko.sdk27.coroutines.C16061a;
import p135n1.C7967d;
import p139o1.C8034z;
import p154r0.C8184d;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16270q;
import p370qa.C16271r;

/* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x */
/* compiled from: HttpRequestSettingsFragment.kt */
public final class C2889x extends C8184d {

    /* renamed from: B */
    public static final C2890a f7965B = new C2890a((C13695i) null);

    /* renamed from: A */
    public Map<Integer, View> f7966A = new LinkedHashMap();

    /* renamed from: d */
    public HttpRequestConfigViewModel f7967d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C8034z f7968f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Macro f7969g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public transient String f7970o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public transient DictionaryKeys f7971p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public transient String f7972s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public transient DictionaryKeys f7973z;

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$a */
    /* compiled from: HttpRequestSettingsFragment.kt */
    public static final class C2890a {
        private C2890a() {
        }

        public /* synthetic */ C2890a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C2889x mo26269a(long j) {
            C2889x xVar = new C2889x();
            Bundle bundle = new Bundle();
            bundle.putLong("MacroGuid", j);
            xVar.setArguments(bundle);
            return xVar;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$b */
    /* compiled from: HttpRequestSettingsFragment.kt */
    static final class C2891b extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        final /* synthetic */ HttpRequestAction $action;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ C2889x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2891b(C2889x xVar, HttpRequestAction httpRequestAction, C13635d<? super C2891b> dVar) {
            super(4, dVar);
            this.this$0 = xVar;
            this.$action = httpRequestAction;
        }

        /* renamed from: h */
        public final Object mo26270h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C2891b bVar = new C2891b(this.this$0, this.$action, dVar);
            bVar.Z$0 = z;
            return bVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo26270h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                boolean z = this.Z$0;
                C8034z zVar = null;
                if (z) {
                    C2889x xVar = this.this$0;
                    C8034z e0 = xVar.f7968f;
                    if (e0 == null) {
                        C13706o.m87945v("binding");
                        e0 = null;
                    }
                    NDSpinner nDSpinner = e0.f19544p;
                    C13706o.m87928e(nDSpinner, "binding.responseCodeVariableSpinner");
                    xVar.m14153s0(nDSpinner, this.$action);
                }
                C8034z e02 = this.this$0.f7968f;
                if (e02 == null) {
                    C13706o.m87945v("binding");
                    e02 = null;
                }
                LinearLayout linearLayout = e02.f19543o;
                C13706o.m87928e(linearLayout, "binding.responseCodeSelectionLayout");
                linearLayout.setVisibility(z ? 0 : 8);
                C8034z e03 = this.this$0.f7968f;
                if (e03 == null) {
                    C13706o.m87945v("binding");
                    e03 = null;
                }
                float f = 0.4f;
                if (e03.f19544p.getCount() <= 1) {
                    C8034z e04 = this.this$0.f7968f;
                    if (e04 == null) {
                        C13706o.m87945v("binding");
                        e04 = null;
                    }
                    if (C13706o.m87924a(e04.f19544p.getItemAtPosition(0), this.this$0.getString(C17541R$string.trigger_variable_no_variables))) {
                        C8034z e05 = this.this$0.f7968f;
                        if (e05 == null) {
                            C13706o.m87945v("binding");
                            e05 = null;
                        }
                        LinearLayout linearLayout2 = e05.f19543o;
                        C13706o.m87928e(linearLayout2, "binding.responseCodeSelectionLayout");
                        linearLayout2.setVisibility(8);
                        C8034z e06 = this.this$0.f7968f;
                        if (e06 == null) {
                            C13706o.m87945v("binding");
                            e06 = null;
                        }
                        e06.f19547s.setChecked(false);
                        C8034z e07 = this.this$0.f7968f;
                        if (e07 == null) {
                            C13706o.m87945v("binding");
                        } else {
                            zVar = e07;
                        }
                        zVar.f19544p.setAlpha(0.4f);
                        C15626c.makeText(this.this$0.requireActivity().getApplicationContext(), C17541R$string.trigger_variable_no_variables, 0).show();
                        return C13339u.f61331a;
                    }
                }
                C8034z e08 = this.this$0.f7968f;
                if (e08 == null) {
                    C13706o.m87945v("binding");
                    e08 = null;
                }
                e08.f19544p.setEnabled(z);
                C8034z e09 = this.this$0.f7968f;
                if (e09 == null) {
                    C13706o.m87945v("binding");
                } else {
                    zVar = e09;
                }
                NDSpinner nDSpinner2 = zVar.f19544p;
                if (z) {
                    f = 1.0f;
                }
                nDSpinner2.setAlpha(f);
                this.this$0.mo26268r0().mo26203C(z);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$c */
    /* compiled from: HttpRequestSettingsFragment.kt */
    static final class C2892c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ HttpRequestAction $action;
        int label;
        final /* synthetic */ C2889x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2892c(C2889x xVar, HttpRequestAction httpRequestAction, C13635d<? super C2892c> dVar) {
            super(3, dVar);
            this.this$0 = xVar;
            this.$action = httpRequestAction;
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public static final void m14162r(C2889x xVar, HttpRequestAction httpRequestAction, MacroDroidVariable macroDroidVariable) {
            xVar.f7970o = macroDroidVariable.getName();
            C8034z zVar = null;
            xVar.f7971p = null;
            xVar.mo26268r0().mo26227x(macroDroidVariable.getName(), (List<String>) null);
            C8034z e0 = xVar.f7968f;
            if (e0 == null) {
                C13706o.m87945v("binding");
            } else {
                zVar = e0;
            }
            NDSpinner nDSpinner = zVar.f19544p;
            C13706o.m87928e(nDSpinner, "binding.responseCodeVariableSpinner");
            xVar.m14153s0(nDSpinner, httpRequestAction);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                FragmentActivity requireActivity = this.this$0.requireActivity();
                C8034z e0 = this.this$0.f7968f;
                if (e0 == null) {
                    C13706o.m87945v("binding");
                    e0 = null;
                }
                NDSpinner nDSpinner = e0.f19544p;
                HttpRequestAction httpRequestAction = this.$action;
                C6440u1.m24747d(requireActivity, nDSpinner, httpRequestAction, C17542R$style.Theme_App_Dialog_Action, 1, new C2914y(this.this$0, httpRequestAction));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: p */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2892c(this.this$0, this.$action, dVar).invokeSuspend(C13339u.f61331a);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$d */
    /* compiled from: HttpRequestSettingsFragment.kt */
    static final class C2893d extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ C2889x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2893d(C2889x xVar, C13635d<? super C2893d> dVar) {
            super(4, dVar);
            this.this$0 = xVar;
        }

        /* renamed from: h */
        public final Object mo26272h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C2893d dVar2 = new C2893d(this.this$0, dVar);
            dVar2.Z$0 = z;
            return dVar2.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo26272h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                if (this.Z$0) {
                    this.this$0.mo26268r0().mo26202B(0);
                    C8034z e0 = this.this$0.f7968f;
                    C8034z zVar = null;
                    if (e0 == null) {
                        C13706o.m87945v("binding");
                        e0 = null;
                    }
                    LinearLayout linearLayout = e0.f19546r;
                    C13706o.m87928e(linearLayout, "binding.responseVariableLayout");
                    linearLayout.setVisibility(8);
                    C8034z e02 = this.this$0.f7968f;
                    if (e02 == null) {
                        C13706o.m87945v("binding");
                    } else {
                        zVar = e02;
                    }
                    LinearLayout linearLayout2 = zVar.f19545q;
                    C13706o.m87928e(linearLayout2, "binding.responseFileLayout");
                    linearLayout2.setVisibility(8);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$e */
    /* compiled from: HttpRequestSettingsFragment.kt */
    static final class C2894e extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        final /* synthetic */ HttpRequestAction $action;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ C2889x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2894e(C2889x xVar, HttpRequestAction httpRequestAction, C13635d<? super C2894e> dVar) {
            super(4, dVar);
            this.this$0 = xVar;
            this.$action = httpRequestAction;
        }

        /* renamed from: h */
        public final Object mo26273h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C2894e eVar = new C2894e(this.this$0, this.$action, dVar);
            eVar.Z$0 = z;
            return eVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo26273h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                if (this.Z$0) {
                    C2889x xVar = this.this$0;
                    C8034z e0 = xVar.f7968f;
                    C8034z zVar = null;
                    if (e0 == null) {
                        C13706o.m87945v("binding");
                        e0 = null;
                    }
                    NDSpinner nDSpinner = e0.f19541m;
                    C13706o.m87928e(nDSpinner, "binding.httpResponseVariableSpinner");
                    xVar.m14154u0(nDSpinner, this.$action);
                    this.this$0.mo26268r0().mo26202B(1);
                    C8034z e02 = this.this$0.f7968f;
                    if (e02 == null) {
                        C13706o.m87945v("binding");
                        e02 = null;
                    }
                    LinearLayout linearLayout = e02.f19546r;
                    C13706o.m87928e(linearLayout, "binding.responseVariableLayout");
                    linearLayout.setVisibility(0);
                    C8034z e03 = this.this$0.f7968f;
                    if (e03 == null) {
                        C13706o.m87945v("binding");
                    } else {
                        zVar = e03;
                    }
                    LinearLayout linearLayout2 = zVar.f19545q;
                    C13706o.m87928e(linearLayout2, "binding.responseFileLayout");
                    linearLayout2.setVisibility(8);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$f */
    /* compiled from: HttpRequestSettingsFragment.kt */
    static final class C2895f extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ C2889x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2895f(C2889x xVar, C13635d<? super C2895f> dVar) {
            super(4, dVar);
            this.this$0 = xVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public static final void m14167r(C2889x xVar) {
            C8034z e0 = xVar.f7968f;
            if (e0 == null) {
                C13706o.m87945v("binding");
                e0 = null;
            }
            e0.f19554z.fullScroll(130);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo26274p((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                if (this.Z$0) {
                    this.this$0.mo26268r0().mo26202B(2);
                    C8034z e0 = this.this$0.f7968f;
                    C8034z zVar = null;
                    if (e0 == null) {
                        C13706o.m87945v("binding");
                        e0 = null;
                    }
                    LinearLayout linearLayout = e0.f19546r;
                    C13706o.m87928e(linearLayout, "binding.responseVariableLayout");
                    linearLayout.setVisibility(8);
                    C8034z e02 = this.this$0.f7968f;
                    if (e02 == null) {
                        C13706o.m87945v("binding");
                        e02 = null;
                    }
                    LinearLayout linearLayout2 = e02.f19545q;
                    C13706o.m87928e(linearLayout2, "binding.responseFileLayout");
                    linearLayout2.setVisibility(0);
                    C8034z e03 = this.this$0.f7968f;
                    if (e03 == null) {
                        C13706o.m87945v("binding");
                    } else {
                        zVar = e03;
                    }
                    zVar.f19554z.post(new C2915z(this.this$0));
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: p */
        public final Object mo26274p(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C2895f fVar = new C2895f(this.this$0, dVar);
            fVar.Z$0 = z;
            return fVar.invokeSuspend(C13339u.f61331a);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$g */
    /* compiled from: HttpRequestSettingsFragment.kt */
    static final class C2896g extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ HttpRequestAction $action;
        int label;
        final /* synthetic */ C2889x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2896g(C2889x xVar, HttpRequestAction httpRequestAction, C13635d<? super C2896g> dVar) {
            super(3, dVar);
            this.this$0 = xVar;
            this.$action = httpRequestAction;
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public static final void m14170r(C2889x xVar, HttpRequestAction httpRequestAction, MacroDroidVariable macroDroidVariable) {
            xVar.f7972s = macroDroidVariable.getName();
            C8034z zVar = null;
            xVar.f7973z = null;
            xVar.mo26268r0().mo26228y(macroDroidVariable.getName(), (List<String>) null);
            C8034z e0 = xVar.f7968f;
            if (e0 == null) {
                C13706o.m87945v("binding");
            } else {
                zVar = e0;
            }
            NDSpinner nDSpinner = zVar.f19541m;
            C13706o.m87928e(nDSpinner, "binding.httpResponseVariableSpinner");
            xVar.m14154u0(nDSpinner, httpRequestAction);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                FragmentActivity requireActivity = this.this$0.requireActivity();
                C8034z e0 = this.this$0.f7968f;
                if (e0 == null) {
                    C13706o.m87945v("binding");
                    e0 = null;
                }
                NDSpinner nDSpinner = e0.f19541m;
                HttpRequestAction httpRequestAction = this.$action;
                C6440u1.m24747d(requireActivity, nDSpinner, httpRequestAction, C17542R$style.Theme_App_Dialog_Action, 2, new C2843a0(this.this$0, httpRequestAction));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: p */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2896g(this.this$0, this.$action, dVar).invokeSuspend(C13339u.f61331a);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$h */
    /* compiled from: HttpRequestSettingsFragment.kt */
    public static final class C2897h implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ C2889x f7974a;

        /* renamed from: b */
        final /* synthetic */ Spinner f7975b;

        C2897h(C2889x xVar, Spinner spinner) {
            this.f7974a = xVar;
            this.f7975b = spinner;
        }

        /* renamed from: a */
        public void mo24722a(int i, String str) {
            C13706o.m87929f(str, "value");
        }

        /* renamed from: b */
        public void mo24723b(MacroDroidVariable macroDroidVariable, List<String> list) {
            C13706o.m87929f(macroDroidVariable, "variable");
            this.f7974a.mo26268r0().mo26227x(macroDroidVariable.getName(), list);
            this.f7975b.setEnabled(true);
            this.f7975b.setAlpha(1.0f);
            this.f7974a.f7970o = macroDroidVariable.getName();
            this.f7974a.f7971p = list != null ? new DictionaryKeys(list) : null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$i */
    /* compiled from: HttpRequestSettingsFragment.kt */
    public static final class C2898i implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ C2889x f7976a;

        /* renamed from: b */
        final /* synthetic */ Spinner f7977b;

        C2898i(C2889x xVar, Spinner spinner) {
            this.f7976a = xVar;
            this.f7977b = spinner;
        }

        /* renamed from: a */
        public void mo24722a(int i, String str) {
            C13706o.m87929f(str, "value");
        }

        /* renamed from: b */
        public void mo24723b(MacroDroidVariable macroDroidVariable, List<String> list) {
            C13706o.m87929f(macroDroidVariable, "variable");
            this.f7976a.mo26268r0().mo26228y(macroDroidVariable.getName(), list);
            this.f7977b.setEnabled(true);
            this.f7976a.f7972s = macroDroidVariable.getName();
            this.f7976a.f7973z = list != null ? new DictionaryKeys(list) : null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$j */
    /* compiled from: TextView.kt */
    public static final class C2899j implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C2889x f7978a;

        public C2899j(C2889x xVar) {
            this.f7978a = xVar;
        }

        public void afterTextChanged(Editable editable) {
            HttpRequestConfigViewModel r0 = this.f7978a.mo26268r0();
            C8034z e0 = this.f7978a.f7968f;
            if (e0 == null) {
                C13706o.m87945v("binding");
                e0 = null;
            }
            r0.mo26205E(String.valueOf(e0.f19527C.getText()));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$k */
    /* compiled from: TextView.kt */
    public static final class C2900k implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C2889x f7979a;

        public C2900k(C2889x xVar) {
            this.f7979a = xVar;
        }

        public void afterTextChanged(Editable editable) {
            HttpRequestConfigViewModel r0 = this.f7979a.mo26268r0();
            C8034z e0 = this.f7979a.f7968f;
            if (e0 == null) {
                C13706o.m87945v("binding");
                e0 = null;
            }
            r0.mo26220q(e0.f19536h.getText().toString());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$l */
    /* compiled from: TextView.kt */
    public static final class C2901l implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C2889x f7980a;

        public C2901l(C2889x xVar) {
            this.f7980a = xVar;
        }

        public void afterTextChanged(Editable editable) {
            HttpRequestConfigViewModel r0 = this.f7980a.mo26268r0();
            C8034z e0 = this.f7980a.f7968f;
            if (e0 == null) {
                C13706o.m87945v("binding");
                e0 = null;
            }
            r0.mo26219p(e0.f19534f.getText().toString());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$m */
    /* compiled from: TextView.kt */
    public static final class C2902m implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C2889x f7981a;

        public C2902m(C2889x xVar) {
            this.f7981a = xVar;
        }

        public void afterTextChanged(Editable editable) {
            HttpRequestConfigViewModel r0 = this.f7981a.mo26268r0();
            C8034z e0 = this.f7981a.f7968f;
            if (e0 == null) {
                C13706o.m87945v("binding");
                e0 = null;
            }
            r0.mo26229z(e0.f19548t.getText().toString());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$n */
    /* compiled from: TextView.kt */
    public static final class C2903n implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C2889x f7982a;

        public C2903n(C2889x xVar) {
            this.f7982a = xVar;
        }

        public void afterTextChanged(Editable editable) {
            int i;
            try {
                C8034z e0 = this.f7982a.f7968f;
                if (e0 == null) {
                    C13706o.m87945v("binding");
                    e0 = null;
                }
                i = Integer.parseInt(e0.f19526B.getText().toString());
            } catch (Exception unused) {
                i = 0;
            }
            this.f7982a.mo26268r0().mo26204D(i);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$o */
    /* compiled from: HttpRequestSettingsFragment.kt */
    static final class C2904o extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $authUsernameTextListener;
        int label;
        final /* synthetic */ C2889x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2904o(C2889x xVar, C4023j0.C4028e eVar, C13635d<? super C2904o> dVar) {
            super(3, dVar);
            this.this$0 = xVar;
            this.$authUsernameTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2904o(this.this$0, this.$authUsernameTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15698D(this.this$0.getActivity(), this.$authUsernameTextListener, this.this$0.f7969g, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$p */
    /* compiled from: HttpRequestSettingsFragment.kt */
    static final class C2905p extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $authPasswordTextListener;
        int label;
        final /* synthetic */ C2889x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2905p(C2889x xVar, C4023j0.C4028e eVar, C13635d<? super C2905p> dVar) {
            super(3, dVar);
            this.this$0 = xVar;
            this.$authPasswordTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2905p(this.this$0, this.$authPasswordTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15698D(this.this$0.getActivity(), this.$authPasswordTextListener, this.this$0.f7969g, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$q */
    /* compiled from: HttpRequestSettingsFragment.kt */
    static final class C2906q extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $filenameMagicTextListener;
        int label;
        final /* synthetic */ C2889x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2906q(C2889x xVar, C4023j0.C4028e eVar, C13635d<? super C2906q> dVar) {
            super(3, dVar);
            this.this$0 = xVar;
            this.$filenameMagicTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2906q(this.this$0, this.$filenameMagicTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15698D(this.this$0.getActivity(), this.$filenameMagicTextListener, this.this$0.f7969g, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$r */
    /* compiled from: HttpRequestSettingsFragment.kt */
    static final class C2907r extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C2889x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2907r(C2889x xVar, C13635d<? super C2907r> dVar) {
            super(3, dVar);
            this.this$0 = xVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2907r(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                try {
                    this.this$0.startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), 0);
                } catch (Exception unused2) {
                    Context applicationContext = this.this$0.requireContext().getApplicationContext();
                    C15626c.m94876a(applicationContext, "ACTION_OPEN_DOCUMENT " + this.this$0.getString(C17541R$string.not_supported), 0).show();
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$s */
    /* compiled from: HttpRequestSettingsFragment.kt */
    public static final class C2908s implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ C2889x f7983a;

        C2908s(C2889x xVar) {
            this.f7983a = xVar;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C13706o.m87929f(adapterView, "parent");
            this.f7983a.mo26268r0().mo26226w(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            C13706o.m87929f(adapterView, "parent");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$t */
    /* compiled from: HttpRequestSettingsFragment.kt */
    static final class C2909t extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ C2889x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2909t(C2889x xVar, C13635d<? super C2909t> dVar) {
            super(4, dVar);
            this.this$0 = xVar;
        }

        /* renamed from: h */
        public final Object mo26297h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C2909t tVar = new C2909t(this.this$0, dVar);
            tVar.Z$0 = z;
            return tVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo26297h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo26268r0().mo26221r(this.Z$0);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$u */
    /* compiled from: HttpRequestSettingsFragment.kt */
    static final class C2910u extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ C2889x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2910u(C2889x xVar, C13635d<? super C2910u> dVar) {
            super(4, dVar);
            this.this$0 = xVar;
        }

        /* renamed from: h */
        public final Object mo26298h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C2910u uVar = new C2910u(this.this$0, dVar);
            uVar.Z$0 = z;
            return uVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo26298h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo26268r0().mo26216n(this.Z$0);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$v */
    /* compiled from: HttpRequestSettingsFragment.kt */
    static final class C2911v extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ C2889x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2911v(C2889x xVar, C13635d<? super C2911v> dVar) {
            super(4, dVar);
            this.this$0 = xVar;
        }

        /* renamed from: h */
        public final Object mo26299h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C2911v vVar = new C2911v(this.this$0, dVar);
            vVar.Z$0 = z;
            return vVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo26299h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo26268r0().mo26225v(this.Z$0);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$w */
    /* compiled from: HttpRequestSettingsFragment.kt */
    static final class C2912w extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ C2889x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2912w(C2889x xVar, C13635d<? super C2912w> dVar) {
            super(4, dVar);
            this.this$0 = xVar;
        }

        /* renamed from: h */
        public final Object mo26300h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C2912w wVar = new C2912w(this.this$0, dVar);
            wVar.Z$0 = z;
            return wVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo26300h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo26268r0().mo26217o(this.Z$0);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.x$x */
    /* compiled from: HttpRequestSettingsFragment.kt */
    static final class C2913x extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $urlMagicTextListener;
        int label;
        final /* synthetic */ C2889x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2913x(C2889x xVar, C4023j0.C4028e eVar, C13635d<? super C2913x> dVar) {
            super(3, dVar);
            this.this$0 = xVar;
            this.$urlMagicTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2913x(this.this$0, this.$urlMagicTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15698D(this.this$0.getActivity(), this.$urlMagicTextListener, this.this$0.f7969g, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public static final void m14134A0(C2889x xVar, C4023j0.C4029f fVar) {
        C13706o.m87929f(xVar, "this$0");
        C8034z zVar = xVar.f7968f;
        C8034z zVar2 = null;
        if (zVar == null) {
            C13706o.m87945v("binding");
            zVar = null;
        }
        int b = C16792h.m99540b(zVar.f19536h.getSelectionStart(), 0);
        C8034z zVar3 = xVar.f7968f;
        if (zVar3 == null) {
            C13706o.m87945v("binding");
            zVar3 = null;
        }
        int b2 = C16792h.m99540b(zVar3.f19536h.getSelectionEnd(), 0);
        C8034z zVar4 = xVar.f7968f;
        if (zVar4 == null) {
            C13706o.m87945v("binding");
        } else {
            zVar2 = zVar4;
        }
        Editable text = zVar2.f19536h.getText();
        if (text != null) {
            int d = C16792h.m99542d(b, b2);
            int b3 = C16792h.m99540b(b, b2);
            String str = fVar.f10575a;
            text.replace(d, b3, str, 0, str.length());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public static final void m14135B0(C2889x xVar, C4023j0.C4029f fVar) {
        C13706o.m87929f(xVar, "this$0");
        C8034z zVar = xVar.f7968f;
        C8034z zVar2 = null;
        if (zVar == null) {
            C13706o.m87945v("binding");
            zVar = null;
        }
        int b = C16792h.m99540b(zVar.f19534f.getSelectionStart(), 0);
        C8034z zVar3 = xVar.f7968f;
        if (zVar3 == null) {
            C13706o.m87945v("binding");
            zVar3 = null;
        }
        int b2 = C16792h.m99540b(zVar3.f19534f.getSelectionEnd(), 0);
        C8034z zVar4 = xVar.f7968f;
        if (zVar4 == null) {
            C13706o.m87945v("binding");
        } else {
            zVar2 = zVar4;
        }
        Editable text = zVar2.f19534f.getText();
        if (text != null) {
            int d = C16792h.m99542d(b, b2);
            int b3 = C16792h.m99540b(b, b2);
            String str = fVar.f10575a;
            text.replace(d, b3, str, 0, str.length());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public static final void m14136C0(C2889x xVar, C4023j0.C4029f fVar) {
        C13706o.m87929f(xVar, "this$0");
        C8034z zVar = xVar.f7968f;
        C8034z zVar2 = null;
        if (zVar == null) {
            C13706o.m87945v("binding");
            zVar = null;
        }
        int b = C16792h.m99540b(zVar.f19548t.getSelectionStart(), 0);
        C8034z zVar3 = xVar.f7968f;
        if (zVar3 == null) {
            C13706o.m87945v("binding");
            zVar3 = null;
        }
        int b2 = C16792h.m99540b(zVar3.f19548t.getSelectionEnd(), 0);
        C8034z zVar4 = xVar.f7968f;
        if (zVar4 == null) {
            C13706o.m87945v("binding");
        } else {
            zVar2 = zVar4;
        }
        Editable text = zVar2.f19548t.getText();
        if (text != null) {
            int d = C16792h.m99542d(b, b2);
            int b3 = C16792h.m99540b(b, b2);
            String str = fVar.f10575a;
            text.replace(d, b3, str, 0, str.length());
        }
    }

    /* renamed from: o0 */
    private final void m14150o0() {
        mo26268r0().mo26212j().observe(getViewLifecycleOwner(), new C2884s(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public static final void m14151p0(C2889x xVar, C2851g gVar) {
        C13706o.m87929f(xVar, "this$0");
        xVar.m14152q0(gVar.mo26234b(), gVar.mo26233a());
    }

    /* renamed from: q0 */
    private final void m14152q0(HttpRequestConfig httpRequestConfig, HttpRequestAction httpRequestAction) {
        String str;
        C8034z zVar = this.f7968f;
        C8034z zVar2 = null;
        if (zVar == null) {
            C13706o.m87945v("binding");
            zVar = null;
        }
        zVar.f19526B.setText(String.valueOf(httpRequestConfig.getRequestTimeOutSeconds()));
        C8034z zVar3 = this.f7968f;
        if (zVar3 == null) {
            C13706o.m87945v("binding");
            zVar3 = null;
        }
        zVar3.f19538j.setChecked(httpRequestConfig.getBlockNextAction());
        C8034z zVar4 = this.f7968f;
        if (zVar4 == null) {
            C13706o.m87945v("binding");
            zVar4 = null;
        }
        zVar4.f19532d.setChecked(httpRequestConfig.getAllowAnyCertificate());
        C8034z zVar5 = this.f7968f;
        if (zVar5 == null) {
            C13706o.m87945v("binding");
            zVar5 = null;
        }
        zVar5.f19527C.setText(httpRequestConfig.getUrlToOpen());
        C8034z zVar6 = this.f7968f;
        if (zVar6 == null) {
            C13706o.m87945v("binding");
            zVar6 = null;
        }
        zVar6.f19542n.setSelection(httpRequestConfig.getRequestType());
        C8034z zVar7 = this.f7968f;
        if (zVar7 == null) {
            C13706o.m87945v("binding");
            zVar7 = null;
        }
        zVar7.f19547s.setChecked(httpRequestConfig.getSaveReturnCodeToVariable());
        C8034z zVar8 = this.f7968f;
        if (zVar8 == null) {
            C13706o.m87945v("binding");
            zVar8 = null;
        }
        zVar8.f19544p.setEnabled(httpRequestConfig.getSaveReturnCodeToVariable());
        C8034z zVar9 = this.f7968f;
        if (zVar9 == null) {
            C13706o.m87945v("binding");
            zVar9 = null;
        }
        float f = 1.0f;
        zVar9.f19544p.setAlpha(httpRequestConfig.getSaveReturnCodeToVariable() ? 1.0f : 0.4f);
        this.f7970o = httpRequestConfig.getReturnCodeVariableName();
        this.f7971p = httpRequestConfig.getReturnCodeDictionaryKeys();
        this.f7972s = httpRequestConfig.getResponseVariableName();
        this.f7973z = httpRequestConfig.getResponseDictionaryKeys();
        if (httpRequestConfig.getSaveReturnCodeToVariable()) {
            C8034z zVar10 = this.f7968f;
            if (zVar10 == null) {
                C13706o.m87945v("binding");
                zVar10 = null;
            }
            NDSpinner nDSpinner = zVar10.f19544p;
            C13706o.m87928e(nDSpinner, "binding.responseCodeVariableSpinner");
            m14153s0(nDSpinner, httpRequestAction);
        }
        C8034z zVar11 = this.f7968f;
        if (zVar11 == null) {
            C13706o.m87945v("binding");
            zVar11 = null;
        }
        LinearLayout linearLayout = zVar11.f19543o;
        C13706o.m87928e(linearLayout, "binding.responseCodeSelectionLayout");
        int i = 8;
        boolean z = false;
        linearLayout.setVisibility(httpRequestConfig.getSaveReturnCodeToVariable() ? 0 : 8);
        C8034z zVar12 = this.f7968f;
        if (zVar12 == null) {
            C13706o.m87945v("binding");
            zVar12 = null;
        }
        CheckBox checkBox = zVar12.f19547s;
        C13706o.m87928e(checkBox, "binding.saveHttpResponseCodeCheckbox");
        C16061a.m96671b(checkBox, (C13640g) null, new C2891b(this, httpRequestAction, (C13635d<? super C2891b>) null), 1, (Object) null);
        C8034z zVar13 = this.f7968f;
        if (zVar13 == null) {
            C13706o.m87945v("binding");
            zVar13 = null;
        }
        Button button = zVar13.f19530b;
        C13706o.m87928e(button, "binding.addIntegerVariableButton");
        C4666m.m18147o(button, (C13640g) null, new C2892c(this, httpRequestAction, (C13635d<? super C2892c>) null), 1, (Object) null);
        C8034z zVar14 = this.f7968f;
        if (zVar14 == null) {
            C13706o.m87945v("binding");
            zVar14 = null;
        }
        RadioButton radioButton = zVar14.f19539k;
        C13706o.m87928e(radioButton, "binding.dontSaveResponseRadioButton");
        C16061a.m96671b(radioButton, (C13640g) null, new C2893d(this, (C13635d<? super C2893d>) null), 1, (Object) null);
        C8034z zVar15 = this.f7968f;
        if (zVar15 == null) {
            C13706o.m87945v("binding");
            zVar15 = null;
        }
        RadioButton radioButton2 = zVar15.f19551w;
        C13706o.m87928e(radioButton2, "binding.saveResponseInVariableRadioButton");
        C16061a.m96671b(radioButton2, (C13640g) null, new C2894e(this, httpRequestAction, (C13635d<? super C2894e>) null), 1, (Object) null);
        C8034z zVar16 = this.f7968f;
        if (zVar16 == null) {
            C13706o.m87945v("binding");
            zVar16 = null;
        }
        RadioButton radioButton3 = zVar16.f19550v;
        C13706o.m87928e(radioButton3, "binding.saveResponseInFileRadioButton");
        C16061a.m96671b(radioButton3, (C13640g) null, new C2895f(this, (C13635d<? super C2895f>) null), 1, (Object) null);
        C8034z zVar17 = this.f7968f;
        if (zVar17 == null) {
            C13706o.m87945v("binding");
            zVar17 = null;
        }
        zVar17.f19539k.setChecked(httpRequestConfig.getSaveResponseType() == 0);
        C8034z zVar18 = this.f7968f;
        if (zVar18 == null) {
            C13706o.m87945v("binding");
            zVar18 = null;
        }
        zVar18.f19551w.setChecked(httpRequestConfig.getSaveResponseType() == 1);
        C8034z zVar19 = this.f7968f;
        if (zVar19 == null) {
            C13706o.m87945v("binding");
            zVar19 = null;
        }
        zVar19.f19550v.setChecked(httpRequestConfig.getSaveResponseType() == 2);
        C8034z zVar20 = this.f7968f;
        if (zVar20 == null) {
            C13706o.m87945v("binding");
            zVar20 = null;
        }
        LinearLayout linearLayout2 = zVar20.f19546r;
        C13706o.m87928e(linearLayout2, "binding.responseVariableLayout");
        linearLayout2.setVisibility(httpRequestConfig.getSaveResponseType() == 1 ? 0 : 8);
        C8034z zVar21 = this.f7968f;
        if (zVar21 == null) {
            C13706o.m87945v("binding");
            zVar21 = null;
        }
        LinearLayout linearLayout3 = zVar21.f19545q;
        C13706o.m87928e(linearLayout3, "binding.responseFileLayout");
        if (httpRequestConfig.getSaveResponseType() == 2) {
            i = 0;
        }
        linearLayout3.setVisibility(i);
        if (httpRequestConfig.getSaveResponseType() == 1) {
            C8034z zVar22 = this.f7968f;
            if (zVar22 == null) {
                C13706o.m87945v("binding");
                zVar22 = null;
            }
            NDSpinner nDSpinner2 = zVar22.f19541m;
            C13706o.m87928e(nDSpinner2, "binding.httpResponseVariableSpinner");
            m14154u0(nDSpinner2, httpRequestAction);
        }
        C8034z zVar23 = this.f7968f;
        if (zVar23 == null) {
            C13706o.m87945v("binding");
            zVar23 = null;
        }
        Button button2 = zVar23.f19531c;
        C13706o.m87928e(button2, "binding.addStringVariableButton");
        C4666m.m18147o(button2, (C13640g) null, new C2896g(this, httpRequestAction, (C13635d<? super C2896g>) null), 1, (Object) null);
        C8034z zVar24 = this.f7968f;
        if (zVar24 == null) {
            C13706o.m87945v("binding");
            zVar24 = null;
        }
        zVar24.f19540l.setChecked(httpRequestConfig.getFollowRedirects());
        C8034z zVar25 = this.f7968f;
        if (zVar25 == null) {
            C13706o.m87945v("binding");
            zVar25 = null;
        }
        zVar25.f19533e.setChecked(httpRequestConfig.getBasicAuthEnabled());
        C8034z zVar26 = this.f7968f;
        if (zVar26 == null) {
            C13706o.m87945v("binding");
            zVar26 = null;
        }
        zVar26.f19536h.setText(httpRequestConfig.getBasicAuthUsername());
        C8034z zVar27 = this.f7968f;
        if (zVar27 == null) {
            C13706o.m87945v("binding");
            zVar27 = null;
        }
        zVar27.f19536h.setEnabled(httpRequestConfig.getBasicAuthEnabled());
        C8034z zVar28 = this.f7968f;
        if (zVar28 == null) {
            C13706o.m87945v("binding");
            zVar28 = null;
        }
        zVar28.f19537i.setEnabled(httpRequestConfig.getBasicAuthEnabled());
        C8034z zVar29 = this.f7968f;
        if (zVar29 == null) {
            C13706o.m87945v("binding");
            zVar29 = null;
        }
        zVar29.f19537i.setAlpha(httpRequestConfig.getBasicAuthEnabled() ? 1.0f : 0.4f);
        C8034z zVar30 = this.f7968f;
        if (zVar30 == null) {
            C13706o.m87945v("binding");
            zVar30 = null;
        }
        zVar30.f19534f.setText(httpRequestConfig.getBasicAuthPassword());
        C8034z zVar31 = this.f7968f;
        if (zVar31 == null) {
            C13706o.m87945v("binding");
            zVar31 = null;
        }
        zVar31.f19534f.setEnabled(httpRequestConfig.getBasicAuthEnabled());
        C8034z zVar32 = this.f7968f;
        if (zVar32 == null) {
            C13706o.m87945v("binding");
            zVar32 = null;
        }
        zVar32.f19535g.setEnabled(httpRequestConfig.getBasicAuthEnabled());
        C8034z zVar33 = this.f7968f;
        if (zVar33 == null) {
            C13706o.m87945v("binding");
            zVar33 = null;
        }
        Button button3 = zVar33.f19535g;
        if (!httpRequestConfig.getBasicAuthEnabled()) {
            f = 0.4f;
        }
        button3.setAlpha(f);
        C8034z zVar34 = this.f7968f;
        if (zVar34 == null) {
            C13706o.m87945v("binding");
            zVar34 = null;
        }
        TextView textView = zVar34.f19552x;
        String saveResponseFolderPathDisplayName = httpRequestConfig.getSaveResponseFolderPathDisplayName();
        if (saveResponseFolderPathDisplayName == null || saveResponseFolderPathDisplayName.length() == 0) {
            z = true;
        }
        if (z) {
            str = '[' + getString(C17541R$string.action_write_to_file_select_folder) + ']';
        } else {
            str = httpRequestConfig.getSaveResponseFolderPathDisplayName();
        }
        textView.setText(str);
        C8034z zVar35 = this.f7968f;
        if (zVar35 == null) {
            C13706o.m87945v("binding");
        } else {
            zVar2 = zVar35;
        }
        zVar2.f19548t.setText(httpRequestConfig.getSaveResponseFileName());
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public final void m14153s0(Spinner spinner, HttpRequestAction httpRequestAction) {
        String str;
        FragmentActivity requireActivity = requireActivity();
        C13706o.m87928e(requireActivity, "requireActivity()");
        Macro macro = this.f7969g;
        ArrayList arrayList = new ArrayList();
        if (this.f7970o != null) {
            str = this.f7970o + C6520o0.m24912e0(this.f7971p);
        } else {
            str = null;
        }
        C6520o0.m24879I(requireActivity, C17542R$style.Theme_App_Dialog_Action, httpRequestAction, spinner, macro, arrayList, str, "", true, new C2897h(this, spinner));
        if (spinner.getCount() == 0) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(getString(C17541R$string.trigger_variable_no_variables));
            ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), 17367048, arrayList2);
            arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
            spinner.setAdapter(arrayAdapter);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public final void m14154u0(Spinner spinner, HttpRequestAction httpRequestAction) {
        String str;
        FragmentActivity requireActivity = requireActivity();
        C13706o.m87928e(requireActivity, "requireActivity()");
        Macro macro = this.f7969g;
        ArrayList arrayList = new ArrayList();
        if (this.f7972s != null) {
            str = this.f7972s + C6520o0.m24912e0(this.f7973z);
        } else {
            str = null;
        }
        C6520o0.m24881J(requireActivity, C17542R$style.Theme_App_Dialog_Action, httpRequestAction, spinner, macro, arrayList, str, true, new C2898i(this, spinner));
        if (spinner.getCount() == 0) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(getString(C17541R$string.trigger_variable_no_variables));
            ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), 17367048, arrayList2);
            arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
            spinner.setAdapter(arrayAdapter);
        }
    }

    /* renamed from: v0 */
    private final void m14155v0() {
        C8034z zVar = this.f7968f;
        if (zVar == null) {
            C13706o.m87945v("binding");
            zVar = null;
        }
        zVar.f19542n.setOnItemSelectedListener(new C2908s(this));
        C8034z zVar2 = this.f7968f;
        if (zVar2 == null) {
            C13706o.m87945v("binding");
            zVar2 = null;
        }
        CheckBox checkBox = zVar2.f19538j;
        C13706o.m87928e(checkBox, "binding.blockNextActionCheckBox");
        C16061a.m96671b(checkBox, (C13640g) null, new C2909t(this, (C13635d<? super C2909t>) null), 1, (Object) null);
        C8034z zVar3 = this.f7968f;
        if (zVar3 == null) {
            C13706o.m87945v("binding");
            zVar3 = null;
        }
        CheckBox checkBox2 = zVar3.f19532d;
        C13706o.m87928e(checkBox2, "binding.allowAnyCertificateCheckBox");
        C16061a.m96671b(checkBox2, (C13640g) null, new C2910u(this, (C13635d<? super C2910u>) null), 1, (Object) null);
        C8034z zVar4 = this.f7968f;
        if (zVar4 == null) {
            C13706o.m87945v("binding");
            zVar4 = null;
        }
        CheckBox checkBox3 = zVar4.f19540l;
        C13706o.m87928e(checkBox3, "binding.followRedirectsCheckbox");
        C16061a.m96671b(checkBox3, (C13640g) null, new C2911v(this, (C13635d<? super C2911v>) null), 1, (Object) null);
        C8034z zVar5 = this.f7968f;
        if (zVar5 == null) {
            C13706o.m87945v("binding");
            zVar5 = null;
        }
        TextInputEditText textInputEditText = zVar5.f19527C;
        C13706o.m87928e(textInputEditText, "binding.url");
        textInputEditText.addTextChangedListener(new C2899j(this));
        C8034z zVar6 = this.f7968f;
        if (zVar6 == null) {
            C13706o.m87945v("binding");
            zVar6 = null;
        }
        CheckBox checkBox4 = zVar6.f19533e;
        C13706o.m87928e(checkBox4, "binding.basicAuthCheckbox");
        C16061a.m96671b(checkBox4, (C13640g) null, new C2912w(this, (C13635d<? super C2912w>) null), 1, (Object) null);
        C8034z zVar7 = this.f7968f;
        if (zVar7 == null) {
            C13706o.m87945v("binding");
            zVar7 = null;
        }
        EditText editText = zVar7.f19536h;
        C13706o.m87928e(editText, "binding.basicAuthUsername");
        editText.addTextChangedListener(new C2900k(this));
        C8034z zVar8 = this.f7968f;
        if (zVar8 == null) {
            C13706o.m87945v("binding");
            zVar8 = null;
        }
        EditText editText2 = zVar8.f19534f;
        C13706o.m87928e(editText2, "binding.basicAuthPassword");
        editText2.addTextChangedListener(new C2901l(this));
        C2885t tVar = new C2885t(this);
        C8034z zVar9 = this.f7968f;
        if (zVar9 == null) {
            C13706o.m87945v("binding");
            zVar9 = null;
        }
        Button button = zVar9.f19528D;
        C13706o.m87928e(button, "binding.urlMagicTextButton");
        C4666m.m18147o(button, (C13640g) null, new C2913x(this, tVar, (C13635d<? super C2913x>) null), 1, (Object) null);
        C2888w wVar = new C2888w(this);
        C8034z zVar10 = this.f7968f;
        if (zVar10 == null) {
            C13706o.m87945v("binding");
            zVar10 = null;
        }
        Button button2 = zVar10.f19537i;
        C13706o.m87928e(button2, "binding.basicAuthUsernameMagicTextButton");
        C4666m.m18147o(button2, (C13640g) null, new C2904o(this, wVar, (C13635d<? super C2904o>) null), 1, (Object) null);
        C2886u uVar = new C2886u(this);
        C8034z zVar11 = this.f7968f;
        if (zVar11 == null) {
            C13706o.m87945v("binding");
            zVar11 = null;
        }
        Button button3 = zVar11.f19535g;
        C13706o.m87928e(button3, "binding.basicAuthPasswordMagicTextButton");
        C4666m.m18147o(button3, (C13640g) null, new C2905p(this, uVar, (C13635d<? super C2905p>) null), 1, (Object) null);
        C8034z zVar12 = this.f7968f;
        if (zVar12 == null) {
            C13706o.m87945v("binding");
            zVar12 = null;
        }
        EditText editText3 = zVar12.f19548t;
        C13706o.m87928e(editText3, "binding.saveResponseFilename");
        editText3.addTextChangedListener(new C2902m(this));
        C8034z zVar13 = this.f7968f;
        if (zVar13 == null) {
            C13706o.m87945v("binding");
            zVar13 = null;
        }
        EditText editText4 = zVar13.f19526B;
        C13706o.m87928e(editText4, "binding.timeoutSecondsText");
        editText4.addTextChangedListener(new C2903n(this));
        C2887v vVar = new C2887v(this);
        C8034z zVar14 = this.f7968f;
        if (zVar14 == null) {
            C13706o.m87945v("binding");
            zVar14 = null;
        }
        Button button4 = zVar14.f19549u;
        C13706o.m87928e(button4, "binding.saveResponseFilenameMagicTextButton");
        C4666m.m18147o(button4, (C13640g) null, new C2906q(this, vVar, (C13635d<? super C2906q>) null), 1, (Object) null);
        C8034z zVar15 = this.f7968f;
        if (zVar15 == null) {
            C13706o.m87945v("binding");
            zVar15 = null;
        }
        ImageButton imageButton = zVar15.f19525A;
        C13706o.m87928e(imageButton, "binding.selectFolderButton");
        C4666m.m18147o(imageButton, (C13640g) null, new C2907r(this, (C13635d<? super C2907r>) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m14156y0(C2889x xVar, C4023j0.C4029f fVar) {
        C13706o.m87929f(xVar, "this$0");
        C8034z zVar = xVar.f7968f;
        C8034z zVar2 = null;
        if (zVar == null) {
            C13706o.m87945v("binding");
            zVar = null;
        }
        int b = C16792h.m99540b(zVar.f19527C.getSelectionStart(), 0);
        C8034z zVar3 = xVar.f7968f;
        if (zVar3 == null) {
            C13706o.m87945v("binding");
            zVar3 = null;
        }
        int b2 = C16792h.m99540b(zVar3.f19527C.getSelectionEnd(), 0);
        C8034z zVar4 = xVar.f7968f;
        if (zVar4 == null) {
            C13706o.m87945v("binding");
        } else {
            zVar2 = zVar4;
        }
        Editable text = zVar2.f19527C.getText();
        if (text != null) {
            int d = C16792h.m99542d(b, b2);
            int b3 = C16792h.m99540b(b, b2);
            String str = fVar.f10575a;
            text.replace(d, b3, str, 0, str.length());
        }
    }

    /* renamed from: U */
    public void mo26239U() {
        this.f7966A.clear();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && i2 == -1) {
            C13706o.m87926c(intent);
            Uri data = intent.getData();
            C13706o.m87926c(data);
            requireContext().getContentResolver().takePersistableUriPermission(data, 3);
            DocumentFile fromTreeUri = DocumentFile.fromTreeUri(requireContext(), data);
            DocumentFile G = C4061t1.m15956G(fromTreeUri);
            StringBuilder sb = new StringBuilder();
            sb.append(G != null ? G.getName() : "");
            sb.append('/');
            C13706o.m87926c(fromTreeUri);
            sb.append(fromTreeUri.getName());
            String sb2 = sb.toString();
            C8034z zVar = this.f7968f;
            if (zVar == null) {
                C13706o.m87945v("binding");
                zVar = null;
            }
            zVar.f19552x.setText(sb2);
            HttpRequestConfigViewModel r0 = mo26268r0();
            String uri = data.toString();
            C13706o.m87928e(uri, "uri.toString()");
            r0.mo26201A(uri, sb2);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        C8034z c = C8034z.m33439c(layoutInflater, viewGroup, false);
        C13706o.m87928e(c, "inflate(inflater, container, false)");
        this.f7968f = c;
        Bundle arguments = getArguments();
        this.f7969g = C4934n.m18998M().mo29682Q(arguments != null ? arguments.getLong("MacroGuid") : 0);
        m14155v0();
        m14150o0();
        C8034z zVar = this.f7968f;
        if (zVar == null) {
            C13706o.m87945v("binding");
            zVar = null;
        }
        return zVar.getRoot();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo26239U();
    }

    /* renamed from: r0 */
    public final HttpRequestConfigViewModel mo26268r0() {
        HttpRequestConfigViewModel httpRequestConfigViewModel = this.f7967d;
        if (httpRequestConfigViewModel != null) {
            return httpRequestConfigViewModel;
        }
        C13706o.m87945v("viewModel");
        return null;
    }
}
