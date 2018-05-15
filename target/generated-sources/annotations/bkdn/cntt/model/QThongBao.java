package bkdn.cntt.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QThongBao is a Querydsl query type for ThongBao
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QThongBao extends EntityPathBase<ThongBao> {

    private static final long serialVersionUID = 1487402377L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QThongBao thongBao = new QThongBao("thongBao");

    public final bkdn.cntt.core.QAsset _super;

    //inherited
    public final BooleanPath daXoa;

    //inherited
    public final NumberPath<Long> id;

    public final EnumPath<bkdn.cntt.enums.LoaiThongBao> loaiThongBao = createEnum("loaiThongBao", bkdn.cntt.enums.LoaiThongBao.class);

    //inherited
    public final DateTimePath<java.util.Date> ngaySua;

    //inherited
    public final DateTimePath<java.util.Date> ngayTao;

    public final QNhanVien nguoiNhan;

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

    //inherited
    public final StringPath trangThai;

    public QThongBao(String variable) {
        this(ThongBao.class, forVariable(variable), INITS);
    }

    public QThongBao(Path<? extends ThongBao> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QThongBao(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QThongBao(PathMetadata metadata, PathInits inits) {
        this(ThongBao.class, metadata, inits);
    }

    public QThongBao(Class<? extends ThongBao> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new bkdn.cntt.core.QAsset(type, metadata, inits);
        this.daXoa = _super.daXoa;
        this.id = _super.id;
        this.ngaySua = _super.ngaySua;
        this.ngayTao = _super.ngayTao;
        this.nguoiNhan = inits.isInitialized("nguoiNhan") ? new QNhanVien(forProperty("nguoiNhan"), inits.get("nguoiNhan")) : null;
        this.nguoiSua = _super.nguoiSua;
        this.nguoiTao = _super.nguoiTao;
        this.publishBeginTime = _super.publishBeginTime;
        this.publishEndTime = _super.publishEndTime;
        this.publishStatus = _super.publishStatus;
        this.trangThai = _super.trangThai;
    }

}

