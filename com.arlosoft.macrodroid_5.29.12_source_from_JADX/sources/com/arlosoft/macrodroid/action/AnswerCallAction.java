package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import com.android.internal.telephony.ITelephony;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.activities.AcceptCallActivity;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.lang.reflect.Method;
import p112j2.C7439d0;
import p128m0.C7753h;
import p150q2.C8164a;
import p376r7.C16351a;
import p385s7.C16505a;

public class AnswerCallAction extends Action {
    public static final Parcelable.Creator<AnswerCallAction> CREATOR = new C2337a();
    private static final int[] s_delayValues = {0, 2, 5, 10};
    private int m_selectedIndex;

    /* renamed from: com.arlosoft.macrodroid.action.AnswerCallAction$a */
    class C2337a implements Parcelable.Creator<AnswerCallAction> {
        C2337a() {
        }

        /* renamed from: a */
        public AnswerCallAction createFromParcel(Parcel parcel) {
            return new AnswerCallAction(parcel, (C2337a) null);
        }

        /* renamed from: b */
        public AnswerCallAction[] newArray(int i) {
            return new AnswerCallAction[i];
        }
    }

    /* synthetic */ AnswerCallAction(Parcel parcel, C2337a aVar) {
        this(parcel);
    }

    /* renamed from: k3 */
    private void m9838k3() throws Exception {
        TelephonyManager telephonyManager = (TelephonyManager) mo27827K0().getSystemService("phone");
        Method declaredMethod = Class.forName(telephonyManager.getClass().getName()).getDeclaredMethod("getITelephony", new Class[0]);
        declaredMethod.setAccessible(true);
        ITelephony iTelephony = (ITelephony) declaredMethod.invoke(telephonyManager, new Object[0]);
        iTelephony.silenceRinger();
        iTelephony.answerRingingCall();
    }

    /* renamed from: l3 */
    private void m9839l3(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, 79));
        context.sendOrderedBroadcast(intent, "android.permission.CALL_PRIVILEGED");
        Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
        intent2.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(1, 79));
        context.sendOrderedBroadcast(intent2, "android.permission.CALL_PRIVILEGED");
    }

    /* renamed from: m3 */
    private String[] m9840m3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_answer_call_no_delay), MacroDroidApplication.m14845u().getString(C17541R$string.action_answer_call_2_seconds), MacroDroidApplication.m14845u().getString(C17541R$string.action_answer_call_5_seconds), MacroDroidApplication.m14845u().getString(C17541R$string.action_answer_call_10_seconds)};
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public /* synthetic */ void m9841n3() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                ((TelecomManager) mo27827K0().getSystemService("telecom")).acceptRingingCall();
            } catch (SecurityException unused) {
                C4878b.m18869h(mo25559a1() + " Requires " + "android.permission.ANSWER_PHONE_CALLS" + " permission", mo27840Y0().longValue());
                C7439d0.m30909o0(mo27827K0(), "android.permission.ANSWER_PHONE_CALLS", mo25559a1(), true, false);
            }
        } else if (((TelephonyManager) mo27827K0().getSystemService("phone")).getCallState() == 1) {
            if (C8164a.m33886a()) {
                try {
                    m9838k3();
                } catch (Exception unused2) {
                    try {
                        C16505a.m98574o(true).mo79032w(new C16351a(0, "input keyevent 5"));
                    } catch (Exception unused3) {
                    }
                    m9839l3(mo27827K0());
                }
            } else {
                Intent intent = new Intent(mo27827K0(), AcceptCallActivity.class);
                intent.addFlags(276856832);
                mo27827K0().startActivity(intent);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_selectedIndex;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.m_selectedIndex == 0) {
            return "";
        }
        return mo27827K0().getString(C17541R$string.action_answer_call_delay) + " " + m9840m3()[this.m_selectedIndex];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7753h.m32352u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        new Handler(Looper.getMainLooper()).postDelayed(new C3529v0(this), (long) (s_delayValues[this.m_selectedIndex] * 1000));
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        if (Build.VERSION.SDK_INT >= 26) {
            return new String[]{"android.permission.ANSWER_PHONE_CALLS"};
        }
        return super.mo24727c1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m9840m3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.action_answer_call_delay_before_answering);
    }

    /* renamed from: q2 */
    public boolean mo24773q2() {
        return Build.VERSION.SDK_INT < 26;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_selectedIndex);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_selectedIndex = i;
    }

    public AnswerCallAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public AnswerCallAction() {
    }

    private AnswerCallAction(Parcel parcel) {
        super(parcel);
        this.m_selectedIndex = parcel.readInt();
    }
}
