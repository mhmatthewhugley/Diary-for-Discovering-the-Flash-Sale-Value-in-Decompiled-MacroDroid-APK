package com.arlosoft.macrodroid.upgrade;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.FragmentActivity;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.MacroDroidDialogBaseActivity;
import com.arlosoft.macrodroid.common.C4004d1;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.upgrade.model.UpgradeResponse;
import com.google.android.gms.common.AccountPicker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import org.jetbrains.anko.sdk27.coroutines.C16061a;
import p104i0.C7393b;
import p215b8.C11102b;
import p270ga.C12318a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;
import p370qa.C16271r;
import p404u8.C16667a;
import p440y9.C16971a;
import p448z9.C17070a;
import retrofit2.HttpException;

/* compiled from: UpgradeSupportActivity2.kt */
public final class UpgradeSupportActivity2 extends MacroDroidDialogBaseActivity {

    /* renamed from: f */
    public C7393b f14837f;

    /* renamed from: g */
    public C6336g f14838g;

    /* renamed from: o */
    private Account[] f14839o;

    /* renamed from: p */
    private final C17070a f14840p = new C17070a();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f14841s;

    /* renamed from: z */
    public Map<Integer, View> f14842z = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.upgrade.UpgradeSupportActivity2$a */
    /* compiled from: UpgradeSupportActivity2.kt */
    static final class C6294a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ UpgradeSupportActivity2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6294a(UpgradeSupportActivity2 upgradeSupportActivity2, C13635d<? super C6294a> dVar) {
            super(3, dVar);
            this.this$0 = upgradeSupportActivity2;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6294a(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m24446l2((String) null);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.UpgradeSupportActivity2$b */
    /* compiled from: UpgradeSupportActivity2.kt */
    static final class C6295b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ UpgradeSupportActivity2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6295b(UpgradeSupportActivity2 upgradeSupportActivity2, C13635d<? super C6295b> dVar) {
            super(3, dVar);
            this.this$0 = upgradeSupportActivity2;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6295b(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m24442h2();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.UpgradeSupportActivity2$c */
    /* compiled from: UpgradeSupportActivity2.kt */
    static final class C6296c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ UpgradeSupportActivity2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6296c(UpgradeSupportActivity2 upgradeSupportActivity2, C13635d<? super C6296c> dVar) {
            super(3, dVar);
            this.this$0 = upgradeSupportActivity2;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6296c(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m24441g2();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.UpgradeSupportActivity2$d */
    /* compiled from: UpgradeSupportActivity2.kt */
    static final class C6297d extends C13665l implements C16271r<C15478k0, View, Boolean, C13635d<? super C13339u>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ UpgradeSupportActivity2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6297d(UpgradeSupportActivity2 upgradeSupportActivity2, C13635d<? super C6297d> dVar) {
            super(4, dVar);
            this.this$0 = upgradeSupportActivity2;
        }

        /* renamed from: h */
        public final Object mo32339h(C15478k0 k0Var, View view, boolean z, C13635d<? super C13339u> dVar) {
            C6297d dVar2 = new C6297d(this.this$0, dVar);
            dVar2.Z$0 = z;
            return dVar2.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo32339h((C15478k0) obj, (View) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                if (this.Z$0 && !this.this$0.f14841s) {
                    this.this$0.m24444j2();
                    this.this$0.f14841s = true;
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.upgrade.UpgradeSupportActivity2$e */
    /* compiled from: UpgradeSupportActivity2.kt */
    public static final class C6298e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f14843a;

        /* renamed from: c */
        final /* synthetic */ UpgradeSupportActivity2 f14844c;

        C6298e(Button button, UpgradeSupportActivity2 upgradeSupportActivity2) {
            this.f14843a = button;
            this.f14844c = upgradeSupportActivity2;
        }

        public void afterTextChanged(Editable editable) {
            C13706o.m87929f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
            this.f14843a.setEnabled(this.f14844c.mo32335f2(charSequence.toString()));
        }
    }

    /* renamed from: X1 */
    private final void m24435X1(String str) {
        boolean z;
        String string = Settings.Secure.getString(getContentResolver(), "android_id");
        String c = C4004d1.m15681c(str);
        String c2 = C4004d1.m15681c(string);
        String valueOf = String.valueOf(((AppCompatEditText) mo32332Q1(C17532R$id.upgradeSerial)).getText());
        if (C13706o.m87924a(valueOf, c) || C13706o.m87924a(valueOf, c2)) {
            z = true;
            C5163j2.m20157f6(this, valueOf);
        } else {
            z = false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Invert_Upgrade);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6342k(z, this));
        if (z) {
            builder.setTitle((int) C17541R$string.upgrade_complete);
            builder.setMessage((int) C17541R$string.thanks_for_purchasing);
            setResult(-1);
        } else {
            builder.setTitle((int) C17541R$string.invalid_serial);
            builder.setMessage((int) C17541R$string.value_entered_is_not_recognised);
            setResult(0);
        }
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public static final void m24436Y1(boolean z, UpgradeSupportActivity2 upgradeSupportActivity2, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(upgradeSupportActivity2, "this$0");
        dialogInterface.dismiss();
        if (z) {
            upgradeSupportActivity2.finish();
        }
    }

    /* renamed from: Z1 */
    private final void m24437Z1(String str, String str2) {
        String h = C4660g.m18130h("adb97ac6-f780-4a41-8475-ce661b574999" + str2 + str);
        RelativeLayout relativeLayout = (RelativeLayout) mo32332Q1(C17532R$id.loadingView);
        C13706o.m87928e(relativeLayout, "loadingView");
        relativeLayout.setVisibility(0);
        this.f14840p.mo62358a(mo32333d2().mo37424b(h, str, str2).mo79730q(C12318a.m83030b()).mo79726l(C16971a.m100210a()).mo79729o(new C6345n(this, str, str2), new C6344m(this, str)));
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public static final void m24438a2(UpgradeSupportActivity2 upgradeSupportActivity2, String str, String str2, UpgradeResponse upgradeResponse) {
        C13706o.m87929f(upgradeSupportActivity2, "this$0");
        C13706o.m87929f(str, "$email");
        C13706o.m87929f(str2, "$serial");
        String component1 = upgradeResponse.component1();
        RelativeLayout relativeLayout = (RelativeLayout) upgradeSupportActivity2.mo32332Q1(C17532R$id.loadingView);
        C13706o.m87928e(relativeLayout, "loadingView");
        relativeLayout.setVisibility(8);
        if (C13706o.m87924a(component1, C4660g.m18130h(str + str2 + "adb97ac6-f780-4a41-8475-ce661b574999" + str2))) {
            C5163j2.m20157f6(upgradeSupportActivity2, str2);
            upgradeSupportActivity2.mo32334e2().mo32383l(upgradeSupportActivity2, C17542R$style.Theme_App_Dialog_Invert_Upgrade, str, str2);
            return;
        }
        C4878b.m18868g("Invalid auth code from server when attempting to upgrade: " + component1);
        upgradeSupportActivity2.mo32334e2().mo32382k(upgradeSupportActivity2, str, C17542R$style.Theme_App_Dialog_Invert_Upgrade);
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public static final void m24439b2(UpgradeSupportActivity2 upgradeSupportActivity2, String str, Throwable th) {
        C13706o.m87929f(upgradeSupportActivity2, "this$0");
        C13706o.m87929f(str, "$email");
        RelativeLayout relativeLayout = (RelativeLayout) upgradeSupportActivity2.mo32332Q1(C17532R$id.loadingView);
        C13706o.m87928e(relativeLayout, "loadingView");
        relativeLayout.setVisibility(8);
        if (!(th instanceof HttpException)) {
            upgradeSupportActivity2.mo32334e2().mo32381j(upgradeSupportActivity2, str, C17542R$style.Theme_App_Dialog_Invert_Upgrade);
        } else if (((HttpException) th).mo80527a() == 403) {
            upgradeSupportActivity2.mo32334e2().mo32380i(upgradeSupportActivity2, str, C17542R$style.Theme_App_Dialog_Invert_Upgrade);
        } else {
            upgradeSupportActivity2.mo32334e2().mo32382k(upgradeSupportActivity2, str, C17542R$style.Theme_App_Dialog_Invert_Upgrade);
        }
    }

    /* renamed from: c2 */
    private final boolean m24440c2() {
        boolean z;
        String string = Settings.Secure.getString(getContentResolver(), "android_id");
        String c = C4004d1.m15681c(string);
        String valueOf = String.valueOf(((AppCompatEditText) mo32332Q1(C17532R$id.upgradeSerial)).getText());
        if (C13706o.m87924a(valueOf, c)) {
            z = true;
            C5163j2.m20157f6(this, valueOf);
        } else {
            z = false;
        }
        if (z) {
            C6336g e2 = mo32334e2();
            C13706o.m87928e(string, "androidId");
            e2.mo32383l(this, C17542R$style.Theme_App_Dialog_Invert_Upgrade, string, valueOf);
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final void m24441g2() {
        m24448n2();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9  */
    /* renamed from: h2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m24442h2() {
        /*
            r7 = this;
            boolean r0 = r7.m24440c2()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = com.arlosoft.macrodroid.C17532R$id.upgradeSerial
            android.view.View r0 = r7.mo32332Q1(r0)
            androidx.appcompat.widget.AppCompatEditText r0 = (androidx.appcompat.widget.AppCompatEditText) r0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = com.arlosoft.macrodroid.C17532R$id.upgradeEmail
            android.view.View r1 = r7.mo32332Q1(r1)
            androidx.appcompat.widget.AppCompatEditText r1 = (androidx.appcompat.widget.AppCompatEditText) r1
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "android.permission.GET_ACCOUNTS"
            int r2 = androidx.core.content.ContextCompat.checkSelfPermission(r7, r2)
            java.lang.String r3 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x006d
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            if (r2 == 0) goto L_0x00de
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r4 = 0
        L_0x0046:
            if (r4 == 0) goto L_0x00de
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            kotlin.jvm.internal.C13706o.m87928e(r1, r3)
            java.lang.CharSequence r1 = kotlin.text.C15177w.m93672R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.toLowerCase(r2)
            kotlin.jvm.internal.C13706o.m87928e(r0, r3)
            java.lang.CharSequence r0 = kotlin.text.C15177w.m93672R0(r0)
            java.lang.String r0 = r0.toString()
            r7.m24437Z1(r1, r0)
            goto L_0x00de
        L_0x006d:
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x0075
            r2 = 1
            goto L_0x0076
        L_0x0075:
            r2 = 0
        L_0x0076:
            if (r2 == 0) goto L_0x00d4
            android.accounts.Account[] r2 = r7.f14839o
            if (r2 == 0) goto L_0x0087
            int r6 = r2.length
            if (r6 != 0) goto L_0x0081
            r6 = 1
            goto L_0x0082
        L_0x0081:
            r6 = 0
        L_0x0082:
            r6 = r6 ^ r4
            if (r6 != r4) goto L_0x0087
            r6 = 1
            goto L_0x0088
        L_0x0087:
            r6 = 0
        L_0x0088:
            if (r6 == 0) goto L_0x009b
            kotlin.jvm.internal.C13706o.m87926c(r2)
            r2 = r2[r5]
            java.lang.String r2 = r2.name
            boolean r2 = kotlin.jvm.internal.C13706o.m87924a(r1, r2)
            if (r2 == 0) goto L_0x009b
            r7.m24435X1(r1)
            goto L_0x00de
        L_0x009b:
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r4 = 0
        L_0x00a3:
            if (r4 == 0) goto L_0x00c9
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            kotlin.jvm.internal.C13706o.m87928e(r1, r3)
            java.lang.CharSequence r1 = kotlin.text.C15177w.m93672R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.toLowerCase(r2)
            kotlin.jvm.internal.C13706o.m87928e(r0, r3)
            java.lang.CharSequence r0 = kotlin.text.C15177w.m93672R0(r0)
            java.lang.String r0 = r0.toString()
            r7.m24437Z1(r1, r0)
            goto L_0x00de
        L_0x00c9:
            r0 = 2131953158(0x7f130606, float:1.954278E38)
            android.widget.Toast r0 = p319lc.C15626c.makeText(r7, r0, r5)
            r0.show()
            goto L_0x00de
        L_0x00d4:
            r0 = 2131953178(0x7f13061a, float:1.954282E38)
            android.widget.Toast r0 = p319lc.C15626c.makeText(r7, r0, r5)
            r0.show()
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.upgrade.UpgradeSupportActivity2.m24442h2():void");
    }

    /* renamed from: i2 */
    private final void m24443i2() {
        this.f14839o = AccountManager.get(this).getAccountsByType("com.google");
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final void m24444j2() {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Intent a = AccountPicker.m3475a((Account) null, (ArrayList<Account>) null, new String[]{"com.google"}, false, (String) null, (String) null, (String[]) null, (Bundle) null);
                C13706o.m87928e(a, "newChooseAccountIntent(n…, null, null, null, null)");
                startActivityForResult(a, 3);
            } catch (ActivityNotFoundException unused) {
            }
        } else {
            this.f14840p.mo62358a(new C11102b((FragmentActivity) this).mo62231o("android.permission.GET_ACCOUNTS").mo79679I(C16971a.m100210a()).mo79685P(new C6343l(this)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m24445k2(UpgradeSupportActivity2 upgradeSupportActivity2, Boolean bool) {
        C13706o.m87929f(upgradeSupportActivity2, "this$0");
        C13706o.m87928e(bool, "granted");
        if (bool.booleanValue()) {
            upgradeSupportActivity2.m24443i2();
            Account[] accountArr = upgradeSupportActivity2.f14839o;
            if (accountArr != null) {
                if (!(accountArr.length == 0)) {
                    ((AppCompatEditText) upgradeSupportActivity2.mo32332Q1(C17532R$id.upgradeEmail)).setText(accountArr[0].name);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final void m24446l2(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Invert_Upgrade);
        builder.setTitle((int) C17541R$string.request_upgrade_support);
        View inflate = LayoutInflater.from(new ContextThemeWrapper((Context) this, (int) C17542R$style.Theme_App_Dialog_Invert_Upgrade)).inflate(C17535R$layout.dialog_email, (ViewGroup) null);
        builder.setView(inflate);
        EditText editText = (EditText) inflate.findViewById(2131362654);
        editText.setText(str == null ? "" : str);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6341j(this, editText));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        C13706o.m87928e(create, "builder.create()");
        Window window = create.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        create.show();
        Button button = create.getButton(-1);
        button.setEnabled(mo32335f2(str));
        editText.addTextChangedListener(new C6298e(button, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m24447m2(UpgradeSupportActivity2 upgradeSupportActivity2, EditText editText, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(upgradeSupportActivity2, "this$0");
        Object systemService = upgradeSupportActivity2.getSystemService("input_method");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
        C6336g e2 = upgradeSupportActivity2.mo32334e2();
        String obj = editText.getText().toString();
        RelativeLayout relativeLayout = (RelativeLayout) upgradeSupportActivity2.mo32332Q1(C17532R$id.loadingView);
        C13706o.m87928e(relativeLayout, "loadingView");
        e2.mo32379d(obj, upgradeSupportActivity2, relativeLayout);
    }

    /* renamed from: n2 */
    private final void m24448n2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Invert_Upgrade);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6340i(this));
        builder.setTitle((int) C17541R$string.no_purchase_found_title);
        builder.setMessage((int) C17541R$string.clear_data_play_store_app_details);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m24449o2(UpgradeSupportActivity2 upgradeSupportActivity2, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(upgradeSupportActivity2, "this$0");
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:com.android.vending"));
            upgradeSupportActivity2.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            upgradeSupportActivity2.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
        }
    }

    /* renamed from: Q1 */
    public View mo32332Q1(int i) {
        Map<Integer, View> map = this.f14842z;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d2 */
    public final C7393b mo32333d2() {
        C7393b bVar = this.f14837f;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("upgradeApi");
        return null;
    }

    /* renamed from: e2 */
    public final C6336g mo32334e2() {
        C6336g gVar = this.f14838g;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("upgradeHelper");
        return null;
    }

    /* renamed from: f2 */
    public final boolean mo32335f2(String str) {
        return !TextUtils.isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2) {
            if (i2 == -1) {
                C13706o.m87926c(intent);
                m24446l2(intent.getStringExtra("authAccount"));
                return;
            }
            m24446l2((String) null);
        } else if (i == 3 && i2 == -1) {
            C13706o.m87926c(intent);
            ((AppCompatEditText) mo32332Q1(C17532R$id.upgradeEmail)).setText(intent.getStringExtra("authAccount"));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C16667a.m99103a(this);
        supportRequestWindowFeature(1);
        setContentView((int) C17535R$layout.activity_upgrade_help_2);
        getWindow().setLayout(-1, -2);
        Button button = (Button) mo32332Q1(C17532R$id.requestUpgradeSupportButton);
        C13706o.m87928e(button, "requestUpgradeSupportButton");
        C4666m.m18147o(button, (C13640g) null, new C6294a(this, (C13635d<? super C6294a>) null), 1, (Object) null);
        Button button2 = (Button) mo32332Q1(C17532R$id.upgradeButton);
        C13706o.m87928e(button2, "upgradeButton");
        C4666m.m18147o(button2, (C13640g) null, new C6295b(this, (C13635d<? super C6295b>) null), 1, (Object) null);
        Button button3 = (Button) mo32332Q1(C17532R$id.restorePurchaseButton);
        C13706o.m87928e(button3, "restorePurchaseButton");
        C4666m.m18147o(button3, (C13640g) null, new C6296c(this, (C13635d<? super C6296c>) null), 1, (Object) null);
        AppCompatEditText appCompatEditText = (AppCompatEditText) mo32332Q1(C17532R$id.upgradeEmail);
        C13706o.m87928e(appCompatEditText, "upgradeEmail");
        C16061a.m96673d(appCompatEditText, (C13640g) null, new C6297d(this, (C13635d<? super C6297d>) null), 1, (Object) null);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f14840p.mo80337d();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = Math.max(attributes.width, (getResources().getDisplayMetrics().widthPixels * 90) / 100);
        getWindow().setAttributes(attributes);
    }
}
