package p189x2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.taskerplugin.App;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p239d8.C11965b;

/* renamed from: x2.c */
/* compiled from: TaskerPluginHelper.kt */
public final class C10359c extends C11965b<C10356a, C10362g> {

    /* renamed from: g */
    private final C10361e f23571g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10359c(List<? extends ExpandableGroup<?>> list, C10361e eVar) {
        super(list);
        C13706o.m87929f(list, "groups");
        C13706o.m87929f(eVar, "pluginSelectedListener");
        this.f23571g = eVar;
    }

    /* renamed from: G */
    public void mo41025C(C10362g gVar, int i, ExpandableGroup<?> expandableGroup, int i2) {
        C13706o.m87927d(expandableGroup, "null cannot be cast to non-null type com.arlosoft.macrodroid.taskerplugin.App");
        Plugin plugin = (Plugin) ((App) expandableGroup).mo66995b().get(i2);
        if (gVar != null) {
            C13706o.m87928e(plugin, "plugin");
            gVar.mo41034u(plugin, this.f23571g);
        }
    }

    /* renamed from: H */
    public void mo41026D(C10356a aVar, int i, ExpandableGroup<?> expandableGroup) {
        if (aVar != null) {
            C13706o.m87927d(expandableGroup, "null cannot be cast to non-null type com.arlosoft.macrodroid.taskerplugin.App");
            String c = ((App) expandableGroup).mo66996c();
            C13706o.m87928e(c, "group as App).title");
            aVar.mo41022w(c);
        }
    }

    /* renamed from: I */
    public C10362g mo41027E(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.list_item_plugin, viewGroup, false);
        C13706o.m87928e(inflate, "view");
        return new C10362g(inflate);
    }

    /* renamed from: J */
    public C10356a mo41028F(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.list_item_plugin_app, viewGroup, false);
        C13706o.m87928e(inflate, "view");
        return new C10356a(inflate);
    }
}
