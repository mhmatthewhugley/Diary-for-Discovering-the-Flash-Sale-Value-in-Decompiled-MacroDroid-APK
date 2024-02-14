package com.arlosoft.macrodroid.templatestore.p071ui.profile;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.arlosoft.macrodroid.utils.C6362a0;
import com.google.android.material.snackbar.SnackbarAnimate;
import com.yalantis.ucrop.C11913a;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15478k0;
import p076d1.C7232g;
import p076d1.C7237i;
import p076d1.C7238j;
import p076d1.C7239k;
import p248e7.C12168a;
import p259f7.C12242b;
import p259f7.C12245e;
import p267g7.C12312a;
import p270ga.C12318a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16265l;
import p370qa.C16270q;
import p440y9.C16971a;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.profile.ProfileActivity */
/* compiled from: ProfileActivity.kt */
public final class ProfileActivity extends MacroDroidDaggerBaseActivity implements C5342s {

    /* renamed from: G */
    public static final C5315a f13156G = new C5315a((C13695i) null);

    /* renamed from: A */
    public C5527g f13157A;

    /* renamed from: B */
    private boolean f13158B;

    /* renamed from: C */
    private String f13159C;

    /* renamed from: D */
    private boolean f13160D;

    /* renamed from: E */
    private String f13161E = "";

    /* renamed from: F */
    public Map<Integer, View> f13162F = new LinkedHashMap();

    /* renamed from: s */
    public C5341r f13163s;

    /* renamed from: z */
    public C5331h f13164z;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.profile.ProfileActivity$a */
    /* compiled from: ProfileActivity.kt */
    public static final class C5315a {
        private C5315a() {
        }

        public /* synthetic */ C5315a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo30512a(Context context, boolean z, String str, boolean z2) {
            C13706o.m87929f(context, "context");
            C13706o.m87929f(str, "personalIdentifier");
            Intent intent = new Intent(context, ProfileActivity.class);
            intent.putExtra("createProfile", z);
            intent.putExtra("personalIdentifier", str);
            intent.putExtra("showSignOut", z2);
            return intent;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.profile.ProfileActivity$b */
    /* compiled from: ProfileActivity.kt */
    static final class C5316b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ProfileActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5316b(ProfileActivity profileActivity, C13635d<? super C5316b> dVar) {
            super(3, dVar);
            this.this$0 = profileActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5316b(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m20654q2();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.profile.ProfileActivity$c */
    /* compiled from: ProfileActivity.kt */
    static final class C5317c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ProfileActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5317c(ProfileActivity profileActivity, C13635d<? super C5317c> dVar) {
            super(3, dVar);
            this.this$0 = profileActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5317c(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m20655r2();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.profile.ProfileActivity$d */
    /* compiled from: ProfileActivity.kt */
    static final class C5318d extends C13708q implements C16265l<String, C13339u> {
        final /* synthetic */ ProfileActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5318d(ProfileActivity profileActivity) {
            super(1);
            this.this$0 = profileActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13339u.f61331a;
        }

        public final void invoke(String str) {
            C13706o.m87929f(str, "text");
            this.this$0.m20631A2(str);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.profile.ProfileActivity$e */
    /* compiled from: ProfileActivity.kt */
    static final class C5319e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ProfileActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5319e(ProfileActivity profileActivity, C13635d<? super C5319e> dVar) {
            super(3, dVar);
            this.this$0 = profileActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5319e(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m20660w2();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.profile.ProfileActivity$f */
    /* compiled from: ProfileActivity.kt */
    static final class C5320f extends C13708q implements C16265l<String, C13339u> {
        final /* synthetic */ AppCompatDialog $dialog;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5320f(AppCompatDialog appCompatDialog) {
            super(1);
            this.$dialog = appCompatDialog;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13339u.f61331a;
        }

        public final void invoke(String str) {
            C13706o.m87929f(str, "it");
            AppCompatDialog appCompatDialog = this.$dialog;
            int i = C17532R$id.descriptionEditText;
            if (((EditText) appCompatDialog.findViewById(i)).getLayout().getLineCount() > 10) {
                ((EditText) this.$dialog.findViewById(i)).getText().delete(((EditText) this.$dialog.findViewById(i)).getText().length() - 1, ((EditText) this.$dialog.findViewById(i)).getText().length());
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.profile.ProfileActivity$g */
    /* compiled from: ProfileActivity.kt */
    static final class C5321g extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;
        final /* synthetic */ ProfileActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5321g(ProfileActivity profileActivity, AppCompatDialog appCompatDialog, C13635d<? super C5321g> dVar) {
            super(3, dVar);
            this.this$0 = profileActivity;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5321g(this.this$0, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                ((TextView) this.this$0.mo30505X1(C17532R$id.description)).setText(((EditText) this.$dialog.findViewById(C17532R$id.descriptionEditText)).getText().toString());
                this.$dialog.dismiss();
                this.this$0.m20632B2();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.profile.ProfileActivity$h */
    /* compiled from: ProfileActivity.kt */
    static final class C5322h extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5322h(AppCompatDialog appCompatDialog, C13635d<? super C5322h> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5322h(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
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

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.profile.ProfileActivity$i */
    /* compiled from: ProfileActivity.kt */
    public static final class C5323i implements C7238j {

        /* renamed from: a */
        final /* synthetic */ ProfileActivity f13165a;

        C5323i(ProfileActivity profileActivity) {
            this.f13165a = profileActivity;
        }

        /* renamed from: a */
        public void mo30520a(C7232g gVar) {
            C13706o.m87929f(gVar, "bubbleShowCase");
            this.f13165a.m20659v2();
        }

        /* renamed from: b */
        public void mo30521b(C7232g gVar) {
            C13706o.m87929f(gVar, "bubbleShowCase");
        }

        /* renamed from: c */
        public void mo30522c(C7232g gVar) {
            C13706o.m87929f(gVar, "bubbleShowCase");
            this.f13165a.m20659v2();
        }

        /* renamed from: d */
        public void mo30523d(C7232g gVar) {
            C13706o.m87929f(gVar, "bubbleShowCase");
            this.f13165a.m20659v2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public final void m20631A2(String str) {
        if (!this.f13160D) {
            C5331h j2 = mo30508j2();
            AvatarView avatarView = (AvatarView) mo30505X1(C17532R$id.avatarImage);
            C13706o.m87928e(avatarView, "avatarImage");
            j2.mo30528b(avatarView, "", str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public final void m20632B2() {
        int i = 0;
        if (this.f13158B) {
            AppCompatButton appCompatButton = (AppCompatButton) mo30505X1(C17532R$id.saveButton);
            C13706o.m87928e(appCompatButton, "saveButton");
            appCompatButton.setVisibility(0);
            return;
        }
        AppCompatButton appCompatButton2 = (AppCompatButton) mo30505X1(C17532R$id.saveButton);
        C13706o.m87928e(appCompatButton2, "saveButton");
        if (!m20651n2()) {
            i = 8;
        }
        appCompatButton2.setVisibility(i);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
    /* renamed from: e2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m20645e2() {
        /*
            r3 = this;
            java.lang.String r0 = "MacroDroid/RXP"
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x000e }
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x000e }
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x000e }
            org.apache.commons.p353io.FileUtils.deleteDirectory(r1)     // Catch:{ IOException -> 0x000e }
        L_0x000e:
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x001b }
            r2 = 0
            java.io.File r2 = r3.getExternalFilesDir(r2)     // Catch:{ IOException -> 0x001b }
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x001b }
            org.apache.commons.p353io.FileUtils.deleteDirectory(r1)     // Catch:{ IOException -> 0x001b }
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.templatestore.p071ui.profile.ProfileActivity.m20645e2():void");
    }

    /* renamed from: f2 */
    private final void m20646f2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Template);
        builder.setTitle((CharSequence) getString(C17541R$string.delete_profile));
        builder.setMessage((int) C17541R$string.delete_profile_confirm);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5326c(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m20647g2(ProfileActivity profileActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(profileActivity, "this$0");
        profileActivity.mo30507i2().mo30530A();
    }

    /* renamed from: h2 */
    private final File m20648h2() {
        File h = C6362a0.m24602h(this);
        if (!h.exists()) {
            h.mkdirs();
        }
        return new File(h, "AvatarIcon.jpg");
    }

    /* renamed from: l2 */
    private final void m20649l2() {
        C5331h j2 = mo30508j2();
        AvatarView avatarView = (AvatarView) mo30505X1(C17532R$id.avatarImage);
        C13706o.m87928e(avatarView, "avatarImage");
        j2.mo30528b(avatarView, "", "?");
    }

    /* renamed from: m2 */
    private final void m20650m2() {
        User b = mo30509k2().mo30790b();
        C5331h j2 = mo30508j2();
        AvatarView avatarView = (AvatarView) mo30505X1(C17532R$id.avatarImage);
        C13706o.m87928e(avatarView, "avatarImage");
        j2.mo30528b(avatarView, b.getImage(), b.getUsername());
        int i = C17532R$id.usernameEdit;
        ((AppCompatEditText) mo30505X1(i)).setText(b.getUsername());
        ((AppCompatEditText) mo30505X1(i)).setEnabled(false);
        ((TextView) mo30505X1(C17532R$id.description)).setText(b.getDescription());
    }

    /* renamed from: n2 */
    private final boolean m20651n2() {
        return !C13706o.m87924a(((TextView) mo30505X1(C17532R$id.description)).getText().toString(), this.f13161E) || this.f13160D;
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m20652o2(ProfileActivity profileActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(profileActivity, "this$0");
        profileActivity.m20654q2();
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m20653p2(ProfileActivity profileActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(profileActivity, "this$0");
        super.onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public final void m20654q2() {
        C5341r i2 = mo30507i2();
        boolean z = this.f13158B;
        String obj = C15177w.m93672R0(String.valueOf(((AppCompatEditText) mo30505X1(C17532R$id.usernameEdit)).getText())).toString();
        String str = this.f13159C;
        File file = null;
        if (str == null) {
            C13706o.m87945v("personalIdentifier");
            str = null;
        }
        String obj2 = C15177w.m93672R0(((TextView) mo30505X1(C17532R$id.description)).getText().toString()).toString();
        if (this.f13160D) {
            file = m20648h2();
        }
        i2.mo30531D(z, obj, str, obj2, file);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final void m20655r2() {
        C11913a.C11914a aVar = new C11913a.C11914a();
        aVar.mo67215e(1.0f, 1.0f);
        aVar.mo67213c(Bitmap.CompressFormat.PNG);
        aVar.mo67212b(true);
        aVar.mo67214d(getString(C17541R$string.edit_image));
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        ((C12168a.C12171c) ((C12168a.C12171c) ((C12168a.C12171c) C12168a.m82812e(this).mo68446a(aVar)).mo68449d(new C12312a(point.x / 2))).mo68450e()).mo68453g().mo79688T(C12318a.m83030b()).mo79679I(C16971a.m100210a()).mo79707n(new C5327d(this)).mo79686Q(new C5328e(this), new C5329f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m20656s2(ProfileActivity profileActivity) {
        C13706o.m87929f(profileActivity, "this$0");
        profileActivity.m20645e2();
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m20657t2(ProfileActivity profileActivity, C12245e eVar) {
        C13706o.m87929f(profileActivity, "this$0");
        if (eVar.mo68558b() == -1) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap decodeFile = BitmapFactory.decodeFile(((C12242b) eVar.mo68557a()).mo68545c().getAbsolutePath(), options);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFile, 256, 256, true);
            File h2 = profileActivity.m20648h2();
            h2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(h2);
            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            C5331h j2 = profileActivity.mo30508j2();
            AvatarView avatarView = (AvatarView) profileActivity.mo30505X1(C17532R$id.avatarImage);
            C13706o.m87928e(avatarView, "avatarImage");
            C13706o.m87928e(decodeFile, "bitmap");
            j2.mo30527a(avatarView, decodeFile, String.valueOf(((AppCompatEditText) profileActivity.mo30505X1(C17532R$id.usernameEdit)).getText()));
            profileActivity.f13160D = true;
            profileActivity.m20632B2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m20658u2(ProfileActivity profileActivity, Throwable th) {
        C13706o.m87929f(profileActivity, "this$0");
        Context applicationContext = profileActivity.getApplicationContext();
        C15626c.m94876a(applicationContext, profileActivity.getString(C17541R$string.error) + ": " + th, 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public final void m20659v2() {
        int i = C17532R$id.usernameEdit;
        ((AppCompatEditText) mo30505X1(i)).requestFocus();
        AppCompatEditText appCompatEditText = (AppCompatEditText) mo30505X1(i);
        C13706o.m87928e(appCompatEditText, "usernameEdit");
        C4666m.m18156x(appCompatEditText);
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public final void m20660w2() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_enter_description);
        appCompatDialog.setTitle((int) C17541R$string.description);
        C4656c.m18115d(appCompatDialog, 0, 1, (Object) null);
        int i = C17532R$id.descriptionEditText;
        ((EditText) appCompatDialog.findViewById(i)).setText(((TextView) mo30505X1(C17532R$id.description)).getText().toString());
        EditText editText = (EditText) appCompatDialog.findViewById(i);
        C13706o.m87928e(editText, "dialog.descriptionEditText");
        C4666m.m18138f(editText, new C5320f(appCompatDialog));
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        C13706o.m87928e(button, "dialog.okButton");
        C4666m.m18147o(button, (C13640g) null, new C5321g(this, appCompatDialog, (C13635d<? super C5321g>) null), 1, (Object) null);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87928e(button2, "dialog.cancelButton");
        C4666m.m18147o(button2, (C13640g) null, new C5322h(appCompatDialog, (C13635d<? super C5322h>) null), 1, (Object) null);
        Window window = appCompatDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        appCompatDialog.show();
    }

    /* renamed from: x2 */
    private final void m20661x2(int i) {
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
        SnackbarAnimate h = SnackbarAnimate.m69573h(view, i, 0);
        C13706o.m87928e(h, "make(this.contentView!!,…ckbarAnimate.LENGTH_LONG)");
        h.mo58921e().setBackgroundResource(C17528R$color.snack_bar_error);
        View findViewById2 = h.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setTextColor(-1);
        h.mo58932r();
    }

    /* renamed from: y2 */
    private final void m20662y2(String str) {
        SnackbarAnimate i = SnackbarAnimate.m69574i(findViewById(C17532R$id.coordinatorLayout), str, 0);
        C13706o.m87928e(i, "make(findViewById(R.id.c…ckbarAnimate.LENGTH_LONG)");
        i.mo58921e().setBackgroundResource(C17528R$color.snack_bar_error);
        View findViewById = i.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(-1);
        i.mo58932r();
    }

    /* renamed from: z2 */
    private final void m20663z2() {
        C7237i iVar = new C7237i(this);
        String string = getString(C17541R$string.username);
        C13706o.m87928e(string, "getString(R.string.username)");
        C7237i E = iVar.mo37074E(string);
        String string2 = getString(C17541R$string.enter_username_hint);
        C13706o.m87928e(string2, "getString(R.string.enter_username_hint)");
        C7237i d = E.mo37076d(string2);
        AppCompatEditText appCompatEditText = (AppCompatEditText) mo30505X1(C17532R$id.usernameEdit);
        C13706o.m87928e(appCompatEditText, "usernameEdit");
        C7237i b = d.mo37073D(appCompatEditText).mo37075b(ContextCompat.getColor(this, C17528R$color.primary_dark));
        C7237i iVar2 = new C7237i(this);
        String string3 = getString(C17541R$string.image);
        C13706o.m87928e(string3, "getString(R.string.image)");
        C7237i E2 = iVar2.mo37074E(string3);
        String string4 = getString(C17541R$string.avatar_image_hint);
        C13706o.m87928e(string4, "getString(R.string.avatar_image_hint)");
        C7237i d2 = E2.mo37076d(string4);
        FrameLayout frameLayout = (FrameLayout) mo30505X1(C17532R$id.avatarFrame);
        C13706o.m87928e(frameLayout, "avatarFrame");
        C7237i b2 = d2.mo37073D(frameLayout).mo37075b(ContextCompat.getColor(this, C17528R$color.primary_dark));
        C7237i iVar3 = new C7237i(this);
        String string5 = getString(C17541R$string.description);
        C13706o.m87928e(string5, "getString(R.string.description)");
        C7237i E3 = iVar3.mo37074E(string5);
        String string6 = getString(C17541R$string.profile_description_hint);
        C13706o.m87928e(string6, "getString(R.string.profile_description_hint)");
        C7237i d3 = E3.mo37076d(string6);
        ImageView imageView = (ImageView) mo30505X1(C17532R$id.editDescriptionButton);
        C13706o.m87928e(imageView, "editDescriptionButton");
        new C7239k().mo37099b(b).mo37099b(b2).mo37099b(d3.mo37073D(imageView).mo37098z(new C5323i(this)).mo37075b(ContextCompat.getColor(this, C17528R$color.primary_dark))).mo37100c();
    }

    /* renamed from: D */
    public void mo30502D() {
        Object systemService = getSystemService("input_method");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(((TextView) mo30505X1(C17532R$id.description)).getWindowToken(), 0);
    }

    /* renamed from: Q0 */
    public void mo30503Q0() {
        m20661x2(C17541R$string.check_connection_try_again);
    }

    /* renamed from: X0 */
    public void mo30504X0() {
        C15626c.makeText(this, C17541R$string.invalid_username, 0).show();
    }

    /* renamed from: X1 */
    public View mo30505X1(int i) {
        Map<Integer, View> map = this.f13162F;
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

    /* renamed from: a */
    public void mo30506a() {
        String string = getString(C17541R$string.delete_failed);
        C13706o.m87928e(string, "getString(R.string.delete_failed)");
        m20662y2(string);
    }

    /* renamed from: i2 */
    public final C5341r mo30507i2() {
        C5341r rVar = this.f13163s;
        if (rVar != null) {
            return rVar;
        }
        C13706o.m87945v("presenter");
        return null;
    }

    /* renamed from: j2 */
    public final C5331h mo30508j2() {
        C5331h hVar = this.f13164z;
        if (hVar != null) {
            return hVar;
        }
        C13706o.m87945v("profileImageProvider");
        return null;
    }

    /* renamed from: k2 */
    public final C5527g mo30509k2() {
        C5527g gVar = this.f13157A;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("userProvider");
        return null;
    }

    public void onBackPressed() {
        if (m20651n2()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Template);
            builder.setTitle((int) C17541R$string.save_changes);
            builder.setMessage((int) C17541R$string.do_you_wish_to_save_changes_generic);
            builder.setPositiveButton((int) C17541R$string.save, (DialogInterface.OnClickListener) new C5325b(this));
            builder.setNegativeButton((int) C17541R$string.discard, (DialogInterface.OnClickListener) new C5324a(this));
            builder.show();
        } else if (this.f13158B) {
            mo30507i2().mo30532E();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(C17542R$style.Theme_App_NoActionBar_Plugins);
        setContentView(C17535R$layout.activity_my_profile);
        setSupportActionBar((Toolbar) mo30505X1(C17532R$id.toolbar));
        mo30507i2().mo40891n(this);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        String stringExtra = getIntent().getStringExtra("personalIdentifier");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f13159C = stringExtra;
        boolean booleanExtra = getIntent().getBooleanExtra("createProfile", false);
        this.f13158B = booleanExtra;
        setTitle(booleanExtra ? C17541R$string.create_profile : C17541R$string.my_profile);
        if (this.f13158B) {
            m20649l2();
            m20663z2();
        } else {
            m20650m2();
            this.f13161E = mo30509k2().mo30790b().getDescription();
        }
        m20632B2();
        AppCompatButton appCompatButton = (AppCompatButton) mo30505X1(C17532R$id.saveButton);
        C13706o.m87928e(appCompatButton, "saveButton");
        C4666m.m18147o(appCompatButton, (C13640g) null, new C5316b(this, (C13635d<? super C5316b>) null), 1, (Object) null);
        AvatarView avatarView = (AvatarView) mo30505X1(C17532R$id.avatarImage);
        C13706o.m87928e(avatarView, "avatarImage");
        C4666m.m18147o(avatarView, (C13640g) null, new C5317c(this, (C13635d<? super C5317c>) null), 1, (Object) null);
        AppCompatEditText appCompatEditText = (AppCompatEditText) mo30505X1(C17532R$id.usernameEdit);
        if (appCompatEditText != null) {
            C4666m.m18138f(appCompatEditText, new C5318d(this));
        }
        ImageView imageView = (ImageView) mo30505X1(C17532R$id.editDescriptionButton);
        C13706o.m87928e(imageView, "editDescriptionButton");
        C4666m.m18147o(imageView, (C13640g) null, new C5319e(this, (C13635d<? super C5319e>) null), 1, (Object) null);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C13706o.m87929f(menu, "menu");
        if (this.f13158B) {
            return true;
        }
        getMenuInflater().inflate(C17536R$menu.user_profile_menu, menu);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo30507i2().mo40889j();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId != 16908332) {
            if (itemId == 2131362464) {
                m20646f2();
            } else if (itemId == 2131363795) {
                mo30507i2().mo30532E();
            }
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* renamed from: q0 */
    public void mo30510q0(boolean z) {
        FrameLayout frameLayout = (FrameLayout) mo30505X1(C17532R$id.loadingView);
        if (frameLayout != null) {
            frameLayout.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: y0 */
    public void mo30511y0() {
        m20661x2(C17541R$string.username_already_taken_message);
    }
}
