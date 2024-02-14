package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.Geofence;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class GeofencingEvent {

    /* renamed from: a */
    private final int f45816a;
    @Geofence.GeofenceTransition

    /* renamed from: b */
    private final int f45817b;

    /* renamed from: c */
    private final List<Geofence> f45818c;

    /* renamed from: d */
    private final Location f45819d;

    private GeofencingEvent(int i, @Geofence.GeofenceTransition int i2, List<Geofence> list, Location location) {
        this.f45816a = i;
        this.f45817b = i2;
        this.f45818c = list;
        this.f45819d = location;
    }

    @NonNull
    /* renamed from: a */
    public static GeofencingEvent m64658a(@NonNull Intent intent) {
        ArrayList arrayList = null;
        if (intent == null) {
            return null;
        }
        int i = -1;
        int intExtra = intent.getIntExtra("gms_error_code", -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1) {
            if (intExtra2 == 1 || intExtra2 == 2) {
                i = intExtra2;
            } else if (intExtra2 == 4) {
                i = 4;
            }
        }
        ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = (byte[]) arrayList2.get(i2);
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                obtain.recycle();
                arrayList.add(zzbe.CREATOR.createFromParcel(obtain));
            }
        }
        return new GeofencingEvent(intExtra, i, arrayList, (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    /* renamed from: b */
    public int mo54163b() {
        return this.f45816a;
    }

    @Geofence.GeofenceTransition
    /* renamed from: c */
    public int mo54164c() {
        return this.f45817b;
    }

    @NonNull
    /* renamed from: d */
    public List<Geofence> mo54165d() {
        return this.f45818c;
    }

    @NonNull
    /* renamed from: e */
    public Location mo54166e() {
        return this.f45819d;
    }

    /* renamed from: f */
    public boolean mo54167f() {
        return this.f45816a != -1;
    }
}
