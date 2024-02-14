package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.Phonemetadata;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class MultiFileMetadataSourceImpl implements MetadataSource {

    /* renamed from: a */
    private final String f56069a;

    /* renamed from: b */
    private final MetadataLoader f56070b;

    /* renamed from: c */
    private final ConcurrentHashMap<String, Phonemetadata.PhoneMetadata> f56071c;

    /* renamed from: d */
    private final ConcurrentHashMap<Integer, Phonemetadata.PhoneMetadata> f56072d;

    MultiFileMetadataSourceImpl(String str, MetadataLoader metadataLoader) {
        this.f56071c = new ConcurrentHashMap<>();
        this.f56072d = new ConcurrentHashMap<>();
        this.f56069a = str;
        this.f56070b = metadataLoader;
    }

    /* renamed from: c */
    private boolean m78750c(int i) {
        List list = CountryCodeToRegionCodeMap.m78736a().get(Integer.valueOf(i));
        if (list.size() != 1 || !"001".equals(list.get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public Phonemetadata.PhoneMetadata mo64326a(String str) {
        return MetadataManager.m78740c(str, this.f56071c, this.f56069a, this.f56070b);
    }

    /* renamed from: b */
    public Phonemetadata.PhoneMetadata mo64327b(int i) {
        if (!m78750c(i)) {
            return null;
        }
        return MetadataManager.m78740c(Integer.valueOf(i), this.f56072d, this.f56069a, this.f56070b);
    }

    MultiFileMetadataSourceImpl(MetadataLoader metadataLoader) {
        this("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto", metadataLoader);
    }
}
