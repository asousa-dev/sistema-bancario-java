package entities;

public class ContaBanco {
    protected String tipo;
    private String dono;
    private boolean status;
    private double saldo;

    public ContaBanco(){
        this.status = false;
        this.saldo = 0;
    }

    public void abrirConta() {
        status = true;

        if (tipo.equals("cc")){
            saldo = 50;
        } else if(tipo.equals("cp")){
            saldo = 150;
        }
    }

    public void fecharConta() {
        if (saldo == 0 && status) {
            status = false;
            System.out.println("Conta fechada com sucesso.");
        } else {
            System.out.println("Retire seu saldo ou pague suas pendências antes de fechar sua conta.");
        }
    }

    public void depositar(double addSaldo) {
        if (status) {
            saldo = saldo + addSaldo;
        }
    }

    public void sacar(double remSaldo){
        if (status && saldo > 0 && remSaldo <= saldo){
            saldo = saldo - remSaldo;
        } else {
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal(){
        if (!status) {
            System.out.println("Conta fechada. Impossível cobrar mensalidade.");
            return;
        }

        if (tipo.equals("cc")){
            saldo -= 12;
        } else {
            saldo -= 20;
        }
    }

    //Getters e Setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean isStatus() {
        return status;
    }


    public double getSaldo() {
        return saldo;
    }

    }

