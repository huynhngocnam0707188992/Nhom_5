-- 1 tạo 1 QLBH và sử dụng QLBH


create database QLBH;

use QLBH;


-- 2 taọ bảng cộng khóa chính và khóa phụ


-- Tạo bảng NHACC
CREATE TABLE NHACC (
  MANCC VARCHAR(10) PRIMARY KEY,
  TENNCC VARCHAR(50),
  DIACHI VARCHAR(100),
  DT VARCHAR(20)
);

-- Tạo bảng HANGHOA
CREATE TABLE HANGHOA (
  MAHH VARCHAR(14) PRIMARY KEY,
  TENHH VARCHAR(50),
  DVT VARCHAR(10),
  QUYCACH VARCHAR(100),
  SLTON INT
);

-- Tạo bảng CUNGUNG
CREATE TABLE CUNGUNG (
  MANCC VARCHAR(10),
  MAHH VARCHAR(14),
  PRIMARY KEY (MANCC, MAHH),
  FOREIGN KEY (MANCC) REFERENCES NHACC(MANCC),
  FOREIGN KEY (MAHH) REFERENCES HANGHOA(MAHH)
);

-- Tạo bảng DDH
CREATE TABLE DDH (
  SODDH VARCHAR(10) PRIMARY KEY,
  NGAYDH DATE,
  MANCC VARCHAR(10),
  FOREIGN KEY (MANCC) REFERENCES NHACC(MANCC)
);

-- Tạo bảng CTDDH
CREATE TABLE CTDDH (
  SODDH VARCHAR(10),
  MAHH VARCHAR(14),
  SOLUONG INT,
  PRIMARY KEY (SODDH, MAHH),
  FOREIGN KEY (SODDH) REFERENCES DDH(SODDH),
  FOREIGN KEY (MAHH) REFERENCES HANGHOA(MAHH)
);

-- Tạo bảng GIAOHANG
CREATE TABLE GIAOHANG (
  SOGH VARCHAR(10) PRIMARY KEY,
  NGAYGH DATE,
  SODDH VARCHAR(10),
  FOREIGN KEY (SODDH) REFERENCES DDH(SODDH)
);

-- Tạo bảng CTGH
CREATE TABLE CTGH (
  SOGH VARCHAR(10),
  MAHH VARCHAR(14),
  SOLUONG INT,
  DONGIA FLOAT,
  PRIMARY KEY (SOGH, MAHH),
  FOREIGN KEY (SOGH) REFERENCES GIAOHANG(SOGH),
  FOREIGN KEY (MAHH) REFERENCES HANGHOA(MAHH)
);

-- Tạo bảng HOADON
CREATE TABLE HOADON (
  SOHD VARCHAR(10) PRIMARY KEY,
  NGAYHD DATE,
  TENKH VARCHAR(50)
);

-- Tạo bảng CTHD
CREATE TABLE CTHD (
  SOHD VARCHAR(10),
  MAHH VARCHAR(14),
  SOLUONG INT,
  DONGIA FLOAT,
  PRIMARY KEY (SOHD, MAHH),
  FOREIGN KEY (SOHD) REFERENCES HOADON(SOHD),
  FOREIGN KEY (MAHH) REFERENCES HANGHOA(MAHH)
);


-- 3 nhập data
-- Bảng NHACC:

INSERT INTO NHACC (MANCC, TENNCC, DIACHI, DT)
VALUES
('Sony', 'Sony Corp.', 'Tokyo, Nhật Bản', '+81-XXX-XXXX'),
('Panasonic', 'Panasonic Corp.', 'Osaka, Nhật Bản', '+81-XXX-XXXX'),
('Toshiba', 'Toshiba Corp.', 'Tokyo, Nhật Bản', '+81-XXX-XXXX'),
('Toyota', 'Toyota Corp.', 'Saitama, Nhật Bản', '+81-XXX-XXXX'),
('Suzuki', 'Suzuki Corp.', 'Hokkaido, Nhật Bản', '+81-XXX-XXXX');

-- Bảng HANGHOA:

INSERT INTO HANGHOA (MAHH, TENHH, DVT, QUYCACH, SLTON)
VALUES
('TV55', 'TV 55 inch', 'cái', '55 inch, màn hình LCD', 30),
('TV65', 'TV 65 inch', 'cái', '65 inch, màn hình LCD', 15),
('Fridge', 'Tủ lạnh', 'cái', 'Tủ lạnh 2 cánh', 19),
('WashingMachine', 'Máy giặt', 'cái', 'Máy giặt 7kg', 18),
('TVsp', 'TV super', 'cái', ' 60 inch, màn hình LCD full HD', 1),
('TVsp1', 'TV super1', 'cái', ' 70 inch, màn hình LCD full HD', 0),
('TVsp2', 'TV super2', 'cái', ' 70 inch, màn hình LCD full HD', 5),
('TVsp3', 'TV super3', 'cái', ' 70 inch, màn hình LCD full HD', 7),
('Mercedes','Car Mercedes','cái','Động cơ I4, dòng C200',10);


-- Bảng CUNGUNG:

INSERT INTO CUNGUNG (MANCC, MAHH)
VALUES
('Sony', 'TV55'),
('Sony', 'TV65'),
('Sony', 'TVsp'),
('Sony', 'TVsp2'),
('Sony', 'TVsp3'),
('Panasonic', 'Fridge'),
('Panasonic', 'TVsp2'),
('Toshiba', 'WashingMachine'),
('Toshiba', 'TVsp3'),
('Toyota', 'Mercedes');

-- Bảng DDH:

INSERT INTO DDH (SODDH, NGAYDH, MANCC)
VALUES
('DDH1', '2022-01-05', 'Sony'),
('DDH6', '2023-04-20', 'Sony'),
('DDH2', '2022-02-10', 'Panasonic'),
('DDH3', '2023-03-15', 'Toshiba'),
('DDH4', '2023-12-20', 'Panasonic'),
('DDH5', '2023-12-21', 'Toshiba'),
('DDH7', '2023-01-01', 'Toyota'),
('DDH8', '2022-01-11', 'Panasonic');



-- Bảng CTDDH:

INSERT INTO CTDDH (SODDH, MAHH, SOLUONG)
VALUES

('DDH1', 'TV55', 5),
('DDH1', 'TV65', 5),
('DDH2', 'Fridge', 15),
('DDH3', 'WashingMachine', 15),
('DDH4', 'TVsp2', 2),
('DDH5', 'TVsp3', 3),
('DDH6', 'TVsp1', 7),
('DDH8', 'Fridge', 1);



-- Bảng GIAOHANG:

INSERT INTO GIAOHANG (SOGH, NGAYGH, SODDH)
VALUES
('GH1', '2022-01-10', 'DDH1'),
('GH2', '2022-02-15', 'DDH2'),
('GH3', '2023-03-25', 'DDH3'),
('GH4', '2023-01-01', 'DDH4'),
('GH5', '2023-01-02', 'DDH5'),
('GH6', '2023-05-02', 'DDH6'),
('GH7', '2023-01-20', 'DDH7'),
('GH8', '2023-01-30', 'DDH8');



-- Bảng CTGH:

INSERT INTO CTGH (SOGH, MAHH, SOLUONG, DONGIA)
VALUES

('GH1', 'TV55', 5, 1500),
('GH1', 'TV65', 5, 1500),
('GH2', 'Fridge', 15, 800),
('GH3', 'WashingMachine', 8, 1200),
('GH4', 'TVsp2', 2, 1200),
('GH5', 'TVsp3', 3, 1200),
('GH7', 'Mercedes', 1, 10000),
('GH8', 'Fridge', 1, 800);


-- Bảng HOADON:

INSERT INTO HOADON (SOHD, NGAYHD, TENKH)
VALUES
('HD1', '2022-01-07', 'Khách A'),
('HD2', '2022-02-12', 'Khách B'),
('HD3', '2023-03-20', 'Khách C'),
('HD4', '2023-01-01', 'Khách D'),
('HD5', '2023-01-02', 'Khách E'),
('HD6', '2023-04-26', 'Khách F'),
('HD7', '2023-01-10', 'Khách G'),
('HD8', '2023-01-20', 'Khách H');



-- Bảng CTHD:

INSERT INTO CTHD (SOHD, MAHH, SOLUONG, DONGIA)
VALUES

('HD1', 'TV55', 5, 1800),
('HD1', 'TV65', 5, 1800),
('HD2', 'Fridge', 15, 900),
('HD3', 'WashingMachine', 8, 1300),
('HD4', 'TVsp2', 2, 1300),
('HD5', 'TVsp3', 3, 1300),
('HD6', 'TVsp1', 7, 1300),
('HD7', 'Mercedes', 1, 11000),
('HD8', 'Fridge', 1, 900);




--  câu truy vấn
-- a)	Tìm các mặt hàng của nhà cung cấp “Sony” và có số lượng tồn >20.
SELECT MAHH, TENHH
FROM HANGHOA
WHERE MAHH IN (
    SELECT MAHH
    FROM CUNGUNG
    WHERE MANCC = 'Sony'
)
AND SLTON > 20;

-- b)	Cho biết những mặt hàng nào chưa từng được bán.
SELECT MAHH, TENHH
FROM HANGHOA
WHERE MAHH NOT IN (
    SELECT MAHH
    FROM CTHD
);

-- c) Cho biết những mặt hàng nào của nhà cung cấp "Sony" không bán được trong năm 2022:
SELECT HANGHOA.TENHH
FROM HANGHOA
LEFT JOIN CUNGUNG ON HANGHOA.MAHH = CUNGUNG.MAHH
LEFT JOIN NHACC ON CUNGUNG.MANCC = NHACC.MANCC
LEFT JOIN DDH ON NHACC.MANCC = DDH.MANCC
LEFT JOIN GIAOHANG ON DDH.SODDH = GIAOHANG.SODDH
WHERE NHACC.TENNCC = 'Sony'
AND YEAR(GIAOHANG.NGAYGH) != 2022
OR GIAOHANG.NGAYGH IS NULL;

-- d)	Cho biết các mặt hàng do “Panasonic” hoặc “Toshiba” cung cấp có số lượng đặt hàng từ 10 đến 20 sản phẩm. 
SELECT HANGHOA.MAHH,HANGHOA.TENHH
FROM (HANGHOA
INNER JOIN CUNGUNG using(mahh))
INNER JOIN NHACC using(mancc)
WHERE  HANGHOA.SLTON BETWEEN 10 AND 20 and NHACC.MANCC IN ('Panasonic', 'Toshiba');
SELECT HANGHOA.MAHH,HANGHOA.TENHH
FROM HANGHOA
JOIN CUNGUNG ON HANGHOA.MAHH = CUNGUNG.MAHH
JOIN DDH ON CUNGUNG.MANCC = DDH.MANCC
JOIN CTDDH ON DDH.SODDH = CTDDH.SODDH AND HANGHOA.MAHH = CTDDH.MAHH
WHERE (DDH.MANCC = 'Panasonic' OR DDH.MANCC = 'Toshiba') AND CTDDH.SOLUONG BETWEEN 10 AND 20;

-- e)	Cho biết các số hóa đơn, trị giá hóa đơn bán ra trong ngày 1/1/2023 và ngày 2/1/2023. 
SELECT HOADON.SOHD, HOADON.NGAYHD, SUM(CTHD.SOLUONG * CTHD.DONGIA) AS TONGGIATRI
FROM HOADON
JOIN CTHD ON HOADON.SOHD = CTHD.SOHD
WHERE HOADON.NGAYHD BETWEEN '2023-01-01' AND '2023-01-02'
GROUP BY HOADON.SOHD, HOADON.NGAYHD;

-- f)	Cho biết các số hóa đơn, trị giá hóa đơn trong tháng quý 1 năm 2023, sắp xếp theo ngày (tăng dần) và trị giá (giảm dần).
SELECT HOADON.SOHD, HOADON.NGAYHD, SUM(CTHD.SOLUONG * CTHD.DONGIA) AS TONGGIATRI
FROM HOADON
JOIN CTHD ON HOADON.SOHD = CTHD.SOHD
WHERE HOADON.NGAYHD BETWEEN '2023-01-01' AND '2023-03-31'
GROUP BY HOADON.SOHD, HOADON.NGAYHD
ORDER BY HOADON.NGAYHD ASC, TONGGIATRI DESC;

-- g)	Cho biết trong tháng 01 năm 2023 cửa hàng đã đặt hàng tại những nhà cung cấp nào.
SELECT DISTINCT NHACC.MANCC, NHACC.TENNCC
FROM DDH
JOIN NHACC ON DDH.MANCC = NHACC.MANCC
WHERE DDH.NGAYDH BETWEEN '2023-01-01' AND '2023-01-31';

-- h)	Cho biết mặt hàng có mã là “TV55” được cửa hàng đặt ở những đơn đặt hàng nào.
SELECT DDH.SODDH, DDH.NGAYDH
FROM CTDDH
JOIN DDH ON CTDDH.SODDH = DDH.SODDH
WHERE CTDDH.MAHH = 'TV55';

-- i)	Tìm các số hóa đơn đặt cùng lúc 2 mặt hàng có mã số “TV55” và “TV65”, mỗi mặt hàng đặt với số lượng từ 5 đến 10. 
SELECT DDH.SODDH, DDH.NGAYDH
FROM CTDDH AS CT1
JOIN CTDDH AS CT2 ON CT1.SODDH = CT2.SODDH
JOIN DDH ON CT1.SODDH = DDH.SODDH
WHERE CT1.MAHH = 'TV55'
  AND CT2.MAHH = 'TV65'
  AND CT1.SOLUONG BETWEEN 5 AND 10
  AND CT2.SOLUONG BETWEEN 5 AND 10;
-- j)	Có bao nhiêu sản phẩm khác nhau được bán ra trong năm 2022. 
SELECT COUNT(DISTINCT MAHH) AS SoSanPhamKhacNhau
FROM CTHD
WHERE SOHD IN (
    SELECT SOHD
    FROM HOADON
    WHERE YEAR(NGAYHD) = 2022
);

-- k)	Tìm số hóa đơn trong năm 2022 đã mua ít nhất một mặt hàng của nhà cung cấp “Panasonic”. 
SELECT H.SOHD
FROM HOADON H
JOIN CTHD CT ON H.SOHD = CT.SOHD
JOIN HANGHOA HH ON CT.MAHH = HH.MAHH
JOIN CUNGUNG CG ON HH.MAHH = CG.MAHH
WHERE YEAR(H.NGAYHD) = 2022 AND CG.MANCC = 'Panasonic'
GROUP BY H.SOHD
HAVING COUNT(DISTINCT CT.MAHH) > 0;

-- l)	Tìm số hóa đơn và tên khách hàng đã mua hóa đơn có trị giá cao nhất trong năm 2022.
SELECT HOADON.SOHD, HOADON.TENKH, SUM(SOLUONG * DONGIA) AS MaxTotalValue
FROM HOADON
JOIN CTHD ON HOADON.SOHD = CTHD.SOHD
WHERE YEAR(NGAYHD) = 2022
GROUP BY HOADON.SOHD, HOADON.TENKH
ORDER BY MaxTotalValue DESC
LIMIT 1;

-- m)	Trị giá trung bình của tất cả các hóa đơn được bán ra trong năm 2022 là bao nhiêu. 
SELECT AVG(TONGGIATRI) AS TrungbinhGiaTri
FROM (
    SELECT SOHD, SUM(SOLUONG * DONGIA) AS TONGGIATRI
    FROM CTHD
    WHERE YEAR((SELECT NGAYHD FROM HOADON WHERE HOADON.SOHD = CTHD.SOHD)) = 2022
    GROUP BY SOHD
) AS InvoiceTotal;

-- n)	In ra danh sách các mặt hàng có giá bán bằng 1 trong 3 mức giá cao nhất. 
SELECT TENHH, DONGIA
FROM CTHD
JOIN HANGHOA ON CTHD.MAHH = HANGHOA.MAHH
ORDER BY DONGIA DESC
LIMIT 3;


-- o)	Cho biết tháng mấy trong năm 2022 có doanh thu bán hàng cao nhất.
SELECT EXTRACT(MONTH FROM NGAYGH) AS Thang, SUM(SOLUONG * DONGIA) AS DoanhThu
FROM CTGH
JOIN GIAOHANG ON CTGH.SOGH = GIAOHANG.SOGH
WHERE YEAR(NGAYGH) = 2022
GROUP BY Thang
ORDER BY DoanhThu DESC
LIMIT 1;
