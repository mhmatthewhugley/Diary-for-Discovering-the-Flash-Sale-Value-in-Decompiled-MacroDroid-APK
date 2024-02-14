package p121k5;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* renamed from: k5.a */
/* compiled from: ErrorCodes */
public final class C7588a {
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static String m31592a(int i) {
        switch (i) {
            case 0:
                return "Unknown error";
            case 1:
                return "No internet connection";
            case 2:
                return "Play Services update cancelled";
            case 3:
                return "Developer error";
            case 4:
                return "Provider error";
            case 5:
                return "User account merge conflict";
            case 6:
                return "You are are attempting to sign in a different email than previously provided";
            case 7:
                return "You are are attempting to sign in with an invalid email link";
            case 8:
                return "You must open the email link on the same device.";
            case 9:
                return "Please enter your email to continue signing in";
            case 10:
                return "You must determine if you want to continue linking or complete the sign in";
            case 11:
                return "The session associated with this sign-in request has either expired or was cleared";
            case 12:
                return "The user account has been disabled by an administrator.";
            case 13:
                return "Generic IDP recoverable error.";
            default:
                throw new IllegalArgumentException("Unknown code: " + i);
        }
    }
}
