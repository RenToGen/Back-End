CREATE TABLE `tb_user` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`nome` varchar(600) NOT NULL,
	`email` varchar(100) NOT NULL UNIQUE,
	`tipo_cadastro` INT(1) NOT NULL,
	`senha` varchar(10) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tb_categoria` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`descricao_tomador` varchar(500) NOT NULL,
	`descricao_prestador` varchar(500) NOT NULL,
	`valor` DECIMAL(5,2) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tb_produtos` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`id_categoria` INT(1000) NOT NULL,
	`id_user` INT NOT NULL AUTO_INCREMENT,
	`nome` varchar(600) NOT NULL,
	`descrição` varchar(1000) NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `tb_produtos` ADD CONSTRAINT `tb_produtos_fk0` FOREIGN KEY (`id_categoria`) REFERENCES `tb_categoria`(`id`);

ALTER TABLE `tb_produtos` ADD CONSTRAINT `tb_produtos_fk1` FOREIGN KEY (`id_user`) REFERENCES `tb_user`(`id`);
