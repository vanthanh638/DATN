package bkdn.cntt.core;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QModel is a Querydsl query type for Model
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QModel extends EntityPathBase<Model<?>> {

    private static final long serialVersionUID = -258641854L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QModel model = new QModel("model");

    public final BooleanPath daXoa = createBoolean("daXoa");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.util.Date> ngaySua = createDateTime("ngaySua", java.util.Date.class);

    public final DateTimePath<java.util.Date> ngayTao = createDateTime("ngayTao", java.util.Date.class);

    public final bkdn.cntt.model.QNhanVien nguoiSua;

    public final bkdn.cntt.model.QNhanVien nguoiTao;

    public final BooleanPath publishStatus = createBoolean("publishStatus");

    public final StringPath trangThai = createString("trangThai");

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QModel(String variable) {
        this((Class) Model.class, forVariable(variable), INITS);
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QModel(Path<? extends Model> path) {
        this((Class) path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QModel(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QModel(PathMetadata metadata, PathInits inits) {
        this((Class) Model.class, metadata, inits);
    }

    public QModel(Class<? extends Model<?>> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.nguoiSua = inits.isInitialized("nguoiSua") ? new bkdn.cntt.model.QNhanVien(forProperty("nguoiSua"), inits.get("nguoiSua")) : null;
        this.nguoiTao = inits.isInitialized("nguoiTao") ? new bkdn.cntt.model.QNhanVien(forProperty("nguoiTao"), inits.get("nguoiTao")) : null;
    }

}

