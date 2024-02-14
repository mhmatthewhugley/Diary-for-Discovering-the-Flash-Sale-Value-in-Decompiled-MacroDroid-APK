package com.arlosoft.macrodroid.templatestore.reportmacro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.Toolbar;
import com.android.p023dx.p026io.Opcodes;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import com.arlosoft.macrodroid.templatestore.reportmacro.C5255j;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p139o1.C8011l;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16270q;

/* compiled from: ReportMacroActivity.kt */
public final class ReportMacroActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: C */
    public static final C5227a f13055C = new C5227a((C13695i) null);

    /* renamed from: A */
    private C8011l f13056A;

    /* renamed from: B */
    public Map<Integer, View> f13057B = new LinkedHashMap();

    /* renamed from: s */
    public C5249i f13058s;

    /* renamed from: z */
    public C5247g f13059z;

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.ReportMacroActivity$a */
    /* compiled from: ReportMacroActivity.kt */
    public static final class C5227a {
        private C5227a() {
        }

        public /* synthetic */ C5227a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo30366a(Activity activity) {
            C13706o.m87929f(activity, "activity");
            activity.startActivityForResult(new Intent(activity, ReportMacroActivity.class), Opcodes.OR_INT_LIT8);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.ReportMacroActivity$b */
    /* compiled from: ReportMacroActivity.kt */
    static final class C5228b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ MacroTemplate $macroTemplate;
        int label;
        final /* synthetic */ ReportMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5228b(ReportMacroActivity reportMacroActivity, MacroTemplate macroTemplate, C13635d<? super C5228b> dVar) {
            super(3, dVar);
            this.this$0 = reportMacroActivity;
            this.$macroTemplate = macroTemplate;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5228b(this.this$0, this.$macroTemplate, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m20410b2(this.$macroTemplate);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.ReportMacroActivity$c */
    /* compiled from: ReportMacroActivity.kt */
    static final class C5229c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ MacroTemplate $macroTemplate;
        int label;
        final /* synthetic */ ReportMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5229c(ReportMacroActivity reportMacroActivity, MacroTemplate macroTemplate, C13635d<? super C5229c> dVar) {
            super(3, dVar);
            this.this$0 = reportMacroActivity;
            this.$macroTemplate = macroTemplate;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5229c(this.this$0, this.$macroTemplate, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m20409a2(this.$macroTemplate);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.ReportMacroActivity$d */
    /* compiled from: ReportMacroActivity.kt */
    static final class C5230d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;
        final /* synthetic */ ReportMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5230d(ReportMacroActivity reportMacroActivity, AppCompatDialog appCompatDialog, C13635d<? super C5230d> dVar) {
            super(3, dVar);
            this.this$0 = reportMacroActivity;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5230d(this.this$0, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo30365Z1().mo30397j();
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.ReportMacroActivity$e */
    /* compiled from: ReportMacroActivity.kt */
    static final class C5231e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5231e(AppCompatDialog appCompatDialog, C13635d<? super C5231e> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5231e(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
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

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.ReportMacroActivity$f */
    /* compiled from: ReportMacroActivity.kt */
    static final class C5232f extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;
        final /* synthetic */ ReportMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5232f(ReportMacroActivity reportMacroActivity, AppCompatDialog appCompatDialog, C13635d<? super C5232f> dVar) {
            super(3, dVar);
            this.this$0 = reportMacroActivity;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5232f(this.this$0, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo30365Z1().mo30398k();
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.ReportMacroActivity$g */
    /* compiled from: ReportMacroActivity.kt */
    static final class C5233g extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5233g(AppCompatDialog appCompatDialog, C13635d<? super C5233g> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5233g(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
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

    /* renamed from: V1 */
    private final void m20406V1() {
        mo30365Z1().mo30399l().observe(this, new C5244d(this));
        mo30365Z1().mo30400n().observe(this, new C5245e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public static final void m20407W1(ReportMacroActivity reportMacroActivity, C5234a aVar) {
        C13706o.m87929f(reportMacroActivity, "this$0");
        C5235b bVar = new C5235b(aVar.mo30373a());
        C8011l lVar = reportMacroActivity.f13056A;
        if (lVar == null) {
            C13706o.m87945v("binding");
            lVar = null;
        }
        lVar.f19330c.setAdapter(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public static final void m20408X1(ReportMacroActivity reportMacroActivity, C5255j jVar) {
        C13706o.m87929f(reportMacroActivity, "this$0");
        if (jVar instanceof C5255j.C5256a) {
            reportMacroActivity.setResult(-1);
            reportMacroActivity.finish();
        }
        if (jVar instanceof C5255j.C5257b) {
            C15626c.makeText(reportMacroActivity, C17541R$string.macrodroid_error, 1).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public final void m20409a2(MacroTemplate macroTemplate) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog_Template);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_moderator_clear_reports);
        appCompatDialog.setTitle((CharSequence) macroTemplate.getName());
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        if (button != null) {
            C4666m.m18147o(button, (C13640g) null, new C5230d(this, appCompatDialog, (C13635d<? super C5230d>) null), 1, (Object) null);
        }
        if (button2 != null) {
            C4666m.m18147o(button2, (C13640g) null, new C5231e(appCompatDialog, (C13635d<? super C5231e>) null), 1, (Object) null);
        }
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public final void m20410b2(MacroTemplate macroTemplate) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog_Template);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_moderator_remove);
        appCompatDialog.setTitle((CharSequence) macroTemplate.getName());
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        if (button != null) {
            C4666m.m18147o(button, (C13640g) null, new C5232f(this, appCompatDialog, (C13635d<? super C5232f>) null), 1, (Object) null);
        }
        if (button2 != null) {
            C4666m.m18147o(button2, (C13640g) null, new C5233g(appCompatDialog, (C13635d<? super C5233g>) null), 1, (Object) null);
        }
        appCompatDialog.show();
    }

    /* renamed from: Y1 */
    public final C5247g mo30364Y1() {
        C5247g gVar = this.f13059z;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("reportMacroRepository");
        return null;
    }

    /* renamed from: Z1 */
    public final C5249i mo30365Z1() {
        C5249i iVar = this.f13058s;
        if (iVar != null) {
            return iVar;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8011l c = C8011l.m33361c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f13056A = c;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        setSupportActionBar((Toolbar) findViewById(2131364057));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        MacroTemplate a = mo30364Y1().mo30394a();
        C13706o.m87926c(a);
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setTitle((CharSequence) a.getName());
        }
        mo30365Z1().mo30401o(a);
        m20406V1();
        C8011l lVar = this.f13056A;
        if (lVar == null) {
            C13706o.m87945v("binding");
            lVar = null;
        }
        Button button = lVar.f19331d;
        C13706o.m87928e(button, "binding.deleteMacroButton");
        C4666m.m18147o(button, (C13640g) null, new C5228b(this, a, (C13635d<? super C5228b>) null), 1, (Object) null);
        C8011l lVar2 = this.f13056A;
        if (lVar2 == null) {
            C13706o.m87945v("binding");
            lVar2 = null;
        }
        Button button2 = lVar2.f19329b;
        C13706o.m87928e(button2, "binding.clearReportsButton");
        C4666m.m18147o(button2, (C13640g) null, new C5229c(this, a, (C13635d<? super C5229c>) null), 1, (Object) null);
    }

    public void onDestroy() {
        super.onDestroy();
        mo30364Y1().mo30395b((MacroTemplate) null);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
