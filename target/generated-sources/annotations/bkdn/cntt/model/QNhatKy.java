package bkdn.cntt.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNhatKy is a Querydsl query type for NhatKy
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNhatKy extends EntityPathBase<NhatKy> {

    private static final long serialVersionUID = -1703598456L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QNhatKy nhatKy = new QNhatKy("nhatKy");

    public final bkdn.cntt.core.QAsset _super;

    //inherited
    public final BooleanPath daXoa;

    public final NumberPath<Long> doiTuongId = createNumber("doiTuongId", Long.class);

    public final StringPath hanhDong = createString("hanhDong");

    //inherited
    public final NumberPath<Long> id;

    public final StringPath loaiDoiTuong = createString("loaiDoiTuong");

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

    //inherited
    public final StringPath trangThai;

    public QNhatKy(String variable) {
        this(NhatKy.class, forVariable(variable), INITS);
    }

    public QNhatKy(Path<? extends NhatKy> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QNhatKy(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QNhatKy(PathMetadata metadata, PathInits inits) {
        this(NhatKy.class, metadata, inits);
    }

    public QNhatKy(Class<? extends NhatKy> type, PathMetadata metadata, PathInits inits) {
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

