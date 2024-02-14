package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.android.internal.telephony.ITelephony;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.lang.reflect.Method;
import p112j2.C7439d0;
import p128m0.C7861v2;
import p148q0.C8151a;
import p150q2.C8164a;

public class RejectCallAction extends Action {
    public static final Parcelable.Creator<RejectCallAction> CREATOR = new C2605a();

    /* renamed from: com.arlosoft.macrodroid.action.RejectCallAction$a */
    class C2605a implements Parcelable.Creator<RejectCallAction> {
        C2605a() {
        }

        /* renamed from: a */
        public RejectCallAction createFromParcel(Parcel parcel) {
            return new RejectCallAction(parcel, (C2605a) null);
        }

        /* renamed from: b */
        public RejectCallAction[] newArray(int i) {
            return new RejectCallAction[i];
        }
    }

    /* synthetic */ RejectCallAction(Parcel parcel, C2605a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private void m12056j3(Context context, Exception exc) {
        try {
            Intent intent = new Intent("android.intent.action.HEADSET_PLUG");
            intent.addFlags(BasicMeasure.EXACTLY);
            String stringExtra = intent.getStringExtra("state");
            intent.putExtra("state", 1);
            intent.putExtra("name", "Headset");
            context.sendOrderedBroadcast(intent, (String) null);
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, 79));
            context.sendOrderedBroadcast(intent2, "android.permission.CALL_PRIVILEGED");
            if (stringExtra.equals("1")) {
                intent.putExtra("state", 0);
                context.sendOrderedBroadcast(intent, (String) null);
            }
        } catch (Exception e) {
            C4878b.m18869h("Reject call mechanism 1 failed: " + exc.toString(), mo27840Y0().longValue());
            C4878b.m18869h("Reject call mechanism 2 failed: " + e.toString(), mo27840Y0().longValue());
            C4061t1.m15947B0(new String[]{"input keyevent 6"});
        }
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7861v2.m32880u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        TelephonyManager telephonyManager = (TelephonyManager) mo27827K0().getSystemService("phone");
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            try {
                ((TelecomManager) mo27827K0().getSystemService("telecom")).endCall();
            } catch (SecurityException unused) {
                C7439d0.m30909o0(mo27827K0(), "android.permission.ANSWER_PHONE_CALLS", mo25559a1(), true, false);
            }
        } else if (i < 27 || !C8164a.m33886a()) {
            try {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getITelephony", (Class[]) null);
                declaredMethod.setAccessible(true);
                ((ITelephony) declaredMethod.invoke(telephonyManager, new Object[0])).endCall();
            } catch (Exception e) {
                C8151a.m33873n(new RuntimeException("Reject Call Failed: " + e.getMessage()));
                m12056j3(mo27827K0(), e);
            }
        } else {
            C4061t1.m15947B0(new String[]{"input keyevent 6"});
        }
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new String[]{"android.permission.ANSWER_PHONE_CALLS"};
        }
        return new String[]{"android.permission.CALL_PHONE"};
    }

    public RejectCallAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public RejectCallAction() {
    }

    private RejectCallAction(Parcel parcel) {
        super(parcel);
    }
}
