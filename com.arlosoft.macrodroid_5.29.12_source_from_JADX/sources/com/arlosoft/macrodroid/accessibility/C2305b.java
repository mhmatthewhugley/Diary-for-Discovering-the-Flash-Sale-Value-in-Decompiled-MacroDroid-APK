package com.arlosoft.macrodroid.accessibility;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15552u0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.accessibility.b */
/* compiled from: AccessibilityServiceMonitor.kt */
public final class C2305b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f7115a;

    /* renamed from: com.arlosoft.macrodroid.accessibility.b$a */
    /* compiled from: AccessibilityServiceMonitor.kt */
    static final class C2306a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C2305b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2306a(C2305b bVar, C13635d<? super C2306a> dVar) {
            super(2, dVar);
            this.this$0 = bVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2306a(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2306a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                this.label = 1;
                if (C15552u0.m94699a(1000, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<String> f = C5163j2.m20150f(this.this$0.f7115a);
            String string = Settings.Secure.getString(this.this$0.f7115a.getContentResolver(), "enabled_accessibility_services");
            boolean z = false;
            if (string == null) {
                str = "";
            } else {
                boolean z2 = false;
                for (String next : f) {
                    C13706o.m87928e(string, "accessibilityServiceOutput");
                    C13706o.m87928e(next, "serviceId");
                    if (!C15177w.m93663N(string, next, false, 2, (Object) null)) {
                        string = string + ':' + next;
                        z2 = true;
                    }
                }
                str = string;
                z = z2;
            }
            if (z) {
                try {
                    Settings.Secure.putString(this.this$0.f7115a.getContentResolver(), "enabled_accessibility_services", str);
                } catch (SecurityException unused) {
                    C4878b.m18868g("Could not re-enable accessibility service, you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS");
                }
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.accessibility.b$b */
    /* compiled from: AccessibilityServiceMonitor.kt */
    public static final class C2307b extends ContentObserver {

        /* renamed from: a */
        final /* synthetic */ C2305b f7116a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2307b(C2305b bVar, Handler handler) {
            super(handler);
            this.f7116a = bVar;
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            super.onChange(z);
            this.f7116a.m9559d();
        }
    }

    public C2305b(Context context) {
        C13706o.m87929f(context, "context");
        this.f7115a = context;
    }

    /* renamed from: c */
    private final void m9558c() {
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new C2306a(this, (C13635d<? super C2306a>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m9559d() {
        m9558c();
    }

    /* renamed from: e */
    public final void mo24662e() {
        ContentResolver contentResolver = this.f7115a.getContentResolver();
        Uri uriFor = Settings.Secure.getUriFor("enabled_accessibility_services");
        m9558c();
        contentResolver.registerContentObserver(uriFor, false, new C2307b(this, new Handler()));
    }
}
