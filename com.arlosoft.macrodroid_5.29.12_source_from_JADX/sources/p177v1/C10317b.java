package p177v1;

import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.C15276b0;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15401u;
import p182w1.C10328a;

/* renamed from: v1.b */
/* compiled from: HelperResultHandler.kt */
public final class C10317b {

    /* renamed from: a */
    private final C15401u<C10328a> f23483a;

    /* renamed from: b */
    private final C15285f<C10328a> f23484b;

    public C10317b() {
        C15401u<C10328a> b = C15276b0.m94087b(0, 1, (C15220e) null, 5, (Object) null);
        this.f23483a = b;
        this.f23484b = b;
    }

    /* renamed from: a */
    public final C15285f<C10328a> mo40938a() {
        return this.f23484b;
    }

    /* renamed from: b */
    public final void mo40939b(C10328a aVar) {
        C13706o.m87929f(aVar, "helperResult");
        this.f23483a.mo74652b(aVar);
    }
}
