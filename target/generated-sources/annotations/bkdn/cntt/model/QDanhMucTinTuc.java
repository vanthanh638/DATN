package bkdn.cntt.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDanhMucTinTuc is a Querydsl query type for DanhMucTinTuc
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDanhMucTinTuc extends EntityPathBase<DanhMucTinTuc> {

    private static final long serialVersionUID = 1824851872L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QDanhMucTinTuc danhMucTinTuc = new QDanhMucTinTuc("danhMucTinTuc");

    public final bkdn.cntt.core.QAsset _super;

    //inherited
    public final BooleanPath daXoa;

    //inherited
    public final NumberPath<Long> id;

    public final ListPath<TinTuc, QTinTuc> listTinTuc = this.<TinTuc, QTinTuc>createList("listTinTuc", TinTuc.class, QTinTuc.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.util.Date> ngaySua;

    //inherited
    public final DateTimePath<java.util.Date> ngayTao;

    // inherited
    public final QNhanVien nguoiSua;

    // inherited
    public final QNhanVien nguoiTao;

    //inherited
    public final DateTimePath<java.util.Date> publishBeginTime;

    //inherited
    public final DateTimePath<java.util.Date> publishEndTime;

    //inherited
    public final BooleanPath publishStatus;

    public final StringPath tenDanhMuc = createString("tenDanhMuc");

    //inherited
    public final StringPath trangThai;

    public QDanhMucTinTuc(String variable) {
        this(DanhMucTinTuc.class, forVariable(variable), INITS);
    }

    public QDanhMucTinTuc(Path<? extends DanhMucTinTuc> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDanhMucTinTuc(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDanhMucTinTuc(PathMetadata metadata, PathInits inits) {
        this(DanhMucTinTuc.class, metadata, inits);
    }

    public QDanhMucTinTuc(Class<? extends DanhMucTinTuc> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new bkdn.cntt.core.QAsset(type, metadata, inits);
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

