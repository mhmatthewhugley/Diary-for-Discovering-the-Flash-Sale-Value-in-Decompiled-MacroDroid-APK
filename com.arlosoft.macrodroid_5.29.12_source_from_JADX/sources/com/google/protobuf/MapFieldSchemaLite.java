package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.Map;

class MapFieldSchemaLite implements MapFieldSchema {
    MapFieldSchemaLite() {
    }

    /* renamed from: i */
    private static <K, V> int m80881i(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int i2 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            i2 += mapEntryLite.mo65319a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: j */
    private static <K, V> MapFieldLite<K, V> m80882j(Object obj, Object obj2) {
        MapFieldLite<K, V> mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.mo65324h()) {
                mapFieldLite = mapFieldLite.mo65328n();
            }
            mapFieldLite.mo65327l(mapFieldLite2);
        }
        return mapFieldLite;
    }

    /* renamed from: a */
    public Object mo65332a(Object obj, Object obj2) {
        return m80882j(obj, obj2);
    }

    /* renamed from: b */
    public MapEntryLite.Metadata<?, ?> mo65333b(Object obj) {
        return ((MapEntryLite) obj).mo65320c();
    }

    /* renamed from: c */
    public Map<?, ?> mo65334c(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: d */
    public Object mo65335d(Object obj) {
        return MapFieldLite.m80865d().mo65328n();
    }

    /* renamed from: e */
    public Map<?, ?> mo65336e(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: f */
    public Object mo65337f(Object obj) {
        ((MapFieldLite) obj).mo65326k();
        return obj;
    }

    /* renamed from: g */
    public int mo65338g(int i, Object obj, Object obj2) {
        return m80881i(i, obj, obj2);
    }

    /* renamed from: h */
    public boolean mo65339h(Object obj) {
        return !((MapFieldLite) obj).mo65324h();
    }
}
