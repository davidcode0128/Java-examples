package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author User
 */
public class AccountDao {

    private Account account = new Account();
    private LinkedList<Account> accountList = new LinkedList<Account>();
    private Connection conn;
    private ResultSet rs = null;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public LinkedList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(LinkedList<Account> accountList) {
        this.accountList = accountList;
    }

    /**
     * 目的:新增帳號
     *
     * @return true:新增成功，false:新增失敗
     */
    public boolean addAccount() {

        boolean flag = false;  //判斷是否成功
        String sql = new String("INSERT account (account, passWord, name, phone, address, email)"
                + " VALUES (\"" + account.getAccount() + "\", \"" + account.getPassWord() + "\", \""
                + account.getName() + "\", \"" + account.getPhone() + "\", \"" + account.getAddress()
                + "\", \"" + account.getEmail()) + "\")";
        try {
            conn.;
            conn.(sql);
            flag = true;
        } catch (Exception e) {
            System.out.println("addAccount錯誤:" + e);
        } finally {
            conn.close();
        }

        return flag;
    }

    /**
     * 目的:檢查帳號存在與密碼
     *
     * @param ad true:檢查帳號與密碼 , false: 檢查帳號是否存在
     * @return true 有此帳號或帳號密碼正確 false 無此帳號或帳號密碼錯誤
     */
    public boolean checkAccount(boolean ad) {   //ad判斷是否需要檢查密碼

        boolean flag = false;
        String sql = new String("SELECT * FROM account WHERE account=\"" + account.getAccount() + "\"");
        try {
            conn.getConnection();
            conn.executeQuery(sql);
            rs = conn.getRs();
            if (rs.next()) {        //檢查帳號是否存在
                if (ad && rs.getString("passWord").equals(account.getPassWord())) {   //檢查密碼
                    flag = true;
                } else {
                    return flag;  //密碼錯誤直接回傳flag
                }
                flag = true;   //帳號存在flag設定為true
            }
        } catch (SQLException e) {
            System.out.println("checkAccountExist錯誤:" + e);
        } finally {
            conn.close();
        }
        return flag;
    }

    /**
     * 目的:更新帳號資料
     *
     * @return true:更新成功 false:更新失敗
     */
    public boolean editAccount() {

        boolean flag = false;
        String sql = new String("UPDATE account"
                + " SET account = \"" + account.getAccount() + "\", passWord = \"" + account.getPassWord() + "\", name = \"" + account.getName()
                + "\", phone = \"" + account.getPhone() + "\"," + " address = \"" + account.getAddress() + "\",email = \"" + account.getEmail()
                + "\", invalid = " + account.getInvalid() + ", acLevel = " + account.getAcLevel() + " WHERE uid =" + account.getUid());
        System.out.println(sql);
        try {
            conn.getConnection();
            if (0 < conn.executeUpdate(sql)) {
                flag = true;
            }
        } catch (Exception e) {
            System.out.println("editAccount錯誤:" + e);
        } finally {
            conn.close();
        }

        return flag;
    }

    /**
     * 目的:顯示出帳號名稱(account.getAccount())含有目標內容的帳號列表 帳號列表存在可透過getAccountList()取得
     */
    public void showAccountList() {

        String sql = new String("SELECT * "
                + " FROM account"
                + " WHERE account LIKE CONCAT('%',\"" + account.getAccount() + "\", '%')");
        try {
            conn.getConnection();
            if (conn.executeQuery(sql) && conn.getRs().next()) {
                rs = conn.getRs();
                do {
                    Account tmp = new Account();
                    tmp.setUid(rs.getInt("uid"));
                    tmp.setAccount(rs.getString("account"));
                    tmp.setPassWord(rs.getString("passWord"));
                    tmp.setName(rs.getString("name"));
                    tmp.setPhone(rs.getString("phone"));
                    tmp.setAddress(rs.getString("address"));
                    tmp.setEmail(rs.getString("email"));
                    tmp.setInvalid(rs.getInt("invalid"));
                    tmp.setAcLevel(rs.getInt("acLevel"));
                    tmp.setRegisterTime(rs.getDate("registerTime"));
                    accountList.add(tmp);
                } while (conn.getRs().next());
            }
        } catch (Exception e) {
            System.out.println("showAccountList錯誤:" + e);
        } finally {
            conn.close();
        }

    }

    /**
     * 目的:顯示帳號詳細資料
     */
    public void showAccountInfo() {
        try {
            String sql = new String("SELECT * FROM account WHERE account=\"" + account.getAccount() + "\"");
            conn.getConnection();
            conn.executeQuery(sql);
            rs = conn.getRs();
            if (rs.next()) {
                account.setUid(rs.getInt("uid"));
                account.setPassWord(rs.getString("passWord"));
                account.setName(rs.getString("name"));
                account.setPhone(rs.getString("phone"));
                account.setAddress(rs.getString("address"));
                account.setEmail(rs.getString("email"));
            }
        } catch (Exception e) {
            System.out.println("showAccountInfo錯誤:" + e);
        } finally {

        }
    }

}
