package dev.skomlach.biometric.compat.impl.dialogs;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.TextView;
import androidx.biometric.C0265R;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import dev.skomlach.biometric.compat.BiometricAuthRequest;
import dev.skomlach.biometric.compat.BiometricManagerCompat;
import dev.skomlach.biometric.compat.BiometricPromptCompat;
import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.biometric.compat.C12021R;
import dev.skomlach.biometric.compat.impl.AuthCallback;
import dev.skomlach.biometric.compat.impl.AuthResult;
import dev.skomlach.biometric.compat.impl.dialogs.FingerprintIconView;
import dev.skomlach.biometric.compat.utils.BiometricTitle;
import dev.skomlach.biometric.compat.utils.WindowFocusChangedListener;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.misc.C12114c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13698j0;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001JB#\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r¢\u0006\u0004\bH\u0010IJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0010\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0006XD¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R0\u0010-\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020,0*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00104\u001a\u00020+2\u0006\u00103\u001a\u00020+8B@BX\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\bC\u0010BR\u0013\u0010G\u001a\u0004\u0018\u00010D8F¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006K"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialogImpl;", "", "Lja/u;", "attachWindowListeners", "detachWindowListeners", "checkInScreenVisibility", "startAuth", "cancelAuth", "showDialog", "dismissDialog", "", "msg", "onHelp", "", "isLockout", "onFailure", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "compatBuilder", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "Ldev/skomlach/biometric/compat/impl/AuthCallback;", "authCallback", "Ldev/skomlach/biometric/compat/impl/AuthCallback;", "isInScreen", "Z", "Landroid/os/Handler;", "animateHandler", "Landroid/os/Handler;", "Ldev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialog;", "dialog", "Ldev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialog;", "promptText", "Ljava/lang/CharSequence;", "too_many_attempts", "not_recognized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "inProgress", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "WHAT_RESTORE_NORMAL_STATE", "I", "getWHAT_RESTORE_NORMAL_STATE", "()I", "", "Ldev/skomlach/biometric/compat/BiometricType;", "Ldev/skomlach/biometric/compat/impl/AuthResult;", "authFinishedCopy", "Ljava/util/Map;", "getAuthFinishedCopy", "()Ljava/util/Map;", "setAuthFinishedCopy", "(Ljava/util/Map;)V", "<set-?>", "primaryBiometricType", "Ldev/skomlach/biometric/compat/BiometricType;", "getPrimaryBiometricType", "()Ldev/skomlach/biometric/compat/BiometricType;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Ldev/skomlach/biometric/compat/utils/WindowFocusChangedListener;", "onWindowFocusChangeListener", "Ldev/skomlach/biometric/compat/utils/WindowFocusChangedListener;", "Landroid/content/res/ColorStateList;", "originalColor", "Landroid/content/res/ColorStateList;", "isInScreenUIHackNeeded", "()Z", "isMultiWindowHack", "Landroid/view/View;", "getAuthPreview", "()Landroid/view/View;", "authPreview", "<init>", "(Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;Ldev/skomlach/biometric/compat/impl/AuthCallback;Z)V", "AnimateHandler", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptCompatDialogImpl.kt */
public final class BiometricPromptCompatDialogImpl {
    private final int WHAT_RESTORE_NORMAL_STATE;
    private final Handler animateHandler;
    private final AuthCallback authCallback;
    private Map<BiometricType, AuthResult> authFinishedCopy;
    private final BiometricPromptCompat.Builder compatBuilder;
    /* access modifiers changed from: private */
    public final BiometricPromptCompatDialog dialog;
    private final AtomicBoolean inProgress;
    /* access modifiers changed from: private */
    public final boolean isInScreen;
    private final CharSequence not_recognized;
    private final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final WindowFocusChangedListener onWindowFocusChangeListener;
    /* access modifiers changed from: private */
    public ColorStateList originalColor;
    private BiometricType primaryBiometricType;
    /* access modifiers changed from: private */
    public final CharSequence promptText;
    private final CharSequence too_many_attempts;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialogImpl$AnimateHandler;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "Lja/u;", "handleMessage", "Landroid/os/Looper;", "looper", "<init>", "(Ldev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialogImpl;Landroid/os/Looper;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: BiometricPromptCompatDialogImpl.kt */
    private final class AnimateHandler extends Handler {
        final /* synthetic */ BiometricPromptCompatDialogImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AnimateHandler(BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl, Looper looper) {
            super(looper);
            C13706o.m87929f(looper, "looper");
            this.this$0 = biometricPromptCompatDialogImpl;
        }

        public void handleMessage(Message message) {
            C13706o.m87929f(message, NotificationCompat.CATEGORY_MESSAGE);
            if (message.what == this.this$0.getWHAT_RESTORE_NORMAL_STATE()) {
                FingerprintIconView fingerprintIcon = this.this$0.dialog.getFingerprintIcon();
                if (fingerprintIcon != null) {
                    fingerprintIcon.setState(FingerprintIconView.State.ON, this.this$0.getPrimaryBiometricType());
                }
                TextView status = this.this$0.dialog.getStatus();
                if (status != null) {
                    status.setText(this.this$0.promptText);
                }
                TextView status2 = this.this$0.dialog.getStatus();
                if (status2 != null) {
                    status2.setTextColor(this.this$0.originalColor);
                }
            }
        }
    }

    public BiometricPromptCompatDialogImpl(BiometricPromptCompat.Builder builder, AuthCallback authCallback2, boolean z) {
        C13706o.m87929f(builder, "compatBuilder");
        this.compatBuilder = builder;
        this.authCallback = authCallback2;
        this.isInScreen = z;
        this.inProgress = new AtomicBoolean(false);
        this.authFinishedCopy = new LinkedHashMap();
        this.promptText = BiometricTitle.INSTANCE.getRelevantTitle(builder.getContext(), builder.getAllAvailableTypes());
        String string = builder.getContext().getString(C0265R.string.fingerprint_error_lockout);
        C13706o.m87928e(string, "compatBuilder.getContext…ingerprint_error_lockout)");
        this.too_many_attempts = string;
        String string2 = builder.getContext().getString(C0265R.string.fingerprint_not_recognized);
        C13706o.m87928e(string2, "compatBuilder.getContext…ngerprint_not_recognized)");
        this.not_recognized = string2;
        Looper mainLooper = Looper.getMainLooper();
        C13706o.m87928e(mainLooper, "getMainLooper()");
        this.animateHandler = new AnimateHandler(this, mainLooper);
        BiometricPromptCompatDialog fragment = BiometricPromptCompatDialog.Companion.getFragment(z);
        this.dialog = fragment;
        fragment.setOnDismissListener(new C12052c(this));
        fragment.setOnCancelListener(new C12051b(this));
        fragment.setOnShowListener(new C12053d(this));
        this.primaryBiometricType = BiometricType.BIOMETRIC_ANY;
        this.onGlobalLayoutListener = new C12055f(this);
        this.onWindowFocusChangeListener = new BiometricPromptCompatDialogImpl$onWindowFocusChangeListener$1(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: _get_primaryBiometricType_$lambda-4  reason: not valid java name */
    public static final int m101336_get_primaryBiometricType_$lambda4(BiometricType biometricType, BiometricType biometricType2) {
        return C13706o.m87931h(biometricType.ordinal(), biometricType2.ordinal());
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m101337_init_$lambda0(BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl, DialogInterface dialogInterface) {
        C13706o.m87929f(biometricPromptCompatDialogImpl, "this$0");
        BiometricLoggerImpl.INSTANCE.mo68220e("BiometricPromptGenericImpl.AbstractBiometricPromptCompat. dismissed.");
        biometricPromptCompatDialogImpl.detachWindowListeners();
        if (biometricPromptCompatDialogImpl.inProgress.get()) {
            biometricPromptCompatDialogImpl.inProgress.set(false);
            AuthCallback authCallback2 = biometricPromptCompatDialogImpl.authCallback;
            if (authCallback2 != null) {
                authCallback2.stopAuth();
            }
        }
        AuthCallback authCallback3 = biometricPromptCompatDialogImpl.authCallback;
        if (authCallback3 != null) {
            authCallback3.onUiClosed();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-1  reason: not valid java name */
    public static final void m101338_init_$lambda1(BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl, DialogInterface dialogInterface) {
        C13706o.m87929f(biometricPromptCompatDialogImpl, "this$0");
        BiometricLoggerImpl.INSTANCE.mo68220e("BiometricPromptGenericImpl.AbstractBiometricPromptCompat. canceled.");
        AuthCallback authCallback2 = biometricPromptCompatDialogImpl.authCallback;
        if (authCallback2 != null) {
            authCallback2.cancelAuth();
        }
        biometricPromptCompatDialogImpl.detachWindowListeners();
        if (biometricPromptCompatDialogImpl.inProgress.get()) {
            biometricPromptCompatDialogImpl.inProgress.set(false);
            AuthCallback authCallback3 = biometricPromptCompatDialogImpl.authCallback;
            if (authCallback3 != null) {
                authCallback3.stopAuth();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-3  reason: not valid java name */
    public static final void m101339_init_$lambda3(BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl, DialogInterface dialogInterface) {
        C13706o.m87929f(biometricPromptCompatDialogImpl, "this$0");
        BiometricLoggerImpl.INSTANCE.mo68220e("BiometricPromptGenericImpl.AbstractBiometricPromptCompat. started.");
        if (biometricPromptCompatDialogImpl.compatBuilder.getTitle() == null) {
            TextView title = biometricPromptCompatDialogImpl.dialog.getTitle();
            if (title != null) {
                title.setVisibility(8);
            }
        } else {
            TextView title2 = biometricPromptCompatDialogImpl.dialog.getTitle();
            if (title2 != null) {
                title2.setText(biometricPromptCompatDialogImpl.compatBuilder.getTitle());
            }
        }
        if (biometricPromptCompatDialogImpl.compatBuilder.getSubtitle() == null) {
            TextView subtitle = biometricPromptCompatDialogImpl.dialog.getSubtitle();
            if (subtitle != null) {
                subtitle.setVisibility(8);
            }
        } else {
            TextView subtitle2 = biometricPromptCompatDialogImpl.dialog.getSubtitle();
            if (subtitle2 != null) {
                subtitle2.setText(biometricPromptCompatDialogImpl.compatBuilder.getSubtitle());
            }
        }
        if (biometricPromptCompatDialogImpl.compatBuilder.getDescription() == null) {
            TextView description = biometricPromptCompatDialogImpl.dialog.getDescription();
            if (description != null) {
                description.setVisibility(8);
            }
        } else {
            TextView description2 = biometricPromptCompatDialogImpl.dialog.getDescription();
            if (description2 != null) {
                description2.setText(biometricPromptCompatDialogImpl.compatBuilder.getDescription());
            }
        }
        Button negativeButton = biometricPromptCompatDialogImpl.dialog.getNegativeButton();
        if (negativeButton != null) {
            negativeButton.setText(biometricPromptCompatDialogImpl.compatBuilder.getContext().getString(17039360));
        }
        Button negativeButton2 = biometricPromptCompatDialogImpl.dialog.getNegativeButton();
        if (negativeButton2 != null) {
            negativeButton2.setOnClickListener(new C12054e(biometricPromptCompatDialogImpl));
        }
        TextView status = biometricPromptCompatDialogImpl.dialog.getStatus();
        if (status != null) {
            status.setText(biometricPromptCompatDialogImpl.promptText);
        }
        TextView status2 = biometricPromptCompatDialogImpl.dialog.getStatus();
        biometricPromptCompatDialogImpl.originalColor = status2 != null ? status2.getTextColors() : null;
        FingerprintIconView fingerprintIcon = biometricPromptCompatDialogImpl.dialog.getFingerprintIcon();
        if (fingerprintIcon != null) {
            fingerprintIcon.setState(FingerprintIconView.State.ON, false, biometricPromptCompatDialogImpl.getPrimaryBiometricType());
        }
        biometricPromptCompatDialogImpl.checkInScreenVisibility();
        biometricPromptCompatDialogImpl.attachWindowListeners();
        biometricPromptCompatDialogImpl.startAuth();
    }

    private final void attachWindowListeners() {
        ViewTreeObserver viewTreeObserver;
        try {
            View findViewById = this.dialog.findViewById(16908290);
            if (!this.isInScreen) {
                this.dialog.setWindowFocusChangedListener(this.onWindowFocusChangeListener);
            }
            if (findViewById != null && (viewTreeObserver = findViewById.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.onGlobalLayoutListener);
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    /* access modifiers changed from: private */
    public final void cancelAuth() {
        if (this.inProgress.get() && this.dialog.isShowing()) {
            this.inProgress.set(false);
            AuthCallback authCallback2 = this.authCallback;
            if (authCallback2 != null) {
                authCallback2.stopAuth();
            }
        }
    }

    private final void checkInScreenVisibility() {
        if (!this.isInScreen) {
            return;
        }
        if (isInScreenUIHackNeeded() || this.compatBuilder.getMultiWindowSupport().mo68456g() == 2) {
            this.dialog.makeInvisible();
        } else {
            this.dialog.makeVisible();
        }
    }

    private final void detachWindowListeners() {
        ViewTreeObserver viewTreeObserver;
        try {
            View findViewById = this.dialog.findViewById(16908290);
            if (!this.isInScreen) {
                this.dialog.setWindowFocusChangedListener((WindowFocusChangedListener) null);
            }
            if (findViewById != null && (viewTreeObserver = findViewById.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    /* access modifiers changed from: private */
    public final BiometricType getPrimaryBiometricType() {
        ArrayList arrayList = new ArrayList();
        if (this.compatBuilder.getSecondaryAvailableTypes().isEmpty()) {
            for (BiometricType next : this.compatBuilder.getPrimaryAvailableTypes()) {
                if (BiometricManagerCompat.isBiometricReady(new BiometricAuthRequest(this.compatBuilder.getBiometricAuthRequest().getApi(), next, this.compatBuilder.getBiometricAuthRequest().getConfirmation()))) {
                    arrayList.add(next);
                }
            }
        } else {
            for (BiometricType next2 : this.compatBuilder.getSecondaryAvailableTypes()) {
                if (BiometricManagerCompat.isBiometricReady(new BiometricAuthRequest(this.compatBuilder.getBiometricAuthRequest().getApi(), next2, this.compatBuilder.getBiometricAuthRequest().getConfirmation()))) {
                    arrayList.add(next2);
                }
            }
        }
        C13698j0.m87901a(arrayList).removeAll(this.authFinishedCopy.keySet());
        C13622x.m87781y(arrayList, C12058i.f58281a);
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68220e("BiometricPromptGenericImpl.primaryBiometricType - " + arrayList);
        return arrayList.isEmpty() ? BiometricType.BIOMETRIC_ANY : (BiometricType) arrayList.get(0);
    }

    /* access modifiers changed from: private */
    public final boolean isInScreenUIHackNeeded() {
        return this.compatBuilder.getMultiWindowSupport().mo68457j() && !this.compatBuilder.getMultiWindowSupport().mo68458k();
    }

    /* access modifiers changed from: private */
    public final boolean isMultiWindowHack() {
        if (!this.compatBuilder.getMultiWindowSupport().mo68457j() || !this.inProgress.get() || !this.dialog.isShowing()) {
            BiometricLoggerImpl.INSTANCE.mo68220e("BiometricPromptGenericImpl.isMultiWindowHack - do not perform hack");
            return false;
        }
        BiometricLoggerImpl.INSTANCE.mo68220e("BiometricPromptGenericImpl.isMultiWindowHack - perform hack");
        AuthCallback authCallback2 = this.authCallback;
        if (authCallback2 != null) {
            authCallback2.stopAuth();
        }
        AuthCallback authCallback3 = this.authCallback;
        if (authCallback3 != null) {
            authCallback3.startAuth();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda-3$lambda-2  reason: not valid java name */
    public static final void m101340lambda3$lambda2(BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl, View view) {
        C13706o.m87929f(biometricPromptCompatDialogImpl, "this$0");
        biometricPromptCompatDialogImpl.dismissDialog();
        AuthCallback authCallback2 = biometricPromptCompatDialogImpl.authCallback;
        if (authCallback2 != null) {
            authCallback2.cancelAuth();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onFailure$lambda-8  reason: not valid java name */
    public static final void m101341onFailure$lambda8(BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl, boolean z) {
        C13706o.m87929f(biometricPromptCompatDialogImpl, "this$0");
        biometricPromptCompatDialogImpl.animateHandler.removeMessages(biometricPromptCompatDialogImpl.WHAT_RESTORE_NORMAL_STATE);
        FingerprintIconView fingerprintIcon = biometricPromptCompatDialogImpl.dialog.getFingerprintIcon();
        if (fingerprintIcon != null) {
            fingerprintIcon.setState(FingerprintIconView.State.ERROR, biometricPromptCompatDialogImpl.getPrimaryBiometricType());
        }
        TextView status = biometricPromptCompatDialogImpl.dialog.getStatus();
        if (status != null) {
            status.setText(z ? biometricPromptCompatDialogImpl.too_many_attempts : biometricPromptCompatDialogImpl.not_recognized);
        }
        TextView status2 = biometricPromptCompatDialogImpl.dialog.getStatus();
        if (status2 != null) {
            status2.setTextColor(ContextCompat.getColor(biometricPromptCompatDialogImpl.compatBuilder.getContext(), C12021R.C12022color.material_red_500));
        }
        biometricPromptCompatDialogImpl.animateHandler.sendEmptyMessageDelayed(biometricPromptCompatDialogImpl.WHAT_RESTORE_NORMAL_STATE, 2000);
    }

    /* access modifiers changed from: private */
    /* renamed from: onGlobalLayoutListener$lambda-5  reason: not valid java name */
    public static final void m101342onGlobalLayoutListener$lambda5(BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl) {
        C13706o.m87929f(biometricPromptCompatDialogImpl, "this$0");
        BiometricLoggerImpl.INSTANCE.mo68220e("BiometricPromptGenericImpl.onGlobalLayout - fallback dialog");
        biometricPromptCompatDialogImpl.checkInScreenVisibility();
    }

    /* access modifiers changed from: private */
    /* renamed from: onHelp$lambda-7  reason: not valid java name */
    public static final void m101343onHelp$lambda7(BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl, CharSequence charSequence) {
        C13706o.m87929f(biometricPromptCompatDialogImpl, "this$0");
        biometricPromptCompatDialogImpl.animateHandler.removeMessages(biometricPromptCompatDialogImpl.WHAT_RESTORE_NORMAL_STATE);
        FingerprintIconView fingerprintIcon = biometricPromptCompatDialogImpl.dialog.getFingerprintIcon();
        if (fingerprintIcon != null) {
            fingerprintIcon.setState(FingerprintIconView.State.ERROR, biometricPromptCompatDialogImpl.getPrimaryBiometricType());
        }
        TextView status = biometricPromptCompatDialogImpl.dialog.getStatus();
        if (status != null) {
            status.setText(charSequence);
        }
        TextView status2 = biometricPromptCompatDialogImpl.dialog.getStatus();
        if (status2 != null) {
            status2.setTextColor(ContextCompat.getColor(biometricPromptCompatDialogImpl.compatBuilder.getContext(), C12021R.C12022color.material_red_500));
        }
        biometricPromptCompatDialogImpl.animateHandler.sendEmptyMessageDelayed(biometricPromptCompatDialogImpl.WHAT_RESTORE_NORMAL_STATE, 2000);
    }

    /* access modifiers changed from: private */
    public final void startAuth() {
        if (!this.inProgress.get() && this.dialog.isShowing()) {
            this.inProgress.set(true);
            AuthCallback authCallback2 = this.authCallback;
            if (authCallback2 != null) {
                authCallback2.startAuth();
            }
        }
    }

    public final void dismissDialog() {
        if (this.dialog.isShowing()) {
            detachWindowListeners();
            cancelAuth();
            this.dialog.dismiss();
        }
    }

    public final Map<BiometricType, AuthResult> getAuthFinishedCopy() {
        return this.authFinishedCopy;
    }

    public final View getAuthPreview() {
        return this.dialog.getAuthPreview();
    }

    public final int getWHAT_RESTORE_NORMAL_STATE() {
        return this.WHAT_RESTORE_NORMAL_STATE;
    }

    public final void onFailure(boolean z) {
        C12114c.f58379a.mo68305g(new C12057h(this, z));
    }

    public final void onHelp(CharSequence charSequence) {
        C12114c.f58379a.mo68305g(new C12056g(this, charSequence));
    }

    public final void setAuthFinishedCopy(Map<BiometricType, AuthResult> map) {
        C13706o.m87929f(map, "<set-?>");
        this.authFinishedCopy = map;
    }

    public final void showDialog() {
        if (!this.dialog.isShowing()) {
            this.dialog.show(this.compatBuilder.getContext().getSupportFragmentManager(), BiometricPromptCompatDialog.TAG);
            return;
        }
        throw new IllegalArgumentException("BiometricPromptGenericImpl. has been started.".toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BiometricPromptCompatDialogImpl(BiometricPromptCompat.Builder builder, AuthCallback authCallback2, boolean z, int i, C13695i iVar) {
        this(builder, authCallback2, (i & 4) != 0 ? false : z);
    }
}
