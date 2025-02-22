package com.github.bredecorne.masp.model.taxes;

import java.math.BigDecimal;

public class UniformTax extends Tax {
    
    // Atrybuty wymagane
    private final BigDecimal value;

    public UniformTax(BigDecimal value) {
        super();
        this.value = value;
    }

    /**
     * Oblicza wartość podatku zgodnie ze skalą liniową.
     *
     * @param untaxedIncome Kwota, od której zostanie obliczona wartość podatku.
     * @return Wartość podatku.
     */
    @Override
    public BigDecimal calculateTax(BigDecimal untaxedIncome) {
        return untaxedIncome.multiply(this.value);
    }
}
