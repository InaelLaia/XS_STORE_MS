USE BACKEND_PROJETO;

INSERT INTO XS_FORNECEDOR (NOME_FORNECEDOR) VALUES
('TechGizmo'),
('NovaWave'),
('SmartTech');

INSERT INTO XS_PRODUTO (NOME_PRODUTO, PONTO_REP_PRODUTO) VALUES
('iPhone 13',20),
('Galaxy S21',20),
('Pixel 6',15),
('Xperia 1',15),
('Mi 11',10);

INSERT INTO XS_DEPOSITO (NOME_DEPOSITO) VALUES
('CellVault Depot'),
('Mobile Warehouse'),
('TechHub Storage');

INSERT INTO XS_FORNECEDOR_PRODUTO (ID_FORNECEDOR, ID_PRODUTO) VALUES
(1, 1),
(1, 2),
(1, 3),
(2, 1),
(2, 2),
(2, 4),
(3, 2),
(3, 3),
(3, 5);

INSERT INTO XS_DEPOSITO_PRODUTO (ID_DEPOSITO, ID_PRODUTO, PONTO_REP_DEPOSITO) VALUES
(1, 1, 10),
(1, 2, 10),
(1, 3, 7),
(1, 4, 7),
(2, 1, 15),
(2, 2, 15),
(2, 3, 10),
(2, 5, 5),
(3, 1, 7),
(3, 2, 7),
(3, 4, 3),
(3, 5, 3);

INSERT INTO XS_MOVIMENTACAO (ID_DEPOSITO, ID_PRODUTO, PRECO_PRODUTO, QTD_MOVIMENTACAO, TIPO_MOVIMENTACAO) VALUES
(1, 1, 1350, 20, 1),
(1, 2, 1100, 20, 2),
(1, 3, 1400, 14, 2),
(1, 4, 1275, 14, 1),
(2, 1, 1400, 20, 1),
(2, 2, 1150, 20, 1),
(2, 3, 1450, 14, 2),
(2, 5, 1000, 14, 2),
(3, 1, 1300, 14, 2),
(3, 2, 1050, 14, 1),
(3, 4, 1250, 6, 1),
(3, 5, 900, 6, 2),
(1, 1, 1400, 2, 3),
(1, 3, 1500, 1, 4),
(2, 2, 1200, 5, 4),
(2, 5, 1100, 2, 3),
(3, 1, 1400, 8, 3),
(3, 2, 1100, 10, 3),
(1, 1, 1350, 5, 6),
(3, 1, 1350, 5, 5);

