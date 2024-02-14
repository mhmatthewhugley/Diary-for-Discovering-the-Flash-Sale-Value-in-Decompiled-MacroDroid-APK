package androidx.room;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.C15573z;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "it", "Lja/u;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
/* compiled from: RoomDatabase.kt */
final class RoomDatabaseKt$createTransactionContext$2 extends C13708q implements C16265l<Throwable, C13339u> {
    final /* synthetic */ C15573z $controlJob;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RoomDatabaseKt$createTransactionContext$2(C15573z zVar) {
        super(1);
        this.$controlJob = zVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C13339u.f61331a;
    }

    public final void invoke(Throwable th) {
        C15561w1.C15562a.m94723a(this.$controlJob, (CancellationException) null, 1, (Object) null);
    }
}
