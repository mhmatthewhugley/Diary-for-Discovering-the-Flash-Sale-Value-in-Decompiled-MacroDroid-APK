package androidx.room;

/* renamed from: androidx.room.f0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1112f0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InvalidationTracker f637a;

    public /* synthetic */ C1112f0(InvalidationTracker invalidationTracker) {
        this.f637a = invalidationTracker;
    }

    public final void run() {
        this.f637a.onAutoCloseCallback();
    }
}
