package androidx.window.layout;

import android.app.Activity;
import androidx.biometric.auth.C0271a;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.channels.C15235p;
import kotlinx.coroutines.channels.C15239r;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/channels/r;", "Landroidx/window/layout/WindowLayoutInfo;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
@C13658f(mo71893c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", mo71894f = "WindowInfoTrackerImpl.kt", mo71895l = {47}, mo71896m = "invokeSuspend")
/* compiled from: WindowInfoTrackerImpl.kt */
final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends C13665l implements C16269p<C15239r<? super WindowLayoutInfo>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInfoTrackerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, C13635d<? super WindowInfoTrackerImpl$windowLayoutInfo$1> dVar) {
        super(2, dVar);
        this.this$0 = windowInfoTrackerImpl;
        this.$activity = activity;
    }

    /* access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
    public static final void m101285invokeSuspend$lambda0(C15239r rVar, WindowLayoutInfo windowLayoutInfo) {
        rVar.m101371trySendJP2dKIU(windowLayoutInfo);
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$activity, dVar);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    public final Object invoke(C15239r<? super WindowLayoutInfo> rVar, C13635d<? super C13339u> dVar) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(rVar, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            C15239r rVar = (C15239r) this.L$0;
            final C1312c cVar = new C1312c(rVar);
            this.this$0.windowBackend.registerLayoutChangeCallback(this.$activity, C0271a.f317a, cVar);
            final WindowInfoTrackerImpl windowInfoTrackerImpl = this.this$0;
            C13092 r3 = new C16254a<C13339u>() {
                public final void invoke() {
                    windowInfoTrackerImpl.windowBackend.unregisterLayoutChangeCallback(cVar);
                }
            };
            this.label = 1;
            if (C15235p.m93897a(rVar, r3, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13339u.f61331a;
    }
}
