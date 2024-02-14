package androidx.emoji2.text;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: androidx.emoji2.text.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0611a implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f526a;

    public /* synthetic */ C0611a(Handler handler) {
        this.f526a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f526a.post(runnable);
    }
}
