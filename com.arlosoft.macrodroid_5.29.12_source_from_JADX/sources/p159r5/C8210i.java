package p159r5;

import androidx.annotation.RestrictTo;
import java.util.Random;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: r5.i */
/* compiled from: SessionUtils */
public class C8210i {
    /* renamed from: a */
    public static String m34090a(int i) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt(i)));
        }
        return sb.toString();
    }
}
