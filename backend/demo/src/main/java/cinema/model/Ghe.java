package cinema.model;

public class Ghe {
    private int id;
    private String MaGhe;
    private int SoGhe;
    private String LoaiGhe;
    private int MaPh;

    public Ghe() {}

    public Ghe(int id ,String MaGhe, int SoGhe, String LoaiGhe, int MaPh) {
        this.id = id;
        this.MaGhe = MaGhe;
        this.SoGhe = SoGhe;
        this.LoaiGhe = LoaiGhe;
        this.MaPh = MaPh;
    }

}
