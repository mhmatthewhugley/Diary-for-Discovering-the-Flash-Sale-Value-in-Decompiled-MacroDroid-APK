package p159r5;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: r5.j */
/* compiled from: TaskFailureLogger */
public class C8211j implements OnFailureListener {

    /* renamed from: a */
    private String f19894a;

    /* renamed from: b */
    private String f19895b;

    public C8211j(@NonNull String str, @NonNull String str2) {
        this.f19894a = str;
        this.f19895b = str2;
    }

    /* renamed from: c */
    public void mo22733c(@NonNull Exception exc) {
        Log.w(this.f19894a, this.f19895b, exc);
    }
}
