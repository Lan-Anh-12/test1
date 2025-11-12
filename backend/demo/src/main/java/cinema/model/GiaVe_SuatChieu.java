package cinema.model;
import java.math.BigDecimal;

public class GiaVe_SuatChieu {
    private int IdSC;
    private int IdGhe;
    private BigDecimal GiaVe;

    public GiaVe_SuatChieu() {}
    
    public GiaVe_SuatChieu(int IdSC, int IdGhe, BigDecimal GiaVe) {
        this.IdSC = IdSC;
        this.IdGhe = IdGhe;
        this.GiaVe = GiaVe;
    }
}
