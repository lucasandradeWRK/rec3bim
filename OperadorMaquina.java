/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec3bim;

/**
 *
 * @author ifpb
 */
public class OperadorMaquina implements NewInterface{
    private String nome;
    private String horarioTrabalho;
    private String cpf;
    private String inicioEmpresa;
    
    public void getNome(String nome){
        this.nome = nome;
    }
    public String setNome(){
        return this.nome;
    }
    public void getHorarioTrabalho(String HorarioTrabalho){
        this.horarioTrabalho = HorarioTrabalho;
    }
    public String setHorarioTrabalho(){
        return this.horarioTrabalho;
    }
    
    public void getCpf(String cpf){
        this.cpf = cpf;
    }
    public String setCpf(){
        return this.cpf;
    }
    
    public void getInicioEmpresa(String InicioEmpresa){
        this.inicioEmpresa = InicioEmpresa;
    }
    public String setInicioEmpresa(){
        return this.inicioEmpresa;
    }
    @Override
    public String obterInformaçoesFuncionarios(){
        return "Nome= "+this.nome+"Cpf= "+this.cpf+"Cargo= Operador De Maquina";
    }
    @Override
    public boolean temSalubridade(){
        return true;
    }
}
