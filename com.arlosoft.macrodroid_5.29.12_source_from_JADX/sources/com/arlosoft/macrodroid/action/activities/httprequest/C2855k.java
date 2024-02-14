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
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.documentfile.provider.DocumentFile;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.HttpRequestConfig;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import org.jetbrains.anko.sdk27.coroutines.C16061a;
import p135n1.C7967d;
import p139o1.C8032x;
import p154r0.C8184d;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16270q;
import p370qa.C16271r;

/* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.k */
/* compiled from: HttpRequestContentBodyFragment.kt */
public final class C2855k extends C8184d {

    /* renamed from: p */
    public static final C2856a f7929p = new C2856a((C13695i) null);

    /* renamed from: d */
    public HttpRequestConfigViewModel f7930d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C8032x f7931f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Macro f7932g;

    /* renamed from: o */
    public Map<Integer, View> f7933o = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.k$a */
    /* compiled from: HttpRequestContentBodyFragment.kt */
    public static final class C2856a {
        private C2856a() {
        }

        public /* synthetic */ C2856a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C2855k mo26241a(long j) {
            C2855k kVar = new C2855k();
            Bundle bundle = new Bundle();
            bundle.putLong("MacroGuid", j);
            kVar.setArguments(bundle);
            return kVar;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.k$b */
    /* compiled from: TextView.kt */
    public static final class C2857b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C2855k f7934a;

        public C2857b(C2855k kVar) {
            this.f7934a = kVar;
        }

        public void afterTextChanged(Editable editable) {
            HttpRequestConfigViewModel g0 = this.f7934a.mo26240g0();
            C8032x X = this.f7934a.f7931f;
            if (X == null) {
                C13706o.m87945v("binding");
                X = null;
            }
            g0.mo26224u(X.f19514g.getText().toString());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.k$c */
    /* compiled from: TextView.kt */
    public static final class C2858c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C2855k f7935a;

        public C2858c(C2855k kVar) {
            this.f7935a = kVar;
        }

        public void afterTextChanged(Editable editable) {
            HttpRequestConfigViewModel g0 = this.f7935a.mo26240g0();
            C8032x X = this.f7935a.f7931f;
            if (X == null) {
                C13706o.m87945v("binding");
                X = null;
            }
            g0.mo26223t(String.valueOf(X.f19513f.getText()));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.k$d */
    /* compiled from: HttpRequestContentBodyFragment.kt */
    public static final class C2859d implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ C2855k f7936a;

        /* renamed from: c */
        final /* synthetic */ String[] f7937c;

        C2859d(C2855k kVar, String[] strArr) {
            this.f7936a = kVar;
            this.f7937c = strArr;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C13706o.m87929f(adapterView, "parent");
            C8032x xVar = null;
            if (i == 0) {
                C8032x X = this.f7936a.f7931f;
                if (X == null) {
                    C13706o.m87945v("binding");
                } else {
                    xVar = X;
                }
                EditText editText = xVar.f19514g;
                C13706o.m87928e(editText, "binding.contentTypeCustom");
                editText.setVisibility(8);
                this.f7936a.mo26240g0().mo26224u("");
            } else if (i == this.f7937c.length - 1) {
                C8032x X2 = this.f7936a.f7931f;
                if (X2 == null) {
                    C13706o.m87945v("binding");
                    X2 = null;
                }
                EditText editText2 = X2.f19514g;
                C13706o.m87928e(editText2, "binding.contentTypeCustom");
                editText2.setVisibility(0);
                HttpRequestConfigViewModel g0 = this.f7936a.mo26240g0();
                C8032x X3 = this.f7936a.f7931f;
                if (X3 == null) {
                    C13706o.m87945v("binding");
                } else {
                    xVar = X3;
                }
                g0.mo26224u(xVar.f19514g.getText().toString());
            } else {
                C8032x X4 = this.f7936a.f7931f;
                if (X4 == null) {
                    C13706o.m87945v("binding");
                    X4 = null;
                }
                EditText editText3 = X4.f19514g;
                C13706o.m87928e(editText3, "binding.contentTypeCustom");
                editText3.setVisibility(8);
                HttpRequestConfigViewModel g02 = this.f7936a.mo26240g0();
                C8032x X5 = this.f7936a.f7931f;
                if (X5 == null) {
                    C13706o.m87945v("binding");
                } else {
                    xVar = X5;
                }
                g02.mo26224u(xVar.f19515h.getSelectedItem().toString());
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            C13706o.m87929f(adapterView, "parent");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.k$e */
    /* compiled from: HttpRequestContentBodyFragment.kt */
    static final class C2860e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $bodyMagicTextListener;
        int label;
        final /* synthetic */ C2855k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2860e(C2855k kVar, C4023j0.C4028e eVar, C13635d<? super C2860e> dVar) {
            super(3, dVar);
            this.this$0 = kVar;
            this.$bodyMagicTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2860e(this.this$0, this.$bodyMagicTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15698D(this.this$0.getActivity(), this.$bodyMagicTextListener, this.this$0.f7932g, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.k$f */
    /* compiled from: HttpRequestContentBodyFragment.kt */
    static final class C2861f extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ C2855k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2861f(C2855k kVar, C13635d<? super C2861f> dVar) {
            super(4, dVar);
            this.this$0 = kVar;
        }

        /* renamed from: h */
        public final Object mo26251h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C2861f fVar = new C2861f(this.this$0, dVar);
            fVar.Z$0 = z;
            return fVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo26251h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                boolean z = this.Z$0;
                C8032x X = this.this$0.f7931f;
                C8032x xVar = null;
                if (X == null) {
                    C13706o.m87945v("binding");
                    X = null;
                }
                LinearLayout linearLayout = X.f19512e;
                C13706o.m87928e(linearLayout, "binding.bodyTextLayout");
                int i = 0;
                linearLayout.setVisibility(z ? 0 : 8);
                C8032x X2 = this.this$0.f7931f;
                if (X2 == null) {
                    C13706o.m87945v("binding");
                } else {
                    xVar = X2;
                }
                LinearLayout linearLayout2 = xVar.f19509b;
                C13706o.m87928e(linearLayout2, "binding.bodyFileLayout");
                if (!(!z)) {
                    i = 8;
                }
                linearLayout2.setVisibility(i);
                this.this$0.mo26240g0().mo26222s(z ^ true ? 1 : 0);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.k$g */
    /* compiled from: HttpRequestContentBodyFragment.kt */
    static final class C2862g extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C2855k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2862g(C2855k kVar, C13635d<? super C2862g> dVar) {
            super(3, dVar);
            this.this$0 = kVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2862g(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                try {
                    Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                    intent.setType("*/*");
                    this.this$0.startActivityForResult(intent, 0);
                } catch (Exception unused2) {
                    Context context = this.this$0.getContext();
                    C13706o.m87926c(context);
                    Context applicationContext = context.getApplicationContext();
                    C15626c.m94876a(applicationContext, "ACTION_OPEN_DOCUMENT " + this.this$0.getString(C17541R$string.not_supported), 0).show();
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a0 */
    private final void m14079a0() {
        mo26240g0().mo26212j().observe(getViewLifecycleOwner(), new C2853i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m14080e0(C2855k kVar, C2851g gVar) {
        C13706o.m87929f(kVar, "this$0");
        kVar.m14081f0(gVar.mo26234b());
    }

    /* renamed from: f0 */
    private final void m14081f0(HttpRequestConfig httpRequestConfig) {
        String[] stringArray = getResources().getStringArray(C17525R$array.http_content_types);
        C13706o.m87928e(stringArray, "resources.getStringArray…array.http_content_types)");
        C8032x xVar = this.f7931f;
        C8032x xVar2 = null;
        if (xVar == null) {
            C13706o.m87945v("binding");
            xVar = null;
        }
        xVar.f19519l.setDisplayedChild(httpRequestConfig.hasBody() ? 1 : 0);
        String contentType = httpRequestConfig.getContentType();
        boolean z = true;
        int i = 0;
        if (contentType == null || contentType.length() == 0) {
            C8032x xVar3 = this.f7931f;
            if (xVar3 == null) {
                C13706o.m87945v("binding");
                xVar3 = null;
            }
            xVar3.f19515h.setSelection(0);
            C8032x xVar4 = this.f7931f;
            if (xVar4 == null) {
                C13706o.m87945v("binding");
                xVar4 = null;
            }
            EditText editText = xVar4.f19514g;
            C13706o.m87928e(editText, "binding.contentTypeCustom");
            editText.setVisibility(8);
        } else {
            int K = C13596m.m87586K(stringArray, httpRequestConfig.getContentType());
            if (K > 0) {
                C8032x xVar5 = this.f7931f;
                if (xVar5 == null) {
                    C13706o.m87945v("binding");
                    xVar5 = null;
                }
                xVar5.f19515h.setSelection(K);
                C8032x xVar6 = this.f7931f;
                if (xVar6 == null) {
                    C13706o.m87945v("binding");
                    xVar6 = null;
                }
                EditText editText2 = xVar6.f19514g;
                C13706o.m87928e(editText2, "binding.contentTypeCustom");
                editText2.setVisibility(8);
            } else {
                C8032x xVar7 = this.f7931f;
                if (xVar7 == null) {
                    C13706o.m87945v("binding");
                    xVar7 = null;
                }
                xVar7.f19515h.setSelection(stringArray.length - 1);
                C8032x xVar8 = this.f7931f;
                if (xVar8 == null) {
                    C13706o.m87945v("binding");
                    xVar8 = null;
                }
                EditText editText3 = xVar8.f19514g;
                C13706o.m87928e(editText3, "binding.contentTypeCustom");
                editText3.setVisibility(0);
                C8032x xVar9 = this.f7931f;
                if (xVar9 == null) {
                    C13706o.m87945v("binding");
                    xVar9 = null;
                }
                xVar9.f19514g.setText(httpRequestConfig.getContentType());
            }
        }
        C8032x xVar10 = this.f7931f;
        if (xVar10 == null) {
            C13706o.m87945v("binding");
            xVar10 = null;
        }
        xVar10.f19517j.setChecked(httpRequestConfig.getContentBodySource() == 0);
        C8032x xVar11 = this.f7931f;
        if (xVar11 == null) {
            C13706o.m87945v("binding");
            xVar11 = null;
        }
        xVar11.f19516i.setChecked(httpRequestConfig.getContentBodySource() == 1);
        C8032x xVar12 = this.f7931f;
        if (xVar12 == null) {
            C13706o.m87945v("binding");
            xVar12 = null;
        }
        xVar12.f19515h.setOnItemSelectedListener(new C2859d(this, stringArray));
        C8032x xVar13 = this.f7931f;
        if (xVar13 == null) {
            C13706o.m87945v("binding");
            xVar13 = null;
        }
        EditText editText4 = xVar13.f19514g;
        C13706o.m87928e(editText4, "binding.contentTypeCustom");
        editText4.addTextChangedListener(new C2857b(this));
        C8032x xVar14 = this.f7931f;
        if (xVar14 == null) {
            C13706o.m87945v("binding");
            xVar14 = null;
        }
        xVar14.f19513f.setText(httpRequestConfig.getContentBodyText());
        C8032x xVar15 = this.f7931f;
        if (xVar15 == null) {
            C13706o.m87945v("binding");
            xVar15 = null;
        }
        AppCompatEditText appCompatEditText = xVar15.f19513f;
        C13706o.m87928e(appCompatEditText, "binding.contentBodyText");
        appCompatEditText.addTextChangedListener(new C2858c(this));
        C8032x xVar16 = this.f7931f;
        if (xVar16 == null) {
            C13706o.m87945v("binding");
            xVar16 = null;
        }
        TextView textView = xVar16.f19510c;
        String contentBodyFileDisplayName = httpRequestConfig.getContentBodyFileDisplayName();
        textView.setText(contentBodyFileDisplayName == null || contentBodyFileDisplayName.length() == 0 ? getString(C17541R$string.action_play_sound_choose_file) : httpRequestConfig.getContentBodyFileDisplayName());
        C8032x xVar17 = this.f7931f;
        if (xVar17 == null) {
            C13706o.m87945v("binding");
            xVar17 = null;
        }
        LinearLayout linearLayout = xVar17.f19512e;
        C13706o.m87928e(linearLayout, "binding.bodyTextLayout");
        linearLayout.setVisibility(httpRequestConfig.getContentBodySource() == 0 ? 0 : 8);
        C8032x xVar18 = this.f7931f;
        if (xVar18 == null) {
            C13706o.m87945v("binding");
        } else {
            xVar2 = xVar18;
        }
        LinearLayout linearLayout2 = xVar2.f19509b;
        C13706o.m87928e(linearLayout2, "binding.bodyFileLayout");
        if (httpRequestConfig.getContentBodySource() != 1) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
    }

    /* renamed from: h0 */
    private final void m14082h0() {
        C2854j jVar = new C2854j(this);
        C8032x xVar = this.f7931f;
        if (xVar == null) {
            C13706o.m87945v("binding");
            xVar = null;
        }
        Button button = xVar.f19511d;
        C13706o.m87928e(button, "binding.bodyMagicTextButton");
        C4666m.m18147o(button, (C13640g) null, new C2860e(this, jVar, (C13635d<? super C2860e>) null), 1, (Object) null);
        C8032x xVar2 = this.f7931f;
        if (xVar2 == null) {
            C13706o.m87945v("binding");
            xVar2 = null;
        }
        RadioButton radioButton = xVar2.f19517j;
        C13706o.m87928e(radioButton, "binding.radioButtonText");
        C16061a.m96671b(radioButton, (C13640g) null, new C2861f(this, (C13635d<? super C2861f>) null), 1, (Object) null);
        C8032x xVar3 = this.f7931f;
        if (xVar3 == null) {
            C13706o.m87945v("binding");
            xVar3 = null;
        }
        ImageButton imageButton = xVar3.f19518k;
        C13706o.m87928e(imageButton, "binding.selectFileButton");
        C4666m.m18147o(imageButton, (C13640g) null, new C2862g(this, (C13635d<? super C2862g>) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m14083i0(C2855k kVar, C4023j0.C4029f fVar) {
        C13706o.m87929f(kVar, "this$0");
        C8032x xVar = kVar.f7931f;
        C8032x xVar2 = null;
        if (xVar == null) {
            C13706o.m87945v("binding");
            xVar = null;
        }
        int b = C16792h.m99540b(xVar.f19513f.getSelectionStart(), 0);
        C8032x xVar3 = kVar.f7931f;
        if (xVar3 == null) {
            C13706o.m87945v("binding");
            xVar3 = null;
        }
        int b2 = C16792h.m99540b(xVar3.f19513f.getSelectionEnd(), 0);
        C8032x xVar4 = kVar.f7931f;
        if (xVar4 == null) {
            C13706o.m87945v("binding");
        } else {
            xVar2 = xVar4;
        }
        Editable text = xVar2.f19513f.getText();
        if (text != null) {
            int d = C16792h.m99542d(b, b2);
            int b3 = C16792h.m99540b(b, b2);
            String str = fVar.f10575a;
            text.replace(d, b3, str, 0, str.length());
        }
    }

    /* renamed from: U */
    public void mo26239U() {
        this.f7933o.clear();
    }

    /* renamed from: g0 */
    public final HttpRequestConfigViewModel mo26240g0() {
        HttpRequestConfigViewModel httpRequestConfigViewModel = this.f7930d;
        if (httpRequestConfigViewModel != null) {
            return httpRequestConfigViewModel;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        if (i2 == -1 && i == 0) {
            C13706o.m87926c(intent);
            Uri data = intent.getData();
            C13706o.m87926c(data);
            requireContext().getContentResolver().takePersistableUriPermission(data, 1);
            DocumentFile fromSingleUri = DocumentFile.fromSingleUri(requireContext(), data);
            if (fromSingleUri == null || (str = fromSingleUri.getName()) == null) {
                str = "";
            }
            C8032x xVar = this.f7931f;
            if (xVar == null) {
                C13706o.m87945v("binding");
                xVar = null;
            }
            xVar.f19510c.setText(str);
            HttpRequestConfigViewModel g0 = mo26240g0();
            String uri = data.toString();
            C13706o.m87928e(uri, "uri.toString()");
            g0.mo26206F(uri, str);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        C8032x c = C8032x.m33433c(layoutInflater, viewGroup, false);
        C13706o.m87928e(c, "inflate(inflater, container, false)");
        this.f7931f = c;
        Bundle arguments = getArguments();
        this.f7932g = C4934n.m18998M().mo29682Q(arguments != null ? arguments.getLong("MacroGuid") : 0);
        m14082h0();
        m14079a0();
        C8032x xVar = this.f7931f;
        if (xVar == null) {
            C13706o.m87945v("binding");
            xVar = null;
        }
        return xVar.getRoot();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo26239U();
    }
}
