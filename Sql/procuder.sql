use school2;

INSERT INTO teacher (id, name) VALUES
(1, 'أحمد الغامدي'),
(2, 'ليلى الزهراني'),
(3, 'سعد المالكي');
INSERT INTO studnt (id, name) VALUES
(101, 'محمد خالد'),
(102, 'نورة السبيعي'),
(103, 'خالد العتيبي');
INSERT INTO coruse (id, name, teachd) VALUES
(201, 'رياضيات', 1),
(202, 'فيزياء', 2),
(203, 'أحياء', 3);
INSERT INTO enrol (idstd, idcor) VALUES
(101, 201),
(101, 202),
(102, 201),
(103, 203),
(102, 203);
call studnt_info();
call teach_info();