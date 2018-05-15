package bkdn.cntt.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQuanHuyen is a Querydsl query type for QuanHuyen
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QQuanHuyen extends EntityPathBase<QuanHuyen> {

    private static final long serialVersionUID = 1606690807L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QQuanHuyen quanHuyen = new QQuanHuyen("quanHuyen");

    public final bkdn.cntt.core.QAsset _super;

    //inherited
    public final BooleanPath daXoa;

    //inherited
    public final NumberPath<Long> id;

    public final ListPath<ChiTietChuongTrinh, QChiTietChuongTrinh> listChiTiet = this.<ChiTietChuongTrinh, QChiTietChuongTrinh>createList("listChiTiet", ChiTietChuongTrinh.class, QChiTietChuongTrinh.class, PathInits.DIRECT2);

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

    public final StringPath tenQuanHuyen = createString("tenQuanHuyen");

    public final QThanhPho thanhPho;

    //inherited
    public final StringPath trangThai;

    public QQuanHuyen(String variable) {
        this(QuanHuyen.class, forVariable(variable), INITS);
    }

    public QQuanHuyen(Path<? extends QuanHuyen> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QQuanHuyen(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QQuanHuyen(PathMetadata metadata, PathInits inits) {
        this(QuanHuyen.class, metadata, inits);
    }

    public QQuanHuyen(Class<? extends QuanHuyen> type, PathMetadata metadata, PathInits inits) {
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
        this.thanhPho = inits.isInitialized("thanhPho") ? new QThanhPho(forProperty("thanhPho"), inits.get("thanhPho")) : null;
        this.trangThai = _super.trangThai;
    }

}

