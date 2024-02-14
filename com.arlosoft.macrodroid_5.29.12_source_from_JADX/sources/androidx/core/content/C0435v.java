package androidx.core.content;

/* renamed from: androidx.core.content.v */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0435v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UnusedAppRestrictionsBackportServiceConnection f440a;

    public /* synthetic */ C0435v(UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection) {
        this.f440a = unusedAppRestrictionsBackportServiceConnection;
    }

    public final void run() {
        this.f440a.disconnectFromService();
    }
}
