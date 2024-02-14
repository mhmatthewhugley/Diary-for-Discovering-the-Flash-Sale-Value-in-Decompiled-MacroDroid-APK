package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15516s2;
import kotlinx.coroutines.C15561w1;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002XT¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, mo71668d2 = {"", "JOB_KEY", "Ljava/lang/String;", "Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/k0;", "getViewModelScope", "(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/k0;", "viewModelScope", "lifecycle-viewmodel-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: ViewModel.kt */
public final class ViewModelKt {
    private static final String JOB_KEY = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    public static final C15478k0 getViewModelScope(ViewModel viewModel) {
        C13706o.m87929f(viewModel, "<this>");
        C15478k0 k0Var = (C15478k0) viewModel.getTag(JOB_KEY);
        if (k0Var != null) {
            return k0Var;
        }
        Object tagIfAbsent = viewModel.setTagIfAbsent(JOB_KEY, new CloseableCoroutineScope(C15516s2.m94604b((C15561w1) null, 1, (Object) null).plus(C15186a1.m93731c().mo74507o())));
        C13706o.m87928e(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (C15478k0) tagIfAbsent;
    }
}
