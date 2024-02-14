package androidx.biometric;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0146R;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Observer;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class FingerprintDialogFragment extends DialogFragment {
    private static final int MESSAGE_DISPLAY_TIME_MS = 2000;
    static final int STATE_FINGERPRINT = 1;
    static final int STATE_FINGERPRINT_AUTHENTICATED = 3;
    static final int STATE_FINGERPRINT_ERROR = 2;
    static final int STATE_NONE = 0;
    private static final String TAG = "FingerprintFragment";
    private int mErrorTextColor;
    @Nullable
    private ImageView mFingerprintIcon;
    final Handler mHandler = new Handler(Looper.getMainLooper());
    @Nullable
    TextView mHelpMessageView;
    private int mNormalTextColor;
    final Runnable mResetDialogRunnable = new Runnable() {
        public void run() {
            FingerprintDialogFragment.this.resetDialog();
        }
    };
    BiometricViewModel mViewModel;

    @RequiresApi(21)
    private static class Api21Impl {
        private Api21Impl() {
        }

        static void startAnimation(@NonNull Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    @RequiresApi(26)
    private static class Api26Impl {
        private Api26Impl() {
        }

        static int getColorErrorAttr() {
            return C0146R.attr.colorError;
        }
    }

    private FingerprintDialogFragment() {
    }

    private void connectViewModel() {
        Context hostActivityOrContext = BiometricPrompt.getHostActivityOrContext(this);
        if (hostActivityOrContext != null) {
            BiometricViewModel viewModel = BiometricPrompt.getViewModel(hostActivityOrContext);
            this.mViewModel = viewModel;
            viewModel.getFingerprintDialogState().observe(this, new Observer<Integer>() {
                public void onChanged(Integer num) {
                    FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
                    fingerprintDialogFragment.mHandler.removeCallbacks(fingerprintDialogFragment.mResetDialogRunnable);
                    FingerprintDialogFragment.this.updateFingerprintIcon(num.intValue());
                    FingerprintDialogFragment.this.updateHelpMessageColor(num.intValue());
                    FingerprintDialogFragment fingerprintDialogFragment2 = FingerprintDialogFragment.this;
                    fingerprintDialogFragment2.mHandler.postDelayed(fingerprintDialogFragment2.mResetDialogRunnable, 2000);
                }
            });
            this.mViewModel.getFingerprintDialogHelpMessage().observe(this, new Observer<CharSequence>() {
                public void onChanged(CharSequence charSequence) {
                    FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
                    fingerprintDialogFragment.mHandler.removeCallbacks(fingerprintDialogFragment.mResetDialogRunnable);
                    FingerprintDialogFragment.this.updateHelpMessageText(charSequence);
                    FingerprintDialogFragment fingerprintDialogFragment2 = FingerprintDialogFragment.this;
                    fingerprintDialogFragment2.mHandler.postDelayed(fingerprintDialogFragment2.mResetDialogRunnable, 2000);
                }
            });
        }
    }

    private Drawable getAssetForTransition(int i, int i2) {
        int i3;
        Context context = getContext();
        if (context == null) {
            Log.w(TAG, "Unable to get asset. Context is null.");
            return null;
        }
        if (i == 0 && i2 == 1) {
            i3 = C0265R.C0267drawable.fingerprint_dialog_fp_icon;
        } else if (i == 1 && i2 == 2) {
            i3 = C0265R.C0267drawable.fingerprint_dialog_error;
        } else if (i == 2 && i2 == 1) {
            i3 = C0265R.C0267drawable.fingerprint_dialog_fp_icon;
        } else if (i != 1 || i2 != 3) {
            return null;
        } else {
            i3 = C0265R.C0267drawable.fingerprint_dialog_fp_icon;
        }
        return ContextCompat.getDrawable(context, i3);
    }

    private int getThemedColorFor(int i) {
        Context context = getContext();
        Context hostActivityOrContext = BiometricPrompt.getHostActivityOrContext(this);
        if (context == null || hostActivityOrContext == null) {
            Log.w(TAG, "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = hostActivityOrContext.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    @RequiresApi(19)
    @NonNull
    static FingerprintDialogFragment newInstance() {
        return new FingerprintDialogFragment();
    }

    private boolean shouldAnimateForTransition(int i, int i2) {
        if (i == 0 && i2 == 1) {
            return false;
        }
        if (i == 1 && i2 == 2) {
            return true;
        }
        return i == 2 && i2 == 1;
    }

    public void onCancel(@NonNull DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.mViewModel.setFingerprintDialogCancelPending(true);
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        connectViewModel();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mErrorTextColor = getThemedColorFor(Api26Impl.getColorErrorAttr());
        } else {
            Context context = getContext();
            this.mErrorTextColor = context != null ? ContextCompat.getColor(context, C0265R.C0266color.biometric_error_color) : 0;
        }
        this.mNormalTextColor = getThemedColorFor(16842808);
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        CharSequence charSequence;
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        builder.setTitle(this.mViewModel.getTitle());
        View inflate = LayoutInflater.from(builder.getContext()).inflate(C0265R.C0269layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0265R.C0268id.fingerprint_subtitle);
        if (textView != null) {
            CharSequence subtitle = this.mViewModel.getSubtitle();
            if (TextUtils.isEmpty(subtitle)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(subtitle);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(C0265R.C0268id.fingerprint_description);
        if (textView2 != null) {
            CharSequence description = this.mViewModel.getDescription();
            if (TextUtils.isEmpty(description)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(description);
            }
        }
        this.mFingerprintIcon = (ImageView) inflate.findViewById(C0265R.C0268id.fingerprint_icon);
        this.mHelpMessageView = (TextView) inflate.findViewById(C0265R.C0268id.fingerprint_error);
        if (AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators())) {
            charSequence = getString(C0265R.string.confirm_device_credential_password);
        } else {
            charSequence = this.mViewModel.getNegativeButtonText();
        }
        builder.setNegativeButton(charSequence, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                FingerprintDialogFragment.this.mViewModel.setNegativeButtonPressPending(true);
            }
        });
        builder.setView(inflate);
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    public void onPause() {
        super.onPause();
        this.mHandler.removeCallbacksAndMessages((Object) null);
    }

    public void onResume() {
        super.onResume();
        this.mViewModel.setFingerprintDialogPreviousState(0);
        this.mViewModel.setFingerprintDialogState(1);
        this.mViewModel.setFingerprintDialogHelpMessage(getString(C0265R.string.fingerprint_dialog_touch_sensor));
    }

    /* access modifiers changed from: package-private */
    public void resetDialog() {
        Context context = getContext();
        if (context == null) {
            Log.w(TAG, "Not resetting the dialog. Context is null.");
            return;
        }
        this.mViewModel.setFingerprintDialogState(1);
        this.mViewModel.setFingerprintDialogHelpMessage(context.getString(C0265R.string.fingerprint_dialog_touch_sensor));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r0 = r3.mViewModel.getFingerprintDialogPreviousState();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateFingerprintIcon(int r4) {
        /*
            r3 = this;
            android.widget.ImageView r0 = r3.mFingerprintIcon
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x002b
            androidx.biometric.BiometricViewModel r0 = r3.mViewModel
            int r0 = r0.getFingerprintDialogPreviousState()
            android.graphics.drawable.Drawable r1 = r3.getAssetForTransition(r0, r4)
            if (r1 != 0) goto L_0x0018
            return
        L_0x0018:
            android.widget.ImageView r2 = r3.mFingerprintIcon
            r2.setImageDrawable(r1)
            boolean r0 = r3.shouldAnimateForTransition(r0, r4)
            if (r0 == 0) goto L_0x0026
            androidx.biometric.FingerprintDialogFragment.Api21Impl.startAnimation(r1)
        L_0x0026:
            androidx.biometric.BiometricViewModel r0 = r3.mViewModel
            r0.setFingerprintDialogPreviousState(r4)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.FingerprintDialogFragment.updateFingerprintIcon(int):void");
    }

    /* access modifiers changed from: package-private */
    public void updateHelpMessageColor(int i) {
        TextView textView = this.mHelpMessageView;
        if (textView != null) {
            textView.setTextColor(i == 2 ? this.mErrorTextColor : this.mNormalTextColor);
        }
    }

    /* access modifiers changed from: package-private */
    public void updateHelpMessageText(@Nullable CharSequence charSequence) {
        TextView textView = this.mHelpMessageView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
