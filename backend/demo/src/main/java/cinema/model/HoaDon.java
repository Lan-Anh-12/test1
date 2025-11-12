package cinema.model;
import java.math.BigDecimal;
import java.time.LocalDateTime;


public class HoaDon {
    private int id;
    private String MaHD;
    private LocalDateTime NgayLap;
    private BigDecimal TongTien;
    private int IdNV;
    private int IdKH;

    public HoaDon() {}
    
    public HoaDon(int id ,String MaHD, LocalDateTime NgayLap, BigDecimal TongTien, int IdNV, int IdKH) {
        this.id = id;
        this.MaHD = MaHD;
        this.NgayLap = NgayLap;
        this.TongTien = TongTien;
        this.IdNV = IdNV;
        this.IdKH = IdKH;
    }
}
