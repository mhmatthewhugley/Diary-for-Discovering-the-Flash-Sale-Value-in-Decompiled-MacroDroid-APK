package com.google.mlkit.common.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzw;
import com.google.android.gms.internal.mlkit_common.zzx;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public abstract class RemoteModel {

    /* renamed from: e */
    private static final Map f56277e;
    @VisibleForTesting
    @NonNull

    /* renamed from: f */
    public static final Map f56278f;
    @Nullable

    /* renamed from: a */
    private final String f56279a;
    @Nullable

    /* renamed from: b */
    private final BaseModel f56280b;

    /* renamed from: c */
    private final ModelType f56281c;

    /* renamed from: d */
    private String f56282d;

    static {
        Class<BaseModel> cls = BaseModel.class;
        f56277e = new EnumMap(cls);
        f56278f = new EnumMap(cls);
    }

    @KeepForSdk
    protected RemoteModel(@Nullable String str, @Nullable BaseModel baseModel, @NonNull ModelType modelType) {
        Preconditions.m4479b(TextUtils.isEmpty(str) == (baseModel != null), "One of cloud model name and base model cannot be empty");
        this.f56279a = str;
        this.f56280b = baseModel;
        this.f56281c = modelType;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public String mo64528a() {
        return this.f56282d;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: b */
    public String mo64529b() {
        return this.f56279a;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public String mo64530c() {
        String str = this.f56279a;
        return str != null ? str : (String) f56278f.get(this.f56280b);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public ModelType mo64531d() {
        return this.f56281c;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: e */
    public String mo64532e() {
        String str = this.f56279a;
        return str != null ? str : "COM.GOOGLE.BASE_".concat(String.valueOf((String) f56278f.get(this.f56280b)));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemoteModel)) {
            return false;
        }
        RemoteModel remoteModel = (RemoteModel) obj;
        return Objects.m4470a(this.f56279a, remoteModel.f56279a) && Objects.m4470a(this.f56280b, remoteModel.f56280b) && Objects.m4470a(this.f56281c, remoteModel.f56281c);
    }

    public int hashCode() {
        return Objects.m4471b(this.f56279a, this.f56280b, this.f56281c);
    }

    @NonNull
    public String toString() {
        zzw b = zzx.m61550b("RemoteModel");
        b.mo52015a("modelName", this.f56279a);
        b.mo52015a("baseModel", this.f56280b);
        b.mo52015a("modelType", this.f56281c);
        return b.toString();
    }
}
