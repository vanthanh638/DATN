package bkdn.cntt.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDeNghi is a Querydsl query type for DeNghi
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDeNghi extends EntityPathBase<DeNghi> {

    private static final long serialVersionUID = -1993238168L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QDeNghi deNghi = new QDeNghi("deNghi");

    public final bkdn.cntt.core.QAsset _super;

    //inherited
    public final BooleanPath daXoa;

    //inherited
    public final NumberPath<Long> id;

    public final QLoaiMau loaiMau;

    //inherited
    public final DateTimePath<java.util.Date> ngaySua;

    //inherited
    public final DateTimePath<java.util.Date> ngayTao;

    public final QNhanVien nguoiGui;

    public final QNhanVien nguoiNhan;

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

    //inherited
    public final StringPath trangThai;

    public final StringPath trangThaiDeNghi = createString("trangThaiDeNghi");

    public QDeNghi(String variable) {
        this(DeNghi.class, forVariable(variable), INITS);
    }

    public QDeNghi(Path<? extends DeNghi> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDeNghi(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDeNghi(PathMetadata metadata, PathInits inits) {
        this(DeNghi.class, metadata, inits);
    }

    public QDeNghi(Class<? extends DeNghi> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new bkdn.cntt.core.QAsset(type, metadata, inits);
        this.daXoa = _super.daXoa;
        this.id = _super.id;
        this.loaiMau = inits.isInitialized("loaiMau") ? new QLoaiMau(forProperty("loaiMau"), inits.get("loaiMau")) : null;
        this.ngaySua = _super.ngaySua;
        this.ngayTao = _super.ngayTao;
        this.nguoiGui = inits.isInitialized("nguoiGui") ? new QNhanVien(forProperty("nguoiGui"), inits.get("nguoiGui")) : null;
        this.nguoiNhan = inits.isInitialized("nguoiNhan") ? new QNhanVien(forProperty("nguoiNhan"), inits.get("nguoiNhan")) : null;
        this.nguoiSua = _super.nguoiSua;
        this.nguoiTao = _super.nguoiTao;
        this.nhomMau = inits.isInitialized("nhomMau") ? new QNhomMau(forProperty("nhomMau"), inits.get("nhomMau")) : null;
        this.publishBeginTime = _super.publishBeginTime;
        this.publishEndTime = _super.publishEndTime;
        this.publishStatus = _super.publishStatus;
        this.trangThai = _super.trangThai;
    }

}

