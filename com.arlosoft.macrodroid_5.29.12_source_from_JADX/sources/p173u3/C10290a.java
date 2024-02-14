package p173u3;

import android.content.Context;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p194y1.C10393a;

/* renamed from: u3.a */
/* compiled from: EncourageUpgradeMessageManager.kt */
public final class C10290a {

    /* renamed from: d */
    public static final C10291a f23445d = new C10291a((C13695i) null);

    /* renamed from: a */
    private final Context f23446a;

    /* renamed from: b */
    private final C5070a f23447b;

    /* renamed from: c */
    private final C4083b f23448c;

    /* renamed from: u3.a$a */
    /* compiled from: EncourageUpgradeMessageManager.kt */
    public static final class C10291a {
        private C10291a() {
        }

        public /* synthetic */ C10291a(C13695i iVar) {
            this();
        }
    }

    public C10290a(Context context, C5070a aVar, C4083b bVar) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(aVar, "remoteConfig");
        C13706o.m87929f(bVar, "premiumStatusHandler");
        this.f23446a = context;
        this.f23447b = aVar;
        this.f23448c = bVar;
    }

    /* renamed from: a */
    public final C10393a mo40906a() {
        if (this.f23448c.mo28009e().mo28008a()) {
            return null;
        }
        long d = this.f23447b.mo29977d();
        if (d == 0) {
            return null;
        }
        if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - C5163j2.m20271u0(this.f23446a)) > this.f23447b.mo29976c()) {
            return d == 1 ? new C10393a.C10394a() : new C10393a.C10395b();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo40907b(Context context) {
        C13706o.m87929f(context, "context");
        C5163j2.m20195k4(context, System.currentTimeMillis());
    }
}
