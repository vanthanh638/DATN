package bkdn.cntt.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTinTuc is a Querydsl query type for TinTuc
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTinTuc extends EntityPathBase<TinTuc> {

    private static final long serialVersionUID = -1530542218L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QTinTuc tinTuc = new QTinTuc("tinTuc");

    public final bkdn.cntt.core.QAsset _super;

    public final QDanhMucTinTuc danhMuc;

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

    public final StringPath noiDung = createString("noiDung");

    //inherited
    public final DateTimePath<java.util.Date> publishBeginTime;

    //inherited
    public final DateTimePath<java.util.Date> publishEndTime;

    //inherited
    public final BooleanPath publishStatus;

    public final StringPath tieuDe = createString("tieuDe");

    //inherited
    public final StringPath trangThai;

    public final StringPath urlBrowseImage = createString("urlBrowseImage");

    public QTinTuc(String variable) {
        this(TinTuc.class, forVariable(variable), INITS);
    }

    public QTinTuc(Path<? extends TinTuc> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTinTuc(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTinTuc(PathMetadata metadata, PathInits inits) {
        this(TinTuc.class, metadata, inits);
    }

    public QTinTuc(Class<? extends TinTuc> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new bkdn.cntt.core.QAsset(type, metadata, inits);
        this.danhMuc = inits.isInitialized("danhMuc") ? new QDanhMucTinTuc(forProperty("danhMuc"), inits.get("danhMuc")) : null;
        this.daXoa = _super.daXoa;
        this.id = _super.id;
        this.ngaySua = _super.ngaySua;
        this.ngayTao = _super.ngayTao;
        this.nguoiSua = _super.nguoiSua;
        this.nguoiTao = _super.nguoiTao;
        this.publishBeginTime = _super.publishBeginTime;
        this.publishEndTime = _super.publishEndTime;
        this.publishStatus = _super.publishStatus;
        this.trangThai = _super.trangThai;
    }

}

