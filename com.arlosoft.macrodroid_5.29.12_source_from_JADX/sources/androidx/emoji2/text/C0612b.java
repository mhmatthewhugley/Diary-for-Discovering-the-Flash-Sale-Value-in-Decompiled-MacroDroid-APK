package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.emoji2.text.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0612b implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f527a;

    public /* synthetic */ C0612b(String str) {
        this.f527a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return ConcurrencyHelpers.lambda$createBackgroundPriorityExecutor$0(this.f527a, runnable);
    }
}
