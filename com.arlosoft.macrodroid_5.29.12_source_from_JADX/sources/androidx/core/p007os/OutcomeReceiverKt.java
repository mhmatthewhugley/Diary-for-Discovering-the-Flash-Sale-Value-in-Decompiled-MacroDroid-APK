package androidx.core.p007os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;

@RequiresApi(31)
@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¨\u0006\u0006"}, mo71668d2 = {"R", "", "E", "Lkotlin/coroutines/d;", "Landroid/os/OutcomeReceiver;", "asOutcomeReceiver", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: androidx.core.os.OutcomeReceiverKt */
/* compiled from: OutcomeReceiver.kt */
public final class OutcomeReceiverKt {
    @RequiresApi(31)
    public static final <R, E extends Throwable> OutcomeReceiver<R, E> asOutcomeReceiver(C13635d<? super R> dVar) {
        C13706o.m87929f(dVar, "<this>");
        return new ContinuationOutcomeReceiver(dVar);
    }
}
