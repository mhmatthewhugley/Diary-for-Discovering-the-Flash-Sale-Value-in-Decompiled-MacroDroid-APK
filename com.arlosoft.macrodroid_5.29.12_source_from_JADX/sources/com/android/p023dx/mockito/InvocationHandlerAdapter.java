package com.android.p023dx.mockito;

import com.android.p023dx.stock.ProxyBuilder;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p213ae.C11099a;
import p220be.C11156a;
import p254ee.C12188a;
import p301je.C13375a;
import p301je.C13377c;
import p301je.C13378d;
import p301je.C13379e;
import p444yd.C17036a;
import p452zd.C17091a;

/* renamed from: com.android.dx.mockito.InvocationHandlerAdapter */
final class InvocationHandlerAdapter implements InvocationHandler {
    private C13378d handler;

    /* renamed from: com.android.dx.mockito.InvocationHandlerAdapter$ProxyInvocation */
    private class ProxyInvocation implements C13375a {
        private final Object[] args;
        private boolean isIgnoredForVerification;
        private final C13377c location;
        private final Method method;
        private final Object proxy;
        private final Object[] rawArgs;
        private final int sequenceNumber;
        private C13379e stubInfo;
        private boolean verified;

        public Object callRealMethod() throws Throwable {
            if (!Modifier.isAbstract(this.method.getModifiers())) {
                return ProxyBuilder.callSuper(this.proxy, this.method, this.rawArgs);
            }
            throw C11099a.m74716a();
        }

        public <T> T getArgument(int i) {
            return this.args[i];
        }

        public Object[] getArguments() {
            return this.args;
        }

        public C13377c getLocation() {
            return this.location;
        }

        public Method getMethod() {
            return this.method;
        }

        public Object getMock() {
            return this.proxy;
        }

        public Object[] getRawArguments() {
            return this.rawArgs;
        }

        public Class<?> getRawReturnType() {
            return this.method.getReturnType();
        }

        public int getSequenceNumber() {
            return this.sequenceNumber;
        }

        public void ignoreForVerification() {
            this.isIgnoredForVerification = true;
        }

        public boolean isIgnoredForVerification() {
            return this.isIgnoredForVerification;
        }

        public boolean isVerified() {
            return this.verified || this.isIgnoredForVerification;
        }

        public void markStubbed(C13379e eVar) {
            this.stubInfo = eVar;
        }

        public void markVerified() {
            this.verified = true;
        }

        public C13379e stubInfo() {
            return this.stubInfo;
        }

        private ProxyInvocation(Object obj, Method method2, Object[] objArr, C17036a aVar, int i, C13377c cVar) {
            this.rawArgs = objArr;
            this.proxy = obj;
            this.method = method2;
            this.sequenceNumber = i;
            this.location = cVar;
            this.args = C11156a.m74908b(aVar, objArr);
        }
    }

    public InvocationHandlerAdapter(C13378d dVar) {
        this.handler = dVar;
    }

    private static boolean isEqualsMethod(Method method) {
        if (method.getName().equals("equals") && method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == Object.class) {
            return true;
        }
        return false;
    }

    private static boolean isHashCodeMethod(Method method) {
        return method.getName().equals("hashCode") && method.getParameterTypes().length == 0;
    }

    public C13378d getHandler() {
        return this.handler;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        boolean z = false;
        if (objArr == null) {
            objArr = new Object[0];
        }
        Object[] objArr2 = objArr;
        if (isEqualsMethod(method)) {
            if (obj == objArr2[0]) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (isHashCodeMethod(method)) {
            return Integer.valueOf(System.identityHashCode(obj));
        } else {
            return this.handler.mo70792p0(new ProxyInvocation(obj, method, objArr2, new C17036a(method), C12188a.m82856a(), new C17091a()));
        }
    }

    public void setHandler(C13378d dVar) {
        this.handler = dVar;
    }
}
