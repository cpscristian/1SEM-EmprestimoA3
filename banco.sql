CREATE TABLE IF NOT EXISTS `emprestimoa3`.`ferramenta` (
  `idFerramenta` INT NOT NULL AUTO_INCREMENT,
  `nomeFerramenta` VARCHAR(45) NULL DEFAULT NULL,
  `marca` VARCHAR(45) NULL DEFAULT NULL,
  `preco` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`idFerramenta`))
ENGINE = InnoDB
AUTO_INCREMENT = 14
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci

CREATE TABLE IF NOT EXISTS `emprestimoa3`.`amigo` (
  `idAmigo` INT NOT NULL AUTO_INCREMENT,
  `nomeAmigo` VARCHAR(45) NULL DEFAULT NULL,
  `telefone` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`idAmigo`))
ENGINE = InnoDB
AUTO_INCREMENT = 15
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci

CREATE TABLE IF NOT EXISTS `emprestimoa3`.`emprestimo` (
  `idEmprestimo` INT NOT NULL AUTO_INCREMENT,
  `idAmigoEmprestimo` INT NOT NULL,
  `idFerramentaEmprestimo` INT NOT NULL,
  `dataInicio` DATE NULL DEFAULT NULL,
  `dataDevolucao` DATE NULL DEFAULT NULL,
  `status` TINYINT(1) NULL DEFAULT NULL,
  PRIMARY KEY (`idEmprestimo`),
  INDEX `fk_ferramenta_has_amigo_amigo1_idx` (`idAmigoEmprestimo` ASC) VISIBLE,
  INDEX `fk_ferramenta_has_amigo_ferramenta_idx` (`idFerramentaEmprestimo` ASC) VISIBLE,
  CONSTRAINT `fk_ferramenta_has_amigo_amigo1`
    FOREIGN KEY (`idAmigoEmprestimo`)
    REFERENCES `emprestimoa3`.`amigo` (`idAmigo`),
  CONSTRAINT `fk_ferramenta_has_amigo_ferramenta`
    FOREIGN KEY (`idFerramentaEmprestimo`)
    REFERENCES `emprestimoa3`.`ferramenta` (`idFerramenta`))
ENGINE = InnoDB
AUTO_INCREMENT = 18
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci
