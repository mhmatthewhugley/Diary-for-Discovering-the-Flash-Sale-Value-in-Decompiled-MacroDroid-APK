package com.arlosoft.macrodroid.action.screenshot;

import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.projection.MediaProjection;
import android.os.IBinder;
import java.util.Random;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16265l;

/* compiled from: CaptureService.kt */
public final class CaptureService extends Service {

    /* renamed from: d */
    public static final C3426a f9099d = new C3426a((C13695i) null);

    /* renamed from: f */
    private static final String f9100f = C13687e0.m87868b(CaptureService.class).mo71942g();

    /* renamed from: a */
    private final int f9101a = new Random().nextInt();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3428a f9102c = new C3428a(this);

    /* renamed from: com.arlosoft.macrodroid.action.screenshot.CaptureService$a */
    /* compiled from: CaptureService.kt */
    public static final class C3426a {
        private C3426a() {
        }

        public /* synthetic */ C3426a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.screenshot.CaptureService$b */
    /* compiled from: CaptureService.kt */
    static final class C3427b extends C13708q implements C16265l<Bitmap, C13339u> {
        final /* synthetic */ CaptureService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3427b(CaptureService captureService) {
            super(1);
            this.this$0 = captureService;
        }

        /* renamed from: a */
        public final void mo26775a(Bitmap bitmap) {
            C13706o.m87929f(bitmap, "it");
            this.this$0.f9102c.mo26777d();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo26775a((Bitmap) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: b */
    private final void m14311b() {
        this.f9102c.mo26777d();
        CaptureActivity.f9095d.mo26771b((MediaProjection) null);
    }

    /* renamed from: c */
    private final void m14312c() {
        MediaProjection a = CaptureActivity.f9095d.mo26770a();
        if (a != null) {
            this.f9102c.mo26776c(a, new C3427b(this));
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        m14311b();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        if (intent == null || (action = intent.getAction()) == null || action.hashCode() != -1104912246 || !action.equals("enable_capture")) {
            return 3;
        }
        m14312c();
        return 3;
    }
}
