package cinema.model;
import java.math.BigDecimal;

public class DoAn {
    private int id;
    private String MaDA;
    private String TenDA;
    private String Size;
    private BigDecimal Gia;

    public DoAn() {}
    public DoAn(int id ,String MaDA, String TenDA, String Size, BigDecimal Gia) {
        this.id = id;
        this.MaDA = MaDA;
        this.TenDA = TenDA;
        this.Size = Size;
        this.Gia = Gia;
    }
   

}
