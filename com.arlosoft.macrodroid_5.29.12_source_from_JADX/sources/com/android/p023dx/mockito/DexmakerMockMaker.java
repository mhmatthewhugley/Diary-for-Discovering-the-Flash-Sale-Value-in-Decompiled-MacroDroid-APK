package com.android.p023dx.mockito;

import com.android.p023dx.stock.ProxyBuilder;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Set;
import org.mockito.exceptions.base.MockitoException;
import p301je.C13378d;
import p311ke.C13558a;
import p321le.C15631c;
import p321le.C15634e;
import p418vd.C16770a;

/* renamed from: com.android.dx.mockito.DexmakerMockMaker */
public final class DexmakerMockMaker implements C15631c, C15634e {
    private final UnsafeAllocator unsafeAllocator = UnsafeAllocator.create();

    private InvocationHandlerAdapter getInvocationHandlerAdapter(Object obj) {
        if (obj == null) {
            return null;
        }
        if (Proxy.isProxyClass(obj.getClass())) {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(obj);
            if (invocationHandler instanceof InvocationHandlerAdapter) {
                return (InvocationHandlerAdapter) invocationHandler;
            }
            return null;
        } else if (!ProxyBuilder.isProxyClass(obj.getClass())) {
            return null;
        } else {
            InvocationHandler invocationHandler2 = ProxyBuilder.getInvocationHandler(obj);
            if (invocationHandler2 instanceof InvocationHandlerAdapter) {
                return (InvocationHandlerAdapter) invocationHandler2;
            }
            return null;
        }
    }

    public <T> T createMock(C13558a<T> aVar, C13378d dVar) {
        Class<T> a = aVar.mo71663a();
        Set<Class<?>> b = aVar.mo71664b();
        Class[] clsArr = (Class[]) b.toArray(new Class[b.size()]);
        InvocationHandlerAdapter invocationHandlerAdapter = new InvocationHandlerAdapter(dVar);
        if (a.isInterface()) {
            Class[] clsArr2 = new Class[(clsArr.length + 1)];
            clsArr2[0] = a;
            System.arraycopy(clsArr, 0, clsArr2, 1, clsArr.length);
            return Proxy.newProxyInstance(a.getClassLoader(), clsArr2, invocationHandlerAdapter);
        }
        try {
            T newInstance = this.unsafeAllocator.newInstance(ProxyBuilder.forClass(a).implementing(clsArr).buildProxyClass());
            ProxyBuilder.setInvocationHandler(newInstance, invocationHandlerAdapter);
            return newInstance;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new MockitoException("Failed to mock " + a, e2);
        }
    }

    public C13378d getHandler(Object obj) {
        InvocationHandlerAdapter invocationHandlerAdapter = getInvocationHandlerAdapter(obj);
        if (invocationHandlerAdapter != null) {
            return invocationHandlerAdapter.getHandler();
        }
        return null;
    }

    public C16770a getStackTraceCleaner(final C16770a aVar) {
        return new C16770a() {
            public boolean isIn(StackTraceElement stackTraceElement) {
                String className = stackTraceElement.getClassName();
                return aVar.isIn(stackTraceElement) && !className.endsWith("_Proxy") && !className.startsWith("$Proxy") && !className.startsWith("java.lang.reflect.Proxy") && (!className.startsWith("com.android.dx.mockito.") || className.startsWith("com.android.dx.mockito.tests"));
            }
        };
    }

    public C15631c.C15632a isTypeMockable(final Class<?> cls) {
        return new C15631c.C15632a() {
            public boolean mockable() {
                return !cls.isPrimitive() && !Modifier.isFinal(cls.getModifiers());
            }

            public String nonMockableReason() {
                if (cls.isPrimitive()) {
                    return "primitive type";
                }
                return Modifier.isFinal(cls.getModifiers()) ? "final or anonymous class" : "not handled type";
            }
        };
    }

    public void resetMock(Object obj, C13378d dVar, C13558a aVar) {
        getInvocationHandlerAdapter(obj).setHandler(dVar);
    }
}
