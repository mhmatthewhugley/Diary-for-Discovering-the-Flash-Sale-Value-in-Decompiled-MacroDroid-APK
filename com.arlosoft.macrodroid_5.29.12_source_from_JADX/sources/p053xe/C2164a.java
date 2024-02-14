package p053xe;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.location.LocationRequest;
import p044pl.charmas.android.reactivelocation.observables.C16215b;
import p453ze.C17092a;
import p459ef.C17153c;

/* renamed from: xe.a */
/* compiled from: ReactiveLocationProvider */
public class C2164a {

    /* renamed from: a */
    private final C16215b f6771a;

    public C2164a(Context context) {
        this(context, (Handler) null);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    public C17153c<Location> mo24388a(LocationRequest locationRequest) {
        return C17092a.m100562f(this.f6771a, locationRequest);
    }

    public C2164a(Context context, Handler handler) {
        this.f6771a = new C16215b(context, handler);
    }
}
