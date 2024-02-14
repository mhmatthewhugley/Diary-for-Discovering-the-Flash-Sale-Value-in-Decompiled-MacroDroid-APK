package p436xd;

import java.util.HashMap;
import java.util.Map;
import p321le.C15629a;
import p321le.C15630b;
import p321le.C15631c;
import p321le.C15633d;
import p321le.C15634e;

/* renamed from: xd.a */
/* compiled from: DefaultMockitoPlugins */
class C16928a {

    /* renamed from: a */
    private static final Map<String, String> f68191a;

    static {
        HashMap hashMap = new HashMap();
        f68191a = hashMap;
        hashMap.put(C15633d.class.getName(), C16929b.class.getName());
        hashMap.put(C15631c.class.getName(), "org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker");
        hashMap.put(C15634e.class.getName(), "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleanerProvider");
        hashMap.put(C15630b.class.getName(), "org.mockito.internal.creation.instance.DefaultInstantiatorProvider");
        hashMap.put(C15629a.class.getName(), "org.mockito.internal.configuration.InjectingAnnotationEngine");
        hashMap.put("mock-maker-inline", "org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker");
    }

    C16928a() {
    }

    /* renamed from: a */
    private <T> T m100047a(Class<T> cls, String str) {
        if (str != null) {
            try {
                return cls.cast(Class.forName(str).newInstance());
            } catch (Exception e) {
                throw new IllegalStateException("Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load " + cls, e);
            }
        } else {
            throw new IllegalStateException("No default implementation for requested Mockito plugin type: " + cls.getName() + "\nIs this a valid Mockito plugin type? If yes, please report this problem to Mockito team.\nOtherwise, please check if you are passing valid plugin type.\nExamples of valid plugin types: MockMaker, StackTraceCleanerProvider.");
        }
    }

    /* renamed from: b */
    public <T> T mo80119b(Class<T> cls) {
        return m100047a(cls, f68191a.get(cls.getName()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo80120c(String str) {
        return f68191a.get(str);
    }
}
