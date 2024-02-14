package com.android.p023dx.mockito;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;
import p213ae.C11099a;
import p220be.C11156a;
import p220be.C11157b;
import p265fe.C12261a;
import p301je.C13375a;
import p301je.C13377c;
import p301je.C13379e;
import p452zd.C17091a;

/* renamed from: com.android.dx.mockito.InterceptedInvocation */
class InterceptedInvocation implements C13375a {
    private final Object[] arguments;
    private boolean isIgnoredForVerification;
    private final C13377c location = new C17091a();
    private final C11157b method;
    private final Object mock;
    private final Object[] rawArguments;
    private final int sequenceNumber;
    private C13379e stubInfo;
    private final SuperMethod superMethod;
    private boolean verified;

    /* renamed from: com.android.dx.mockito.InterceptedInvocation$SuperMethod */
    interface SuperMethod extends Serializable {
        Object invoke() throws Throwable;

        boolean isInvokable();
    }

    InterceptedInvocation(Object obj, C11157b bVar, Object[] objArr, SuperMethod superMethod2, int i) {
        this.mock = obj;
        this.method = bVar;
        this.arguments = C11156a.m74908b(bVar, objArr);
        this.rawArguments = objArr;
        this.superMethod = superMethod2;
        this.sequenceNumber = i;
    }

    private boolean equalArguments(Object[] objArr) {
        return Arrays.equals(objArr, this.arguments);
    }

    public Object callRealMethod() throws Throwable {
        if (this.superMethod.isInvokable()) {
            return this.superMethod.invoke();
        }
        throw C11099a.m74716a();
    }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        InterceptedInvocation interceptedInvocation = (InterceptedInvocation) obj;
        if (!this.mock.equals(interceptedInvocation.mock) || !this.method.equals(interceptedInvocation.method) || !equalArguments(interceptedInvocation.arguments)) {
            return false;
        }
        return true;
    }

    public <T> T getArgument(int i) {
        return this.arguments[i];
    }

    public Object[] getArguments() {
        return this.arguments;
    }

    public C13377c getLocation() {
        return this.location;
    }

    public Method getMethod() {
        return this.method.mo62342b();
    }

    public Object getMock() {
        return this.mock;
    }

    public Object[] getRawArguments() {
        return this.rawArguments;
    }

    public Class<?> getRawReturnType() {
        return this.method.getReturnType();
    }

    public int getSequenceNumber() {
        return this.sequenceNumber;
    }

    public int hashCode() {
        return 1;
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

    public String toString() {
        return new C12261a().mo68589c(C11156a.m74907a(getArguments()), this);
    }
}
