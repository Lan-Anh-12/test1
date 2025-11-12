package cinema.authority;

import cinema.model.TaiKhoan;

public interface DaoAccount {
    TaiKhoan findByUsername(String username);
    boolean saveAccount(TaiKhoan account);
}
