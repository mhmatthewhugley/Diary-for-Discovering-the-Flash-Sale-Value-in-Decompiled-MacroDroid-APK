package com.arlosoft.macrodroid.action;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.SparseBooleanArray;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13678a0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import p128m0.C7690a;
import p150q2.C8164a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* compiled from: AccessibilityServiceAction.kt */
public final class AccessibilityServiceAction extends Action {
    public static final Parcelable.Creator<AccessibilityServiceAction> CREATOR = new C2313a();

    /* renamed from: d */
    public static final C2314b f7122d = new C2314b((C13695i) null);
    /* access modifiers changed from: private */
    public final ArrayList<String> idList;
    private final ArrayList<String> nameList;
    /* access modifiers changed from: private */
    public int option;

    /* renamed from: com.arlosoft.macrodroid.action.AccessibilityServiceAction$a */
    /* compiled from: AccessibilityServiceAction.kt */
    public static final class C2313a implements Parcelable.Creator<AccessibilityServiceAction> {
        C2313a() {
        }

        /* renamed from: a */
        public AccessibilityServiceAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new AccessibilityServiceAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public AccessibilityServiceAction[] newArray(int i) {
            return new AccessibilityServiceAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.AccessibilityServiceAction$b */
    /* compiled from: AccessibilityServiceAction.kt */
    public static final class C2314b {
        private C2314b() {
        }

        public /* synthetic */ C2314b(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String[] m9588b() {
            return new String[]{SelectableItem.m15535j1(C17541R$string.enable), SelectableItem.m15535j1(C17541R$string.disable), SelectableItem.m15535j1(C17541R$string.toggle)};
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.AccessibilityServiceAction$c */
    /* compiled from: Comparisons.kt */
    public static final class C2315c<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C15612b.m94865a(((C2958c) t).mo26340b(), ((C2958c) t2).mo26340b());
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.AccessibilityServiceAction$d */
    /* compiled from: AccessibilityServiceAction.kt */
    static final class C2316d extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ AccessibilityServiceAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2316d(AccessibilityServiceAction accessibilityServiceAction, C13635d<? super C2316d> dVar) {
            super(2, dVar);
            this.this$0 = accessibilityServiceAction;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2316d(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2316d) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                String string = Settings.Secure.getString(this.this$0.mo27827K0().getContentResolver(), "enabled_accessibility_services");
                Iterator it = this.this$0.idList.iterator();
                boolean z = false;
                boolean z2 = false;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (this.this$0.option == 0) {
                        if (string == null) {
                            string = String.valueOf(str);
                        } else {
                            C13706o.m87928e(str, "serviceId");
                            if (!C15177w.m93663N(string, str, false, 2, (Object) null)) {
                                string = string + ':' + str;
                            }
                        }
                    } else if (this.this$0.option != 1) {
                        if (string != null) {
                            C13706o.m87928e(str, "serviceId");
                            if (C15177w.m93663N(string, str, false, 2, (Object) null)) {
                                string = this.this$0.m9574q3(string, str);
                            }
                        }
                        if (string == null) {
                            string = String.valueOf(str);
                        } else {
                            string = string + ':' + str;
                        }
                    } else if (string != null) {
                        C13706o.m87928e(str, "serviceId");
                        if (C15177w.m93663N(string, str, false, 2, (Object) null)) {
                            string = this.this$0.m9574q3(string, str);
                        }
                    }
                    z2 = true;
                }
                if (z2) {
                    try {
                        z = Settings.Secure.putString(this.this$0.mo27827K0().getContentResolver(), "enabled_accessibility_services", string);
                    } catch (Exception unused2) {
                        if (C8164a.m33886a()) {
                            C4061t1.m15947B0(new String[]{"settings put secure enabled_accessibility_services " + string});
                            z = true;
                        }
                    }
                    if (!z) {
                        Long Y0 = this.this$0.mo27840Y0();
                        C13706o.m87928e(Y0, "macroGuid");
                        C4878b.m18869h("Could not set accessibility services, you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS", Y0.longValue());
                    }
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public AccessibilityServiceAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ AccessibilityServiceAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: p3 */
    private final List<C2958c> m9573p3() {
        Object systemService = mo27827K0().getSystemService("accessibility");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        List<AccessibilityServiceInfo> installedAccessibilityServiceList = ((AccessibilityManager) systemService).getInstalledAccessibilityServiceList();
        ArrayList arrayList = new ArrayList();
        for (AccessibilityServiceInfo next : installedAccessibilityServiceList) {
            String obj = next.getResolveInfo().loadLabel(mo27827K0().getPackageManager()).toString();
            String id = next.getId();
            C13706o.m87928e(id, "service.id");
            arrayList.add(new C2958c(id, obj));
        }
        return C13566b0.m87450y0(arrayList, new C2315c());
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public final String m9574q3(String str, String str2) {
        String str3 = str2;
        String substring = str3.substring(0, Math.max(0, C15177w.m93682a0(str2, "/", 0, false, 6, (Object) null)));
        C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = str3.substring(Math.max(0, C15177w.m93682a0(str2, "/", 0, false, 6, (Object) null) + 1));
        C13706o.m87928e(substring2, "this as java.lang.String).substring(startIndex)");
        String str4 = substring + '/' + substring + substring2;
        return C15176v.m93630E(C15176v.m93630E(C15176v.m93630E(C15176v.m93630E(str, ':' + str4, "", false, 4, (Object) null), str4, "", false, 4, (Object) null), ':' + str3, "", false, 4, (Object) null), str2, "", false, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m9575r3(boolean[] zArr, C13678a0 a0Var, DialogInterface dialogInterface, int i, boolean z) {
        C13706o.m87929f(zArr, "$checkedStates");
        C13706o.m87929f(a0Var, "$anyChecked");
        C13706o.m87929f(dialogInterface, "dialog");
        zArr[i] = z;
        int length = zArr.length;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (zArr[i2]) {
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        a0Var.element = z2;
        ((AlertDialog) dialogInterface).getButton(-1).setEnabled(a0Var.element);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m9576s3(AccessibilityServiceAction accessibilityServiceAction, String[] strArr, List list, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(accessibilityServiceAction, "this$0");
        C13706o.m87929f(strArr, "$serviceNames");
        C13706o.m87929f(list, "$allServices");
        C13706o.m87927d(dialogInterface, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        alertDialog.getListView().getCheckedItemPositions();
        SparseBooleanArray checkedItemPositions = alertDialog.getListView().getCheckedItemPositions();
        accessibilityServiceAction.nameList.clear();
        accessibilityServiceAction.idList.clear();
        int size = checkedItemPositions.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (checkedItemPositions.valueAt(i2)) {
                accessibilityServiceAction.nameList.add(strArr[checkedItemPositions.keyAt(i2)]);
                accessibilityServiceAction.idList.add(((C2958c) list.get(checkedItemPositions.keyAt(i2))).mo26339a());
            }
        }
        accessibilityServiceAction.mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return f7122d.m9588b()[this.option] + ": " + this.nameList;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7690a.f18632l.mo37739a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new C2316d(this, (C13635d<? super C2316d>) null), 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return f7122d.m9588b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        List<C2958c> p3 = m9573p3();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(p3, 10));
        for (C2958c b : p3) {
            arrayList.add(b.mo26340b());
        }
        boolean z = false;
        Object[] array = arrayList.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(p3, 10));
        for (C2958c a : p3) {
            arrayList2.add(Boolean.valueOf(this.idList.contains(a.mo26339a())));
        }
        boolean[] B0 = C13566b0.m87398B0(arrayList2);
        C13678a0 a0Var = new C13678a0();
        int length = B0.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (B0[i]) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        a0Var.element = z;
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(mo27850j0(), C17542R$style.Theme_App_Dialog_Action).setTitle((CharSequence) mo24738G0()).setMultiChoiceItems((CharSequence[]) strArr, B0, (DialogInterface.OnMultiChoiceClickListener) new C2930b(B0, a0Var)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C2802a(this, strArr, p3));
        C13706o.m87928e(positiveButton, "Builder(activity, R.styl…lete()\n                })");
        AlertDialog create = positiveButton.create();
        C13706o.m87928e(create, "builder.create()");
        create.show();
        create.getButton(-1).setEnabled(a0Var.element);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.option);
        parcel.writeStringList(this.idList);
        parcel.writeStringList(this.nameList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    public AccessibilityServiceAction() {
        this.idList = new ArrayList<>();
        this.nameList = new ArrayList<>();
    }

    private AccessibilityServiceAction(Parcel parcel) {
        super(parcel);
        ArrayList<String> arrayList = new ArrayList<>();
        this.idList = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.nameList = arrayList2;
        this.option = parcel.readInt();
        parcel.readStringList(arrayList);
        parcel.readStringList(arrayList2);
    }
}
