package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.appcompat.app.AlertDialog;
import androidx.core.util.Pair;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.widget.C6637e;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import com.twofortyfouram.locale.sdk.host.api.PluginRegistry;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginErrorEdit;
import com.twofortyfouram.locale.sdk.host.model.PluginInstanceData;
import com.twofortyfouram.locale.sdk.host.model.PluginType;
import com.twofortyfouram.locale.sdk.host.p235ui.fragment.AbstractPluginEditFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.apache.commons.p353io.IOUtils;
import p037m.C2009f;
import p057a2.C2212a;
import p057a2.C2222k;
import p057a2.C2226o;
import p128m0.C7875x1;
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

public class LocalePluginAction extends Action implements C2212a, C10374m, C10360d, C2222k, C2226o {
    public static final Parcelable.Creator<LocalePluginAction> CREATOR = new C2521b();
    /* access modifiers changed from: private */
    public static LocalePluginAction s_currentAction;
    private int arrayHandlingOption;
    /* access modifiers changed from: private */
    public boolean blockActions;
    private transient TriggerContextInfo contextInfo;
    private transient boolean forceEvenIfNotEnabled;
    private transient boolean isTest;
    private Plugin m_plugin;
    private PluginInstanceData m_pluginInstanceData;
    private transient List<Plugin> m_pluginList;
    private transient Map<String, Plugin> m_pluginMap;
    private transient int m_selectedIndex;
    private transient boolean m_shownToastError;
    private Map<String, String> m_variableMap;
    private transient int nextAction;
    private transient ResumeMacroInfo resumeMacroInfo;
    private transient Stack<Integer> skipEndifIndexStack;

    /* renamed from: com.arlosoft.macrodroid.action.LocalePluginAction$a */
    class C2520a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TriggerContextInfo f7344a;

        /* renamed from: c */
        final /* synthetic */ int f7345c;

        /* renamed from: d */
        final /* synthetic */ boolean f7346d;

        /* renamed from: f */
        final /* synthetic */ Stack f7347f;

        /* renamed from: g */
        final /* synthetic */ ResumeMacroInfo f7348g;

        /* renamed from: o */
        final /* synthetic */ boolean f7349o;

        C2520a(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
            this.f7344a = triggerContextInfo;
            this.f7345c = i;
            this.f7346d = z;
            this.f7347f = stack;
            this.f7348g = resumeMacroInfo;
            this.f7349o = z2;
        }

        public void run() {
            LocalePluginAction.this.m11267H3(this.f7344a, this.f7345c, this.f7346d, this.f7347f, this.f7348g, this.f7349o);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.LocalePluginAction$b */
    class C2521b implements Parcelable.Creator<LocalePluginAction> {
        C2521b() {
        }

        /* renamed from: a */
        public LocalePluginAction createFromParcel(Parcel parcel) {
            return new LocalePluginAction(parcel, (C2520a) null);
        }

        /* renamed from: b */
        public LocalePluginAction[] newArray(int i) {
            return new LocalePluginAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.LocalePluginAction$c */
    public static class C2522c extends AbstractPluginEditFragment {
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
                if (LocalePluginAction.s_currentAction != null) {
                    ((C6637e) getActivity()).mo27137C0(new C10373l(new Pair(plugin, pluginInstanceData), LocalePluginAction.s_currentAction.mo25309v3(), false));
                    return;
                }
                C4878b.m18868g("Could not save tasker plugin configuration (the current action is null).");
            } else if (LocalePluginAction.s_currentAction != null) {
                new C10375p().mo41058e(getActivity(), LocalePluginAction.s_currentAction, strArr, LocalePluginAction.s_currentAction, new Pair(plugin, pluginInstanceData), LocalePluginAction.s_currentAction.mo25309v3(), false, LocalePluginAction.s_currentAction.blockActions);
            } else {
                C4878b.m18868g("Could not save tasker plugin configuration (the current action is null).");
            }
        }
    }

    /* synthetic */ LocalePluginAction(Parcel parcel, C2520a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ int m11261A3(Plugin plugin, Plugin plugin2) {
        return plugin.getActivityLabel(mo27827K0()).toLowerCase().compareTo(plugin2.getActivityLabel(mo27827K0()).toLowerCase());
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m11262B3(C17162h hVar) {
        hVar.onNext(PluginRegistry.getInstance(mo27827K0()).getPluginMap(PluginType.SETTING));
        hVar.onCompleted();
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m11263C3(C2009f fVar, Activity activity, Map map) {
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
    /* renamed from: D3 */
    public /* synthetic */ void m11264D3(C2009f fVar, Throwable th) {
        fVar.dismiss();
        PluginRegistry.getInstance(mo27827K0()).destroy();
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m11265E3(int i, TriggerContextInfo triggerContextInfo, boolean z, Stack stack, ResumeMacroInfo resumeMacroInfo2) {
        mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo2);
    }

    /* renamed from: F3 */
    private String m11266F3(String str, Macro macro) {
        if (macro != null) {
            for (MacroDroidVariable next : macro.getLocalVariables()) {
                str = str.replace(TaskerPlugin.VARIABLE_PREFIX + next.getName(), next.toString());
            }
        }
        for (MacroDroidVariable next2 : C4064u.m16048t().mo27993r(true)) {
            str = str.replace(TaskerPlugin.VARIABLE_PREFIX + next2.getName(), next2.toString());
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0120, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r0 = mo27827K0().getApplicationContext();
        p319lc.C15626c.m94876a(r0, com.arlosoft.macrodroid.common.SelectableItem.m15535j1(com.arlosoft.macrodroid.C17541R$string.problem_with) + " " + mo27837X0().getName() + ":" + com.arlosoft.macrodroid.common.SelectableItem.m15535j1(com.arlosoft.macrodroid.C17541R$string.action_locale_plugin) + " " + com.arlosoft.macrodroid.common.SelectableItem.m15535j1(com.arlosoft.macrodroid.C17541R$string.please_delete_and_recreate), 1).show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0173, code lost:
        r10.destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0176, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0122 */
    /* renamed from: H3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m11267H3(@androidx.annotation.Nullable com.arlosoft.macrodroid.triggers.TriggerContextInfo r18, int r19, boolean r20, @androidx.annotation.NonNull java.util.Stack<java.lang.Integer> r21, @androidx.annotation.Nullable com.arlosoft.macrodroid.data.ResumeMacroInfo r22, boolean r23) {
        /*
            r17 = this;
            r8 = r17
            r4 = r18
            r1 = r23
            java.lang.String r9 = " "
            r8.contextInfo = r4
            r3 = r19
            r8.nextAction = r3
            r5 = r20
            r8.forceEvenIfNotEnabled = r5
            r6 = r21
            r8.skipEndifIndexStack = r6
            r7 = r22
            r8.resumeMacroInfo = r7
            r8.isTest = r1
            com.twofortyfouram.locale.sdk.host.api.Setting r10 = new com.twofortyfouram.locale.sdk.host.api.Setting
            android.content.Context r0 = r17.mo27827K0()
            com.twofortyfouram.locale.sdk.host.model.Plugin r2 = r8.m_plugin
            r10.<init>(r0, r2)
            com.twofortyfouram.locale.sdk.host.model.PluginInstanceData r0 = r8.m_pluginInstanceData     // Catch:{ Exception -> 0x0122 }
            byte[] r2 = r0.getSerializedBundle()     // Catch:{ Exception -> 0x0122 }
            android.os.Bundle r0 = com.twofortyfouram.locale.sdk.host.internal.BundleSerializer.deserializeFromByteArray(r2)     // Catch:{ Exception -> 0x00a0 }
            java.util.Set r11 = r0.keySet()     // Catch:{ Exception -> 0x00a0 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x00a0 }
        L_0x0039:
            boolean r12 = r11.hasNext()     // Catch:{ Exception -> 0x00a0 }
            if (r12 == 0) goto L_0x0097
            java.lang.Object r12 = r11.next()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x00a0 }
            java.lang.Object r13 = r0.get(r12)     // Catch:{ Exception -> 0x00a0 }
            boolean r14 = r13 instanceof java.lang.String     // Catch:{ Exception -> 0x00a0 }
            if (r14 == 0) goto L_0x0067
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x00a0 }
            com.arlosoft.macrodroid.macro.Macro r14 = r17.mo27837X0()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r13 = r8.m11266F3(r13, r14)     // Catch:{ Exception -> 0x00a0 }
            android.content.Context r14 = r17.mo27827K0()     // Catch:{ Exception -> 0x00a0 }
            com.arlosoft.macrodroid.macro.Macro r15 = r17.mo27837X0()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r13 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r14, r13, r4, r15)     // Catch:{ Exception -> 0x00a0 }
            r0.putString(r12, r13)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x0090
        L_0x0067:
            boolean r14 = r13 instanceof java.lang.String[]     // Catch:{ Exception -> 0x00a0 }
            if (r14 == 0) goto L_0x0090
            java.lang.String[] r13 = (java.lang.String[]) r13     // Catch:{ Exception -> 0x00a0 }
            r14 = 0
        L_0x006e:
            int r15 = r13.length     // Catch:{ Exception -> 0x00a0 }
            if (r14 >= r15) goto L_0x008a
            android.content.Context r15 = r17.mo27827K0()     // Catch:{ Exception -> 0x00a0 }
            r16 = r2
            r2 = r13[r14]     // Catch:{ Exception -> 0x009e }
            com.arlosoft.macrodroid.macro.Macro r3 = r17.mo27837X0()     // Catch:{ Exception -> 0x009e }
            java.lang.String r2 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r15, r2, r4, r3)     // Catch:{ Exception -> 0x009e }
            r13[r14] = r2     // Catch:{ Exception -> 0x009e }
            int r14 = r14 + 1
            r3 = r19
            r2 = r16
            goto L_0x006e
        L_0x008a:
            r16 = r2
            r0.putStringArray(r12, r13)     // Catch:{ Exception -> 0x009e }
            goto L_0x0092
        L_0x0090:
            r16 = r2
        L_0x0092:
            r3 = r19
            r2 = r16
            goto L_0x0039
        L_0x0097:
            r16 = r2
            byte[] r2 = com.twofortyfouram.locale.sdk.host.internal.BundleSerializer.serializeToByteArray(r0)     // Catch:{ Exception -> 0x009e }
            goto L_0x00c5
        L_0x009e:
            r0 = move-exception
            goto L_0x00a3
        L_0x00a0:
            r0 = move-exception
            r16 = r2
        L_0x00a3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0122 }
            r2.<init>()     // Catch:{ Exception -> 0x0122 }
            java.lang.String r3 = "Magic text replacement failed: "
            r2.append(r3)     // Catch:{ Exception -> 0x0122 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0122 }
            r2.append(r0)     // Catch:{ Exception -> 0x0122 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0122 }
            java.lang.Long r2 = r17.mo27840Y0()     // Catch:{ Exception -> 0x0122 }
            long r2 = r2.longValue()     // Catch:{ Exception -> 0x0122 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r0, r2)     // Catch:{ Exception -> 0x0122 }
            r2 = r16
        L_0x00c5:
            com.twofortyfouram.locale.sdk.host.model.PluginInstanceData r0 = new com.twofortyfouram.locale.sdk.host.model.PluginInstanceData     // Catch:{ Exception -> 0x0122 }
            com.twofortyfouram.locale.sdk.host.model.PluginInstanceData r3 = r8.m_pluginInstanceData     // Catch:{ Exception -> 0x0122 }
            com.twofortyfouram.locale.sdk.host.model.PluginType r3 = r3.getType()     // Catch:{ Exception -> 0x0122 }
            com.twofortyfouram.locale.sdk.host.model.PluginInstanceData r11 = r8.m_pluginInstanceData     // Catch:{ Exception -> 0x0122 }
            java.lang.String r11 = r11.getRegistryName()     // Catch:{ Exception -> 0x0122 }
            com.twofortyfouram.locale.sdk.host.model.PluginInstanceData r12 = r8.m_pluginInstanceData     // Catch:{ Exception -> 0x0122 }
            java.lang.String r12 = r12.getBlurb()     // Catch:{ Exception -> 0x0122 }
            r0.<init>(r3, r11, r2, r12)     // Catch:{ Exception -> 0x0122 }
            android.content.Intent r11 = new android.content.Intent     // Catch:{ Exception -> 0x0122 }
            java.lang.String r2 = "com.arlosoft.macrodroid.SETTING_COMPLETE"
            java.lang.String r3 = "http://www.macrodroid.com"
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0122 }
            android.content.Context r12 = r17.mo27827K0()     // Catch:{ Exception -> 0x0122 }
            java.lang.Class<com.arlosoft.macrodroid.action.receivers.LocaleTaskerSettingCompleteReceiver> r13 = com.arlosoft.macrodroid.action.receivers.LocaleTaskerSettingCompleteReceiver.class
            r11.<init>(r2, r3, r12, r13)     // Catch:{ Exception -> 0x0122 }
            java.lang.String r2 = "action_id"
            long r12 = r17.mo27847f1()     // Catch:{ Exception -> 0x0122 }
            r11.putExtra(r2, r12)     // Catch:{ Exception -> 0x0122 }
            boolean r2 = r8.blockActions     // Catch:{ Exception -> 0x0122 }
            if (r2 != 0) goto L_0x011c
            if (r1 != 0) goto L_0x011c
            android.os.Handler r12 = new android.os.Handler     // Catch:{ Exception -> 0x0122 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0122 }
            r12.<init>(r1)     // Catch:{ Exception -> 0x0122 }
            com.arlosoft.macrodroid.action.n8 r13 = new com.arlosoft.macrodroid.action.n8     // Catch:{ Exception -> 0x0122 }
            r1 = r13
            r2 = r17
            r3 = r19
            r4 = r18
            r5 = r20
            r6 = r21
            r7 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0122 }
            r12.post(r13)     // Catch:{ Exception -> 0x0122 }
        L_0x011c:
            r10.fire((com.twofortyfouram.locale.sdk.host.model.PluginInstanceData) r0, (android.content.Intent) r11)     // Catch:{ Exception -> 0x0122 }
            goto L_0x016f
        L_0x0120:
            r0 = move-exception
            goto L_0x0173
        L_0x0122:
            android.content.Context r0 = r17.mo27827K0()     // Catch:{ all -> 0x0120 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x0120 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0120 }
            r1.<init>()     // Catch:{ all -> 0x0120 }
            r2 = 2131954645(0x7f130bd5, float:1.9545795E38)
            java.lang.String r2 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r2)     // Catch:{ all -> 0x0120 }
            r1.append(r2)     // Catch:{ all -> 0x0120 }
            r1.append(r9)     // Catch:{ all -> 0x0120 }
            com.arlosoft.macrodroid.macro.Macro r2 = r17.mo27837X0()     // Catch:{ all -> 0x0120 }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x0120 }
            r1.append(r2)     // Catch:{ all -> 0x0120 }
            java.lang.String r2 = ":"
            r1.append(r2)     // Catch:{ all -> 0x0120 }
            r2 = 2131951972(0x7f130164, float:1.9540374E38)
            java.lang.String r2 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r2)     // Catch:{ all -> 0x0120 }
            r1.append(r2)     // Catch:{ all -> 0x0120 }
            r1.append(r9)     // Catch:{ all -> 0x0120 }
            r2 = 2131954584(0x7f130b98, float:1.9545671E38)
            java.lang.String r2 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r2)     // Catch:{ all -> 0x0120 }
            r1.append(r2)     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0120 }
            r2 = 1
            lc.c r0 = p319lc.C15626c.m94876a(r0, r1, r2)     // Catch:{ all -> 0x0120 }
            r0.show()     // Catch:{ all -> 0x0120 }
        L_0x016f:
            r10.destroy()
            return
        L_0x0173:
            r10.destroy()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.LocalePluginAction.m11267H3(com.arlosoft.macrodroid.triggers.TriggerContextInfo, int, boolean, java.util.Stack, com.arlosoft.macrodroid.data.ResumeMacroInfo, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m11280w3(DialogInterface dialogInterface, int i) {
        mo24679x2(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m11281x3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m11282y3(DialogInterface dialogInterface, int i) {
        mo24677v2();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m11283z3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        try {
            if (this.m_plugin != null) {
                int i = 0;
                for (Plugin next : this.m_pluginList) {
                    if (!next.getPackageName().equals(this.m_plugin.getPackageName()) || !next.getActivityClassName().equals(this.m_plugin.getActivityClassName())) {
                        i++;
                    } else {
                        this.m_selectedIndex = i;
                        return i;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return 0;
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

    /* renamed from: G3 */
    public void mo25305G3() {
        if (this.blockActions && !this.isTest) {
            mo27837X0().invokeActions(mo27837X0().getActions(), this.nextAction, this.contextInfo, this.forceEvenIfNotEnabled, this.skipEndifIndexStack, this.resumeMacroInfo);
        }
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        Plugin plugin = this.m_plugin;
        return (plugin == null || plugin.getPackageName() == null) ? false : true;
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

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7875x1.m32946u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        if (this.m_plugin == null) {
            return mo25559a1();
        }
        try {
            return mo24738G0() + " (" + mo24672O0() + ")";
        } catch (Exception unused) {
            return mo25559a1();
        }
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
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

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        String[] strArr = new String[this.m_pluginMap.size()];
        this.m_pluginList = new ArrayList();
        for (String str : this.m_pluginMap.keySet()) {
            this.m_pluginList.add(this.m_pluginMap.get(str));
        }
        Collections.sort(this.m_pluginList, new C3305o8(this));
        int i = 0;
        for (Plugin activityLabel : this.m_pluginList) {
            strArr[i] = activityLabel.getActivityLabel(mo27827K0());
            i++;
        }
        return strArr;
    }

    /* renamed from: h */
    public void mo24421h(@Nullable TriggerContextInfo triggerContextInfo, int i, boolean z, @NonNull Stack<Integer> stack, @Nullable ResumeMacroInfo resumeMacroInfo2, boolean z2) {
        new Thread(new C2520a(triggerContextInfo, i, z, stack, resumeMacroInfo2, z2)).start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public AlertDialog mo24883h0() {
        Activity j0 = mo27850j0();
        String[] g1 = mo24676g1();
        AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) g1, mo24671D0(), (DialogInterface.OnClickListener) new C3193k8(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3165j8(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3221l8(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C3137i8(this));
        if (g1.length > 50) {
            ListView listView = create.getListView();
            listView.setFastScrollEnabled(true);
            listView.setPadding(0, 0, mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.fast_scroll_padding), 0);
            listView.setScrollBarStyle(33554432);
        }
        return create;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return SelectableItem.m15535j1(C17541R$string.select_plugin);
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
        this.blockActions = lVar.mo41051b();
        mo24689O1();
    }

    /* renamed from: t */
    public void mo25308t(Plugin plugin) {
        Activity j0 = mo27850j0();
        ((ViewGroup) j0.findViewById(C17532R$id.content_overlay)).setVisibility(0);
        s_currentAction = this;
        C2522c cVar = new C2522c();
        try {
            cVar.setArguments(AbstractPluginEditFragment.newArgs(plugin, this.m_pluginInstanceData));
            j0.getFragmentManager().beginTransaction().add(C17532R$id.content_overlay, cVar).commit();
        } catch (Exception unused) {
            Context applicationContext = mo27827K0().getApplicationContext();
            C15626c.m94876a(applicationContext, SelectableItem.m15535j1(C17541R$string.problem_with) + " " + SelectableItem.m15535j1(C17541R$string.action_locale_plugin) + " " + SelectableItem.m15535j1(C17541R$string.please_delete_and_recreate), 1).show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Plugin plugin = this.m_plugin;
        if (plugin == null || this.m_pluginInstanceData == null) {
            Activity j0 = mo27850j0();
            C2009f s = new C2009f.C2014d(j0).mo24100t(C17541R$string.please_wait).mo24085e(C17541R$string.getting_list_of_apps).mo24098r(true, 0).mo24084c(false).mo24099s();
            C17164a.m100658a(j0, C17153c.m100630a(new C3249m8(this))).mo80436l(C17220a.m100795c()).mo80430e(C17171a.m100674a()).mo80435k(new C3363q8(this, s, j0), new C3335p8(this, s));
            return;
        }
        mo25308t(plugin);
    }

    /* renamed from: v3 */
    public C10357b mo25309v3() {
        return C10357b.m40659d(this.arrayHandlingOption);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        try {
            parcel.writeParcelable(this.m_plugin, i);
            parcel.writeParcelable(this.m_pluginInstanceData, i);
            parcel.writeMap(this.m_variableMap);
            parcel.writeInt(this.arrayHandlingOption);
            parcel.writeInt(this.blockActions ? 1 : 0);
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

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_selectedIndex = i;
    }

    public LocalePluginAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private LocalePluginAction() {
        this.arrayHandlingOption = C10357b.FIRST_ELEMENT.mo41023e();
        this.m_selectedIndex = 0;
        this.m_shownToastError = false;
        this.m_variableMap = new HashMap();
    }

    private LocalePluginAction(Parcel parcel) {
        super(parcel);
        this.arrayHandlingOption = C10357b.FIRST_ELEMENT.mo41023e();
        boolean z = false;
        this.m_selectedIndex = 0;
        this.m_shownToastError = false;
        this.m_variableMap = new HashMap();
        this.m_plugin = (Plugin) parcel.readParcelable(Plugin.class.getClassLoader());
        this.m_pluginInstanceData = (PluginInstanceData) parcel.readParcelable(PluginInstanceData.class.getClassLoader());
        HashMap hashMap = new HashMap();
        this.m_variableMap = hashMap;
        parcel.readMap(hashMap, String.class.getClassLoader());
        this.arrayHandlingOption = parcel.readInt();
        this.blockActions = parcel.readInt() != 0 ? true : z;
    }
}
