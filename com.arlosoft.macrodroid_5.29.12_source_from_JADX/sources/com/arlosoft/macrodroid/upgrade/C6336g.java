package com.arlosoft.macrodroid.upgrade;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.provider.Settings;
import android.view.View;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.utils.sparkpostutil.EmailListener;
import com.arlosoft.macrodroid.utils.sparkpostutil.SparkPostEmailUtil;
import com.arlosoft.macrodroid.utils.sparkpostutil.SparkPostFile;
import com.arlosoft.macrodroid.utils.sparkpostutil.SparkPostRecipient;
import com.arlosoft.macrodroid.utils.sparkpostutil.SparkPostSender;
import java.util.ArrayList;
import kotlin.jvm.internal.C13706o;
import p148q0.C8151a;
import p155r1.C8187c;
import p155r1.C8189f;
import p155r1.C8192h;
import p270ga.C12318a;
import p319lc.C15626c;
import p414v9.C16747p;
import p440y9.C16971a;

/* renamed from: com.arlosoft.macrodroid.upgrade.g */
/* compiled from: UpgradeHelper.kt */
public final class C6336g {

    /* renamed from: a */
    private final C5070a f14902a;

    /* renamed from: com.arlosoft.macrodroid.upgrade.g$a */
    /* compiled from: UpgradeHelper.kt */
    public static final class C6337a implements EmailListener {

        /* renamed from: a */
        final /* synthetic */ Activity f14903a;

        /* renamed from: b */
        final /* synthetic */ View f14904b;

        C6337a(Activity activity, View view) {
            this.f14903a = activity;
            this.f14904b = view;
        }

        public void onError(String str) {
            C13706o.m87929f(str, "errorMessage");
            C4878b.m18868g("Request upgrade support failed: " + str);
            C15626c.makeText(this.f14903a.getApplicationContext(), C17541R$string.upgrade_support_request_failed, 1).show();
            this.f14904b.setVisibility(8);
        }

        public void onSuccess() {
            C15626c.makeText(this.f14903a.getApplicationContext(), C17541R$string.upgrade_support_request_received, 0).show();
            this.f14904b.setVisibility(8);
            this.f14903a.finish();
        }
    }

    public C6336g(C5070a aVar) {
        C13706o.m87929f(aVar, "remoteConfig");
        this.f14902a = aVar;
    }

    /* renamed from: e */
    private final void m24534e(String str, String str2, Activity activity, View view) {
        try {
            C8187c a = C8187c.m33948a(C4660g.m18123a("rM2LZ7ZtdliGhZIp5l7p5p2bEboIcD/ShDO211LtH4RqPkh7U67clJ4mcA9j6zVRm1kTHCt2RJ97\nvqTbOMeEF/qk5Ai3En4l"));
            C8189f fVar = new C8189f();
            fVar.mo38239c(str, (String) null);
            fVar.mo38253q("support@macrodroid.com", "MacroDroid Support");
            fVar.mo38255s("MacroDroid Upgrade Support");
            fVar.mo38252p(str2);
            C16747p.m99411j(a.mo38235c(fVar)).mo79730q(C12318a.m83030b()).mo79726l(C16971a.m100210a()).mo79729o(new C6334e(activity, view, this, str, str2), new C6335f(this, str, str2, activity, view));
        } catch (Throwable th) {
            C4878b.m18868g("Request upgrade support failed: " + th);
            m24537h(str, str2, activity, view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m24535f(Activity activity, View view, C6336g gVar, String str, String str2, C8192h hVar) {
        C13706o.m87929f(activity, "$activity");
        C13706o.m87929f(view, "$loadingView");
        C13706o.m87929f(gVar, "this$0");
        C13706o.m87929f(str, "$emailAddress");
        C13706o.m87929f(str2, "$directToUserMessage");
        C13706o.m87929f(hVar, "response");
        if (hVar.mo38260d()) {
            C15626c.makeText(activity.getApplicationContext(), C17541R$string.upgrade_support_request_received, 0).show();
            view.setVisibility(8);
            activity.finish();
            return;
        }
        C4878b.m18868g("Request upgrade support failed: " + hVar.mo38259c());
        gVar.m24537h(str, str2, activity, view);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m24536g(C6336g gVar, String str, String str2, Activity activity, View view, Throwable th) {
        C13706o.m87929f(gVar, "this$0");
        C13706o.m87929f(str, "$emailAddress");
        C13706o.m87929f(str2, "$directToUserMessage");
        C13706o.m87929f(activity, "$activity");
        C13706o.m87929f(view, "$loadingView");
        C13706o.m87929f(th, "error");
        C4878b.m18868g("Request upgrade support failed:  " + th);
        gVar.m24537h(str, str2, activity, view);
    }

    /* renamed from: h */
    private final void m24537h(String str, String str2, Activity activity, View view) {
        SparkPostEmailUtil.sendEmail((Context) activity, C4660g.m18123a("D/NWBiug1Nkcs0NvDDo2HUdZ+Kp+WkyiaMsY63gBZtF7j7iWc7lRl5hGk9kqzGo9"), "MacroDroid Upgrade Support", str2, new SparkPostRecipient(str), new SparkPostSender("support@macrodroid.com", "MacroDroid support"), str2, (ArrayList<SparkPostFile>) null, "support@macrodroid.com", (EmailListener) new C6337a(activity, view));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m24538m(Activity activity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(activity, "$activity");
        dialogInterface.dismiss();
        activity.finish();
    }

    /* renamed from: d */
    public final void mo32379d(String str, Activity activity, View view) {
        C13706o.m87929f(str, "emailAddress");
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(view, "loadingView");
        Settings.Secure.getString(activity.getContentResolver(), "android_id");
        view.setVisibility(0);
        String str2 = C13706o.m87924a(this.f14902a.mo29989p(), "com.arlosoft.macrodroid.pro.h") ? "£3.99, €4.59 or $4.99" : "£4.79, €5.49 or $5.99";
        m24534e(str, "Hi,\n\nIf you are unable to purchase via Google Play for any reason I now offer an alternative payment mechanism via Paypal.\n\nPlease make a payment of " + str2 + " to: support@macrodroid.com\nPlease include this text when purchasing: " + str + "\n\nWhen sending the payment please select the personal option and then the 'Gift' option (if available). This is greatly appreciated as normal Paypal charges are relatively high for low value items.\n\nOnce the payment is made you will be sent an upgrade code (ASAP) that can then be used to upgrade to the pro version.\n\nIf you have previously purchased the app and are not seeing the pro upgrade, firstly please check that you have installed the app from the same account you purchased on. If this is the case then please try the following:\n\nClear the storage and cache data for the Play store app.\nReboot your device.\nOpen MacroDroid\n\nThis often solves the problem. If it doesn't resolve the issue please confirm the account (email address) you purchased the app on and I will resolve it another way. If you have lost any macros you should be able to restore them from the autobackup tile once you have restored the pro version.\n\nRegards,\n\nJamie", activity, view);
    }

    /* renamed from: i */
    public final void mo32380i(Activity activity, String str, @StyleRes int i) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(str, NotificationCompat.CATEGORY_EMAIL);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, i);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) null);
        builder.setTitle((int) C17541R$string.pro_upgrade_failed);
        builder.setMessage((int) C17541R$string.max_pro_activations_reached);
        C8151a.m33861b(str);
        builder.show();
    }

    /* renamed from: j */
    public final void mo32381j(Activity activity, String str, @StyleRes int i) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(str, NotificationCompat.CATEGORY_EMAIL);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, i);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) null);
        builder.setTitle((int) C17541R$string.pro_upgrade_failed);
        builder.setMessage((int) C17541R$string.something_went_wrong);
        builder.show();
    }

    /* renamed from: k */
    public final void mo32382k(Activity activity, String str, @StyleRes int i) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(str, NotificationCompat.CATEGORY_EMAIL);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, i);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) null);
        builder.setTitle((int) C17541R$string.pro_upgrade_failed);
        builder.setMessage((int) C17541R$string.pro_activation_invalid_credentials);
        C8151a.m33861b(str);
        builder.show();
    }

    /* renamed from: l */
    public final void mo32383l(Activity activity, @StyleRes int i, String str, String str2) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(str, "id");
        C13706o.m87929f(str2, "serial");
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, i);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6333d(activity));
        builder.setTitle((int) C17541R$string.upgrade_complete);
        builder.setMessage((int) C17541R$string.thanks_for_purchasing);
        C8151a.m33858G(str, str2);
        builder.show();
    }
}
