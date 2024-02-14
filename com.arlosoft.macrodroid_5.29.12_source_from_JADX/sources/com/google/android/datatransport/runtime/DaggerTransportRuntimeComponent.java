package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.TransportRuntimeComponent;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import java.util.concurrent.Executor;
import p287ia.C12478a;

final class DaggerTransportRuntimeComponent extends TransportRuntimeComponent {

    /* renamed from: A */
    private C12478a<DefaultScheduler> f1340A;

    /* renamed from: B */
    private C12478a<Uploader> f1341B;

    /* renamed from: C */
    private C12478a<WorkInitializer> f1342C;

    /* renamed from: D */
    private C12478a<TransportRuntime> f1343D;

    /* renamed from: a */
    private C12478a<Executor> f1344a;

    /* renamed from: c */
    private C12478a<Context> f1345c;

    /* renamed from: d */
    private C12478a f1346d;

    /* renamed from: f */
    private C12478a f1347f;

    /* renamed from: g */
    private C12478a f1348g;

    /* renamed from: o */
    private C12478a<String> f1349o;

    /* renamed from: p */
    private C12478a<SQLiteEventStore> f1350p;

    /* renamed from: s */
    private C12478a<SchedulerConfig> f1351s;

    /* renamed from: z */
    private C12478a<WorkScheduler> f1352z;

    private static final class Builder implements TransportRuntimeComponent.Builder {

        /* renamed from: a */
        private Context f1353a;

        private Builder() {
        }

        /* renamed from: b */
        public Builder mo19437a(Context context) {
            this.f1353a = (Context) Preconditions.m1336b(context);
            return this;
        }

        public TransportRuntimeComponent build() {
            Preconditions.m1335a(this.f1353a, Context.class);
            return new DaggerTransportRuntimeComponent(this.f1353a);
        }
    }

    /* renamed from: e */
    public static TransportRuntimeComponent.Builder m1199e() {
        return new Builder();
    }

    /* renamed from: f */
    private void m1200f(Context context) {
        this.f1344a = DoubleCheck.m1330b(ExecutionModule_ExecutorFactory.m1232a());
        Factory a = InstanceFactory.m1332a(context);
        this.f1345c = a;
        CreationContextFactory_Factory a2 = CreationContextFactory_Factory.m1313a(a, TimeModule_EventClockFactory.m1660a(), TimeModule_UptimeClockFactory.m1664a());
        this.f1346d = a2;
        this.f1347f = DoubleCheck.m1330b(MetadataBackendRegistry_Factory.m1320a(this.f1345c, a2));
        this.f1348g = SchemaManager_Factory.m1645a(this.f1345c, EventStoreModule_DbNameFactory.m1524a(), EventStoreModule_SchemaVersionFactory.m1531a());
        this.f1349o = DoubleCheck.m1330b(EventStoreModule_PackageNameFactory.m1528a(this.f1345c));
        this.f1350p = DoubleCheck.m1330b(SQLiteEventStore_Factory.m1628a(TimeModule_EventClockFactory.m1660a(), TimeModule_UptimeClockFactory.m1664a(), EventStoreModule_StoreConfigFactory.m1535a(), this.f1348g, this.f1349o));
        SchedulingConfigModule_ConfigFactory b = SchedulingConfigModule_ConfigFactory.m1400b(TimeModule_EventClockFactory.m1660a());
        this.f1351s = b;
        SchedulingModule_WorkSchedulerFactory a3 = SchedulingModule_WorkSchedulerFactory.m1403a(this.f1345c, this.f1350p, b, TimeModule_UptimeClockFactory.m1664a());
        this.f1352z = a3;
        C12478a<Executor> aVar = this.f1344a;
        C12478a aVar2 = this.f1347f;
        C12478a<SQLiteEventStore> aVar3 = this.f1350p;
        this.f1340A = DefaultScheduler_Factory.m1394a(aVar, aVar2, a3, aVar3, aVar3);
        C12478a<Context> aVar4 = this.f1345c;
        C12478a aVar5 = this.f1347f;
        C12478a<SQLiteEventStore> aVar6 = this.f1350p;
        this.f1341B = Uploader_Factory.m1469a(aVar4, aVar5, aVar6, this.f1352z, this.f1344a, aVar6, TimeModule_EventClockFactory.m1660a(), TimeModule_UptimeClockFactory.m1664a(), this.f1350p);
        C12478a<Executor> aVar7 = this.f1344a;
        C12478a<SQLiteEventStore> aVar8 = this.f1350p;
        this.f1342C = WorkInitializer_Factory.m1477a(aVar7, aVar8, this.f1352z, aVar8);
        this.f1343D = DoubleCheck.m1330b(TransportRuntime_Factory.m1280a(TimeModule_EventClockFactory.m1660a(), TimeModule_UptimeClockFactory.m1664a(), this.f1340A, this.f1341B, this.f1342C));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public EventStore mo19435b() {
        return this.f1350p.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public TransportRuntime mo19436c() {
        return this.f1343D.get();
    }

    private DaggerTransportRuntimeComponent(Context context) {
        m1200f(context);
    }
}
