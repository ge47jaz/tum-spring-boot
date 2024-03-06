package tum.seba.persistence.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBackpack is a Querydsl query type for Backpack
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBackpack extends EntityPathBase<Backpack> {

    private static final long serialVersionUID = 1381598529L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBackpack backpack = new QBackpack("backpack");

    public final StringPath color = createString("color");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QStudent owner;

    public QBackpack(String variable) {
        this(Backpack.class, forVariable(variable), INITS);
    }

    public QBackpack(Path<? extends Backpack> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBackpack(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBackpack(PathMetadata metadata, PathInits inits) {
        this(Backpack.class, metadata, inits);
    }

    public QBackpack(Class<? extends Backpack> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.owner = inits.isInitialized("owner") ? new QStudent(forProperty("owner"), inits.get("owner")) : null;
    }

}

