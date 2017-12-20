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
public class main {
    public static void Main(String[] args){
        Gerente patrao = new Gerente();
        patrao.getHorarioTrabalho("7h");
        patrao.getCpf("123456");
        patrao.getNome("Josiene");
        patrao.getInicioEmpresa("12/10/2005");
        String infoGerente = patrao.obterInformaçoesFuncionarios();
        System.out.println(infoGerente);
        
        OperadorMaquina operario = new OperadorMaquina();
        operario.getHorarioTrabalho("12h");
        operario.getCpf("154756");
        operario.getNome("chagas");
        operario.getInicioEmpresa("18/07/2009");
        String infoOperario =operario.obterInformaçoesFuncionarios();
        System.out.println(infoOperario);
        
        EngenheiroEletrico eletricista = new EngenheiroEletrico();
        eletricista.getHorarioTrabalho("5h");
        eletricista.getCpf("14325");
        eletricista.getNome("Luan");
        eletricista.getInicioEmpresa("01/02/2011");
        String infoEletrico =eletricista.obterInformaçoesFuncionarios();
        System.out.println(infoEletrico);
        
        
        EngenheiroMecanico mecanico = new EngenheiroMecanico();
        mecanico.getHorarioTrabalho("4h");
        mecanico.getCpf("10967");
        mecanico.getNome("Ermeson");
        mecanico.getInicioEmpresa("12/09/2013");
        String infoMecanico =mecanico.obterInformaçoesFuncionarios();
        System.out.println(infoMecanico);
        
    }
}
