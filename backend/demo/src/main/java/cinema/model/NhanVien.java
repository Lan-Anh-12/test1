package cinema.model;

public class NhanVien {
    private int id;
    private String TenNV;
    private String ChucVu;
    private int RapID;
    private int UserId;

    public NhanVien() {}

    public NhanVien(int id, String TenNV, String ChucVu, int RapID, int UserId) {
        this.id = id;
        this.TenNV = TenNV;
        this.ChucVu = ChucVu;
        this.RapID = RapID;
        this.UserId = UserId;
       
    
}
}
