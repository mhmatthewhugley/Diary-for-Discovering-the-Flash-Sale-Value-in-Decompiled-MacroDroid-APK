package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p128m0.C7818p3;
import p150q2.C8164a;
import p319lc.C15626c;

public class SetLanguageAction extends Action {
    public static final Parcelable.Creator<SetLanguageAction> CREATOR = new C2639a();
    private Locale m_locale;

    /* renamed from: com.arlosoft.macrodroid.action.SetLanguageAction$a */
    class C2639a implements Parcelable.Creator<SetLanguageAction> {
        C2639a() {
        }

        /* renamed from: a */
        public SetLanguageAction createFromParcel(Parcel parcel) {
            return new SetLanguageAction(parcel, (C2639a) null);
        }

        /* renamed from: b */
        public SetLanguageAction[] newArray(int i) {
            return new SetLanguageAction[i];
        }
    }

    /* synthetic */ SetLanguageAction(Parcel parcel, C2639a aVar) {
        this(parcel);
    }

    /* renamed from: r3 */
    private void m12467r3(Locale locale, Locale[] localeArr) {
        ArrayList<Locale> arrayList = new ArrayList<>();
        for (Locale locale2 : localeArr) {
            if (!TextUtils.isEmpty(locale2.getDisplayCountry()) && locale.getDisplayLanguage().equals(locale2.getDisplayLanguage())) {
                arrayList.add(locale2);
            }
        }
        Collections.sort(arrayList, C3090gh.f8379a);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (Locale locale3 : arrayList) {
            arrayList2.add(locale3.getDisplayCountry());
            if (this.m_locale.equals(locale3)) {
                i = i2;
            }
            i2++;
        }
        if (arrayList2.size() == 1) {
            this.m_locale = (Locale) arrayList.get(0);
            mo24689O1();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.action_set_language);
        builder.setSingleChoiceItems((CharSequence[]) (String[]) arrayList2.toArray(new String[0]), i, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C2948bh(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3033eh(this, arrayList));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C3654zg(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m12469t3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m12470u3(List list, DialogInterface dialogInterface, int i) {
        this.m_locale = (Locale) list.get(((AlertDialog) dialogInterface).getListView().getCheckedItemPosition());
        mo24689O1();
        if (C8164a.m33886a()) {
            C4061t1.m15947B0(new String[]{"pm grant com.arlosoft.macrodroid android.permission.CHANGE_CONFIGURATION"});
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m12471v3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m12473x3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m12474y3(ArrayList arrayList, Locale[] localeArr, DialogInterface dialogInterface, int i) {
        m12467r3((Locale) arrayList.get(((AlertDialog) dialogInterface).getListView().getCheckedItemPosition()), localeArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m12475z3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_locale.getDisplayLanguage() + " (" + this.m_locale.getDisplayCountry() + ")";
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7818p3.m32670u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (C8164a.m33886a()) {
            C4061t1.m15947B0(new String[]{"pm grant com.arlosoft.macrodroid android.permission.CHANGE_CONFIGURATION"});
        }
        try {
            Locale locale = this.m_locale;
            Class<?> cls = Class.forName("android.app.ActivityManagerNative");
            Method method = cls.getMethod("getDefault", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(cls, new Object[0]);
            Method method2 = cls.getMethod("getConfiguration", new Class[0]);
            method2.setAccessible(true);
            Configuration configuration = (Configuration) method2.invoke(invoke, new Object[0]);
            configuration.getClass().getField("userSetLocale").setBoolean(configuration, true);
            configuration.locale = locale;
            Method method3 = cls.getMethod("updateConfiguration", new Class[]{Configuration.class});
            method3.setAccessible(true);
            method3.invoke(invoke, new Object[]{configuration});
        } catch (Exception unused) {
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.error, 0).show();
            C4878b.m18869h("Could not set system language, you need to grant permission via adb with the command: pm grant com.arlosoft.macrodroid android.permission.CHANGE_CONFIGURATION", mo27840Y0().longValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Locale[] availableLocales = Locale.getAvailableLocales();
        ArrayList arrayList = new ArrayList();
        Arrays.sort(availableLocales, C3062fh.f8335a);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (Locale locale : availableLocales) {
            String displayLanguage = locale.getDisplayLanguage();
            if (!arrayList.contains(displayLanguage)) {
                arrayList.add(displayLanguage);
                arrayList2.add(locale);
                if (this.m_locale.getDisplayLanguage().equals(locale.getDisplayLanguage())) {
                    i = i2;
                }
                i2++;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.action_set_language);
        builder.setSingleChoiceItems((CharSequence[]) (String[]) arrayList.toArray(new String[0]), i, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C2976ch(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3005dh(this, arrayList2, availableLocales));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C2920ah(this));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeSerializable(this.m_locale);
    }

    public SetLanguageAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public SetLanguageAction() {
        this.m_locale = Locale.getDefault();
    }

    private SetLanguageAction(Parcel parcel) {
        super(parcel);
        this.m_locale = (Locale) parcel.readSerializable();
    }
}
