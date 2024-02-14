package com.google.firebase.storage;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class StorageException extends FirebaseException {
    private Throwable cause;
    private final int errorCode;
    private final int httpResultCode;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    static {
        Class<StorageException> cls = StorageException.class;
    }

    StorageException(int i, Throwable th, int i2) {
        super(m77382f(i));
        this.cause = th;
        this.errorCode = i;
        this.httpResultCode = i2;
        Log.e("StorageException", "StorageException has occurred.\n" + m77382f(i) + "\n Code: " + i + " HttpResult: " + i2);
        Throwable th2 = this.cause;
        if (th2 != null) {
            Log.e("StorageException", th2.getMessage(), this.cause);
        }
    }

    /* renamed from: a */
    private static int m77377a(Status status) {
        if (status.mo21289I()) {
            return -13040;
        }
        return status.equals(Status.f3133A) ? -13030 : -13000;
    }

    /* renamed from: b */
    private static int m77378b(@Nullable Throwable th, int i) {
        if (th instanceof CancelException) {
            return -13040;
        }
        if (i == -2) {
            return -13030;
        }
        if (i == 401) {
            return -13020;
        }
        if (i == 409) {
            return -13031;
        }
        if (i != 403) {
            return i != 404 ? -13000 : -13010;
        }
        return -13021;
    }

    @NonNull
    /* renamed from: c */
    public static StorageException m77379c(@NonNull Status status) {
        Preconditions.m4488k(status);
        Preconditions.m4478a(!status.mo21297q2());
        return new StorageException(m77377a(status), (Throwable) null, 0);
    }

    @NonNull
    /* renamed from: d */
    public static StorageException m77380d(@NonNull Throwable th) {
        return m77381e(th, 0);
    }

    @Nullable
    /* renamed from: e */
    public static StorageException m77381e(@Nullable Throwable th, int i) {
        if (th instanceof StorageException) {
            return (StorageException) th;
        }
        if (!m77383h(i) || th != null) {
            return new StorageException(m77378b(th, i), th, i);
        }
        return null;
    }

    /* renamed from: f */
    static String m77382f(int i) {
        if (i == -13040) {
            return "The operation was cancelled.";
        }
        if (i == -13031) {
            return "Object has a checksum which does not match. Please retry the operation.";
        }
        if (i == -13030) {
            return "The operation retry limit has been exceeded.";
        }
        if (i == -13021) {
            return "User does not have permission to access this object.";
        }
        if (i == -13020) {
            return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
        }
        switch (i) {
            case -13013:
                return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
            case -13012:
                return "Project does not exist.";
            case -13011:
                return "Bucket does not exist.";
            case -13010:
                return "Object does not exist at location.";
            default:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
    }

    /* renamed from: h */
    private static boolean m77383h(int i) {
        return i == 0 || (i >= 200 && i < 300);
    }

    /* renamed from: g */
    public int mo63610g() {
        return this.httpResultCode;
    }

    @Nullable
    public synchronized Throwable getCause() {
        Throwable th = this.cause;
        if (th == this) {
            return null;
        }
        return th;
    }
}
