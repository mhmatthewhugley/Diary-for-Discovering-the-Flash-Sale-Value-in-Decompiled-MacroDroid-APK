package p448z9;

/* renamed from: z9.e */
/* compiled from: RunnableDisposable */
final class C17074e extends C17073d<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    C17074e(Runnable runnable) {
        super(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo80339a(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
