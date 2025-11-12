package cinema.model;

public class KhachHang {
    private int id;
    private String MaKH;
    private String TenKH;
    private String SDT;
    private int UserId;

    public KhachHang() {}

    public KhachHang(int id, String MaKH, String TenKH, String SDT, int UserId) {
        this.id = id;
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.SDT = SDT;
        this.UserId = UserId;
    }
}
