DROP TABLE IF EXISTS ODONTOLOGO;
CREATE TABLE ODONTOLOGO(
ID INT AUTO_INCREMENT PRIMARY KEY,
NOMBRE VARCHAR(50) NOT NULL,
APELLIDO VARCHAR(50) NOT NULL,
NUMMATRICULA INT NOT NULL);

INSERT INTO ODONTOLOGO VALUES (DEFAULT, 'FULANITO', 'HOLA', 123456);
