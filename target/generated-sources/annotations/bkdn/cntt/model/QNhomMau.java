package bkdn.cntt.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNhomMau is a Querydsl query type for NhomMau
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNhomMau extends EntityPathBase<NhomMau> {

    private static final long serialVersionUID = -1259222532L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QNhomMau nhomMau = new QNhomMau("nhomMau");

    public final bkdn.cntt.core.QAsset _super;

    public final ListPath<BaiDang, QBaiDang> baiDangs = this.<BaiDang, QBaiDang>createList("baiDangs", BaiDang.class, QBaiDang.class, PathInits.DIRECT2);

    public final ListPath<DangKy, QDangKy> dangKys = this.<DangKy, QDangKy>createList("dangKys", DangKy.class, QDangKy.class, PathInits.DIRECT2);

    //inherited
    public final BooleanPath daXoa;

    //inherited
    public final NumberPath<Long> id;

    public final ListPath<DeNghi, QDeNghi> listDeNghi = this.<DeNghi, QDeNghi>createList("listDeNghi", DeNghi.class, QDeNghi.class, PathInits.DIRECT2);

    public final ListPath<NhanVien, QNhanVien> listNhanVien = this.<NhanVien, QNhanVien>createList("listNhanVien", NhanVien.class, QNhanVien.class, PathInits.DIRECT2);

    public final QLoaiMau loaiMau;

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

    public final StringPath tenNhom = createString("tenNhom");

    //inherited
    public final StringPath trangThai;

    public QNhomMau(String variable) {
        this(NhomMau.class, forVariable(variable), INITS);
    }

    public QNhomMau(Path<? extends NhomMau> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QNhomMau(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QNhomMau(PathMetadata metadata, PathInits inits) {
        this(NhomMau.class, metadata, inits);
    }

    public QNhomMau(Class<? extends NhomMau> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new bkdn.cntt.core.QAsset(type, metadata, inits);
        this.daXoa = _super.daXoa;
        this.id = _super.id;
        this.loaiMau = inits.isInitialized("loaiMau") ? new QLoaiMau(forProperty("loaiMau"), inits.get("loaiMau")) : null;
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

