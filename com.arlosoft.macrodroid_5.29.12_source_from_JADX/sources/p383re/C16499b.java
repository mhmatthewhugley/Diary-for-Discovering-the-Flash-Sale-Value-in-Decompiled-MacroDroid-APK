package p383re;

import androidx.core.location.LocationRequestCompat;
import p392se.C16550d;
import p392se.C16552f;
import p392se.C16566k;

/* renamed from: re.b */
/* compiled from: DefaultInterfaceTemporal */
public abstract class C16499b extends C16500c implements C16550d {
    /* renamed from: b */
    public C16550d mo75667b(long j, C16566k kVar) {
        return j == Long.MIN_VALUE ? mo75670e(LocationRequestCompat.PASSIVE_INTERVAL, kVar).mo75670e(1, kVar) : mo75670e(-j, kVar);
    }

    /* renamed from: k */
    public C16550d mo75673k(C16552f fVar) {
        return fVar.mo75646n(this);
    }
}
