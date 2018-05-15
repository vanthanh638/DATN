package bkdn.cntt.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDangKy is a Querydsl query type for DangKy
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDangKy extends EntityPathBase<DangKy> {

    private static final long serialVersionUID = -1995979823L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QDangKy dangKy = new QDangKy("dangKy");

    public final bkdn.cntt.core.QAsset _super;

    public final QChuongTrinhHienMau chuongTrinhHienMau;

    //inherited
    public final BooleanPath daXoa;

    public final StringPath email = createString("email");

    public final StringPath hoTen = createString("hoTen");

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

    public final StringPath soDienThoai = createString("soDienThoai");

    public final NumberPath<Integer> soLanHienTruoc = createNumber("soLanHienTruoc", Integer.class);

    public final NumberPath<Float> theTich = createNumber("theTich", Float.class);

    public final DatePath<java.util.Date> thoiGianSapHien = createDate("thoiGianSapHien", java.util.Date.class);

    public final DatePath<java.util.Date> thoiGianVuaHien = createDate("thoiGianVuaHien", java.util.Date.class);

    //inherited
    public final StringPath trangThai;

    public final StringPath trangThaiDangKy = createString("trangThaiDangKy");

    public QDangKy(String variable) {
        this(DangKy.class, forVariable(variable), INITS);
    }

    public QDangKy(Path<? extends DangKy> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDangKy(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDangKy(PathMetadata metadata, PathInits inits) {
        this(DangKy.class, metadata, inits);
    }

    public QDangKy(Class<? extends DangKy> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new bkdn.cntt.core.QAsset(type, metadata, inits);
        this.chuongTrinhHienMau = inits.isInitialized("chuongTrinhHienMau") ? new QChuongTrinhHienMau(forProperty("chuongTrinhHienMau"), inits.get("chuongTrinhHienMau")) : null;
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

