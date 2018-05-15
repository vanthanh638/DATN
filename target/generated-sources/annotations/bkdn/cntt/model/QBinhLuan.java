package bkdn.cntt.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBinhLuan is a Querydsl query type for BinhLuan
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBinhLuan extends EntityPathBase<BinhLuan> {

    private static final long serialVersionUID = 1034165476L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QBinhLuan binhLuan = new QBinhLuan("binhLuan");

    public final bkdn.cntt.core.QAsset _super;

    public final QBaiDang baiDang;

    //inherited
    public final BooleanPath daXoa;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final DateTimePath<java.util.Date> ngaySua;

    //inherited
    public final DateTimePath<java.util.Date> ngayTao;

    public final QNhanVien nguoiDung;

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

    public QBinhLuan(String variable) {
        this(BinhLuan.class, forVariable(variable), INITS);
    }

    public QBinhLuan(Path<? extends BinhLuan> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBinhLuan(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBinhLuan(PathMetadata metadata, PathInits inits) {
        this(BinhLuan.class, metadata, inits);
    }

    public QBinhLuan(Class<? extends BinhLuan> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new bkdn.cntt.core.QAsset(type, metadata, inits);
        this.baiDang = inits.isInitialized("baiDang") ? new QBaiDang(forProperty("baiDang"), inits.get("baiDang")) : null;
        this.daXoa = _super.daXoa;
        this.id = _super.id;
        this.ngaySua = _super.ngaySua;
        this.ngayTao = _super.ngayTao;
        this.nguoiDung = inits.isInitialized("nguoiDung") ? new QNhanVien(forProperty("nguoiDung"), inits.get("nguoiDung")) : null;
        this.nguoiSua = _super.nguoiSua;
        this.nguoiTao = _super.nguoiTao;
        this.publishBeginTime = _super.publishBeginTime;
        this.publishEndTime = _super.publishEndTime;
        this.publishStatus = _super.publishStatus;
        this.trangThai = _super.trangThai;
    }

}

