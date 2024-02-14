package androidx.biometric.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.BiometricPrompt;
import java.util.concurrent.Executor;

public class Class2BiometricOrCredentialAuthPrompt {
    @NonNull
    private final BiometricPrompt.PromptInfo mPromptInfo;

    public static final class Builder {
        @Nullable
        private CharSequence mDescription = null;
        private boolean mIsConfirmationRequired = true;
        @Nullable
        private CharSequence mSubtitle = null;
        @NonNull
        private final CharSequence mTitle;

        public Builder(@NonNull CharSequence charSequence) {
            this.mTitle = charSequence;
        }

        @NonNull
        public Class2BiometricOrCredentialAuthPrompt build() {
            return new Class2BiometricOrCredentialAuthPrompt(new BiometricPrompt.PromptInfo.Builder().setTitle(this.mTitle).setSubtitle(this.mSubtitle).setDescription(this.mDescription).setConfirmationRequired(this.mIsConfirmationRequired).setAllowedAuthenticators(33023).build());
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

    Class2BiometricOrCredentialAuthPrompt(@NonNull BiometricPrompt.PromptInfo promptInfo) {
        this.mPromptInfo = promptInfo;
    }

    @Nullable
    public CharSequence getDescription() {
        return this.mPromptInfo.getDescription();
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
    public AuthPrompt startAuthentication(@NonNull AuthPromptHost authPromptHost, @NonNull AuthPromptCallback authPromptCallback) {
        return AuthPromptUtils.startAuthentication(authPromptHost, this.mPromptInfo, (BiometricPrompt.CryptoObject) null, (Executor) null, authPromptCallback);
    }

    @NonNull
    public AuthPrompt startAuthentication(@NonNull AuthPromptHost authPromptHost, @NonNull Executor executor, @NonNull AuthPromptCallback authPromptCallback) {
        return AuthPromptUtils.startAuthentication(authPromptHost, this.mPromptInfo, (BiometricPrompt.CryptoObject) null, executor, authPromptCallback);
    }
}
