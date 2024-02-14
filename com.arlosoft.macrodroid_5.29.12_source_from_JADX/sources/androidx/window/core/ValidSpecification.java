package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000f\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo71668d2 = {"Landroidx/window/core/ValidSpecification;", "", "T", "Landroidx/window/core/SpecificationComputer;", "", "message", "Lkotlin/Function1;", "", "condition", "require", "compute", "()Ljava/lang/Object;", "value", "Ljava/lang/Object;", "getValue", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "verificationMode", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "getVerificationMode", "()Landroidx/window/core/SpecificationComputer$VerificationMode;", "Landroidx/window/core/Logger;", "logger", "Landroidx/window/core/Logger;", "getLogger", "()Landroidx/window/core/Logger;", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/window/core/SpecificationComputer$VerificationMode;Landroidx/window/core/Logger;)V", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: SpecificationComputer.kt */
final class ValidSpecification<T> extends SpecificationComputer<T> {
    private final Logger logger;
    private final String tag;
    private final T value;
    private final SpecificationComputer.VerificationMode verificationMode;

    public ValidSpecification(T t, String str, SpecificationComputer.VerificationMode verificationMode2, Logger logger2) {
        C13706o.m87929f(t, "value");
        C13706o.m87929f(str, "tag");
        C13706o.m87929f(verificationMode2, "verificationMode");
        C13706o.m87929f(logger2, "logger");
        this.value = t;
        this.tag = str;
        this.verificationMode = verificationMode2;
        this.logger = logger2;
    }

    public T compute() {
        return this.value;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final String getTag() {
        return this.tag;
    }

    public final T getValue() {
        return this.value;
    }

    public final SpecificationComputer.VerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    public SpecificationComputer<T> require(String str, C16265l<? super T, Boolean> lVar) {
        C13706o.m87929f(str, "message");
        C13706o.m87929f(lVar, "condition");
        if (lVar.invoke(this.value).booleanValue()) {
            return this;
        }
        return new FailedSpecification(this.value, this.tag, str, this.logger, this.verificationMode);
    }
}
