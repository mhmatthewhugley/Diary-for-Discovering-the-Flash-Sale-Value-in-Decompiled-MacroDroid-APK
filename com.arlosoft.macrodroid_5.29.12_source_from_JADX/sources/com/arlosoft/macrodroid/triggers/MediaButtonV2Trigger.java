package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.PreferencesActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p119k3.C7575y0;
import p131m3.C7903a;
import p131m3.C7904g;

/* compiled from: MediaButtonV2Trigger.kt */
public final class MediaButtonV2Trigger extends Trigger {
    public static final Parcelable.Creator<MediaButtonV2Trigger> CREATOR = new C5698a();
    private static final String[] OPTIONS;

    /* renamed from: f */
    public static final C5699b f13649f = new C5699b((C13695i) null);
    private static int triggerCount;

    /* renamed from: d */
    public transient C7904g f13650d;
    private boolean[] optionsEnabledArray;

    /* renamed from: com.arlosoft.macrodroid.triggers.MediaButtonV2Trigger$a */
    /* compiled from: MediaButtonV2Trigger.kt */
    public static final class C5698a implements Parcelable.Creator<MediaButtonV2Trigger> {
        C5698a() {
        }

        /* renamed from: a */
        public MediaButtonV2Trigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new MediaButtonV2Trigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public MediaButtonV2Trigger[] newArray(int i) {
            return new MediaButtonV2Trigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.MediaButtonV2Trigger$b */
    /* compiled from: MediaButtonV2Trigger.kt */
    public static final class C5699b {
        private C5699b() {
        }

        public /* synthetic */ C5699b(C13695i iVar) {
            this();
        }
    }

    static {
        C7903a[] values = C7903a.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (C7903a e : values) {
            arrayList.add(SelectableItem.m15535j1(e.mo37795e()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        OPTIONS = (String[]) array;
    }

    public MediaButtonV2Trigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ MediaButtonV2Trigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private final void m22693D1() {
        MacroDroidApplication.f9883I.mo27302a().mo38298c(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m22697j3(Activity activity, View view) {
        Intent intent = new Intent(activity, PreferencesActivity.class);
        intent.putExtra("shortcut", 3);
        activity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m22698k3(ListView listView, MediaButtonV2Trigger mediaButtonV2Trigger, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(listView, "$listView");
        C13706o.m87929f(mediaButtonV2Trigger, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        int length = mediaButtonV2Trigger.optionsEnabledArray.length;
        for (int i = 0; i < length; i++) {
            mediaButtonV2Trigger.optionsEnabledArray[i] = checkedItemPositions.get(i);
        }
        appCompatDialog.dismiss();
        mediaButtonV2Trigger.mo27873w2();
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m22699l3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        boolean[] zArr = this.optionsEnabledArray;
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            if (zArr[i]) {
                sb.append(OPTIONS[i2]);
                sb.append(", ");
            }
            i++;
            i2 = i3;
        }
        if (!(sb.length() > 0)) {
            return "";
        }
        String substring = sb.substring(0, sb.length() - 2);
        C13706o.m87928e(substring, "stringBuilder.substring(…stringBuilder.length - 2)");
        return substring;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = triggerCount - 1;
        triggerCount = i;
        if (i == 0) {
            try {
                mo31327m3().mo37796A();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        C4001c1 u = C7575y0.m31538u();
        C13706o.m87928e(u, "getInstance()");
        return u;
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (triggerCount == 0) {
            mo31327m3().mo37797y();
        }
        triggerCount++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return OPTIONS;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public AlertDialog mo24883h0() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, C17542R$style.Theme_App_Dialog_Trigger);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_media_button_v2_trigger);
        appCompatDialog.setTitle((int) C17541R$string.select_option);
        View findViewById = appCompatDialog.findViewById(2131363053);
        C13706o.m87926c(findViewById);
        ListView listView = (ListView) findViewById;
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.triggerOptions);
        C13706o.m87926c(findViewById2);
        TextView textView = (TextView) findViewById2;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        textView.setOnClickListener(new C5811a5(j0));
        ArrayAdapter arrayAdapter = new ArrayAdapter(appCompatDialog.getContext(), C17535R$layout.multi_choice_list_item, OPTIONS);
        listView.setAdapter(arrayAdapter);
        listView.setChoiceMode(2);
        int count = arrayAdapter.getCount();
        for (int i = 0; i < count; i++) {
            listView.setItemChecked(i, this.optionsEnabledArray[i]);
        }
        if (button != null) {
            button.setOnClickListener(new C5874b5(listView, this, appCompatDialog));
        }
        if (button2 != null) {
            button2.setOnClickListener(new C5886c5(appCompatDialog));
        }
        appCompatDialog.show();
        return null;
    }

    /* renamed from: m3 */
    public final C7904g mo31327m3() {
        C7904g gVar = this.f13650d;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("mediaButtonDetection");
        return null;
    }

    /* renamed from: n3 */
    public final boolean mo31328n3(C7903a aVar) {
        C13706o.m87929f(aVar, "mediaButton");
        return this.optionsEnabledArray[aVar.mo37794d()];
    }

    /* renamed from: q2 */
    public boolean mo24773q2() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeBooleanArray(this.optionsEnabledArray);
    }

    public MediaButtonV2Trigger() {
        this.optionsEnabledArray = new boolean[OPTIONS.length];
        m22693D1();
    }

    private MediaButtonV2Trigger(Parcel parcel) {
        super(parcel);
        String[] strArr = OPTIONS;
        this.optionsEnabledArray = new boolean[strArr.length];
        m22693D1();
        boolean[] zArr = new boolean[strArr.length];
        this.optionsEnabledArray = zArr;
        parcel.readBooleanArray(zArr);
    }
}
