package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5981k4;
import com.arlosoft.macrodroid.triggers.GoogleAssistantTrigger;
import com.arlosoft.macrodroid.triggers.InvokedByDrawerTrigger;
import com.arlosoft.macrodroid.triggers.InvokedByNotificationTrigger;
import com.arlosoft.macrodroid.triggers.InvokedByOptionDialogTrigger;
import com.arlosoft.macrodroid.triggers.InvokedByPowerMenuTrigger;
import com.arlosoft.macrodroid.triggers.InvokedByQuickRunTrigger;
import com.arlosoft.macrodroid.triggers.InvokedByRunMacroTrigger;
import com.arlosoft.macrodroid.triggers.ShortcutTrigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Arrays;
import kotlin.collections.C13592k0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p123l1.C7655y;

/* compiled from: InvocationMethodConstraint.kt */
public final class InvocationMethodConstraint extends Constraint {
    public static final Parcelable.Creator<InvocationMethodConstraint> CREATOR = new C4147a();

    /* renamed from: f */
    public static final C4148b f10721f = new C4148b((C13695i) null);
    private boolean notInvokedBy;
    private int option;
    private boolean[] selectedOptions;

    /* renamed from: com.arlosoft.macrodroid.constraint.InvocationMethodConstraint$a */
    /* compiled from: InvocationMethodConstraint.kt */
    public static final class C4147a implements Parcelable.Creator<InvocationMethodConstraint> {
        C4147a() {
        }

        /* renamed from: a */
        public InvocationMethodConstraint createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new InvocationMethodConstraint(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public InvocationMethodConstraint[] newArray(int i) {
            return new InvocationMethodConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.InvocationMethodConstraint$b */
    /* compiled from: InvocationMethodConstraint.kt */
    public static final class C4148b {
        private C4148b() {
        }

        public /* synthetic */ C4148b(C13695i iVar) {
            this();
        }
    }

    public InvocationMethodConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ InvocationMethodConstraint(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: i3 */
    private final void m16548i3() {
        boolean[] m3 = m16552m3();
        boolean[] copyOf = Arrays.copyOf(m3, m3.length);
        C13706o.m87928e(copyOf, "copyOf(this, size)");
        AlertDialog create = new AlertDialog.Builder(mo27850j0(), mo24705l0()).setTitle((int) C17541R$string.constrant_invocation_method).setMultiChoiceItems((CharSequence[]) m16551l3(), copyOf, (DialogInterface.OnMultiChoiceClickListener) new C4337w0(copyOf)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4332v0(this, copyOf)).create();
        C13706o.m87928e(create, "builder.create()");
        create.show();
        int length = copyOf.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (copyOf[i]) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        create.getButton(-1).setEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m16549j3(boolean[] zArr, DialogInterface dialogInterface, int i, boolean z) {
        C13706o.m87929f(zArr, "$localSelections");
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
        ((AlertDialog) dialogInterface).getButton(-1).setEnabled(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m16550k3(InvocationMethodConstraint invocationMethodConstraint, boolean[] zArr, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(invocationMethodConstraint, "this$0");
        C13706o.m87929f(zArr, "$localSelections");
        invocationMethodConstraint.option = -1;
        boolean[] copyOf = Arrays.copyOf(zArr, zArr.length);
        C13706o.m87928e(copyOf, "copyOf(this, size)");
        invocationMethodConstraint.selectedOptions = copyOf;
        invocationMethodConstraint.mo24689O1();
    }

    /* renamed from: l3 */
    private final String[] m16551l3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_macrodroid_drawer), SelectableItem.m15535j1(C17541R$string.notification), SelectableItem.m15535j1(C17541R$string.action_option_dialog), SelectableItem.m15535j1(C17541R$string.constrant_invocation_method_macro_run_action), SelectableItem.m15535j1(C17541R$string.shortcut_name), SelectableItem.m15535j1(C17541R$string.trigger_google_assistant), SelectableItem.m15535j1(C17541R$string.home_screen_tile_quick_run_macro), SelectableItem.m15535j1(C17541R$string.constrant_invocation_method_option_power_menu), SelectableItem.m15535j1(C17541R$string.constrant_invocation_method_option_other_standard_trigger)};
    }

    /* renamed from: m3 */
    private final boolean[] m16552m3() {
        int i = this.option;
        if (i < 0) {
            return this.selectedOptions;
        }
        boolean[] zArr = new boolean[9];
        zArr[i] = true;
        return zArr;
    }

    /* renamed from: n3 */
    private final String[] m16553n3() {
        MacroDroidApplication.C3787a aVar = MacroDroidApplication.f9883I;
        String string = aVar.mo27303b().getString(C17541R$string.constrant_invocation_method_invoked_by);
        C13706o.m87928e(string, "MacroDroidApplication.in…cation_method_invoked_by)");
        String string2 = aVar.mo27303b().getString(C17541R$string.constrant_invocation_method_not_invoked_by);
        C13706o.m87928e(string2, "MacroDroidApplication.in…on_method_not_invoked_by)");
        return new String[]{string, string2};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.notInvokedBy ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m16553n3()[this.notInvokedBy];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        boolean[] m3 = m16552m3();
        String[] l3 = m16551l3();
        StringBuilder sb = new StringBuilder();
        int length = m3.length;
        for (int i = 0; i < length; i++) {
            if (m3[i]) {
                sb.append(l3[i]);
                sb.append(", ");
            }
        }
        if (!TextUtils.isEmpty(sb.toString())) {
            sb = new StringBuilder(sb.substring(0, sb.length() - 2));
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "extendedDetail.toString()");
        return sb2;
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        boolean z;
        for (C13592k0 k0Var : C13596m.m87631x0(m16552m3())) {
            if (((Boolean) k0Var.mo71845d()).booleanValue()) {
                switch (k0Var.mo71844c()) {
                    case 0:
                        z = C13706o.m87924a(mo27837X0().getTriggerThatInvoked(), InvokedByDrawerTrigger.m22465g3());
                        break;
                    case 1:
                        z = C13706o.m87924a(mo27837X0().getTriggerThatInvoked(), InvokedByNotificationTrigger.m22475g3());
                        break;
                    case 2:
                        z = C13706o.m87924a(mo27837X0().getTriggerThatInvoked(), InvokedByOptionDialogTrigger.m22485g3());
                        break;
                    case 3:
                        z = C13706o.m87924a(mo27837X0().getTriggerThatInvoked(), InvokedByRunMacroTrigger.m22515g3());
                        break;
                    case 4:
                        z = mo27837X0().getTriggerThatInvoked() instanceof ShortcutTrigger;
                        break;
                    case 5:
                        z = mo27837X0().getTriggerThatInvoked() instanceof GoogleAssistantTrigger;
                        break;
                    case 6:
                        z = C13706o.m87924a(mo27837X0().getTriggerThatInvoked(), InvokedByQuickRunTrigger.m22505g3());
                        break;
                    case 7:
                        z = C13706o.m87924a(mo27837X0().getTriggerThatInvoked(), InvokedByPowerMenuTrigger.m22495g3());
                        break;
                    default:
                        if (!(mo27837X0().getTriggerThatInvoked() instanceof C5981k4) && !(mo27837X0().getTriggerThatInvoked() instanceof ShortcutTrigger) && !(mo27837X0().getTriggerThatInvoked() instanceof GoogleAssistantTrigger)) {
                            z = true;
                            break;
                        } else {
                            z = false;
                            break;
                        }
                        break;
                }
                if (z) {
                    return !this.notInvokedBy;
                }
            }
        }
        return this.notInvokedBy;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7655y.f18562g.mo37670a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16553n3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        String j1 = SelectableItem.m15535j1(C17541R$string.select_option);
        C13706o.m87928e(j1, "getString(R.string.select_option)");
        return j1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        m16548i3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.option);
        parcel.writeBooleanArray(this.selectedOptions);
        parcel.writeInt(this.notInvokedBy ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.notInvokedBy = z;
    }

    public InvocationMethodConstraint() {
        this.option = -1;
        this.selectedOptions = new boolean[9];
    }

    private InvocationMethodConstraint(Parcel parcel) {
        super(parcel);
        this.option = -1;
        this.selectedOptions = new boolean[9];
        this.option = parcel.readInt();
        boolean[] zArr = new boolean[9];
        this.selectedOptions = zArr;
        parcel.readBooleanArray(zArr);
        this.notInvokedBy = parcel.readInt() != 0;
    }
}
