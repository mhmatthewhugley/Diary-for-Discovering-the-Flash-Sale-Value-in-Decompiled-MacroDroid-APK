package dev.skomlach.biometric.compat;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.annotation.ColorInt;
import androidx.annotation.MainThread;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.biometric.C0265R;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import dev.skomlach.biometric.compat.engine.BiometricAuthentication;
import dev.skomlach.biometric.compat.engine.BiometricMethod;
import dev.skomlach.biometric.compat.impl.IBiometricPromptImpl;
import dev.skomlach.biometric.compat.impl.PermissionsFragment;
import dev.skomlach.biometric.compat.impl.dialogs.HomeWatcher;
import dev.skomlach.biometric.compat.utils.BiometricTitle;
import dev.skomlach.biometric.compat.utils.DeviceUnlockedReceiver;
import dev.skomlach.biometric.compat.utils.DialogMainColor;
import dev.skomlach.biometric.compat.utils.TruncatedTextFix;
import dev.skomlach.biometric.compat.utils.WideGamutBug;
import dev.skomlach.biometric.compat.utils.activityView.ActivityViewWatcher;
import dev.skomlach.biometric.compat.utils.device.DeviceInfo;
import dev.skomlach.biometric.compat.utils.device.DeviceInfoManager;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.biometric.compat.utils.themes.DarkLightThemes;
import dev.skomlach.common.contextprovider.C12104a;
import dev.skomlach.common.misc.C12112a;
import dev.skomlach.common.misc.C12114c;
import dev.skomlach.common.misc.C12120d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C13678a0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.lsposed.hiddenapibypass.C16074i;
import p240d9.C11966a;
import p250e9.C12175a;
import p261f9.C12250b;
import p297ja.C13321g;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t*\u0001\u0018\u0018\u0000 (2\u00020\u0001:\u0003)*(B\u0011\b\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0004J\b\u0010\u000b\u001a\u00020\nH\u0007R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8BX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006+"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/BiometricPromptCompat;", "", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$AuthenticationCallback;", "callbackOuter", "Lja/u;", "startAuth", "callback", "authenticateInternal", "authenticate", "cancelAuthentication", "", "getDialogMainColor", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "builder", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "Ljava/lang/Runnable;", "stopWatcher", "Ljava/lang/Runnable;", "Ldev/skomlach/biometric/compat/impl/dialogs/HomeWatcher;", "homeWatcher", "Ldev/skomlach/biometric/compat/impl/dialogs/HomeWatcher;", "dev/skomlach/biometric/compat/BiometricPromptCompat$fragmentLifecycleCallbacks$1", "fragmentLifecycleCallbacks", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$fragmentLifecycleCallbacks$1;", "Ldev/skomlach/biometric/compat/impl/IBiometricPromptImpl;", "impl$delegate", "Lja/g;", "getImpl", "()Ldev/skomlach/biometric/compat/impl/IBiometricPromptImpl;", "impl", "", "", "getUsedPermissions", "()Ljava/util/List;", "usedPermissions", "<init>", "(Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;)V", "Companion", "AuthenticationCallback", "Builder", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptCompat.kt */
public final class BiometricPromptCompat {
    /* access modifiers changed from: private */
    public static boolean API_ENABLED = true;
    public static final Companion Companion = new Companion((C13695i) null);
    /* access modifiers changed from: private */
    public static AtomicBoolean authFlowInProgress = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public static final ArrayList<BiometricAuthRequest> availableAuthRequests = new ArrayList<>();
    /* access modifiers changed from: private */
    public static DeviceInfo deviceInfo;
    /* access modifiers changed from: private */
    public static AtomicBoolean initInProgress = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public static AtomicBoolean isBiometricInit = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public static AtomicBoolean isDeviceInfoCheckInProgress = new AtomicBoolean(false);
    private static boolean isInit;
    /* access modifiers changed from: private */
    public static final List<Runnable> pendingTasks;
    /* access modifiers changed from: private */
    public final Context appContext;
    /* access modifiers changed from: private */
    public final Builder builder;
    /* access modifiers changed from: private */
    public final BiometricPromptCompat$fragmentLifecycleCallbacks$1 fragmentLifecycleCallbacks;
    private final HomeWatcher homeWatcher;
    private final C13321g impl$delegate;
    /* access modifiers changed from: private */
    public Runnable stopWatcher;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017J\b\u0010\u0007\u001a\u00020\u0005H\u0017J\u001e\u0010\f\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J\b\u0010\r\u001a\u00020\u0005H\u0017J\b\u0010\u000e\u001a\u00020\u0005H\u0017¨\u0006\u0011"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/BiometricPromptCompat$AuthenticationCallback;", "", "", "Ldev/skomlach/biometric/compat/AuthenticationResult;", "confirmed", "Lja/u;", "onSucceeded", "onCanceled", "Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "reason", "", "description", "onFailed", "onUIOpened", "onUIClosed", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: BiometricPromptCompat.kt */
    public static abstract class AuthenticationCallback {
        public static /* synthetic */ void onFailed$default(AuthenticationCallback authenticationCallback, AuthenticationFailureReason authenticationFailureReason, CharSequence charSequence, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    charSequence = null;
                }
                authenticationCallback.onFailed(authenticationFailureReason, charSequence);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFailed");
        }

        @MainThread
        public void onCanceled() {
        }

        @MainThread
        public void onFailed(AuthenticationFailureReason authenticationFailureReason, CharSequence charSequence) {
        }

        @MainThread
        public void onSucceeded(Set<AuthenticationResult> set) {
            C13706o.m87929f(set, "confirmed");
        }

        @MainThread
        public void onUIClosed() {
        }

        @MainThread
        public void onUIOpened() {
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010,\u001a\u00020\u0018\u0012\u0006\u0010G\u001a\u00020\u0014¢\u0006\u0004\bH\u0010IB\u0011\b\u0016\u0012\u0006\u0010G\u001a\u00020\u0014¢\u0006\u0004\bH\u0010JJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0016J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0002J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0002J\u0010\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\"\u001a\u00020\u00002\b\b\u0001\u0010#\u001a\u00020\bJ\u0010\u0010%\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0004J\u0010\u0010%\u001a\u00020\u00002\b\b\u0001\u0010&\u001a\u00020\bJ\u0010\u0010(\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0004J\u0010\u0010(\u001a\u00020\u00002\b\b\u0001\u0010)\u001a\u00020\bJ\u0006\u0010+\u001a\u00020*R\u0014\u0010,\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u00101R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u00101R\u0018\u0010'\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u00101R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u00105R\u0016\u00106\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0016\u00109\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0014\u0010;\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u00103R!\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00100>8BX\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b\u0013\u0010AR!\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100>8BX\u0002¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\b\u0011\u0010AR!\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00100>8BX\u0002¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\b\u0012\u0010A¨\u0006K"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "", "", "shouldAutoVerifyCryptoAfterSuccess", "", "getTitle", "getSubtitle", "getDescription", "", "getNavBarColor", "getStatusBarColor", "getDividerColor", "isBackgroundBiometricIconsEnabled", "isNotificationEnabled", "isTruncateChecked", "", "Ldev/skomlach/biometric/compat/BiometricType;", "getPrimaryAvailableTypes", "getSecondaryAvailableTypes", "getAllAvailableTypes", "Landroidx/fragment/app/FragmentActivity;", "getContext", "Ldev/skomlach/biometric/compat/BiometricCryptographyPurpose;", "getCryptographyPurpose", "Ldev/skomlach/biometric/compat/BiometricAuthRequest;", "getBiometricAuthRequest", "Le9/a;", "getMultiWindowSupport", "biometricCryptographyPurpose", "setCryptographyPurpose", "enabled", "setEnabledBackgroundBiometricIcons", "setEnabledNotification", "title", "setTitle", "titleRes", "subtitle", "setSubtitle", "subtitleRes", "description", "setDescription", "descriptionRes", "Ldev/skomlach/biometric/compat/BiometricPromptCompat;", "build", "biometricAuthRequest", "Ldev/skomlach/biometric/compat/BiometricAuthRequest;", "Ljava/lang/ref/WeakReference;", "reference", "Ljava/lang/ref/WeakReference;", "Ljava/lang/CharSequence;", "notificationEnabled", "Z", "backgroundBiometricIconsEnabled", "Ldev/skomlach/biometric/compat/BiometricCryptographyPurpose;", "colorNavBar", "I", "dividerColor", "colorStatusBar", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "autoVerifyCryptoAfterSuccess", "Ljava/util/HashSet;", "allAvailableTypes$delegate", "Lja/g;", "()Ljava/util/HashSet;", "allAvailableTypes", "primaryAvailableTypes$delegate", "primaryAvailableTypes", "secondaryAvailableTypes$delegate", "secondaryAvailableTypes", "dummy_reference", "<init>", "(Ldev/skomlach/biometric/compat/BiometricAuthRequest;Landroidx/fragment/app/FragmentActivity;)V", "(Landroidx/fragment/app/FragmentActivity;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: BiometricPromptCompat.kt */
    public static final class Builder {
        private final C13321g allAvailableTypes$delegate;
        private final Context appContext;
        private boolean autoVerifyCryptoAfterSuccess;
        private boolean backgroundBiometricIconsEnabled;
        /* access modifiers changed from: private */
        public final BiometricAuthRequest biometricAuthRequest;
        private BiometricCryptographyPurpose biometricCryptographyPurpose;
        @ColorInt
        private int colorNavBar;
        @ColorInt
        private int colorStatusBar;
        private CharSequence description;
        @ColorInt
        private int dividerColor;
        /* access modifiers changed from: private */
        public boolean isTruncateChecked;
        private C12175a multiWindowSupport;
        private boolean notificationEnabled;
        private final C13321g primaryAvailableTypes$delegate;
        private final WeakReference<FragmentActivity> reference;
        private final C13321g secondaryAvailableTypes$delegate;
        private CharSequence subtitle;
        private CharSequence title;

        public Builder(BiometricAuthRequest biometricAuthRequest2, FragmentActivity fragmentActivity) {
            String model;
            C13706o.m87929f(biometricAuthRequest2, "biometricAuthRequest");
            C13706o.m87929f(fragmentActivity, "dummy_reference");
            this.biometricAuthRequest = biometricAuthRequest2;
            this.reference = new WeakReference<>(fragmentActivity);
            this.allAvailableTypes$delegate = C13323i.m85669b(new BiometricPromptCompat$Builder$allAvailableTypes$2(this));
            this.primaryAvailableTypes$delegate = C13323i.m85669b(new BiometricPromptCompat$Builder$primaryAvailableTypes$2(this));
            this.secondaryAvailableTypes$delegate = C13323i.m85669b(new BiometricPromptCompat$Builder$secondaryAvailableTypes$2(this));
            this.notificationEnabled = true;
            this.backgroundBiometricIconsEnabled = true;
            this.appContext = C12104a.f58372a.mo68283g();
            FragmentActivity context = getContext();
            int i = Build.VERSION.SDK_INT;
            this.colorNavBar = context.getWindow().getNavigationBarColor();
            this.colorStatusBar = context.getWindow().getStatusBarColor();
            if (i >= 28) {
                this.dividerColor = context.getWindow().getNavigationBarDividerColor();
            }
            Companion companion = BiometricPromptCompat.Companion;
            if (companion.getAPI_ENABLED()) {
                this.multiWindowSupport = new C12175a();
            }
            DeviceInfo deviceInfo = companion.getDeviceInfo();
            boolean z = false;
            if (!(deviceInfo == null || (model = deviceInfo.getModel()) == null || !C15176v.m93632G(model, "OnePlus 9", true))) {
                z = true;
            }
            if (z) {
                this.autoVerifyCryptoAfterSuccess = true;
                this.biometricCryptographyPurpose = new BiometricCryptographyPurpose(1000, (byte[]) null, 2, (C13695i) null);
            }
        }

        private final HashSet<BiometricType> getAllAvailableTypes() {
            return (HashSet) this.allAvailableTypes$delegate.getValue();
        }

        /* access modifiers changed from: private */
        public final HashSet<BiometricType> getPrimaryAvailableTypes() {
            return (HashSet) this.primaryAvailableTypes$delegate.getValue();
        }

        /* access modifiers changed from: private */
        public final HashSet<BiometricType> getSecondaryAvailableTypes() {
            return (HashSet) this.secondaryAvailableTypes$delegate.getValue();
        }

        public final BiometricPromptCompat build() {
            CharSequence charSequence = this.title;
            if (charSequence == null || charSequence.length() == 0) {
                this.title = BiometricTitle.INSTANCE.getRelevantTitle(this.appContext, getAllAvailableTypes());
            }
            TruncatedTextFix.INSTANCE.recalculateTexts(this, new BiometricPromptCompat$Builder$build$1(this));
            return new BiometricPromptCompat(this, (C13695i) null);
        }

        public final BiometricAuthRequest getBiometricAuthRequest() {
            return this.biometricAuthRequest;
        }

        public final FragmentActivity getContext() {
            FragmentActivity fragmentActivity = (FragmentActivity) this.reference.get();
            if (fragmentActivity == null) {
                Activity f = C12104a.f58372a.mo68282f();
                fragmentActivity = f instanceof FragmentActivity ? (FragmentActivity) f : null;
            }
            if (fragmentActivity != null) {
                return fragmentActivity;
            }
            throw new IllegalStateException("No activity on screen");
        }

        public final BiometricCryptographyPurpose getCryptographyPurpose() {
            return this.biometricCryptographyPurpose;
        }

        public final CharSequence getDescription() {
            return this.description;
        }

        public final int getDividerColor() {
            return this.dividerColor;
        }

        public final C12175a getMultiWindowSupport() {
            C12175a aVar = this.multiWindowSupport;
            if (aVar != null) {
                return aVar;
            }
            C13706o.m87945v("multiWindowSupport");
            return null;
        }

        public final int getNavBarColor() {
            return this.colorNavBar;
        }

        public final int getStatusBarColor() {
            return this.colorStatusBar;
        }

        public final CharSequence getSubtitle() {
            return this.subtitle;
        }

        public final CharSequence getTitle() {
            return this.title;
        }

        public final boolean isBackgroundBiometricIconsEnabled() {
            return this.backgroundBiometricIconsEnabled;
        }

        public final boolean isNotificationEnabled() {
            return this.notificationEnabled;
        }

        public final boolean isTruncateChecked() {
            return this.isTruncateChecked;
        }

        public final Builder setCryptographyPurpose(BiometricCryptographyPurpose biometricCryptographyPurpose2) {
            C13706o.m87929f(biometricCryptographyPurpose2, "biometricCryptographyPurpose");
            this.autoVerifyCryptoAfterSuccess = false;
            this.biometricCryptographyPurpose = biometricCryptographyPurpose2;
            return this;
        }

        public final Builder setDescription(CharSequence charSequence) {
            this.description = charSequence;
            return this;
        }

        public final Builder setEnabledBackgroundBiometricIcons(boolean z) {
            this.backgroundBiometricIconsEnabled = z;
            return this;
        }

        public final Builder setEnabledNotification(boolean z) {
            this.notificationEnabled = z;
            return this;
        }

        public final Builder setSubtitle(CharSequence charSequence) {
            this.subtitle = charSequence;
            return this;
        }

        public final Builder setTitle(CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }

        public final boolean shouldAutoVerifyCryptoAfterSuccess() {
            return this.autoVerifyCryptoAfterSuccess;
        }

        /* renamed from: getAllAvailableTypes  reason: collision with other method in class */
        public final Set<BiometricType> m101294getAllAvailableTypes() {
            return new HashSet(getAllAvailableTypes());
        }

        /* renamed from: getPrimaryAvailableTypes  reason: collision with other method in class */
        public final Set<BiometricType> m101295getPrimaryAvailableTypes() {
            return new HashSet(getPrimaryAvailableTypes());
        }

        /* renamed from: getSecondaryAvailableTypes  reason: collision with other method in class */
        public final Set<BiometricType> m101296getSecondaryAvailableTypes() {
            return new HashSet(getSecondaryAvailableTypes());
        }

        public final Builder setDescription(@StringRes int i) {
            this.description = this.appContext.getString(i);
            return this;
        }

        public final Builder setSubtitle(@StringRes int i) {
            this.subtitle = this.appContext.getString(i);
            return this;
        }

        public final Builder setTitle(@StringRes int i) {
            this.title = this.appContext.getString(i);
            return this;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(FragmentActivity fragmentActivity) {
            this(new BiometricAuthRequest(BiometricApi.AUTO, BiometricType.BIOMETRIC_ANY, (BiometricConfirmation) null, 4, (C13695i) null), fragmentActivity);
            C13706o.m87929f(fragmentActivity, "dummy_reference");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J(\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007R$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048F@BX\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R(\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u00188F@BX\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0016\u0010$\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0016\u0010%\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/BiometricPromptCompat$Companion;", "", "Lja/u;", "startBiometricInit", "", "enabled", "apiEnabled", "", "Ldev/skomlach/biometric/compat/BiometricAuthRequest;", "getAvailableAuthRequests", "Ldev/skomlach/biometric/compat/utils/logging/BiometricLoggerImpl$ExternalLogger;", "externalLogger1", "Ld9/a$a;", "externalLogger2", "logging", "Ljava/lang/Runnable;", "execute", "init", "<set-?>", "API_ENABLED", "Z", "getAPI_ENABLED", "()Z", "isInit", "Ldev/skomlach/biometric/compat/utils/device/DeviceInfo;", "deviceInfo", "Ldev/skomlach/biometric/compat/utils/device/DeviceInfo;", "getDeviceInfo", "()Ldev/skomlach/biometric/compat/utils/device/DeviceInfo;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "authFlowInProgress", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/ArrayList;", "availableAuthRequests", "Ljava/util/ArrayList;", "initInProgress", "isBiometricInit", "isDeviceInfoCheckInProgress", "", "pendingTasks", "Ljava/util/List;", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: BiometricPromptCompat.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: _get_deviceInfo_$lambda-0  reason: not valid java name */
        public static final void m101297_get_deviceInfo_$lambda0() {
            BiometricPromptCompat.isDeviceInfoCheckInProgress.set(true);
            DeviceInfoManager.INSTANCE.getDeviceInfo(new BiometricPromptCompat$Companion$deviceInfo$1$1());
        }

        public static /* synthetic */ void init$default(Companion companion, Runnable runnable, int i, Object obj) {
            if ((i & 1) != 0) {
                runnable = null;
            }
            companion.init(runnable);
        }

        /* access modifiers changed from: private */
        /* renamed from: init$lambda-2  reason: not valid java name */
        public static final void m101298init$lambda2() {
            BiometricPromptCompat.isDeviceInfoCheckInProgress.set(true);
            DeviceInfoManager.INSTANCE.getDeviceInfo(new BiometricPromptCompat$Companion$init$2$1());
        }

        public static /* synthetic */ void logging$default(Companion companion, boolean z, BiometricLoggerImpl.ExternalLogger externalLogger, C11966a.C11967a aVar, int i, Object obj) {
            if ((i & 2) != 0) {
                externalLogger = null;
            }
            if ((i & 4) != 0) {
                aVar = null;
            }
            companion.logging(z, externalLogger, aVar);
        }

        /* access modifiers changed from: private */
        @MainThread
        public final void startBiometricInit() {
            BiometricAuthentication.init$default(BiometricAuthentication.INSTANCE, new BiometricPromptCompat$Companion$startBiometricInit$1(), (Collection) null, 2, (Object) null);
        }

        public final void apiEnabled(boolean z) {
            BiometricPromptCompat.API_ENABLED = z;
        }

        public final boolean getAPI_ENABLED() {
            return BiometricPromptCompat.API_ENABLED;
        }

        public final List<BiometricAuthRequest> getAvailableAuthRequests() {
            return BiometricPromptCompat.availableAuthRequests;
        }

        public final DeviceInfo getDeviceInfo() {
            if (BiometricPromptCompat.deviceInfo == null && !BiometricPromptCompat.isDeviceInfoCheckInProgress.get()) {
                C12114c.f58379a.mo68308k(C12040g.f58253a);
            }
            return BiometricPromptCompat.deviceInfo;
        }

        @MainThread
        public final void init(Runnable runnable) {
            if (getAPI_ENABLED()) {
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    throw new IllegalThreadStateException("Main Thread required");
                } else if (BiometricPromptCompat.isBiometricInit.get()) {
                    BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptCompat.init() - ready");
                    if (runnable != null) {
                        C12114c.f58379a.mo68305g(runnable);
                    }
                } else if (BiometricPromptCompat.initInProgress.get()) {
                    BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptCompat.init() - pending");
                    BiometricPromptCompat.pendingTasks.add(runnable);
                } else {
                    BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptCompat.init()");
                    BiometricPromptCompat.isBiometricInit.set(false);
                    BiometricPromptCompat.initInProgress.set(true);
                    BiometricPromptCompat.pendingTasks.add(runnable);
                    C12104a.f58372a.mo68283g();
                    startBiometricInit();
                    C12114c.f58379a.mo68308k(C12039f.f58252a);
                    DeviceUnlockedReceiver.Companion.registerDeviceUnlockListener();
                }
            }
        }

        public final boolean isInit() {
            return BiometricPromptCompat.isBiometricInit.get();
        }

        public final void logging(boolean z, BiometricLoggerImpl.ExternalLogger externalLogger, C11966a.C11967a aVar) {
            if (getAPI_ENABLED()) {
                C11966a aVar2 = C11966a.f58161a;
                aVar2.mo67383f(z);
                BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
                biometricLoggerImpl.setDEBUG(z);
                aVar2.mo67384g(aVar);
                biometricLoggerImpl.setExternalLogger(externalLogger);
            }
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: BiometricPromptCompat.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BiometricMethod.values().length];
            iArr[BiometricMethod.DUMMY_BIOMETRIC.ordinal()] = 1;
            iArr[BiometricMethod.IRIS_ANDROIDAPI.ordinal()] = 2;
            iArr[BiometricMethod.IRIS_SAMSUNG.ordinal()] = 3;
            iArr[BiometricMethod.FACELOCK.ordinal()] = 4;
            iArr[BiometricMethod.FACE_HUAWEI.ordinal()] = 5;
            iArr[BiometricMethod.FACE_SOTERAPI.ordinal()] = 6;
            iArr[BiometricMethod.FACE_ANDROIDAPI.ordinal()] = 7;
            iArr[BiometricMethod.FACE_SAMSUNG.ordinal()] = 8;
            iArr[BiometricMethod.FACE_OPPO.ordinal()] = 9;
            iArr[BiometricMethod.FINGERPRINT_API23.ordinal()] = 10;
            iArr[BiometricMethod.FINGERPRINT_SUPPORT.ordinal()] = 11;
            iArr[BiometricMethod.FINGERPRINT_FLYME.ordinal()] = 12;
            iArr[BiometricMethod.FINGERPRINT_SAMSUNG.ordinal()] = 13;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                C16074i.m96678c("L");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        List<Runnable> synchronizedList = Collections.synchronizedList(new ArrayList());
        C13706o.m87928e(synchronizedList, "synchronizedList(ArrayList<Runnable?>())");
        pendingTasks = synchronizedList;
    }

    private BiometricPromptCompat(Builder builder2) {
        this.builder = builder2;
        this.appContext = C12104a.f58372a.mo68283g();
        this.impl$delegate = C13323i.m85669b(new BiometricPromptCompat$impl$2(this));
        this.homeWatcher = new HomeWatcher(new BiometricPromptCompat$homeWatcher$1(this));
        this.fragmentLifecycleCallbacks = new BiometricPromptCompat$fragmentLifecycleCallbacks$1(this);
    }

    public /* synthetic */ BiometricPromptCompat(Builder builder2, C13695i iVar) {
        this(builder2);
    }

    public static final void apiEnabled(boolean z) {
        Companion.apiEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: authenticate$lambda-1  reason: not valid java name */
    public static final void m101289authenticate$lambda1(BiometricPromptCompat biometricPromptCompat, C13678a0 a0Var, long j, AuthenticationCallback authenticationCallback) {
        C13706o.m87929f(biometricPromptCompat, "this$0");
        C13706o.m87929f(a0Var, "$timeout");
        C13706o.m87929f(authenticationCallback, "$callbackOuter");
        while (true) {
            if (biometricPromptCompat.builder.isTruncateChecked() && !isDeviceInfoCheckInProgress.get() && Companion.isInit()) {
                break;
            }
            boolean z = System.currentTimeMillis() - j >= TimeUnit.SECONDS.toMillis(5);
            a0Var.element = z;
            if (z) {
                break;
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException unused) {
            }
        }
        C12114c.f58379a.mo68305g(new C12031e(a0Var, authenticationCallback, biometricPromptCompat));
    }

    /* access modifiers changed from: private */
    /* renamed from: authenticate$lambda-1$lambda-0  reason: not valid java name */
    public static final void m101290authenticate$lambda1$lambda0(C13678a0 a0Var, AuthenticationCallback authenticationCallback, BiometricPromptCompat biometricPromptCompat) {
        C13706o.m87929f(a0Var, "$timeout");
        C13706o.m87929f(authenticationCallback, "$callbackOuter");
        C13706o.m87929f(biometricPromptCompat, "this$0");
        if (a0Var.element) {
            authenticationCallback.onFailed(AuthenticationFailureReason.NOT_INITIALIZED_ERROR, (CharSequence) null);
            authFlowInProgress.set(false);
            return;
        }
        biometricPromptCompat.startAuth(authenticationCallback);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:4|5|6|7|8|9|10|11|12|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x006e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0049 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void authenticateInternal(dev.skomlach.biometric.compat.BiometricPromptCompat.AuthenticationCallback r6) {
        /*
            r5 = this;
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r0 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "BiometricPromptCompat.authenticateInternal()"
            r4 = 0
            r2[r4] = r3
            r0.mo68217d(r2)
            dev.skomlach.biometric.compat.BiometricPromptCompat$Builder r2 = r5.builder
            androidx.fragment.app.FragmentActivity r2 = r2.getContext()
            boolean r2 = dev.skomlach.common.misc.C12112a.m82576a(r2)
            if (r2 == 0) goto L_0x002b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Unable to start BiometricPromptCompat.authenticate() cause of Activity destroyed"
            r1[r4] = r2
            r0.mo68220e((java.lang.Object[]) r1)
            r6.onCanceled()
            java.util.concurrent.atomic.AtomicBoolean r6 = authFlowInProgress
            r6.set(r4)
            return
        L_0x002b:
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IllegalStateException -> 0x006e }
            java.lang.String r2 = "BiometricPromptCompat.authenticateInternal() - impl.authenticate"
            r1[r4] = r2     // Catch:{ IllegalStateException -> 0x006e }
            r0.mo68217d(r1)     // Catch:{ IllegalStateException -> 0x006e }
            dev.skomlach.biometric.compat.impl.IBiometricPromptImpl r0 = r5.getImpl()     // Catch:{ all -> 0x0049 }
            dev.skomlach.biometric.compat.BiometricPromptCompat$Builder r0 = r0.getBuilder()     // Catch:{ all -> 0x0049 }
            androidx.fragment.app.FragmentActivity r0 = r0.getContext()     // Catch:{ all -> 0x0049 }
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()     // Catch:{ all -> 0x0049 }
            dev.skomlach.biometric.compat.BiometricPromptCompat$fragmentLifecycleCallbacks$1 r1 = r5.fragmentLifecycleCallbacks     // Catch:{ all -> 0x0049 }
            r0.unregisterFragmentLifecycleCallbacks(r1)     // Catch:{ all -> 0x0049 }
        L_0x0049:
            dev.skomlach.biometric.compat.impl.IBiometricPromptImpl r0 = r5.getImpl()     // Catch:{ IllegalStateException -> 0x006e }
            dev.skomlach.biometric.compat.BiometricPromptCompat$Builder r0 = r0.getBuilder()     // Catch:{ IllegalStateException -> 0x006e }
            androidx.fragment.app.FragmentActivity r0 = r0.getContext()     // Catch:{ IllegalStateException -> 0x006e }
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()     // Catch:{ IllegalStateException -> 0x006e }
            dev.skomlach.biometric.compat.BiometricPromptCompat$fragmentLifecycleCallbacks$1 r1 = r5.fragmentLifecycleCallbacks     // Catch:{ IllegalStateException -> 0x006e }
            r0.registerFragmentLifecycleCallbacks(r1, r4)     // Catch:{ IllegalStateException -> 0x006e }
            dev.skomlach.biometric.compat.impl.dialogs.HomeWatcher r0 = r5.homeWatcher     // Catch:{ IllegalStateException -> 0x006e }
            java.lang.Runnable r0 = r0.startWatch()     // Catch:{ IllegalStateException -> 0x006e }
            r5.stopWatcher = r0     // Catch:{ IllegalStateException -> 0x006e }
            dev.skomlach.biometric.compat.impl.IBiometricPromptImpl r0 = r5.getImpl()     // Catch:{ IllegalStateException -> 0x006e }
            r0.authenticate(r6)     // Catch:{ IllegalStateException -> 0x006e }
            goto L_0x008e
        L_0x006e:
            dev.skomlach.biometric.compat.impl.IBiometricPromptImpl r0 = r5.getImpl()     // Catch:{ all -> 0x0083 }
            dev.skomlach.biometric.compat.BiometricPromptCompat$Builder r0 = r0.getBuilder()     // Catch:{ all -> 0x0083 }
            androidx.fragment.app.FragmentActivity r0 = r0.getContext()     // Catch:{ all -> 0x0083 }
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()     // Catch:{ all -> 0x0083 }
            dev.skomlach.biometric.compat.BiometricPromptCompat$fragmentLifecycleCallbacks$1 r1 = r5.fragmentLifecycleCallbacks     // Catch:{ all -> 0x0083 }
            r0.unregisterFragmentLifecycleCallbacks(r1)     // Catch:{ all -> 0x0083 }
        L_0x0083:
            dev.skomlach.biometric.compat.AuthenticationFailureReason r0 = dev.skomlach.biometric.compat.AuthenticationFailureReason.INTERNAL_ERROR
            r1 = 0
            r6.onFailed(r0, r1)
            java.util.concurrent.atomic.AtomicBoolean r6 = authFlowInProgress
            r6.set(r4)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.BiometricPromptCompat.authenticateInternal(dev.skomlach.biometric.compat.BiometricPromptCompat$AuthenticationCallback):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: cancelAuthentication$lambda-4  reason: not valid java name */
    public static final void m101291cancelAuthentication$lambda4(BiometricPromptCompat biometricPromptCompat) {
        C13706o.m87929f(biometricPromptCompat, "this$0");
        while (true) {
            if (isDeviceInfoCheckInProgress.get() || !Companion.isInit()) {
                try {
                    Thread.sleep(250);
                } catch (InterruptedException unused) {
                }
            } else {
                C12114c.f58379a.mo68305g(new C12028b(biometricPromptCompat));
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: cancelAuthentication$lambda-4$lambda-3  reason: not valid java name */
    public static final void m101292cancelAuthentication$lambda4$lambda3(BiometricPromptCompat biometricPromptCompat) {
        C13706o.m87929f(biometricPromptCompat, "this$0");
        biometricPromptCompat.getImpl().cancelAuthentication();
    }

    public static final List<BiometricAuthRequest> getAvailableAuthRequests() {
        return Companion.getAvailableAuthRequests();
    }

    /* access modifiers changed from: private */
    public final IBiometricPromptImpl getImpl() {
        return (IBiometricPromptImpl) this.impl$delegate.getValue();
    }

    private final List<String> getUsedPermissions() {
        HashSet hashSet = new HashSet();
        if (C12120d.f58384a.mo68317d() && DeviceInfoManager.INSTANCE.hasUnderDisplayFingerprint(Companion.getDeviceInfo()) && this.builder.isNotificationEnabled()) {
            hashSet.add("android.permission.POST_NOTIFICATIONS");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            hashSet.add("android.permission.USE_BIOMETRIC");
        }
        ArrayList<BiometricMethod> arrayList = new ArrayList<>();
        for (BiometricMethod next : BiometricAuthentication.INSTANCE.getAvailableBiometricMethods()) {
            if (this.builder.getAllAvailableTypes().contains(next.getBiometricType())) {
                arrayList.add(next);
            }
        }
        for (BiometricMethod ordinal : arrayList) {
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal.ordinal()]) {
                case 1:
                    hashSet.add("android.permission.CAMERA");
                    break;
                case 2:
                    hashSet.add("android.permission.USE_IRIS");
                    break;
                case 3:
                    hashSet.add("com.samsung.android.camera.iris.permission.USE_IRIS");
                    break;
                case 4:
                    hashSet.add("android.permission.WAKE_LOCK");
                    break;
                case 5:
                case 6:
                    hashSet.add("android.permission.USE_FACERECOGNITION");
                    break;
                case 7:
                    hashSet.add("android.permission.USE_FACE_AUTHENTICATION");
                    break;
                case 8:
                    hashSet.add("com.samsung.android.bio.face.permission.USE_FACE");
                    break;
                case 9:
                    hashSet.add("oppo.permission.USE_FACE");
                    break;
                case 10:
                case 11:
                    hashSet.add("android.permission.USE_FINGERPRINT");
                    break;
                case 12:
                    hashSet.add("com.fingerprints.service.ACCESS_FINGERPRINT_MANAGER");
                    break;
                case 13:
                    hashSet.add("com.samsung.android.providers.context.permission.WRITE_USE_APP_FEATURE_SURVEY");
                    break;
            }
        }
        return new ArrayList(hashSet);
    }

    @MainThread
    public static final void init(Runnable runnable) {
        Companion.init(runnable);
    }

    public static final void logging(boolean z, BiometricLoggerImpl.ExternalLogger externalLogger, C11966a.C11967a aVar) {
        Companion.logging(z, externalLogger, aVar);
    }

    private final void startAuth(AuthenticationCallback authenticationCallback) {
        if (C12112a.m82576a(this.builder.getContext())) {
            BiometricLoggerImpl.INSTANCE.mo68220e("Unable to start BiometricPromptCompat.authenticate() cause of Activity destroyed");
            authenticationCallback.onCanceled();
            authFlowInProgress.set(false);
            return;
        }
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d("BiometricPromptCompat.startAuth");
        if (!BiometricManagerCompat.isHardwareDetected(getImpl().getBuilder().getBiometricAuthRequest())) {
            biometricLoggerImpl.mo68220e("BiometricPromptCompat.startAuth - isHardwareDetected");
            authenticationCallback.onFailed(AuthenticationFailureReason.NO_HARDWARE, this.appContext.getString(C0265R.string.fingerprint_error_hw_not_present));
            authFlowInProgress.set(false);
        } else if (!BiometricManagerCompat.hasEnrolled(getImpl().getBuilder().getBiometricAuthRequest())) {
            biometricLoggerImpl.mo68220e("BiometricPromptCompat.startAuth - hasEnrolled");
            authenticationCallback.onFailed(AuthenticationFailureReason.NO_BIOMETRICS_REGISTERED, this.appContext.getString(C0265R.string.fingerprint_error_no_fingerprints));
            authFlowInProgress.set(false);
        } else if (BiometricManagerCompat.isLockOut(getImpl().getBuilder().getBiometricAuthRequest())) {
            biometricLoggerImpl.mo68220e("BiometricPromptCompat.startAuth - isLockOut");
            authenticationCallback.onFailed(AuthenticationFailureReason.LOCKED_OUT, this.appContext.getString(C0265R.string.fingerprint_error_lockout));
            authFlowInProgress.set(false);
        } else if (BiometricManagerCompat.isBiometricSensorPermanentlyLocked(getImpl().getBuilder().getBiometricAuthRequest())) {
            biometricLoggerImpl.mo68220e("BiometricPromptCompat.startAuth - isBiometricSensorPermanentlyLocked");
            authenticationCallback.onFailed(AuthenticationFailureReason.HARDWARE_UNAVAILABLE, this.appContext.getString(C0265R.string.fingerprint_error_hw_not_available));
            authFlowInProgress.set(false);
        } else {
            biometricLoggerImpl.mo68217d("BiometricPromptCompat. start PermissionsFragment.askForPermissions");
            PermissionsFragment.Companion.askForPermissions(getImpl().getBuilder().getContext(), getUsedPermissions(), new C12029c(this, authenticationCallback));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: startAuth$lambda-2  reason: not valid java name */
    public static final void m101293startAuth$lambda2(BiometricPromptCompat biometricPromptCompat, AuthenticationCallback authenticationCallback) {
        C13706o.m87929f(biometricPromptCompat, "this$0");
        C13706o.m87929f(authenticationCallback, "$callbackOuter");
        ActivityViewWatcher activityViewWatcher = null;
        if (!(!biometricPromptCompat.getUsedPermissions().isEmpty()) || C12250b.f58845a.mo68574c(biometricPromptCompat.getUsedPermissions())) {
            try {
                activityViewWatcher = new ActivityViewWatcher(biometricPromptCompat.getImpl().getBuilder(), new BiometricPromptCompat$startAuth$1$activityViewWatcher$1(biometricPromptCompat));
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68218e(th);
            }
            biometricPromptCompat.authenticateInternal(new BiometricPromptCompat$startAuth$1$callback$1(biometricPromptCompat, authenticationCallback, activityViewWatcher));
            return;
        }
        authenticationCallback.onFailed(AuthenticationFailureReason.MISSING_PERMISSIONS_ERROR, (CharSequence) null);
        authFlowInProgress.set(false);
    }

    @MainThread
    private static final void startBiometricInit() {
        Companion.startBiometricInit();
    }

    public final void authenticate(AuthenticationCallback authenticationCallback) {
        C13706o.m87929f(authenticationCallback, "callbackOuter");
        if (authFlowInProgress.get()) {
            authenticationCallback.onCanceled();
            return;
        }
        authFlowInProgress.set(true);
        if (C12112a.m82576a(this.builder.getContext())) {
            BiometricLoggerImpl.INSTANCE.mo68220e("Unable to start BiometricPromptCompat.authenticate() cause of Activity destroyed");
            authenticationCallback.onCanceled();
            authFlowInProgress.set(false);
        } else if (!API_ENABLED) {
            authenticationCallback.onFailed(AuthenticationFailureReason.NO_HARDWARE, this.appContext.getString(C0265R.string.fingerprint_error_hw_not_present));
            authFlowInProgress.set(false);
        } else {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            biometricLoggerImpl.mo68217d("BiometricPromptCompat.authenticate()");
            if (WideGamutBug.INSTANCE.unsupportedColorMode(this.builder.getContext())) {
                biometricLoggerImpl.mo68220e("BiometricPromptCompat.startAuth - WideGamutBug");
                authenticationCallback.onFailed(AuthenticationFailureReason.HARDWARE_UNAVAILABLE, this.appContext.getString(C0265R.string.fingerprint_error_hw_not_available));
                authFlowInProgress.set(false);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            C12114c.f58379a.mo68308k(new C12030d(this, new C13678a0(), currentTimeMillis, authenticationCallback));
        }
    }

    public final void cancelAuthentication() {
        if (API_ENABLED) {
            C12114c.f58379a.mo68308k(new C12027a(this));
        }
    }

    @ColorInt
    public final int getDialogMainColor() {
        if (!API_ENABLED) {
            return ContextCompat.getColor(this.builder.getContext(), C12021R.C12022color.material_grey_50);
        }
        return DialogMainColor.INSTANCE.getColor(this.builder.getContext(), DarkLightThemes.INSTANCE.isNightModeCompatWithInscreen(this.builder.getContext()));
    }
}
