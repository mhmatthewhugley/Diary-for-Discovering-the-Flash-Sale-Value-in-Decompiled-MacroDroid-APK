package com.arlosoft.macrodroid.templatestore.p071ui.profile;

import android.content.Context;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.templatestore.events.TemplateStoreRefreshEvent;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.templateList.C5410a;
import com.arlosoft.macrodroid.templatestore.p071ui.upload.C5496a;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import java.io.File;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15907c0;
import okhttp3.C15995x;
import okhttp3.C15997y;
import p161s1.C10180a;
import p171u0.C10280a;
import p176v0.C10312a;
import p199z2.C10434a;
import p270ga.C12318a;
import p319lc.C15626c;
import p414v9.C16747p;
import p440y9.C16971a;
import p448z9.C17070a;
import retrofit2.HttpException;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.profile.r */
/* compiled from: ProfilePresenter.kt */
public final class C5341r extends C10280a<C5342s> {

    /* renamed from: c */
    private final C10312a f13183c;

    /* renamed from: d */
    private final C10434a f13184d;

    /* renamed from: f */
    private final C5527g f13185f;

    /* renamed from: g */
    private final Context f13186g;

    /* renamed from: o */
    private final C5496a f13187o;

    /* renamed from: p */
    private final C5410a f13188p;

    /* renamed from: s */
    private C17070a f13189s;

    public C5341r(C10312a aVar, C10434a aVar2, C5527g gVar, Context context, C5496a aVar3, C5410a aVar4) {
        C13706o.m87929f(aVar, "screenLoader");
        C13706o.m87929f(aVar2, "api");
        C13706o.m87929f(gVar, "userProvider");
        C13706o.m87929f(context, "context");
        C13706o.m87929f(aVar3, "templateRefreshNotifier");
        C13706o.m87929f(aVar4, "templateOverrideStore");
        this.f13183c = aVar;
        this.f13184d = aVar2;
        this.f13185f = gVar;
        this.f13186g = context;
        this.f13187o = aVar3;
        this.f13188p = aVar4;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static final void m20692B(C5341r rVar) {
        C13706o.m87929f(rVar, "this$0");
        rVar.f13188p.mo30607b();
        rVar.mo30532E();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static final void m20693C(C5341r rVar, Throwable th) {
        C13706o.m87929f(rVar, "this$0");
        C5342s sVar = (C5342s) rVar.mo40890k();
        if (sVar != null) {
            sVar.mo30506a();
        }
    }

    /* renamed from: F */
    private final void m20694F(String str, C15997y.C16000c cVar) {
        C16747p<User> pVar;
        C5342s sVar = (C5342s) mo40890k();
        if (sVar != null) {
            sVar.mo30510q0(true);
        }
        String g = C4660g.m18129g(this.f13185f.mo30790b().getUserId() + "adb97ac6-f780-4a41-8475-ce661b574999" + str);
        C17070a aVar = this.f13189s;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        if (cVar != null) {
            pVar = this.f13184d.mo41179w(g, this.f13185f.mo30790b().getUserId(), str, cVar);
        } else {
            pVar = this.f13184d.mo41180x(g, this.f13185f.mo30790b().getUserId(), str);
        }
        aVar.mo62358a(pVar.mo79730q(C12318a.m83030b()).mo79726l(C16971a.m100210a()).mo79723e(new C5335l(this)).mo79729o(new C5340q(this, cVar), new C5339p(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static final void m20695G(C5341r rVar) {
        C13706o.m87929f(rVar, "this$0");
        C5342s sVar = (C5342s) rVar.mo40890k();
        if (sVar != null) {
            sVar.mo30510q0(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static final void m20696H(C5341r rVar, C15997y.C16000c cVar, User user) {
        C13706o.m87929f(rVar, "this$0");
        C5163j2.m20095X5(rVar.f13186g, user);
        rVar.f13183c.mo40926a();
        if (cVar != null) {
            rVar.f13187o.mo30747a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static final void m20697I(C5341r rVar, Throwable th) {
        C13706o.m87929f(rVar, "this$0");
        if (!(th instanceof HttpException) || ((HttpException) th).mo80527a() != 409) {
            C5342s sVar = (C5342s) rVar.mo40890k();
            if (sVar != null) {
                sVar.mo30503Q0();
                return;
            }
            return;
        }
        C5342s sVar2 = (C5342s) rVar.mo40890k();
        if (sVar2 != null) {
            sVar2.mo30511y0();
        }
    }

    /* renamed from: w */
    private final void m20706w(String str, String str2, String str3, C15997y.C16000c cVar) {
        C16747p<User> pVar;
        C5342s sVar = (C5342s) mo40890k();
        if (sVar != null) {
            sVar.mo30510q0(true);
        }
        String g = C4660g.m18129g(str + "adb97ac6-f780-4a41-8475-ce661b574999" + str2 + str3);
        C17070a aVar = this.f13189s;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        if (cVar != null) {
            pVar = this.f13184d.mo41176t(g, str, str2, str3, cVar);
        } else {
            pVar = this.f13184d.mo41178v(g, str, str2, str3);
        }
        aVar.mo62358a(pVar.mo79730q(C12318a.m83030b()).mo79726l(C16971a.m100210a()).mo79723e(new C5334k(this)).mo79729o(new C5336m(this), new C5338o(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m20707x(C5341r rVar) {
        C13706o.m87929f(rVar, "this$0");
        C5342s sVar = (C5342s) rVar.mo40890k();
        if (sVar != null) {
            sVar.mo30510q0(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final void m20708y(C5341r rVar, User user) {
        C13706o.m87929f(rVar, "this$0");
        C5163j2.m20095X5(rVar.f13186g, user);
        rVar.f13183c.mo40926a();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final void m20709z(C5341r rVar, Throwable th) {
        C13706o.m87929f(rVar, "this$0");
        if (!(th instanceof HttpException) || ((HttpException) th).mo80527a() != 409) {
            C5342s sVar = (C5342s) rVar.mo40890k();
            if (sVar != null) {
                sVar.mo30503Q0();
                return;
            }
            return;
        }
        C5342s sVar2 = (C5342s) rVar.mo40890k();
        if (sVar2 != null) {
            sVar2.mo30511y0();
        }
    }

    /* renamed from: A */
    public final void mo30530A() {
        String g = C4660g.m18129g(this.f13185f.mo30790b().getUserId() + "adb97ac6-f780-4a41-8475-ce661b574999");
        C17070a aVar = this.f13189s;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo62358a(this.f13184d.mo41171o(g, this.f13185f.mo30790b().getUserId()).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a()).mo79657k(new C5333j(this), new C5337n(this)));
    }

    /* renamed from: D */
    public final void mo30531D(boolean z, String str, String str2, String str3, File file) {
        C13706o.m87929f(str, "username");
        C13706o.m87929f(str2, "personalIdentifier");
        C13706o.m87929f(str3, "description");
        C5342s sVar = (C5342s) mo40890k();
        if (sVar != null) {
            sVar.mo30502D();
        }
        if (!z || (str.length() >= 3 && str.length() <= 20)) {
            C15997y.C16000c cVar = null;
            if (file != null) {
                cVar = C15997y.C16000c.f65839c.mo76330b("upload", file.getName(), C15907c0.f65424a.mo75946e(C15995x.f65817g.mo76320b("image/*"), file));
            }
            if (z) {
                m20706w(str, str2, str3, cVar);
            } else {
                m20694F(str3, cVar);
            }
        } else {
            C5342s sVar2 = (C5342s) mo40890k();
            if (sVar2 != null) {
                sVar2.mo30504X0();
            }
        }
    }

    /* renamed from: E */
    public final void mo30532E() {
        this.f13185f.mo30789a();
        C15626c.m94876a(this.f13186g.getApplicationContext(), this.f13186g.getString(C17541R$string.templates_signed_out_popup), 1).show();
        this.f13183c.mo40926a();
        C10180a.m40075a().mo80018i(new TemplateStoreRefreshEvent());
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo27412l() {
        C17070a aVar = this.f13189s;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo80337d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo27413m() {
        this.f13189s = new C17070a();
    }
}
