package com.android.p023dx.rop.type;

/* renamed from: com.android.dx.rop.type.TypeList */
public interface TypeList {
    Type getType(int i);

    int getWordCount();

    boolean isMutable();

    int size();

    TypeList withAddedType(Type type);
}
