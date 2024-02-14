package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.OutgoingCallMonitor;
import com.arlosoft.macrodroid.triggers.services.PhoneStateMonitorService;
import com.arlosoft.macrodroid.utils.C6413o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p112j2.C7439d0;
import p119k3.C7536o;
import p129m1.C7893a;
import p129m1.C7897h;
import p135n1.C7966c;
import p135n1.C7967d;
import p136n3.C7972d;

public class CallActiveTrigger extends SignalOnOffTrigger {
    public static final Parcelable.Creator<CallActiveTrigger> CREATOR = new C5616c();
    private static final int OPTION_SELECT_CONTACT = 0;
    private static int s_callActiveTriggerCounter;
    /* access modifiers changed from: private */
    public static C7972d s_incomingCallMonitor;
    /* access modifiers changed from: private */
    public static OutgoingCallMonitor s_outgoingCallMonitor;
    /* access modifiers changed from: private */
    public boolean isExclude;
    private List<Contact> m_contactList;
    private List<String> m_groupIdList;
    private List<String> m_groupNameList;
    /* access modifiers changed from: private */
    public int m_option;
    private String m_phoneNumber;
    private boolean m_phoneNumberExclude;
    protected String m_secondaryClassType;
    /* access modifiers changed from: private */
    public transient int workingOption;

    /* renamed from: com.arlosoft.macrodroid.triggers.CallActiveTrigger$a */
    class C5614a implements C7893a {
        C5614a() {
        }

        /* renamed from: a */
        public void mo31007a(@NonNull List<? extends Contact> list, boolean z) {
            boolean unused = CallActiveTrigger.this.isExclude = z;
            CallActiveTrigger callActiveTrigger = CallActiveTrigger.this;
            int unused2 = callActiveTrigger.m_option = callActiveTrigger.workingOption;
            List<Contact> u3 = CallActiveTrigger.this.mo31001u3();
            u3.clear();
            u3.addAll(list);
            CallActiveTrigger.this.mo24689O1();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.CallActiveTrigger$b */
    class C5615b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13590a;

        /* renamed from: c */
        final /* synthetic */ EditText f13591c;

        C5615b(Button button, EditText editText) {
            this.f13590a = button;
            this.f13591c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f13590a.setEnabled(this.f13591c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.CallActiveTrigger$c */
    class C5616c implements Parcelable.Creator<CallActiveTrigger> {
        C5616c() {
        }

        /* renamed from: a */
        public CallActiveTrigger createFromParcel(Parcel parcel) {
            return new CallActiveTrigger(parcel, (C5614a) null);
        }

        /* renamed from: b */
        public CallActiveTrigger[] newArray(int i) {
            return new CallActiveTrigger[i];
        }
    }

    /* synthetic */ CallActiveTrigger(Parcel parcel, C5614a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m21802C3() {
        Binder.clearCallingIdentity();
        try {
            ((TelephonyManager) mo27827K0().getSystemService("phone")).listen(s_incomingCallMonitor, 32);
        } catch (SecurityException unused) {
            C7439d0.m30909o0(mo27827K0(), "android.permission.READ_PHONE_STATE", SelectableItem.m15535j1(C17541R$string.trigger_call_active), true, false);
        }
    }

    /* renamed from: D1 */
    private void m21803D1() {
        this.m_groupIdList = new ArrayList();
        this.m_groupNameList = new ArrayList();
        this.workingOption = this.m_option;
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static /* synthetic */ void m21804D3(DialogInterface dialogInterface, int i, boolean z) {
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        alertDialog.getButton(-1).setEnabled(alertDialog.getListView().getCheckedItemCount() > 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m21805E3(List list, DialogInterface dialogInterface, int i) {
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        alertDialog.getListView().getCheckedItemPositions();
        SparseBooleanArray checkedItemPositions = alertDialog.getListView().getCheckedItemPositions();
        this.m_groupIdList.clear();
        this.m_groupNameList.clear();
        for (int i2 = 0; i2 < checkedItemPositions.size(); i2++) {
            if (checkedItemPositions.valueAt(i2)) {
                this.m_groupIdList.add(((C7966c) list.get(checkedItemPositions.keyAt(i2))).f19106a);
                this.m_groupNameList.add(((C7966c) list.get(checkedItemPositions.keyAt(i2))).f19107b);
            }
        }
        this.m_option = this.workingOption;
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static /* synthetic */ void m21806F3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m21807G3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, false, true, C17542R$style.Theme_App_Dialog_Trigger_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void m21808H3(EditText editText, CheckBox checkBox, AppCompatDialog appCompatDialog, View view) {
        this.m_phoneNumber = editText.getText().toString();
        this.m_phoneNumberExclude = checkBox.isChecked();
        appCompatDialog.dismiss();
        this.m_option = this.workingOption;
        mo24689O1();
    }

    /* renamed from: J3 */
    private void m21810J3() {
        List<C7966c> B = C4061t1.m15946B(mo27827K0());
        boolean[] zArr = new boolean[B.size()];
        String[] strArr = new String[B.size()];
        boolean z = false;
        for (int i = 0; i < B.size(); i++) {
            strArr[i] = B.get(i).f19107b;
            if (this.m_groupIdList.contains(B.get(i).f19106a)) {
                zArr[i] = true;
                z = true;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_groups);
        builder.setMultiChoiceItems((CharSequence[]) strArr, zArr, (DialogInterface.OnMultiChoiceClickListener) C5954i1.f14100a);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5942h1(this, B));
        AlertDialog create = builder.create();
        create.show();
        if (!z) {
            create.getButton(-1).setEnabled(false);
        }
    }

    /* renamed from: K3 */
    private void m21811K3() {
        if (mo27836X()) {
            Activity j0 = mo27850j0();
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.enter_number_dialog);
            appCompatDialog.setTitle((CharSequence) SelectableItem.m15535j1(C17541R$string.select_number));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            appCompatDialog.getWindow().setAttributes(layoutParams);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.enter_number_dialog_phone_number);
            Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.enter_number_dialog_magic_text_button);
            CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.exclude_number);
            boolean z = false;
            checkBox.setVisibility(0);
            ((TextView) appCompatDialog.findViewById(C17532R$id.wildcard_Text)).setVisibility(0);
            checkBox.setChecked(this.m_phoneNumberExclude);
            String str = this.m_phoneNumber;
            if (str != null) {
                editText.setText(str);
                editText.setSelection(editText.length());
            }
            editText.addTextChangedListener(new C5615b(button, editText));
            button3.setOnClickListener(new C5978k1(this, j0, new C6002m1(editText)));
            button.setOnClickListener(new C5990l1(this, editText, checkBox, appCompatDialog));
            if (editText.getText().length() > 0) {
                z = true;
            }
            button.setEnabled(z);
            button2.setOnClickListener(new C5966j1(appCompatDialog));
            appCompatDialog.show();
        }
    }

    /* renamed from: g3 */
    private String[] m21812g3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.select_contacts), SelectableItem.m15535j1(C17541R$string.select_groups), SelectableItem.m15535j1(C17541R$string.select_number), SelectableItem.m15535j1(C17541R$string.any_number)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (this.workingOption == 0) {
            List<Contact> u3 = mo31001u3();
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= u3.size()) {
                    break;
                } else if (u3.get(i2).mo27709b().equals("-2")) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i >= 0) {
                u3.remove(i);
                this.workingOption = 3;
                return 3;
            }
        }
        return this.workingOption;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(C17541R$string.trigger_call_active);
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        int i = this.m_option;
        if (i != 0) {
            return (i == 1 && this.m_groupIdList.size() == 0) ? false : true;
        }
        if (mo31001u3().size() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        int i = this.m_option;
        if (i == 3) {
            return SelectableItem.m15535j1(C17541R$string.any_number);
        }
        String str = "";
        if (i == 0) {
            if (this.isExclude) {
                str = SelectableItem.m15535j1(C17541R$string.excludes) + " ";
            }
            if (mo31001u3().size() == 1) {
                return str + this.m_contactList.get(0).mo27713g();
            } else if (mo31001u3().size() == 0) {
                return Contact.m15400i();
            } else {
                return str + this.m_contactList.toString();
            }
        } else if (i == 1) {
            if (this.m_groupNameList.size() == 1) {
                return this.m_groupNameList.get(0);
            }
            return this.m_groupNameList.toString();
        } else if (i != 2) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder();
            if (this.m_phoneNumberExclude) {
                str = SelectableItem.m15535j1(C17541R$string.excludes) + " ";
            }
            sb.append(str);
            sb.append(this.m_phoneNumber);
            return sb.toString();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002c */
    /* renamed from: S2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30885S2() {
        /*
            r5 = this;
            int r0 = s_callActiveTriggerCounter
            r1 = 1
            int r0 = r0 - r1
            s_callActiveTriggerCounter = r0
            if (r0 != 0) goto L_0x0053
            com.arlosoft.macrodroid.triggers.receivers.OutgoingCallMonitor r0 = s_outgoingCallMonitor     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0015
            android.content.Context r0 = r5.mo27827K0()     // Catch:{ Exception -> 0x004f }
            com.arlosoft.macrodroid.triggers.receivers.OutgoingCallMonitor r2 = s_outgoingCallMonitor     // Catch:{ Exception -> 0x004f }
            r0.unregisterReceiver(r2)     // Catch:{ Exception -> 0x004f }
        L_0x0015:
            n3.d r0 = s_incomingCallMonitor     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x003c
            android.content.Context r0 = r5.mo27827K0()     // Catch:{ Exception -> 0x004f }
            java.lang.String r2 = "phone"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ Exception -> 0x004f }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x004f }
            r2 = 0
            n3.d r3 = s_incomingCallMonitor     // Catch:{ SecurityException -> 0x002c }
            r0.listen(r3, r2)     // Catch:{ SecurityException -> 0x002c }
            goto L_0x003c
        L_0x002c:
            android.content.Context r0 = r5.mo27827K0()     // Catch:{ Exception -> 0x004f }
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            r4 = 2131955192(0x7f130df8, float:1.9546905E38)
            java.lang.String r4 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r4)     // Catch:{ Exception -> 0x004f }
            p112j2.C7439d0.m30909o0(r0, r3, r4, r1, r2)     // Catch:{ Exception -> 0x004f }
        L_0x003c:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x004f }
            android.content.Context r1 = r5.mo27827K0()     // Catch:{ Exception -> 0x004f }
            java.lang.Class<com.arlosoft.macrodroid.triggers.services.PhoneStateMonitorService> r2 = com.arlosoft.macrodroid.triggers.services.PhoneStateMonitorService.class
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x004f }
            com.arlosoft.macrodroid.app.MacroDroidApplication r1 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ Exception -> 0x004f }
            r1.stopService(r0)     // Catch:{ Exception -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r0 = move-exception
            p148q0.C8151a.m33873n(r0)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.CallActiveTrigger.mo30885S2():void");
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7536o.m31361u();
    }

    /* renamed from: U */
    public void mo25131U() {
        super.mo25131U();
        ArrayList arrayList = new ArrayList();
        for (Contact next : this.m_contactList) {
            if (next.mo27709b().equals("-1")) {
                arrayList.add(0, new Contact("-1", C4061t1.f10624d, "-1"));
            } else if (next.mo27709b().equals("-2")) {
                arrayList.add(0, new Contact("-2", C4061t1.f10625e, "-2"));
            } else if (next.mo27709b().equals("-3")) {
                arrayList.add(0, new Contact("-3", C4061t1.f10626f, "-3"));
            } else if (next.mo27709b().equals("-4")) {
                arrayList.add(0, new Contact("-4", C4061t1.f10627g, "-4"));
            }
        }
        this.m_contactList = arrayList;
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + C6413o0.m24694c(mo24672O0(), 15) + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_callActiveTriggerCounter == 0) {
            if (s_outgoingCallMonitor == null) {
                try {
                    s_outgoingCallMonitor = new OutgoingCallMonitor();
                } catch (Exception unused) {
                    new Handler(mo27827K0().getMainLooper()).post(C6026o1.f14246a);
                }
            }
            if (s_incomingCallMonitor == null) {
                try {
                    s_incomingCallMonitor = new C7972d();
                } catch (Exception unused2) {
                    new Handler(mo27827K0().getMainLooper()).post(C6038p1.f14276a);
                }
            }
            MacroDroidApplication.m14845u().startService(new Intent(mo27827K0(), PhoneStateMonitorService.class));
            mo27827K0().registerReceiver(s_outgoingCallMonitor, new IntentFilter("android.intent.action.NEW_OUTGOING_CALL"));
            new Handler(mo27827K0().getMainLooper()).post(new C6014n1(this));
        }
        s_callActiveTriggerCounter++;
    }

    /* renamed from: Y2 */
    public TriggerContextInfo mo30911Y2() {
        return new TriggerContextInfo((Trigger) this, "01234567890");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24825a0() {
        /*
            r9 = this;
            int r0 = r9.m_option
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x007c
            r9.mo31001u3()
            android.content.Context r0 = r9.mo27827K0()
            java.util.List r0 = com.arlosoft.macrodroid.common.C4061t1.m15950D(r0)
            com.arlosoft.macrodroid.common.Contact r3 = new com.arlosoft.macrodroid.common.Contact
            java.lang.String r4 = com.arlosoft.macrodroid.common.C4061t1.f10627g
            java.lang.String r5 = "-4"
            r3.<init>(r5, r4, r5)
            r0.add(r2, r3)
            com.arlosoft.macrodroid.common.Contact r3 = new com.arlosoft.macrodroid.common.Contact
            java.lang.String r4 = com.arlosoft.macrodroid.common.C4061t1.f10624d
            java.lang.String r5 = "-1"
            r3.<init>(r5, r4, r5)
            r0.add(r2, r3)
            com.arlosoft.macrodroid.common.Contact r3 = new com.arlosoft.macrodroid.common.Contact
            java.lang.String r4 = com.arlosoft.macrodroid.common.C4061t1.f10625e
            java.lang.String r5 = "-2"
            r3.<init>(r5, r4, r5)
            r0.add(r2, r3)
            com.arlosoft.macrodroid.common.Contact r3 = new com.arlosoft.macrodroid.common.Contact
            java.lang.String r4 = com.arlosoft.macrodroid.common.C4061t1.f10626f
            java.lang.String r5 = "-3"
            r3.<init>(r5, r4, r5)
            r0.add(r2, r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0045:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0073
            java.lang.Object r3 = r0.next()
            com.arlosoft.macrodroid.common.Contact r3 = (com.arlosoft.macrodroid.common.Contact) r3
            java.util.List<com.arlosoft.macrodroid.common.Contact> r4 = r9.m_contactList
            java.util.Iterator r4 = r4.iterator()
        L_0x0057:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r4.next()
            com.arlosoft.macrodroid.common.Contact r5 = (com.arlosoft.macrodroid.common.Contact) r5
            java.lang.String r6 = r3.mo27713g()
            java.lang.String r5 = r5.mo27713g()
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0057
            r2 = 1
            goto L_0x0045
        L_0x0073:
            if (r2 != 0) goto L_0x007a
            java.util.List<com.arlosoft.macrodroid.common.Contact> r0 = r9.m_contactList
            r0.clear()
        L_0x007a:
            r1 = r2
            goto L_0x00d9
        L_0x007c:
            if (r0 != r1) goto L_0x00d9
            android.content.Context r0 = r9.mo27827K0()
            java.util.List r0 = com.arlosoft.macrodroid.common.C4061t1.m15946B(r0)
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x00d8
            r3 = 0
        L_0x008d:
            java.util.List<java.lang.String> r4 = r9.m_groupIdList
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x00ca
            java.util.List<java.lang.String> r4 = r9.m_groupIdList
            java.lang.Object r4 = r4.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.util.List<java.lang.String> r5 = r9.m_groupNameList
            java.lang.Object r5 = r5.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            java.util.Iterator r6 = r0.iterator()
        L_0x00a9:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00c7
            java.lang.Object r7 = r6.next()
            n1.c r7 = (p135n1.C7966c) r7
            java.lang.String r8 = r7.f19106a
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x00a9
            java.lang.String r7 = r7.f19107b
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x00a9
            r3 = 1
            goto L_0x00a9
        L_0x00c7:
            int r2 = r2 + 1
            goto L_0x008d
        L_0x00ca:
            if (r3 != 0) goto L_0x00d6
            java.util.List<java.lang.String> r0 = r9.m_groupNameList
            r0.clear()
            java.util.List<java.lang.String> r0 = r9.m_groupIdList
            r0.clear()
        L_0x00d6:
            r1 = r3
            goto L_0x00d9
        L_0x00d8:
            r1 = 0
        L_0x00d9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.CallActiveTrigger.mo24825a0():boolean");
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_PHONE_STATE", "android.permission.READ_CONTACTS", "android.permission.READ_CALL_LOG"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m21812g3();
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: u3 */
    public List<Contact> mo31001u3() {
        return this.m_contactList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.workingOption;
        if (i == 0) {
            C7897h.m33052c(mo27850j0(), mo24688L0(), mo31001u3(), (Contact) null, this.isExclude, true, false, new C5614a());
        } else if (i == 1) {
            m21810J3();
        } else if (i == 2) {
            m21811K3();
        } else if (i == 3) {
            this.m_option = i;
            mo24689O1();
        }
    }

    /* renamed from: v3 */
    public boolean mo31002v3() {
        return this.m_phoneNumberExclude;
    }

    /* renamed from: w3 */
    public List<String> mo31003w3() {
        return this.m_groupIdList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        Contact[] contactArr = new Contact[this.m_contactList.size()];
        this.m_contactList.toArray(contactArr);
        parcel.writeParcelableArray(contactArr, i);
        parcel.writeInt(this.m_option);
        parcel.writeString(this.m_phoneNumber);
        parcel.writeInt(this.m_phoneNumberExclude ? 1 : 0);
        parcel.writeStringList(this.m_groupIdList);
        parcel.writeStringList(this.m_groupNameList);
        parcel.writeInt(this.isExclude ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.workingOption = i;
    }

    /* renamed from: x3 */
    public String mo31004x3() {
        return this.m_phoneNumber;
    }

    /* renamed from: y3 */
    public int mo31005y3() {
        return this.m_option;
    }

    /* renamed from: z3 */
    public boolean mo31006z3() {
        return this.isExclude;
    }

    public CallActiveTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public CallActiveTrigger() {
        this.m_secondaryClassType = "CallActiveTrigger";
        m21803D1();
        this.m_contactList = new ArrayList();
    }

    private CallActiveTrigger(Parcel parcel) {
        super(parcel);
        this.m_secondaryClassType = "CallActiveTrigger";
        m21803D1();
        Parcelable[] readParcelableArray = parcel.readParcelableArray(Contact.class.getClassLoader());
        if (readParcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            this.m_contactList = arrayList;
            Collections.addAll(arrayList, (Contact[]) Arrays.copyOf(readParcelableArray, readParcelableArray.length, Contact[].class));
        }
        this.m_option = parcel.readInt();
        this.m_phoneNumber = parcel.readString();
        boolean z = true;
        this.m_phoneNumberExclude = parcel.readInt() != 0;
        parcel.readStringList(this.m_groupIdList);
        parcel.readStringList(this.m_groupNameList);
        this.isExclude = parcel.readInt() == 0 ? false : z;
    }
}
