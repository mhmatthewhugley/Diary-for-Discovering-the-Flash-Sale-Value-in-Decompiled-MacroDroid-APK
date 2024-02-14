package androidx.biometric.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.BiometricPrompt;
import java.util.concurrent.Executor;

public class Class3BiometricAuthPrompt {
    @NonNull
    private final BiometricPrompt.PromptInfo mPromptInfo;

    public static final class Builder {
        @Nullable
        private CharSequence mDescription = null;
        private boolean mIsConfirmationRequired = true;
        @NonNull
        private final CharSequence mNegativeButtonText;
        @Nullable
        private CharSequence mSubtitle = null;
        @NonNull
        private final CharSequence mTitle;

        public Builder(@NonNull CharSequence charSequence, @NonNull CharSequence charSequence2) {
            this.mTitle = charSequence;
            this.mNegativeButtonText = charSequence2;
        }

        @NonNull
        public Class3BiometricAuthPrompt build() {
            return new Class3BiometricAuthPrompt(new BiometricPrompt.PromptInfo.Builder().setTitle(this.mTitle).setSubtitle(this.mSubtitle).setDescription(this.mDescription).setNegativeButtonText(this.mNegativeButtonText).setConfirmationRequired(this.mIsConfirmationRequired).setAllowedAuthenticators(15).build());
        }

        @NonNull
        public Builder setConfirmationRequired(boolean z) {
            this.mIsConfirmationRequired = z;
            return this;
        }

        @NonNull
        public Builder setDescription(@NonNull CharSequence charSequence) {
            this.mDescription = charSequence;
            return this;
        }

        @NonNull
        public Builder setSubtitle(@NonNull CharSequence charSequence) {
            this.mSubtitle = charSequence;
            return this;
        }
    }

    Class3BiometricAuthPrompt(@NonNull BiometricPrompt.PromptInfo promptInfo) {
        this.mPromptInfo = promptInfo;
    }

    @Nullable
    public CharSequence getDescription() {
        return this.mPromptInfo.getDescription();
    }

    @NonNull
    public CharSequence getNegativeButtonText() {
        return this.mPromptInfo.getTitle();
    }

    @Nullable
    public CharSequence getSubtitle() {
        return this.mPromptInfo.getSubtitle();
    }

    @NonNull
    public CharSequence getTitle() {
        return this.mPromptInfo.getTitle();
    }

    public boolean isConfirmationRequired() {
        return this.mPromptInfo.isConfirmationRequired();
    }

    @NonNull
    public AuthPrompt startAuthentication(@NonNull AuthPromptHost authPromptHost, @Nullable BiometricPrompt.CryptoObject cryptoObject, @NonNull AuthPromptCallback authPromptCallback) {
        return AuthPromptUtils.startAuthentication(authPromptHost, this.mPromptInfo, cryptoObject, (Executor) null, authPromptCallback);
    }

    @NonNull
    public AuthPrompt startAuthentication(@NonNull AuthPromptHost authPromptHost, @Nullable BiometricPrompt.CryptoObject cryptoObject, @NonNull Executor executor, @NonNull AuthPromptCallback authPromptCallback) {
        return AuthPromptUtils.startAuthentication(authPromptHost, this.mPromptInfo, cryptoObject, executor, authPromptCallback);
    }
}
