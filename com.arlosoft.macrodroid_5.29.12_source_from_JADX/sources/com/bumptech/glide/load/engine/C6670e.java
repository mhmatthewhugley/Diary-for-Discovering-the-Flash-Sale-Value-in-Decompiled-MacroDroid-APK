package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.io.File;
import p102h4.C7379d;
import p102h4.C7384g;
import p132m4.C7910a;

/* renamed from: com.bumptech.glide.load.engine.e */
/* compiled from: DataCacheWriter */
class C6670e<DataType> implements C7910a.C7912b {

    /* renamed from: a */
    private final C7379d<DataType> f15518a;

    /* renamed from: b */
    private final DataType f15519b;

    /* renamed from: c */
    private final C7384g f15520c;

    C6670e(C7379d<DataType> dVar, DataType datatype, C7384g gVar) {
        this.f15518a = dVar;
        this.f15519b = datatype;
        this.f15520c = gVar;
    }

    /* renamed from: a */
    public boolean mo33013a(@NonNull File file) {
        return this.f15518a.mo37372a(this.f15519b, file, this.f15520c);
    }
}
