package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.appcompat.app.AlertDialog;
import androidx.core.util.Pair;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.LocalePluginTriggerReceiver;
import com.arlosoft.macrodroid.widget.C6637e;
import com.twofortyfouram.locale.sdk.host.api.Condition;
import com.twofortyfouram.locale.sdk.host.api.Event;
import com.twofortyfouram.locale.sdk.host.api.PluginRegistry;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginErrorEdit;
import com.twofortyfouram.locale.sdk.host.model.PluginInstanceData;
import com.twofortyfouram.locale.sdk.host.model.PluginType;
import com.twofortyfouram.locale.sdk.host.p235ui.fragment.AbstractPluginEditFragment;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.p353io.IOUtils;
import p037m.C2009f;
import p057a2.C2222k;
import p057a2.C2226o;
import p119k3.C7552s0;
import p148q0.C8151a;
import p189x2.C10357b;
import p189x2.C10360d;
import p189x2.C10363h;
import p189x2.C10373l;
import p189x2.C10374m;
import p189x2.C10375p;
import p319lc.C15626c;
import p459ef.C17153c;
import p459ef.C17162h;
import p460ff.C17164a;
import p462hf.C17171a;
import p469of.C17220a;

public class LocalePluginTrigger extends Trigger implements C10374m, C10360d, C2222k, C2226o {
    public static final Parcelable.Creator<LocalePluginTrigger> CREATOR = new C5683b();
    /* access modifiers changed from: private */
    public static LocalePluginTrigger s_currentTrigger;
    private static LocalePluginTriggerReceiver s_localePluginTriggerReceiver;
    private static int s_triggerCounter;
    private int arrayHandlingOption;
    /* access modifiers changed from: private */
    public transient Condition condition;
    /* access modifiers changed from: private */
    public transient Event event;
    private boolean m_invertCondition;
    /* access modifiers changed from: private */
    public Plugin m_plugin;
    /* access modifiers changed from: private */
    public PluginInstanceData m_pluginInstanceData;
    private transient Map<String, Plugin> m_pluginMap;
    /* access modifiers changed from: private */
    public transient int m_previousState;
    private transient boolean m_shownToastError;
    private Map<String, String> m_variableMap;

    /* renamed from: com.arlosoft.macrodroid.triggers.LocalePluginTrigger$a */
    class C5682a extends Thread {
        C5682a() {
        }

        public void run() {
            if (LocalePluginTrigger.this.m_plugin.getType() == PluginType.CONDITION) {
                LocalePluginTrigger localePluginTrigger = LocalePluginTrigger.this;
                Condition unused = localePluginTrigger.condition = new Condition(localePluginTrigger.mo27827K0(), LocalePluginTrigger.this.m_plugin);
                LocalePluginTrigger.this.condition.query(LocalePluginTrigger.this.m_pluginInstanceData, LocalePluginTrigger.this.m_previousState);
                return;
            }
            LocalePluginTrigger localePluginTrigger2 = LocalePluginTrigger.this;
            Event unused2 = localePluginTrigger2.event = new Event(localePluginTrigger2.mo27827K0(), LocalePluginTrigger.this.m_plugin);
            LocalePluginTrigger.this.event.query(LocalePluginTrigger.this.m_pluginInstanceData, LocalePluginTrigger.this.m_previousState, (Bundle) null);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.LocalePluginTrigger$b */
    class C5683b implements Parcelable.Creator<LocalePluginTrigger> {
        C5683b() {
        }

        /* renamed from: a */
        public LocalePluginTrigger createFromParcel(Parcel parcel) {
            return new LocalePluginTrigger(parcel, (C5682a) null);
        }

        /* renamed from: b */
        public LocalePluginTrigger[] newArray(int i) {
            return new LocalePluginTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.LocalePluginTrigger$c */
    public static class C5684c extends AbstractPluginEditFragment {
        public void handleCancel(@NonNull Plugin plugin) {
            if (getActivity() instanceof C6637e) {
                ((C6637e) getActivity()).mo27140W0();
            }
        }

        public void handleErrors(@NonNull Plugin plugin, @Size(min = 1) @NonNull EnumSet<PluginErrorEdit> enumSet) {
            StringBuilder sb = new StringBuilder();
            Iterator it = enumSet.iterator();
            while (it.hasNext()) {
                sb.append(((PluginErrorEdit) it.next()).getDeveloperExplanation());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            C15626c.m94876a(getActivity().getApplicationContext(), sb.toString(), 1).show();
        }

        public void handleSave(@NonNull Plugin plugin, @NonNull PluginInstanceData pluginInstanceData, @Nullable String[] strArr) {
            if (!(getActivity() instanceof C6637e)) {
                return;
            }
            if (strArr == null || strArr.length <= 0) {
                ((C6637e) getActivity()).mo27137C0(new C10373l(new Pair(plugin, pluginInstanceData), LocalePluginTrigger.s_currentTrigger.mo31278t3(), false));
                return;
            }
            new C10375p().mo41058e(getActivity(), LocalePluginTrigger.s_currentTrigger, strArr, LocalePluginTrigger.s_currentTrigger, new Pair(plugin, pluginInstanceData), LocalePluginTrigger.s_currentTrigger.mo31278t3(), true, false);
        }
    }

    /* synthetic */ LocalePluginTrigger(Parcel parcel, C5682a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m22563A3(C2009f fVar, Activity activity, Map map) {
        fVar.dismiss();
        this.m_pluginMap = map;
        if (map.size() > 0) {
            new C10363h().mo41035a(this, this.m_pluginMap, this);
        } else {
            C15626c.makeText(activity.getApplicationContext(), C17541R$string.action_locale_no_plugins_found, 0).show();
        }
        PluginRegistry.getInstance(mo27827K0()).destroy();
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m22564B3(C2009f fVar, Throwable th) {
        fVar.dismiss();
        PluginRegistry.getInstance(mo27827K0()).destroy();
    }

    /* renamed from: s3 */
    private void m22577s3() {
        View inflate = LayoutInflater.from(mo27850j0()).inflate(C17535R$layout.dialog_invert_condition, (ViewGroup) null);
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) this.m_plugin.getActivityLabel(mo27827K0()));
        CheckBox checkBox = (CheckBox) inflate.findViewById(C17532R$id.invert_condition_checkbox);
        checkBox.setChecked(this.m_invertCondition);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6041p4(this, checkBox));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setView(inflate);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m22578y3(CheckBox checkBox, DialogInterface dialogInterface, int i) {
        this.m_invertCondition = checkBox.isChecked();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m22579z3(C17162h hVar) {
        Map<String, Plugin> pluginMap = PluginRegistry.getInstance(mo27827K0()).getPluginMap(PluginType.CONDITION);
        Map<String, Plugin> pluginMap2 = PluginRegistry.getInstance(mo27827K0()).getPluginMap(PluginType.EVENT);
        HashMap hashMap = new HashMap();
        hashMap.putAll(pluginMap);
        hashMap.putAll(pluginMap2);
        hVar.onNext(hashMap);
        hVar.onCompleted();
    }

    /* renamed from: C3 */
    public void mo31277C3(int i) {
        this.m_previousState = i;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        Plugin plugin = this.m_plugin;
        if (plugin != null) {
            try {
                return plugin.getActivityLabel(mo27827K0());
            } catch (Exception unused) {
            }
        }
        return super.mo24738G0();
    }

    /* renamed from: N0 */
    public String mo24938N0() {
        if (this.m_plugin == null) {
            return null;
        }
        try {
            mo27827K0().getPackageManager().getPackageInfo(this.m_plugin.getPackageName(), 128);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            if (this.m_plugin.getPackageName() == null) {
                return null;
            }
            return String.format(SelectableItem.m15535j1(C17541R$string.requires_application), new Object[]{this.m_plugin.getPackageName()});
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        PluginInstanceData pluginInstanceData;
        if (this.m_plugin == null || (pluginInstanceData = this.m_pluginInstanceData) == null) {
            return "";
        }
        try {
            return pluginInstanceData.getBlurb();
        } catch (Exception unused) {
            if (!this.m_shownToastError) {
                Context applicationContext = mo27827K0().getApplicationContext();
                C15626c.m94876a(applicationContext, SelectableItem.m15535j1(C17541R$string.problem_with) + " " + SelectableItem.m15535j1(C17541R$string.action_locale_plugin) + " " + SelectableItem.m15535j1(C17541R$string.please_delete_and_recreate), 1).show();
                this.m_shownToastError = true;
            }
            return SelectableItem.m15535j1(C17541R$string.please_delete_and_recreate);
        }
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        s_triggerCounter--;
        Condition condition2 = this.condition;
        if (condition2 != null) {
            condition2.destroy();
            this.condition = null;
        }
        Event event2 = this.event;
        if (event2 != null) {
            event2.destroy();
            this.event = null;
        }
        if (s_triggerCounter == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_localePluginTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_localePluginTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7552s0.m31433u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_localePluginTriggerReceiver = new LocalePluginTriggerReceiver();
            MacroDroidApplication.m14845u().registerReceiver(s_localePluginTriggerReceiver, new IntentFilter("com.twofortyfouram.locale.intent.action.REQUEST_QUERY"));
        }
        s_triggerCounter++;
        new C5682a().start();
    }

    /* renamed from: c */
    public void mo24443c(@NonNull String str, @NonNull String str2) {
        String str3;
        Iterator<String> it = this.m_variableMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            str3 = it.next();
            if (this.m_variableMap.get(str3).equals(str)) {
                break;
            }
        }
        if (str3 != null) {
            this.m_variableMap.put(str3, str2);
        }
    }

    /* renamed from: j */
    public List<MacroDroidVariable> mo24437j() {
        ArrayList arrayList = new ArrayList();
        for (String q : this.m_variableMap.values()) {
            MacroDroidVariable q2 = mo27861q(q);
            if (q2 != null) {
                arrayList.add(q2);
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: p */
    public Map<String, String> mo25306p() {
        return this.m_variableMap;
    }

    /* renamed from: s1 */
    public void mo25307s1(Object obj) {
        C10373l lVar = (C10373l) obj;
        this.m_plugin = (Plugin) lVar.mo41052c().first;
        this.m_pluginInstanceData = (PluginInstanceData) lVar.mo41052c().second;
        this.arrayHandlingOption = lVar.mo41050a().mo41023e();
        if (this.m_plugin.getType() == PluginType.CONDITION) {
            m22577s3();
        } else {
            mo24689O1();
        }
    }

    /* renamed from: t */
    public void mo25308t(Plugin plugin) {
        Activity j0 = mo27850j0();
        ((ViewGroup) j0.findViewById(C17532R$id.content_overlay)).setVisibility(0);
        s_currentTrigger = this;
        C5684c cVar = new C5684c();
        try {
            cVar.setArguments(AbstractPluginEditFragment.newArgs(plugin, this.m_pluginInstanceData));
            j0.getFragmentManager().beginTransaction().add(C17532R$id.content_overlay, cVar).commit();
        } catch (Exception unused) {
            Context applicationContext = mo27827K0().getApplicationContext();
            C15626c.m94876a(applicationContext, SelectableItem.m15535j1(C17541R$string.problem_with) + " " + SelectableItem.m15535j1(C17541R$string.action_locale_plugin) + " " + SelectableItem.m15535j1(C17541R$string.please_delete_and_recreate), 1).show();
        }
        this.m_previousState = 18;
    }

    /* renamed from: t3 */
    public C10357b mo31278t3() {
        return C10357b.m40659d(this.arrayHandlingOption);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Plugin plugin = this.m_plugin;
        if (plugin == null || this.m_pluginInstanceData == null) {
            Activity j0 = mo27850j0();
            C2009f s = new C2009f.C2014d(j0).mo24100t(C17541R$string.please_wait).mo24085e(C17541R$string.getting_list_of_apps).mo24098r(true, 0).mo24084c(false).mo24099s();
            C17164a.m100658a(j0, C17153c.m100630a(new C6053q4(this))).mo80436l(C17220a.m100795c()).mo80430e(C17171a.m100674a()).mo80435k(new C6086s4(this, s, j0), new C6065r4(this, s));
            return;
        }
        mo25308t(plugin);
    }

    /* renamed from: u3 */
    public Plugin mo31279u3() {
        return this.m_plugin;
    }

    /* renamed from: v3 */
    public PluginInstanceData mo31280v3() {
        return this.m_pluginInstanceData;
    }

    /* renamed from: w3 */
    public int mo31281w3() {
        return this.m_previousState;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        try {
            parcel.writeParcelable(this.m_plugin, i);
            parcel.writeParcelable(this.m_pluginInstanceData, i);
            parcel.writeInt(this.m_invertCondition ? 1 : 0);
            parcel.writeMap(this.m_variableMap);
            parcel.writeInt(this.arrayHandlingOption);
        } catch (Exception unused) {
            Context applicationContext = mo27827K0().getApplicationContext();
            C15626c.m94876a(applicationContext, SelectableItem.m15535j1(C17541R$string.problem_with) + " " + mo27837X0().getName() + ":" + SelectableItem.m15535j1(C17541R$string.action_locale_plugin) + " " + SelectableItem.m15535j1(C17541R$string.please_delete_and_recreate), 1).show();
        }
    }

    /* renamed from: x1 */
    public void mo25283x1() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.m_plugin.getPackageName()));
            intent.addFlags(268435456);
            mo27827K0().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + this.m_plugin.getPackageName()));
            intent2.addFlags(268435456);
            mo27827K0().startActivity(intent2);
        }
    }

    /* renamed from: x3 */
    public boolean mo31282x3() {
        return this.m_invertCondition;
    }

    public LocalePluginTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private LocalePluginTrigger() {
        this.arrayHandlingOption = C10357b.FIRST_ELEMENT.mo41023e();
        this.m_shownToastError = false;
        this.m_previousState = 18;
        this.m_variableMap = new HashMap();
    }

    private LocalePluginTrigger(Parcel parcel) {
        super(parcel);
        this.arrayHandlingOption = C10357b.FIRST_ELEMENT.mo41023e();
        boolean z = false;
        this.m_shownToastError = false;
        this.m_previousState = 18;
        this.m_variableMap = new HashMap();
        this.m_plugin = (Plugin) parcel.readParcelable(Plugin.class.getClassLoader());
        this.m_pluginInstanceData = (PluginInstanceData) parcel.readParcelable(PluginInstanceData.class.getClassLoader());
        this.m_invertCondition = parcel.readInt() != 0 ? true : z;
        HashMap hashMap = new HashMap();
        this.m_variableMap = hashMap;
        parcel.readMap(hashMap, String.class.getClassLoader());
        this.arrayHandlingOption = parcel.readInt();
    }
}
