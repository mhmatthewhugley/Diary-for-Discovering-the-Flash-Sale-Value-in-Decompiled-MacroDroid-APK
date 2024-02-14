package p189x2;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17541R$string;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginType;
import kotlin.jvm.internal.C13706o;
import p268g8.C12315a;

/* renamed from: x2.g */
/* compiled from: TaskerPluginHelper.kt */
public final class C10362g extends C12315a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10362g(View view) {
        super(view);
        C13706o.m87929f(view, "itemView");
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m40673v(C10361e eVar, Plugin plugin, View view) {
        C13706o.m87929f(eVar, "$pluginSelectedListener");
        C13706o.m87929f(plugin, "$plugin");
        eVar.mo41033a(plugin);
    }

    /* renamed from: u */
    public final void mo41034u(Plugin plugin, C10361e eVar) {
        C13706o.m87929f(plugin, "plugin");
        C13706o.m87929f(eVar, "pluginSelectedListener");
        ((TextView) this.itemView.findViewById(C17532R$id.pluginName)).setText(plugin.getActivityLabel(this.itemView.getContext()));
        ((ImageView) this.itemView.findViewById(C17532R$id.pluginIcon)).setImageDrawable(plugin.getActivityIcon(this.itemView.getContext()));
        ((TextView) this.itemView.findViewById(C17532R$id.conditionEventLabel)).setText(this.itemView.getContext().getString(plugin.getType() == PluginType.CONDITION ? C17541R$string.tasker_plugin_type_condition : C17541R$string.tasker_plugin_type_event));
        ((LinearLayout) this.itemView.findViewById(C17532R$id.pluginContainer)).setOnClickListener(new C17508f(eVar, plugin));
    }
}
