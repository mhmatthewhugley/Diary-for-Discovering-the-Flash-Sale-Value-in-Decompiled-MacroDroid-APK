package com.arlosoft.macrodroid.templatestore.p071ui.upload;

import android.content.Context;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.ParentAction;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import com.arlosoft.macrodroid.templatestore.model.UploadMacroBody;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.google.gson.Gson;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p099h1.C7361a;
import p171u0.C10280a;
import p199z2.C10434a;
import p270ga.C12318a;
import p414v9.C16728b;
import p440y9.C16971a;
import p448z9.C17070a;
import retrofit2.HttpException;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.upload.p */
/* compiled from: TemplateUploadPresenter.kt */
public final class C5511p extends C10280a<C5512q> {

    /* renamed from: A */
    private int f13465A;

    /* renamed from: B */
    private String f13466B;

    /* renamed from: C */
    private String f13467C;

    /* renamed from: c */
    private final C10434a f13468c;

    /* renamed from: d */
    private final C5527g f13469d;

    /* renamed from: f */
    private final Gson f13470f;

    /* renamed from: g */
    private final Context f13471g;

    /* renamed from: o */
    private final C5496a f13472o;

    /* renamed from: p */
    private final C7361a f13473p;

    /* renamed from: s */
    private final C4915a f13474s;

    /* renamed from: z */
    private C17070a f13475z;

    public C5511p(C10434a aVar, C5527g gVar, Gson gson, Context context, C5496a aVar2, C7361a aVar3, C4915a aVar4) {
        C13706o.m87929f(aVar, "api");
        C13706o.m87929f(gVar, "userProvider");
        C13706o.m87929f(gson, "gson");
        C13706o.m87929f(context, "context");
        C13706o.m87929f(aVar2, "templateRefreshNotifier");
        C13706o.m87929f(aVar3, "categoriesHelper");
        C13706o.m87929f(aVar4, "actionBlockStore");
        this.f13468c = aVar;
        this.f13469d = gVar;
        this.f13470f = gson;
        this.f13471g = context;
        this.f13472o = aVar2;
        this.f13473p = aVar3;
        this.f13474s = aVar4;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final void m21192w(Macro macro, String str, String str2) {
        C13706o.m87929f(macro, "$macro");
        macro.setName(str);
        macro.setDescription(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m21193x(C5511p pVar) {
        C13706o.m87929f(pVar, "this$0");
        C5512q qVar = (C5512q) pVar.mo40890k();
        if (qVar != null) {
            qVar.mo30735m0();
        }
        C5512q qVar2 = (C5512q) pVar.mo40890k();
        if (qVar2 != null) {
            qVar2.mo30736n0();
        }
        C5512q qVar3 = (C5512q) pVar.mo40890k();
        if (qVar3 != null) {
            qVar3.mo30737o0();
        }
        pVar.f13472o.mo30747a();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final void m21194y(C5511p pVar, Throwable th) {
        C13706o.m87929f(pVar, "this$0");
        if ((th instanceof HttpException) && ((HttpException) th).mo80527a() == 403) {
            C5512q qVar = (C5512q) pVar.mo40890k();
            if (qVar != null) {
                qVar.mo30735m0();
            }
            C5512q qVar2 = (C5512q) pVar.mo40890k();
            if (qVar2 != null) {
                qVar2.mo30723B();
                return;
            }
            return;
        }
        C4878b.m18868g("Template upload failed: " + th);
        C5512q qVar3 = (C5512q) pVar.mo40890k();
        if (qVar3 != null) {
            qVar3.mo30740s0();
        }
        C5512q qVar4 = (C5512q) pVar.mo40890k();
        if (qVar4 != null) {
            qVar4.mo30739r0(false);
        }
    }

    /* renamed from: z */
    private final C16728b m21195z(String str, UploadMacroBody uploadMacroBody, boolean z, int i) {
        if (!z || i <= 0) {
            return this.f13468c.mo41168l(str, uploadMacroBody);
        }
        C10434a aVar = this.f13468c;
        return aVar.mo41167k(C4660g.m18129g("adb97ac6-f780-4a41-8475-ce661b574999" + i), i, uploadMacroBody);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo27412l() {
        C17070a aVar = this.f13475z;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo80337d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo27413m() {
        this.f13475z = new C17070a();
    }

    /* renamed from: r */
    public final void mo30756r(Macro macro) {
        C13706o.m87929f(macro, "macro");
        mo30758t(macro);
    }

    /* renamed from: s */
    public final void mo30757s(String str, String str2, Macro macro, String str3, int i, boolean z) {
        String str4 = str;
        String str5 = str2;
        Macro macro2 = macro;
        int i2 = i;
        C13706o.m87929f(str4, "name");
        C13706o.m87929f(str5, "description");
        C13706o.m87929f(macro2, "macro");
        C13706o.m87929f(str3, "languageCode");
        if (str.length() < 5 || str.length() > 100 || str2.length() < 20 || str2.length() > 2000) {
            C5512q qVar = (C5512q) mo40890k();
            if (qVar != null) {
                qVar.mo30726S0();
            }
        } else if (i2 == 0) {
            C5512q qVar2 = (C5512q) mo40890k();
            if (qVar2 != null) {
                qVar2.mo30728e0();
            }
        } else {
            C5512q qVar3 = (C5512q) mo40890k();
            if (qVar3 != null) {
                qVar3.mo30738o1();
            }
            macro2.setDescription(str5);
            macro2.setName(str4);
            macro2.initialiseExportedActionBlocks(this.f13474s);
            String encode = URLEncoder.encode(this.f13470f.mo63984s(macro2), "UTF-8");
            User b = this.f13469d.mo30790b();
            macro.clearExportedActionBlocks();
            Iterator<Trigger> it = macro.getTriggerList().iterator();
            while (it.hasNext()) {
                Trigger next = it.next();
                next.mo24687G2(macro2);
                next.mo25131U();
            }
            Iterator<Action> it2 = macro.getActions().iterator();
            while (it2.hasNext()) {
                Action next2 = it2.next();
                next2.mo24687G2(macro2);
                next2.mo25131U();
            }
            for (Constraint next3 : macro.getConstraints()) {
                next3.mo24687G2(macro2);
                next3.mo25131U();
            }
            String name = macro.getName();
            C13706o.m87928e(name, "macro.name");
            String username = b.getUsername();
            String description = macro.getDescription();
            C13706o.m87928e(description, "macro.description");
            C13706o.m87928e(encode, "encodedJSON");
            MacroTemplate macroTemplate = r1;
            MacroTemplate macroTemplate2 = new MacroTemplate(name, (String) null, username, description, (String) null, "", encode, str3, 0, System.currentTimeMillis(), b.getImage(), 0, b.getUserId(), 0, 0, 0, false, macro, false, false, 0, 0, 3932160, (C13695i) null);
            C5512q qVar4 = (C5512q) mo40890k();
            if (qVar4 != null) {
                qVar4.mo30724D0(macroTemplate, i, z);
            }
        }
    }

    /* renamed from: t */
    public final void mo30758t(Macro macro) {
        C13706o.m87929f(macro, "macro");
        C7361a aVar = this.f13473p;
        String category = macro.getCategory();
        C13706o.m87928e(category, "macro.category");
        int a = aVar.mo37338a(category);
        C5512q qVar = (C5512q) mo40890k();
        if (qVar != null) {
            Macro cloneMacro = macro.cloneMacro(false, false);
            C13706o.m87928e(cloneMacro, "macro.cloneMacro(false, false)");
            qVar.mo30725N(cloneMacro, a, this.f13465A > 0, this.f13466B, this.f13467C);
        }
    }

    /* renamed from: u */
    public final void mo30759u(int i, String str, String str2) {
        this.f13465A = i;
        this.f13466B = str;
        this.f13467C = str2;
    }

    /* renamed from: v */
    public final void mo30760v(Macro macro, String str, int i, boolean z) {
        Macro macro2 = macro;
        C13706o.m87929f(macro2, "macro");
        C13706o.m87929f(str, "language");
        C5512q qVar = (C5512q) mo40890k();
        if (qVar != null) {
            qVar.mo30739r0(true);
        }
        String description = macro.getDescription();
        String name = macro.getName();
        macro2.setDescription("");
        macro2.setName("");
        macro2.initialiseExportedActionBlocks(this.f13474s);
        Iterator<Action> it = macro.getActions().iterator();
        while (it.hasNext()) {
            Action next = it.next();
            if (next instanceof ParentAction) {
                ((ParentAction) next).mo25459K3(false);
            }
        }
        String encode = URLEncoder.encode(this.f13470f.mo63984s(macro2), "UTF-8");
        macro.clearExportedActionBlocks();
        String g = C4660g.m18129g(i + name + "adb97ac6-f780-4a41-8475-ce661b574999" + this.f13469d.mo30790b().getUserId());
        C17070a aVar = this.f13475z;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        C17070a aVar2 = aVar;
        int userId = this.f13469d.mo30790b().getUserId();
        C13706o.m87928e(name, "name");
        C13706o.m87928e(description, "description");
        C13706o.m87928e(encode, "json");
        UploadMacroBody uploadMacroBody = r3;
        UploadMacroBody uploadMacroBody2 = new UploadMacroBody(userId, name, description, encode, i, str, 9999);
        aVar2.mo62358a(C16728b.m99297h(C16728b.m99298n(2, TimeUnit.SECONDS), m21195z(g, uploadMacroBody, z, this.f13465A)).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a()).mo79653d(new C5508m(macro2, name, description)).mo79657k(new C5509n(this), new C5510o(this)));
    }
}
