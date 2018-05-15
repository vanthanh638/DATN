package bkdn.cntt.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNhanVien is a Querydsl query type for NhanVien
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNhanVien extends EntityPathBase<NhanVien> {

    private static final long serialVersionUID = -780802000L;

    private static final PathInits INITS = new PathInits("*", "nguoiSua.*.*.*.*", "nguoiTao.*.*.*.*");

    public static final QNhanVien nhanVien = new QNhanVien("nhanVien");

    public final bkdn.cntt.core.QModel _super;

    public final BooleanPath checkKichHoat = createBoolean("checkKichHoat");

    public final StringPath chucVu = createString("chucVu");

    //inherited
    public final BooleanPath daXoa;

    public final StringPath diaChi = createString("diaChi");

    public final StringPath email = createString("email");

    public final StringPath emailCoQuan = createString("emailCoQuan");

    public final BooleanPath flagChange = createBoolean("flagChange");

    public final StringPath gioiTinh = createString("gioiTinh");

    public final StringPath hoVaTen = createString("hoVaTen");

    public final StringPath iconName = createString("iconName");

    public final StringPath iconUrl = createString("iconUrl");

    //inherited
    public final NumberPath<Long> id;

    public final SimplePath<org.zkoss.image.Image> imageContent = createSimple("imageContent", org.zkoss.image.Image.class);

    public final ListPath<BaiDang, QBaiDang> listBaiDang = this.<BaiDang, QBaiDang>createList("listBaiDang", BaiDang.class, QBaiDang.class, PathInits.DIRECT2);

    public final ListPath<BinhLuan, QBinhLuan> listBinhLuan = this.<BinhLuan, QBinhLuan>createList("listBinhLuan", BinhLuan.class, QBinhLuan.class, PathInits.DIRECT2);

    public final ListPath<DangKy, QDangKy> listDangKy = this.<DangKy, QDangKy>createList("listDangKy", DangKy.class, QDangKy.class, PathInits.DIRECT2);

    public final ListPath<DeNghi, QDeNghi> listDeNghiGui = this.<DeNghi, QDeNghi>createList("listDeNghiGui", DeNghi.class, QDeNghi.class, PathInits.DIRECT2);

    public final ListPath<DeNghi, QDeNghi> listDeNghiNhan = this.<DeNghi, QDeNghi>createList("listDeNghiNhan", DeNghi.class, QDeNghi.class, PathInits.DIRECT2);

    public final ListPath<NhatKy, QNhatKy> listNhatKy = this.<NhatKy, QNhatKy>createList("listNhatKy", NhatKy.class, QNhatKy.class, PathInits.DIRECT2);

    public final ListPath<ThongBao, QThongBao> listThongBao = this.<ThongBao, QThongBao>createList("listThongBao", ThongBao.class, QThongBao.class, PathInits.DIRECT2);

    public final StringPath matKhau = createString("matKhau");

    public final StringPath matKhau2 = createString("matKhau2");

    public final DateTimePath<java.util.Date> ngaySinh = createDateTime("ngaySinh", java.util.Date.class);

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
    public final BooleanPath publishStatus;

    public final SimplePath<Quyen> quyen = createSimple("quyen", Quyen.class);

    public final SetPath<String, StringPath> quyens = this.<String, StringPath>createSet("quyens", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath salkey = createString("salkey");

    public final StringPath soDienThoai = createString("soDienThoai");

    public final NumberPath<Integer> soThuTu = createNumber("soThuTu", Integer.class);

    public final SetPath<String, StringPath> tatCaQuyens = this.<String, StringPath>createSet("tatCaQuyens", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath tenCoQuan = createString("tenCoQuan");

    public final StringPath tenDangNhap = createString("tenDangNhap");

    //inherited
    public final StringPath trangThai;

    public final SetPath<VaiTro, QVaiTro> vaiTros = this.<VaiTro, QVaiTro>createSet("vaiTros", VaiTro.class, QVaiTro.class, PathInits.DIRECT2);

    public QNhanVien(String variable) {
        this(NhanVien.class, forVariable(variable), INITS);
    }

    public QNhanVien(Path<? extends NhanVien> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QNhanVien(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QNhanVien(PathMetadata metadata, PathInits inits) {
        this(NhanVien.class, metadata, inits);
    }

    public QNhanVien(Class<? extends NhanVien> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new bkdn.cntt.core.QModel(type, metadata, inits);
        this.daXoa = _super.daXoa;
        this.id = _super.id;
        this.ngaySua = _super.ngaySua;
        this.ngayTao = _super.ngayTao;
        this.nguoiSua = _super.nguoiSua;
        this.nguoiTao = _super.nguoiTao;
        this.nhomMau = inits.isInitialized("nhomMau") ? new QNhomMau(forProperty("nhomMau"), inits.get("nhomMau")) : null;
        this.publishStatus = _super.publishStatus;
        this.trangThai = _super.trangThai;
    }

}

