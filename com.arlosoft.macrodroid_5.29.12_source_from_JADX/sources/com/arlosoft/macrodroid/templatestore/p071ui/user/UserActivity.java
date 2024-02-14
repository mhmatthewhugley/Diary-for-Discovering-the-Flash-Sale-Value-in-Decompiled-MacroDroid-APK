package com.arlosoft.macrodroid.templatestore.p071ui.user;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.extensions.C4655b;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import com.arlosoft.macrodroid.templatestore.p071ui.templateList.C5472t;
import com.arlosoft.macrodroid.templatestore.p071ui.user.presenter.C5541l;
import com.arlosoft.macrodroid.upgrade.UpgradeActivity2;
import com.arlosoft.macrodroid.user.signin.C6353g;
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.IdpResponse;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.snackbar.SnackbarAnimate;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p148q0.C8151a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16270q;
import p448z9.C17070a;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.UserActivity */
/* compiled from: UserActivity.kt */
public final class UserActivity extends MacroDroidDaggerBaseActivity implements C5529i {

    /* renamed from: H */
    public static final C5513a f13476H = new C5513a((C13695i) null);

    /* renamed from: A */
    public C6353g f13477A;

    /* renamed from: B */
    public C5527g f13478B;

    /* renamed from: C */
    private C17070a f13479C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f13480D;

    /* renamed from: E */
    private boolean f13481E;

    /* renamed from: F */
    private AppCompatDialog f13482F;

    /* renamed from: G */
    public Map<Integer, View> f13483G = new LinkedHashMap();

    /* renamed from: s */
    public C5541l f13484s;

    /* renamed from: z */
    public C5331h f13485z;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.UserActivity$a */
    /* compiled from: UserActivity.kt */
    public static final class C5513a {
        private C5513a() {
        }

        public /* synthetic */ C5513a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo30778a(Context context, String str, String str2, int i) {
            C13706o.m87929f(context, "context");
            C13706o.m87929f(str, "username");
            C13706o.m87929f(str2, "userImage");
            Intent intent = new Intent(context, UserActivity.class);
            intent.putExtra("username", str);
            intent.putExtra("user_image", str2);
            intent.putExtra("user_id", i);
            return intent;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.UserActivity$b */
    /* compiled from: UserActivity.kt */
    public static final class C5514b implements C6353g.C6355b {

        /* renamed from: a */
        final /* synthetic */ UserActivity f13486a;

        C5514b(UserActivity userActivity) {
            this.f13486a = userActivity;
        }

        /* renamed from: a */
        public void mo27362a() {
        }

        /* renamed from: b */
        public void mo27363b(User user) {
            C13706o.m87929f(user, "user");
            this.f13486a.m21228k2(user);
        }

        /* renamed from: c */
        public void mo27364c() {
        }

        /* renamed from: d */
        public void mo27365d() {
            this.f13486a.m21232o2();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.UserActivity$c */
    /* compiled from: UserActivity.kt */
    static final class C5515c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ UserActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5515c(UserActivity userActivity, C13635d<? super C5515c> dVar) {
            super(3, dVar);
            this.this$0 = userActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5515c(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.onBackPressed();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.UserActivity$d */
    /* compiled from: UserActivity.kt */
    static final class C5516d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ UserActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5516d(UserActivity userActivity, C13635d<? super C5516d> dVar) {
            super(3, dVar);
            this.this$0 = userActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5516d(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo30770g2().mo30795U();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.UserActivity$e */
    /* compiled from: UserActivity.kt */
    static final class C5517e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ UserActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5517e(UserActivity userActivity, C13635d<? super C5517e> dVar) {
            super(3, dVar);
            this.this$0 = userActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5517e(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m21229l2();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.UserActivity$f */
    /* compiled from: UserActivity.kt */
    static final class C5518f extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ UserActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5518f(UserActivity userActivity, C13635d<? super C5518f> dVar) {
            super(3, dVar);
            this.this$0 = userActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5518f(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m21226e2();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.UserActivity$g */
    /* compiled from: UserActivity.kt */
    static final class C5519g extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;
        final /* synthetic */ UserActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5519g(AppCompatDialog appCompatDialog, UserActivity userActivity, C13635d<? super C5519g> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
            this.this$0 = userActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5519g(this.$dialog, this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                EditText editText = (EditText) this.$dialog.findViewById(C17532R$id.justificationText);
                RadioGroup radioGroup = (RadioGroup) this.$dialog.findViewById(C17532R$id.radioGroup);
                int i = 0;
                int indexOfChild = radioGroup != null ? radioGroup.indexOfChild(this.$dialog.findViewById(radioGroup.getCheckedRadioButtonId())) : 0;
                if (indexOfChild != 0) {
                    if (indexOfChild == 1) {
                        i = 3;
                    } else if (indexOfChild == 2) {
                        i = 4;
                    }
                }
                String valueOf = String.valueOf(editText != null ? editText.getText() : null);
                if (editText != null) {
                    C4666m.m18144l(editText);
                }
                this.this$0.mo30770g2().mo30793P(this.this$0.f13480D, i, valueOf);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.user.UserActivity$h */
    /* compiled from: UserActivity.kt */
    static final class C5520h extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5520h(AppCompatDialog appCompatDialog, C13635d<? super C5520h> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5520h(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: c2 */
    private final void m21224c2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Template);
        builder.setTitle((int) C17541R$string.template_store_block_user);
        C13696i0 i0Var = C13696i0.f61931a;
        String string = getString(C17541R$string.template_store_block_user_description_with_username);
        C13706o.m87928e(string, "getString(R.string.templ…escription_with_username)");
        String format = String.format(string, Arrays.copyOf(new Object[]{((TextView) mo30768W1(C17532R$id.usernameText)).getText()}, 1));
        C13706o.m87928e(format, "format(format, *args)");
        builder.setMessage((CharSequence) format);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5522b(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public static final void m21225d2(UserActivity userActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(userActivity, "this$0");
        userActivity.mo30770g2().mo30792G(userActivity.f13480D, ((TextView) userActivity.mo30768W1(C17532R$id.usernameText)).getText().toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public final void m21226e2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Template);
        builder.setTitle((int) C17541R$string.template_store_unblock_user);
        C13696i0 i0Var = C13696i0.f61931a;
        String string = getString(C17541R$string.template_store_unblock_user_confirm_message);
        C13706o.m87928e(string, "getString(R.string.templ…ock_user_confirm_message)");
        String format = String.format(string, Arrays.copyOf(new Object[]{((TextView) mo30768W1(C17532R$id.usernameText)).getText()}, 1));
        C13706o.m87928e(format, "format(format, *args)");
        builder.setMessage((CharSequence) format);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5521a(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public static final void m21227f2(UserActivity userActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(userActivity, "this$0");
        userActivity.mo30770g2().mo30796Z(userActivity.f13480D);
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final void m21228k2(User user) {
        try {
            String string = getString(C17541R$string.templates_signed_in_popup, new Object[]{user.getUsername()});
            C13706o.m87928e(string, "getString(R.string.templ…_in_popup, user.username)");
            C15626c.m94876a(this, string, 1).show();
        } catch (Exception e) {
            C8151a.m33873n(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final void m21229l2() {
        PopupMenu popupMenu = new PopupMenu(this, (ImageView) mo30768W1(C17532R$id.menuButton));
        popupMenu.inflate(C17536R$menu.user_activity_menu);
        popupMenu.setOnMenuItemClickListener(new C5525e(this));
        try {
            popupMenu.show();
            popupMenu.getMenu().findItem(C17532R$id.block_user).setTitle(this.f13481E ? C17541R$string.template_store_unblock_user : C17541R$string.template_store_block_user);
        } catch (Exception e) {
            C4878b.m18868g("Failed to display popupmenu: " + e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final boolean m21230m2(UserActivity userActivity, MenuItem menuItem) {
        C13706o.m87929f(userActivity, "this$0");
        int itemId = menuItem.getItemId();
        if (itemId != 2131362063) {
            if (itemId != 2131363614) {
                return true;
            }
            userActivity.m21231n2();
            return true;
        } else if (userActivity.f13481E) {
            userActivity.m21226e2();
            return true;
        } else {
            userActivity.m21224c2();
            return true;
        }
    }

    /* renamed from: n2 */
    private final void m21231n2() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog_Template);
        this.f13482F = appCompatDialog;
        appCompatDialog.setContentView((int) C17535R$layout.dialog_report_user);
        appCompatDialog.setTitle((int) C17541R$string.template_store_report_user);
        C4656c.m18114c(appCompatDialog, getResources().getDimensionPixelSize(C17529R$dimen.margin_medium));
        appCompatDialog.setCanceledOnTouchOutside(false);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        if (button != null) {
            button.setText(getString(C17541R$string.template_store_report_user));
        }
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        if (button2 != null) {
            C13706o.m87928e(button2, "findViewById<Button>(R.id.okButton)");
            C4666m.m18147o(button2, (C13640g) null, new C5519g(appCompatDialog, this, (C13635d<? super C5519g>) null), 1, (Object) null);
        }
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        if (button3 != null) {
            C13706o.m87928e(button3, "findViewById<Button>(R.id.cancelButton)");
            C4666m.m18147o(button3, (C13640g) null, new C5520h(appCompatDialog, (C13635d<? super C5520h>) null), 1, (Object) null);
        }
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final void m21232o2() {
        View findViewById = findViewById(16908290);
        View view = null;
        if (!(findViewById instanceof ViewGroup)) {
            findViewById = null;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById;
        if (viewGroup != null) {
            view = viewGroup.getChildAt(0);
        }
        C13706o.m87926c(view);
        SnackbarAnimate h = SnackbarAnimate.m69573h(view, C17541R$string.could_not_sign_in, 0);
        C13706o.m87928e(h, "make(contentView!!, R.st…ckbarAnimate.LENGTH_LONG)");
        h.mo58921e().setBackgroundResource(C17528R$color.snack_bar_error);
        View findViewById2 = h.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setTextColor(-1);
        h.mo58932r();
    }

    /* renamed from: p2 */
    private final void m21233p2(String str, int i, View view) {
        SnackbarAnimate i2 = SnackbarAnimate.m69574i(view, str, 0);
        C13706o.m87928e(i2, "make(parentView, text, S…ckbarAnimate.LENGTH_LONG)");
        i2.mo58921e().setBackgroundResource(i);
        View findViewById = i2.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(-1);
        View findViewById2 = i2.mo58921e().findViewById(2131363814);
        C13706o.m87927d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setTextColor(-1);
        i2.mo58932r();
    }

    /* renamed from: q2 */
    static /* synthetic */ void m21234q2(UserActivity userActivity, String str, int i, View view, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            View findViewById = userActivity.findViewById(16908290);
            if (!(findViewById instanceof ViewGroup)) {
                findViewById = null;
            }
            ViewGroup viewGroup = (ViewGroup) findViewById;
            view = viewGroup != null ? viewGroup.getChildAt(0) : null;
            C13706o.m87926c(view);
        }
        userActivity.m21233p2(str, i, view);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m21235r2(UserActivity userActivity, View view) {
        C13706o.m87929f(userActivity, "this$0");
        userActivity.startActivity(new Intent(userActivity, UpgradeActivity2.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m21236s2(UserActivity userActivity, View view) {
        C13706o.m87929f(userActivity, "this$0");
        userActivity.mo30772i2().mo32405s(userActivity);
    }

    /* renamed from: F0 */
    public void mo30761F0() {
        ((TextView) mo30768W1(C17532R$id.usernameText)).setPaintFlags(16);
        ((TextView) mo30768W1(C17532R$id.description)).setText(getString(C17541R$string.blocked_user_description));
        FrameLayout frameLayout = (FrameLayout) mo30768W1(C17532R$id.templateListContainer);
        C13706o.m87928e(frameLayout, "templateListContainer");
        frameLayout.setVisibility(8);
        FrameLayout frameLayout2 = (FrameLayout) mo30768W1(C17532R$id.blockedContainer);
        C13706o.m87928e(frameLayout2, "blockedContainer");
        frameLayout2.setVisibility(0);
        ((ImageView) mo30768W1(C17532R$id.subscribeButton)).setVisibility(4);
        Button button = (Button) mo30768W1(C17532R$id.unblockUserButton);
        C13706o.m87928e(button, "unblockUserButton");
        C4666m.m18147o(button, (C13640g) null, new C5518f(this, (C13635d<? super C5518f>) null), 1, (Object) null);
        ((AppBarLayout) mo30768W1(C17532R$id.appBarLayout)).setExpanded(true);
        this.f13481E = true;
    }

    /* renamed from: F1 */
    public void mo30762F1() {
        ProgressBar progressBar = (ProgressBar) mo30768W1(C17532R$id.subscribingProgress);
        C13706o.m87928e(progressBar, "subscribingProgress");
        progressBar.setVisibility(0);
    }

    /* renamed from: H0 */
    public void mo30763H0() {
        C4655b.m18111b(this, C5472t.C5473a.m21072b(C5472t.f13410K, 0, this.f13480D, false, false, false, 24, (Object) null), C17532R$id.templateListContainer);
    }

    /* renamed from: K */
    public void mo30764K(User user) {
        C13706o.m87929f(user, "user");
        ((TextView) mo30768W1(C17532R$id.description)).setText(user.getDescription());
        ((TextView) mo30768W1(C17532R$id.starRating)).setText(String.valueOf(user.getRating()));
        ((TextView) mo30768W1(C17532R$id.numMacros)).setText(String.valueOf(user.getNumMacros()));
        ((TextView) mo30768W1(C17532R$id.userRank)).setText(user.getUserRank() + " / " + user.getTotalUsers());
        LinearLayout linearLayout = (LinearLayout) mo30768W1(C17532R$id.userStatsLayout);
        C13706o.m87928e(linearLayout, "userStatsLayout");
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) mo30768W1(C17532R$id.userRankContainer);
        C13706o.m87928e(linearLayout2, "userRankContainer");
        linearLayout2.setVisibility(0);
        ((TextView) mo30768W1(C17532R$id.usernameText)).setPaintFlags(1);
        FrameLayout frameLayout = (FrameLayout) mo30768W1(C17532R$id.templateListContainer);
        C13706o.m87928e(frameLayout, "templateListContainer");
        frameLayout.setVisibility(0);
        FrameLayout frameLayout2 = (FrameLayout) mo30768W1(C17532R$id.blockedContainer);
        C13706o.m87928e(frameLayout2, "blockedContainer");
        frameLayout2.setVisibility(8);
        ((ImageView) mo30768W1(C17532R$id.subscribeButton)).setVisibility(0);
    }

    /* renamed from: M */
    public void mo30765M(boolean z) {
        ProgressBar progressBar = (ProgressBar) mo30768W1(C17532R$id.subscribingProgress);
        C13706o.m87928e(progressBar, "subscribingProgress");
        progressBar.setVisibility(8);
        String string = getString(z ? C17541R$string.template_store_subscription_failed : C17541R$string.template_store_unsubscribe_failed);
        C13706o.m87928e(string, "getString(if (triedToSub…bscribe_failed\n        })");
        C15626c.m94876a(this, string, 0).show();
    }

    /* renamed from: Q */
    public void mo30766Q(boolean z, boolean z2) {
        String str;
        ProgressBar progressBar = (ProgressBar) mo30768W1(C17532R$id.subscribingProgress);
        C13706o.m87928e(progressBar, "subscribingProgress");
        progressBar.setVisibility(8);
        int i = C17532R$id.subscribeButton;
        ImageViewCompat.setImageTintList((ImageView) mo30768W1(i), ColorStateList.valueOf(ContextCompat.getColor(this, z ? C17528R$color.subscribed_indicator_color : 2131101114)));
        ((ImageView) mo30768W1(i)).setImageResource(z ? C17530R$drawable.ic_bell_ring_white_24dp : C17530R$drawable.ic_bell);
        if (z2) {
            if (z) {
                C13696i0 i0Var = C13696i0.f61931a;
                String string = getString(C17541R$string.template_store_subscribed_to);
                C13706o.m87928e(string, "getString(R.string.template_store_subscribed_to)");
                str = String.format(string, Arrays.copyOf(new Object[]{((TextView) mo30768W1(C17532R$id.usernameText)).getText()}, 1));
                C13706o.m87928e(str, "format(format, *args)");
            } else {
                C13696i0 i0Var2 = C13696i0.f61931a;
                String string2 = getString(C17541R$string.template_store_unsubscribed_from);
                C13706o.m87928e(string2, "getString(R.string.templ…_store_unsubscribed_from)");
                str = String.format(string2, Arrays.copyOf(new Object[]{((TextView) mo30768W1(C17532R$id.usernameText)).getText()}, 1));
                C13706o.m87928e(str, "format(format, *args)");
            }
            C15626c.m94876a(this, str, 0).show();
        }
    }

    /* renamed from: U0 */
    public void mo30767U0() {
        FrameLayout frameLayout = (FrameLayout) mo30768W1(C17532R$id.templateListContainer);
        C13706o.m87928e(frameLayout, "templateListContainer");
        frameLayout.setVisibility(0);
        FrameLayout frameLayout2 = (FrameLayout) mo30768W1(C17532R$id.blockedContainer);
        C13706o.m87928e(frameLayout2, "blockedContainer");
        frameLayout2.setVisibility(8);
        this.f13481E = false;
    }

    /* renamed from: W1 */
    public View mo30768W1(int i) {
        Map<Integer, View> map = this.f13483G;
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

    /* renamed from: d */
    public void mo30769d() {
        View findViewById = findViewById(16908290);
        View view = null;
        if (!(findViewById instanceof ViewGroup)) {
            findViewById = null;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById;
        if (viewGroup != null) {
            view = viewGroup.getChildAt(0);
        }
        C13706o.m87926c(view);
        SnackbarAnimate h = SnackbarAnimate.m69573h(view, C17541R$string.template_store_sorry_subsribe_users_pro_only, SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY);
        C13706o.m87928e(h, "make(contentView!!, R.st…ibe_users_pro_only, 5000)");
        h.mo58921e().setBackgroundResource(2131100690);
        View findViewById2 = h.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setTextColor(-1);
        View findViewById3 = h.mo58921e().findViewById(2131363814);
        C13706o.m87927d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setTextColor(-1);
        h.mo58926l(C17541R$string.upgrade, new C5524d(this));
        h.mo58932r();
    }

    /* renamed from: g2 */
    public final C5541l mo30770g2() {
        C5541l lVar = this.f13484s;
        if (lVar != null) {
            return lVar;
        }
        C13706o.m87945v("presenter");
        return null;
    }

    /* renamed from: h2 */
    public final C5331h mo30771h2() {
        C5331h hVar = this.f13485z;
        if (hVar != null) {
            return hVar;
        }
        C13706o.m87945v("profileImageProvider");
        return null;
    }

    /* renamed from: i2 */
    public final C6353g mo30772i2() {
        C6353g gVar = this.f13477A;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("signInHelper");
        return null;
    }

    /* renamed from: j2 */
    public final C5527g mo30773j2() {
        C5527g gVar = this.f13478B;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("userProvider");
        return null;
    }

    /* renamed from: o */
    public void mo30774o() {
        AppCompatDialog appCompatDialog = this.f13482F;
        View findViewById = appCompatDialog != null ? appCompatDialog.findViewById(2131363679) : null;
        if (findViewById != null) {
            String string = getString(C17541R$string.upload_failed);
            C13706o.m87928e(string, "getString(R.string.upload_failed)");
            m21233p2(string, C17528R$color.snack_bar_error, findViewById);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C17070a aVar;
        super.onActivityResult(i, i2, intent);
        IdpResponse g = IdpResponse.m25763g(intent);
        if (i == 9729) {
            Integer num = null;
            if (i2 == -1) {
                C6353g i22 = mo30772i2();
                C17070a aVar2 = this.f13479C;
                if (aVar2 == null) {
                    C13706o.m87945v("compositeDisposable");
                    aVar = null;
                } else {
                    aVar = aVar2;
                }
                C6353g.m24557j(i22, g, aVar, new C5514b(this), false, 8, (Object) null);
            } else if (g != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Sign in error: ");
                FirebaseUiException j = g.mo34092j();
                if (j != null) {
                    num = Integer.valueOf(j.mo34082a());
                }
                sb.append(num);
                C4878b.m18868g(sb.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_user);
        String stringExtra = getIntent().getStringExtra("username");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        String stringExtra2 = getIntent().getStringExtra("user_image");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        this.f13480D = getIntent().getIntExtra("user_id", 0);
        this.f13479C = new C17070a();
        ((TextView) mo30768W1(C17532R$id.usernameText)).setText(stringExtra);
        setSupportActionBar((Toolbar) mo30768W1(C17532R$id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
        C4655b.m18110a(this, C5472t.C5473a.m21072b(C5472t.f13410K, 0, this.f13480D, false, false, false, 24, (Object) null), C17532R$id.templateListContainer);
        mo30770g2().mo30794T(this.f13480D, stringExtra, str);
        mo30770g2().mo40891n(this);
        if (C13706o.m87924a(mo30773j2().mo30790b().getUsername(), stringExtra)) {
            ((ImageView) mo30768W1(C17532R$id.subscribeButton)).setVisibility(4);
        }
        int i = C17532R$id.avatarImage;
        if (((AvatarView) mo30768W1(i)) != null) {
            C5331h h2 = mo30771h2();
            AvatarView avatarView = (AvatarView) mo30768W1(i);
            C13706o.m87928e(avatarView, "avatarImage");
            h2.mo30528b(avatarView, str, stringExtra);
        }
        ImageButton imageButton = (ImageButton) mo30768W1(C17532R$id.backButton);
        C13706o.m87928e(imageButton, "backButton");
        C4666m.m18147o(imageButton, (C13640g) null, new C5515c(this, (C13635d<? super C5515c>) null), 1, (Object) null);
        ImageView imageView = (ImageView) mo30768W1(C17532R$id.subscribeButton);
        C13706o.m87928e(imageView, "subscribeButton");
        C4666m.m18147o(imageView, (C13640g) null, new C5516d(this, (C13635d<? super C5516d>) null), 1, (Object) null);
        ImageView imageView2 = (ImageView) mo30768W1(C17532R$id.menuButton);
        C13706o.m87928e(imageView2, "menuButton");
        C4666m.m18147o(imageView2, (C13640g) null, new C5517e(this, (C13635d<? super C5517e>) null), 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo30770g2().mo40889j();
        C17070a aVar = this.f13479C;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo80337d();
    }

    /* renamed from: p */
    public void mo30775p() {
        AppCompatDialog appCompatDialog = this.f13482F;
        if (appCompatDialog != null) {
            appCompatDialog.dismiss();
        }
        String string = getString(C17541R$string.report_submitted);
        C13706o.m87928e(string, "getString(R.string.report_submitted)");
        m21234q2(this, string, 2131100649, (View) null, 4, (Object) null);
    }

    /* renamed from: r */
    public void mo30776r(boolean z) {
        AppCompatDialog appCompatDialog = this.f13482F;
        ViewFlipper viewFlipper = appCompatDialog != null ? (ViewFlipper) appCompatDialog.findViewById(C17532R$id.viewFlipper) : null;
        if (viewFlipper != null) {
            viewFlipper.setDisplayedChild(z ? 1 : 0);
        }
    }

    /* renamed from: s */
    public void mo30777s() {
        View findViewById = findViewById(16908290);
        View view = null;
        if (!(findViewById instanceof ViewGroup)) {
            findViewById = null;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById;
        if (viewGroup != null) {
            view = viewGroup.getChildAt(0);
        }
        C13706o.m87926c(view);
        SnackbarAnimate h = SnackbarAnimate.m69573h(view, C17541R$string.template_store_sorry_subsribe_users_must_sign_in, SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY);
        C13706o.m87928e(h, "make(contentView!!, R.st…users_must_sign_in, 5000)");
        h.mo58921e().setBackgroundResource(2131100690);
        View findViewById2 = h.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setTextColor(-1);
        View findViewById3 = h.mo58921e().findViewById(2131363814);
        C13706o.m87927d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setTextColor(-1);
        h.mo58926l(C17541R$string.sign_in, new C5523c(this));
        h.mo58932r();
    }
}
