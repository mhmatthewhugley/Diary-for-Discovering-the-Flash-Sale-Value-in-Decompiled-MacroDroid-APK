package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.activities.WidgetConfigureActivity;
import java.util.ArrayList;
import java.util.Arrays;
import p057a2.C2224m;
import p119k3.C7514i2;
import p148q0.C8151a;

public class WidgetPressedTrigger extends Trigger implements C2224m {
    public static final Parcelable.Creator<WidgetPressedTrigger> CREATOR = new C5796a();
    private static int REQUEST_CODE_WIDGET_CONFIGURE = 9823123;
    private String m_currentLabel;
    private int m_imageId;
    private String m_imagePackageName;
    private String m_imageResourceName;
    private String m_imageUri;
    private String m_widgetLabel;
    private int m_widgetType;

    /* renamed from: com.arlosoft.macrodroid.triggers.WidgetPressedTrigger$a */
    class C5796a implements Parcelable.Creator<WidgetPressedTrigger> {
        C5796a() {
        }

        /* renamed from: a */
        public WidgetPressedTrigger createFromParcel(Parcel parcel) {
            return new WidgetPressedTrigger(parcel, (C5796a) null);
        }

        /* renamed from: b */
        public WidgetPressedTrigger[] newArray(int i) {
            return new WidgetPressedTrigger[i];
        }
    }

    /* synthetic */ WidgetPressedTrigger(Parcel parcel, C5796a aVar) {
        this(parcel);
    }

    /* renamed from: n3 */
    public static String[] m23713n3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_widget_pressed_custom), SelectableItem.m15535j1(C17541R$string.trigger_widget_pressed_green), SelectableItem.m15535j1(C17541R$string.trigger_widget_pressed_blue), SelectableItem.m15535j1(C17541R$string.trigger_widget_pressed_red), SelectableItem.m15535j1(C17541R$string.trigger_widget_pressed_yellow)};
    }

    /* renamed from: o3 */
    private int m23714o3(int i) {
        int i2 = i - 1;
        return i2 < 0 ? m23713n3().length - 1 : i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return (this.m_widgetType + 1) % m23713n3().length;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_widgetLabel};
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(C17541R$string.trigger_widget_pressed) + " (" + m23713n3()[(this.m_widgetType + 1) % m23713n3().length] + ")";
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_widgetLabel = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: S2 */
    public void mo30885S2() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7514i2.m31256u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return (String[]) new ArrayList(Arrays.asList(m23713n3())).toArray(new String[0]);
    }

    /* renamed from: g3 */
    public String mo31654g3() {
        String str = this.m_currentLabel;
        return str != null ? str : mo31659l3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return SelectableItem.m15535j1(C17541R$string.trigger_widget_pressed_select);
    }

    /* renamed from: h3 */
    public String mo31655h3() {
        return this.m_imageResourceName;
    }

    /* renamed from: i3 */
    public int mo31656i3() {
        return this.m_imageId;
    }

    /* renamed from: j3 */
    public Uri mo31657j3() {
        String str = this.m_imageUri;
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }

    /* renamed from: k3 */
    public String mo31658k3() {
        return this.m_imagePackageName;
    }

    /* renamed from: l3 */
    public String mo31659l3() {
        return C4023j0.m15760t0(mo27827K0(), this.m_widgetLabel, (TriggerContextInfo) null, mo27837X0());
    }

    /* renamed from: m3 */
    public int mo31660m3() {
        return this.m_widgetType;
    }

    /* renamed from: p3 */
    public void mo31661p3(String str) {
        this.m_currentLabel = str;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == REQUEST_CODE_WIDGET_CONFIGURE && i2 != 0) {
            this.m_imageId = intent.getIntExtra("drawableId", 0);
            this.m_imageResourceName = intent.getStringExtra("drawableName");
            this.m_imagePackageName = intent.getStringExtra("drawablePackageName");
            this.m_widgetLabel = intent.getStringExtra("widgetText");
            Uri data = intent.getData();
            if (data != null) {
                this.m_imageUri = data.toString();
            }
            mo24689O1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.m_widgetType == 4) {
            Intent intent = new Intent(mo27827K0(), WidgetConfigureActivity.class);
            String str = this.m_widgetLabel;
            if (str != null && str.length() > 0) {
                intent.putExtra("widgetText", this.m_widgetLabel);
            }
            intent.putExtra("drawableId", this.m_imageId);
            intent.putExtra("drawablePackageName", this.m_imagePackageName);
            intent.putExtra("drawableName", this.m_imageResourceName);
            intent.putExtra("drawableUri", this.m_imageUri);
            mo27850j0().startActivityForResult(intent, REQUEST_CODE_WIDGET_CONFIGURE);
            return;
        }
        super.mo24677v2();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_widgetType);
        parcel.writeString(this.m_widgetLabel);
        parcel.writeInt(this.m_imageId);
        parcel.writeString(this.m_imageResourceName);
        parcel.writeString(this.m_imagePackageName);
        parcel.writeString(this.m_imageUri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_widgetType = m23714o3(i);
    }

    public WidgetPressedTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private WidgetPressedTrigger() {
        this.m_widgetType = 4;
    }

    private WidgetPressedTrigger(Parcel parcel) {
        super(parcel);
        this.m_widgetType = parcel.readInt();
        this.m_widgetLabel = parcel.readString();
        this.m_imageId = parcel.readInt();
        this.m_imageResourceName = parcel.readString();
        this.m_imagePackageName = parcel.readString();
        this.m_imageUri = parcel.readString();
    }
}
