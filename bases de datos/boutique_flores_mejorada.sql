-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`usuarios` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(10) NOT NULL,
  `correo` VARCHAR(50) NOT NULL,
  `contraseña` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`categorias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`categorias` (
  `id_categorias` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_categorias`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`productos` (
  `id_productos` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `precio` DECIMAL(10,0) NOT NULL,
  `descripcion` VARCHAR(50) NOT NULL,
  `informacion` VARCHAR(100) NOT NULL,
  `imagenes` VARCHAR(70) NOT NULL,
  `stock` INT(3) NOT NULL,
  `categorias_id_categorias` INT NOT NULL,
  PRIMARY KEY (`id_productos`, `categorias_id_categorias`),
  INDEX `fk_productos_categorias1_idx` (`categorias_id_categorias` ASC) VISIBLE,
  CONSTRAINT `fk_productos_categorias1`
    FOREIGN KEY (`categorias_id_categorias`)
    REFERENCES `mydb`.`categorias` (`id_categorias`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`carrito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`carrito` (
  `usuarios_id_usuario` INT NOT NULL,
  `productos_id_productos` INT NOT NULL,
  `total` DECIMAL(10) NOT NULL,
  `cantidad_producto` INT(3) NOT NULL,
  PRIMARY KEY (`usuarios_id_usuario`, `productos_id_productos`),
  INDEX `fk_usuarios_has_productos_productos1_idx` (`productos_id_productos` ASC) VISIBLE,
  INDEX `fk_usuarios_has_productos_usuarios_idx` (`usuarios_id_usuario` ASC) VISIBLE,
  CONSTRAINT `fk_usuarios_has_productos_usuarios`
    FOREIGN KEY (`usuarios_id_usuario`)
    REFERENCES `mydb`.`usuarios` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuarios_has_productos_productos1`
    FOREIGN KEY (`productos_id_productos`)
    REFERENCES `mydb`.`productos` (`id_productos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`reseñas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`reseñas` (
  `id_reseñas` INT NOT NULL AUTO_INCREMENT,
  `calificacion` DECIMAL(2) NOT NULL,
  `comentario` VARCHAR(100) NOT NULL,
  `usuarios_id_usuario` INT NOT NULL,
  `productos_id_productos` INT NOT NULL,
  `productos_categorias_id_categorias` INT NOT NULL,
  PRIMARY KEY (`id_reseñas`, `usuarios_id_usuario`),
  INDEX `fk_reseñas_usuarios1_idx` (`usuarios_id_usuario` ASC) VISIBLE,
  INDEX `fk_reseñas_productos1_idx` (`productos_id_productos` ASC, `productos_categorias_id_categorias` ASC) VISIBLE,
  CONSTRAINT `fk_reseñas_usuarios1`
    FOREIGN KEY (`usuarios_id_usuario`)
    REFERENCES `mydb`.`usuarios` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_reseñas_productos1`
    FOREIGN KEY (`productos_id_productos` , `productos_categorias_id_categorias`)
    REFERENCES `mydb`.`productos` (`id_productos` , `categorias_id_categorias`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;