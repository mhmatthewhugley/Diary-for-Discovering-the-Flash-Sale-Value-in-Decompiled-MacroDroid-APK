package p427wd;

import org.mockito.exceptions.misusing.MockitoConfigurationException;
import p409ud.C16699b;

/* renamed from: wd.a */
/* compiled from: ClassPathLoader */
public class C16841a {
    /* renamed from: a */
    public C16699b mo79957a() {
        try {
            try {
                return (C16699b) Class.forName("org.mockito.configuration.MockitoConfiguration").newInstance();
            } catch (ClassCastException e) {
                throw new MockitoConfigurationException("MockitoConfiguration class must implement " + C16699b.class.getName() + " interface.", e);
            } catch (Exception e2) {
                throw new MockitoConfigurationException("Unable to instantiate org.mockito.configuration.MockitoConfiguration class. Does it have a safe, no-arg constructor?", e2);
            }
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
