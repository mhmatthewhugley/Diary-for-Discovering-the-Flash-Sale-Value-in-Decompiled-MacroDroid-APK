package com.google.firebase.firestore;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseException;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Preconditions;

public class FirebaseFirestoreException extends FirebaseException {
    @NonNull
    private final Code code;

    public enum Code {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        

        /* renamed from: I */
        private static final SparseArray<Code> f5678I = null;
        private final int value;

        static {
            f5678I = m7864b();
        }

        private Code(int i) {
            this.value = i;
        }

        /* renamed from: b */
        private static SparseArray<Code> m7864b() {
            SparseArray<Code> sparseArray = new SparseArray<>();
            Code[] values = values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                Code code = values[i];
                Code code2 = sparseArray.get(code.mo23686e());
                if (code2 == null) {
                    sparseArray.put(code.mo23686e(), code);
                    i++;
                } else {
                    throw new IllegalStateException("Code value duplication between " + code2 + "&" + code.name());
                }
            }
            return sparseArray;
        }

        @NonNull
        /* renamed from: d */
        public static Code m7865d(int i) {
            return f5678I.get(i, UNKNOWN);
        }

        /* renamed from: e */
        public int mo23686e() {
            return this.value;
        }
    }

    public FirebaseFirestoreException(@NonNull String str, @NonNull Code code2) {
        super(str);
        Preconditions.m76514c(str, "Provided message must not be null.");
        Assert.m76443d(code2 != Code.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.code = (Code) Preconditions.m76514c(code2, "Provided code must not be null.");
    }

    @NonNull
    /* renamed from: a */
    public Code mo23685a() {
        return this.code;
    }

    public FirebaseFirestoreException(@NonNull String str, @NonNull Code code2, @Nullable Throwable th) {
        super(str, th);
        Preconditions.m76514c(str, "Provided message must not be null.");
        Assert.m76443d(code2 != Code.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.code = (Code) Preconditions.m76514c(code2, "Provided code must not be null.");
    }
}
