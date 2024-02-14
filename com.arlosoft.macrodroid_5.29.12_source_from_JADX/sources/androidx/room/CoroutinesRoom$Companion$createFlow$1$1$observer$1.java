package androidx.room;

import androidx.room.InvalidationTracker;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.channels.C15221f;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, mo71668d2 = {"androidx/room/CoroutinesRoom$Companion$createFlow$1$1$observer$1", "Landroidx/room/InvalidationTracker$Observer;", "", "", "tables", "Lja/u;", "onInvalidated", "room-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: CoroutinesRoom.kt */
public final class CoroutinesRoom$Companion$createFlow$1$1$observer$1 extends InvalidationTracker.Observer {
    final /* synthetic */ C15221f<C13339u> $observerChannel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$createFlow$1$1$observer$1(String[] strArr, C15221f<C13339u> fVar) {
        super(strArr);
        this.$observerChannel = fVar;
    }

    public void onInvalidated(Set<String> set) {
        C13706o.m87929f(set, "tables");
        this.$observerChannel.m101371trySendJP2dKIU(C13339u.f61331a);
    }
}
