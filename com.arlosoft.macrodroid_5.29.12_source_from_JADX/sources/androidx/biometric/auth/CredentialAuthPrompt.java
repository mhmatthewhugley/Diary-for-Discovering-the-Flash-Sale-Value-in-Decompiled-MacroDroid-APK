package androidx.biometric.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.biometric.BiometricPrompt;
import java.util.concurrent.Executor;

@RequiresApi(30)
public class CredentialAuthPrompt {
    @NonNull
    private final BiometricPrompt.PromptInfo mPromptInfo;

    public static final class Builder {
        @Nullable
        private CharSequence mDescription = null;
        @NonNull
        private final CharSequence mTitle;

        public Builder(@NonNull CharSequence charSequence) {
            this.mTitle = charSequence;
        }

        @NonNull
        public CredentialAuthPrompt build() {
            return new CredentialAuthPrompt(new BiometricPrompt.PromptInfo.Builder().setTitle(this.mTitle).setDescription(this.mDescription).setAllowedAuthenticators(32768).build());
        }

        @NonNull
        public Builder setDescription(@NonNull CharSequence charSequence) {
            this.mDescription = charSequence;
            return this;
        }
    }

    CredentialAuthPrompt(@NonNull BiometricPrompt.PromptInfo promptInfo) {
        this.mPromptInfo = promptInfo;
    }

    @Nullable
    public CharSequence getDescription() {
        return this.mPromptInfo.getDescription();
    }

    @NonNull
    public CharSequence getTitle() {
        return this.mPromptInfo.getTitle();
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
