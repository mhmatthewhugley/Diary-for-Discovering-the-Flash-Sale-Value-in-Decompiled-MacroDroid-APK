package com.android.p023dx.p024cf.code;

import com.android.dex.util.ExceptionWithContext;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeBearer;
import com.android.p023dx.util.Hex;
import org.apache.commons.p353io.IOUtils;

/* renamed from: com.android.dx.cf.code.OneLocalsArray */
public class OneLocalsArray extends LocalsArray {
    private final TypeBearer[] locals;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OneLocalsArray(int i) {
        super(i != 0);
        this.locals = new TypeBearer[i];
    }

    private static TypeBearer throwSimException(int i, String str) {
        throw new SimException("local " + Hex.m907u2(i) + ": " + str);
    }

    public void annotate(ExceptionWithContext exceptionWithContext) {
        String str;
        int i = 0;
        while (true) {
            TypeBearer[] typeBearerArr = this.locals;
            if (i < typeBearerArr.length) {
                TypeBearer typeBearer = typeBearerArr[i];
                if (typeBearer == null) {
                    str = "<invalid>";
                } else {
                    str = typeBearer.toString();
                }
                exceptionWithContext.addContext("locals[" + Hex.m907u2(i) + "]: " + str);
                i++;
            } else {
                return;
            }
        }
    }

    public TypeBearer get(int i) {
        TypeBearer typeBearer = this.locals[i];
        return typeBearer == null ? throwSimException(i, "invalid") : typeBearer;
    }

    public TypeBearer getCategory1(int i) {
        TypeBearer typeBearer = get(i);
        Type type = typeBearer.getType();
        if (type.isUninitialized()) {
            return throwSimException(i, "uninitialized instance");
        }
        return type.isCategory2() ? throwSimException(i, "category-2") : typeBearer;
    }

    public TypeBearer getCategory2(int i) {
        TypeBearer typeBearer = get(i);
        return typeBearer.getType().isCategory1() ? throwSimException(i, "category-1") : typeBearer;
    }

    public int getMaxLocals() {
        return this.locals.length;
    }

    public TypeBearer getOrNull(int i) {
        return this.locals[i];
    }

    /* access modifiers changed from: protected */
    public OneLocalsArray getPrimary() {
        return this;
    }

    public void invalidate(int i) {
        throwIfImmutable();
        this.locals[i] = null;
    }

    public void makeInitialized(Type type) {
        int length = this.locals.length;
        if (length != 0) {
            throwIfImmutable();
            Type initializedType = type.getInitializedType();
            for (int i = 0; i < length; i++) {
                TypeBearer[] typeBearerArr = this.locals;
                if (typeBearerArr[i] == type) {
                    typeBearerArr[i] = initializedType;
                }
            }
        }
    }

    public LocalsArray merge(LocalsArray localsArray) {
        if (localsArray instanceof OneLocalsArray) {
            return merge((OneLocalsArray) localsArray);
        }
        return localsArray.merge(this);
    }

    public LocalsArraySet mergeWithSubroutineCaller(LocalsArray localsArray, int i) {
        return new LocalsArraySet(getMaxLocals()).mergeWithSubroutineCaller(localsArray, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r4 = r4 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void set(int r4, com.android.p023dx.rop.type.TypeBearer r5) {
        /*
            r3 = this;
            r3.throwIfImmutable()
            com.android.dx.rop.type.TypeBearer r5 = r5.getFrameType()     // Catch:{ NullPointerException -> 0x003d }
            if (r4 < 0) goto L_0x0035
            com.android.dx.rop.type.Type r0 = r5.getType()
            boolean r0 = r0.isCategory2()
            r1 = 0
            if (r0 == 0) goto L_0x001a
            com.android.dx.rop.type.TypeBearer[] r0 = r3.locals
            int r2 = r4 + 1
            r0[r2] = r1
        L_0x001a:
            com.android.dx.rop.type.TypeBearer[] r0 = r3.locals
            r0[r4] = r5
            if (r4 == 0) goto L_0x0034
            int r4 = r4 + -1
            r5 = r0[r4]
            if (r5 == 0) goto L_0x0034
            com.android.dx.rop.type.Type r5 = r5.getType()
            boolean r5 = r5.isCategory2()
            if (r5 == 0) goto L_0x0034
            com.android.dx.rop.type.TypeBearer[] r5 = r3.locals
            r5[r4] = r1
        L_0x0034:
            return
        L_0x0035:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.String r5 = "idx < 0"
            r4.<init>(r5)
            throw r4
        L_0x003d:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "type == null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.p024cf.code.OneLocalsArray.set(int, com.android.dx.rop.type.TypeBearer):void");
    }

    public String toHuman() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            TypeBearer[] typeBearerArr = this.locals;
            if (i >= typeBearerArr.length) {
                return sb.toString();
            }
            TypeBearer typeBearer = typeBearerArr[i];
            if (typeBearer == null) {
                str = "<invalid>";
            } else {
                str = typeBearer.toString();
            }
            sb.append("locals[" + Hex.m907u2(i) + "]: " + str + IOUtils.LINE_SEPARATOR_UNIX);
            i++;
        }
    }

    public OneLocalsArray copy() {
        OneLocalsArray oneLocalsArray = new OneLocalsArray(this.locals.length);
        TypeBearer[] typeBearerArr = this.locals;
        System.arraycopy(typeBearerArr, 0, oneLocalsArray.locals, 0, typeBearerArr.length);
        return oneLocalsArray;
    }

    public OneLocalsArray merge(OneLocalsArray oneLocalsArray) {
        try {
            return Merger.mergeLocals(this, oneLocalsArray);
        } catch (SimException e) {
            e.addContext("underlay locals:");
            annotate(e);
            e.addContext("overlay locals:");
            oneLocalsArray.annotate(e);
            throw e;
        }
    }

    public void set(RegisterSpec registerSpec) {
        set(registerSpec.getReg(), registerSpec);
    }
}
