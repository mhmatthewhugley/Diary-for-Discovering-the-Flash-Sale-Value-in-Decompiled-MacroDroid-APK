package com.github.javiersantos.piracychecker;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.ColorRes;
import androidx.annotation.LayoutRes;
import com.github.javiersantos.licensing.LibraryChecker;
import com.github.javiersantos.piracychecker.callbacks.AllowCallback;
import com.github.javiersantos.piracychecker.callbacks.DoNotAllowCallback;
import com.github.javiersantos.piracychecker.callbacks.OnErrorCallback;
import com.github.javiersantos.piracychecker.enums.AppType;
import com.github.javiersantos.piracychecker.enums.Display;
import com.github.javiersantos.piracychecker.enums.PiracyCheckerError;
import com.github.javiersantos.piracychecker.enums.PirateApp;
import com.github.javiersantos.piracychecker.utils.LibraryUtilsKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001VJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0004R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010\u0014R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0014R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR$\u0010Q\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bM\u0010,\u001a\u0004\b.\u0010N\"\u0004\bO\u0010PR$\u0010T\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bR\u0010,\u001a\u0004\b+\u0010N\"\u0004\bS\u0010P¨\u0006W"}, mo71668d2 = {"Lcom/github/javiersantos/piracychecker/PiracyChecker;", "", "", "possibleSuccess", "Lja/u;", "o", "n", "m", "l", "Lcom/github/javiersantos/piracychecker/enums/Display;", "a", "Lcom/github/javiersantos/piracychecker/enums/Display;", "display", "", "b", "I", "colorPrimary", "c", "colorPrimaryDark", "d", "Z", "withLightStatusBar", "e", "layoutXML", "f", "enableUnauthorizedAppsCheck", "g", "enableStoresCheck", "h", "enableEmulatorCheck", "i", "enableDeepEmulatorCheck", "j", "enableDebugCheck", "k", "enableFoldersCheck", "enableAPKCheck", "saveToSharedPreferences", "blockUnauthorized", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "preferences", "", "p", "Ljava/lang/String;", "preferenceSaveResult", "q", "preferenceBlockUnauthorized", "Ljava/util/ArrayList;", "Lcom/github/javiersantos/piracychecker/enums/PirateApp;", "r", "Ljava/util/ArrayList;", "extraApps", "Lcom/github/javiersantos/piracychecker/callbacks/AllowCallback;", "s", "Lcom/github/javiersantos/piracychecker/callbacks/AllowCallback;", "allowCallback", "Lcom/github/javiersantos/piracychecker/callbacks/DoNotAllowCallback;", "t", "Lcom/github/javiersantos/piracychecker/callbacks/DoNotAllowCallback;", "doNotAllowCallback", "Lcom/github/javiersantos/piracychecker/callbacks/OnErrorCallback;", "u", "Lcom/github/javiersantos/piracychecker/callbacks/OnErrorCallback;", "onErrorCallback", "Lcom/github/javiersantos/licensing/LibraryChecker;", "v", "Lcom/github/javiersantos/licensing/LibraryChecker;", "libraryLVLChecker", "Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;", "w", "Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;", "dialog", "Landroid/content/Context;", "x", "Landroid/content/Context;", "context", "y", "()Ljava/lang/String;", "setUnlicensedDialogTitle", "(Ljava/lang/String;)V", "unlicensedDialogTitle", "z", "setUnlicensedDialogDescription", "unlicensedDialogDescription", "A", "Companion", "library_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: PiracyChecker.kt */
public final class PiracyChecker {

    /* renamed from: A */
    public static final Companion f16267A = new Companion((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Display f16268a;
    /* access modifiers changed from: private */
    @ColorRes

    /* renamed from: b */
    public int f16269b;
    /* access modifiers changed from: private */
    @ColorRes

    /* renamed from: c */
    public int f16270c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f16271d;
    /* access modifiers changed from: private */
    @LayoutRes

    /* renamed from: e */
    public int f16272e;

    /* renamed from: f */
    private boolean f16273f;

    /* renamed from: g */
    private boolean f16274g;

    /* renamed from: h */
    private boolean f16275h;

    /* renamed from: i */
    private boolean f16276i;

    /* renamed from: j */
    private boolean f16277j;

    /* renamed from: k */
    private boolean f16278k;

    /* renamed from: l */
    private boolean f16279l;

    /* renamed from: m */
    private boolean f16280m;

    /* renamed from: n */
    private boolean f16281n;

    /* renamed from: o */
    private SharedPreferences f16282o;

    /* renamed from: p */
    private String f16283p;

    /* renamed from: q */
    private String f16284q;

    /* renamed from: r */
    private final ArrayList<PirateApp> f16285r;

    /* renamed from: s */
    private AllowCallback f16286s;

    /* renamed from: t */
    private DoNotAllowCallback f16287t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public OnErrorCallback f16288u;

    /* renamed from: v */
    private LibraryChecker f16289v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public PiracyCheckerDialog f16290w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public Context f16291x;

    /* renamed from: y */
    private String f16292y;

    /* renamed from: z */
    private String f16293z;

    @Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo71668d2 = {"Lcom/github/javiersantos/piracychecker/PiracyChecker$Companion;", "", "()V", "LIBRARY_PREFERENCES_NAME", "", "library_release"}, mo71669k = 1, mo71670mv = {1, 1, 16})
    /* compiled from: PiracyChecker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    /* renamed from: m */
    private final void m26212m() {
        LibraryChecker libraryChecker = this.f16289v;
        if (libraryChecker != null) {
            libraryChecker.mo34322g();
        }
        LibraryChecker libraryChecker2 = this.f16289v;
        if (libraryChecker2 != null) {
            libraryChecker2.mo34323j();
        }
        this.f16289v = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m26213n() {
        PiracyCheckerDialog piracyCheckerDialog = this.f16290w;
        if (piracyCheckerDialog != null) {
            piracyCheckerDialog.dismiss();
        }
        this.f16290w = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m26214o(boolean z) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        PiracyCheckerError piracyCheckerError;
        SharedPreferences sharedPreferences2;
        SharedPreferences.Editor edit2;
        SharedPreferences.Editor putBoolean2;
        SharedPreferences sharedPreferences3;
        SharedPreferences.Editor edit3;
        SharedPreferences.Editor putBoolean3;
        SharedPreferences sharedPreferences4;
        SharedPreferences.Editor edit4;
        SharedPreferences.Editor putBoolean4;
        PiracyCheckerError piracyCheckerError2;
        SharedPreferences sharedPreferences5;
        SharedPreferences.Editor edit5;
        SharedPreferences.Editor putBoolean5;
        SharedPreferences sharedPreferences6;
        SharedPreferences.Editor edit6;
        SharedPreferences.Editor putBoolean6;
        SharedPreferences sharedPreferences7;
        SharedPreferences.Editor edit7;
        SharedPreferences.Editor putBoolean7;
        Context context;
        SharedPreferences sharedPreferences8;
        SharedPreferences.Editor edit8;
        SharedPreferences.Editor putBoolean8;
        Context context2 = this.f16291x;
        PirateApp e = context2 != null ? LibraryUtilsKt.m26251e(context2, this.f16273f, this.f16274g, this.f16278k, this.f16279l, this.f16285r) : null;
        if (z) {
            if (this.f16277j && (context = this.f16291x) != null && LibraryUtilsKt.m26253g(context)) {
                if (!(!this.f16280m || (sharedPreferences8 = this.f16282o) == null || (edit8 = sharedPreferences8.edit()) == null || (putBoolean8 = edit8.putBoolean(this.f16283p, false)) == null)) {
                    putBoolean8.apply();
                }
                DoNotAllowCallback doNotAllowCallback = this.f16287t;
                if (doNotAllowCallback != null) {
                    doNotAllowCallback.mo34339c(PiracyCheckerError.USING_DEBUG_APP, (PirateApp) null);
                }
            } else if (this.f16275h && LibraryUtilsKt.m26254h(this.f16276i)) {
                if (!(!this.f16280m || (sharedPreferences7 = this.f16282o) == null || (edit7 = sharedPreferences7.edit()) == null || (putBoolean7 = edit7.putBoolean(this.f16283p, false)) == null)) {
                    putBoolean7.apply();
                }
                DoNotAllowCallback doNotAllowCallback2 = this.f16287t;
                if (doNotAllowCallback2 != null) {
                    doNotAllowCallback2.mo34339c(PiracyCheckerError.USING_APP_IN_EMULATOR, (PirateApp) null);
                }
            } else if (e != null) {
                if (!(!this.f16280m || (sharedPreferences6 = this.f16282o) == null || (edit6 = sharedPreferences6.edit()) == null || (putBoolean6 = edit6.putBoolean(this.f16283p, false)) == null)) {
                    putBoolean6.apply();
                }
                if (!(!this.f16281n || e.mo34354c() != AppType.PIRATE || (sharedPreferences5 = this.f16282o) == null || (edit5 = sharedPreferences5.edit()) == null || (putBoolean5 = edit5.putBoolean(this.f16284q, true)) == null)) {
                    putBoolean5.apply();
                }
                DoNotAllowCallback doNotAllowCallback3 = this.f16287t;
                if (doNotAllowCallback3 != null) {
                    if (e.mo34354c() == AppType.STORE) {
                        piracyCheckerError2 = PiracyCheckerError.THIRD_PARTY_STORE_INSTALLED;
                    } else {
                        piracyCheckerError2 = PiracyCheckerError.PIRATE_APP_INSTALLED;
                    }
                    doNotAllowCallback3.mo34339c(piracyCheckerError2, e);
                }
            } else {
                if (!(!this.f16280m || (sharedPreferences4 = this.f16282o) == null || (edit4 = sharedPreferences4.edit()) == null || (putBoolean4 = edit4.putBoolean(this.f16283p, true)) == null)) {
                    putBoolean4.apply();
                }
                AllowCallback allowCallback = this.f16286s;
                if (allowCallback != null) {
                    allowCallback.mo34338a();
                }
            }
        } else if (e != null) {
            if (!(!this.f16280m || (sharedPreferences3 = this.f16282o) == null || (edit3 = sharedPreferences3.edit()) == null || (putBoolean3 = edit3.putBoolean(this.f16283p, false)) == null)) {
                putBoolean3.apply();
            }
            if (!(!this.f16281n || e.mo34354c() != AppType.PIRATE || (sharedPreferences2 = this.f16282o) == null || (edit2 = sharedPreferences2.edit()) == null || (putBoolean2 = edit2.putBoolean(this.f16284q, true)) == null)) {
                putBoolean2.apply();
            }
            DoNotAllowCallback doNotAllowCallback4 = this.f16287t;
            if (doNotAllowCallback4 != null) {
                if (e.mo34354c() == AppType.STORE) {
                    piracyCheckerError = PiracyCheckerError.THIRD_PARTY_STORE_INSTALLED;
                } else {
                    piracyCheckerError = PiracyCheckerError.PIRATE_APP_INSTALLED;
                }
                doNotAllowCallback4.mo34339c(piracyCheckerError, e);
            }
        } else {
            if (!(!this.f16280m || (sharedPreferences = this.f16282o) == null || (edit = sharedPreferences.edit()) == null || (putBoolean = edit.putBoolean(this.f16283p, false)) == null)) {
                putBoolean.apply();
            }
            DoNotAllowCallback doNotAllowCallback5 = this.f16287t;
            if (doNotAllowCallback5 != null) {
                doNotAllowCallback5.mo34339c(PiracyCheckerError.NOT_LICENSED, (PirateApp) null);
            }
        }
    }

    /* renamed from: l */
    public final void mo34343l() {
        m26213n();
        m26212m();
        this.f16291x = null;
    }

    /* renamed from: p */
    public final String mo34344p() {
        return this.f16293z;
    }

    /* renamed from: q */
    public final String mo34345q() {
        return this.f16292y;
    }
}
