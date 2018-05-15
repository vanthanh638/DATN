package bkdn.cntt.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBaiDang is a Querydsl query type for BaiDang
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBaiDang extends EntityPathBase<BaiDang> {

    private static final long serialVersionUID = 768488179L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QBaiDang baiDang = new QBaiDang("baiDang");

    public final bkdn.cntt.core.QAsset _super;

    public final BooleanPath active = createBoolean("active");

    //inherited
    public final BooleanPath daXoa;

    public final BooleanPath flagLoad = createBoolean("flagLoad");

    public final StringPath iconName = createString("iconName");

    public final StringPath iconUrl = createString("iconUrl");

    //inherited
    public final NumberPath<Long> id;

    public final SimplePath<org.zkoss.image.Image> imageContent = createSimple("imageContent", org.zkoss.image.Image.class);

    public final ListPath<BinhLuan, QBinhLuan> listBinhLuan = this.<BinhLuan, QBinhLuan>createList("listBinhLuan", BinhLuan.class, QBinhLuan.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.util.Date> ngaySua;

    //inherited
    public final DateTimePath<java.util.Date> ngayTao;

    // inherited
    public final QNhanVien nguoiSua;

    // inherited
    public final QNhanVien nguoiTao;

    public final QNhomMau nhomMau;

    public final ListPath<NhomMau, QNhomMau> nhomMaus = this.<NhomMau, QNhomMau>createList("nhomMaus", NhomMau.class, QNhomMau.class, PathInits.DIRECT2);

    public final StringPath noiDung = createString("noiDung");

    //inherited
    public final DateTimePath<java.util.Date> publishBeginTime;

    //inherited
    public final DateTimePath<java.util.Date> publishEndTime;

    //inherited
    public final BooleanPath publishStatus;

    public final QThanhPho thanhPho;

    public final StringPath tieuDe = createString("tieuDe");

    //inherited
    public final StringPath trangThai;

    public final StringPath wd = createString("wd");

    public QBaiDang(String variable) {
        this(BaiDang.class, forVariable(variable), INITS);
    }

    public QBaiDang(Path<? extends BaiDang> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBaiDang(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBaiDang(PathMetadata metadata, PathInits inits) {
        this(BaiDang.class, metadata, inits);
    }

    public QBaiDang(Class<? extends BaiDang> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new bkdn.cntt.core.QAsset(type, metadata, inits);
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
        this.thanhPho = inits.isInitialized("thanhPho") ? new QThanhPho(forProperty("thanhPho"), inits.get("thanhPho")) : null;
        this.trangThai = _super.trangThai;
    }

}

