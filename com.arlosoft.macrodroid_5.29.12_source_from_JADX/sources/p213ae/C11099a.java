package p213ae;

import org.mockito.exceptions.base.MockitoException;
import p273ge.C12365c;

/* renamed from: ae.a */
/* compiled from: Reporter */
public class C11099a {
    /* renamed from: a */
    public static MockitoException m74716a() {
        return new MockitoException(C12365c.m83128e("Cannot call abstract real method on java object!", "Calling real methods is only possible when mocking non abstract method.", "  //correct example:", "  when(mockOfConcreteClass.nonAbstractMethod()).thenCallRealMethod();"));
    }
}
