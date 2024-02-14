package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.beacons.BeaconWithName;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.utils.C6413o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13678a0;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13698j0;
import kotlin.jvm.internal.C13706o;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.C8048e;
import org.altbeacon.beacon.Region;
import p019c1.C2259a;
import p019c1.C2260h;
import p019c1.C2264i;
import p019c1.C2266j;
import p037m.C2009f;
import p081e1.C7264a;
import p119k3.C7521k;
import p297ja.C13339u;
import p319lc.C15626c;
import p414v9.C16728b;
import p448z9.C17070a;
import p448z9.C17071b;

/* compiled from: BluetoothBeaconTrigger.kt */
public final class BluetoothBeaconTrigger extends Trigger {
    private static final String BEACON_CACHE = "beacons";
    private static final String BEACON_WITH_NAME_DATA_KEY = "BeaconData";
    public static final Parcelable.Creator<BluetoothBeaconTrigger> CREATOR = new C5608a();
    private static final String[] OPTIONS;
    private static final int OPTION_IN_RANGE = 0;
    private static final int OPTION_OUT_OF_RANGE = 1;
    private static HashMap<String, C6067r6> beaconUuidRegionMap = new HashMap<>();

    /* renamed from: d */
    public static final C5609b f13586d = new C5609b((C13695i) null);
    private static int regionId = 1;
    private static C2260h rxBeacon;
    private static final C17070a subscriptions = new C17070a();
    private static int triggerCount;
    private int option;
    private transient C17071b scanningDisposable;
    private final ArrayList<BeaconWithName> selectedBeacons;

    /* renamed from: com.arlosoft.macrodroid.triggers.BluetoothBeaconTrigger$a */
    /* compiled from: BluetoothBeaconTrigger.kt */
    public static final class C5608a implements Parcelable.Creator<BluetoothBeaconTrigger> {
        C5608a() {
        }

        /* renamed from: a */
        public BluetoothBeaconTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new BluetoothBeaconTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public BluetoothBeaconTrigger[] newArray(int i) {
            return new BluetoothBeaconTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.BluetoothBeaconTrigger$b */
    /* compiled from: BluetoothBeaconTrigger.kt */
    public static final class C5609b {
        private C5609b() {
        }

        public /* synthetic */ C5609b(C13695i iVar) {
            this();
        }
    }

    static {
        MacroDroidApplication.C3787a aVar = MacroDroidApplication.f9883I;
        OPTIONS = new String[]{aVar.mo27303b().getString(C17541R$string.beacon_in_range), aVar.mo27303b().getString(C17541R$string.beacon_out_of_range)};
    }

    public BluetoothBeaconTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ BluetoothBeaconTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static final void m21674A3(Throwable th) {
        C4878b.m18868g("Bluetooth BeaconManager failed to initialise");
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static final void m21675B3(BluetoothBeaconTrigger bluetoothBeaconTrigger, C2264i iVar) {
        C13706o.m87929f(bluetoothBeaconTrigger, "this$0");
        bluetoothBeaconTrigger.m21678E3(iVar.mo24570a(), iVar.mo24571b() == C2264i.C2265a.ENTER);
    }

    /* renamed from: C3 */
    private final BeaconWithName m21676C3(Beacon beacon, C2259a aVar) {
        Iterator<BeaconWithName> it = aVar.mo24551a().iterator();
        while (it.hasNext()) {
            BeaconWithName next = it.next();
            if (C13706o.m87924a(next.getUuid(), beacon.mo37953i().toString())) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: D3 */
    private final BeaconWithName m21677D3() {
        if (this.selectedBeacons.isEmpty() || this.selectedBeacons.get(0) == null) {
            return new BeaconWithName("?", "?");
        }
        BeaconWithName beaconWithName = this.selectedBeacons.get(0);
        C13706o.m87928e(beaconWithName, "selectedBeacons[0]");
        return beaconWithName;
    }

    /* renamed from: E3 */
    private final void m21678E3(Region region, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if (next2 instanceof BluetoothBeaconTrigger) {
                    BluetoothBeaconTrigger bluetoothBeaconTrigger = (BluetoothBeaconTrigger) next2;
                    if (C13706o.m87924a(bluetoothBeaconTrigger.m21677D3().getUuid(), region.mo38031b().toString()) && (((i = bluetoothBeaconTrigger.option) == 0 && z) || (i == 1 && !z))) {
                        next.setTriggerThatInvoked(next2);
                        if (next2.mo31374R2() && next.canInvoke(next.getTriggerContextInfo())) {
                            arrayList.add(next);
                            break;
                        }
                    }
                }
            }
        }
        new Handler(Looper.getMainLooper()).post(new C6013n0(arrayList));
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static final void m21679F3(ArrayList arrayList) {
        C13706o.m87929f(arrayList, "$macrosToInvoke");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Macro macro = (Macro) it.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }

    /* renamed from: G3 */
    private final void m21680G3(String str) {
        C13339u uVar;
        C16728b u;
        C6067r6 r6Var = beaconUuidRegionMap.get(str);
        if (r6Var != null) {
            beaconUuidRegionMap.put(str, C6067r6.m24018b(r6Var, (Region) null, r6Var.mo31918c() + 1, 1, (Object) null));
            uVar = C13339u.f61331a;
        } else {
            uVar = null;
        }
        if (uVar == null) {
            if (m21677D3().getUuid() == null) {
                Long Y0 = mo27840Y0();
                C13706o.m87928e(Y0, "macroGuid");
                C4878b.m18869h("Cannot monitor bluetooth beacon the UUID is null, please reconfigure the trigger", Y0.longValue());
            } else {
                HashMap<String, C6067r6> hashMap = beaconUuidRegionMap;
                StringBuilder sb = new StringBuilder();
                sb.append("Region");
                int i = regionId;
                regionId = i + 1;
                sb.append(i);
                hashMap.put(str, new C6067r6(new Region(sb.toString(), C8048e.m33579g(m21677D3().getUuid()), (C8048e) null, (C8048e) null), 1));
            }
        }
        C6067r6 r6Var2 = beaconUuidRegionMap.get(str);
        if (r6Var2 != null && r6Var2.mo31918c() == 1) {
            C4878b.m18879r("Monitoring region for beacon id: " + str);
            C2260h hVar = rxBeacon;
            if (hVar != null && (u = hVar.mo24560u(r6Var2.mo31919d())) != null) {
                u.mo79657k(new C6134t0(this), new C6158v0(this));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public static final void m21681H3(BluetoothBeaconTrigger bluetoothBeaconTrigger) {
        C13706o.m87929f(bluetoothBeaconTrigger, "this$0");
        C4878b.m18879r("Monitoring beacon: " + bluetoothBeaconTrigger.m21677D3() + ".uuid");
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public static final void m21682I3(BluetoothBeaconTrigger bluetoothBeaconTrigger, Throwable th) {
        C13706o.m87929f(bluetoothBeaconTrigger, "this$0");
        C4878b.m18868g("Failed to monitor: " + bluetoothBeaconTrigger.m21677D3() + ".uuid");
    }

    /* renamed from: J3 */
    private final void m21683J3(BeaconWithName beaconWithName, C7264a aVar, C2259a aVar2) {
        BeaconWithName beaconWithName2 = beaconWithName;
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_beacon_name);
        if (beaconWithName2 == null) {
            appCompatDialog.setTitle((int) C17541R$string.add_beacon_manually);
        } else {
            appCompatDialog.setTitle((CharSequence) beaconWithName.getUuid());
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.button_delete);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.uuid);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.friendly_name);
        if (beaconWithName2 != null) {
            View findViewById = appCompatDialog.findViewById(C17532R$id.uuid_layout);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            if (editText2 != null) {
                editText2.setText(beaconWithName.getName());
            }
            if (editText != null) {
                editText.setText(beaconWithName.getUuid());
            }
        } else if (button3 != null) {
            button3.setVisibility(8);
        }
        if (button != null) {
            button.setOnClickListener(new C6049q0(editText, this, aVar2, beaconWithName, editText2, aVar, appCompatDialog));
        }
        if (button2 != null) {
            button2.setOnClickListener(new C6061r0(appCompatDialog));
        }
        if (button3 != null) {
            button3.setOnClickListener(new C6082s0(aVar2, beaconWithName, aVar, appCompatDialog));
        }
        Window window3 = appCompatDialog.getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(4);
        }
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public static final void m21684K3(EditText editText, BluetoothBeaconTrigger bluetoothBeaconTrigger, C2259a aVar, BeaconWithName beaconWithName, EditText editText2, C7264a aVar2, AppCompatDialog appCompatDialog, View view) {
        Editable editable;
        String str;
        Editable text;
        C13706o.m87929f(bluetoothBeaconTrigger, "this$0");
        C13706o.m87929f(aVar, "$cachedData");
        C13706o.m87929f(aVar2, "$cache");
        C13706o.m87929f(appCompatDialog, "$dialog");
        Editable editable2 = null;
        if (String.valueOf(editText != null ? editText.getText() : null).length() == 0) {
            C15626c.makeText(bluetoothBeaconTrigger.mo27827K0().getApplicationContext(), C17541R$string.beacon_invalid_uuid, 0).show();
            return;
        }
        if (editText != null) {
            try {
                editable = editText.getText();
            } catch (Exception unused) {
                C15626c.makeText(bluetoothBeaconTrigger.mo27827K0().getApplicationContext(), C17541R$string.beacon_invalid_uuid, 0).show();
                return;
            }
        } else {
            editable = null;
        }
        C8048e.m33579g(String.valueOf(editable));
        if (!C13566b0.m87414O(aVar.mo24551a(), beaconWithName)) {
            C13698j0.m87901a(aVar.mo24551a()).remove(beaconWithName);
        }
        if (editText2 == null || (text = editText2.getText()) == null || (str = text.toString()) == null) {
            str = "?";
        }
        if (editText != null) {
            editable2 = editText.getText();
        }
        bluetoothBeaconTrigger.m21689P3(new BeaconWithName(String.valueOf(editable2), str));
        aVar.mo24551a().add(0, bluetoothBeaconTrigger.m21677D3());
        aVar2.mo37132b(BEACON_WITH_NAME_DATA_KEY, aVar);
        appCompatDialog.dismiss();
        bluetoothBeaconTrigger.mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public static final void m21685L3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public static final void m21686M3(C2259a aVar, BeaconWithName beaconWithName, C7264a aVar2, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(aVar, "$cachedData");
        C13706o.m87929f(aVar2, "$cache");
        C13706o.m87929f(appCompatDialog, "$dialog");
        C13698j0.m87901a(aVar.mo24551a()).remove(beaconWithName);
        aVar2.mo37132b(BEACON_WITH_NAME_DATA_KEY, aVar);
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public static final void m21687N3(BluetoothBeaconTrigger bluetoothBeaconTrigger, C2009f fVar, C13678a0 a0Var, C2266j jVar) {
        C13706o.m87929f(bluetoothBeaconTrigger, "this$0");
        C13706o.m87929f(a0Var, "$cleanupBeaconAfter");
        C17071b bVar = bluetoothBeaconTrigger.scanningDisposable;
        if (bVar != null) {
            bVar.dispose();
        }
        HashSet hashSet = new HashSet();
        for (Beacon add : jVar.mo24573a()) {
            hashSet.add(add);
        }
        if (hashSet.isEmpty()) {
            C15626c.makeText(bluetoothBeaconTrigger.mo27827K0().getApplicationContext(), C17541R$string.no_beacons_found, 0).show();
        }
        fVar.dismiss();
        bluetoothBeaconTrigger.m21705v3(new ArrayList(hashSet));
        if (a0Var.element) {
            C2260h hVar = rxBeacon;
            if (hVar != null) {
                hVar.mo24556n();
            }
            rxBeacon = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public static final void m21688O3(C2009f fVar, BluetoothBeaconTrigger bluetoothBeaconTrigger, Throwable th) {
        C13706o.m87929f(bluetoothBeaconTrigger, "this$0");
        try {
            fVar.dismiss();
        } catch (Exception unused) {
        }
        C4878b.m18879r("No beacons found - request timed out");
        C15626c.makeText(bluetoothBeaconTrigger.mo27827K0().getApplicationContext(), C17541R$string.no_beacons_found, 0).show();
        bluetoothBeaconTrigger.m21705v3(new ArrayList(new HashSet()));
    }

    /* renamed from: P3 */
    private final void m21689P3(BeaconWithName beaconWithName) {
        this.selectedBeacons.clear();
        this.selectedBeacons.add(beaconWithName);
    }

    /* renamed from: u3 */
    private final List<BeaconWithName> m21704u3(List<? extends Beacon> list, C2259a aVar) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Beacon beacon : list) {
            BeaconWithName C3 = m21676C3(beacon, aVar);
            if (C3 != null) {
                arrayList.add(0, C3);
            } else {
                String eVar = beacon.mo37953i().toString();
                C13706o.m87928e(eVar, "beacon.id1.toString()");
                arrayList.add(new BeaconWithName(eVar, (String) null, 2, (C13695i) null));
            }
        }
        Iterator<BeaconWithName> it = aVar.mo24551a().iterator();
        while (it.hasNext()) {
            BeaconWithName next = it.next();
            if (!arrayList.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: v3 */
    private final void m21705v3(List<? extends Beacon> list) {
        Spanned spanned;
        if (mo27836X()) {
            C7264a q = MacroDroidApplication.f9883I.mo27303b().mo27293q(BEACON_CACHE);
            C13684d0 d0Var = new C13684d0();
            T c = q.mo37133c(BEACON_WITH_NAME_DATA_KEY, C2259a.class);
            d0Var.element = c;
            if (c == null) {
                d0Var.element = new C2259a((ArrayList) null, 1, (C13695i) null);
            }
            T t = d0Var.element;
            C13706o.m87928e(t, "cachedData");
            List<BeaconWithName> u3 = m21704u3(list, (C2259a) t);
            int max = Math.max(0, u3.indexOf(m21677D3()));
            Spanned[] spannedArr = {Html.fromHtml(SelectableItem.m15535j1(C17541R$string.add_beacon_manually))};
            ArrayList arrayList = new ArrayList(C13616u.m87774u(u3, 10));
            for (BeaconWithName beaconWithName : u3) {
                String name = beaconWithName.getName();
                if (name == null || name.length() == 0) {
                    spanned = Html.fromHtml("<small><i>" + beaconWithName.getUuid() + "</i></small>");
                } else {
                    spanned = Html.fromHtml("<b>" + beaconWithName.getName() + "</b><br/><small><i>" + beaconWithName.getUuid() + "</i></small>");
                }
                arrayList.add(spanned);
            }
            Object[] array = arrayList.toArray(new Spanned[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setTitle((CharSequence) mo24772h1());
            builder.setSingleChoiceItems((CharSequence[]) ((Spanned[]) C13593l.m87569p(spannedArr, array)), max, (DialogInterface.OnClickListener) null);
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C6025o0(this));
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6037p0(this, u3, q, d0Var));
            builder.show().setOnCancelListener(new C5965j0(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m21706w3(BluetoothBeaconTrigger bluetoothBeaconTrigger, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(bluetoothBeaconTrigger, "this$0");
        bluetoothBeaconTrigger.mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m21707x3(BluetoothBeaconTrigger bluetoothBeaconTrigger, List list, C7264a aVar, C13684d0 d0Var, DialogInterface dialogInterface, int i) {
        BeaconWithName beaconWithName;
        C13706o.m87929f(bluetoothBeaconTrigger, "this$0");
        C13706o.m87929f(list, "$options");
        C13706o.m87929f(aVar, "$cache");
        C13706o.m87929f(d0Var, "$cachedData");
        C13706o.m87927d(dialogInterface, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        if (checkedItemPosition == 0) {
            beaconWithName = null;
        } else {
            beaconWithName = (BeaconWithName) list.get(checkedItemPosition - 1);
        }
        T t = d0Var.element;
        C13706o.m87928e(t, "cachedData");
        bluetoothBeaconTrigger.m21683J3(beaconWithName, aVar, (C2259a) t);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static final void m21708y3(BluetoothBeaconTrigger bluetoothBeaconTrigger, DialogInterface dialogInterface) {
        C13706o.m87929f(bluetoothBeaconTrigger, "this$0");
        bluetoothBeaconTrigger.mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static final void m21709z3(Boolean bool) {
        C4878b.m18879r("Bluetooth BeaconManager initialised");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        String str = OPTIONS[this.option];
        C13706o.m87928e(str, "OPTIONS[option]");
        return str;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String name = m21677D3().getName();
        return !(name == null || name.length() == 0) ? m21677D3().getName() : m21677D3().getUuid();
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        C6067r6 r6Var = beaconUuidRegionMap.get(m21677D3().getUuid());
        if (r6Var != null) {
            if (r6Var.mo31918c() == 1) {
                C4878b.m18879r("Stopped Monitoring region for beacon id: " + m21677D3() + ".uuid");
                C2260h hVar = rxBeacon;
                if (hVar != null) {
                    hVar.mo24561w(r6Var.mo31919d());
                }
            }
            beaconUuidRegionMap.put(m21677D3().getUuid(), C6067r6.m24018b(r6Var, (Region) null, r6Var.mo31918c() - 1, 1, (Object) null));
        }
        if (triggerCount == 0) {
            subscriptions.mo80337d();
            C2260h hVar2 = rxBeacon;
            if (hVar2 != null) {
                hVar2.mo24556n();
            }
            rxBeacon = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7521k.f18396k.mo37645a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + C6413o0.m24693b(mo24672O0(), 20) + ')';
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (triggerCount == 0) {
            if (rxBeacon == null) {
                rxBeacon = C2260h.f6956g.mo24562a(MacroDroidApplication.f9883I.mo27303b());
            }
            C17070a aVar = subscriptions;
            C2260h hVar = rxBeacon;
            C13706o.m87926c(hVar);
            aVar.mo62358a(hVar.mo24559r().mo79686Q(C5989l0.f14166a, C6001m0.f14184a));
            C2260h hVar2 = rxBeacon;
            C13706o.m87926c(hVar2);
            aVar.mo62358a(hVar2.mo24557o().mo79685P(new C6146u0(this)));
        }
        m21680G3(m21677D3().getUuid());
        triggerCount++;
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        if (Build.VERSION.SDK_INT >= 31) {
            return new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"};
        }
        return new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return OPTIONS;
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo25559a1() + " (" + mo24672O0() + ')';
    }

    /* renamed from: n2 */
    public boolean mo25733n2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        C2009f s = new C2009f.C2014d(mo27850j0()).mo24100t(C17541R$string.please_wait).mo24085e(C17541R$string.scanning_for_beacons).mo24098r(true, 0).mo24084c(false).mo24104x(C17528R$color.trigger_accent).mo24099s();
        Region region = new Region("Scan for all beacons", (C8048e) null, (C8048e) null, (C8048e) null);
        C13678a0 a0Var = new C13678a0();
        if (rxBeacon == null) {
            rxBeacon = C2260h.f6956g.mo24562a(MacroDroidApplication.f9883I.mo27303b());
            a0Var.element = true;
        }
        C2260h hVar = rxBeacon;
        C13706o.m87926c(hVar);
        this.scanningDisposable = hVar.mo24555j(region).mo79686Q(new C6170w0(this, s, a0Var), new C5977k0(s, this));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.option);
        if (Build.VERSION.SDK_INT >= 29) {
            parcel.writeParcelableList(this.selectedBeacons, i);
            return;
        }
        ArrayList<BeaconWithName> arrayList = this.selectedBeacons;
        C13706o.m87927d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<com.arlosoft.macrodroid.beacons.BeaconWithName>");
        parcel.writeList(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    private BluetoothBeaconTrigger() {
        this.selectedBeacons = new ArrayList<>();
    }

    private BluetoothBeaconTrigger(Parcel parcel) {
        super(parcel);
        ArrayList<BeaconWithName> arrayList = new ArrayList<>();
        this.selectedBeacons = arrayList;
        this.option = parcel.readInt();
        if (Build.VERSION.SDK_INT >= 29) {
            parcel.readParcelableList(arrayList, BeaconWithName.class.getClassLoader());
            return;
        }
        C13706o.m87927d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<com.arlosoft.macrodroid.beacons.BeaconWithName>");
        parcel.readList(arrayList, BeaconWithName.class.getClassLoader());
    }
}
