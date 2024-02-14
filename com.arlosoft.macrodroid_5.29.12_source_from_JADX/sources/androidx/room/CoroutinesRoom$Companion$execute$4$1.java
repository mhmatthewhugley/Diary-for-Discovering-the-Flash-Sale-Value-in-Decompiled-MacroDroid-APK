package androidx.room;

import android.os.CancellationSignal;
import androidx.sqlite.p010db.SupportSQLiteCompat;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15561w1;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"R", "", "it", "Lja/u;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
/* compiled from: CoroutinesRoom.kt */
final class CoroutinesRoom$Companion$execute$4$1 extends C13708q implements C16265l<Throwable, C13339u> {
    final /* synthetic */ CancellationSignal $cancellationSignal;
    final /* synthetic */ C15561w1 $job;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$4$1(CancellationSignal cancellationSignal, C15561w1 w1Var) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$job = w1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C13339u.f61331a;
    }

    public final void invoke(Throwable th) {
        SupportSQLiteCompat.Api16Impl.cancel(this.$cancellationSignal);
        C15561w1.C15562a.m94723a(this.$job, (CancellationException) null, 1, (Object) null);
    }
}
