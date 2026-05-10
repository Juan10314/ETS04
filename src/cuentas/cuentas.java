/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentas;

/**
 *
 * @author Juan Luis González Pimienta
 */
public class cuentas {
/**
 * Esta clase describe el funcionamiento de una cuenta corriente
 * @author Juan Luis González Pimienta
 * version 1.0
 */
    public class CCuenta {
        private String nombre;
        private String cuenta;
        private double saldo;
        private double tipoInterés;
        /**
         * Método constructor de la clase 
       */
        public CCuenta()
        {
        }
        /**
         * Metodo constructor de la clase
         * @param nom Nombre del usuario de la cuenta
         * @param cue Número de cuenta del usuario
         * @param sal Saldo de la cuenta
         * @param tipo Tipo de interés de la cuenta
         */
        public CCuenta(String nom, String cue, double sal, double tipo)
        {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo; 
        }
        /**
         * Método que devuelve el saldo de la cuenta
         * @return Devuelve el saldo de la cuenta
         */
        public double estado()
        {
        return     getSaldo();
        }
        /**
         * Método para hacer retiros de la cuenta
         * @param cantidad Cantidad a retirar del saldo de la cuenta
         */
        public void retirar(double cantidad)
        {
           try {
              System.out.println("Retiro en cuenta:" + cantidad);
              if (cantidad <= 0)
                 throw new Exception ("No se puede retirar una cantidad negativa");
              if (estado()< cantidad)
                 throw new Exception ("No se hay suficiente saldo");
              setSaldo(getSaldo() - cantidad);
           } catch (Exception e) {
                 System.out.println(e);
              }
        }
        /**
         * Método para hacer ingresos en la cuenta
         * @param cantidad Cantidad a ingresar en la cuenta
         */
        public void ingresar(double cantidad)
        {
           try {
               System.out.println("Ingreso en cuenta:" + cantidad);

               if (cantidad<0)
               throw new Exception("No se puede ingresar una cantidad negativa");
                              setSaldo(getSaldo() + cantidad);
           } catch (Exception e) {
               System.out.println(e);
               }
        }

        /**
         * Método que devuelve el nombre de la cuenta
         * @return Devuelve el nombre 
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Método para modificar el nombre de la cuenta
         * @param nombre El nombre a modificar 
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        /**
         * Método para mostrar el número de cuenta
         * @return Devuelve el número de cuenta
         */
        public String getCuenta() {
            return cuenta;
        }

        /**
         * Método para establecer el número de cuenta
         * @param cuenta Número de cuenta que se asigna
         */
        public void setCuenta(String cuenta) {
            this.cuenta = cuenta;
        }

        /**
         * Método para mostrar el saldo de la cuenta
         * @return Devuelve el saldo
         */
        public double getSaldo() {
            return saldo;
        }

        /**
         * Método para modificar el saldo de la cuenta
         * @param saldo Nuevo saldo de la cuenta
         */
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        /**
         * Método que devuelve el tipo de interés
         * @return tipoInterés Devuele el tipo de interés 
         */
        public double getTipoInterés() {
            return tipoInterés;
        }

        /**
         *  Método para establecer el tipo de interés de la cuenta
         * @param tipoInterés Nuevo tipo de interés que se asigna
         */
        public void setTipoInterés(double tipoInterés) {
            this.tipoInterés = tipoInterés;
        }
    }
    /**
     * Método principal que ejecuta las operaciones de una cuenta bancaria.
     * Crea cuenta, muestra saldo inicial, realiza operaciones y vuelve a mostrar saldo.
     * @param args Argumentos de línea de comandos
     */
    public void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );
        operaciones(cuenta1);

        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }
    /**
 * Método que hace operaciones sobre la cuenta
 * Ejecuta un retiro y un ingreso para modificar el saldo.
 * @param cuenta1 Cuenta en la que se realizan las operaciones
 */
   private void operaciones(CCuenta cuenta1) {
       // Operaciones de ingreso y retiro
       cuenta1.retirar(2300);
       cuenta1.ingresar(685);
   }
}
