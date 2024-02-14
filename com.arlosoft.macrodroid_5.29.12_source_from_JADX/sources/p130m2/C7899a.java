package p130m2;

import com.arlosoft.macrodroid.plugins.data.PluginDetail;
import java.util.HashMap;
import kotlin.jvm.internal.C13706o;

/* renamed from: m2.a */
/* compiled from: LocalPluginListOverrideStore.kt */
public final class C7899a {

    /* renamed from: a */
    private final HashMap<Integer, PluginDetail> f18977a = new HashMap<>();

    /* renamed from: a */
    public final void mo37789a(int i, PluginDetail pluginDetail) {
        C13706o.m87929f(pluginDetail, "pluginDetail");
        this.f18977a.put(Integer.valueOf(i), pluginDetail);
    }

    /* renamed from: b */
    public final PluginDetail mo37790b(int i) {
        return this.f18977a.get(Integer.valueOf(i));
    }
}
