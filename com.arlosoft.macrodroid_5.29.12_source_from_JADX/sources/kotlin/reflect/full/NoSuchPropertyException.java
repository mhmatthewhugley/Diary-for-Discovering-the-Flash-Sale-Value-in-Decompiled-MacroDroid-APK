package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;

@Metadata(mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo71668d2 = {"Lkotlin/reflect/full/NoSuchPropertyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "(Ljava/lang/Exception;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: exceptions.kt */
public final class NoSuchPropertyException extends Exception {
    public NoSuchPropertyException() {
        this((Exception) null, 1, (C13695i) null);
    }

    public NoSuchPropertyException(Exception exc) {
        super(exc);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoSuchPropertyException(Exception exc, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : exc);
    }
}
