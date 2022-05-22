/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 * Contiene los métodos de una cuenta
 * @author Solid (Juan Carlos Yanes)
 * @version 1.0
 * @since 22/05/2022
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }

    /**
     * Contiene información de la cuenta
     * @param nom Nombre titular cuenta
     * @param cue Cuenta bancaria
     * @param sal Saldo de la cuenta 
     * @param tipo Tipo interes de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * 
     * @return Retorna el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * 
     * @param cantidad Cantidad a ingresar
     * @throws Exception Exepción al introducir cantidad incorrecta
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * 
     * @param cantidad Cantidad a retirar
     * @throws Exception Exepción al introducir cantidad incorrecta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Devuelve el nombre de la cuenta
     * @return el nombre de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la cuenta
     * @param nombre contiene el nombre de la cuenta 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la cuenta
     * @return la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Modifica la cuenta
     * @param cuenta contiene la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta
     * @return el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Modifica el saldo de la cuenta
     * @param saldo contiene el saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipoInteres de la cuenta
     * @return el tipoInteres de la cuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Modifica el tipoInteres de la cuenta
     * @param tipoInteres contiene el tipoInteres de la cuenta
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
