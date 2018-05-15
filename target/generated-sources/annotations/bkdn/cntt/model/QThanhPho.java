package bkdn.cntt.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QThanhPho is a Querydsl query type for ThanhPho
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QThanhPho extends EntityPathBase<ThanhPho> {

    private static final long serialVersionUID = 1086637725L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QThanhPho thanhPho = new QThanhPho("thanhPho");

    public final bkdn.cntt.core.QAsset _super;

    //inherited
    public final BooleanPath daXoa;

    //inherited
    public final NumberPath<Long> id;

    public final ListPath<BaiDang, QBaiDang> listBaiDang = this.<BaiDang, QBaiDang>createList("listBaiDang", BaiDang.class, QBaiDang.class, PathInits.DIRECT2);

    public final ListPath<ChiTietChuongTrinh, QChiTietChuongTrinh> listChiTiet = this.<ChiTietChuongTrinh, QChiTietChuongTrinh>createList("listChiTiet", ChiTietChuongTrinh.class, QChiTietChuongTrinh.class, PathInits.DIRECT2);

    public final ListPath<QuanHuyen, QQuanHuyen> listQuanHuyen = this.<QuanHuyen, QQuanHuyen>createList("listQuanHuyen", QuanHuyen.class, QQuanHuyen.class, PathInits.DIRECT2);

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

    public final StringPath tenThanhPho = createString("tenThanhPho");

    //inherited
    public final StringPath trangThai;

    public QThanhPho(String variable) {
        this(ThanhPho.class, forVariable(variable), INITS);
    }

    public QThanhPho(Path<? extends ThanhPho> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QThanhPho(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QThanhPho(PathMetadata metadata, PathInits inits) {
        this(ThanhPho.class, metadata, inits);
    }

    public QThanhPho(Class<? extends ThanhPho> type, PathMetadata metadata, PathInits inits) {
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

