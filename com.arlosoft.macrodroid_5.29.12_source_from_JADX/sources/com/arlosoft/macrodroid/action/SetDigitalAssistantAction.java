package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4013g;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p128m0.C7781k3;

/* compiled from: SetDigitalAssistantAction.kt */
public final class SetDigitalAssistantAction extends Action {
    public static final Parcelable.Creator<SetDigitalAssistantAction> CREATOR = new C2633a();

    /* renamed from: d */
    public static final C2634b f7509d = new C2634b((C13695i) null);
    private transient ArrayList<C4013g> appInfoList;
    private String assistantName;
    private String assistantPackageAndService;
    private transient int selectedIndex;

    /* renamed from: com.arlosoft.macrodroid.action.SetDigitalAssistantAction$a */
    /* compiled from: SetDigitalAssistantAction.kt */
    public static final class C2633a implements Parcelable.Creator<SetDigitalAssistantAction> {
        C2633a() {
        }

        /* renamed from: a */
        public SetDigitalAssistantAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new SetDigitalAssistantAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public SetDigitalAssistantAction[] newArray(int i) {
            return new SetDigitalAssistantAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetDigitalAssistantAction$b */
    /* compiled from: SetDigitalAssistantAction.kt */
    public static final class C2634b {
        private C2634b() {
        }

        public /* synthetic */ C2634b(C13695i iVar) {
            this();
        }
    }

    public SetDigitalAssistantAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ SetDigitalAssistantAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m12390k3(SetDigitalAssistantAction setDigitalAssistantAction, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(setDigitalAssistantAction, "this$0");
        super.mo24714u1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        Iterator<C4013g> it = this.appInfoList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C13706o.m87924a(it.next().f10397b, this.assistantPackageAndService)) {
                break;
            } else {
                i++;
            }
        }
        int b = C16792h.m99540b(i, 0);
        this.selectedIndex = b;
        return b;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = this.assistantName;
        return str == null ? "" : str;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7781k3.f18789l.mo37759a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo r6) {
        /*
            r5 = this;
            r6 = 1
            r0 = 0
            android.content.Context r1 = r5.mo27827K0()     // Catch:{ Exception -> 0x0027 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ Exception -> 0x0027 }
            java.lang.String r2 = "assistant"
            java.lang.String r3 = r5.assistantPackageAndService     // Catch:{ Exception -> 0x0027 }
            boolean r1 = android.provider.Settings.Secure.putString(r1, r2, r3)     // Catch:{ Exception -> 0x0027 }
            if (r1 == 0) goto L_0x0049
            android.content.Context r2 = r5.mo27827K0()     // Catch:{ Exception -> 0x0025 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x0025 }
            java.lang.String r3 = "voice_interaction_service"
            java.lang.String r4 = r5.assistantPackageAndService     // Catch:{ Exception -> 0x0025 }
            boolean r6 = android.provider.Settings.Secure.putString(r2, r3, r4)     // Catch:{ Exception -> 0x0025 }
            goto L_0x004a
        L_0x0025:
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            boolean r2 = p150q2.C8164a.m33886a()
            if (r2 == 0) goto L_0x0049
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "settings put secure enabled_accessibility_services "
            r2.append(r3)
            java.lang.String r3 = r5.assistantPackageAndService
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1[r0] = r2
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r1)
            goto L_0x004a
        L_0x0049:
            r6 = r1
        L_0x004a:
            if (r6 != 0) goto L_0x005e
            java.lang.Long r6 = r5.mo27840Y0()
            java.lang.String r0 = "macroGuid"
            kotlin.jvm.internal.C13706o.m87928e(r6, r0)
            long r0 = r6.longValue()
            java.lang.String r6 = "Could not set digital assistant, you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r6, r0)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.SetDigitalAssistantAction.mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        Intent intent = new Intent();
        intent.setAction("android.service.voice.VoiceInteractionService");
        List<ResolveInfo> queryIntentServices = mo27827K0().getPackageManager().queryIntentServices(intent, 0);
        C13706o.m87928e(queryIntentServices, "context.packageManager.q…ntServices(sendIntent, 0)");
        this.appInfoList.clear();
        C4013g gVar = new C4013g();
        gVar.f10396a = mo27827K0().getString(C17541R$string.none);
        gVar.f10397b = "";
        this.appInfoList.add(gVar);
        for (ResolveInfo next : queryIntentServices) {
            C4013g gVar2 = new C4013g();
            String str = next.serviceInfo.name;
            gVar2.f10397b = next.serviceInfo.packageName + '/' + next.serviceInfo.name;
            gVar2.f10396a = next.serviceInfo.applicationInfo.loadLabel(mo27827K0().getPackageManager()).toString();
            this.appInfoList.add(gVar2);
        }
        ArrayList<C4013g> arrayList = this.appInfoList;
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(arrayList, 10));
        for (C4013g gVar3 : arrayList) {
            arrayList2.add(gVar3.f10396a);
        }
        Object[] array = arrayList2.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo25559a1());
        builder.setMessage((CharSequence) mo25557Q0());
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3343pg(this));
        builder.show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        this.assistantName = this.appInfoList.get(this.selectedIndex).f10396a;
        this.assistantPackageAndService = this.appInfoList.get(this.selectedIndex).f10397b;
        mo24689O1();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.assistantName);
        parcel.writeString(this.assistantPackageAndService);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.selectedIndex = i;
    }

    public SetDigitalAssistantAction() {
        this.appInfoList = new ArrayList<>();
    }

    private SetDigitalAssistantAction(Parcel parcel) {
        super(parcel);
        this.appInfoList = new ArrayList<>();
        this.assistantName = parcel.readString();
        this.assistantPackageAndService = parcel.readString();
    }
}
