package androidx.paging;

import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15346k0;
import kotlinx.coroutines.flow.C15402v;
import p297ja.C13328m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo71668d2 = {"Landroidx/paging/ConflatedEventBus;", "", "T", "data", "Lja/u;", "send", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/v;", "Lja/m;", "", "state", "Lkotlinx/coroutines/flow/v;", "Lkotlinx/coroutines/flow/f;", "flow", "Lkotlinx/coroutines/flow/f;", "getFlow", "()Lkotlinx/coroutines/flow/f;", "initialValue", "<init>", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: ConflatedEventBus.kt */
public final class ConflatedEventBus<T> {
    private final C15285f<T> flow;
    private final C15402v<C13328m<Integer, T>> state;

    public ConflatedEventBus() {
        this((Object) null, 1, (C13695i) null);
    }

    public ConflatedEventBus(T t) {
        C15402v<C13328m<Integer, T>> a = C15346k0.m94215a(new C13328m(Integer.MIN_VALUE, t));
        this.state = a;
        this.flow = new ConflatedEventBus$special$$inlined$mapNotNull$1(a);
    }

    public final C15285f<T> getFlow() {
        return this.flow;
    }

    public final void send(T t) {
        C13706o.m87929f(t, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        C15402v<C13328m<Integer, T>> vVar = this.state;
        vVar.setValue(new C13328m(Integer.valueOf(((Number) vVar.getValue().mo70154c()).intValue() + 1), t));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConflatedEventBus(Object obj, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : obj);
    }
}
