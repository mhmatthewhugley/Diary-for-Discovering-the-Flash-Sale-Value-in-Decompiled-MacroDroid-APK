package com.arlosoft.macrodroid.action.activities.httprequest;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.HttpParam;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15478k0;
import p135n1.C7967d;
import p139o1.C8033y;
import p154r0.C8184d;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.q */
/* compiled from: HttpRequestParamsFragment.kt */
public final class C2868q extends C8184d implements C2847c0 {

    /* renamed from: s */
    public static final C2869a f7946s = new C2869a((C13695i) null);

    /* renamed from: d */
    public HttpRequestConfigViewModel f7947d;

    /* renamed from: f */
    private C8033y f7948f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2873c f7949g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Macro f7950o;

    /* renamed from: p */
    public Map<Integer, View> f7951p = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.q$a */
    /* compiled from: HttpRequestParamsFragment.kt */
    public static final class C2869a {
        private C2869a() {
        }

        public /* synthetic */ C2869a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C2868q mo26255a(C2873c cVar, long j) {
            C13706o.m87929f(cVar, "paramType");
            C2868q qVar = new C2868q();
            Bundle bundle = new Bundle();
            bundle.putSerializable("param_Type", cVar);
            bundle.putLong("MacroGuid", j);
            qVar.setArguments(bundle);
            return qVar;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.q$b */
    /* compiled from: HttpRequestParamsFragment.kt */
    public final class C2870b extends RecyclerView.Adapter<C2871a> {

        /* renamed from: a */
        private final List<HttpParam> f7952a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C2847c0 f7953b;

        /* renamed from: c */
        final /* synthetic */ C2868q f7954c;

        /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.q$b$a */
        /* compiled from: HttpRequestParamsFragment.kt */
        public final class C2871a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            final /* synthetic */ C2870b f7955a;

            /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.q$b$a$a */
            /* compiled from: HttpRequestParamsFragment.kt */
            static final class C2872a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
                final /* synthetic */ HttpParam $param;
                int label;
                final /* synthetic */ C2870b this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2872a(C2870b bVar, HttpParam httpParam, C13635d<? super C2872a> dVar) {
                    super(3, dVar);
                    this.this$0 = bVar;
                    this.$param = httpParam;
                }

                /* renamed from: h */
                public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                    return new C2872a(this.this$0, this.$param, dVar).invokeSuspend(C13339u.f61331a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object unused = C13652d.m87832c();
                    if (this.label == 0) {
                        C13332o.m85685b(obj);
                        this.this$0.f7953b.mo26232v(this.$param);
                        return C13339u.f61331a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2871a(C2870b bVar, View view) {
                super(view);
                C13706o.m87929f(view, "itemView");
                this.f7955a = bVar;
            }

            /* renamed from: t */
            public final void mo26258t(HttpParam httpParam) {
                C13706o.m87929f(httpParam, "param");
                ((TextView) this.itemView.findViewById(C17532R$id.paramName)).setText(httpParam.getParamName());
                ((TextView) this.itemView.findViewById(C17532R$id.paramValue)).setText(httpParam.getParamValue());
                LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(C17532R$id.container);
                C13706o.m87928e(linearLayout, "itemView.container");
                C4666m.m18147o(linearLayout, (C13640g) null, new C2872a(this.f7955a, httpParam, (C13635d<? super C2872a>) null), 1, (Object) null);
            }
        }

        public C2870b(C2868q qVar, List<HttpParam> list, C2847c0 c0Var) {
            C13706o.m87929f(list, "params");
            C13706o.m87929f(c0Var, "paramSelectedListener");
            this.f7954c = qVar;
            this.f7952a = list;
            this.f7953b = c0Var;
        }

        /* renamed from: C */
        public void onBindViewHolder(C2871a aVar, int i) {
            C13706o.m87929f(aVar, "holder");
            aVar.mo26258t(this.f7952a.get(i));
        }

        /* renamed from: D */
        public C2871a onCreateViewHolder(ViewGroup viewGroup, int i) {
            C13706o.m87929f(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.list_item_http_request_param, viewGroup, false);
            C13706o.m87928e(inflate, "from(parent.context).inf…est_param, parent, false)");
            return new C2871a(this, inflate);
        }

        public int getItemCount() {
            return this.f7952a.size();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.q$c */
    /* compiled from: HttpRequestParamsFragment.kt */
    public enum C2873c {
        HEADER_PARAMS,
        QUERY_PARAMS
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.q$d */
    /* compiled from: HttpRequestParamsFragment.kt */
    public /* synthetic */ class C2874d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7959a;

        static {
            int[] iArr = new int[C2873c.values().length];
            iArr[C2873c.HEADER_PARAMS.ordinal()] = 1;
            iArr[C2873c.QUERY_PARAMS.ordinal()] = 2;
            f7959a = iArr;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.q$e */
    /* compiled from: HttpRequestParamsFragment.kt */
    static final class C2875e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C2868q this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2875e(C2868q qVar, C13635d<? super C2875e> dVar) {
            super(3, dVar);
            this.this$0 = qVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2875e(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m14107q0();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.q$f */
    /* compiled from: HttpRequestParamsFragment.kt */
    static final class C2876f extends C13708q implements C16265l<HttpParam, C13339u> {
        final /* synthetic */ HttpParam $param;
        final /* synthetic */ C2868q this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2876f(C2868q qVar, HttpParam httpParam) {
            super(1);
            this.this$0 = qVar;
            this.$param = httpParam;
        }

        /* renamed from: a */
        public final void mo26261a(HttpParam httpParam) {
            C13706o.m87929f(httpParam, "newPair");
            HttpRequestConfigViewModel o0 = this.this$0.mo26254o0();
            C2873c f0 = this.this$0.f7949g;
            if (f0 == null) {
                C13706o.m87945v("paramType");
                f0 = null;
            }
            o0.mo26207G(f0, this.$param, httpParam);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo26261a((HttpParam) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.q$g */
    /* compiled from: HttpRequestParamsFragment.kt */
    static final class C2877g extends C13708q implements C16265l<HttpParam, C13339u> {
        final /* synthetic */ C2868q this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2877g(C2868q qVar) {
            super(1);
            this.this$0 = qVar;
        }

        /* renamed from: a */
        public final void mo26262a(HttpParam httpParam) {
            C13706o.m87929f(httpParam, "param");
            HttpRequestConfigViewModel o0 = this.this$0.mo26254o0();
            C2873c f0 = this.this$0.f7949g;
            if (f0 == null) {
                C13706o.m87945v("paramType");
                f0 = null;
            }
            o0.mo26208f(f0, httpParam);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo26262a((HttpParam) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.q$h */
    /* compiled from: HttpRequestParamsFragment.kt */
    static final class C2878h extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $nameMagicTextListener;
        int label;
        final /* synthetic */ C2868q this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2878h(C2868q qVar, C4023j0.C4028e eVar, C13635d<? super C2878h> dVar) {
            super(3, dVar);
            this.this$0 = qVar;
            this.$nameMagicTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2878h(this.this$0, this.$nameMagicTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15698D(this.this$0.getActivity(), this.$nameMagicTextListener, this.this$0.f7950o, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.q$i */
    /* compiled from: HttpRequestParamsFragment.kt */
    static final class C2879i extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $valueMagicTextListener;
        int label;
        final /* synthetic */ C2868q this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2879i(C2868q qVar, C4023j0.C4028e eVar, C13635d<? super C2879i> dVar) {
            super(3, dVar);
            this.this$0 = qVar;
            this.$valueMagicTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2879i(this.this$0, this.$valueMagicTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15698D(this.this$0.getActivity(), this.$valueMagicTextListener, this.this$0.f7950o, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.q$j */
    /* compiled from: HttpRequestParamsFragment.kt */
    static final class C2880j extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ HttpParam $param;
        int label;
        final /* synthetic */ C2868q this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2880j(C2868q qVar, HttpParam httpParam, AppCompatDialog appCompatDialog, C13635d<? super C2880j> dVar) {
            super(3, dVar);
            this.this$0 = qVar;
            this.$param = httpParam;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2880j(this.this$0, this.$param, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C2868q qVar = this.this$0;
                FragmentActivity requireActivity = qVar.requireActivity();
                C13706o.m87928e(requireActivity, "requireActivity()");
                C2873c f0 = this.this$0.f7949g;
                if (f0 == null) {
                    C13706o.m87945v("paramType");
                    f0 = null;
                }
                qVar.m14104m0(requireActivity, f0, this.$param, this.$dialog);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.q$k */
    /* compiled from: HttpRequestParamsFragment.kt */
    static final class C2881k extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ C16265l<HttpParam, C13339u> $handleOk;
        final /* synthetic */ EditText $paramName;
        final /* synthetic */ EditText $paramValue;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2881k(EditText editText, EditText editText2, C16265l<? super HttpParam, C13339u> lVar, AppCompatDialog appCompatDialog, C13635d<? super C2881k> dVar) {
            super(3, dVar);
            this.$paramName = editText;
            this.$paramValue = editText2;
            this.$handleOk = lVar;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2881k(this.$paramName, this.$paramValue, this.$handleOk, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                Editable text = this.$paramName.getText();
                C13706o.m87928e(text, "paramName.text");
                boolean z = true;
                if (text.length() > 0) {
                    Editable text2 = this.$paramValue.getText();
                    C13706o.m87928e(text2, "paramValue.text");
                    if (text2.length() <= 0) {
                        z = false;
                    }
                    if (z) {
                        this.$handleOk.invoke(new HttpParam(this.$paramName.getText().toString(), this.$paramValue.getText().toString()));
                        this.$dialog.dismiss();
                    }
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.q$l */
    /* compiled from: HttpRequestParamsFragment.kt */
    static final class C2882l extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2882l(AppCompatDialog appCompatDialog, C13635d<? super C2882l> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2882l(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: h0 */
    private final void m14101h0(C2873c cVar) {
        mo26254o0().mo26212j().observe(getViewLifecycleOwner(), new C2865n(cVar, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m14102i0(C2873c cVar, C2868q qVar, C2851g gVar) {
        C13706o.m87929f(cVar, "$paramType");
        C13706o.m87929f(qVar, "this$0");
        int i = C2874d.f7959a[cVar.ordinal()];
        if (i == 1) {
            qVar.m14106p0(gVar.mo26234b().getHeaderParams(), cVar);
        } else if (i == 2) {
            qVar.m14106p0(gVar.mo26234b().getQueryParams(), cVar);
        }
    }

    /* renamed from: j0 */
    private final void m14103j0() {
        C8033y yVar = this.f7948f;
        if (yVar == null) {
            C13706o.m87945v("binding");
            yVar = null;
        }
        FloatingActionButton floatingActionButton = yVar.f19521b;
        C13706o.m87928e(floatingActionButton, "binding.addParamButton");
        C4666m.m18147o(floatingActionButton, (C13640g) null, new C2875e(this, (C13635d<? super C2875e>) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public final void m14104m0(Activity activity, C2873c cVar, HttpParam httpParam, Dialog dialog) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C17542R$style.Theme_App_Dialog_Action);
        builder.setTitle((int) C17541R$string.delete);
        builder.setMessage((CharSequence) activity.getString(C17541R$string.http_request_confirm_delete_parameter));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C2864m(this, cVar, httpParam, dialog));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public static final void m14105n0(C2868q qVar, C2873c cVar, HttpParam httpParam, Dialog dialog, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(qVar, "this$0");
        C13706o.m87929f(cVar, "$paramType");
        C13706o.m87929f(httpParam, "$param");
        C13706o.m87929f(dialog, "$dialogToClose");
        qVar.mo26254o0().mo26209g(cVar, httpParam);
        dialog.dismiss();
    }

    /* renamed from: p0 */
    private final void m14106p0(List<HttpParam> list, C2873c cVar) {
        C8033y yVar = null;
        if (list.isEmpty()) {
            C8033y yVar2 = this.f7948f;
            if (yVar2 == null) {
                C13706o.m87945v("binding");
                yVar2 = null;
            }
            TextView textView = yVar2.f19523d;
            C13706o.m87928e(textView, "binding.emptyView");
            textView.setVisibility(0);
            C8033y yVar3 = this.f7948f;
            if (yVar3 == null) {
                C13706o.m87945v("binding");
            } else {
                yVar = yVar3;
            }
            RecyclerView recyclerView = yVar.f19524e;
            C13706o.m87928e(recyclerView, "binding.paramsRecyclerView");
            recyclerView.setVisibility(8);
            return;
        }
        C8033y yVar4 = this.f7948f;
        if (yVar4 == null) {
            C13706o.m87945v("binding");
            yVar4 = null;
        }
        TextView textView2 = yVar4.f19523d;
        C13706o.m87928e(textView2, "binding.emptyView");
        textView2.setVisibility(8);
        C8033y yVar5 = this.f7948f;
        if (yVar5 == null) {
            C13706o.m87945v("binding");
            yVar5 = null;
        }
        RecyclerView recyclerView2 = yVar5.f19524e;
        C13706o.m87928e(recyclerView2, "binding.paramsRecyclerView");
        recyclerView2.setVisibility(0);
        C2870b bVar = new C2870b(this, list, this);
        C8033y yVar6 = this.f7948f;
        if (yVar6 == null) {
            C13706o.m87945v("binding");
        } else {
            yVar = yVar6;
        }
        yVar.f19524e.setAdapter(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public final void m14107q0() {
        String string = getString(C17541R$string.http_request_add_parameter);
        C13706o.m87928e(string, "getString(R.string.http_request_add_parameter)");
        m14108r0((HttpParam) null, string, new C2877g(this));
    }

    /* renamed from: r0 */
    private final void m14108r0(HttpParam httpParam, String str, C16265l<? super HttpParam, C13339u> lVar) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(requireActivity(), C17542R$style.Theme_App_Dialog_Action_NoTitle);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_http_request_params);
        int i = 0;
        C4656c.m18114c(appCompatDialog, 0);
        View findViewById = appCompatDialog.findViewById(2131364038);
        C13706o.m87926c(findViewById);
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.paramName);
        C13706o.m87926c(findViewById2);
        EditText editText = (EditText) findViewById2;
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.paramValue);
        C13706o.m87926c(findViewById3);
        EditText editText2 = (EditText) findViewById3;
        View findViewById4 = appCompatDialog.findViewById(C17532R$id.okButton);
        C13706o.m87926c(findViewById4);
        Button button = (Button) findViewById4;
        View findViewById5 = appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87926c(findViewById5);
        Button button2 = (Button) findViewById5;
        View findViewById6 = appCompatDialog.findViewById(C17532R$id.paramNameMagicTextButton);
        C13706o.m87926c(findViewById6);
        View findViewById7 = appCompatDialog.findViewById(C17532R$id.paramValueMagicTextButton);
        C13706o.m87926c(findViewById7);
        View findViewById8 = appCompatDialog.findViewById(C17532R$id.deleteButton);
        C13706o.m87926c(findViewById8);
        ImageButton imageButton = (ImageButton) findViewById8;
        ((TextView) findViewById).setText(str);
        C4666m.m18147o((Button) findViewById6, (C13640g) null, new C2878h(this, new C2867p(editText), (C13635d<? super C2878h>) null), 1, (Object) null);
        C4666m.m18147o((Button) findViewById7, (C13640g) null, new C2879i(this, new C2866o(editText2), (C13635d<? super C2879i>) null), 1, (Object) null);
        if (httpParam == null) {
            i = 4;
        }
        imageButton.setVisibility(i);
        if (httpParam != null) {
            editText.setText(httpParam.getParamName());
            editText2.setText(httpParam.getParamValue());
            C4666m.m18147o(imageButton, (C13640g) null, new C2880j(this, httpParam, appCompatDialog, (C13635d<? super C2880j>) null), 1, (Object) null);
        }
        C4666m.m18154v(editText);
        C4666m.m18154v(editText2);
        C4666m.m18147o(button, (C13640g) null, new C2881k(editText, editText2, lVar, appCompatDialog, (C13635d<? super C2881k>) null), 1, (Object) null);
        C4666m.m18147o(button2, (C13640g) null, new C2882l(appCompatDialog, (C13635d<? super C2882l>) null), 1, (Object) null);
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m14109s0(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$paramName");
        int b = C16792h.m99540b(editText.getSelectionStart(), 0);
        int b2 = C16792h.m99540b(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        if (text != null) {
            int min = Math.min(b, b2);
            int max = Math.max(b, b2);
            String str = fVar.f10575a;
            text.replace(min, max, str, 0, str.length());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public static final void m14110u0(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$paramValue");
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        if (text != null) {
            int min = Math.min(max, max2);
            int max3 = Math.max(max, max2);
            String str = fVar.f10575a;
            text.replace(min, max3, str, 0, str.length());
        }
    }

    /* renamed from: U */
    public void mo26239U() {
        this.f7951p.clear();
    }

    /* renamed from: o0 */
    public final HttpRequestConfigViewModel mo26254o0() {
        HttpRequestConfigViewModel httpRequestConfigViewModel = this.f7947d;
        if (httpRequestConfigViewModel != null) {
            return httpRequestConfigViewModel;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object obj;
        C13706o.m87929f(layoutInflater, "inflater");
        C8033y c = C8033y.m33436c(layoutInflater, viewGroup, false);
        C13706o.m87928e(c, "inflate(inflater, container, false)");
        this.f7948f = c;
        Bundle arguments = getArguments();
        if (arguments == null || (obj = arguments.getSerializable("param_Type")) == null) {
            obj = C2873c.HEADER_PARAMS;
        }
        C13706o.m87927d(obj, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.activities.httprequest.HttpRequestParamsFragment.ParamType");
        this.f7949g = (C2873c) obj;
        Bundle arguments2 = getArguments();
        this.f7950o = C4934n.m18998M().mo29682Q(arguments2 != null ? arguments2.getLong("MacroGuid") : 0);
        C2873c cVar = this.f7949g;
        C8033y yVar = null;
        if (cVar == null) {
            C13706o.m87945v("paramType");
            cVar = null;
        }
        m14101h0(cVar);
        m14103j0();
        C8033y yVar2 = this.f7948f;
        if (yVar2 == null) {
            C13706o.m87945v("binding");
        } else {
            yVar = yVar2;
        }
        return yVar.getRoot();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo26239U();
    }

    /* renamed from: v */
    public void mo26232v(HttpParam httpParam) {
        C13706o.m87929f(httpParam, "param");
        String string = getString(C17541R$string.http_request_edit_parameter);
        C13706o.m87928e(string, "getString(R.string.http_request_edit_parameter)");
        m14108r0(httpParam, string, new C2876f(this, httpParam));
    }
}
