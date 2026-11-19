package es.daw.ra3;
 
import java.math.BigDecimal;
import java.math.RoundingMode;
 
public class PrecioService {
 
    // Calcula el precio final aplicando un descuento porcentual.
    public BigDecimal precioFinal(BigDecimal precio, BigDecimal descuento) {
        if (precio == null || descuento == null) {
            throw new IllegalArgumentException("Los datos no pueden ser null");
        }
        if (precio.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        if (descuento.compareTo(BigDecimal.ZERO) < 0
                || descuento.compareTo(new BigDecimal("100")) > 0) {
            throw new IllegalArgumentException("Descuento fuera de rango");
        }
 
        BigDecimal factor = BigDecimal.ONE.subtract(
                descuento.divide(new BigDecimal("100"), 4, RoundingMode.HALF_UP));
        return precio.multiply(factor).setScale(2, RoundingMode.HALF_UP);
    }
}

