package p176v0;

import android.app.Activity;
import com.arlosoft.macrodroid.templatestore.p071ui.comments.C5295g;
import com.arlosoft.macrodroid.templatestore.reportmacro.C5247g;
import p287ia.C12478a;

/* renamed from: v0.b */
/* compiled from: ScreenLoader_Factory */
public final class C10314b implements C12478a {

    /* renamed from: a */
    private final C12478a<Activity> f23479a;

    /* renamed from: b */
    private final C12478a<C5247g> f23480b;

    /* renamed from: c */
    private final C12478a<C5295g> f23481c;

    public C10314b(C12478a<Activity> aVar, C12478a<C5247g> aVar2, C12478a<C5295g> aVar3) {
        this.f23479a = aVar;
        this.f23480b = aVar2;
        this.f23481c = aVar3;
    }

    /* renamed from: a */
    public static C10314b m40517a(C12478a<Activity> aVar, C12478a<C5247g> aVar2, C12478a<C5295g> aVar3) {
        return new C10314b(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C10312a m40518c(C12478a<Activity> aVar, C12478a<C5247g> aVar2, C12478a<C5295g> aVar3) {
        C10312a aVar4 = new C10312a(aVar.get(), aVar2.get());
        C10315c.m40520a(aVar4, aVar3.get());
        return aVar4;
    }

    /* renamed from: b */
    public C10312a get() {
        return m40518c(this.f23479a, this.f23480b, this.f23481c);
    }
}
