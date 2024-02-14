package p189x2;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.taskerplugin.App;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C13706o;

/* renamed from: x2.h */
/* compiled from: TaskerPluginHelper.kt */
public final class C10363h {

    /* renamed from: x2.h$a */
    /* compiled from: Comparisons.kt */
    public static final class C10364a<T> implements Comparator {

        /* renamed from: a */
        final /* synthetic */ SelectableItem f23572a;

        public C10364a(SelectableItem selectableItem) {
            this.f23572a = selectableItem;
        }

        public final int compare(T t, T t2) {
            return C15612b.m94865a(((Plugin) t).getActivityLabel(this.f23572a.mo27827K0()), ((Plugin) t2).getActivityLabel(this.f23572a.mo27827K0()));
        }
    }

    /* renamed from: x2.h$b */
    /* compiled from: Comparisons.kt */
    public static final class C10365b<T> implements Comparator {
        public final int compare(T t, T t2) {
            String d = ((App) t).mo30173d();
            Locale locale = Locale.ROOT;
            String lowerCase = d.toLowerCase(locale);
            C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String lowerCase2 = ((App) t2).mo30173d().toLowerCase(locale);
            C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return C15612b.m94865a(lowerCase, lowerCase2);
        }
    }

    /* renamed from: x2.h$c */
    /* compiled from: TaskerPluginHelper.kt */
    public static final class C10366c implements C10361e {

        /* renamed from: a */
        final /* synthetic */ C10360d f23573a;

        /* renamed from: b */
        final /* synthetic */ AppCompatDialog f23574b;

        C10366c(C10360d dVar, AppCompatDialog appCompatDialog) {
            this.f23573a = dVar;
            this.f23574b = appCompatDialog;
        }

        /* renamed from: a */
        public void mo41033a(Plugin plugin) {
            C13706o.m87929f(plugin, "plugin");
            this.f23573a.mo25308t(plugin);
            this.f23574b.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo41035a(SelectableItem selectableItem, Map<String, Plugin> map, C10360d dVar) {
        C13706o.m87929f(selectableItem, "selectableItem");
        C13706o.m87929f(map, "pluginMap");
        C13706o.m87929f(dVar, "selectedHandler");
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PackageManager packageManager = selectableItem.mo27827K0().getPackageManager();
        for (String j : map.keySet()) {
            Plugin plugin = (Plugin) C13615t0.m87760j(map, j);
            if (!linkedHashMap.containsKey(plugin.getPackageName())) {
                String packageName = plugin.getPackageName();
                C13706o.m87928e(packageName, "plugin.packageName");
                linkedHashMap.put(packageName, new ArrayList());
            }
            ArrayList arrayList2 = (ArrayList) linkedHashMap.get(plugin.getPackageName());
            if (arrayList2 != null) {
                arrayList2.add(plugin);
            }
        }
        for (String str : linkedHashMap.keySet()) {
            arrayList.add(new App(str, packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString(), C13566b0.m87450y0((ArrayList) C13615t0.m87760j(linkedHashMap, str), new C10364a(selectableItem))));
        }
        List y0 = C13566b0.m87450y0(arrayList, new C10365b());
        Activity j0 = selectableItem.mo27850j0();
        if (j0 != null) {
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, selectableItem.mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_tasker_plugin_chooser);
            appCompatDialog.setTitle((int) C17541R$string.select_plugin);
            RecyclerView recyclerView = (RecyclerView) appCompatDialog.findViewById(C17532R$id.pluginList);
            C10359c cVar = new C10359c(y0, new C10366c(dVar, appCompatDialog));
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(j0));
            }
            if (recyclerView != null) {
                recyclerView.setAdapter(cVar);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            Window window = appCompatDialog.getWindow();
            layoutParams.copyFrom(window != null ? window.getAttributes() : null);
            layoutParams.width = -1;
            layoutParams.height = -2;
            appCompatDialog.show();
            Window window2 = appCompatDialog.getWindow();
            if (window2 != null) {
                window2.setAttributes(layoutParams);
            }
        }
    }
}
