package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.AudioManager;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ListView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SearchView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4013g;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p128m0.C7721d0;
import p187x0.C10351d;

public class ControlMediaAction extends Action {
    private static final String ANY_APP = ("<" + SelectableItem.m15535j1(C17541R$string.action_control_media_attempt_foreground_app) + ">");
    private static final String ANY_PACKAGE = "any.package";
    public static final Parcelable.Creator<ControlMediaAction> CREATOR = new C2391c();
    private static final String DEFAULT_MEDIA_PLAYER = MacroDroidApplication.m14845u().getString(C17541R$string.action_control_media_default_media_player);
    private static final int OPTION_NEXT = 2;
    private static final int OPTION_PAUSE = 4;
    private static final int OPTION_PLAY = 3;
    private static final int OPTION_PLAY_PAUSE = 0;
    private static final int OPTION_PREVIOUS = 1;
    private static final int OPTION_STOP = 5;
    private static final String SIMULATE_AUDIO_BUTTON = MacroDroidApplication.m14845u().getString(C17541R$string.action_control_media_send_media_player_commands);
    private static final String SIMULATE_MEDIA_BUTTON = MacroDroidApplication.m14845u().getString(C17541R$string.action_control_media_simulate_media_button);
    private String m_applicationName;
    private String m_option;
    private String m_packageName;
    private boolean m_sendMediaPlayerCommands;
    private boolean m_simulateMediaButton;
    private int optionInt;

    /* renamed from: com.arlosoft.macrodroid.action.ControlMediaAction$a */
    class C2389a implements DialogInterface.OnClickListener {
        C2389a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ControlMediaAction.this.mo24689O1();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ControlMediaAction$b */
    class C2390b implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C10351d f7206a;

        C2390b(C10351d dVar) {
            this.f7206a = dVar;
        }

        public boolean onQueryTextChange(String str) {
            this.f7206a.getFilter().mo41019a(str, false);
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ControlMediaAction$c */
    class C2391c implements Parcelable.Creator<ControlMediaAction> {
        C2391c() {
        }

        /* renamed from: a */
        public ControlMediaAction createFromParcel(Parcel parcel) {
            return new ControlMediaAction(parcel, (C2389a) null);
        }

        /* renamed from: b */
        public ControlMediaAction[] newArray(int i) {
            return new ControlMediaAction[i];
        }
    }

    /* synthetic */ ControlMediaAction(Parcel parcel, C2389a aVar) {
        this(parcel);
    }

    /* renamed from: l3 */
    private static C3542vd[] m10314l3() {
        return new C3542vd[]{new C3542vd(m10318q3(), 3), new C3542vd(m10317p3(), 4), new C3542vd(m10320s3(), 1), new C3542vd(m10316o3(), 2), new C3542vd(m10321t3(), 5)};
    }

    /* renamed from: n3 */
    private static C3542vd[] m10315n3() {
        return new C3542vd[]{new C3542vd(m10319r3(), 0), new C3542vd(m10320s3(), 1), new C3542vd(m10316o3(), 2), new C3542vd(m10318q3(), 3), new C3542vd(m10317p3(), 4), new C3542vd(m10321t3(), 5)};
    }

    /* renamed from: o3 */
    private static final String m10316o3() {
        return MacroDroidApplication.m14845u().getString(C17541R$string.action_control_media_next);
    }

    /* renamed from: p3 */
    private static final String m10317p3() {
        return MacroDroidApplication.m14845u().getString(C17541R$string.action_control_media_pause);
    }

    /* renamed from: q3 */
    private static final String m10318q3() {
        return MacroDroidApplication.m14845u().getString(C17541R$string.action_control_media_play);
    }

    /* renamed from: r3 */
    private static final String m10319r3() {
        return MacroDroidApplication.m14845u().getString(C17541R$string.action_control_media_play_pause);
    }

    /* renamed from: s3 */
    private static final String m10320s3() {
        return MacroDroidApplication.m14845u().getString(C17541R$string.action_control_media_previous);
    }

    /* renamed from: t3 */
    private static final String m10321t3() {
        return MacroDroidApplication.m14845u().getString(C17541R$string.action_control_media_stop);
    }

    /* renamed from: u3 */
    private static C3542vd[] m10322u3() {
        return new C3542vd[]{new C3542vd(m10319r3(), 0), new C3542vd(m10320s3(), 1), new C3542vd(m10316o3(), 2), new C3542vd(m10318q3(), 3), new C3542vd(m10317p3(), 4), new C3542vd(m10321t3(), 5)};
    }

    /* renamed from: v3 */
    private static String[] m10323v3() {
        return new String[]{SIMULATE_MEDIA_BUTTON, DEFAULT_MEDIA_PLAYER, SIMULATE_AUDIO_BUTTON};
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m10324w3(C3542vd[] vdVarArr, DialogInterface dialogInterface, int i) {
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        this.optionInt = vdVarArr[checkedItemPosition].f9419b;
        this.m_option = vdVarArr[checkedItemPosition].f9418a;
        if (this.m_simulateMediaButton) {
            m10326y3();
            return;
        }
        this.m_applicationName = null;
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m10325x3(AppCompatDialog appCompatDialog, Activity activity, C4013g gVar) {
        mo27827K0().getApplicationContext().getPackageManager();
        if (gVar.f10397b.equals(ANY_PACKAGE)) {
            this.m_applicationName = null;
            this.m_packageName = null;
        } else {
            this.m_applicationName = gVar.f10396a;
            this.m_packageName = gVar.f10397b;
        }
        appCompatDialog.dismiss();
        new AlertDialog.Builder(activity, mo24705l0()).setTitle((int) C17541R$string.action_control_media).setMessage((int) C17541R$string.action_control_media_foreground_app_info).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C2389a()).show();
    }

    /* renamed from: y3 */
    private void m10326y3() {
        Activity j0 = mo27850j0();
        if (j0 != null) {
            PackageManager packageManager = mo27827K0().getPackageManager();
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            ArrayList<ResolveInfo> arrayList = new ArrayList<>();
            arrayList.addAll(queryBroadcastReceivers);
            arrayList.addAll(queryIntentServices);
            Collections.sort(arrayList, new ResolveInfo.DisplayNameComparator(packageManager));
            if (arrayList.isEmpty()) {
                this.m_packageName = null;
                this.m_applicationName = null;
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            C4013g gVar = new C4013g();
            gVar.f10396a = ANY_APP;
            gVar.f10397b = ANY_PACKAGE;
            arrayList2.add(gVar);
            HashSet hashSet = new HashSet();
            for (ResolveInfo resolveInfo : arrayList) {
                C4013g gVar2 = new C4013g();
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    gVar2.f10397b = activityInfo.packageName;
                    gVar2.f10396a = activityInfo.applicationInfo.loadLabel(packageManager).toString();
                } else {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null) {
                        gVar2.f10397b = serviceInfo.packageName;
                        gVar2.f10396a = serviceInfo.applicationInfo.loadLabel(packageManager).toString();
                    }
                }
                gVar2.f10398c = true;
                if (!hashSet.contains(gVar2.f10397b)) {
                    hashSet.add(gVar2.f10397b);
                    arrayList2.add(gVar2);
                }
            }
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_app_chooser);
            appCompatDialog.setTitle((int) C17541R$string.select_application);
            ((ViewGroup) appCompatDialog.findViewById(C17532R$id.button_bar)).setVisibility(8);
            C10351d dVar = new C10351d(j0, arrayList2, (List<Boolean>) null, new C3560w3(this, appCompatDialog, j0));
            ((ListView) appCompatDialog.findViewById(C17532R$id.application_list)).setAdapter(dVar);
            ((SearchView) appCompatDialog.findViewById(C17532R$id.search_view)).setOnQueryTextListener(new C2390b(dVar));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            appCompatDialog.show();
            appCompatDialog.getWindow().setAttributes(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        int i = this.m_sendMediaPlayerCommands ? 2 : this.m_simulateMediaButton ? 0 : 1;
        if (i < m10323v3().length) {
            return i;
        }
        this.m_sendMediaPlayerCommands = false;
        return 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        C3542vd[] vdVarArr;
        if (this.m_sendMediaPlayerCommands) {
            vdVarArr = m10322u3();
        } else if (this.m_simulateMediaButton) {
            vdVarArr = m10315n3();
        } else {
            vdVarArr = m10314l3();
        }
        for (C3542vd vdVar : vdVarArr) {
            if (vdVar.f9419b == this.optionInt) {
                return mo27827K0().getString(C17541R$string.action_control_media_media) + " " + vdVar.f9418a;
            }
        }
        return mo27827K0().getString(C17541R$string.action_control_media_media) + " " + this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str;
        int i = 0;
        int i2 = this.m_sendMediaPlayerCommands ? 2 : this.m_simulateMediaButton ? 0 : 1;
        if (i2 >= m10323v3().length) {
            this.m_sendMediaPlayerCommands = false;
        } else {
            i = i2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m10323v3()[i]);
        if (TextUtils.isEmpty(this.m_applicationName)) {
            str = "";
        } else {
            str = " (" + this.m_applicationName + ")";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7721d0.m32196u();
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012b  */
    /* renamed from: a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo r23) {
        /*
            r22 = this;
            r0 = r22
            long r9 = android.os.SystemClock.uptimeMillis()
            boolean r1 = r0.m_sendMediaPlayerCommands
            r11 = 100
            java.lang.String r2 = "Invalid configuration for Control Media action - please reconfigure the action"
            if (r1 == 0) goto L_0x0048
            android.content.Context r1 = r22.mo27827K0()
            java.lang.String r3 = "audio"
            java.lang.Object r1 = r1.getSystemService(r3)
            r13 = r1
            android.media.AudioManager r13 = (android.media.AudioManager) r13
            r1 = 0
            int r20 = r0.mo24920m3(r1)
            if (r20 >= 0) goto L_0x0026
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r2)
            return
        L_0x0026:
            android.view.KeyEvent r14 = new android.view.KeyEvent
            r6 = 0
            r8 = 0
            r1 = r14
            r2 = r9
            r4 = r9
            r7 = r20
            r1.<init>(r2, r4, r6, r7, r8)
            r13.dispatchMediaKeyEvent(r14)
            android.view.KeyEvent r1 = new android.view.KeyEvent
            long r17 = r9 + r11
            r19 = 1
            r21 = 0
            r14 = r1
            r15 = r17
            r14.<init>(r15, r17, r19, r20, r21)
            r13.dispatchMediaKeyEvent(r1)
            goto L_0x0137
        L_0x0048:
            boolean r1 = r0.m_simulateMediaButton
            r13 = 1
            if (r1 == 0) goto L_0x00b4
            int r20 = r0.mo24920m3(r13)
            if (r20 >= 0) goto L_0x0057
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r2)
            return
        L_0x0057:
            android.content.Intent r14 = new android.content.Intent
            java.lang.String r15 = "android.intent.action.MEDIA_BUTTON"
            r14.<init>(r15)
            java.lang.String r1 = r0.m_packageName
            if (r1 == 0) goto L_0x0065
            r14.setPackage(r1)
        L_0x0065:
            android.view.KeyEvent r8 = new android.view.KeyEvent
            r6 = 0
            r16 = 0
            r1 = r8
            r2 = r9
            r4 = r9
            r7 = r20
            r11 = r8
            r8 = r16
            r1.<init>(r2, r4, r6, r7, r8)
            java.lang.String r1 = "android.intent.extra.KEY_EVENT"
            r14.putExtra(r1, r11)
            java.lang.String r2 = "MediaButtonMacroDroid"
            r14.putExtra(r2, r13)
            r3 = 0
            android.content.Context r4 = r22.mo27827K0()     // Catch:{ Exception -> 0x0088 }
            r4.sendOrderedBroadcast(r14, r3)     // Catch:{ Exception -> 0x0088 }
            goto L_0x0089
        L_0x0088:
        L_0x0089:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r15)
            java.lang.String r5 = r0.m_packageName
            if (r5 == 0) goto L_0x0095
            r4.setPackage(r5)
        L_0x0095:
            android.view.KeyEvent r5 = new android.view.KeyEvent
            r6 = 100
            long r17 = r9 + r6
            r19 = 1
            r21 = 0
            r14 = r5
            r15 = r17
            r14.<init>(r15, r17, r19, r20, r21)
            r4.putExtra(r1, r5)
            r4.putExtra(r2, r13)
            android.content.Context r1 = r22.mo27827K0()     // Catch:{ Exception -> 0x0137 }
            r1.sendOrderedBroadcast(r4, r3)     // Catch:{ Exception -> 0x0137 }
            goto L_0x0137
        L_0x00b4:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "com.android.music.musicservicecommand"
            r1.<init>(r3)
            int r3 = r0.optionInt
            java.lang.String r4 = "stop"
            java.lang.String r5 = "pause"
            java.lang.String r6 = "play"
            java.lang.String r7 = "next"
            java.lang.String r8 = "previous"
            java.lang.String r9 = ""
            if (r3 == r13) goto L_0x0120
            r10 = 2
            if (r3 == r10) goto L_0x011e
            r10 = 3
            if (r3 == r10) goto L_0x011c
            r10 = 4
            if (r3 == r10) goto L_0x011a
            r10 = 5
            if (r3 == r10) goto L_0x0121
            java.lang.String r3 = r0.m_option
            java.lang.String r10 = m10318q3()
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x00e4
            goto L_0x011c
        L_0x00e4:
            java.lang.String r3 = r0.m_option
            java.lang.String r6 = m10317p3()
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x00f1
            goto L_0x011a
        L_0x00f1:
            java.lang.String r3 = r0.m_option
            java.lang.String r5 = m10320s3()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00fe
            goto L_0x0120
        L_0x00fe:
            java.lang.String r3 = r0.m_option
            java.lang.String r5 = m10316o3()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x010b
            goto L_0x011e
        L_0x010b:
            java.lang.String r3 = r0.m_option
            java.lang.String r5 = m10321t3()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0118
            goto L_0x0121
        L_0x0118:
            r4 = r9
            goto L_0x0121
        L_0x011a:
            r4 = r5
            goto L_0x0121
        L_0x011c:
            r4 = r6
            goto L_0x0121
        L_0x011e:
            r4 = r7
            goto L_0x0121
        L_0x0120:
            r4 = r8
        L_0x0121:
            boolean r3 = r4.equals(r9)
            if (r3 == 0) goto L_0x012b
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r2)
            goto L_0x0137
        L_0x012b:
            java.lang.String r2 = "command"
            r1.putExtra(r2, r4)
            android.content.Context r2 = r22.mo27827K0()
            r2.sendBroadcast(r1)
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.ControlMediaAction.mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m10323v3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.action_control_media_select_type);
    }

    /* renamed from: m3 */
    public int mo24920m3(boolean z) {
        AudioManager audioManager = (AudioManager) mo27827K0().getSystemService("audio");
        int i = this.optionInt;
        if (i >= 0) {
            if (i != 0) {
                if (i == 1) {
                    return 88;
                }
                if (i == 2) {
                    return 87;
                }
                if (i == 3) {
                    return 126;
                }
                if (i != 4) {
                    return i != 5 ? -1 : 86;
                }
                return 127;
            } else if (z) {
                return 85;
            } else {
                return audioManager.isMusicActive() ? 127 : 126;
            }
        } else if (this.m_option.equals(m10319r3())) {
            return audioManager.isMusicActive() ? 127 : 126;
        } else {
            if (this.m_option.equals(m10316o3())) {
                return 87;
            }
            if (this.m_option.equals(m10320s3())) {
                return 88;
            }
            if (this.m_option.equals(m10318q3())) {
                return 126;
            }
            if (this.m_option.equals(m10317p3())) {
                return 127;
            }
            return this.m_option.equals(m10321t3()) ? 86 : -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        C3542vd[] vdVarArr;
        Activity j0 = mo27850j0();
        if (this.m_sendMediaPlayerCommands) {
            vdVarArr = m10322u3();
        } else if (this.m_simulateMediaButton) {
            vdVarArr = m10315n3();
        } else {
            vdVarArr = m10314l3();
        }
        String[] strArr = new String[vdVarArr.length];
        int i = 0;
        for (int i2 = 0; i2 < vdVarArr.length; i2++) {
            strArr[i2] = vdVarArr[i2].f9418a;
            int i3 = this.optionInt;
            if (i3 > 0) {
                if (i3 != vdVarArr[i2].f9419b) {
                }
            } else if (!this.m_option.equals(vdVarArr[i2].f9418a)) {
            }
            i = i2;
        }
        if (i == 0) {
            this.optionInt = vdVarArr[0].f9419b;
            this.m_option = vdVarArr[0].f9418a;
        }
        String string = mo27827K0().getString(C17541R$string.select_option);
        AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
        builder.setTitle((CharSequence) string);
        builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3532v3(this, vdVarArr));
        builder.create().show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_option);
        parcel.writeInt(this.m_simulateMediaButton ^ true ? 1 : 0);
        parcel.writeInt(this.m_sendMediaPlayerCommands ^ true ? 1 : 0);
        parcel.writeString(this.m_packageName);
        parcel.writeString(this.m_applicationName);
        parcel.writeInt(this.optionInt);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_sendMediaPlayerCommands = false;
        this.m_simulateMediaButton = false;
        if (i == 0) {
            this.m_simulateMediaButton = true;
        } else if (i == 2) {
            this.m_sendMediaPlayerCommands = true;
        }
    }

    public ControlMediaAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public ControlMediaAction() {
        this.optionInt = -1;
        this.m_option = m10315n3()[0].f9418a;
        this.m_simulateMediaButton = true;
        this.m_sendMediaPlayerCommands = false;
    }

    private ControlMediaAction(Parcel parcel) {
        super(parcel);
        this.optionInt = -1;
        this.m_option = parcel.readString();
        boolean z = true;
        this.m_simulateMediaButton = parcel.readInt() == 0;
        this.m_sendMediaPlayerCommands = parcel.readInt() != 0 ? false : z;
        this.m_packageName = parcel.readString();
        this.m_applicationName = parcel.readString();
        this.optionInt = parcel.readInt();
    }
}
