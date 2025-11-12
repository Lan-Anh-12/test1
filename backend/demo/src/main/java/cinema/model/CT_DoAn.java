package cinema.model;

import java.math.BigDecimal;

public class CT_DoAn {
    private int MaHD;
    private int MaDoAn;
    private int SoLuong;
    private String UuDai;
    private BigDecimal ThanhTien;

    public CT_DoAn() {}
    
    public CT_DoAn(int MaHD, int MaDoAn, int SoLuong, String UuDai, BigDecimal ThanhTien) {
        this.MaHD = MaHD;
        this.MaDoAn = MaDoAn;
        this.SoLuong = SoLuong;
        this.UuDai = UuDai;
        this.ThanhTien = ThanhTien;
    }

}
