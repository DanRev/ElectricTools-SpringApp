INSERT INTO clientes ( apellido,cedula,nombre,telefono) VALUES ('Beltran Gomez','1097404726','Daniel','(313) 536-7073');

INSERT INTO usuarios  (username, password, enabled) VALUES ('daniel','$2a$10$KXx1hI.Yf6bnOU1QMqsfN.Zrq9ABeAKaDhihCfU1I3W5BTCeY./y6',1);
INSERT INTO usuarios (username, password, enabled) VALUES ('admin','$2a$10$KDsTQbOv9nwjPTvxRVD3g.diFyc9iktEtc92LLjuJQZmFW2L7PrYC',1);

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id,role_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id,role_id) VALUES (2,1);
INSERT INTO usuarios_roles (usuario_id,role_id) VALUES (2,2);