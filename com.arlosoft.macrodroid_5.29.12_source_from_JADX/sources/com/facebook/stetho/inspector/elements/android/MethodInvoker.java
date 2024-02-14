package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class MethodInvoker {
    private static final List<TypedMethodInvoker<?>> invokers = Arrays.asList(new TypedMethodInvoker[]{new StringMethodInvoker(), new CharSequenceMethodInvoker(), new IntegerMethodInvoker(), new FloatMethodInvoker(), new BooleanMethodInvoker()});

    private static class BooleanMethodInvoker extends TypedMethodInvoker<Boolean> {
        BooleanMethodInvoker() {
            super(Boolean.TYPE);
        }

        /* access modifiers changed from: package-private */
        public Boolean convertArgument(String str) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
    }

    private static class CharSequenceMethodInvoker extends TypedMethodInvoker<CharSequence> {
        CharSequenceMethodInvoker() {
            super(CharSequence.class);
        }

        /* access modifiers changed from: package-private */
        public CharSequence convertArgument(String str) {
            return str;
        }
    }

    private static class FloatMethodInvoker extends TypedMethodInvoker<Float> {
        FloatMethodInvoker() {
            super(Float.TYPE);
        }

        /* access modifiers changed from: package-private */
        public Float convertArgument(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }
    }

    private static class IntegerMethodInvoker extends TypedMethodInvoker<Integer> {
        IntegerMethodInvoker() {
            super(Integer.TYPE);
        }

        /* access modifiers changed from: package-private */
        public Integer convertArgument(String str) {
            return Integer.valueOf(Integer.parseInt(str));
        }
    }

    private static class StringMethodInvoker extends TypedMethodInvoker<String> {
        StringMethodInvoker() {
            super(String.class);
        }

        /* access modifiers changed from: package-private */
        public String convertArgument(String str) {
            return str;
        }
    }

    private static abstract class TypedMethodInvoker<T> {
        private final Class<T> mArgType;

        TypedMethodInvoker(Class<T> cls) {
            this.mArgType = cls;
        }

        /* access modifiers changed from: package-private */
        public abstract T convertArgument(String str);

        /* access modifiers changed from: package-private */
        public boolean invoke(Object obj, String str, String str2) {
            try {
                obj.getClass().getMethod(str, new Class[]{this.mArgType}).invoke(obj, new Object[]{convertArgument(str2)});
                return true;
            } catch (NoSuchMethodException unused) {
                return false;
            } catch (InvocationTargetException e) {
                LogUtil.m25490w("InvocationTargetException: " + e.getMessage());
                return false;
            } catch (IllegalAccessException e2) {
                LogUtil.m25490w("IllegalAccessException: " + e2.getMessage());
                return false;
            } catch (IllegalArgumentException e3) {
                LogUtil.m25490w("IllegalArgumentException: " + e3.getMessage());
                return false;
            }
        }
    }

    public void invoke(Object obj, String str, String str2) {
        Util.throwIfNull(obj, str, str2);
        int size = invokers.size();
        int i = 0;
        while (i < size) {
            if (!invokers.get(i).invoke(obj, str, str2)) {
                i++;
            } else {
                return;
            }
        }
        LogUtil.m25490w("Method with name " + str + " not found for any of the MethodInvoker supported argument types.");
    }
}
