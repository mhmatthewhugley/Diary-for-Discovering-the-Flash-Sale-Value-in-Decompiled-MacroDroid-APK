package androidx.work;

import androidx.annotation.NonNull;
import androidx.work.OneTimeWorkRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p361pa.C16147a;
import p433xa.C16875d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\b\u001a\u001f\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\b¨\u0006\b"}, mo71668d2 = {"Landroidx/work/ListenableWorker;", "W", "Landroidx/work/OneTimeWorkRequest$Builder;", "OneTimeWorkRequestBuilder", "Lxa/d;", "Landroidx/work/InputMerger;", "inputMerger", "setInputMerger", "work-runtime-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: OneTimeWorkRequest.kt */
public final class OneTimeWorkRequestKt {
    public static final OneTimeWorkRequest.Builder setInputMerger(OneTimeWorkRequest.Builder builder, @NonNull C16875d<? extends InputMerger> dVar) {
        C13706o.m87929f(builder, "<this>");
        C13706o.m87929f(dVar, "inputMerger");
        OneTimeWorkRequest.Builder inputMerger = builder.setInputMerger(C16147a.m96968b(dVar));
        C13706o.m87928e(inputMerger, "setInputMerger(inputMerger.java)");
        return inputMerger;
    }
}
