package bkdn.cntt.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QKhoMau is a Querydsl query type for KhoMau
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QKhoMau extends EntityPathBase<KhoMau> {

    private static final long serialVersionUID = -1789105636L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QKhoMau khoMau = new QKhoMau("khoMau");

    public final bkdn.cntt.core.QAsset _super;

    //inherited
    public final BooleanPath daXoa;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final DateTimePath<java.util.Date> ngaySua;

    //inherited
    public final DateTimePath<java.util.Date> ngayTao;

    // inherited
    public final QNhanVien nguoiSua;

    // inherited
    public final QNhanVien nguoiTao;

    public final QNhomMau nhomMau;

    //inherited
    public final DateTimePath<java.util.Date> publishBeginTime;

    //inherited
    public final DateTimePath<java.util.Date> publishEndTime;

    //inherited
    public final BooleanPath publishStatus;

    public final NumberPath<Float> theTich = createNumber("theTich", Float.class);

    //inherited
    public final StringPath trangThai;

    public QKhoMau(String variable) {
        this(KhoMau.class, forVariable(variable), INITS);
    }

    public QKhoMau(Path<? extends KhoMau> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QKhoMau(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QKhoMau(PathMetadata metadata, PathInits inits) {
        this(KhoMau.class, metadata, inits);
    }

    public QKhoMau(Class<? extends KhoMau> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new bkdn.cntt.core.QAsset(type, metadata, inits);
        this.daXoa = _super.daXoa;
        this.id = _super.id;
        this.ngaySua = _super.ngaySua;
        this.ngayTao = _super.ngayTao;
        this.nguoiSua = _super.nguoiSua;
        this.nguoiTao = _super.nguoiTao;
        this.nhomMau = inits.isInitialized("nhomMau") ? new QNhomMau(forProperty("nhomMau"), inits.get("nhomMau")) : null;
        this.publishBeginTime = _super.publishBeginTime;
        this.publishEndTime = _super.publishEndTime;
        this.publishStatus = _super.publishStatus;
        this.trangThai = _super.trangThai;
    }

}

