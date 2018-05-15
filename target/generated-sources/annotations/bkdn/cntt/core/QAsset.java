package bkdn.cntt.core;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAsset is a Querydsl query type for Asset
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QAsset extends EntityPathBase<Asset<?>> {

    private static final long serialVersionUID = -269590519L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QAsset asset = new QAsset("asset");

    public final QModel _super;

    //inherited
    public final BooleanPath daXoa;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final DateTimePath<java.util.Date> ngaySua;

    //inherited
    public final DateTimePath<java.util.Date> ngayTao;

    // inherited
    public final bkdn.cntt.model.QNhanVien nguoiSua;

    // inherited
    public final bkdn.cntt.model.QNhanVien nguoiTao;

    public final DateTimePath<java.util.Date> publishBeginTime = createDateTime("publishBeginTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> publishEndTime = createDateTime("publishEndTime", java.util.Date.class);

    //inherited
    public final BooleanPath publishStatus;

    //inherited
    public final StringPath trangThai;

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QAsset(String variable) {
        this((Class) Asset.class, forVariable(variable), INITS);
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QAsset(Path<? extends Asset> path) {
        this((Class) path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAsset(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QAsset(PathMetadata metadata, PathInits inits) {
        this((Class) Asset.class, metadata, inits);
    }

    public QAsset(Class<? extends Asset<?>> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QModel(type, metadata, inits);
        this.daXoa = _super.daXoa;
        this.id = _super.id;
        this.ngaySua = _super.ngaySua;
        this.ngayTao = _super.ngayTao;
        this.nguoiSua = _super.nguoiSua;
        this.nguoiTao = _super.nguoiTao;
        this.publishStatus = _super.publishStatus;
        this.trangThai = _super.trangThai;
    }

}

