package bkdn.cntt.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChiTietChuongTrinh is a Querydsl query type for ChiTietChuongTrinh
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChiTietChuongTrinh extends EntityPathBase<ChiTietChuongTrinh> {

    private static final long serialVersionUID = -540785838L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QChiTietChuongTrinh chiTietChuongTrinh = new QChiTietChuongTrinh("chiTietChuongTrinh");

    public final bkdn.cntt.core.QAsset _super;

    public final QChuongTrinhHienMau chuongTrinh;

    //inherited
    public final BooleanPath daXoa;

    public final StringPath diaChi = createString("diaChi");

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

    //inherited
    public final DateTimePath<java.util.Date> publishBeginTime;

    //inherited
    public final DateTimePath<java.util.Date> publishEndTime;

    //inherited
    public final BooleanPath publishStatus;

    public final QQuanHuyen quanHuyen;

    public final QThanhPho thanhPho;

    //inherited
    public final StringPath trangThai;

    public QChiTietChuongTrinh(String variable) {
        this(ChiTietChuongTrinh.class, forVariable(variable), INITS);
    }

    public QChiTietChuongTrinh(Path<? extends ChiTietChuongTrinh> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QChiTietChuongTrinh(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QChiTietChuongTrinh(PathMetadata metadata, PathInits inits) {
        this(ChiTietChuongTrinh.class, metadata, inits);
    }

    public QChiTietChuongTrinh(Class<? extends ChiTietChuongTrinh> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new bkdn.cntt.core.QAsset(type, metadata, inits);
        this.chuongTrinh = inits.isInitialized("chuongTrinh") ? new QChuongTrinhHienMau(forProperty("chuongTrinh"), inits.get("chuongTrinh")) : null;
        this.daXoa = _super.daXoa;
        this.id = _super.id;
        this.ngaySua = _super.ngaySua;
        this.ngayTao = _super.ngayTao;
        this.nguoiSua = _super.nguoiSua;
        this.nguoiTao = _super.nguoiTao;
        this.publishBeginTime = _super.publishBeginTime;
        this.publishEndTime = _super.publishEndTime;
        this.publishStatus = _super.publishStatus;
        this.quanHuyen = inits.isInitialized("quanHuyen") ? new QQuanHuyen(forProperty("quanHuyen"), inits.get("quanHuyen")) : null;
        this.thanhPho = inits.isInitialized("thanhPho") ? new QThanhPho(forProperty("thanhPho"), inits.get("thanhPho")) : null;
        this.trangThai = _super.trangThai;
    }

}

