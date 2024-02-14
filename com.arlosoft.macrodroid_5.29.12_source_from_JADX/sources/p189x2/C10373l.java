package p189x2;

import androidx.core.util.Pair;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginInstanceData;
import kotlin.jvm.internal.C13706o;

/* renamed from: x2.l */
/* compiled from: TaskerVariableHelper.kt */
public final class C10373l {

    /* renamed from: a */
    private final Pair<Plugin, PluginInstanceData> f23592a;

    /* renamed from: b */
    private final C10357b f23593b;

    /* renamed from: c */
    private final boolean f23594c;

    public C10373l(Pair<Plugin, PluginInstanceData> pair, C10357b bVar, boolean z) {
        C13706o.m87929f(pair, "pluginInstanceDataPair");
        C13706o.m87929f(bVar, "arrayHandlingOption");
        this.f23592a = pair;
        this.f23593b = bVar;
        this.f23594c = z;
    }

    /* renamed from: a */
    public final C10357b mo41050a() {
        return this.f23593b;
    }

    /* renamed from: b */
    public final boolean mo41051b() {
        return this.f23594c;
    }

    /* renamed from: c */
    public final Pair<Plugin, PluginInstanceData> mo41052c() {
        return this.f23592a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10373l)) {
            return false;
        }
        C10373l lVar = (C10373l) obj;
        return C13706o.m87924a(this.f23592a, lVar.f23592a) && this.f23593b == lVar.f23593b && this.f23594c == lVar.f23594c;
    }

    public int hashCode() {
        int hashCode = ((this.f23592a.hashCode() * 31) + this.f23593b.hashCode()) * 31;
        boolean z = this.f23594c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "TaskerVariableData(pluginInstanceDataPair=" + this.f23592a + ", arrayHandlingOption=" + this.f23593b + ", blockActions=" + this.f23594c + ')';
    }
}
