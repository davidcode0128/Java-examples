CREATE TABLE account (
    uid INT NOT NULL AUTO_INCREMENT,
    account VARCHAR(20),
    passWord VARCHAR(35),
    uname VARCHAR(35),
    phone VARCHAR(20),
    address VARCHAR(200),
    email VARCHAR(50),
    acLevel TINYINT DEFAULT 0,            /*帳號等級，0:一般會員,1:管理者*/
    invalid TINYINT DEFAULT 0 ,           /*帳號狀態，0:有效, 1:失效*/
    registerTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,  /*註冊時間*/
    PRIMARY KEY(uid)
);

INSERT INTO account (account, passWord, uname, phone, address, email, acLevel)         /*建立管理者帳號*/
VALUES ("admin", "admin", "admin", 0900000000, "地球", "admin@test.com", 1);