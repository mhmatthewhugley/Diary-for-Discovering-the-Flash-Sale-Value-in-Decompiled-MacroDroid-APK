package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.ScriptReferenceCompat;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptReferenceBoundaryInterface;
import p320ld.C15627a;

public class ScriptReferenceImpl extends ScriptReferenceCompat {
    private ScriptReferenceBoundaryInterface mBoundaryInterface;

    private ScriptReferenceImpl(@NonNull ScriptReferenceBoundaryInterface scriptReferenceBoundaryInterface) {
        this.mBoundaryInterface = scriptReferenceBoundaryInterface;
    }

    @NonNull
    public static ScriptReferenceImpl toScriptReferenceCompat(@NonNull InvocationHandler invocationHandler) {
        return new ScriptReferenceImpl((ScriptReferenceBoundaryInterface) C15627a.m94878a(ScriptReferenceBoundaryInterface.class, invocationHandler));
    }

    public void remove() {
        this.mBoundaryInterface.remove();
    }
}
