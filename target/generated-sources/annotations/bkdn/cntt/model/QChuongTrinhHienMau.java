package bkdn.cntt.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChuongTrinhHienMau is a Querydsl query type for ChuongTrinhHienMau
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChuongTrinhHienMau extends EntityPathBase<ChuongTrinhHienMau> {

    private static final long serialVersionUID = -867276713L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QChuongTrinhHienMau chuongTrinhHienMau = new QChuongTrinhHienMau("chuongTrinhHienMau");

    public final bkdn.cntt.core.QAsset _super;

    public final ListPath<DangKy, QDangKy> dangKys = this.<DangKy, QDangKy>createList("dangKys", DangKy.class, QDangKy.class, PathInits.DIRECT2);

    //inherited
    public final BooleanPath daXoa;

    //inherited
    public final NumberPath<Long> id;

    public final StringPath moTa = createString("moTa");

    public final DatePath<java.util.Date> ngayBatDau = createDate("ngayBatDau", java.util.Date.class);

    public final DatePath<java.util.Date> ngayKetThuc = createDate("ngayKetThuc", java.util.Date.class);

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

    public final StringPath tenChuongTrinh = createString("tenChuongTrinh");

    //inherited
    public final StringPath trangThai;

    public QChuongTrinhHienMau(String variable) {
        this(ChuongTrinhHienMau.class, forVariable(variable), INITS);
    }

    public QChuongTrinhHienMau(Path<? extends ChuongTrinhHienMau> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QChuongTrinhHienMau(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QChuongTrinhHienMau(PathMetadata metadata, PathInits inits) {
        this(ChuongTrinhHienMau.class, metadata, inits);
    }

    public QChuongTrinhHienMau(Class<? extends ChuongTrinhHienMau> type, PathMetadata metadata, PathInits inits) {
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

