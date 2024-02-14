package p157r3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13706o;
import p163s3.C10185b;
import p270ga.C12318a;
import p297ja.C13328m;
import p329me.C15737b;
import p414v9.C16727a;
import p414v9.C16728b;
import p414v9.C16732f;
import p414v9.C16735i;
import p440y9.C16971a;

/* renamed from: r3.d */
/* compiled from: WebTriggerInteractor.kt */
public final class C8195d {

    /* renamed from: a */
    private final C10185b f19867a;

    public C8195d(C10185b bVar) {
        C13706o.m87929f(bVar, "api");
        this.f19867a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final C15737b m34004g(C16732f fVar) {
        C13706o.m87929f(fVar, "errors");
        return fVar.mo79660A(C16735i.m99344L(1, 4).mo79699d0(C16727a.DROP), C16347a.f66836a).mo79661h(C16349c.f66838a);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final C13328m m34005h(Throwable th, int i) {
        C13706o.m87929f(th, "throwable");
        return new C13328m(Integer.valueOf(i), th);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final C15737b m34006i(C13328m mVar) {
        C13706o.m87929f(mVar, "zipOut");
        if (((Number) mVar.mo70154c()).intValue() < 4) {
            return C16735i.m99346b0(10, TimeUnit.SECONDS).mo79699d0(C16727a.DROP);
        }
        return C16732f.m99314f((Throwable) mVar.mo70155d());
    }

    /* renamed from: d */
    public final C16728b mo38261d(String str, String str2) {
        C13706o.m87929f(str, "deviceId");
        C13706o.m87929f(str2, "passwordHash");
        C16728b i = this.f19867a.mo40788c(str, str2).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a());
        C13706o.m87928e(i, "api.urlTriggerExport(dev…dSchedulers.mainThread())");
        return i;
    }

    /* renamed from: e */
    public final C16728b mo38262e(String str, String str2, String str3) {
        C13706o.m87929f(str, "deviceId");
        C13706o.m87929f(str2, "passwordHash");
        C13706o.m87929f(str3, "pushToken");
        C16728b i = this.f19867a.mo40787b(str, str2, str3).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a());
        C13706o.m87928e(i, "api.urlTriggerDeviceIdPo…dSchedulers.mainThread())");
        return i;
    }

    /* renamed from: f */
    public final C16728b mo38263f(String str, String str2, String str3, String str4) {
        C13706o.m87929f(str, "deviceId");
        C13706o.m87929f(str2, "alias");
        C13706o.m87929f(str3, "pushTokenId");
        C10185b bVar = this.f19867a;
        if (str4 == null) {
            str4 = "";
        }
        C16728b i = bVar.mo40786a(str, str2, str3, str4).mo79656j(C16348b.f66837a).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a());
        C13706o.m87928e(i, "api.urlTriggerToken(devi…dSchedulers.mainThread())");
        return i;
    }

    /* renamed from: j */
    public final C16728b mo38264j(String str, String str2, String str3, String str4) {
        C13706o.m87929f(str, "deviceId");
        C13706o.m87929f(str2, "alias");
        C13706o.m87929f(str3, "pushTokenId");
        C10185b bVar = this.f19867a;
        if (str4 == null) {
            str4 = "";
        }
        C16728b i = bVar.mo40786a(str, str2, str3, str4).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a());
        C13706o.m87928e(i, "api.urlTriggerToken(devi…dSchedulers.mainThread())");
        return i;
    }
}
