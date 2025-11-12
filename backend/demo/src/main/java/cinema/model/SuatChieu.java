package cinema.model;
import java.sql.Time;
import java.sql.Date;
import java.math.BigDecimal;

public class SuatChieu {
    private int id;
    private String MaSuatChieu;
    private Date NgayChieu;
    private Time GioBd;
    private Time GioKt;
    private BigDecimal GiaVeMD;
    private int PhimID;
    private int PhongchieuID;

    public SuatChieu() {}
    public SuatChieu(int id, String MaSuatChieu, Date NgayChieu, Time GioBd, Time GioKt, BigDecimal GiaVeMD, int PhimID, int PhongchieuID) {
        this.id = id;
        this.MaSuatChieu = MaSuatChieu;
        this.NgayChieu = NgayChieu;
        this.GioBd = GioBd;
        this.GioKt = GioKt;
        this.GiaVeMD = GiaVeMD;
        this.PhimID = PhimID;
        this.PhongchieuID = PhongchieuID;
    }
}
