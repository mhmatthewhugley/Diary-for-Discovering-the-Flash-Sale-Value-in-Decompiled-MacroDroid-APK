package p196y4;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import p196y4.C10410c;

/* renamed from: y4.f */
/* compiled from: DefaultConnectivityMonitorFactory */
public class C10415f implements C10412d {
    @NonNull
    /* renamed from: a */
    public C10410c mo41109a(@NonNull Context context, @NonNull C10410c.C10411a aVar) {
        boolean z = ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        boolean isLoggable = Log.isLoggable("ConnectivityMonitor", 3);
        return z ? new C10413e(context, aVar) : new C10419j();
    }
}
