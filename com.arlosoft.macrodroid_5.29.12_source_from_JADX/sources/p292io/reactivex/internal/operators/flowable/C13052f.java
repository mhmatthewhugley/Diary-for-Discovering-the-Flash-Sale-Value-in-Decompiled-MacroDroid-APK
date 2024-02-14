package p292io.reactivex.internal.operators.flowable;

import androidx.core.location.LocationRequestCompat;
import p216ba.C11113d;
import p329me.C15739d;

/* renamed from: io.reactivex.internal.operators.flowable.f */
/* compiled from: FlowableInternalHelper */
public enum C13052f implements C11113d<C15739d> {
    INSTANCE;

    /* renamed from: b */
    public void accept(C15739d dVar) throws Exception {
        dVar.request(LocationRequestCompat.PASSIVE_INTERVAL);
    }
}
