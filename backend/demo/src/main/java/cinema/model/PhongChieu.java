package cinema.model;

public class PhongChieu {
    private int Id;
    private String MaPh;
    private String TenPh;
    private int SoGhe;
    private String TrangThai;
    private int IdRap;

    public PhongChieu() {}
    public PhongChieu(int Id, String MaPh,String TenPh, int TSoGhe, String TrangThai, int IdRap) {
        this.Id = Id;
        this.MaPh = MaPh;
        this.TenPh = TenPh;
        this.SoGhe = SoGhe;
        this.TrangThai = TrangThai;
        this.IdRap = IdRap;
    }
}
