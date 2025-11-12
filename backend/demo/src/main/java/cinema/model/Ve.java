package cinema.model;
import java.math.BigDecimal;

public class Ve {
    private int id;
    private String MaVe;
    private int SuatChieuId;
    private int GheId;
    private BigDecimal GiaVe;
    private String UuDai;
    private int HoaDonID;

    public Ve() {}

    public Ve(int id, String MaVe, int SuatChieuId,  int GheId, BigDecimal GiaVe, String UuDai, int HoaDonID) {
        this.id = id;
        this.MaVe = MaVe;
        this.SuatChieuId = SuatChieuId;
        this.GheId = GheId;
        this.GiaVe = GiaVe;
        this.UuDai = UuDai;
        this.HoaDonID = HoaDonID;
    }
    
}
