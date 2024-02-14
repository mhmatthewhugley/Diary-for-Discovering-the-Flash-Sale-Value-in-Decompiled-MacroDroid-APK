package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7860v1;
import p148q0.C8151a;

public class LaunchHomeScreenAction extends Action {
    public static final Parcelable.Creator<LaunchHomeScreenAction> CREATOR = new C2518a();

    /* renamed from: com.arlosoft.macrodroid.action.LaunchHomeScreenAction$a */
    class C2518a implements Parcelable.Creator<LaunchHomeScreenAction> {
        C2518a() {
        }

        /* renamed from: a */
        public LaunchHomeScreenAction createFromParcel(Parcel parcel) {
            return new LaunchHomeScreenAction(parcel, (C2518a) null);
        }

        /* renamed from: b */
        public LaunchHomeScreenAction[] newArray(int i) {
            return new LaunchHomeScreenAction[i];
        }
    }

    /* synthetic */ LaunchHomeScreenAction(Parcel parcel, C2518a aVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7860v1.m32875u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(268435456);
            mo27827K0().startActivity(intent);
        } catch (NullPointerException unused) {
            C8151a.m33873n(new RuntimeException("NPE when starting home. getContext() == " + mo27827K0()));
        } catch (ActivityNotFoundException unused2) {
            C4878b.m18869h("This device does not have support to handle the CATEGORY_HOME intent type", mo27840Y0().longValue());
        } catch (Exception e) {
            C4878b.m18869h("Failed to launch home screen: " + e.toString(), mo27840Y0().longValue());
        }
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public LaunchHomeScreenAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private LaunchHomeScreenAction() {
    }

    private LaunchHomeScreenAction(Parcel parcel) {
        super(parcel);
    }
}
