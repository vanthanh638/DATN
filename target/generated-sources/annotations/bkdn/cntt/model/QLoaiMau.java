package bkdn.cntt.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLoaiMau is a Querydsl query type for LoaiMau
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLoaiMau extends EntityPathBase<LoaiMau> {

    private static final long serialVersionUID = 1448093001L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QLoaiMau loaiMau = new QLoaiMau("loaiMau");

    public final bkdn.cntt.core.QAsset _super;

    //inherited
    public final BooleanPath daXoa;

    public final StringPath ghiChu = createString("ghiChu");

    //inherited
    public final NumberPath<Long> id;

    public final ListPath<DeNghi, QDeNghi> listDeNghi = this.<DeNghi, QDeNghi>createList("listDeNghi", DeNghi.class, QDeNghi.class, PathInits.DIRECT2);

    public final ListPath<NhomMau, QNhomMau> listNhomMau = this.<NhomMau, QNhomMau>createList("listNhomMau", NhomMau.class, QNhomMau.class, PathInits.DIRECT2);

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

    public final StringPath tenLoai = createString("tenLoai");

    //inherited
    public final StringPath trangThai;

    public QLoaiMau(String variable) {
        this(LoaiMau.class, forVariable(variable), INITS);
    }

    public QLoaiMau(Path<? extends LoaiMau> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLoaiMau(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLoaiMau(PathMetadata metadata, PathInits inits) {
        this(LoaiMau.class, metadata, inits);
    }

    public QLoaiMau(Class<? extends LoaiMau> type, PathMetadata metadata, PathInits inits) {
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

