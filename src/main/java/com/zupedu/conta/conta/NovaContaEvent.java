package com.zupedu.conta.conta;

import java.math.BigDecimal;

public class NovaContaEvent {

    private Long id;

    private int agencia;

    private long numero;

    private BigDecimal saldo;

    public NovaContaEvent(Long id, int agencia, long numero, BigDecimal saldo) {
        this.id = id;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public int getAgencia() {
        return agencia;
    }

    public long getNumero() {
        return numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "NovaContaEvent{" +
                "id=" + id +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
