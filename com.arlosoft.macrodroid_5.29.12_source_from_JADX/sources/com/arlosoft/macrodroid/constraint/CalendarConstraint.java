package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4034l;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6413o0;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.Date;
import java.util.List;
import p057a2.C2224m;
import p092g1.C7326a;
import p092g1.C7327b;
import p112j2.C7439d0;
import p123l1.C7618i;
import p148q0.C8151a;
import p319lc.C15626c;

public class CalendarConstraint extends Constraint implements C2224m {
    public static final Parcelable.Creator<CalendarConstraint> CREATOR = new C4125b();
    private boolean enableRegex;
    private int m_availability;
    /* access modifiers changed from: private */
    public String m_calendarId;
    /* access modifiers changed from: private */
    public String m_calendarName;
    private String m_detailText;
    private boolean m_entrySet;
    private boolean m_ignoreAllDay;
    private String m_titleText;

    /* renamed from: com.arlosoft.macrodroid.constraint.CalendarConstraint$a */
    class C4124a implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ List f10709a;

        C4124a(List list) {
            this.f10709a = list;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String unused = CalendarConstraint.this.m_calendarId = ((C7327b) this.f10709a.get(i)).f17928a;
            String unused2 = CalendarConstraint.this.m_calendarName = ((C7327b) this.f10709a.get(i)).f17929c;
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.CalendarConstraint$b */
    class C4125b implements Parcelable.Creator<CalendarConstraint> {
        C4125b() {
        }

        /* renamed from: a */
        public CalendarConstraint createFromParcel(Parcel parcel) {
            return new CalendarConstraint(parcel, (C4124a) null);
        }

        /* renamed from: b */
        public CalendarConstraint[] newArray(int i) {
            return new CalendarConstraint[i];
        }
    }

    /* synthetic */ CalendarConstraint(Parcel parcel, C4124a aVar) {
        this(parcel);
    }

    /* renamed from: p3 */
    private void m16266p3() {
        Pair<String, List<C7327b>> d = C7327b.m30262d(mo27827K0());
        String str = (String) d.first;
        List list = (List) d.second;
        if (list.size() == 0) {
            C15626c.m94876a(mo27827K0().getApplicationContext(), mo27827K0().getString(C17541R$string.action_add_calendar_event_no_calendars), 1).show();
            return;
        }
        if (this.m_calendarId == null) {
            this.m_calendarId = str;
        }
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                i = 0;
                break;
            } else if (((C7327b) list.get(i)).f17928a.equals(this.m_calendarId)) {
                break;
            } else {
                i++;
            }
        }
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.calendar_configure);
        appCompatDialog.setTitle((CharSequence) mo27827K0().getString(C17541R$string.constraint_calendar_select_option));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.calendar_configure_title);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.calendar_configure_spinner);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.calendar_configure_in_event);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.calendar_configure_not_in_event);
        Spinner spinner2 = (Spinner) appCompatDialog.findViewById(C17532R$id.calendar_configure_availability_spinner);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.select_calendar_spinner);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.calendar_configure_detail_magic_text);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.enable_regex);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.calendar_configure_title_magic_text);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.ignore_all_day);
        Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.calendar_configure_detail);
        AppCompatDialog appCompatDialog2 = appCompatDialog;
        checkBox2.setChecked(this.m_ignoreAllDay);
        ((CheckBox) appCompatDialog.findViewById(C17532R$id.check_in_advance)).setVisibility(8);
        ((CheckBox) appCompatDialog.findViewById(C17532R$id.use_alarm)).setVisibility(8);
        ((TextView) appCompatDialog.findViewById(C17532R$id.use_alarm_description)).setVisibility(8);
        spinner2.setSelection(this.m_availability);
        if (list.size() > 1) {
            spinner.setVisibility(0);
            C7326a aVar = new C7326a(j0, list);
            aVar.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
            spinner.setAdapter(aVar);
            spinner.setSelection(i);
        } else {
            spinner.setVisibility(8);
            textView.setVisibility(8);
        }
        radioButton.setChecked(this.m_entrySet);
        radioButton2.setChecked(!this.m_entrySet);
        checkBox.setChecked(this.enableRegex);
        radioButton.setOnCheckedChangeListener(new C4306q(this));
        spinner.setOnItemSelectedListener(new C4124a(list));
        String str2 = this.m_titleText;
        if (str2 != null) {
            editText.setText(str2);
            editText.setSelection(editText.length());
        }
        String str3 = this.m_detailText;
        EditText editText3 = editText2;
        if (str3 != null) {
            editText3.setText(str3);
            editText3.setSelection(editText3.length());
        }
        button4.setOnClickListener(new C4301p(this, appCompatDialog2, editText, editText3, spinner2, checkBox2, checkBox));
        AppCompatDialog appCompatDialog3 = appCompatDialog2;
        button3.setOnClickListener(new C4286m(appCompatDialog3));
        button2.setOnClickListener(new C4296o(this, j0, new C4316s(editText)));
        button.setOnClickListener(new C4291n(this, j0, new C4311r(editText3)));
        appCompatDialog3.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m16267q3(CompoundButton compoundButton, boolean z) {
        this.m_entrySet = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m16268r3(AppCompatDialog appCompatDialog, EditText editText, EditText editText2, Spinner spinner, CheckBox checkBox, CheckBox checkBox2, View view) {
        appCompatDialog.cancel();
        this.m_titleText = editText.getText().toString();
        this.m_detailText = editText2.getText().toString();
        this.m_availability = spinner.getSelectedItemPosition();
        this.m_ignoreAllDay = checkBox.isChecked();
        this.enableRegex = checkBox2.isChecked();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static /* synthetic */ void m16270t3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m16271u3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Constraint_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static /* synthetic */ void m16272v3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m16273w3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Constraint_SmallText, mo24686E1());
    }

    /* renamed from: x3 */
    private static C4034l m16274x3(Cursor cursor) {
        return new C4034l(cursor.getString(0), cursor.getString(1), new Date(cursor.getLong(2)), new Date(cursor.getLong(3)), !cursor.getString(4).equals("0"), cursor.getInt(5), cursor.getString(6), cursor.getString(7));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013f, code lost:
        if (com.arlosoft.macrodroid.utils.C6460y1.m24792d(r6.mo27937g().toLowerCase(), r8, r0.enableRegex) == false) goto L_0x00c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x014d A[EDGE_INSN: B:55:0x014d->B:49:0x014d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a5 A[SYNTHETIC] */
    /* renamed from: y3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m16275y3(boolean r20, com.arlosoft.macrodroid.triggers.TriggerContextInfo r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            android.content.Context r3 = r19.mo27827K0()
            android.content.ContentResolver r4 = r3.getContentResolver()
            java.lang.String r3 = "content://com.android.calendar/instances/when"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.util.Date r5 = new java.util.Date
            r5.<init>()
            long r5 = r5.getTime()
            if (r1 == 0) goto L_0x002d
            java.util.TimeZone r7 = java.util.TimeZone.getDefault()
            int r7 = r7.getRawOffset()
            long r7 = (long) r7
            long r5 = r5 + r7
        L_0x002d:
            android.content.ContentUris.appendId(r3, r5)
            android.content.ContentUris.appendId(r3, r5)
            java.lang.String r5 = r0.m_calendarId
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r10 = 1
            if (r5 == 0) goto L_0x004a
            java.lang.Long r1 = r19.mo27840Y0()
            long r1 = r1.longValue()
            java.lang.String r3 = "Calendar Receiver - Calendar id is empty (ignoring constraint)"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r3, r1)
            return r10
        L_0x004a:
            android.net.Uri r5 = r3.build()
            java.lang.String r11 = "title"
            java.lang.String r12 = "description"
            java.lang.String r13 = "dtstart"
            java.lang.String r14 = "dtend"
            java.lang.String r15 = "allDay"
            java.lang.String r16 = "availability"
            java.lang.String r17 = "eventLocation"
            java.lang.String r18 = "event_id"
            java.lang.String[] r6 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18}
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "calendar_id="
            r3.append(r7)
            java.lang.String r7 = r0.m_calendarId
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r8 = 0
            r9 = 0
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9)
            r4 = 0
            if (r3 == 0) goto L_0x014c
            int r5 = r3.getCount()
            if (r5 <= 0) goto L_0x014c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.moveToFirst()
            com.arlosoft.macrodroid.common.l r6 = m16274x3(r3)
            r5.add(r6)
        L_0x0093:
            boolean r6 = r3.moveToNext()
            if (r6 == 0) goto L_0x00a1
            com.arlosoft.macrodroid.common.l r6 = m16274x3(r3)
            r5.add(r6)
            goto L_0x0093
        L_0x00a1:
            java.util.Iterator r5 = r5.iterator()
        L_0x00a5:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x014c
            java.lang.Object r6 = r5.next()
            com.arlosoft.macrodroid.common.l r6 = (com.arlosoft.macrodroid.common.C4034l) r6
            boolean r7 = r6.mo27941k()
            if (r7 == r1) goto L_0x00b8
            goto L_0x00a5
        L_0x00b8:
            int r7 = r0.m_availability
            if (r7 <= 0) goto L_0x00c7
            int r7 = r7 + -1
            int r8 = r6.mo27934e()
            if (r7 == r8) goto L_0x00c7
        L_0x00c4:
            r7 = 0
            goto L_0x0142
        L_0x00c7:
            boolean r7 = r6.mo27941k()
            if (r7 == 0) goto L_0x00d2
            boolean r7 = r0.m_ignoreAllDay
            if (r7 == 0) goto L_0x00d2
            goto L_0x00c4
        L_0x00d2:
            java.lang.String r7 = r0.m_titleText
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x010a
            android.content.Context r7 = r19.mo27827K0()
            java.lang.String r8 = r0.m_titleText
            com.arlosoft.macrodroid.macro.Macro r9 = r19.mo27837X0()
            java.lang.String r7 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r7, r8, r2, r9)
            java.lang.String r7 = r7.toLowerCase()
            boolean r8 = r0.enableRegex
            java.lang.String r7 = com.arlosoft.macrodroid.utils.C6460y1.m24791c(r7, r8)
            java.lang.String r8 = r6.mo27940j()
            if (r8 == 0) goto L_0x010a
            java.lang.String r8 = r6.mo27940j()
            java.lang.String r8 = r8.toLowerCase()
            boolean r9 = r0.enableRegex
            boolean r7 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r8, r7, r9)
            if (r7 != 0) goto L_0x010a
            r7 = 0
            goto L_0x010b
        L_0x010a:
            r7 = 1
        L_0x010b:
            java.lang.String r8 = r0.m_detailText
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0142
            android.content.Context r8 = r19.mo27827K0()
            java.lang.String r9 = r0.m_detailText
            com.arlosoft.macrodroid.macro.Macro r11 = r19.mo27837X0()
            java.lang.String r8 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r8, r9, r2, r11)
            java.lang.String r8 = r8.toLowerCase()
            boolean r9 = r0.enableRegex
            java.lang.String r8 = com.arlosoft.macrodroid.utils.C6460y1.m24791c(r8, r9)
            java.lang.String r9 = r6.mo27937g()
            if (r9 == 0) goto L_0x0142
            java.lang.String r6 = r6.mo27937g()
            java.lang.String r6 = r6.toLowerCase()
            boolean r9 = r0.enableRegex
            boolean r6 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r6, r8, r9)
            if (r6 != 0) goto L_0x0142
            goto L_0x00c4
        L_0x0142:
            boolean r6 = r0.m_entrySet
            if (r6 == 0) goto L_0x0149
            if (r7 == 0) goto L_0x0149
            return r10
        L_0x0149:
            if (r7 == 0) goto L_0x00a5
            goto L_0x014d
        L_0x014c:
            r10 = 0
        L_0x014d:
            if (r3 == 0) goto L_0x0152
            r3.close()
        L_0x0152:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.CalendarConstraint.m16275y3(boolean, com.arlosoft.macrodroid.triggers.TriggerContextInfo):boolean");
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_titleText, this.m_detailText};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 2) {
            this.m_titleText = strArr[0];
            this.m_detailText = strArr[1];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        Cursor query;
        if (ContextCompat.checkSelfPermission(mo27827K0(), "android.permission.READ_CALENDAR") != 0 || (query = mo27827K0().getContentResolver().query(Uri.parse("content://com.android.calendar/calendars"), new String[]{Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID, "calendar_displayName"}, (String) null, (String[]) null, (String) null)) == null) {
            return true;
        }
        if (!TextUtils.isEmpty(this.m_calendarName)) {
            while (query.moveToNext()) {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (string2 != null && string2.equals(this.m_calendarName)) {
                    this.m_calendarId = string;
                    query.close();
                    return true;
                }
            }
            this.m_calendarId = "";
            this.m_calendarName = "";
            query.close();
            return false;
        }
        while (query.moveToNext()) {
            String string3 = query.getString(0);
            String string4 = query.getString(1);
            if (this.m_calendarId.equals(string3)) {
                this.m_calendarName = string4;
                query.close();
                return true;
            }
        }
        this.m_calendarId = "";
        this.m_calendarName = "";
        query.close();
        return false;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (TextUtils.isEmpty(this.m_calendarId)) {
            return "[" + SelectableItem.m15535j1(C17541R$string.select_calendar) + "]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(SelectableItem.m15535j1(this.m_entrySet ? C17541R$string.constraint_calendar_in_event : C17541R$string.constraint_calendar_not_in_event));
        sb.append(": ");
        sb.append("(");
        sb.append(mo27827K0().getResources().getStringArray(C17525R$array.availability_options)[this.m_availability]);
        sb.append(")");
        sb.append(" ");
        sb.append(this.m_titleText);
        if (!TextUtils.isEmpty(this.m_calendarName)) {
            sb.append(" [");
            sb.append(this.m_calendarName);
            sb.append("]");
        }
        return sb.toString();
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        if (ContextCompat.checkSelfPermission(mo27827K0(), "android.permission.READ_CALENDAR") != 0) {
            C7439d0.m30909o0(mo27827K0(), "android.permission.READ_CALENDAR", mo25559a1(), true, false);
            return false;
        }
        boolean y3 = m16275y3(false, triggerContextInfo);
        if (y3) {
            if (y3 == this.m_entrySet) {
                return true;
            }
            return false;
        } else if (!this.m_ignoreAllDay) {
            if (m16275y3(true, triggerContextInfo) == this.m_entrySet) {
                return true;
            }
            return false;
        } else if (y3 == this.m_entrySet) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7618i.m31727u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        String str = !TextUtils.isEmpty(this.m_titleText) ? this.m_titleText : this.m_detailText;
        if (TextUtils.isEmpty(str)) {
            return mo24738G0();
        }
        return mo24738G0() + " (" + C6413o0.m24693b(str, 20) + ")";
    }

    /* renamed from: a0 */
    public boolean mo24825a0() {
        if (mo24824M1()) {
            return true;
        }
        this.m_calendarId = "";
        this.m_calendarName = "";
        return false;
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_CALENDAR"};
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        String str = !TextUtils.isEmpty(this.m_titleText) ? this.m_titleText : this.m_detailText;
        if (TextUtils.isEmpty(str)) {
            return mo24738G0();
        }
        return mo24738G0() + " (" + C6413o0.m24693b(str, 200) + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m16266p3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_calendarId);
        parcel.writeString(this.m_calendarName);
        parcel.writeInt(this.m_entrySet ? 1 : 0);
        parcel.writeString(this.m_titleText);
        parcel.writeString(this.m_detailText);
        parcel.writeInt(this.m_availability);
        parcel.writeInt(this.m_ignoreAllDay ? 1 : 0);
        parcel.writeInt(this.enableRegex ? 1 : 0);
    }

    public CalendarConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private CalendarConstraint() {
        this.m_entrySet = true;
    }

    private CalendarConstraint(Parcel parcel) {
        super(parcel);
        this.m_calendarId = parcel.readString();
        this.m_calendarName = parcel.readString();
        boolean z = true;
        this.m_entrySet = parcel.readInt() != 0;
        this.m_titleText = parcel.readString();
        this.m_detailText = parcel.readString();
        this.m_availability = parcel.readInt();
        this.m_ignoreAllDay = parcel.readInt() != 0;
        this.enableRegex = parcel.readInt() == 0 ? false : z;
    }
}
