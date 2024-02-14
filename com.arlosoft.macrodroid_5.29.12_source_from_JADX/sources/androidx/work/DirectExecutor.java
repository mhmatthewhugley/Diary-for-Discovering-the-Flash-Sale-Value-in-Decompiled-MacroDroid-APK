package androidx.work;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016j\u0002\b\u000b¨\u0006\f"}, mo71668d2 = {"Landroidx/work/DirectExecutor;", "", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lja/u;", "execute", "", "toString", "<init>", "(Ljava/lang/String;I)V", "INSTANCE", "work-runtime-ktx_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* compiled from: DirectExecutor.kt */
public enum DirectExecutor implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        C13706o.m87929f(runnable, "command");
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
