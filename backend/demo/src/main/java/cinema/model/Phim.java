package cinema.model;

public class Phim {
    private int id;
    private String MaPhim;
    private String TenPhim;
    private String TheLoai;
    private int ThoiLuong;
    private int NamSanXuat;
    private String MoTa;

    public Phim() {}

    public Phim(int id, String MaPhim, String TenPhim, String TheLoai, int ThoiLuong, int NamSanXuat, String MoTa) {
        this.id = id;
        this.MaPhim = MaPhim;
        this.TenPhim = TenPhim;
        this.TheLoai = TheLoai;
        this.ThoiLuong = ThoiLuong;
        this.NamSanXuat = NamSanXuat;
        this.MoTa = MoTa;
    }
}
