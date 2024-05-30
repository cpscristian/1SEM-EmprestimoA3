CREATE TABLE IF NOT EXISTS `emprestimoa3`.`ferramenta` (
  `idFerramenta` INT NOT NULL AUTO_INCREMENT,
  `nomeFerramenta` VARCHAR(45) NULL,
  `marca` VARCHAR(45) NULL,
  `preco` DOUBLE NULL,
  PRIMARY KEY (`idFerramenta`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `emprestimoa3`.`amigo` (
  `idAmigo` INT NOT NULL AUTO_INCREMENT,
  `nomeAmigo` VARCHAR(45) NULL,
  `telefone` VARCHAR(50) NULL,
  PRIMARY KEY (`idAmigo`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `emprestimoa3`.`emprestimo` (
  `ferramenta_idFerramenta` INT NOT NULL,
  `amigo_idAmigo` INT NOT NULL,
  `dataInicio` DATE NULL,
  `dataDevolucao` DATE NULL,
  PRIMARY KEY (`ferramenta_idFerramenta`, `amigo_idAmigo`),
  INDEX `fk_ferramenta_has_amigo_amigo1_idx` (`amigo_idAmigo` ASC) VISIBLE,
  INDEX `fk_ferramenta_has_amigo_ferramenta_idx` (`ferramenta_idFerramenta` ASC) VISIBLE,
  CONSTRAINT `fk_ferramenta_has_amigo_ferramenta`
    FOREIGN KEY (`ferramenta_idFerramenta`)
    REFERENCES `emprestimoa3`.`ferramenta` (`idFerramenta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ferramenta_has_amigo_amigo1`
    FOREIGN KEY (`amigo_idAmigo`)
    REFERENCES `emprestimoa3`.`amigo` (`idAmigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
