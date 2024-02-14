package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, mo71668d2 = {"Landroidx/fragment/app/strictmode/FragmentTagUsageViolation;", "Landroidx/fragment/app/strictmode/Violation;", "fragment", "Landroidx/fragment/app/Fragment;", "parentContainer", "Landroid/view/ViewGroup;", "(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V", "getParentContainer", "()Landroid/view/ViewGroup;", "fragment_release"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
/* compiled from: FragmentTagUsageViolation.kt */
public final class FragmentTagUsageViolation extends Violation {
    private final ViewGroup parentContainer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentTagUsageViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        C13706o.m87929f(fragment, "fragment");
        this.parentContainer = viewGroup;
    }

    public final ViewGroup getParentContainer() {
        return this.parentContainer;
    }
}
