package Banco;

public class CuentaBancaria {
  private final String numeroCuenta;
  private String titular;
  private double saldo;
public CuentaBancaria(String Titular, String NumeroCuenta, double SaldoInicial){
    this.numeroCuenta = NumeroCuenta;
    this.titular = Titular;
    if(SaldoInicial >=0){
        this.saldo  = SaldoInicial;

    }else{
        this.saldo = 0;
    }

}  

}
