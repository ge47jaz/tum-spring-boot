package tum.seba.persistence.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDevice is a Querydsl query type for Device
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDevice extends EntityPathBase<Device> {

    private static final long serialVersionUID = -1081179049L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDevice device = new QDevice("device");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QStudent owner;

    public final StringPath type = createString("type");

    public QDevice(String variable) {
        this(Device.class, forVariable(variable), INITS);
    }

    public QDevice(Path<? extends Device> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDevice(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDevice(PathMetadata metadata, PathInits inits) {
        this(Device.class, metadata, inits);
    }

    public QDevice(Class<? extends Device> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.owner = inits.isInitialized("owner") ? new QStudent(forProperty("owner"), inits.get("owner")) : null;
    }

}

